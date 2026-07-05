package com.zaigraev.wearbrowser

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.view.InputDevice
import android.view.MotionEvent
import android.view.ViewConfiguration
import android.view.ViewGroup
import android.webkit.RenderProcessGoneDetail
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.core.view.ViewConfigurationCompat
import androidx.webkit.WebSettingsCompat
import androidx.webkit.WebViewFeature
import kotlin.math.roundToInt

class BrowserActivity : ComponentActivity() {

    private var webView: WebView? = null
    private lateinit var progressBar: ProgressBar

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // На некоторых часах Wear OS системный WebView отсутствует —
        // сообщаем об этом вместо падения.
        val web = try {
            WebView(this)
        } catch (t: Throwable) {
            Toast.makeText(this, R.string.webview_missing, Toast.LENGTH_LONG).show()
            finish()
            return
        }
        webView = web

        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = 100
        }

        val root = FrameLayout(this).apply {
            addView(
                web,
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

        web.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            useWideViewPort = true
            loadWithOverviewMode = true
            setSupportZoom(true)
            builtInZoomControls = true
            displayZoomControls = false
        }

        // Тёмная тема страниц — на часах экономит AMOLED и глаза
        if (WebViewFeature.isFeatureSupported(WebViewFeature.ALGORITHMIC_DARKENING)) {
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(web.settings, true)
        }

        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                val scheme = request.url.scheme
                // Всю http/https-навигацию оставляем внутри WebView
                if (scheme == "http" || scheme == "https") {
                    return false
                }
                // tel:, mailto:, market: и т.п. — пробуем отдать системе
                try {
                    startActivity(Intent(Intent.ACTION_VIEW, request.url))
                } catch (e: ActivityNotFoundException) {
                    // на часах некому обработать — просто игнорируем
                }
                return true
            }

            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                progressBar.visibility = ProgressBar.VISIBLE
            }

            override fun onPageFinished(view: WebView, url: String) {
                progressBar.visibility = ProgressBar.GONE
                HistoryStore.add(this@BrowserActivity, view.title ?: "", url)
            }

            // Системе не хватило памяти и она убила рендерер WebView —
            // без этого обработчика приложение обязано упасть (частая
            // ситуация на часах). Закрываемся мягко.
            override fun onRenderProcessGone(
                view: WebView,
                detail: RenderProcessGoneDetail
            ): Boolean {
                if (webView === view) {
                    (view.parent as? ViewGroup)?.removeView(view)
                    view.destroy()
                    webView = null
                    Toast.makeText(
                        this@BrowserActivity,
                        R.string.page_too_heavy,
                        Toast.LENGTH_LONG
                    ).show()
                    finish()
                }
                return true
            }
        }

        web.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView, newProgress: Int) {
                progressBar.progress = newProgress
            }
        }

        // Кнопка/жест «назад»: сначала история WebView, потом закрытие
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val wv = webView
                if (wv != null && wv.canGoBack()) {
                    wv.goBack()
                } else {
                    finish()
                }
            }
        })

        web.isVerticalScrollBarEnabled = true
        web.requestFocus()

        // Извне (exported activity) могут прислать любой URI —
        // загружаем только http/https, иначе открываем Google
        val requested = intent?.data
        val url = if (requested?.scheme == "http" || requested?.scheme == "https") {
            requested.toString()
        } else {
            "https://www.google.com"
        }
        web.loadUrl(url)
    }

    /**
     * Прокрутка страницы вращающейся коронкой OnePlus Watch / безелем.
     */
    override fun onGenericMotionEvent(event: MotionEvent): Boolean {
        val wv = webView
        if (wv != null &&
            event.action == MotionEvent.ACTION_SCROLL &&
            event.isFromSource(InputDevice.SOURCE_ROTARY_ENCODER)
        ) {
            val delta = -event.getAxisValue(MotionEvent.AXIS_SCROLL) *
                ViewConfigurationCompat.getScaledVerticalScrollFactor(
                    ViewConfiguration.get(this), this
                )
            wv.scrollBy(0, delta.roundToInt())
            return true
        }
        return super.onGenericMotionEvent(event)
    }

    override fun onDestroy() {
        // Перед destroy() WebView обязательно отсоединяем от иерархии —
        // иначе возможен нативный краш в Chromium
        webView?.let { wv ->
            (wv.parent as? ViewGroup)?.removeView(wv)
            wv.stopLoading()
            wv.destroy()
        }
        webView = null
        super.onDestroy()
    }
}
