package com.glasscam.app.filters

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.RadialGradient
import android.graphics.Shader
import kotlin.math.min
import kotlin.random.Random

/**
 * A creative "effect stack" the AI composes per scene — its way of building the right shader/look
 * for the moment. Each field is a knob Gemini sets; we render them with fast bitmap compositing
 * (blur/screen/overlay/radial passes) instead of a per-pixel CPU shader, so a full-res photo is
 * processed in well under a second and the shutter never lags.
 */
data class PhotoEffects(
    val bloom: Float = 0f,      // 0..1 soft glow on highlights (dreamy light)
    val vignette: Float = 0f,   // 0..1 darken corners, focus the centre
    val glowWarmth: Float = 0f, // -1..1 tint of the bloom (warm sun / cool night)
    val grain: Float = 0f,      // 0..1 fine film grain
    val chroma: Float = 0f,     // 0..1 chromatic edges (subtle lens dispersion)
    val clarity: Float = 0f,    // 0..1 punchy local contrast pop
    val label: String = "",     // AI name of the effect, e.g. "Золотой час"
) {
    fun isNoop(): Boolean =
        bloom < 0.02f && vignette < 0.02f && grain < 0.02f && chroma < 0.02f && clarity < 0.02f

    /** Clamp to a safe, non-blowout range (bloom on a bright scene is the main risk). */
    fun safe() = copy(
        bloom = bloom.coerceIn(0f, 0.4f),
        vignette = vignette.coerceIn(0f, 0.4f),
        grain = grain.coerceIn(0f, 0.5f),
        chroma = chroma.coerceIn(0f, 0.4f),
        clarity = clarity.coerceIn(0f, 0.6f),
    )

    companion object {
        /** Default look when the AI isn't driving effects — subtle, never blows highlights. */
        fun auto() = PhotoEffects(bloom = 0.08f, vignette = 0.14f, grain = 0.05f, chroma = 0.04f, clarity = 0.15f)
    }
}

object PhotoEffectsRenderer {

    /** Apply the AI effect stack to [src], returning a new bitmap ([src] is left untouched). */
    fun render(src: Bitmap, raw: PhotoEffects): Bitmap {
        val fx = raw.safe()
        if (fx.isNoop()) return src
        val w = src.width; val h = src.height
        val out = src.copy(Bitmap.Config.ARGB_8888, true)
        val canvas = Canvas(out)

        // 1) Bloom / glow — bright-pass, blur it down, screen-blend back for dreamy highlights.
        if (fx.bloom > 0.02f) {
            val bright = brightPass(src, fx.glowWarmth)
            val down = Bitmap.createScaledBitmap(bright, (w / 8).coerceAtLeast(1), (h / 8).coerceAtLeast(1), true)
            bright.recycle()
            val blur = Bitmap.createScaledBitmap(down, w, h, true); down.recycle()
            canvas.drawBitmap(blur, 0f, 0f, Paint().apply {
                xfermode = PorterDuffXfermode(PorterDuff.Mode.SCREEN)
                alpha = (fx.bloom * 140f).toInt().coerceIn(0, 255)
            })
            blur.recycle()
        }

        // 2) Chromatic edges — nudge red/blue channels a couple px apart for lens dispersion.
        if (fx.chroma > 0.02f) {
            val shift = (fx.chroma * 3f).coerceIn(0.5f, 4f)
            val red = channel(src, 1f, 0f, 0f)
            val blue = channel(src, 0f, 0f, 1f)
            canvas.drawBitmap(red, shift, 0f, Paint().apply {
                xfermode = PorterDuffXfermode(PorterDuff.Mode.SCREEN); alpha = 70
            })
            canvas.drawBitmap(blue, -shift, 0f, Paint().apply {
                xfermode = PorterDuffXfermode(PorterDuff.Mode.SCREEN); alpha = 70
            })
            red.recycle(); blue.recycle()
        }

        // 3) Vignette — radial darkening toward the corners.
        if (fx.vignette > 0.02f) {
            val cx = w / 2f; val cy = h / 2f
            val radius = min(w, h) * 0.75f
            val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
                shader = RadialGradient(
                    cx, cy, radius,
                    intArrayOf(Color.TRANSPARENT, Color.TRANSPARENT, Color.argb((fx.vignette * 150f).toInt().coerceIn(0, 200), 0, 0, 0)),
                    floatArrayOf(0f, 0.55f, 1f), Shader.TileMode.CLAMP,
                )
            }
            canvas.drawRect(0f, 0f, w.toFloat(), h.toFloat(), paint)
        }

        // 4) Grain — precomputed monochrome noise tile, overlay-blended.
        if (fx.grain > 0.02f) {
            val tile = noiseTile(160)
            val paint = Paint().apply {
                xfermode = PorterDuffXfermode(PorterDuff.Mode.OVERLAY)
                alpha = (fx.grain * 90f).toInt().coerceIn(0, 120)
                shader = android.graphics.BitmapShader(tile, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT)
            }
            canvas.drawRect(0f, 0f, w.toFloat(), h.toFloat(), paint)
            tile.recycle()
        }

        return out
    }

    /** Isolate bright areas (soft threshold) and optionally warm/cool them for the glow colour. */
    private fun brightPass(src: Bitmap, warmth: Float): Bitmap {
        val bmp = src.copy(Bitmap.Config.ARGB_8888, true)
        // Lift contrast hard and crush shadows so only highlights survive; then tint.
        val cm = ColorMatrix(floatArrayOf(
            2.2f, 0f, 0f, 0f, -150f,
            0f, 2.2f, 0f, 0f, -150f,
            0f, 0f, 2.2f, 0f, -150f,
            0f, 0f, 0f, 1f, 0f,
        ))
        if (warmth != 0f) {
            cm.postConcat(ColorMatrix(floatArrayOf(
                1f + warmth * 0.25f, 0f, 0f, 0f, 0f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f - warmth * 0.25f, 0f, 0f,
                0f, 0f, 0f, 1f, 0f,
            )))
        }
        Canvas(bmp).drawBitmap(src, 0f, 0f, Paint().apply { colorFilter = ColorMatrixColorFilter(cm) })
        return bmp
    }

    private fun channel(src: Bitmap, r: Float, g: Float, b: Float): Bitmap {
        val bmp = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
        Canvas(bmp).drawBitmap(src, 0f, 0f, Paint().apply {
            colorFilter = ColorMatrixColorFilter(ColorMatrix(floatArrayOf(
                r, 0f, 0f, 0f, 0f,
                0f, g, 0f, 0f, 0f,
                0f, 0f, b, 0f, 0f,
                0f, 0f, 0f, 1f, 0f,
            )))
        })
        return bmp
    }

    private fun noiseTile(size: Int): Bitmap {
        val bmp = Bitmap.createBitmap(size, size, Bitmap.Config.ARGB_8888)
        val px = IntArray(size * size)
        val rnd = Random(1234)
        for (i in px.indices) {
            val v = rnd.nextInt(90, 166)
            px[i] = (0xFF shl 24) or (v shl 16) or (v shl 8) or v
        }
        bmp.setPixels(px, 0, size, 0, 0, size, size)
        return bmp
    }
}
