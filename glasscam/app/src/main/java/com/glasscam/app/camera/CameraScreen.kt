package com.glasscam.app.camera

import android.content.ContentUris
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import androidx.camera.core.Preview
import androidx.camera.video.Quality
import androidx.camera.view.PreviewView
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.Cameraswitch
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.FlashOff
import androidx.compose.material.icons.rounded.FlashOn
import androidx.compose.material.icons.rounded.Grid3x3
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material.icons.rounded.Title
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.boundsInRoot
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.LocalLifecycleOwner
import coil.compose.AsyncImage
import com.glasscam.app.ai.ComposeResult
import com.glasscam.app.ai.GeminiService
import com.glasscam.app.camera.gl.GlCameraView
import com.glasscam.app.filters.EnhanceParams
import com.glasscam.app.filters.PhotoEffects
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassIconButton
import com.glasscam.app.glass.GlassShutter
import com.glasscam.app.glass.liquidGlass
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.math.abs

private val zoomStops = listOf(0.5f, 1f, 2f, 4f, 8f)
private val shutterColors = listOf(
    Color(0xFF7CE0FF), Color(0xFFB69CFF), Color(0xFFFF9CE0),
    Color(0xFFFFC98C), Color(0xFF9CFFC1), Color(0xFF7CE0FF),
)

