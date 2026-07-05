package com.zaigraev.wearbrowser

import android.app.Application
import android.content.Context
import org.mozilla.geckoview.ContentBlocking
import org.mozilla.geckoview.GeckoRuntime
import org.mozilla.geckoview.GeckoRuntimeSettings

class WearBrowserApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // Прогреваем движок сразу при старте приложения, чтобы первое
        // открытие страницы не тормозило на инициализации Gecko
        runtime(this)
    }

    companion object {

        @Volatile
        private var runtime: GeckoRuntime? = null

        /**
         * Единственный GeckoRuntime на процесс: повторное создание
         * рантайма приводит к крашу, а его инициализация — самая
         * дорогая операция движка.
         */
        fun runtime(context: Context): GeckoRuntime =
            runtime ?: synchronized(this) {
                runtime ?: createRuntime(context.applicationContext)
                    .also { runtime = it }
            }

        private fun createRuntime(appContext: Context): GeckoRuntime {
            val settings = GeckoRuntimeSettings.Builder()
                // Блокировка рекламы и трекеров — главная оптимизация
                // на часах: меньше сети, памяти и JS
                .contentBlocking(
                    ContentBlocking.Settings.Builder()
                        .antiTracking(
                            ContentBlocking.AntiTracking.AD or
                                ContentBlocking.AntiTracking.ANALYTIC or
                                ContentBlocking.AntiTracking.SOCIAL or
                                ContentBlocking.AntiTracking.CRYPTOMINING or
                                ContentBlocking.AntiTracking.FINGERPRINTING
                        )
                        .build()
                )
                // Тёмная тема страниц: AMOLED-экран часов
                .preferredColorScheme(GeckoRuntimeSettings.COLOR_SCHEME_DARK)
                .remoteDebuggingEnabled(false)
                .consoleOutput(false)
                .build()
            return GeckoRuntime.create(appContext, settings)
        }
    }
}
