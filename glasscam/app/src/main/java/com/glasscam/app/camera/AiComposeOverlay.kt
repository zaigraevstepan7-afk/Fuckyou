package com.glasscam.app.camera

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.glasscam.app.ai.ComposeResult
import com.glasscam.app.ai.NormRect
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.liquidGlass
import kotlin.math.sin

private val iridescent = listOf(
    Color(0xFF7CE0FF), Color(0xFFB69CFF), Color(0xFFFF9CE0),
    Color(0xFFFFC98C), Color(0xFF9CFFC1), Color(0xFF7CE0FF),
)

/** Faint rule-of-thirds grid, like Doka's compose grid. */
@Composable
fun ThirdsGrid(modifier: Modifier = Modifier) {
    Canvas(modifier.fillMaxSize()) {
        val c = Color.White.copy(alpha = 0.22f)
        val w = size.width; val h = size.height
        for (i in 1..2) {
            drawLine(c, Offset(w * i / 3f, 0f), Offset(w * i / 3f, h), 1f)
            drawLine(c, Offset(0f, h * i / 3f), Offset(w, h * i / 3f), 1f)
        }
    }
}

/** Animated iridescent recommended-framing rectangle at normalized coords. */
@Composable
fun RecommendedFrame(rect: NormRect, modifier: Modifier = Modifier) {
    val transition = rememberInfiniteTransition(label = "frame")
    val phase by transition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(3200, easing = LinearEasing), RepeatMode.Restart),
        label = "phase",
    )
    Canvas(modifier.fillMaxSize()) {
        val x = rect.x * size.width
        val y = rect.y * size.height
        val w = rect.w * size.width
        val h = rect.h * size.height
        val sweep = Brush.sweepGradient(iridescent, center = Offset(x + w / 2f, y + h / 2f))
        val corner = 22.dp.toPx()
        val glow = 0.35f + 0.25f * ((sin(phase * 6.283f) + 1f) / 2f)
        drawRoundRect(sweep, Offset(x, y), Size(w, h), CornerRadius(corner, corner), style = Stroke(6f), alpha = glow)
        drawRoundRect(sweep, Offset(x, y), Size(w, h), CornerRadius(corner, corner), style = Stroke(2.5f))
    }
}

/** Pulsing colored aiming ring at the recommended composition center ("наведитесь сюда"). */
@Composable
fun AimReticle(rect: NormRect, modifier: Modifier = Modifier) {
    val transition = rememberInfiniteTransition(label = "aim")
    val pulse by transition.animateFloat(
        initialValue = 0f, targetValue = 1f,
        animationSpec = infiniteRepeatable(tween(1600, easing = LinearEasing), RepeatMode.Restart),
        label = "pulse",
    )
    Canvas(modifier.fillMaxSize()) {
        val cx = (rect.x + rect.w / 2f) * size.width
        val cy = (rect.y + rect.h / 2f) * size.height
        val sweep = Brush.sweepGradient(iridescent, center = Offset(cx, cy))
        val base = 26.dp.toPx()
        // expanding pulse ring
        drawCircle(sweep, radius = base + pulse * 22f, center = Offset(cx, cy),
            alpha = (1f - pulse) * 0.7f, style = Stroke(3f))
        // steady inner ring + center dot
        drawCircle(sweep, radius = base, center = Offset(cx, cy), style = Stroke(3f))
        drawCircle(Color.White, radius = 3.5f, center = Offset(cx, cy))
        // small chevron above pointing down to the ring
        val cyTop = cy - base - 16f
        drawLine(Color.White, Offset(cx - 10f, cyTop - 8f), Offset(cx, cyTop), 3f)
        drawLine(Color.White, Offset(cx + 10f, cyTop - 8f), Offset(cx, cyTop), 3f)
    }
}

/**
 * "Aim & lock" overlay (our own implementation of the technique): a recommended framing
 * rectangle with an animated iridescent border, a dimmed surround, and four corner brackets
 * that converge toward the centre as [progress] (hold-steady alignment) rises to 1 = locked.
 */
