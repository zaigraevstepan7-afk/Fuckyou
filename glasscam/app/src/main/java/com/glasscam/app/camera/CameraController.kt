package com.glasscam.app.camera

import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Matrix
import android.graphics.Paint
import android.provider.MediaStore
import android.util.Range
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.ImageProxy
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.video.MediaStoreOutputOptions
import androidx.camera.video.Quality
import androidx.camera.video.QualitySelector
import androidx.camera.video.Recorder
import androidx.camera.video.Recording
import androidx.camera.video.VideoCapture
import androidx.camera.video.VideoRecordEvent
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.glasscam.app.filters.EnhanceParams
import com.glasscam.app.filters.PhotoEffects
import com.glasscam.app.filters.PhotoEffectsRenderer
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.ByteArrayOutputStream
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

enum class CaptureMode { PHOTO, VIDEO }

data class VideoConfig(val quality: Quality = Quality.FHD, val fps: Int = 30, val stabilize: Boolean = true)

/** CameraX wrapper: GL/preview surface, photo capture (AI grade + sharpen), video recording, zoom. */
class CameraController(private val appContext: Context) {

    var lensBack = true; private set
    var flashOn = false; private set
    var maxZoom = 8f; private set
    var minZoom = 1f; private set
    var recording = false; private set

    private var imageCapture: ImageCapture? = null
    private var videoCapture: VideoCapture<Recorder>? = null
    private var activeRecording: Recording? = null
    private var camera: androidx.camera.core.Camera? = null
    private val analysisExecutor = Executors.newSingleThreadExecutor()
    private val latestJpeg = AtomicReference<ByteArray?>(null)
    @Volatile private var lastEncodeMs = 0L

    private var owner: LifecycleOwner? = null
    private var surfaceProvider: Preview.SurfaceProvider? = null
    private var mode = CaptureMode.PHOTO
    private var videoConfig = VideoConfig()

    fun latestFrame(): ByteArray? = latestJpeg.get()

    fun bind(
        owner: LifecycleOwner,
        surfaceProvider: Preview.SurfaceProvider,
        mode: CaptureMode = CaptureMode.PHOTO,
        videoConfig: VideoConfig = VideoConfig(),
        onBound: () -> Unit = {},
    ) {
        this.owner = owner; this.surfaceProvider = surfaceProvider; this.mode = mode; this.videoConfig = videoConfig
        val future = ProcessCameraProvider.getInstance(appContext)
        future.addListener({
            val provider = future.get()
            val preview = Preview.Builder().build().also { it.setSurfaceProvider(surfaceProvider) }
            val selector = if (lensBack) CameraSelector.DEFAULT_BACK_CAMERA else CameraSelector.DEFAULT_FRONT_CAMERA
            try {
                provider.unbindAll()
                camera = if (mode == CaptureMode.VIDEO) {
                    val recorder = Recorder.Builder()
                        .setQualitySelector(QualitySelector.from(videoConfig.quality)).build()
                    val vc = VideoCapture.Builder(recorder)
                        .apply {
                            setTargetFrameRate(Range(videoConfig.fps, videoConfig.fps))
                            runCatching { setVideoStabilizationEnabled(videoConfig.stabilize) }
                        }.build()
                    videoCapture = vc
                    provider.bindToLifecycle(owner, selector, preview, vc)
                } else {
                    val capture = ImageCapture.Builder()
                        .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                        .setFlashMode(if (flashOn) ImageCapture.FLASH_MODE_ON else ImageCapture.FLASH_MODE_OFF)
                        .build()
                    imageCapture = capture
                    val analysis = ImageAnalysis.Builder()
                        .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                        .setOutputImageFormat(ImageAnalysis.OUTPUT_IMAGE_FORMAT_YUV_420_888)
                        .build().also { it.setAnalyzer(analysisExecutor, ::onFrame) }
                    provider.bindToLifecycle(owner, selector, preview, capture, analysis)
                }
                camera?.cameraInfo?.zoomState?.value?.let { maxZoom = it.maxZoomRatio; minZoom = it.minZoomRatio }
            } catch (_: Exception) {
            }
            onBound()
        }, ContextCompat.getMainExecutor(appContext))
    }

    private fun rebind() {
        val o = owner ?: return; val sp = surfaceProvider ?: return
        bind(o, sp, mode, videoConfig)
    }

