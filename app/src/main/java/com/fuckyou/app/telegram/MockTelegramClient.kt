package com.fuckyou.app.telegram

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicLong

/**
 * Fully working in-memory backend. No network, no credentials. It exists so the
 * client can be built, launched and demoed end-to-end — including the headline
 * "anti-delete" feature, which it exercises by simulating a sender deleting and
 * editing a message a few seconds after login.
 */
class MockTelegramClient : TelegramClient {

    private val scope = CoroutineScope(SupervisorJob())
    private val nextId = AtomicLong(1000)

    private val _loginState = MutableStateFlow<LoginState>(LoginState.NeedPhone)
    override val loginState: StateFlow<LoginState> = _loginState.asStateFlow()

    private val _updates = MutableSharedFlow<TgUpdate>(extraBufferCapacity = 64)
    override val updates: SharedFlow<TgUpdate> = _updates.asSharedFlow()

    private val chats = mutableListOf(
        Chat(1, "Сохранёнка", "Заметки только для тебя", 0),
        Chat(2, "Лёха", "ну ты видел?", 2),
        Chat(3, "FuckYou News", "релиз 0.1.0 собран ✅", 1),
    )

    private val messages = mutableMapOf<Long, MutableList<Message>>(
        1L to mutableListOf(
            msg(1, "Ты", "Список дел на сегодня", true),
        ),
        2L to mutableListOf(
            msg(2, "Лёха", "прив", false),
            msg(2, "Лёха", "ну ты видел?", false),
        ),
        3L to mutableListOf(
            msg(3, "FuckYou News", "релиз 0.1.0 собран ✅", false),
        ),
    )

    private fun msg(chatId: Long, sender: String, text: String, outgoing: Boolean) =
        Message(
            id = nextId.getAndIncrement(),
            chatId = chatId,
            senderName = sender,
            text = text,
            outgoing = outgoing,
            timestampMs = 0L,
        )

    override suspend fun sendPhone(phone: String) {
        delay(400)
        if (phone.filter { it.isDigit() }.length < 5) {
            _loginState.value = LoginState.Error("Некорректный номер")
            return
        }
        _loginState.value = LoginState.NeedCode
    }

    override suspend fun sendCode(code: String) {
        delay(400)
        when (code.trim()) {
            "" -> _loginState.value = LoginState.Error("Введите код")
            "00000" -> _loginState.value = LoginState.NeedPassword // demo: triggers 2FA step
            else -> {
                _loginState.value = LoginState.Authorized
                scheduleDemoEvents()
            }
        }
    }

    override suspend fun sendPassword(password: String) {
        delay(400)
        if (password.isBlank()) {
            _loginState.value = LoginState.Error("Введите пароль")
        } else {
            _loginState.value = LoginState.Authorized
            scheduleDemoEvents()
        }
    }

    override suspend fun logout() {
        _loginState.value = LoginState.NeedPhone
    }

    override suspend fun loadChats(): List<Chat> {
        delay(150)
        return chats.toList()
    }

    override suspend fun loadMessages(chatId: Long): List<Message> {
        delay(150)
        return messages.getOrPut(chatId) { mutableListOf() }.toList()
    }

    override suspend fun sendMessage(chatId: Long, text: String): Message {
        val m = msg(chatId, "Ты", text, true)
        messages.getOrPut(chatId) { mutableListOf() }.add(m)
        return m
    }

    /** After login, simulate a sender deleting and editing a message so the
     *  anti-delete / anti-edit features are visible without a real peer. */
    private fun scheduleDemoEvents() {
        scope.launch {
            delay(4000)
            val incoming = msg(2, "Лёха", "удалю-ка я это, никто не увидит 🤫", false)
            messages.getOrPut(2) { mutableListOf() }.add(incoming)
            _updates.emit(TgUpdate.NewMessage(incoming))

            delay(3000)
            _updates.emit(TgUpdate.MessageDeleted(2, incoming.id))

            delay(3000)
            val toEdit = messages[2]?.firstOrNull { it.text == "прив" }
            if (toEdit != null) {
                _updates.emit(TgUpdate.MessageEdited(2, toEdit.id, "приветик (отредактировано)"))
            }
        }
    }
}
