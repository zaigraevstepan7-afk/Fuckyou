package com.zaigraev.wearbrowser

import android.app.RemoteInput
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
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
import androidx.wear.input.RemoteInputIntentHelper

private const val KEY_QUERY = "query"

private data class Bookmark(val title: String, val url: String)

private val BOOKMARKS = listOf(
    Bookmark("Google", "https://www.google.com"),
    Bookmark("YouTube", "https://m.youtube.com"),
    Bookmark("Википедия", "https://ru.m.wikipedia.org"),
    Bookmark("Переводчик", "https://translate.google.com"),
    Bookmark("Новости", "https://news.google.com"),
)

class MainActivity : ComponentActivity() {

    private var historyVersion by mutableStateOf(0)

    private val searchLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        val data = result.data ?: return@registerForActivityResult
        val query = RemoteInput.getResultsFromIntent(data)
            ?.getCharSequence(KEY_QUERY)
            ?.toString()
            ?.trim()
        if (!query.isNullOrEmpty()) {
            openUrl(UrlUtils.toUrl(query))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                HomeScreen(
                    historyVersion = historyVersion,
                    onSearch = ::launchSearchInput,
                    onOpen = ::openUrl,
                    onClearHistory = {
                        HistoryStore.clear(this)
                        historyVersion++
                    }
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        historyVersion++
    }

    private fun launchSearchInput() {
        val intent = RemoteInputIntentHelper.createActionRemoteInputIntent()
        val remoteInputs = listOf(
            RemoteInput.Builder(KEY_QUERY)
                .setLabel(getString(R.string.search_prompt))
                .build()
        )
        RemoteInputIntentHelper.putRemoteInputsExtra(intent, remoteInputs)
        searchLauncher.launch(intent)
    }

    private fun openUrl(url: String) {
        startActivity(
            Intent(this, BrowserActivity::class.java).setData(Uri.parse(url))
        )
    }
}

@Composable
private fun HomeScreen(
    historyVersion: Int,
    onSearch: () -> Unit,
    onOpen: (String) -> Unit,
    onClearHistory: () -> Unit
) {
    val context = LocalContext.current
    val history = remember(historyVersion) { HistoryStore.load(context) }
    val listState = rememberScalingLazyListState()

    Scaffold(
        timeText = { TimeText() },
        positionIndicator = { PositionIndicator(scalingLazyListState = listState) }
    ) {
        ScalingLazyColumn(
            state = listState,
            modifier = Modifier.fillMaxSize()
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
}
