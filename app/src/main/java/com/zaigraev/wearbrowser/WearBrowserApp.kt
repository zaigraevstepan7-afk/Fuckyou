package com.zaigraev.wearbrowser

import android.app.Application
import android.content.Context
import java.io.File
import org.mozilla.geckoview.ContentBlocking
import org.mozilla.geckoview.GeckoRuntime
import org.mozilla.geckoview.GeckoRuntimeSettings

class WearBrowserApp : Application() {

    override fun onCreate() {
        super.onCreate()
        CrashLog.install(this)
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
            val settingsBuilder = GeckoRuntimeSettings.Builder()

            // GPU часов не тянет аппаратный WebRender — без программного
            // рендеринга страница остаётся белым экраном
            val configFile = File(appContext.filesDir, "geckoview-config.yaml")
            try {
                configFile.writeText(
                    """
                    prefs:
                      gfx.webrender.software: true
                      layers.gpu-process.enabled: false
                      gfx.canvas.accelerated: false
                      webgl.disabled: true
                      media.hardware-video-decoding.enabled: false
                    """.trimIndent()
                )
                settingsBuilder.configFilePath(configFile.absolutePath)
            } catch (e: Exception) {
                // не удалось записать конфиг — запускаемся с дефолтами
            }

            val settings = settingsBuilder
                // Максимальная блокировка рекламы и трекеров — главная
                // оптимизация на слабом процессоре часов: меньше сети,
                // меньше JS, меньше памяти
                .contentBlocking(
                    ContentBlocking.Settings.Builder()
                        .antiTracking(ContentBlocking.AntiTracking.STRICT)
                        .enhancedTrackingProtectionLevel(ContentBlocking.EtpLevel.STRICT)
                        .build()
                )
                // Тёмная тема страниц: AMOLED-экран часов
                .preferredColorScheme(GeckoRuntimeSettings.COLOR_SCHEME_DARK)
                // Авто-зум при фокусе полей только дёргает страницу
                // на крошечном экране
                .inputAutoZoomEnabled(false)
                .doubleTapZoomingEnabled(true)
                .loginAutofillEnabled(false)
                .remoteDebuggingEnabled(false)
                .consoleOutput(false)
                .build()
            return GeckoRuntime.create(appContext, settings)
        }
    }
}
