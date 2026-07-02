package com.glasscam.app.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.glasscam.app.glass.Glass
import com.glasscam.app.glass.liquidGlass

enum class Tab(val title: String) { Camera("Камера"), Album("Альбом"), Me("Я") }

@Composable
fun GlassTabBar(selected: Tab, onSelect: (Tab) -> Unit, modifier: Modifier = Modifier) {
    Row(
        modifier
            .liquidGlass(Glass.shapeCapsule, alphaTop = 0.22f, alphaBottom = 0.08f)
            .padding(4.dp),
        horizontalArrangement = Arrangement.spacedBy(2.dp),
    ) {
        Tab.entries.forEach { tab ->
            val sel = tab == selected
            Box(
                Modifier
                    .clip(RoundedCornerShape(percent = 50))
                    .background(if (sel) Color.White.copy(alpha = 0.16f) else Color.Transparent)
                    .clickable { onSelect(tab) }
                    .padding(horizontal = 22.dp, vertical = 10.dp),
            ) {
                Text(
                    tab.title,
                    color = if (sel) Color.White else Glass.tint.copy(alpha = 0.65f),
                    fontSize = 14.sp,
                    fontWeight = if (sel) FontWeight.SemiBold else FontWeight.Normal,
                )
            }
        }
    }
}
