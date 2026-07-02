package com.glasscam.app.camera

import androidx.camera.view.PreviewView
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.glasscam.app.ai.AiState
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
    var zoom by remember { mutableStateOf(1f) }
    var aiOn by remember { mutableStateOf(false) }
    var aiResult by remember { mutableStateOf<ComposeResult?>(null) }
    var aiError by remember { mutableStateOf<String?>(null) }
    var analyzing by remember { mutableStateOf(false) }
    var toast by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) { controller.bind(lifecycleOwner, previewView) }
    LaunchedEffect(toast) { if (toast != null) { delay(1800); toast = null } }

    // Continuous AI-compose loop: grab the latest preview frame and ask Gemini.
    LaunchedEffect(aiOn) {
        if (!aiOn) { aiResult = null; aiError = null; analyzing = false; return@LaunchedEffect }
        if (!GeminiService.hasKey()) {
            aiError = "Не задан ключ Gemini (local.properties → GEMINI_API_KEY)"
            return@LaunchedEffect
        }
        while (isActive && aiOn) {
            val frame = controller.latestFrame()
            if (frame != null) {
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

    Column(Modifier.fillMaxSize().background(Color.Black).padding(bottom = 84.dp)) {
        // Status bar row
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
            if (aiOn) {
                Box(Modifier.weight(1f).padding(horizontal = 10.dp), contentAlignment = Alignment.Center) {
                    AiHintPill(aiResult?.hint ?: if (analyzing) "ИИ анализирует кадр…" else "Наведите камеру")
                }
            } else {
                Box(Modifier.weight(1f))
            }
            GlassIconButton(Icons.Rounded.Grid3x3, "Сетка", size = 44.dp, onClick = { showGrid = !showGrid })
        }

        // Preview card with overlays
        Box(Modifier.weight(1f).fillMaxWidth().padding(horizontal = 8.dp), contentAlignment = Alignment.Center) {
            Box(
                Modifier
                    .fillMaxWidth()
                    .aspectRatio(3f / 4f)
                    .clip(RoundedCornerShape(26.dp)),
            ) {
                AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize())

                if (aiOn || showGrid) ThirdsGrid()
                if (aiOn) aiResult?.frame?.let { RecommendedFrame(it) }

                // Top AI card
                if (aiOn && aiResult != null) {
                    AiComposeCard(aiResult!!, Modifier.align(Alignment.TopCenter).padding(12.dp))
                }
                aiError?.let {
                    Box(
                        Modifier.align(Alignment.TopCenter).padding(12.dp)
                            .liquidGlass(Glass.shapeCapsule).padding(horizontal = 16.dp, vertical = 10.dp),
                    ) { Text(it, color = Glass.tint, fontSize = 13.sp) }
                }

                // Zoom selector
                ZoomBar(
                    zoom = zoom,
                    onSelect = { z -> zoom = z; controller.setZoom(z) },
                    modifier = Modifier.align(Alignment.BottomCenter).padding(bottom = 16.dp),
                )

                toast?.let {
                    Box(
                        Modifier.align(Alignment.Center)
                            .liquidGlass(Glass.shapeCapsule).padding(horizontal = 18.dp, vertical = 10.dp),
                    ) { Text(it, color = Glass.tint) }
                }
            }
        }

        // Filter carousel
        FilterRow(
            selected = selectedFilter,
            onSelect = { selectedFilter = it },
            modifier = Modifier.padding(vertical = 10.dp),
        )

        // Bottom controls
        Row(
            Modifier.fillMaxWidth().padding(start = 24.dp, end = 24.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            GlassIconButton(Icons.Rounded.Cameraswitch, "Сменить камеру", size = 50.dp,
                onClick = { controller.toggleLens(lifecycleOwner, previewView) })

            GlassShutter(onClick = {
                scope.launch {
                    toast = try {
                        controller.capturePhoto(selectedFilter); "Снимок сохранён"
                    } catch (e: Exception) {
                        e.message ?: "Ошибка съёмки"
                    }
                }
            })

            // Enter / exit AI compose
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                GlassIconButton(
                    icon = if (aiOn) Icons.Rounded.Close else Icons.Rounded.AutoAwesome,
                    contentDescription = "ИИ-компоновка", size = 50.dp,
                    tint = if (aiOn) Glass.tint else Color(0xFF9CD8FF),
                    onClick = { aiOn = !aiOn },
                )
                Text(
                    if (aiOn) "Выйти" else "ИИ-режим",
                    color = Glass.tint.copy(alpha = 0.85f), fontSize = 11.sp,
                    modifier = Modifier.padding(top = 4.dp),
                )
            }
        }
    }
}

@Composable
private fun ZoomBar(zoom: Float, onSelect: (Float) -> Unit, modifier: Modifier = Modifier) {
    Row(
        modifier
            .liquidGlass(Glass.shapeCapsule, alphaTop = 0.24f, alphaBottom = 0.10f)
            .padding(horizontal = 8.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        zoomStops.forEach { z ->
            val sel = z == zoom
            val label = if (z < 1f) ".5x" else "${z.toInt()}x"
            Box(
                Modifier
                    .clip(RoundedCornerShape(percent = 50))
                    .background(if (sel) Color.White.copy(alpha = 0.9f) else Color.Transparent)
                    .clickable { onSelect(z) }
                    .padding(horizontal = 12.dp, vertical = 7.dp),
            ) {
                Text(
                    label,
                    color = if (sel) Color(0xFF06121F) else Glass.tint,
                    fontSize = 13.sp,
                    fontWeight = if (sel) FontWeight.Bold else FontWeight.Normal,
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
                        alphaTop = if (isSel) 0.42f else 0.18f,
                        alphaBottom = if (isSel) 0.20f else 0.06f,
                    )
                    .border(
                        width = if (isSel) 1.5.dp else 0.dp,
                        brush = Glass.rim,
                        shape = RoundedCornerShape(percent = 50),
                    )
                    .clickable { onSelect(preset) }
                    .padding(horizontal = 16.dp, vertical = 9.dp),
            ) {
                Text(
                    preset.label, color = Glass.tint, fontSize = 13.sp,
                    fontWeight = if (isSel) FontWeight.SemiBold else FontWeight.Normal,
                )
            }
        }
    }
}
