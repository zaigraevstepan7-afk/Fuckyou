package com.glasscam.app.camera

import android.annotation.SuppressLint
import android.graphics.RenderEffect
import android.graphics.RuntimeShader
import android.os.Build
import android.view.View

/**
 * Real "Liquid Glass" refraction of the LIVE camera, done with an AGSL [RuntimeShader] applied as
 * a [RenderEffect] straight onto the PreviewView (API 33+). The shader samples the view's own
 * rendered content (the camera) and bends the sample coordinates near glass-panel edges and along
 * the screen border — the iOS glass look: outer content magnifies/refracts at the rims, with a
 * little chromatic split and specular sheen. It only affects the on-screen preview; captured photos
 * come from a separate ImageCapture stream, so shots are never distorted. Below API 33 it's a no-op
 * and the app keeps the translucent Compose glass fallback.
 */
object LiquidGlassRefraction {

    val supported = Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU

    private const val SRC = """
        uniform shader content;
        uniform float2 res;
        uniform float4 dock;    // x, y, w, h (px); w<=1 disables
        uniform float radius;   // dock corner radius (px)
        uniform float edge;     // screen-edge refraction band (px); <=1 disables
        uniform float strength; // max displacement (px)

        float sdRR(float2 p, float2 b, float r) {
            float2 q = abs(p) - b + r;
            return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r;
        }

        half4 main(float2 fc) {
            float2 disp = float2(0.0, 0.0);
            float spec = 0.0;

            // 1) Glass dock panel — refract the camera behind it, brightest right at the edge.
            if (dock.z > 1.0) {
                float2 c = dock.xy + dock.zw * 0.5;
                float2 b = dock.zw * 0.5;
                float2 p = fc - c;
                float d = sdRR(p, b, radius);
                if (d < 0.0) {
                    float band = 64.0;
                    float close = clamp(1.0 - (-d) / band, 0.0, 1.0); // 1 at edge -> 0 inside
                    float e = 1.5;
                    float2 n = normalize(float2(
                        sdRR(p + float2(e, 0.0), b, radius) - sdRR(p - float2(e, 0.0), b, radius),
                        sdRR(p + float2(0.0, e), b, radius) - sdRR(p - float2(0.0, e), b, radius)
                    ) + 1e-5);
                    disp += n * (close * close) * strength;
                    spec += pow(close, 3.0) * 0.5 * max(0.0, -n.x - n.y);
                }
            }

            // 2) Screen-edge glass — the iOS "distortion along the borders".
            if (edge > 1.0) {
                float dl = fc.x;
                float dr = res.x - fc.x;
                float dt = fc.y;
                float db = res.y - fc.y;
                float ex = min(dl, dr);
                float ey = min(dt, db);
                if (ex < edge) {
                    float k = 1.0 - ex / edge;
                    disp.x += (dl < dr ? 1.0 : -1.0) * k * k * strength * 0.9;
                    spec += k * k * 0.12;
                }
                if (ey < edge) {
                    float k = 1.0 - ey / edge;
                    disp.y += (dt < db ? 1.0 : -1.0) * k * k * strength * 0.9;
                }
            }

            if (abs(disp.x) < 0.01 && abs(disp.y) < 0.01) {
                return content.eval(fc);
            }
            float2 uv = fc + disp;
            float2 cd = normalize(disp + 1e-5) * 2.0; // chromatic split along the bend
            half r = content.eval(uv + cd).r;
            half g = content.eval(uv).g;
            half b = content.eval(uv - cd).b;
            half4 col = half4(r, g, b, 1.0);
            col.rgb += spec;
            return col;
        }
    """

    private val shader: RuntimeShader? by lazy { buildShader() }

    @SuppressLint("NewApi")
    private fun buildShader(): RuntimeShader? = if (supported) RuntimeShader(SRC) else null

    /** Apply/refresh the refraction with the current preview size and dock rect (all in px). */
    @SuppressLint("NewApi")
    fun apply(
        view: View, w: Float, h: Float, dock: FloatArray,
        edge: Float = 104f, strength: Float = 22f, radius: Float = 80f,
    ) {
        val sh = shader ?: return
        sh.setFloatUniform("res", w, h)
        sh.setFloatUniform("dock", dock[0], dock[1], dock[2], dock[3])
        sh.setFloatUniform("radius", radius)
        sh.setFloatUniform("edge", edge)
        sh.setFloatUniform("strength", strength)
        view.setRenderEffect(RenderEffect.createRuntimeShaderEffect(sh, "content"))
    }

    @SuppressLint("NewApi")
    fun clear(view: View) { if (supported) view.setRenderEffect(null) }
}