@Composable
fun AiTargetOverlay(rect: NormRect, progress: Float, modifier: Modifier = Modifier) {
    val t = rememberInfiniteTransition(label = "aim")
    val spin by t.animateFloat(
        0f, 1f, infiniteRepeatable(tween(2600, easing = LinearEasing), RepeatMode.Restart), label = "spin",
    )
    val pulse by t.animateFloat(
        0f, 1f, infiniteRepeatable(tween(1200, easing = LinearEasing), RepeatMode.Reverse), label = "pulse",
    )
    Canvas(modifier.fillMaxSize()) {
        val x = rect.x * size.width
        val y = rect.y * size.height
        val fw = rect.w * size.width
        val fh = rect.h * size.height
        val corner = 24.dp.toPx()
        val scrim = Color.Black.copy(alpha = 0.26f * (0.5f + 0.5f * progress))

        // dim everything outside the frame (four bands)
        drawRect(scrim, Offset(0f, 0f), Size(size.width, y))
        drawRect(scrim, Offset(0f, y + fh), Size(size.width, size.height - y - fh))
        drawRect(scrim, Offset(0f, y), Size(x, fh))
        drawRect(scrim, Offset(x + fw, y), Size(size.width - x - fw, fh))

        // iridescent rounded border (rotating sweep gradient)
        val center = Offset(x + fw / 2f, y + fh / 2f)
        val sweep = Brush.sweepGradient(iridescent.rotated(spin), center)
        drawRoundRect(sweep, Offset(x, y), Size(fw, fh), CornerRadius(corner, corner), style = Stroke(2.5f))

        // four converging corner brackets
        val arm = minOf(fw, fh) * 0.14f
        val inset = (minOf(fw, fh) * 0.16f) * progress
        val bright = 0.55f + 0.45f * progress
        val col = Color.White.copy(alpha = bright)
        val sw = 3f + 2f * progress
        // top-left
        corner(col, sw, Offset(x + inset, y + inset), arm, +1f, +1f)
        corner(col, sw, Offset(x + fw - inset, y + inset), arm, -1f, +1f)
        corner(col, sw, Offset(x + inset, y + fh - inset), arm, +1f, -1f)
        corner(col, sw, Offset(x + fw - inset, y + fh - inset), arm, -1f, -1f)

        // centre dot pulses; grows/locks with progress
        drawCircle(sweep, radius = (10f + 10f * pulse) * (1f - progress) + 6f, center = center, style = Stroke(2f))
        drawCircle(Color.White, radius = 3f + 2f * progress, center = center)
    }
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.corner(
    color: Color, stroke: Float, p: Offset, arm: Float, dx: Float, dy: Float,
) {
    drawLine(color, p, Offset(p.x + arm * dx, p.y), stroke, cap = androidx.compose.ui.graphics.StrokeCap.Round)
    drawLine(color, p, Offset(p.x, p.y + arm * dy), stroke, cap = androidx.compose.ui.graphics.StrokeCap.Round)
}

private fun List<Color>.rotated(phase: Float): List<Color> {
    if (isEmpty()) return this
    val n = size
    val shift = (phase * n).toInt() % n
    return List(n) { this[(it + shift) % n] }
}

/** Top card with the AI scene description, composition advice and recommended filter. */
@Composable
fun AiComposeCard(result: ComposeResult, modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxWidth()
            .liquidGlass(Glass.shapeCapsule, alphaTop = 0.22f, alphaBottom = 0.09f)
            .padding(horizontal = 16.dp, vertical = 10.dp),
    ) {
        Column {
            if (result.advice.isNotBlank()) {
                Text(
                    result.advice, color = Glass.tint, fontSize = 14.sp, fontWeight = FontWeight.Medium,
                    maxLines = 2, overflow = androidx.compose.ui.text.style.TextOverflow.Ellipsis,
                )
            }
            if (result.gradeLabel.isNotBlank()) {
                Text(
                    "Стиль: ${result.gradeLabel}",
                    color = Color(0xFF9CD8FF), fontSize = 12.sp, fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(top = 3.dp),
                )
            }
        }
    }
}

/** Centered aiming hint pill, e.g. "Наведите выше". */
@Composable
fun AiHintPill(hint: String, modifier: Modifier = Modifier) {
    if (hint.isBlank()) return
    Box(
        modifier
            .wrapContentWidth()
            .liquidGlass(Glass.shapeCapsule, alphaTop = 0.30f, alphaBottom = 0.12f)
            .padding(horizontal = 20.dp, vertical = 10.dp),
    ) {
        Text(hint, color = Glass.tint, fontSize = 15.sp, fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center)
    }
}
