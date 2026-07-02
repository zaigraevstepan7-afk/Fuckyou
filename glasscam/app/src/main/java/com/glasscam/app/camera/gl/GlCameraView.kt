package com.glasscam.app.camera.gl

import android.content.Context
import android.graphics.SurfaceTexture
import android.opengl.GLSurfaceView
import android.os.Handler
import android.os.Looper
import android.view.Surface
import androidx.camera.core.Preview
import androidx.camera.core.SurfaceRequest
import androidx.core.content.ContextCompat

/**
 * GLSurfaceView that renders the camera through the Liquid Glass pipeline and exposes a
 * CameraX [Preview.SurfaceProvider]. Falls back gracefully: if GL init throws, the host swaps
 * to a plain PreviewView.
 */
class GlCameraView(context: Context) : GLSurfaceView(context) {

    val renderer: GlCameraRenderer
    private val main = Handler(Looper.getMainLooper())

    @Volatile private var surfaceTexture: SurfaceTexture? = null
    private var pending: SurfaceRequest? = null

    init {
        setEGLContextClientVersion(3)
        renderer = GlCameraRenderer(
            requestRender = { requestRender() },
            onTextureReady = { st -> main.post { surfaceTexture = st; maybeProvide() } },
        )
        setRenderer(renderer)
        renderMode = RENDERMODE_WHEN_DIRTY
    }

    val surfaceProvider = Preview.SurfaceProvider { request ->
        main.post { pending = request; maybeProvide() }
    }

    private fun maybeProvide() {
        val st = surfaceTexture ?: return
        val request = pending ?: return
        val res = request.resolution
        st.setDefaultBufferSize(res.width, res.height)
        val surface = Surface(st)
        request.provideSurface(surface, ContextCompat.getMainExecutor(context)) {
            surface.release()
        }
        pending = null
    }

    fun setGrade(exposure: Float, contrast: Float, saturation: Float, warmth: Float, shadows: Float, sharpen: Float, grain: Float) {
        renderer.exposure = exposure; renderer.contrast = contrast; renderer.saturation = saturation
        renderer.warmth = warmth; renderer.shadows = shadows; renderer.sharpen = sharpen; renderer.grain = grain
    }

    /** Panels as [x,y,w,h] normalized (origin bottom-left) + radii (fraction of width). */
    fun setPanels(rects: FloatArray, radii: FloatArray) = renderer.setPanels(rects, radii)

    override fun onPause() { super.onPause() }
    fun releaseGl() { renderer.release() }
}
