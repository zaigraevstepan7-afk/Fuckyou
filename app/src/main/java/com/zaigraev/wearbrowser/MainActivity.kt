package com.zaigraev.wearbrowser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Warning
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.input.rotary.onRotaryScrollEvent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.ListHeader
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import kotlinx.coroutines.launch

private data class Bookmark(val title: String, val url: String)

private val BOOKMARKS = listOf(
    Bookmark("Google", "https://www.google.com/?gbv=1"),
    Bookmark("Википедия", "https://ru.m.wikipedia.org"),
    Bookmark("Переводчик", "https://translate.google.com"),
    Bookmark("Новости", "https://news.google.com"),
)

class MainActivity : ComponentActivity() {

    private var refreshTick by mutableStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                HomeScreen(
                    refreshTick = refreshTick,
                    onSearch = {
                        startActivity(Intent(this, SearchActivity::class.java))
                    },
                    onOpen = ::openUrl,
                    onClearHistory = {
                        HistoryStore.clear(this)
                        refreshTick++
                    },
                    onShowCrash = {
                        startActivity(Intent(this, CrashActivity::class.java))
                    }
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        refreshTick++
    }

    private fun openUrl(url: String) {
        startActivity(
            Intent(this, BrowserActivity::class.java).setData(Uri.parse(url))
        )
    }
}

@Composable
private fun HomeScreen(
    refreshTick: Int,
    onSearch: () -> Unit,
    onOpen: (String) -> Unit,
    onClearHistory: () -> Unit,
    onShowCrash: () -> Unit
) {
    val context = LocalContext.current
    val history = remember(refreshTick) { HistoryStore.load(context) }
    val hasCrash = remember(refreshTick) { CrashLog.load(context) != null }
    val listState = rememberScalingLazyListState()
    val scope = rememberCoroutineScope()
    val focusRequester = remember { FocusRequester() }

    Scaffold(
        timeText = { TimeText() },
        positionIndicator = { PositionIndicator(scalingLazyListState = listState) }
    ) {
        ScalingLazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                // Прокрутка списка вращающейся коронкой
                .onRotaryScrollEvent {
                    scope.launch { listState.scrollBy(it.verticalScrollPixels) }
                    true
                }
                .focusRequester(focusRequester)
                .focusable()
        ) {
            item {
                Chip(
                    onClick = onSearch,
                    modifier = Modifier.fillMaxWidth(),
                    colors = ChipDefaults.primaryChipColors(),
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    label = {
                        Text(
                            text = context.getString(R.string.search_google),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                )
            }

            if (hasCrash) {
                item {
                    Chip(
                        onClick = onShowCrash,
                        modifier = Modifier.fillMaxWidth(),
                        colors = ChipDefaults.secondaryChipColors(),
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Warning,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        label = { Text(context.getString(R.string.crash_report)) }
                    )
                }
            }

            item {
                ListHeader { Text(context.getString(R.string.bookmarks)) }
            }
            items(BOOKMARKS) { bookmark ->
                Chip(
                    onClick = { onOpen(bookmark.url) },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ChipDefaults.secondaryChipColors(),
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Language,
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                    },
                    label = {
                        Text(
                            text = bookmark.title,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                )
            }

            if (history.isNotEmpty()) {
                item {
                    ListHeader { Text(context.getString(R.string.history)) }
                }
                items(history) { entry ->
                    Chip(
                        onClick = { onOpen(entry.url) },
                        modifier = Modifier.fillMaxWidth(),
                        colors = ChipDefaults.secondaryChipColors(),
                        icon = {
                            Icon(
                                imageVector = Icons.Default.History,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        label = {
                            Text(
                                text = entry.title.ifBlank { entry.url },
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        },
                        secondaryLabel = {
                            Text(
                                text = entry.url,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )
                        }
                    )
                }
                item {
                    Chip(
                        onClick = onClearHistory,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 4.dp),
                        colors = ChipDefaults.secondaryChipColors(),
                        icon = {
                            Icon(
                                imageVector = Icons.Default.Delete,
                                contentDescription = null,
                                modifier = Modifier.size(20.dp)
                            )
                        },
                        label = { Text(context.getString(R.string.clear_history)) }
                    )
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        try {
            focusRequester.requestFocus()
        } catch (e: IllegalStateException) {
            // фокус не критичен — коронка заработает после первого тапа
        }
    }
}
