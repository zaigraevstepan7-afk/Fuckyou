package com.glasscam.app.ui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val GlassScheme = darkColorScheme(
    primary = Color(0xFF7FB2FF),
    onPrimary = Color(0xFF06121F),
    background = Color(0xFF0B0E14),
    onBackground = Color(0xFFEAF2FF),
    surface = Color(0xFF10141C),
    onSurface = Color(0xFFEAF2FF),
)

@Composable
fun GlassCamTheme(content: @Composable () -> Unit) {
    // Always dark — the glass material is designed against a deep backdrop.
    @Suppress("UNUSED_EXPRESSION") isSystemInDarkTheme()
    MaterialTheme(colorScheme = GlassScheme, content = content)
}