@Composable
fun CameraScreen() {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val scope = rememberCoroutineScope()

    // GL Liquid-Glass refraction is disabled by default: on some devices the GL pipeline
    // produced a black preview, and GLSurfaceView doesn't throw on creation so the fallback
    // never triggered. Use the reliable PreviewView; GL can be re-enabled once verified.
    val enableGl = false
    val glView = remember { if (enableGl) runCatching { GlCameraView(context) }.getOrNull() else null }
    val previewView = remember {
        PreviewView(context).apply {
            scaleType = PreviewView.ScaleType.FILL_CENTER
            implementationMode = PreviewView.ImplementationMode.COMPATIBLE
        }
    }
    val surfaceProvider: Preview.SurfaceProvider = glView?.surfaceProvider ?: previewView.surfaceProvider

    val controller = remember { CameraController(context.applicationContext) }
    val isSteady by rememberIsSteady()
    val roll by rememberRollDegrees()
    var watermark by remember { mutableStateOf(true) }
    var focusAt by remember { mutableStateOf<Offset?>(null) }
    var focusKey by remember { mutableStateOf(0) }

    var videoMode by remember { mutableStateOf(false) }
    var videoCfg by remember { mutableStateOf(VideoConfig(Quality.FHD, 30, true)) }
    var showVideoSettings by remember { mutableStateOf(false) }
    var recording by remember { mutableStateOf(false) }

    var flashOn by remember { mutableStateOf(false) }
    var showGrid by remember { mutableStateOf(false) }
    var zoom by remember { mutableStateOf(1f) }
    var aiOn by remember { mutableStateOf(false) }
    var aiResult by remember { mutableStateOf<ComposeResult?>(null) }
    var aiError by remember { mutableStateOf<String?>(null) }
    var analyzing by remember { mutableStateOf(false) }
    var capturing by remember { mutableStateOf(false) }
    var enhancing by remember { mutableStateOf(false) }
    var flashKey by remember { mutableStateOf(0) }
    var toast by remember { mutableStateOf<String?>(null) }
    var lastShot by remember { mutableStateOf<Uri?>(null) }
    var autoCoolDown by remember { mutableStateOf(0L) }
    var dockRect by remember { mutableStateOf<androidx.compose.ui.geometry.Rect?>(null) }

    LaunchedEffect(videoMode, videoCfg) {
        controller.bind(
            lifecycleOwner, surfaceProvider,
            if (videoMode) CaptureMode.VIDEO else CaptureMode.PHOTO, videoCfg,
        )
        lastShot = queryLatest(context)
    }
    LaunchedEffect(toast) { if (toast != null) { delay(1800); toast = null } }
    DisposableEffect(Unit) { onDispose { glView?.releaseGl() } }

    fun applyGradeToGl(g: EnhanceParams?) {
        glView?.setGrade(
            g?.exposure ?: 0f, g?.contrast ?: 1f, g?.saturation ?: 1f, g?.warmth ?: 0f,
            g?.shadows ?: 0f, g?.sharpen ?: 0f, g?.grain ?: 0f,
        )
    }

    fun shoot(withDelay: Boolean) = scope.launch {
        if (capturing || recording) return@launch
        // Instant shutter: capture is quick, then the heavy grade + effects run fully in the
        // background so the UI never lags and you can shoot again immediately.
        capturing = true
        // Snapshot the look now: AI grade + AI-composed effect stack (or a strong auto look).
        val grade = (if (aiOn) aiResult?.grade else null)?.boosted() ?: EnhanceParams.auto()
        val effects = (if (aiOn) aiResult?.effects else null) ?: PhotoEffects.auto()
        val straightenDeg = roll   // auto-horizon: snapshot the tilt at capture
        val wm = watermark
        val jpeg = try {
            controller.captureJpeg()
        } catch (e: Exception) {
            toast = e.message ?: "Ошибка съёмки"; capturing = false; return@launch
        }
        capturing = false
        flashKey++            // fire the shutter flash animation
        enhancing = true
        scope.launch(Dispatchers.Default) {
            runCatching {
                val uri = controller.processAndSave(jpeg, grade, effects, straightenDeg, wm)
                withContext(Dispatchers.Main) { lastShot = uri; toast = if (aiOn) "ИИ обработал фото" else "Фото готово" }
            }
            withContext(Dispatchers.Main) { enhancing = false }
        }
    }

    // Continuous AI-compose loop (photo mode).
    LaunchedEffect(aiOn, videoMode) {
        if (!aiOn || videoMode) { aiResult = null; aiError = null; analyzing = false; applyGradeToGl(null); return@LaunchedEffect }
        if (!GeminiService.hasKey()) { aiError = "Не задан ключ Gemini"; return@LaunchedEffect }
        while (isActive && aiOn && !videoMode) {
            val frame = controller.latestFrame()
            if (frame != null) {
                analyzing = true
                val res = GeminiService.analyzeCompose(frame)
                analyzing = false
                val r = res.getOrNull()
                if (r != null) {
                    aiResult = r; aiError = null
                    applyGradeToGl(r.grade)
                    r.zoom?.let { z ->
                        val target = z.coerceIn(controller.minZoom, controller.maxZoom)
                        animate(zoom, target, animationSpec = tween(500)) { v, _ -> zoom = v; controller.setZoomAbsolute(v) }
                    }
                } else {
                    aiError = res.exceptionOrNull()?.message
                }
            }
            delay(3500)
        }
    }

    // Gyro-anchored aim ring (crooked but working, kept per user request): anchor the target to
    // the AI's suggested frame centre, capture the current phone rotation as reference, then the
    // ring stays world-fixed as you pan/tilt so it shows where to aim.
    val aimRot = rememberAimRotation()
    var baseTx by remember { mutableStateOf(0.5f) }
    var baseTy by remember { mutableStateOf(0.5f) }
    var refTilt by remember { mutableStateOf(0f) }
    var refPan by remember { mutableStateOf(0f) }
    LaunchedEffect(aiResult?.frame) {
        aiResult?.frame?.let { f ->
            baseTx = (f.x + f.w / 2f).coerceIn(0.06f, 0.94f)
            baseTy = (f.y + f.h / 2f).coerceIn(0.06f, 0.94f)
            val r = aimRot.value
            refTilt = r[0]; refPan = r[1]
        }
    }

    // Auto-capture with a hard deadline: shoot as soon as the AI says the frame is ready and the
    // phone is steady, but NEVER wait longer than ~9s after turning AI on (or after the last shot)
    // — so from tapping ИИ to a photo is at most ~10s even if the AI never flags "ready".
    val steadyState = rememberUpdatedState(isSteady)
    val capturingState = rememberUpdatedState(capturing)
    val busyState = rememberUpdatedState(capturing || enhancing || videoMode)
    val readyState = rememberUpdatedState(aiOn && aiResult?.ready == true && aiResult?.frame != null && !videoMode)
    LaunchedEffect(aiOn) {
        if (!aiOn) return@LaunchedEffect
        var deadline = System.currentTimeMillis() + 9000L
        while (isActive && aiOn) {
            val now = System.currentTimeMillis()
            if (!busyState.value) {
                val readyNow = readyState.value && steadyState.value && now - autoCoolDown > 2500L
                if (readyNow || now >= deadline) {
                    autoCoolDown = now
                    deadline = now + 9000L
                    shoot(false)
                }
            } else if (now >= deadline) {
                // stay armed but push the deadline while we're busy processing the previous shot
                deadline = now + 3000L
            }
            delay(150)
        }
    }

    BoxWithConstraints(Modifier.fillMaxSize().background(Color(0xFF06080D))) {
        // Camera host (GL preferred, PreviewView fallback)
        if (glView != null) {
            AndroidView(factory = { glView }, modifier = Modifier.fillMaxSize())
        } else {
            AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize())
        }

        // pinch-zoom + tap-to-focus capture layer
        Box(
            Modifier.fillMaxSize()
                .pointerInput(Unit) {
                    detectTransformGestures { _, _, zoomChange, _ ->
                        val nz = (zoom * zoomChange).coerceIn(controller.minZoom, controller.maxZoom)
                        zoom = nz; controller.setZoomAbsolute(nz)
                    }
                }
                .pointerInput(Unit) {
                    detectTapGestures { offset ->
                        focusAt = offset; focusKey++
                        runCatching {
                            controller.focusAt(previewView.meteringPointFactory.createPoint(offset.x, offset.y))
                        }
                    }
                },
        )

        // Tap-to-focus ring animation.
        focusAt?.let { pt -> FocusRing(pt, focusKey) }

        // Auto-horizon level — a thin line that snaps green when the shot is level.
        HorizonLevel(roll, Modifier.align(Alignment.Center))

        // Optional rule-of-thirds grid (only when the user enables it).
        if (showGrid) ThirdsGrid()
        // AI aim & framing overlay.
        if (aiOn) aiResult?.frame?.let { AiAimOverlay(aimRot, baseTx, baseTy, refTilt, refPan) }

        // Top status
        Row(
            Modifier.fillMaxWidth().padding(top = 44.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,
        ) {
            GlassIconButton(if (flashOn) Icons.Rounded.FlashOn else Icons.Rounded.FlashOff, "Вспышка", size = 44.dp,
                onClick = { controller.cycleFlash(); flashOn = controller.flashOn })
            Box(Modifier.padding(horizontal = 10.dp)) {
                if (aiOn && analyzing) AiHintPill("ИИ анализирует…")
            }
            Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                GlassIconButton(Icons.Rounded.Cameraswitch, "Сменить камеру", size = 44.dp, onClick = { controller.toggleLens() })
                GlassIconButton(Icons.Rounded.Grid3x3, "Сетка", size = 44.dp, onClick = { showGrid = !showGrid })
                GlassIconButton(Icons.Rounded.Title, "Водяной знак «GlassCam»", size = 44.dp,
                    tint = if (watermark) Color(0xFF9CD8FF) else Glass.tint, onClick = { watermark = !watermark })
            }
        }

        // Top AI card
        if (aiOn && aiResult != null) {
            AiComposeCard(aiResult!!, Modifier.align(Alignment.TopCenter).padding(top = 100.dp, start = 12.dp, end = 12.dp))
        }
        aiError?.let {
            if (aiResult == null) Box(
                Modifier.align(Alignment.TopCenter).padding(top = 100.dp).liquidGlass(Glass.shapeCapsule).padding(horizontal = 16.dp, vertical = 10.dp),
            ) { Text(it, color = Glass.tint, fontSize = 13.sp) }
        }

        // Bottom glass dock — GL renders real refraction behind it (fallback: translucent glass)
        val dockBg = if (glView == null) Modifier.liquidGlass(RoundedCornerShape(32.dp)) else Modifier
        Column(
            Modifier.align(Alignment.BottomCenter).fillMaxWidth().padding(horizontal = 10.dp, vertical = 20.dp)
                .onGloballyPositioned { dockRect = it.boundsInRoot() }
                .then(dockBg)
                .padding(top = 12.dp, bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            if (!videoMode) {
                val nearest = zoomStops.minByOrNull { abs(it - zoom) }
                Row(horizontalArrangement = Arrangement.spacedBy(2.dp), verticalAlignment = Alignment.CenterVertically) {
                    zoomStops.forEach { z ->
                        val sel = z == nearest && abs(z - zoom) < 0.25f
                        val lbl = if (z < 1f) ".5" else "${z.toInt()}"
                        Box(
                            Modifier.clip(RoundedCornerShape(percent = 50))
                                .background(if (sel) Color.White.copy(alpha = 0.92f) else Color.Transparent)
                                .clickable { scope.launch { animate(zoom, z, animationSpec = tween(300)) { v, _ -> zoom = v; controller.setZoomAbsolute(v) } } }
                                .padding(horizontal = 12.dp, vertical = 6.dp),
                        ) {
                            Text(if (sel) "$lbl×" else lbl, color = if (sel) Color(0xFF06121F) else Glass.tint,
                                fontSize = 13.sp, fontWeight = if (sel) FontWeight.Bold else FontWeight.Normal)
                        }
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                SegChip("Фото", !videoMode) { if (!recording) videoMode = false }
                SegChip("Видео", videoMode) { videoMode = true }
            }
            Row(
                Modifier.fillMaxWidth().padding(horizontal = 28.dp),
                horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically,
            ) {
                Thumbnail(lastShot) { lastShot?.let { openInGallery(context, it) } }
                if (videoMode) {
                    RecordButton(recording) {
                        if (recording) controller.stopRecording()
                        else controller.startRecording { rec -> recording = rec; if (!rec) { toast = "Видео сохранено"; lastShot = queryLatest(context) } }
                    }
                } else {
                    AnimatedShutter(aiOn = aiOn, busy = capturing || enhancing, onClick = { shoot(false) })
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    if (videoMode) {
                        GlassIconButton(Icons.Rounded.Settings, "Настройки видео", size = 50.dp, onClick = { showVideoSettings = true })
                    } else {
                        val aiPulse = rememberInfiniteTransition(label = "aiPulse")
                        val glow by aiPulse.animateFloat(
                            0.85f, 1.12f,
                            infiniteRepeatable(tween(1100, easing = LinearEasing), RepeatMode.Reverse), label = "glow",
                        )
                        Box(contentAlignment = Alignment.Center) {
                            if (aiOn) Canvas(Modifier.size(58.dp)) {
                                drawCircle(
                                    Brush.sweepGradient(shutterColors),
                                    radius = size.minDimension / 2f * glow, style = Stroke(3f),
                                )
                            }
                            GlassIconButton(if (aiOn) Icons.Rounded.Close else Icons.Rounded.AutoAwesome, "ИИ-режим", size = 50.dp,
                                tint = if (aiOn) Glass.tint else Color(0xFF9CD8FF), onClick = { aiOn = !aiOn })
                        }
                    }
                    Text(if (videoMode) "Видео" else if (aiOn) "Выйти" else "ИИ", color = Glass.tint.copy(alpha = 0.85f),
                        fontSize = 11.sp, modifier = Modifier.padding(top = 4.dp))
                }
            }
        }

        // "Обрабатываю…" pill while the AI grade + effects render in the background.
        AnimatedVisibility(
            enhancing, enter = fadeIn() + scaleIn(initialScale = 0.9f), exit = fadeOut() + scaleOut(targetScale = 0.9f),
            modifier = Modifier.align(Alignment.TopCenter).padding(top = 150.dp),
        ) {
            Row(
                Modifier.liquidGlass(Glass.shapeCapsule, alphaTop = 0.28f, alphaBottom = 0.10f)
                    .padding(horizontal = 16.dp, vertical = 9.dp),
                verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                CircularProgressIndicator(color = Color(0xFF9CD8FF), strokeWidth = 2.dp, modifier = Modifier.size(15.dp))
                Text("Обрабатываю кадр…", color = Glass.tint, fontSize = 13.sp, fontWeight = FontWeight.Medium)
            }
        }

        toast?.let {
            Box(Modifier.align(Alignment.Center).liquidGlass(Glass.shapeCapsule).padding(horizontal = 18.dp, vertical = 10.dp)) {
                Text(it, color = Glass.tint)
            }
        }

        // Shutter flash — a quick white wash on capture, like a real camera.
        val flashAlpha = remember { Animatable(0f) }
        LaunchedEffect(flashKey) {
            if (flashKey > 0) { flashAlpha.snapTo(0.7f); flashAlpha.animateTo(0f, tween(340)) }
        }
        if (flashAlpha.value > 0.001f) {
            Box(Modifier.fillMaxSize().background(Color.White.copy(alpha = flashAlpha.value)))
        }

        AnimatedVisibility(showVideoSettings, enter = fadeIn(), exit = fadeOut(), modifier = Modifier.align(Alignment.Center)) {
            VideoSettings(videoCfg, onChange = { videoCfg = it }, onClose = { showVideoSettings = false })
        }

        // Real Liquid-Glass refraction of the live camera (API 33+): refract behind the dock and
        // along the screen edges, straight on the PreviewView. Feeds the measured dock rect (px).
        val rootW = constraints.maxWidth.toFloat()
        val rootH = constraints.maxHeight.toFloat()
        LaunchedEffect(dockRect, rootW, rootH) {
            if (glView == null && rootW > 0f && rootH > 0f && LiquidGlassRefraction.supported) {
                val d = dockRect
                val dock = if (d != null) floatArrayOf(d.left, d.top, d.width, d.height)
                    else floatArrayOf(0f, 0f, 0f, 0f)
                LiquidGlassRefraction.apply(previewView, rootW, rootH, dock)
            } else if (glView != null) {
                val r = dockRect
                if (r != null && rootW > 0f && rootH > 0f) {
                    val x = r.left / rootW; val wN = r.width / rootW
                    val yTop = r.top / rootH; val hN = r.height / rootH
                    glView.setPanels(floatArrayOf(x, 1f - (yTop + hN), wN, hN), floatArrayOf(0.06f))
                }
            }
        }
    }
}

/** Big primary shutter with a press-scale bounce and a rotating iridescent ring in AI mode. */
@Composable
private fun AnimatedShutter(aiOn: Boolean, busy: Boolean, onClick: () -> Unit) {
    val interaction = remember { MutableInteractionSource() }
    val pressed by interaction.collectIsPressedAsState()
    val scale by animateFloatAsState(if (pressed) 0.86f else 1f, tween(130), label = "shScale")
    val t = rememberInfiniteTransition(label = "shutterRing")
    val spin by t.animateFloat(0f, 360f, infiniteRepeatable(tween(4200, easing = LinearEasing)), label = "spin")
    Box(contentAlignment = Alignment.Center) {
        if (aiOn) Canvas(Modifier.size(96.dp)) {
            rotate(spin) {
                drawCircle(Brush.sweepGradient(shutterColors), radius = size.minDimension / 2f - 3f, style = Stroke(4f))
            }
        }
        Box(
            Modifier.size(78.dp).graphicsLayer { scaleX = scale; scaleY = scale }
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.14f), CircleShape)
                .border(BorderStroke(2.dp, Glass.rim), CircleShape)
                .clickable(interactionSource = interaction, indication = null, onClick = onClick),
            contentAlignment = Alignment.Center,
        ) {
            Box(Modifier.size(56.dp).clip(CircleShape).background(Color.White.copy(alpha = 0.92f), CircleShape))
        }
        if (busy) CircularProgressIndicator(color = Color.White, strokeWidth = 3.dp, modifier = Modifier.size(90.dp))
    }
}

