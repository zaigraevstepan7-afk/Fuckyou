package com.glasscam.app.ai

/**
 * Rich result of a Gemini "smart compose" analysis — mirrors what Doka Cam shows in
 * AI Compose: a scene description, a composition tip, a recommended film filter, an
 * on-screen aiming hint and a suggested framing rectangle (normalized 0..1 coords).
 */
data class ComposeResult(
    val scene: String,        // "Парк, зелёные деревья, ясное небо…"
    val advice: String,       // "Правило третей, сбалансируйте крону и людей"
    val filterId: String,     // matches FilterPreset.id
    val filterLabel: String,  // human label, e.g. "F 160C"
    val hint: String,         // "Наведите чуть выше" / "Приблизьте 2×"
    val frame: NormRect?,     // recommended crop, drawn as an iridescent rectangle
)

/** Normalized rectangle in preview space (0..1). */
data class NormRect(val x: Float, val y: Float, val w: Float, val h: Float)

sealed interface AiState {
    data object Idle : AiState
    data object Loading : AiState
    data class Success(val result: ComposeResult) : AiState
    data class Error(val message: String) : AiState
}
