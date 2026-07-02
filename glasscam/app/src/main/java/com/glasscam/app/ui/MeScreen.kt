package com.glasscam.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.glasscam.app.BuildConfig
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassCard

@Composable
fun MeScreen() {
    Column(
        Modifier.fillMaxSize().background(Color(0xFF0B0E14)).padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Row(
            Modifier.fillMaxWidth().padding(top = 48.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(Icons.Rounded.AutoAwesome, null, tint = Color(0xFF9CD8FF), modifier = Modifier.size(28.dp))
            Text("  GlassCam", color = Glass.tint, fontSize = 26.sp, fontWeight = FontWeight.Bold)
        }

        GlassCard(Modifier.fillMaxWidth()) {
            Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
                Info("ИИ-модель", BuildConfig.GEMINI_MODEL)
                Info("ИИ-ключ", if (BuildConfig.GEMINI_API_KEY.isNotBlank()) "подключён" else "не задан")
                Info("Версия", BuildConfig.VERSION_NAME)
            }
        }

        GlassCard(Modifier.fillMaxWidth()) {
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text("Как пользоваться", color = Glass.tint, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                Text(
                    "Нажмите «ИИ-режим» на экране камеры — приложение само проанализирует сцену, " +
                        "подскажет компоновку, покажет рекомендованную рамку и подберёт плёночный фильтр. " +
                        "Останется навести по подсказке и нажать спуск.",
                    color = Glass.tint.copy(alpha = 0.8f), fontSize = 14.sp,
                )
            }
        }
    }
}

@Composable
private fun Info(label: String, value: String) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Text(label, color = Glass.tint.copy(alpha = 0.6f), fontSize = 14.sp)
        Text(value, color = Glass.tint, fontSize = 14.sp, fontWeight = FontWeight.Medium)
    }
}
