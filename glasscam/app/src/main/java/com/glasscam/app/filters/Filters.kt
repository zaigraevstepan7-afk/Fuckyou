package com.glasscam.app.filters

import android.graphics.ColorMatrix
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix as ComposeColorMatrix

/** A named color-grade preset backed by a 4x5 color matrix (row-major, 20 floats). */
data class FilterPreset(val id: String, val label: String, val matrix: FloatArray) {
    val isIdentity: Boolean get() = id == "none"
    fun composeColorFilter(): ColorFilter? =
        if (isIdentity) null else ColorFilter.colorMatrix(ComposeColorMatrix(matrix.copyOf()))

    override fun equals(other: Any?) = other is FilterPreset && other.id == id
    override fun hashCode() = id.hashCode()
}

/** Build a grade by composing saturation → contrast/brightness → warm/cool tint. */
private fun grade(sat: Float, contrast: Float = 1f, lift: Float = 0f, warm: Float = 0f): FloatArray {
    val cm = ColorMatrix().apply { setSaturation(sat) }
    cm.postConcat(ColorMatrix(floatArrayOf(
        contrast, 0f, 0f, 0f, lift,
        0f, contrast, 0f, 0f, lift,
        0f, 0f, contrast, 0f, lift,
        0f, 0f, 0f, 1f, 0f,
    )))
    if (warm != 0f) {
        cm.postConcat(ColorMatrix(floatArrayOf(
            1f + warm * 0.12f, 0f, 0f, 0f, warm * 8f,
            0f, 1f, 0f, 0f, 0f,
            0f, 0f, 1f - warm * 0.12f, 0f, -warm * 8f,
            0f, 0f, 0f, 1f, 0f,
        )))
    }
    return cm.array
}

object FilterPresets {
    val none = FilterPreset("none", "Ориг", grade(1f))
    val vivid = FilterPreset("vivid", "Ярко", grade(1.5f, 1.08f, -6f))
    val warm = FilterPreset("warm", "Тепло", grade(1.05f, 1.0f, 2f, warm = 1.1f))
    val cool = FilterPreset("cool", "Холод", grade(1.05f, 1.0f, 2f, warm = -1.1f))
    val film = FilterPreset("film", "Плёнка", grade(0.9f, 0.94f, 10f, warm = 0.5f))
    val portrait = FilterPreset("portrait", "Портрет", grade(0.96f, 0.98f, 8f, warm = 0.6f))
    val retro = FilterPreset("retro", "Ретро", grade(0.82f, 0.86f, 20f, warm = 0.5f))
    val gold = FilterPreset("gold", "Золото", grade(1.15f, 1.02f, 4f, warm = 1.4f))
    val teal = FilterPreset("teal", "Бирюза", grade(1.1f, 1.05f, 0f, warm = -0.8f))
    val forest = FilterPreset(
        "forest", "Лес",
        floatArrayOf(
            0.95f, 0.0f, 0.0f, 0f, -2f,
            0.0f, 1.12f, 0.0f, 0f, 4f,
            0.0f, 0.0f, 0.92f, 0f, -2f,
            0f, 0f, 0f, 1f, 0f,
        ),
    )
    val noir = FilterPreset("noir", "Нуар", grade(0f, 1.25f, -14f))
    val bw = FilterPreset("bw", "Ч/Б", grade(0f))

    val all = listOf(none, vivid, portrait, film, gold, warm, retro, forest, teal, cool, noir, bw)
    fun byId(id: String): FilterPreset = all.firstOrNull { it.id == id } ?: none
}
