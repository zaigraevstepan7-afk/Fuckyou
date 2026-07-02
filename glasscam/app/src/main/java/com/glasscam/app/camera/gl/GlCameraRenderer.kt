package com.glasscam.app.camera.gl

import android.graphics.SurfaceTexture
import android.opengl.GLES11Ext
import android.opengl.GLES20
import android.opengl.GLES30
import android.opengl.GLSurfaceView
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.nio.FloatBuffer
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * Renders the live camera (external OES texture) with an AI color grade + sharpen, then draws
 * refractive Liquid Glass panels sampling a blurred backdrop. Runs on the GLSurfaceView thread.
 */
class GlCameraRenderer(
    private val requestRender: () -> Unit,
    private val onTextureReady: (SurfaceTexture) -> Unit,
) : GLSurfaceView.Renderer {

    @Volatile var exposure = 0f
    @Volatile var contrast = 1f
    @Volatile var saturation = 1f
    @Volatile var warmth = 0f
    @Volatile var shadows = 0f
    @Volatile var sharpen = 0f
    @Volatile var grain = 0f

    // panels: up to 6, each [x,y,w,h] normalized (origin bottom-left), + radius fraction of width
    @Volatile private var panels: FloatArray = FloatArray(0)
    @Volatile private var radii: FloatArray = FloatArray(0)
    fun setPanels(rects: FloatArray, r: FloatArray) { panels = rects; radii = r }

    private var oesTex = 0
    private var surfaceTexture: SurfaceTexture? = null
    private val texMatrix = FloatArray(16)
    @Volatile private var frameAvailable = false

    private var camProg = 0
    private var blurProg = 0
    private var glassProg = 0
    @Volatile private var ready = false

    private var sceneFbo = 0; private var sceneTex = 0
    private var blurFbo = 0; private var blurTex = 0
    private var width = 1; private var height = 1
    private var startNs = 0L

    private val quad: FloatBuffer = ByteBuffer.allocateDirect(8 * 4).order(ByteOrder.nativeOrder())
        .asFloatBuffer().apply { put(floatArrayOf(-1f, -1f, 1f, -1f, -1f, 1f, 1f, 1f)); position(0) }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
        startNs = System.nanoTime()
        val ids = IntArray(1)
        GLES20.glGenTextures(1, ids, 0)
        oesTex = ids[0]
        GLES20.glBindTexture(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, oesTex)
        GLES20.glTexParameteri(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR)
        GLES20.glTexParameteri(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR)
        GLES20.glTexParameteri(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE)
        GLES20.glTexParameteri(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE)

        val st = SurfaceTexture(oesTex)
        st.setOnFrameAvailableListener { frameAvailable = true; requestRender() }
        surfaceTexture = st
        onTextureReady(st)

        try {
            camProg = Shaders.program(Shaders.QUAD_VERT, Shaders.CAMERA_FRAG)
            blurProg = Shaders.program(Shaders.QUAD_VERT, Shaders.BLUR_FRAG)
            glassProg = Shaders.program(Shaders.QUAD_VERT, Shaders.GLASS_FRAG)
            ready = true
        } catch (e: Exception) {
            ready = false
        }
    }

    override fun onSurfaceChanged(gl: GL10?, w: Int, h: Int) {
        width = w; height = h
        surfaceTexture?.setDefaultBufferSize(w, h)
        sceneTex = makeFbo(w, h).also { sceneFbo = lastFbo }
        val bw = (w / 3).coerceAtLeast(1); val bh = (h / 3).coerceAtLeast(1)
        blurTex = makeFbo(bw, bh).also { blurFbo = lastFbo }
    }

    private var lastFbo = 0
    private fun makeFbo(w: Int, h: Int): Int {
        val tex = IntArray(1); GLES20.glGenTextures(1, tex, 0)
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, tex[0])
        GLES20.glTexImage2D(GLES20.GL_TEXTURE_2D, 0, GLES20.GL_RGBA, w, h, 0, GLES20.GL_RGBA, GLES20.GL_UNSIGNED_BYTE, null)
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER, GLES20.GL_LINEAR)
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MAG_FILTER, GLES20.GL_LINEAR)
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S, GLES20.GL_CLAMP_TO_EDGE)
        GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T, GLES20.GL_CLAMP_TO_EDGE)
        val fbo = IntArray(1); GLES20.glGenFramebuffers(1, fbo, 0)
        GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, fbo[0])
        GLES20.glFramebufferTexture2D(GLES20.GL_FRAMEBUFFER, GLES20.GL_COLOR_ATTACHMENT0, GLES20.GL_TEXTURE_2D, tex[0], 0)
        GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, 0)
        lastFbo = fbo[0]
        return tex[0]
    }

    override fun onDrawFrame(gl: GL10?) {
        val st = surfaceTexture ?: return
        if (!ready) return
        try { drawFrameInternal(st) } catch (_: Exception) {}
    }

    private fun drawFrameInternal(st: SurfaceTexture) {
        if (frameAvailable) { st.updateTexImage(); st.getTransformMatrix(texMatrix); frameAvailable = false }

        // Pass 1: camera -> sceneTex (graded)
        GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, sceneFbo)
        GLES20.glViewport(0, 0, width, height)
        GLES20.glUseProgram(camProg)
        bindQuad(camProg)
        GLES20.glUniformMatrix4fv(loc(camProg, "uTexMatrix"), 1, false, texMatrix, 0)
        GLES20.glUniform1i(loc(camProg, "uUseTexMatrix"), 1)
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0)
        GLES20.glBindTexture(GLES11Ext.GL_TEXTURE_EXTERNAL_OES, oesTex)
        GLES20.glUniform1i(loc(camProg, "uCam"), 0)
        GLES20.glUniform2f(loc(camProg, "uTexel"), 1f / width, 1f / height)
        GLES20.glUniform1f(loc(camProg, "uExposure"), exposure)
        GLES20.glUniform1f(loc(camProg, "uContrast"), contrast)
        GLES20.glUniform1f(loc(camProg, "uSaturation"), saturation)
        GLES20.glUniform1f(loc(camProg, "uWarmth"), warmth)
        GLES20.glUniform1f(loc(camProg, "uShadows"), shadows)
        GLES20.glUniform1f(loc(camProg, "uSharpen"), sharpen)
        GLES20.glUniform1f(loc(camProg, "uGrain"), grain)
        GLES20.glUniform1f(loc(camProg, "uTime"), (System.nanoTime() - startNs) / 1e9f)
        GLES20.glDrawArrays(GLES20.GL_TRIANGLE_STRIP, 0, 4)

        // Pass 2: sceneTex -> blurTex (low res box blur)
        val bw = (width / 3).coerceAtLeast(1); val bh = (height / 3).coerceAtLeast(1)
        GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, blurFbo)
        GLES20.glViewport(0, 0, bw, bh)
        GLES20.glUseProgram(blurProg)
        bindQuad(blurProg)
        GLES20.glUniform1i(loc(blurProg, "uUseTexMatrix"), 0)
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0)
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, sceneTex)
        GLES20.glUniform1i(loc(blurProg, "uTex"), 0)
        GLES20.glUniform2f(loc(blurProg, "uTexel"), 1f / bw, 1f / bh)
        GLES20.glDrawArrays(GLES20.GL_TRIANGLE_STRIP, 0, 4)

        // Pass 3: glass composite -> screen
        GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, 0)
        GLES20.glViewport(0, 0, width, height)
        GLES20.glUseProgram(glassProg)
        bindQuad(glassProg)
        GLES20.glUniform1i(loc(glassProg, "uUseTexMatrix"), 0)
        GLES20.glActiveTexture(GLES20.GL_TEXTURE0)
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, sceneTex)
        GLES20.glUniform1i(loc(glassProg, "uScene"), 0)
        GLES20.glActiveTexture(GLES20.GL_TEXTURE1)
        GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, blurTex)
        GLES20.glUniform1i(loc(glassProg, "uBlur"), 1)
        GLES20.glUniform2f(loc(glassProg, "uRes"), width.toFloat(), height.toFloat())
        val p = panels; val r = radii
        val count = (p.size / 4).coerceAtMost(6)
        GLES20.glUniform1i(loc(glassProg, "uCount"), count)
        if (count > 0) {
            GLES20.glUniform4fv(loc(glassProg, "uPanels"), count, p, 0)
            GLES20.glUniform1fv(loc(glassProg, "uRadius"), count, r, 0)
        }
        GLES20.glDrawArrays(GLES20.GL_TRIANGLE_STRIP, 0, 4)
    }

    private fun bindQuad(prog: Int) {
        val a = GLES20.glGetAttribLocation(prog, "aPos")
        GLES20.glEnableVertexAttribArray(a)
        quad.position(0)
        GLES20.glVertexAttribPointer(a, 2, GLES20.GL_FLOAT, false, 0, quad)
    }

    private fun loc(prog: Int, name: String) = GLES20.glGetUniformLocation(prog, name)

    fun release() { surfaceTexture?.release(); surfaceTexture = null }
}
