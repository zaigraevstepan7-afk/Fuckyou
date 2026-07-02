package com.glasscam.app.ai

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.GlassCard

@Composable
fun AiPanel(
    state: AiState,
    onApplyFilter: (String) -> Unit,
    onClose: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (state is AiState.Idle) return
    GlassCard(modifier = modifier.fillMaxWidth()) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(Icons.Rounded.AutoAwesome, null, tint = Glass.tint, modifier = Modifier.size(20.dp))
                    Text(
                        "  Gemini",
                        color = Glass.tint,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                    )
                }
                Icon(
                    Icons.Rounded.Close, "Закрыть", tint = Glass.tint,
                    modifier = Modifier.size(22.dp).clickableNoRipple(onClose),
                )
            }
            when (state) {
                is AiState.Loading -> Row(verticalAlignment = Alignment.CenterVertically) {
                    CircularProgressIndicator(strokeWidth = 2.dp, modifier = Modifier.size(18.dp), color = Glass.tint)
                    Text("  ИИ анализирует кадр…", color = Glass.tint.copy(alpha = 0.9f))
                }

                is AiState.Error -> Text(state.message, color = Glass.tint.copy(alpha = 0.9f))

                is AiState.Success -> {
                    val r = state.result
                    if (r.composition.isNotBlank()) Labeled("Компоновка", r.composition)
                    if (r.mood.isNotBlank()) Labeled("Настроение", r.mood)
                    if (r.filterId != "none") {
                        Labeled("Фильтр", r.filterLabel)
                        TextButton(onClick = { onApplyFilter(r.filterId) }, modifier = Modifier.padding(top = 2.dp)) {
                            Text("Применить фильтр", color = Glass.tint)
                        }
                    }
                }

                else -> {}
            }
        }
    }
}

@Composable
private fun Labeled(label: String, value: String) {
    Column {
        Text(label.uppercase(), color = Glass.tint.copy(alpha = 0.55f), fontSize = 11.sp, fontWeight = FontWeight.Medium)
        Text(value, color = Glass.tint, fontSize = 15.sp)
    }
}

private fun Modifier.clickableNoRipple(onClick: () -> Unit): Modifier =
    this.clickable(onClick = onClick)
