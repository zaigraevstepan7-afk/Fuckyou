package com.glasscam.app.camera

import androidx.camera.view.PreviewView
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.Cameraswitch
import androidx.compose.material.icons.rounded.FlashOff
import androidx.compose.material.icons.rounded.FlashOn
import androidx.compose.material.icons.rounded.PhotoLibrary
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.glasscam.app.ai.AiPanel
import com.glasscam.app.ai.AiState
import com.glasscam.app.ai.GeminiService
import com.glasscam.app.filters.FilterPreset
import com.glasscam.app.filters.FilterPresets
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassCapsuleBar
import com.glasscam.app.glass.GlassIconButton
import com.glasscam.app.glass.GlassShutter
import com.glasscam.app.glass.liquidGlass
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun CameraScreen(onOpenGallery: () -> Unit) {
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
    var aiState by remember { mutableStateOf<AiState>(AiState.Idle) }
    var flashOn by remember { mutableStateOf(false) }
    var toast by remember { mutableStateOf<String?>(null) }

    LaunchedEffect(Unit) { controller.bind(lifecycleOwner, previewView) }
    LaunchedEffect(toast) { if (toast != null) { delay(1800); toast = null } }

    Box(Modifier.fillMaxSize().background(Color.Black)) {
        AndroidView(factory = { previewView }, modifier = Modifier.fillMaxSize())

        Column(Modifier.fillMaxSize().safeDrawingPadding().padding(16.dp)) {
            // Top: flash + flip
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                GlassIconButton(
                    icon = if (flashOn) Icons.Rounded.FlashOn else Icons.Rounded.FlashOff,
                    contentDescription = "Вспышка",
                    onClick = { controller.cycleFlash(lifecycleOwner, previewView); flashOn = controller.flashOn },
                )
                GlassIconButton(
                    icon = Icons.Rounded.Cameraswitch,
                    contentDescription = "Сменить камеру",
                    onClick = { controller.toggleLens(lifecycleOwner, previewView) },
                )
            }

            Box(Modifier.weight(1f).fillMaxWidth()) {
                toast?.let {
                    Box(Modifier.align(Alignment.TopCenter).padding(top = 12.dp)) {
                        Box(Modifier.liquidGlass(Glass.shapeCapsule).padding(horizontal = 18.dp, vertical = 10.dp)) {
                            Text(it, color = Glass.tint)
                        }
                    }
                }
                AiPanel(
                    state = aiState,
                    onApplyFilter = { id -> selectedFilter = FilterPresets.byId(id) },
                    onClose = { aiState = AiState.Idle },
                    modifier = Modifier.align(Alignment.BottomCenter),
                )
            }

            // Filter carousel
            FilterRow(selected = selectedFilter, onSelect = { selectedFilter = it })

            // Bottom controls
            Row(
                Modifier.fillMaxWidth().padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                GlassIconButton(Icons.Rounded.PhotoLibrary, "Галерея", onOpenGallery)
                GlassShutter(onClick = {
                    scope.launch {
                        try {
                            val name = controller.capturePhoto(selectedFilter)
                            toast = "Снимок сохранён"
                        } catch (e: Exception) {
                            toast = e.message ?: "Ошибка съёмки"
                        }
                    }
                })
                GlassIconButton(Icons.Rounded.AutoAwesome, "ИИ-анализ", onClick = {
                    if (!GeminiService.hasKey()) {
                        aiState = AiState.Error("Не задан ключ Gemini (local.properties → GEMINI_API_KEY)")
                        return@GlassIconButton
                    }
                    aiState = AiState.Loading
                    scope.launch {
                        val result = runCatching { controller.captureJpeg() }
                            .mapCatching { GeminiService.analyze(it).getOrThrow() }
                        aiState = result.fold(
                            onSuccess = { AiState.Success(it) },
                            onFailure = { AiState.Error(it.message ?: "Не удалось получить ответ ИИ") },
                        )
                    }
                })
            }
        }
    }
}

@Composable
private fun FilterRow(selected: FilterPreset, onSelect: (FilterPreset) -> Unit) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
        items(FilterPresets.all) { preset ->
            val isSel = preset.id == selected.id
            Box(
                Modifier
                    .wrapContentWidth()
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
                    preset.label,
                    color = Glass.tint,
                    fontSize = 13.sp,
                    fontWeight = if (isSel) FontWeight.SemiBold else FontWeight.Normal,
                )
            }
        }
    }
}
