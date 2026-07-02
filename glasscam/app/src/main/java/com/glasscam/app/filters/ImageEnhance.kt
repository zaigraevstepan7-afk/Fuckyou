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
    fun toMatrix(): FloatArray {
        val c = contrast.coerceIn(0.6f, 1.9f)
        // Exposure + shadow lift, plus a midpoint pivot so contrast brightens/darkens around
        // mid-grey (128) instead of around black — that's what makes the grade actually read.
        val lift = exposure * 42f + shadows * 22f + 127.5f * (1f - c)
        val cm = ColorMatrix().apply { setSaturation(saturation.coerceIn(0f, 2.4f)) }
        cm.postConcat(ColorMatrix(floatArrayOf(
            c, 0f, 0f, 0f, lift,
            0f, c, 0f, 0f, lift,
            0f, 0f, c, 0f, lift,
            0f, 0f, 0f, 1f, 0f,
        )))
        if (warmth != 0f) {
            cm.postConcat(ColorMatrix(floatArrayOf(
                1f + warmth * 0.18f, 0f, 0f, 0f, warmth * 10f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f - warmth * 0.18f, 0f, -warmth * 10f,
                0f, 0f, 0f, 1f, 0f,
            )))
        }
        return cm.array
    }

    /**
     * Guarantee a visible grade. AI often returns near-neutral values (exposure≈0, contrast≈1,
     * saturation≈1) which produce an identity matrix and no visible change — so we floor every
     * parameter to a punchy minimum. The processed photo is then always clearly better than stock.
     */
    fun boosted(): EnhanceParams = EnhanceParams(
        exposure = exposure.coerceIn(0.04f, 1f),
        contrast = contrast.coerceAtLeast(1.16f),
        saturation = saturation.coerceAtLeast(1.24f),
        warmth = if (kotlin.math.abs(warmth) < 0.05f) 0.07f else warmth,
        shadows = shadows.coerceAtLeast(0.12f),
        highlights = highlights,
        sharpen = sharpen.coerceAtLeast(0.6f),
        grain = grain,
    )

    companion object {
        /** Default "auto-enhance" look used when the AI isn't driving the grade. */
        fun auto(): EnhanceParams = EnhanceParams(
            exposure = 0.06f, contrast = 1.22f, saturation = 1.32f,
            warmth = 0.08f, shadows = 0.16f, sharpen = 0.7f,
        )
    }
}

/** Compose two 4x5 color matrices (apply [first], then [second]). */
fun composeMatrices(first: FloatArray, second: FloatArray): FloatArray {
    val a = ColorMatrix(second)
    a.postConcat(ColorMatrix(first))
    return a.array
}
