package com.fuckyou.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.fuckyou.app.telegram.LoginState
import com.fuckyou.app.ui.ChatListScreen
import com.fuckyou.app.ui.ChatScreen
import com.fuckyou.app.ui.FuckYouTheme
import com.fuckyou.app.ui.LoginScreen
import com.fuckyou.app.ui.SettingsScreen

/** Lightweight screen state, no nav-library dependency. */
private sealed interface Screen {
    data object ChatList : Screen
    data object Settings : Screen
    data object Chat : Screen
}

class MainActivity : ComponentActivity() {

    private val vm: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { App(vm) }
    }
}

@Composable
private fun App(vm: AppViewModel) {
    val config by vm.config.collectAsStateWithLifecycle()
    val login by vm.loginState.collectAsStateWithLifecycle()

    FuckYouTheme(accentIndex = config.accent) {
        if (login !is LoginState.Authorized) {
            LoginScreen(
                state = login,
                onPhone = vm::submitPhone,
                onCode = vm::submitCode,
                onPassword = vm::submitPassword,
            )
            return@FuckYouTheme
        }

        // Authorized: load chats once.
        LaunchedEffect(Unit) { vm.refreshChats() }

        var screen by remember { mutableStateOf<Screen>(Screen.ChatList) }
        val chats by vm.chats.collectAsStateWithLifecycle()
        val messages by vm.messages.collectAsStateWithLifecycle()
        val openId by vm.openChatId.collectAsStateWithLifecycle()

        when (screen) {
            Screen.ChatList -> ChatListScreen(
                chats = chats,
                onOpen = {
                    vm.openChat(it)
                    screen = Screen.Chat
                },
                onSettings = { screen = Screen.Settings },
            )

            Screen.Chat -> {
                val title = chats.firstOrNull { it.id == openId }?.title ?: "Чат"
                ChatScreen(
                    title = title,
                    messages = messages,
                    onBack = {
                        vm.closeChat()
                        screen = Screen.ChatList
                    },
                    onSend = vm::send,
                )
            }

            Screen.Settings -> SettingsScreen(
                config = config,
                onBack = { screen = Screen.ChatList },
                onAntiDelete = vm::setAntiDelete,
                onAntiEdit = vm::setAntiEdit,
                onGhost = vm::setGhostMode,
                onFakeOnline = vm::setFakeOnline,
                onAccent = vm::setAccent,
            )
        }
    }
}
