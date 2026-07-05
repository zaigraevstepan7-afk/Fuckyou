package com.zaigraev.wearbrowser

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.focusable
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.rotary.onRotaryScrollEvent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import kotlinx.coroutines.launch

/**
 * Показывает стектрейс последнего падения прямо на часах —
 * можно сфотографировать и отправить для диагностики.
 */
class CrashActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val scrollState = rememberScrollState()
                val scope = rememberCoroutineScope()
                val focusRequester = remember { FocusRequester() }
                val crashText = CrashLog.load(this) ?: getString(R.string.no_crash)

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                        .verticalScroll(scrollState)
                        .onRotaryScrollEvent {
                            scope.launch { scrollState.scrollBy(it.verticalScrollPixels) }
                            true
                        }
                        .focusRequester(focusRequester)
                        .focusable()
                        .padding(horizontal = 16.dp, vertical = 28.dp)
                ) {
                    Text(
                        text = crashText,
                        color = Color.White,
                        fontSize = 10.sp,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Chip(
                        onClick = {
                            CrashLog.clear(this@CrashActivity)
                            finish()
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 12.dp),
                        colors = ChipDefaults.secondaryChipColors(),
                        label = { Text(getString(R.string.clear_crash)) }
                    )
                }

                LaunchedEffect(Unit) {
                    try {
                        focusRequester.requestFocus()
                    } catch (e: IllegalStateException) {
                        // не критично
                    }
                }
            }
        }
    }
}
