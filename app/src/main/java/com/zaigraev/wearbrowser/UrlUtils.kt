package com.zaigraev.wearbrowser

import android.net.Uri
import android.util.Patterns

object UrlUtils {

    /**
     * Превращает пользовательский ввод в URL:
     * адрес открывается напрямую, всё остальное уходит в поиск Google.
     */
    fun toUrl(input: String): String {
        val text = input.trim()
        if (text.startsWith("http://") || text.startsWith("https://")) {
            return text
        }
        val looksLikeUrl = !text.contains(' ') &&
            text.contains('.') &&
            Patterns.WEB_URL.matcher(text).matches()
        return if (looksLikeUrl) {
            "https://$text"
        } else {
            "https://www.google.com/search?q=" + Uri.encode(text)
        }
    }
}
