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
