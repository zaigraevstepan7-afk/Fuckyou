package com.zaigraev.wearbrowser

import android.content.Context
import android.util.Log

/**
 * Пишет стектрейс последнего падения в SharedPreferences,
 * чтобы его можно было посмотреть прямо на часах.
 */
object CrashLog {

    private const val PREFS = "crash"
    private const val KEY = "last"

    fun install(context: Context) {
        val appContext = context.applicationContext
        val previous = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            try {
                appContext.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                    .edit()
                    .putString(KEY, Log.getStackTraceString(throwable))
                    .commit() // процесс умирает — apply() не успеет
            } catch (ignored: Throwable) {
            }
            previous?.uncaughtException(thread, throwable)
        }
    }

    fun load(context: Context): String? =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getString(KEY, null)

    fun clear(context: Context) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit().remove(KEY).apply()
    }
}
