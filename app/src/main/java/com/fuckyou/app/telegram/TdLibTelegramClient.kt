package com.fuckyou.app.telegram

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Real Telegram backend, powered by Telegram's official **TDLib**.
 *
 * This is the integration point — the place where the legal, supported path to a
 * working login lives. It is intentionally not active yet because it needs two
 * things you provide:
 *
 *   1. api_id / api_hash  — get them free at https://my.telegram.org
 *      (API development tools), then set TG_API_ID / TG_API_HASH in
 *      app/build.gradle.kts.
 *   2. The TDLib native library for Android (libtdjni.so + the Java wrapper
 *      `org.drinkless.tdlib.Client`). Build it from https://github.com/tdlib/td
 *      (see README) and drop the .so files under app/src/main/jniLibs/<abi>/.
 *
 * Once both are in place, replace MockTelegramClient with this one in
 * AppViewModel and implement the TODOs below by forwarding to
 * org.drinkless.tdlib.Client. The TdApi update TdApi.UpdateDeleteMessages maps
 * to TgUpdate.MessageDeleted, which is exactly what powers anti-delete.
 */
class TdLibTelegramClient : TelegramClient {

    private val _loginState = MutableStateFlow<LoginState>(LoginState.NeedPhone)
    override val loginState: StateFlow<LoginState> = _loginState

    private val _updates = MutableSharedFlow<TgUpdate>(extraBufferCapacity = 64)
    override val updates: Flow<TgUpdate> = _updates

    private fun notWired(): Nothing = throw NotImplementedError(
        "TDLib not linked yet. Add api_id/api_hash and the TDLib native lib, " +
            "then implement TdLibTelegramClient. See README."
    )

    // TODO: send TdApi.SetAuthenticationPhoneNumber
    override suspend fun sendPhone(phone: String) = notWired()

    // TODO: send TdApi.CheckAuthenticationCode
    override suspend fun sendCode(code: String) = notWired()

    // TODO: send TdApi.CheckAuthenticationPassword
    override suspend fun sendPassword(password: String) = notWired()

    // TODO: send TdApi.LogOut
    override suspend fun logout() = notWired()

    // TODO: send TdApi.GetChats / LoadChats and map results
    override suspend fun loadChats(): List<Chat> = notWired()

    // TODO: send TdApi.GetChatHistory and map results
    override suspend fun loadMessages(chatId: Long): List<Message> = notWired()

    // TODO: send TdApi.SendMessage
    override suspend fun sendMessage(chatId: Long, text: String): Message = notWired()
}
