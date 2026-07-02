package com.glasscam.app.ai

import com.glasscam.app.filters.EnhanceParams

/**
 * Rich result of a Gemini "smart compose" analysis. The AI drives everything: it describes
 * the scene, gives a composition tip, chooses its own custom color grade (not limited to
 * fixed presets), a short grade label, an aiming hint, a suggested framing rectangle, a
 * suggested zoom, and whether this is a good moment to auto-shoot.
 */
data class ComposeResult(
    val scene: String,
    val advice: String,
    val hint: String,
    val grade: EnhanceParams,   // AI-chosen custom look (exposure/contrast/sat/warmth/sharpen/grain…)
    val gradeLabel: String,     // e.g. "Тёплый плёночный"
    val frame: NormRect?,       // recommended crop → drawn as the iridescent frame + auto-zoom target
    val zoom: Float?,           // suggested zoom ratio
    val ready: Boolean,         // good moment to auto-capture
)

/** Normalized rectangle in preview space (0..1). */
data class NormRect(val x: Float, val y: Float, val w: Float, val h: Float)

sealed interface AiState {
    data object Idle : AiState
    data object Loading : AiState
    data class Success(val result: ComposeResult) : AiState
    data class Error(val message: String) : AiState
}
