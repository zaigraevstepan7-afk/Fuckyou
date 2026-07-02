package com.glasscam.app.camera

import android.content.ContentUris
import android.net.Uri
import android.provider.MediaStore
import androidx.camera.view.PreviewView
import androidx.compose.animation.core.animate
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.Cameraswitch
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.FlashOff
import androidx.compose.material.icons.rounded.FlashOn
import androidx.compose.material.icons.rounded.Grid3x3
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.LocalLifecycleOwner
import coil.compose.AsyncImage
import com.glasscam.app.ai.ComposeResult
import com.glasscam.app.ai.GeminiService
import com.glasscam.app.filters.FilterPreset
import com.glasscam.app.filters.FilterPresets
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassIconButton
import com.glasscam.app.glass.GlassShutter
import com.glasscam.app.glass.liquidGlass
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlin.math.abs

private val zoomStops = listOf(0.5f, 1f, 2f, 4f, 8f)

@Composable
fun CameraScreen() {
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current
    val scope = rememberCoroutineScope()

    val controller = remember { CameraController(context.applicationContext) }
    val previewView = remember {
        PreviewView(context).apply {
            scaleType = PreviewView.ScaleType.FILL_CENTER
            implementationMode = PreviewView.ImplementationMode.COMPATIBLE
        }
    }

    var selectedFilter by remember { mutableStateOf(FilterPresets.none) }
    var flashOn by remember { mutableStateOf(false) }
    var showGrid by remember { mutableStateOf(false) }
    var aiEnhance by remember { mutableStateOf(false) }
    var zoom by remember { mutableStateOf(1f) }
    var aiOn by remember { mutableStateOf(false) }
    var aiResult by remember { mutableStateOf<ComposeResult?>(null) }
    var aiError by remember { mutableStateOf<String?>(null) }
    var analyzing by remember { mutableStateOf(false) }
    var toast by remember { mutableStateOf<String?>(null) }
    var lastShot by remember { mutableStateOf<Uri?>(null) }

    LaunchedEffect(Unit) { controller.bind(lifecycleOwner, previewView); lastShot = queryLatest(context) }
    LaunchedEffect(toast) { if (toast != null) { delay(1800); toast = null } }

    // Continuous AI-compose loop.
    LaunchedEffect(aiOn) {
        if (!aiOn) { aiResult = null; aiError = null; analyzing = false; return@LaunchedEffect }
        if (!GeminiService.hasKey()) { aiError = "Не задан ключ Gemini (local.properties)"; return@LaunchedEffect }
        while (isActive && aiOn) {
            controller.latestFrame()?.let { frame ->
                analyzing = true
                GeminiService.analyzeCompose(frame).fold(
                    onSuccess = {
                        aiResult = it; aiError = null
                        if (it.filterId != "none") selectedFilter = FilterPresets.byId(it.filterId)
                    },
                    onFailure = { aiError = it.message ?: "Не удалось получить ответ ИИ" },
                )
                analyzing = false
            }
            delay(6000)
        }
    }

    fun animateZoomTo(target: Float) = scope.launch {
        animate(zoom, target, animationSpec = tween(300)) { v, _ -> zoom = v; controller.setZoomAbsolute(v) }
    }

    fun shoot() = scope.launch {
        try {
            val jpeg = controller.captureJpeg()
            var matrix: FloatArray? = null
            if (aiEnhance && GeminiService.hasKey()) {
                toast = "ИИ улучшает снимок…"
                val small = controller.latestFrame() ?: jpeg
                matrix = GeminiService.suggestEnhancement(small).getOrNull()?.toMatrix()
            }
            controller.processAndSave(jpeg, selectedFilter, matrix)
            lastShot = queryLatest(context)
            toast = "Снимок сохранён"
        } catch (e: Exception) {
            toast = e.message ?: "Ошибка съёмки"
        }
    }

    Column(Modifier.fillMaxSize().background(Color(0xFF06080D)).padding(bottom = 84.dp)) {
        // Status row
        Row(
            Modifier.fillMaxWidth().padding(top = 44.dp, start = 16.dp, end = 16.dp, bottom = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            GlassIconButton(
                icon = if (flashOn) Icons.Rounded.FlashOn else Icons.Rounded.FlashOff,
                contentDescription = "Вспышка", size = 44.dp,
                onClick = { controller.cycleFlash(lifecycleOwner, previewView); flashOn = controller.flashOn },
            )
            Box(Modifier.weight(1f).padding(horizontal = 10.dp), contentAlignment = Alignment.Center) {
                if (aiOn) AiHintPill(aiResult?.hint ?: if (analyzing) "ИИ анализирует кадр…" else "Наведите камеру")
            }
            GlassIconButton(Icons.Rounded.Grid3x3, "Сетка", size = 44.dp, onClick = { showGrid = !showGrid })
        }

        // Preview card
        Box(Modifier.weight(1f).fillMaxWidth().padding(horizontal = 8.dp), contentAlignment = Alignment.Center) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .aspectRatio(3f / 4f)
                    .clip(RoundedCornerShape(28.dp))
                    .pointerInput(Unit) {
                        detectTransformGestures { _, _, zoomChange, _ ->
                            val nz = (zoom * zoomChange).coerceIn(controller.minZoom, controller.maxZoom)
                            zoom = nz; controller.setZoomAbsolute(nz)
                        }
                    },
            ) {
                AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize())

                // subtle top/bottom vignette for depth
                Box(
                    Modifier.fillMaxSize().background(
                        Brush.verticalGradient(
                            0f to Color.Black.copy(alpha = 0.28f),
                            0.22f to Color.Transparent,
                            0.78f to Color.Transparent,
                            1f to Color.Black.copy(alpha = 0.30f),
                        ),
                    ),
                )

                if (aiOn || showGrid) ThirdsGrid()
                if (aiOn) aiResult?.frame?.let { RecommendedFrame(it); AimReticle(it) }
                if (aiOn && aiResult != null) AiComposeCard(aiResult!!, Modifier.align(Alignment.TopCenter).padding(12.dp))
                aiError?.let {
                    Box(
                        Modifier.align(Alignment.TopCenter).padding(12.dp)
                            .liquidGlass(Glass.shapeCapsule).padding(horizontal = 16.dp, vertical = 10.dp),
                    ) { Text(it, color = Glass.tint, fontSize = 13.sp) }
                }

                ZoomBar(zoom = zoom, onSelect = { animateZoomTo(it) }, modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 16.dp))

                toast?.let {
                    Box(
                        Modifier.align(Alignment.Center)
                            .liquidGlass(Glass.shapeCapsule).padding(horizontal = 18.dp, vertical = 10.dp),
                    ) { Text(it, color = Glass.tint) }
                }
            }
        }

        // AI-enhance toggle + filter carousel
        Row(
            Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            ToggleChip("ИИ-фото", aiEnhance) { aiEnhance = !aiEnhance }
        }
        FilterRow(selected = selectedFilter, onSelect = { selectedFilter = it }, modifier = Modifier.padding(vertical = 10.dp))

        // Bottom controls
        Row(
            Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp, bottom = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Thumbnail(lastShot)
            GlassShutter(onClick = { shoot() })
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                GlassIconButton(
                    icon = if (aiOn) Icons.Rounded.Close else Icons.Rounded.AutoAwesome,
                    contentDescription = "ИИ-компоновка", size = 50.dp,
                    tint = if (aiOn) Glass.tint else Color(0xFF9CD8FF),
                    onClick = { aiOn = !aiOn },
                )
                Text(if (aiOn) "Выйти" else "ИИ-режим", color = Glass.tint.copy(alpha = 0.85f), fontSize = 11.sp, modifier = Modifier.padding(top = 4.dp))
            }
        }
    }
}

