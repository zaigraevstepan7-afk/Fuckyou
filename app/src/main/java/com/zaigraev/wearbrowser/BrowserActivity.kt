package com.zaigraev.wearbrowser

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.InputDevice
import android.view.MotionEvent
import android.view.ViewConfiguration
import android.widget.FrameLayout
import android.widget.ProgressBar
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.core.view.ViewConfigurationCompat
import org.mozilla.geckoview.AllowOrDeny
import org.mozilla.geckoview.GeckoResult
import org.mozilla.geckoview.GeckoSession
import org.mozilla.geckoview.GeckoSessionSettings
import org.mozilla.geckoview.GeckoView
import org.mozilla.geckoview.ScreenLength

class BrowserActivity : ComponentActivity() {

    private lateinit var geckoView: GeckoView
    private lateinit var progressBar: ProgressBar
    private var session: GeckoSession? = null

    private var canGoBack = false
    private var currentUrl = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Извне (exported activity) могут прислать любой URI —
        // работаем только с http/https, иначе открываем Google
        val requested = intent?.data
        currentUrl = if (requested?.scheme == "http" || requested?.scheme == "https") {
            requested.toString()
        } else {
            "https://www.google.com"
        }

        geckoView = GeckoView(this)
        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = 100
        }

        val root = FrameLayout(this).apply {
            addView(
                geckoView,
                FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    FrameLayout.LayoutParams.MATCH_PARENT
                )
            )
            addView(
                progressBar,
                FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.MATCH_PARENT,
                    8
                )
            )
        }
        setContentView(root)

        // Кнопка/жест «назад»: сначала история страниц, потом закрытие
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val s = session
                if (s != null && canGoBack) {
                    s.goBack()
                } else {
                    finish()
                }
            }
        })

        openSession(loadUrl = currentUrl)
    }

    private fun createSession(): GeckoSession {
        val s = GeckoSession(
            GeckoSessionSettings.Builder()
                .userAgentMode(GeckoSessionSettings.USER_AGENT_MODE_MOBILE)
                .viewportMode(GeckoSessionSettings.VIEWPORT_MODE_MOBILE)
                .useTrackingProtection(true)
                .build()
        )

        s.progressDelegate = object : GeckoSession.ProgressDelegate {
            override fun onPageStart(session: GeckoSession, url: String) {
                progressBar.visibility = ProgressBar.VISIBLE
            }

            override fun onPageStop(session: GeckoSession, success: Boolean) {
                progressBar.visibility = ProgressBar.GONE
            }

            override fun onProgressChange(session: GeckoSession, progress: Int) {
                progressBar.progress = progress
            }
        }

        s.navigationDelegate = object : GeckoSession.NavigationDelegate {
            override fun onLocationChange(
                session: GeckoSession,
                url: String?,
                perms: MutableList<GeckoSession.PermissionDelegate.ContentPermission>,
                hasUserGesture: Boolean
            ) {
                if (!url.isNullOrEmpty()) {
                    currentUrl = url
                }
            }

            override fun onCanGoBack(session: GeckoSession, value: Boolean) {
                canGoBack = value
            }

            override fun onLoadRequest(
                session: GeckoSession,
                request: GeckoSession.NavigationDelegate.LoadRequest
            ): GeckoResult<AllowOrDeny>? {
                val uri = Uri.parse(request.uri)
                if (uri.scheme == "http" || uri.scheme == "https") {
                    return GeckoResult.fromValue(AllowOrDeny.ALLOW)
                }
                // tel:, mailto: и т.п. — пробуем отдать системе
                try {
                    startActivity(Intent(Intent.ACTION_VIEW, uri))
                } catch (e: ActivityNotFoundException) {
                    // на часах некому обработать — игнорируем
                }
                return GeckoResult.fromValue(AllowOrDeny.DENY)
            }
        }

        s.contentDelegate = object : GeckoSession.ContentDelegate {
            override fun onTitleChange(session: GeckoSession, title: String?) {
                if (currentUrl.isNotEmpty()) {
                    HistoryStore.add(this@BrowserActivity, title ?: "", currentUrl)
                }
            }

            // Рендерер движка убит системой (нехватка памяти) или упал —
            // пересоздаём сессию и загружаем страницу заново вместо
            // краша всего приложения
            override fun onCrash(session: GeckoSession) {
                recoverSession()
            }

            override fun onKill(session: GeckoSession) {
                recoverSession()
            }
        }

        return s
    }

    private fun openSession(loadUrl: String?) {
        val s = createSession()
        session = s
        s.open(WearBrowserApp.runtime(this))
        geckoView.setSession(s)
        if (!loadUrl.isNullOrEmpty()) {
            s.loadUri(loadUrl)
        }
    }

    private fun recoverSession() {
        if (isFinishing || isDestroyed) return
        geckoView.releaseSession()
        session?.close()
        openSession(loadUrl = currentUrl)
    }

    /**
     * Прокрутка страницы вращающейся коронкой OnePlus Watch / безелем.
     */
    override fun onGenericMotionEvent(event: MotionEvent): Boolean {
        val s = session
        if (s != null &&
            event.action == MotionEvent.ACTION_SCROLL &&
            event.isFromSource(InputDevice.SOURCE_ROTARY_ENCODER)
        ) {
            val delta = -event.getAxisValue(MotionEvent.AXIS_SCROLL) *
                ViewConfigurationCompat.getScaledVerticalScrollFactor(
                    ViewConfiguration.get(this), this
                )
            s.panZoomController.scrollBy(
                ScreenLength.zero(),
                ScreenLength.fromPixels(delta.toDouble())
            )
            return true
        }
        return super.onGenericMotionEvent(event)
    }

    override fun onDestroy() {
        geckoView.releaseSession()
        session?.close()
        session = null
        super.onDestroy()
    }
}
