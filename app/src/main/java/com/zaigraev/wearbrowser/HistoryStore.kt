package com.zaigraev.wearbrowser

import android.content.Context

data class HistoryEntry(val title: String, val url: String)

/**
 * Простейшая история посещений в SharedPreferences (последние 10 страниц).
 */
object HistoryStore {

    private const val PREFS = "history"
    private const val KEY = "entries"
    private const val MAX_ENTRIES = 10
    private const val FIELD_SEP = "\t"
    private const val LINE_SEP = "\n"

    fun load(context: Context): List<HistoryEntry> {
        val raw = prefs(context).getString(KEY, "") ?: ""
        if (raw.isBlank()) return emptyList()
        return raw.split(LINE_SEP).mapNotNull { line ->
            val parts = line.split(FIELD_SEP, limit = 2)
            if (parts.size == 2 && parts[1].isNotBlank()) {
                HistoryEntry(parts[0], parts[1])
            } else {
                null
            }
        }
    }

    fun add(context: Context, title: String, url: String) {
        val cleanTitle = title.replace(FIELD_SEP, " ").replace(LINE_SEP, " ").take(60)
        val cleanUrl = url.replace(FIELD_SEP, "").replace(LINE_SEP, "")
        val updated = (listOf(HistoryEntry(cleanTitle, cleanUrl)) +
            load(context).filter { it.url != cleanUrl })
            .take(MAX_ENTRIES)
        val raw = updated.joinToString(LINE_SEP) { "${it.title}$FIELD_SEP${it.url}" }
        prefs(context).edit().putString(KEY, raw).apply()
    }

    fun clear(context: Context) {
        prefs(context).edit().remove(KEY).apply()
    }

    private fun prefs(context: Context) =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
}