/** Tap-to-focus reticle: a ring that snaps in and fades where you tapped. */
@Composable
private fun FocusRing(pt: Offset, key: Int) {
    val anim = remember { Animatable(0f) }
    LaunchedEffect(key) { anim.snapTo(0f); anim.animateTo(1f, tween(750)) }
    if (anim.value >= 1f) return
    val p = anim.value
    val r = (52f - 20f * p)
    val col = Color(0xFF9CD8FF).copy(alpha = (1f - p).coerceIn(0f, 1f))
    Canvas(Modifier.fillMaxSize()) {
        drawCircle(col, radius = r, center = pt, style = Stroke(2.5f))
        drawLine(col, Offset(pt.x - r - 6, pt.y), Offset(pt.x - r + 5, pt.y), 2f)
        drawLine(col, Offset(pt.x + r - 5, pt.y), Offset(pt.x + r + 6, pt.y), 2f)
        drawLine(col, Offset(pt.x, pt.y - r - 6), Offset(pt.x, pt.y - r + 5), 2f)
        drawLine(col, Offset(pt.x, pt.y + r - 5), Offset(pt.x, pt.y + r + 6), 2f)
    }
}

/** Auto-horizon indicator: a split line that rotates with the phone and turns green when level. */
@Composable
private fun HorizonLevel(roll: Float, modifier: Modifier = Modifier) {
    val level = kotlin.math.abs(roll) < 1.2f
    val col = if (level) Color(0xFF6BFF9E) else Color.White.copy(alpha = 0.7f)
    Canvas(modifier.size(170.dp)) {
        val cx = size.width / 2f; val cy = size.height / 2f
        val half = size.width * 0.42f
        drawCircle(Color.White.copy(alpha = 0.55f), radius = 3f, center = Offset(cx, cy))
        rotate(roll, pivot = Offset(cx, cy)) {
            drawLine(col, Offset(cx - half, cy), Offset(cx - 26f, cy), 3f, cap = StrokeCap.Round)
            drawLine(col, Offset(cx + 26f, cy), Offset(cx + half, cy), 3f, cap = StrokeCap.Round)
        }
    }
}

