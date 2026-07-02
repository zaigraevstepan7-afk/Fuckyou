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
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.ImageProxy
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.glasscam.app.filters.FilterPreset
import com.glasscam.app.filters.composeMatrices
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.ByteArrayOutputStream
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/**
 * CameraX wrapper: live preview, still capture (with filter + save), continuous downscaled
 * frames for the AI-compose loop (ImageAnalysis), plus zoom / lens / flash control.
 */
class CameraController(private val appContext: Context) {

    var lensBack: Boolean = true
        private set
    var flashOn: Boolean = false
        private set
    var maxZoom: Float = 8f
        private set
    var minZoom: Float = 1f
        private set

    private var imageCapture: ImageCapture? = null
    private var camera: androidx.camera.core.Camera? = null
    private val analysisExecutor = Executors.newSingleThreadExecutor()
    private val latestJpeg = AtomicReference<ByteArray?>(null)
    @Volatile private var lastEncodeMs = 0L

    /** Latest small JPEG frame captured off the preview stream (for AI). */
    fun latestFrame(): ByteArray? = latestJpeg.get()

    fun bind(owner: LifecycleOwner, previewView: PreviewView, onBound: () -> Unit = {}) {
        val future = ProcessCameraProvider.getInstance(appContext)
        future.addListener({
            val provider = future.get()
            val preview = Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
            val capture = ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                .setFlashMode(if (flashOn) ImageCapture.FLASH_MODE_ON else ImageCapture.FLASH_MODE_OFF)
                .build()
            imageCapture = capture

            val analysis = ImageAnalysis.Builder()
                .setBackpressureStrategy(ImageAnalysis.STRATEGY_KEEP_ONLY_LATEST)
                .setOutputImageFormat(ImageAnalysis.OUTPUT_IMAGE_FORMAT_YUV_420_888)
                .build()
                .also { it.setAnalyzer(analysisExecutor, ::onFrame) }

            val selector =
                if (lensBack) CameraSelector.DEFAULT_BACK_CAMERA else CameraSelector.DEFAULT_FRONT_CAMERA
            try {
                provider.unbindAll()
                camera = provider.bindToLifecycle(owner, selector, preview, capture, analysis)
                camera?.cameraInfo?.zoomState?.value?.let {
                    maxZoom = it.maxZoomRatio
                    minZoom = it.minZoomRatio
                }
            } catch (_: Exception) {
            }
            onBound()
        }, ContextCompat.getMainExecutor(appContext))
    }

    private fun onFrame(image: ImageProxy) {
        try {
            val now = System.currentTimeMillis()
            if (now - lastEncodeMs < 450) return // throttle: at most ~2 fps encoding
            lastEncodeMs = now
            val bmp = image.toBitmap()
            val rotated = rotate(bmp, image.imageInfo.rotationDegrees)
            val scaled = scaleTo(rotated, 640)
            val bos = ByteArrayOutputStream()
            scaled.compress(Bitmap.CompressFormat.JPEG, 72, bos)
            latestJpeg.set(bos.toByteArray())
            if (scaled !== rotated) scaled.recycle()
            if (rotated !== bmp) rotated.recycle()
            bmp.recycle()
        } catch (_: Exception) {
        } finally {
            image.close()
        }
    }

    // --- zoom / lens / flash ---------------------------------------------------------------

    /** Absolute zoom ratio, clamped to the device range. Used for smooth animated zoom & pinch. */
    fun setZoomAbsolute(ratio: Float) {
        camera?.cameraControl?.setZoomRatio(ratio.coerceIn(minZoom, maxZoom))
    }

    fun currentZoom(): Float = camera?.cameraInfo?.zoomState?.value?.zoomRatio ?: 1f

    fun toggleLens(owner: LifecycleOwner, previewView: PreviewView) {
        lensBack = !lensBack
        bind(owner, previewView)
    }

