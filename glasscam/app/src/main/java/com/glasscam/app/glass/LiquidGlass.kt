package com.glasscam.app.glass

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Liquid Glass design language (Apple iOS 26 style) implemented natively for Compose:
 * translucent layered "glass" with a specular highlight edge and large, concentric radii.
 * Sits over the live camera feed, so translucency + highlight reads as glass without a
 * true backdrop blur (which Compose can't cheaply do over a SurfaceView preview).
 */
object Glass {
    val tint = Color(0xFFEAF2FF)
    val shapeCard = RoundedCornerShape(28.dp)
    val shapeCapsule = RoundedCornerShape(percent = 50)

    fun fill(alphaTop: Float = 0.20f, alphaBottom: Float = 0.06f) = Brush.linearGradient(
        0f to Color.White.copy(alpha = alphaTop),
        1f to Color.White.copy(alpha = alphaBottom),
    )

    val rim = Brush.linearGradient(
        0f to Color.White.copy(alpha = 0.55f),
        0.35f to Color.White.copy(alpha = 0.12f),
        1f to Color.White.copy(alpha = 0.04f),
    )
    val scrim = Color.Black.copy(alpha = 0.28f)
}

/** Core glass modifier: scrim + translucent gradient fill + specular rim, clipped to [shape]. */
fun Modifier.liquidGlass(
    shape: Shape = Glass.shapeCard,
    alphaTop: Float = 0.20f,
    alphaBottom: Float = 0.06f,
    borderWidth: Dp = 1.dp,
): Modifier = this
    .clip(shape)
    .background(Glass.scrim, shape)
    .background(Glass.fill(alphaTop, alphaBottom), shape)
    .border(BorderStroke(borderWidth, Glass.rim), shape)

@Composable
fun GlassCard(
    modifier: Modifier = Modifier,
    shape: Shape = Glass.shapeCard,
    contentPadding: PaddingValues = PaddingValues(20.dp),
    content: @Composable BoxScope.() -> Unit = {},
) {
    Box(
        modifier = modifier.liquidGlass(shape).padding(contentPadding),
        content = content,
    )
}

@Composable
fun GlassCapsuleBar(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(14.dp),
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier
            .liquidGlass(Glass.shapeCapsule, alphaTop = 0.22f, alphaBottom = 0.08f)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = horizontalArrangement,
        content = content,
    )
}

@Composable
fun GlassIconButton(
    icon: ImageVector,
    contentDescription: String?,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    size: Dp = 52.dp,
    tint: Color = Glass.tint,
) {
    Box(
        modifier = modifier
            .size(size)
            .liquidGlass(CircleShape, alphaTop = 0.24f, alphaBottom = 0.10f)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Icon(icon, contentDescription, tint = tint, modifier = Modifier.size(size * 0.42f))
    }
}

/** Large primary shutter — concentric glass rings. */
@Composable
fun GlassShutter(onClick: () -> Unit, modifier: Modifier = Modifier, size: Dp = 78.dp) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(Color.White.copy(alpha = 0.14f), CircleShape)
            .border(BorderStroke(2.dp, Glass.rim), CircleShape)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            Modifier
                .size(size * 0.72f)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.92f), CircleShape),
        )
    }
}
