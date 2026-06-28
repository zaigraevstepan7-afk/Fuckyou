package com.fuckyou.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuckyou.app.data.ModConfig

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    config: ModConfig,
    onBack: () -> Unit,
    onAntiDelete: (Boolean) -> Unit,
    onAntiEdit: (Boolean) -> Unit,
    onGhost: (Boolean) -> Unit,
    onFakeOnline: (Boolean) -> Unit,
    onAccent: (Int) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Настройки мода") },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Назад")
                    }
                },
            )
        },
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState()),
        ) {
            SectionTitle("Приватность сообщений")
            ToggleRow(
                "Анти-удаление",
                "Сохраняет сообщения, которые отправитель удалил",
                config.antiDelete, onAntiDelete,
            )
            ToggleRow(
                "Анти-редактирование",
                "Показывает исходный текст до правки",
                config.antiEdit, onAntiEdit,
            )

            SectionTitle("Невидимость")
            ToggleRow(
                "Призрак (без «прочитано»)",
                "Не отправлять отметки о прочтении и набор текста",
                config.ghostMode, onGhost,
            )
            ToggleRow(
                "Фейковый онлайн",
                "Скрывать реальный статус «в сети»",
                config.fakeOnline, onFakeOnline,
            )

            SectionTitle("Оформление")
            AccentRow(config.accent, onAccent)

            Text(
                "FuckYou 0.1.0 · легальная сборка на TDLib · без рекламы",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(16.dp),
            )
        }
    }
}

@Composable
private fun SectionTitle(text: String) {
    Text(
        text,
        fontSize = 13.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(start = 16.dp, top = 20.dp, bottom = 4.dp),
    )
}

@Composable
private fun ToggleRow(
    title: String,
    subtitle: String,
    checked: Boolean,
    onChange: (Boolean) -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onChange(!checked) }
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(title, fontSize = 16.sp)
            Text(subtitle, fontSize = 13.sp, color = Color.Gray)
        }
        Switch(checked = checked, onCheckedChange = onChange)
    }
    HorizontalDivider()
}

@Composable
private fun AccentRow(selected: Int, onAccent: (Int) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        accentColors.forEachIndexed { index, color ->
            val border = if (index == selected) 3.dp else 0.dp
            Column(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color)
                    .border(border, MaterialTheme.colorScheme.onSurface, CircleShape)
                    .clickable { onAccent(index) },
            ) {}
        }
    }
}