@Composable
private fun Thumbnail(uri: Uri?, onClick: () -> Unit) {
    // Pop the thumbnail whenever a new shot lands.
    val pop = remember { Animatable(1f) }
    LaunchedEffect(uri) { if (uri != null) { pop.snapTo(0.7f); pop.animateTo(1f, tween(320)) } }
    Box(
        Modifier.size(50.dp).graphicsLayer { scaleX = pop.value; scaleY = pop.value }
            .clip(RoundedCornerShape(14.dp)).background(Color.White.copy(alpha = 0.06f))
            .border(BorderStroke(1.dp, Glass.rim), RoundedCornerShape(14.dp))
            .clickable(onClick = onClick),
    ) {
        if (uri != null) AsyncImage(uri, null, contentScale = androidx.compose.ui.layout.ContentScale.Crop, modifier = Modifier.fillMaxSize())
    }
}

@Composable
private fun RecordButton(recording: Boolean, onClick: () -> Unit) {
    Box(
        Modifier.size(78.dp).clip(RoundedCornerShape(percent = 50))
            .background(Color.White.copy(alpha = 0.14f))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Box(
            Modifier.size(if (recording) 30.dp else 60.dp)
                .clip(RoundedCornerShape(if (recording) 8.dp else 40.dp))
                .background(Color(0xFFFF3B30)),
        )
    }
}

