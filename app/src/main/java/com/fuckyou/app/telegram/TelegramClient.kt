package com.fuckyou.app.telegram

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow

/**
 * Abstraction over the Telegram backend.
 *
 * The app talks only to this interface, so the backend can be swapped without
 * touching the UI. Two implementations exist:
 *
 *  - [MockTelegramClient]  — in-memory, lets the whole app (login, chats,
 *    anti-delete, settings) run and be demoed without any credentials.
 *  - [TdLibTelegramClient] — the real one, backed by Telegram's official TDLib.
 *    It needs your api_id/api_hash (see app/build.gradle.kts) and the TDLib
 *    native library. See README for wiring instructions.
 */
interface TelegramClient {

    val loginState: StateFlow<LoginState>

    /** Stream of server-side updates (new/deleted/edited messages). */
    val updates: Flow<TgUpdate>

    suspend fun sendPhone(phone: String)
    suspend fun sendCode(code: String)
    suspend fun sendPassword(password: String)
    suspend fun logout()

    suspend fun loadChats(): List<Chat>
    suspend fun loadMessages(chatId: Long): List<Message>
    suspend fun sendMessage(chatId: Long, text: String): Message
}