@Composable
private fun Thumbnail(uri: Uri?) {
    Box(Modifier.size(50.dp).clip(RoundedCornerShape(14.dp)).background(Color.White.copy(alpha = 0.06f))) {
        if (uri != null) {
            AsyncImage(uri, null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
private fun ToggleChip(label: String, on: Boolean, onToggle: () -> Unit) {
    Row(
        Modifier
            .liquidGlass(Glass.shapeCapsule, alphaTop = if (on) 0.42f else 0.16f, alphaBottom = if (on) 0.20f else 0.05f)
            .clickable(onClick = onToggle)
            .padding(horizontal = 14.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(Icons.Rounded.AutoAwesome, null, tint = if (on) Color(0xFF9CD8FF) else Glass.tint.copy(alpha = 0.7f), modifier = Modifier.size(16.dp))
        Text("  $label", color = Glass.tint, fontSize = 13.sp, fontWeight = if (on) FontWeight.SemiBold else FontWeight.Normal)
    }
}

@Composable
private fun ZoomBar(zoom: Float, onSelect: (Float) -> Unit, modifier: Modifier = Modifier) {
    val nearest = zoomStops.minByOrNull { abs(it - zoom) }
    Row(
        modifier.liquidGlass(Glass.shapeCapsule, alphaTop = 0.24f, alphaBottom = 0.10f).padding(horizontal = 8.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        zoomStops.forEach { z ->
            val sel = z == nearest && abs(z - zoom) < 0.25f
            val label = if (z < 1f) ".5" else "${z.toInt()}"
            Box(
                Modifier.clip(RoundedCornerShape(percent = 50))
                    .background(if (sel) Color.White.copy(alpha = 0.92f) else Color.Transparent)
                    .clickable { onSelect(z) }
                    .padding(horizontal = 12.dp, vertical = 7.dp),
            ) {
                Text(
                    if (sel) "${label}×" else label,
                    color = if (sel) Color(0xFF06121F) else Glass.tint,
                    fontSize = 13.sp, fontWeight = if (sel) FontWeight.Bold else FontWeight.Normal,
                )
            }
        }
    }
}

@Composable
private fun FilterRow(selected: FilterPreset, onSelect: (FilterPreset) -> Unit, modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        contentPadding = PaddingValues(horizontal = 20.dp),
    ) {
        items(FilterPresets.all) { preset ->
            val isSel = preset.id == selected.id
            Box(
                Modifier
                    .liquidGlass(
                        RoundedCornerShape(percent = 50),
                        alphaTop = if (isSel) 0.42f else 0.16f,
                        alphaBottom = if (isSel) 0.20f else 0.05f,
                    )
                    .border(if (isSel) 1.5.dp else 0.dp, Glass.rim, RoundedCornerShape(percent = 50))
                    .clickable { onSelect(preset) }
                    .padding(horizontal = 16.dp, vertical = 9.dp),
            ) {
                Text(preset.label, color = Glass.tint, fontSize = 13.sp, fontWeight = if (isSel) FontWeight.SemiBold else FontWeight.Normal)
            }
        }
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