    private fun onFrame(image: ImageProxy) {
        try {
            val now = System.currentTimeMillis()
            if (now - lastEncodeMs < 450) return
            lastEncodeMs = now
            val bmp = image.toBitmap()
            val rotated = rotate(bmp, image.imageInfo.rotationDegrees)
            val scaled = scaleTo(rotated, 640)
            val bos = ByteArrayOutputStream()
            scaled.compress(Bitmap.CompressFormat.JPEG, 72, bos)
            latestJpeg.set(bos.toByteArray())
            if (scaled !== rotated) scaled.recycle(); if (rotated !== bmp) rotated.recycle(); bmp.recycle()
        } catch (_: Exception) {
        } finally {
            image.close()
        }
    }

    /** Tap-to-focus at a [MeteringPoint] built from the PreviewView's factory. */
    fun focusAt(point: androidx.camera.core.MeteringPoint) {
        val control = camera?.cameraControl ?: return
        val action = androidx.camera.core.FocusMeteringAction.Builder(point)
            .setAutoCancelDuration(3, java.util.concurrent.TimeUnit.SECONDS).build()
        runCatching { control.startFocusAndMetering(action) }
    }

    fun setZoomAbsolute(ratio: Float) { camera?.cameraControl?.setZoomRatio(ratio.coerceIn(minZoom, maxZoom)) }
    fun currentZoom(): Float = camera?.cameraInfo?.zoomState?.value?.zoomRatio ?: 1f
    fun toggleLens() { lensBack = !lensBack; rebind() }
    fun cycleFlash() { flashOn = !flashOn; rebind() }

    // --- photo ---
    suspend fun captureJpeg(): ByteArray = suspendCancellableCoroutine { cont ->
        val capture = imageCapture ?: run {
            cont.resumeWithException(IllegalStateException("Камера не готова")); return@suspendCancellableCoroutine
        }
        capture.takePicture(ContextCompat.getMainExecutor(appContext), object : ImageCapture.OnImageCapturedCallback() {
            override fun onCaptureSuccess(image: ImageProxy) {
                try {
                    val bmp = rotate(image.toBitmap(), image.imageInfo.rotationDegrees)
                    val bos = ByteArrayOutputStream(); bmp.compress(Bitmap.CompressFormat.JPEG, 95, bos); bmp.recycle()
                    cont.resume(bos.toByteArray())
                } catch (e: Exception) { cont.resumeWithException(e) } finally { image.close() }
            }
            override fun onError(exc: ImageCaptureException) = cont.resumeWithException(exc)
        })
    }

    /** Full save pipeline: grade + curve + sharpen + effects, then auto-straighten and watermark. */
    fun processAndSave(
        jpeg: ByteArray, grade: EnhanceParams?, effects: PhotoEffects? = null,
        straightenDeg: Float = 0f, watermark: Boolean = false,
    ): android.net.Uri {
        val out = renderPhoto(jpeg, grade, effects, straightenDeg, watermark)
        return saveJpeg(out)
    }

    /** Re-apply an AI [grade] to an already-saved image, overwriting it in place (background enhance). */
    fun enhanceSavedInPlace(uri: android.net.Uri, grade: EnhanceParams) {
        val input = appContext.contentResolver.openInputStream(uri)?.use { it.readBytes() } ?: return
        val out = renderPhoto(input, grade, null, 0f, false)
        appContext.contentResolver.openOutputStream(uri, "wt")?.use { it.write(out) }
    }

