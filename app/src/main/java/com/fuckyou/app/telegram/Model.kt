package com.fuckyou.app.telegram

/** A chat/dialog shown in the chat list. */
data class Chat(
    val id: Long,
    val title: String,
    val lastMessage: String,
    val unread: Int = 0,
)

/** A single message inside a chat. */
data class Message(
    val id: Long,
    val chatId: Long,
    val senderName: String,
    val text: String,
    val outgoing: Boolean,
    val timestampMs: Long,
    /** Set to true when the sender deleted it but the mod kept a local copy. */
    val deleted: Boolean = false,
    /** Original text kept by the anti-edit feature, null if never edited. */
    val originalText: String? = null,
)

/** State of the multi-step login flow. */
sealed interface LoginState {
    data object NeedPhone : LoginState
    data object NeedCode : LoginState
    data object NeedPassword : LoginState
    data object Authorized : LoginState
    data class Error(val message: String) : LoginState
}

/** Updates pushed from the Telegram layer to the app. */
sealed interface TgUpdate {
    data class NewMessage(val message: Message) : TgUpdate
    data class MessageDeleted(val chatId: Long, val messageId: Long) : TgUpdate
    data class MessageEdited(val chatId: Long, val messageId: Long, val newText: String) : TgUpdate
}