    fun cycleFlash(owner: LifecycleOwner, previewView: PreviewView) {
        flashOn = !flashOn
        bind(owner, previewView)
    }

    // --- capture ---------------------------------------------------------------------------

    suspend fun captureJpeg(): ByteArray = suspendCancellableCoroutine { cont ->
        val capture = imageCapture ?: run {
            cont.resumeWithException(IllegalStateException("Камера не готова")); return@suspendCancellableCoroutine
        }
        capture.takePicture(
            ContextCompat.getMainExecutor(appContext),
            object : ImageCapture.OnImageCapturedCallback() {
                override fun onCaptureSuccess(image: ImageProxy) {
                    try {
                        val bmp = rotate(image.toBitmap(), image.imageInfo.rotationDegrees)
                        val bos = ByteArrayOutputStream()
                        bmp.compress(Bitmap.CompressFormat.JPEG, 95, bos)
                        bmp.recycle()
                        cont.resume(bos.toByteArray())
                    } catch (e: Exception) {
                        cont.resumeWithException(e)
                    } finally {
                        image.close()
                    }
                }

                override fun onError(exc: ImageCaptureException) = cont.resumeWithException(exc)
            },
        )
    }

    /** Capture a still. Optionally compose an AI-enhance matrix under the chosen [filter]. */
    suspend fun capturePhoto(filter: FilterPreset, enhanceMatrix: FloatArray? = null): String {
        return processAndSave(captureJpeg(), filter, enhanceMatrix)
    }

    /** Apply [filter] (and optional AI-enhance matrix) to an already captured JPEG and save it. */
    fun processAndSave(jpeg: ByteArray, filter: FilterPreset, enhanceMatrix: FloatArray?): String {
        val matrix = combinedMatrix(filter, enhanceMatrix)
        val processed = if (matrix == null) jpeg else applyMatrix(jpeg, matrix)
        return saveToGallery(processed)
    }

    private fun combinedMatrix(filter: FilterPreset, enhance: FloatArray?): FloatArray? = when {
        enhance == null && filter.isIdentity -> null
        enhance == null -> filter.matrix.copyOf()
        filter.isIdentity -> enhance.copyOf()
        else -> composeMatrices(enhance, filter.matrix) // enhance first, then filter
    }

    private fun applyMatrix(jpeg: ByteArray, matrix: FloatArray): ByteArray {
        val src = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.size) ?: return jpeg
        val out = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
        Canvas(out).drawBitmap(src, 0f, 0f, Paint().apply {
            colorFilter = ColorMatrixColorFilter(ColorMatrix(matrix.copyOf()))
        })
        val bos = ByteArrayOutputStream()
        out.compress(Bitmap.CompressFormat.JPEG, 95, bos)
        src.recycle(); out.recycle()
        return bos.toByteArray()
    }

    private fun saveToGallery(jpeg: ByteArray): String {
        val name = "GlassCam_${System.currentTimeMillis()}.jpg"
        val values = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, name)
            put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg")
            put(MediaStore.Images.Media.RELATIVE_PATH, "Pictures/GlassCam")
        }
        val resolver = appContext.contentResolver
        val uri = resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values)
            ?: throw IllegalStateException("Не удалось сохранить снимок")
        resolver.openOutputStream(uri)?.use { it.write(jpeg) }
        return name
    }

    private fun rotate(src: Bitmap, degrees: Int): Bitmap {
        if (degrees == 0) return src
        val m = Matrix().apply { postRotate(degrees.toFloat()) }
        return Bitmap.createBitmap(src, 0, 0, src.width, src.height, m, true)
    }

    private fun scaleTo(src: Bitmap, maxSide: Int): Bitmap {
        val longest = maxOf(src.width, src.height)
        if (longest <= maxSide) return src
        val scale = maxSide.toFloat() / longest
        return Bitmap.createScaledBitmap(src, (src.width * scale).toInt(), (src.height * scale).toInt(), true)
    }
}
