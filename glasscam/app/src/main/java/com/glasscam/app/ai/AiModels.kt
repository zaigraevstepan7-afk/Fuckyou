package com.glasscam.app.ai

/** Structured result of a Gemini scene analysis. */
data class AiResult(
    val composition: String,
    val mood: String,
    val filterId: String,   // matches FilterPreset.id
    val filterLabel: String,
)

sealed interface AiState {
    data object Idle : AiState
    data object Loading : AiState
    data class Success(val result: AiResult) : AiState
    data class Error(val message: String) : AiState
}
