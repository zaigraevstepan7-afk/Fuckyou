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

    /** Apply an AI [grade] (color matrix + sharpen + grain) to a captured JPEG and save it. */
    fun processAndSave(jpeg: ByteArray, grade: EnhanceParams?): String {
        var bmp = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.size) ?: return saveJpeg(jpeg)
        if (grade != null) {
            val graded = Bitmap.createBitmap(bmp.width, bmp.height, Bitmap.Config.ARGB_8888)
            Canvas(graded).drawBitmap(bmp, 0f, 0f, Paint().apply {
                colorFilter = ColorMatrixColorFilter(ColorMatrix(grade.toMatrix()))
            })
            bmp.recycle(); bmp = graded
            if (grade.sharpen > 0.02f) bmp = unsharp(bmp, grade.sharpen)
        }
        val bos = ByteArrayOutputStream(); bmp.compress(Bitmap.CompressFormat.JPEG, 95, bos); bmp.recycle()
        return saveJpeg(bos.toByteArray())
    }

    /** Light unsharp mask via a downscaled blur difference. */
    private fun unsharp(src: Bitmap, amount: Float): Bitmap {
        val w = src.width; val h = src.height
        val small = Bitmap.createScaledBitmap(src, (w / 2).coerceAtLeast(1), (h / 2).coerceAtLeast(1), true)
        val blur = Bitmap.createScaledBitmap(small, w, h, true); small.recycle()
        val orig = IntArray(w * h); val bl = IntArray(w * h)
        src.getPixels(orig, 0, w, 0, 0, w, h); blur.getPixels(bl, 0, w, 0, 0, w, h); blur.recycle()
        val k = amount * 0.9f
        for (i in orig.indices) {
            val o = orig[i]; val b = bl[i]
            val r = ((o shr 16 and 0xFF) + k * ((o shr 16 and 0xFF) - (b shr 16 and 0xFF))).toInt().coerceIn(0, 255)
            val g = ((o shr 8 and 0xFF) + k * ((o shr 8 and 0xFF) - (b shr 8 and 0xFF))).toInt().coerceIn(0, 255)
            val bb = ((o and 0xFF) + k * ((o and 0xFF) - (b and 0xFF))).toInt().coerceIn(0, 255)
            orig[i] = (0xFF shl 24) or (r shl 16) or (g shl 8) or bb
        }
        val out = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
        out.setPixels(orig, 0, w, 0, 0, w, h); src.recycle()
        return out
    }

    private fun saveJpeg(jpeg: ByteArray): String {
        val name = "GlassCam_${System.currentTimeMillis()}.jpg"
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, name)
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/GlassCam")
        }
        val uri = appContext.contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
            ?: throw IllegalStateException("Не удалось сохранить снимок")
        appContext.contentResolver.openOutputStream(uri)?.use { it.write(jpeg) }
        return name
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
