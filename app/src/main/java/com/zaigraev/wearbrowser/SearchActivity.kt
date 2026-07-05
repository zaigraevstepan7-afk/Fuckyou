package com.zaigraev.wearbrowser

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text

/**
 * Собственный экран поиска: работает на любых часах,
 * даже без системного RemoteInput (голосового ввода Google).
 */
class SearchActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                var query by remember { mutableStateOf("") }
                val focusRequester = remember { FocusRequester() }

                fun submit() {
                    val text = query.trim()
                    if (text.isNotEmpty()) {
                        startActivity(
                            Intent(this, BrowserActivity::class.java)
                                .setData(Uri.parse(UrlUtils.toUrl(text)))
                        )
                        finish()
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black)
                        .padding(horizontal = 20.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = getString(R.string.search_prompt),
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    BasicTextField(
                        value = query,
                        onValueChange = { query = it },
                        singleLine = true,
                        textStyle = TextStyle(color = Color.White, fontSize = 16.sp),
                        cursorBrush = SolidColor(Color.White),
                        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                        keyboardActions = KeyboardActions(onSearch = { submit() }),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 10.dp)
                            .background(Color(0xFF202124), RoundedCornerShape(16.dp))
                            .padding(horizontal = 14.dp, vertical = 10.dp)
                            .focusRequester(focusRequester)
                    )
                    Chip(
                        onClick = { submit() },
                        colors = ChipDefaults.primaryChipColors(),
                        label = { Text(getString(R.string.search_go)) }
                    )
                }

                LaunchedEffect(Unit) {
                    // requestFocus может кинуть IllegalStateException,
                    // если узел ещё не прикреплён — фокус не критичен
                    try {
                        focusRequester.requestFocus()
                    } catch (e: IllegalStateException) {
                        // пользователь просто тапнет по полю сам
                    }
                }
            }
        }
    }
}
