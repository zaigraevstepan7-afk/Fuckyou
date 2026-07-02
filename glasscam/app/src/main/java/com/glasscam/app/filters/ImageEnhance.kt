package com.glasscam.app.filters

import android.graphics.ColorMatrix

/**
 * AI-suggested correction for a captured photo. Gemini (vision) inspects the shot and
 * returns these; we apply them locally as a color matrix — reliable on the free key
 * (no image-generation quota needed).
 */
data class EnhanceParams(
    val exposure: Float = 0f,    // -1..1
    val contrast: Float = 1f,    // 0.7..1.4
    val saturation: Float = 1f,  // 0.5..1.8
    val warmth: Float = 0f,      // -1..1
    val shadows: Float = 0f,     // -1..1 (lift shadows)
    val highlights: Float = 0f,  // -1..1 (unused in matrix, kept for future)
    val sharpen: Float = 0f,     // 0..1 (unsharp mask amount)
    val grain: Float = 0f,       // 0..1 (film grain amount)
) {
    /**
     * Linear part of the grade: exposure, saturation and warm/cool tint. Contrast/shadows/highlight
     * shaping is done separately by [toneLut] as a real curve (a ColorMatrix can only do linear
     * contrast, which clips). Applied first, before the tone curve.
     */
    fun toMatrix(): FloatArray {
        val cm = ColorMatrix().apply { setSaturation(saturation.coerceIn(0f, 1.7f)) }
        val lift = exposure * 22f
        cm.postConcat(ColorMatrix(floatArrayOf(
            1f, 0f, 0f, 0f, lift,
            0f, 1f, 0f, 0f, lift,
            0f, 0f, 1f, 0f, lift,
            0f, 0f, 0f, 1f, 0f,
        )))
        if (warmth != 0f) {
            // Gentle warm/cool tint. Kept small so already-warm (tungsten) rooms don't go orange.
            cm.postConcat(ColorMatrix(floatArrayOf(
                1f + warmth * 0.10f, 0f, 0f, 0f, warmth * 5f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f - warmth * 0.10f, 0f, -warmth * 5f,
                0f, 0f, 0f, 1f, 0f,
            )))
        }
        return cm.array
    }

    /**
     * 256-entry per-channel tone curve: soft shadow lift, an S-curve for rich contrast, and a
     * highlight roll-off so bright areas compress toward white instead of clipping to a flat blob.
     * This is what gives the photo a graded, film-like tonality rather than a flat linear stretch.
     */
    fun toneLut(): IntArray {
        val c = contrast.coerceIn(0.85f, 1.4f)
        val sh = shadows.coerceIn(-0.3f, 0.5f)
        val roll = 0.6f              // highlight roll-off strength
        val knee = 0.78f             // where highlights start compressing
        val lut = IntArray(256)
        for (i in 0..255) {
            var y = i / 255f
            y += sh * 0.14f * (1f - y) * (1f - y)     // lift shadows, taper toward the mid-tones
            y = 0.5f + (y - 0.5f) * c                 // contrast pivoted on mid-grey
            if (y > knee) {                           // soft highlight roll-off (asymptotic to 1.0)
                val t = (y - knee) / (1f - knee)
                y = knee + (1f - knee) * (t / (1f + t * roll))
            }
            lut[i] = (y.coerceIn(0f, 1f) * 255f + 0.5f).toInt()
        }
        return lut
    }

    /**
     * Keep the grade visible but SAFE. AI values are clamped to a natural window: exposure can't
     * blow highlights, warmth isn't forced (so a warm room stays true, not orange), saturation and
     * contrast get a mild floor so the photo still reads punchier than stock.
     */
    fun boosted(): EnhanceParams = EnhanceParams(
        exposure = exposure.coerceIn(-0.35f, 0.22f),
        contrast = contrast.coerceIn(1.06f, 1.32f),
        saturation = saturation.coerceIn(1.05f, 1.35f),
        warmth = warmth.coerceIn(-0.45f, 0.45f),   // no forced warmth — respect the scene
        shadows = shadows.coerceIn(0f, 0.35f),
        highlights = highlights,
        sharpen = sharpen.coerceAtLeast(0.5f),
        grain = grain,
    )

    companion object {
        /** Default "auto-enhance" look used when the AI isn't driving the grade — neutral & gentle. */
        fun auto(): EnhanceParams = EnhanceParams(
            exposure = 0f, contrast = 1.12f, saturation = 1.14f,
            warmth = 0f, shadows = 0.08f, sharpen = 0.55f,
        )
    }
}

/** Compose two 4x5 color matrices (apply [first], then [second]). */
fun composeMatrices(first: FloatArray, second: FloatArray): FloatArray {
    val a = ColorMatrix(second)
    a.postConcat(ColorMatrix(first))
    return a.array
}
