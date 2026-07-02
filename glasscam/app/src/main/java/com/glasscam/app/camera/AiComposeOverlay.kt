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
 * Live aim overlay: a crosshair at your current centre, a target ring at ([tx],[ty]) that moves
 * in real time as you pan/tilt the phone, a direction arrow between them, and a progress arc that
 * fills as you bring the centre onto the ring ([progress] = how close = "how much more to go").
 */
@Composable
fun AiAimOverlay(
    aimRot: androidx.compose.runtime.State<FloatArray>,
    baseTx: Float, baseTy: Float, refTilt: Float, refPan: Float,
    modifier: Modifier = Modifier,
) {
    val t = rememberInfiniteTransition(label = "aim")
    val spin by t.animateFloat(
        0f, 1f, infiniteRepeatable(tween(2600, easing = LinearEasing), RepeatMode.Restart), label = "spin",
    )
    val pulse by t.animateFloat(
        0f, 1f, infiniteRepeatable(tween(1100, easing = LinearEasing), RepeatMode.Reverse), label = "pulse",
    )
    Canvas(modifier.fillMaxSize()) {
        // world-anchored target: compensate for phone rotation so the ring stays on the real spot.
        val r = aimRot.value
        val tx = (baseTx - (r[1] - refPan) * 0.9f).coerceIn(0.04f, 0.96f)
        val ty = (baseTy - (r[0] - refTilt) * 0.9f).coerceIn(0.04f, 0.96f)
        val progress = (1f - kotlin.math.hypot(tx - 0.5f, ty - 0.5f) / 0.5f).coerceIn(0f, 1f)
        val screen = Offset(size.width / 2f, size.height / 2f)
        val target = Offset(tx * size.width, ty * size.height)
        val accent = androidx.compose.ui.graphics.lerp(Color(0xFF7CE0FF), Color(0xFF6BFF9E), progress)

        // your current centre — crosshair
        val cc = Color.White.copy(alpha = 0.85f)
        drawLine(cc, Offset(screen.x - 16f, screen.y), Offset(screen.x + 16f, screen.y), 2f)
        drawLine(cc, Offset(screen.x, screen.y - 16f), Offset(screen.x, screen.y + 16f), 2f)

        // direction arrow from your centre toward the target ("веди сюда")
        val dx = target.x - screen.x; val dy = target.y - screen.y
        val dist = kotlin.math.hypot(dx, dy)
        if (dist > 46f) {
            val ux = dx / dist; val uy = dy / dist
            val start = Offset(screen.x + ux * 24f, screen.y + uy * 24f)
            val end = Offset(target.x - ux * 44f, target.y - uy * 44f)
            drawLine(accent, start, end, 4f, cap = androidx.compose.ui.graphics.StrokeCap.Round)
            val ah = 16f
            val a1 = Offset(end.x - (ux * ah - uy * ah * 0.6f), end.y - (uy * ah + ux * ah * 0.6f))
            val a2 = Offset(end.x - (ux * ah + uy * ah * 0.6f), end.y - (uy * ah - ux * ah * 0.6f))
            drawLine(accent, end, a1, 4f, cap = androidx.compose.ui.graphics.StrokeCap.Round)
            drawLine(accent, end, a2, 4f, cap = androidx.compose.ui.graphics.StrokeCap.Round)
        }

        // target ring (pulsing) at the live target position
        val ringR = 30f
        val sweep = Brush.sweepGradient(iridescent.rotated(spin), target)
        drawCircle(sweep, radius = ringR + (1f - progress) * (7f + 7f * pulse), center = target, style = Stroke(3f))
        drawCircle(Color.White, radius = 3f + 2f * progress, center = target)

        // "how much more to go" — progress arc that fills as the crosshair nears the ring
        val arcR = ringR + 13f
        drawCircle(Color.White.copy(alpha = 0.16f), radius = arcR, center = target, style = Stroke(5f))
        drawArc(
            accent, -90f, 360f * progress.coerceIn(0f, 1f), false,
            topLeft = Offset(target.x - arcR, target.y - arcR), size = Size(arcR * 2f, arcR * 2f),
            style = Stroke(width = 5f, cap = androidx.compose.ui.graphics.StrokeCap.Round),
        )
    }
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.cornerAt(
    color: Color, stroke: Float, p: Offset, arm: Float, dx: Float, dy: Float,
) {
    drawLine(color, p, Offset(p.x + arm * dx, p.y), stroke, cap = androidx.compose.ui.graphics.StrokeCap.Round)
    drawLine(color, p, Offset(p.x, p.y + arm * dy), stroke, cap = androidx.compose.ui.graphics.StrokeCap.Round)
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
