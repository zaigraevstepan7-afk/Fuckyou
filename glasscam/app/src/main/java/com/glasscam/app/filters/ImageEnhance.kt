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
) {
    fun toMatrix(): FloatArray {
        val lift = exposure * 34f + shadows * 16f
        val cm = ColorMatrix().apply { setSaturation(saturation.coerceIn(0f, 2f)) }
        val c = contrast.coerceIn(0.6f, 1.6f)
        cm.postConcat(ColorMatrix(floatArrayOf(
            c, 0f, 0f, 0f, lift,
            0f, c, 0f, 0f, lift,
            0f, 0f, c, 0f, lift,
            0f, 0f, 0f, 1f, 0f,
        )))
        if (warmth != 0f) {
            cm.postConcat(ColorMatrix(floatArrayOf(
                1f + warmth * 0.12f, 0f, 0f, 0f, warmth * 8f,
                0f, 1f, 0f, 0f, 0f,
                0f, 0f, 1f - warmth * 0.12f, 0f, -warmth * 8f,
                0f, 0f, 0f, 1f, 0f,
            )))
        }
        return cm.array
    }
}

/** Compose two 4x5 color matrices (apply [first], then [second]). */
fun composeMatrices(first: FloatArray, second: FloatArray): FloatArray {
    val a = ColorMatrix(second)
    a.postConcat(ColorMatrix(first))
    return a.array
}
