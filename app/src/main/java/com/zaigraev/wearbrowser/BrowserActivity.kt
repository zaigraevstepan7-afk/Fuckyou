package com.zaigraev.wearbrowser

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.view.InputDevice
import android.view.MotionEvent
import android.view.ViewConfiguration
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

    private lateinit var webView: WebView
    private lateinit var progressBar: ProgressBar

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // На некоторых часах Wear OS системный WebView отсутствует —
        // сообщаем об этом вместо падения.
        webView = try {
            WebView(this)
        } catch (t: Throwable) {
            Toast.makeText(this, R.string.webview_missing, Toast.LENGTH_LONG).show()
            finish()
            return
        }
        progressBar = ProgressBar(this, null, android.R.attr.progressBarStyleHorizontal).apply {
            max = 100
        }

        val root = FrameLayout(this).apply {
            addView(
                webView,
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

        webView.settings.apply {
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
            WebSettingsCompat.setAlgorithmicDarkeningAllowed(webView.settings, true)
        }

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                val scheme = request.url.scheme
                // Всю http/https-навигацию оставляем внутри WebView
                return scheme != "http" && scheme != "https"
            }

            override fun onPageStarted(view: WebView, url: String, favicon: Bitmap?) {
                progressBar.visibility = ProgressBar.VISIBLE
            }

            override fun onPageFinished(view: WebView, url: String) {
                progressBar.visibility = ProgressBar.GONE
                HistoryStore.add(this@BrowserActivity, view.title ?: "", url)
            }
        }

        webView.webChromeClient = object : WebChromeClient() {
            override fun onProgressChanged(view: WebView, newProgress: Int) {
                progressBar.progress = newProgress
            }
        }

        // Кнопка/жест «назад»: сначала история WebView, потом закрытие
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (webView.canGoBack()) {
                    webView.goBack()
                } else {
                    finish()
                }
            }
        })

        webView.isVerticalScrollBarEnabled = true
        webView.requestFocus()

        val url = intent?.data?.toString() ?: "https://www.google.com"
        webView.loadUrl(url)
    }

    /**
     * Прокрутка страницы вращающейся коронкой OnePlus Watch / безелем.
     */
    override fun onGenericMotionEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_SCROLL &&
            event.isFromSource(InputDevice.SOURCE_ROTARY_ENCODER)
        ) {
            val delta = -event.getAxisValue(MotionEvent.AXIS_SCROLL) *
                ViewConfigurationCompat.getScaledVerticalScrollFactor(
                    ViewConfiguration.get(this), this
                )
            webView.scrollBy(0, delta.roundToInt())
            return true
        }
        return super.onGenericMotionEvent(event)
    }

    override fun onDestroy() {
        if (::webView.isInitialized) {
            webView.destroy()
        }
        super.onDestroy()
    }
}
