package com.fuckyou.app

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.fuckyou.app.data.ModConfig
import com.fuckyou.app.data.ModSettings
import com.fuckyou.app.telegram.Chat
import com.fuckyou.app.telegram.LoginState
import com.fuckyou.app.telegram.Message
import com.fuckyou.app.telegram.MockTelegramClient
import com.fuckyou.app.telegram.TelegramClient
import com.fuckyou.app.telegram.TgUpdate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

/**
 * Single source of truth for the UI. Owns the [TelegramClient], applies the mod
 * rules (anti-delete / anti-edit) to incoming updates, and exposes screen state.
 *
 * To go live with real Telegram: swap [MockTelegramClient] for
 * [com.fuckyou.app.telegram.TdLibTelegramClient] once TDLib is wired (see README).
 */
class AppViewModel(app: Application) : AndroidViewModel(app) {

    private val client: TelegramClient = MockTelegramClient()
    private val settings = ModSettings(app)

    val config: StateFlow<ModConfig> =
        settings.config.stateIn(viewModelScope, SharingStarted.Eagerly, ModConfig())

    val loginState: StateFlow<LoginState> = client.loginState

    private val _chats = MutableStateFlow<List<Chat>>(emptyList())
    val chats: StateFlow<List<Chat>> = _chats.asStateFlow()

    private val _openChatId = MutableStateFlow<Long?>(null)
    val openChatId: StateFlow<Long?> = _openChatId.asStateFlow()

    // chatId -> messages, kept locally so deleted messages can survive.
    private val store = mutableMapOf<Long, MutableList<Message>>()
    private val _messages = MutableStateFlow<List<Message>>(emptyList())
    val messages: StateFlow<List<Message>> = _messages.asStateFlow()

    init {
        viewModelScope.launch {
            client.updates.collect(::onUpdate)
        }
    }

    // ---- Login ----
    fun submitPhone(phone: String) = viewModelScope.launch { client.sendPhone(phone) }
    fun submitCode(code: String) = viewModelScope.launch { client.sendCode(code) }
    fun submitPassword(pwd: String) = viewModelScope.launch { client.sendPassword(pwd) }
    fun logout() = viewModelScope.launch { client.logout() }

    fun refreshChats() = viewModelScope.launch { _chats.value = client.loadChats() }

    fun openChat(chatId: Long) = viewModelScope.launch {
        _openChatId.value = chatId
        val loaded = client.loadMessages(chatId)
        store[chatId] = loaded.toMutableList()
        publish(chatId)
    }

    fun closeChat() {
        _openChatId.value = null
        _messages.value = emptyList()
    }

    fun send(text: String) {
        val chatId = _openChatId.value ?: return
        if (text.isBlank()) return
        viewModelScope.launch {
            val sent = client.sendMessage(chatId, text)
            store.getOrPut(chatId) { mutableListOf() }.add(sent)
            publish(chatId)
        }
    }

    // ---- Mod settings ----
    fun setAntiDelete(v: Boolean) = viewModelScope.launch { settings.setAntiDelete(v) }
    fun setAntiEdit(v: Boolean) = viewModelScope.launch { settings.setAntiEdit(v) }
    fun setGhostMode(v: Boolean) = viewModelScope.launch { settings.setGhostMode(v) }
    fun setFakeOnline(v: Boolean) = viewModelScope.launch { settings.setFakeOnline(v) }
    fun setAccent(v: Int) = viewModelScope.launch { settings.setAccent(v) }

    /** The core mod logic: how server updates are reconciled with local state. */
    private fun onUpdate(update: TgUpdate) {
        when (update) {
            is TgUpdate.NewMessage -> {
                val list = store.getOrPut(update.message.chatId) { mutableListOf() }
                list.add(update.message)
                publish(update.message.chatId)
            }

            is TgUpdate.MessageDeleted -> {
                val list = store[update.chatId] ?: return
                val idx = list.indexOfFirst { it.id == update.messageId }
                if (idx < 0) return
                if (config.value.antiDelete) {
                    // Keep the message; just flag it as deleted-by-sender.
                    list[idx] = list[idx].copy(deleted = true)
                } else {
                    list.removeAt(idx)
                }
                publish(update.chatId)
            }

            is TgUpdate.MessageEdited -> {
                val list = store[update.chatId] ?: return
                val idx = list.indexOfFirst { it.id == update.messageId }
                if (idx < 0) return
                val current = list[idx]
                list[idx] = if (config.value.antiEdit) {
                    // Preserve the pre-edit text so edits can't hide anything.
                    current.copy(
                        text = update.newText,
                        originalText = current.originalText ?: current.text,
                    )
                } else {
                    current.copy(text = update.newText)
                }
                publish(update.chatId)
            }
        }
    }

    private fun publish(chatId: Long) {
        if (_openChatId.value == chatId) {
            _messages.value = store[chatId]?.toList() ?: emptyList()
        }
    }
}
