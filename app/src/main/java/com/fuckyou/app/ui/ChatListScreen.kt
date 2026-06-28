package com.fuckyou.app.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Badge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fuckyou.app.telegram.Chat

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatListScreen(
    chats: List<Chat>,
    onOpen: (Long) -> Unit,
    onSettings: () -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("FuckYou", fontWeight = FontWeight.Black) },
                actions = {
                    IconButton(onClick = onSettings) {
                        Icon(Icons.Filled.Settings, contentDescription = "Настройки мода")
                    }
                },
            )
        },
    ) { padding ->
        LazyColumn(modifier = Modifier.fillMaxSize().padding(padding)) {
            items(chats, key = { it.id }) { chat ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { onOpen(chat.id) }
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                ) {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(chat.title, fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                        if (chat.unread > 0) {
                            Badge(modifier = Modifier.align(Alignment.CenterEnd)) {
                                Text(chat.unread.toString())
                            }
                        }
                    }
                    Text(chat.lastMessage, fontSize = 14.sp, modifier = Modifier.padding(top = 2.dp))
                }
                HorizontalDivider()
            }
        }
    }
}
