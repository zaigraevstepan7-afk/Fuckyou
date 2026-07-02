package com.glasscam.app.filters

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

private fun saturation(s: Float): FloatArray {
    val lr = 0.213f; val lg = 0.715f; val lb = 0.072f
    val ir = (1 - s) * lr; val ig = (1 - s) * lg; val ib = (1 - s) * lb
    return floatArrayOf(
        ir + s, ig, ib, 0f, 0f,
        ir, ig + s, ib, 0f, 0f,
        ir, ig, ib + s, 0f, 0f,
        0f, 0f, 0f, 1f, 0f,
    )
}

object FilterPresets {
    val none = FilterPreset("none", "Ориг", saturation(1f))
    val bw = FilterPreset("bw", "Ч/Б", saturation(0f))
    val vivid = FilterPreset("vivid", "Ярко", saturation(1.55f))
    val warm = FilterPreset(
        "warm", "Тепло",
        floatArrayOf(
            1.12f, 0f, 0f, 0f, 8f,
            0f, 1.02f, 0f, 0f, 4f,
            0f, 0f, 0.88f, 0f, -6f,
            0f, 0f, 0f, 1f, 0f,
        ),
    )
    val cool = FilterPreset(
        "cool", "Холод",
        floatArrayOf(
            0.90f, 0f, 0f, 0f, -4f,
            0f, 1.0f, 0f, 0f, 2f,
            0f, 0f, 1.15f, 0f, 10f,
            0f, 0f, 0f, 1f, 0f,
        ),
    )
    val film = FilterPreset(
        "film", "Плёнка",
        floatArrayOf(
            0.95f, 0.05f, 0.0f, 0f, 6f,
            0.02f, 0.92f, 0.02f, 0f, 4f,
            0.0f, 0.06f, 0.86f, 0f, -2f,
            0f, 0f, 0f, 1f, 0f,
        ),
    )

    val all = listOf(none, vivid, warm, cool, film, bw)
    fun byId(id: String): FilterPreset = all.firstOrNull { it.id == id } ?: none
}
