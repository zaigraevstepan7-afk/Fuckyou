package com.fuckyou.app.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Strict black & white palette.
private val Black = Color(0xFF000000)
private val NearBlack = Color(0xFF0E0E10)
private val DarkGray = Color(0xFF1C1C1E)
private val MidGray = Color(0xFF2C2C2E)
private val LightGray = Color(0xFF3A3A3C)
private val White = Color(0xFFFFFFFF)
private val OffWhite = Color(0xFFE5E5E7)

/** Accent options — kept monochrome so the whole UI stays black & white. */
val accentColors = listOf(White, OffWhite, LightGray, MidGray)

@Composable
fun FuckYouTheme(accentIndex: Int, content: @Composable () -> Unit) {
    val accent = accentColors.getOrElse(accentIndex) { White }
    val colors = darkColorScheme(
        primary = accent,
        onPrimary = Black,
        primaryContainer = MidGray,      // outgoing bubble
        onPrimaryContainer = White,
        secondary = accent,
        background = NearBlack,
        onBackground = White,
        surface = NearBlack,
        onSurface = White,
        surfaceVariant = DarkGray,       // incoming bubble
        onSurfaceVariant = OffWhite,
        error = White,                   // "deleted" marker stays visible in B/W
        errorContainer = LightGray,      // deleted bubble background
        onErrorContainer = White,
        outline = LightGray,
    )
    MaterialTheme(colorScheme = colors, content = content)
}