@Composable
private fun SegChip(label: String, sel: Boolean, onClick: () -> Unit) {
    Box(
        Modifier.clip(RoundedCornerShape(percent = 50))
            .background(if (sel) Color.White.copy(alpha = 0.16f) else Color.Transparent)
            .clickable(onClick = onClick).padding(horizontal = 20.dp, vertical = 8.dp),
    ) {
        Text(label, color = if (sel) Color.White else Glass.tint.copy(alpha = 0.6f), fontSize = 14.sp,
            fontWeight = if (sel) FontWeight.SemiBold else FontWeight.Normal)
    }
}

@Composable
private fun VideoSettings(cfg: VideoConfig, onChange: (VideoConfig) -> Unit, onClose: () -> Unit) {
    Box(Modifier.fillMaxWidth().padding(24.dp).liquidGlass(Glass.shapeCard).padding(20.dp)) {
        Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text("Настройки видео", color = Glass.tint, fontWeight = FontWeight.SemiBold, fontSize = 17.sp)
                Icon(Icons.Rounded.Close, "Закрыть", tint = Glass.tint, modifier = Modifier.size(22.dp).clickable(onClick = onClose))
            }
            Text("Качество", color = Glass.tint.copy(alpha = 0.6f), fontSize = 12.sp)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                listOf("4K" to Quality.UHD, "1080p" to Quality.FHD, "720p" to Quality.HD).forEach { (l, q) ->
                    Chip(l, cfg.quality == q) { onChange(cfg.copy(quality = q)) }
                }
            }
            Text("Кадров/сек", color = Glass.tint.copy(alpha = 0.6f), fontSize = 12.sp)
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                listOf(30, 60, 120).forEach { f -> Chip("$f", cfg.fps == f) { onChange(cfg.copy(fps = f)) } }
            }
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
                Text("Стабилизация", color = Glass.tint, fontSize = 15.sp)
                Chip(if (cfg.stabilize) "Вкл" else "Выкл", cfg.stabilize) { onChange(cfg.copy(stabilize = !cfg.stabilize)) }
            }
            Text("120 fps и 4К зависят от устройства", color = Glass.tint.copy(alpha = 0.45f), fontSize = 11.sp)
        }
    }
}

