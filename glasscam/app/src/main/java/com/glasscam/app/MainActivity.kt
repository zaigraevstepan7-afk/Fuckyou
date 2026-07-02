package com.glasscam.app

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import com.glasscam.app.camera.CameraScreen
import com.glasscam.app.gallery.GalleryScreen
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassCard
import com.glasscam.app.glass.liquidGlass
import com.glasscam.app.ui.GlassCamTheme

private enum class Screen { Camera, Gallery }

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent { GlassCamTheme { App() } }
    }
}

@Composable
private fun App() {
    val context = LocalContext.current
    var hasCamera by remember {
        mutableStateOf(
            ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA) ==
                PackageManager.PERMISSION_GRANTED,
        )
    }
    var screen by remember { mutableStateOf(Screen.Camera) }

    val launcher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission(),
    ) { granted -> hasCamera = granted }

    Box(Modifier.fillMaxSize().background(Color(0xFF0B0E14))) {
        when {
            !hasCamera -> PermissionGate(onGrant = { launcher.launch(Manifest.permission.CAMERA) })
            screen == Screen.Camera -> CameraScreen(onOpenGallery = { screen = Screen.Gallery })
            else -> GalleryScreen(onBack = { screen = Screen.Camera })
        }
    }
}

@Composable
private fun PermissionGate(onGrant: () -> Unit) {
    Box(Modifier.fillMaxSize().padding(28.dp), contentAlignment = Alignment.Center) {
        GlassCard {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    "Нужен доступ к камере",
                    color = Glass.tint,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                )
                Text(
                    "Чтобы снимать фото и использовать ИИ-анализ кадра, разрешите доступ к камере.",
                    color = Glass.tint.copy(alpha = 0.8f),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp),
                )
                Box(
                    Modifier
                        .padding(top = 18.dp)
                        .liquidGlass(Glass.shapeCapsule, alphaTop = 0.4f, alphaBottom = 0.18f)
                        .padding(horizontal = 26.dp, vertical = 12.dp)
                        .background(Color.Transparent),
                ) {
                    Text(
                        "Разрешить",
                        color = Glass.tint,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.clickableText(onGrant),
                    )
                }
            }
        }
    }
}

private fun Modifier.clickableText(onClick: () -> Unit): Modifier =
    this.clickable(onClick = onClick)