    private fun renderPhoto(
        jpeg: ByteArray, grade: EnhanceParams?, effects: PhotoEffects?,
        straightenDeg: Float, watermark: Boolean,
    ): ByteArray {
        var bmp = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.size) ?: return jpeg
        if (grade != null) {
            val graded = Bitmap.createBitmap(bmp.width, bmp.height, Bitmap.Config.ARGB_8888)
            Canvas(graded).drawBitmap(bmp, 0f, 0f, Paint().apply {
                colorFilter = ColorMatrixColorFilter(ColorMatrix(grade.toMatrix()))
            })
            bmp.recycle(); bmp = graded
            applyCurve(bmp, grade.toneLut())                 // S-curve + highlight roll-off
            if (grade.sharpen > 0.02f) bmp = unsharp(bmp, grade.sharpen)
        }
        if (effects != null && !effects.isNoop()) {
            val fx = PhotoEffectsRenderer.render(bmp, effects)
            if (fx !== bmp) { bmp.recycle(); bmp = fx }
        }
        if (kotlin.math.abs(straightenDeg) in 0.6f..9f) {
            val st = straighten(bmp, straightenDeg)
            if (st !== bmp) { bmp.recycle(); bmp = st }
        }
        if (watermark) drawWatermark(bmp)
        val bos = ByteArrayOutputStream(); bmp.compress(Bitmap.CompressFormat.JPEG, 95, bos); bmp.recycle()
        return bos.toByteArray()
    }

    /** Auto-level: rotate by -[deg] and center-crop the largest axis-aligned rect (no empty corners). */
    private fun straighten(src: Bitmap, deg: Float): Bitmap {
        val w = src.width; val h = src.height
        val rotated = Bitmap.createBitmap(src, 0, 0, w, h, Matrix().apply { postRotate(-deg) }, true)
        // Largest inscribed rectangle keeping the source aspect ratio after rotation.
        val rad = Math.toRadians(kotlin.math.abs(deg).toDouble())
        val cosA = kotlin.math.cos(rad); val sinA = kotlin.math.sin(rad)
        val ar = w.toDouble() / h
        val scale = 1.0 / (ar * sinA + cosA).coerceAtLeast(1e-3)
        val cropW = (w * scale).toInt().coerceIn(1, rotated.width)
        val cropH = (h * scale).toInt().coerceIn(1, rotated.height)
        val x = ((rotated.width - cropW) / 2).coerceAtLeast(0)
        val y = ((rotated.height - cropH) / 2).coerceAtLeast(0)
        val out = Bitmap.createBitmap(rotated, x, y, cropW, cropH)
        if (rotated !== out) rotated.recycle()
        return out
    }

    /** Small tasteful "GlassCam" watermark, bottom-right, scaled to the image. */
    private fun drawWatermark(bmp: Bitmap) {
        val c = Canvas(bmp)
        val pad = bmp.width * 0.028f
        val size = (bmp.width * 0.032f).coerceIn(20f, 80f)
        val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
            color = android.graphics.Color.WHITE
            textSize = size
            typeface = android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, android.graphics.Typeface.BOLD)
            setShadowLayer(size * 0.18f, 0f, 0f, android.graphics.Color.argb(140, 0, 0, 0))
            alpha = 210
        }
        val text = "GlassCam"
        val tw = paint.measureText(text)
        c.drawText(text, bmp.width - tw - pad, bmp.height - pad, paint)
    }

    /** Apply a 256-entry per-channel tone curve in place, strip-processed to stay memory-light. */
    private fun applyCurve(bmp: Bitmap, lut: IntArray) {
        val w = bmp.width; val h = bmp.height
        val rows = 128
        val buf = IntArray(w * rows)
        var y = 0
        while (y < h) {
            val hh = minOf(rows, h - y); val n = w * hh
            bmp.getPixels(buf, 0, w, 0, y, w, hh)
            for (i in 0 until n) {
                val p = buf[i]
                val r = lut[p shr 16 and 0xFF]; val g = lut[p shr 8 and 0xFF]; val b = lut[p and 0xFF]
                buf[i] = (p and 0xFF000000.toInt()) or (r shl 16) or (g shl 8) or b
            }
            bmp.setPixels(buf, 0, w, 0, y, w, hh)
            y += hh
        }
    }

    /**
     * Luminance unsharp mask — the pro pipeline. Sharpening is applied to the LUMA channel only
     * (a fine ½-res pass for edge acuity + a large-radius ⅛-res, low-amount pass for local contrast
     * / "pop"), and the resulting delta is added equally to R/G/B. Working on luminance instead of
     * each colour channel avoids amplifying chroma noise and colour fringing — exactly what camera
     * ISPs and tools like Deep Fusion do (sharpen after denoise, on detail not colour).
     */
    private fun unsharp(src: Bitmap, amount: Float): Bitmap {
        val w = src.width; val h = src.height
        val half = Bitmap.createScaledBitmap(src, (w / 2).coerceAtLeast(1), (h / 2).coerceAtLeast(1), true)
        val blurFine = Bitmap.createScaledBitmap(half, w, h, true); half.recycle()
        val eighth = Bitmap.createScaledBitmap(src, (w / 8).coerceAtLeast(1), (h / 8).coerceAtLeast(1), true)
        val blurCoarse = Bitmap.createScaledBitmap(eighth, w, h, true); eighth.recycle()
        val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        val kf = amount * 0.95f  // fine edge acuity
        val kc = amount * 0.38f  // large-radius local contrast ("pop")
        // Process in row strips so peak memory stays tiny (a few MB) instead of ~3×full-res int
        // arrays — avoids the GC pauses that could jank the render thread while we work.
        val rows = 128
        val o = IntArray(w * rows); val f = IntArray(w * rows); val c = IntArray(w * rows)
        var y = 0
        while (y < h) {
            val hh = minOf(rows, h - y); val n = w * hh
            src.getPixels(o, 0, w, 0, y, w, hh)
            blurFine.getPixels(f, 0, w, 0, y, w, hh)
            blurCoarse.getPixels(c, 0, w, 0, y, w, hh)
            for (i in 0 until n) {
                val oo = o[i]; val ff = f[i]; val cc = c[i]
                val or = oo shr 16 and 0xFF; val og = oo shr 8 and 0xFF; val ob = oo and 0xFF
                // Luminance of original and of both blurs (Rec.601 weights).
                val lo = (or * 77 + og * 150 + ob * 29) shr 8
                val lf = ((ff shr 16 and 0xFF) * 77 + (ff shr 8 and 0xFF) * 150 + (ff and 0xFF) * 29) shr 8
                val lc = ((cc shr 16 and 0xFF) * 77 + (cc shr 8 and 0xFF) * 150 + (cc and 0xFF) * 29) shr 8
                // Sharpen delta lives entirely on luminance, then is added equally to each channel.
                val delta = kf * (lo - lf) + kc * (lo - lc)
                val r = (or + delta).toInt().coerceIn(0, 255)
                val g = (og + delta).toInt().coerceIn(0, 255)
                val bb = (ob + delta).toInt().coerceIn(0, 255)
                o[i] = (0xFF shl 24) or (r shl 16) or (g shl 8) or bb
            }
            out.setPixels(o, 0, w, 0, y, w, hh)
            y += hh
        }
        blurFine.recycle(); blurCoarse.recycle(); src.recycle()
        return out
    }

    private fun saveJpeg(jpeg: ByteArray): android.net.Uri {
        val name = "GlassCam_${System.currentTimeMillis()}.jpg"
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, name)
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/GlassCam")
        }
        val uri = appContext.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
            ?: throw IllegalStateException("Не удалось сохранить снимок")
        appContext.contentResolver.openOutputStream(uri)?.use { it.write(jpeg) }
        return uri
    }

    // --- video ---
    fun startRecording(onEvent: (Boolean) -> Unit) {
        val vc = videoCapture ?: return
        val name = "GlassCam_${System.currentTimeMillis()}.mp4"
        val values = ContentValues().apply {
            put(MediaStore.Video.Media.DISPLAY_NAME, name)
            put(MediaStore.Video.Media.MIME_TYPE, "video/mp4")
            put(MediaStore.Video.Media.RELATIVE_PATH, "Movies/GlassCam")
        }
        val output = MediaStoreOutputOptions.Builder(appContext.contentResolver, MediaStore.Video.Media.EXTERNAL_CONTENT_URI)
            .setContentValues(values).build()
        activeRecording = vc.output.prepareRecording(appContext, output)
            .start(ContextCompat.getMainExecutor(appContext)) { event ->
                when (event) {
                    is VideoRecordEvent.Start -> { recording = true; onEvent(true) }
                    is VideoRecordEvent.Finalize -> { recording = false; onEvent(false) }
                }
            }
    }

    fun stopRecording() { activeRecording?.stop(); activeRecording = null }

    private fun rotate(src: Bitmap, degrees: Int): Bitmap {
        if (degrees == 0) return src
        return Bitmap.createBitmap(src, 0, 0, src.width, src.height, Matrix().apply { postRotate(degrees.toFloat()) }, true)
    }

    private fun scaleTo(src: Bitmap, maxSide: Int): Bitmap {
        val longest = maxOf(src.width, src.height)
        if (longest <= maxSide) return src
        val s = maxSide.toFloat() / longest
        return Bitmap.createScaledBitmap(src, (src.width * s).toInt(), (src.height * s).toInt(), true)
    }
}