@Composable
private fun Chip(label: String, sel: Boolean, onClick: () -> Unit) {
    Box(
        Modifier.liquidGlass(Glass.shapeCapsule, alphaTop = if (sel) 0.42f else 0.14f, alphaBottom = if (sel) 0.2f else 0.04f)
            .clickable(onClick = onClick).padding(horizontal = 16.dp, vertical = 8.dp),
    ) { Text(label, color = Glass.tint, fontSize = 13.sp, fontWeight = if (sel) FontWeight.SemiBold else FontWeight.Normal) }
}

private fun openInGallery(context: android.content.Context, uri: Uri) {
    runCatching {
        context.startActivity(Intent(Intent.ACTION_VIEW, uri).apply {
            setDataAndType(uri, "image/*"); addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        })
    }
}

private fun queryLatest(context: android.content.Context): Uri? {
    val collection = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
    context.contentResolver.query(
        collection, arrayOf(MediaStore.Images.Media._ID),
        "${MediaStore.Images.Media.DISPLAY_NAME} LIKE ?", arrayOf("GlassCam_%"),
        "${MediaStore.Images.Media.DATE_ADDED} DESC",
    )?.use { c ->
        val idCol = c.getColumnIndexOrThrow(MediaStore.Images.Media._ID)
        if (c.moveToFirst()) return ContentUris.withAppendedId(collection, c.getLong(idCol))
    }
    return null
}
