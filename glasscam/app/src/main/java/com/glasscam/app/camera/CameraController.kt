package com.glasscam.app.camera

import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import android.provider.MediaStore
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.ImageProxy
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.glasscam.app.filters.FilterPreset
import kotlinx.coroutines.suspendCancellableCoroutine
import java.io.ByteArrayOutputStream
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException

/** Wraps CameraX preview + capture, lens/flash state, filtered save and JPEG grab for AI. */
class CameraController(private val appContext: Context) {

    var lensBack: Boolean = true
        private set
    var flashOn: Boolean = false
        private set

    private var imageCapture: ImageCapture? = null
    private var provider: ProcessCameraProvider? = null

    fun bind(owner: LifecycleOwner, previewView: PreviewView, onBound: () -> Unit = {}) {
        val future = ProcessCameraProvider.getInstance(appContext)
        future.addListener({
            val cameraProvider = future.get()
            provider = cameraProvider
            val preview = Preview.Builder().build().also {
                it.setSurfaceProvider(previewView.surfaceProvider)
            }
            val capture = ImageCapture.Builder()
                .setCaptureMode(ImageCapture.CAPTURE_MODE_MINIMIZE_LATENCY)
                .setFlashMode(if (flashOn) ImageCapture.FLASH_MODE_ON else ImageCapture.FLASH_MODE_OFF)
                .build()
            imageCapture = capture
            val selector =
                if (lensBack) CameraSelector.DEFAULT_BACK_CAMERA else CameraSelector.DEFAULT_FRONT_CAMERA
            try {
                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(owner, selector, preview, capture)
            } catch (_: Exception) {
            }
            onBound()
        }, ContextCompat.getMainExecutor(appContext))
    }

    fun toggleLens(owner: LifecycleOwner, previewView: PreviewView) {
        lensBack = !lensBack
        bind(owner, previewView)
    }

    fun cycleFlash(owner: LifecycleOwner, previewView: PreviewView) {
        flashOn = !flashOn
        bind(owner, previewView)
    }

    /** Grab a single JPEG frame in memory (used for Gemini analysis). */
    suspend fun captureJpeg(): ByteArray = suspendCancellableCoroutine { cont ->
        val capture = imageCapture ?: run {
            cont.resumeWithException(IllegalStateException("Камера не готова"))
            return@suspendCancellableCoroutine
        }
        capture.takePicture(
            ContextCompat.getMainExecutor(appContext),
            object : ImageCapture.OnImageCapturedCallback() {
                override fun onCaptureSuccess(image: ImageProxy) {
                    try {
                        cont.resume(image.toJpegBytes())
                    } catch (e: Exception) {
                        cont.resumeWithException(e)
                    } finally {
                        image.close()
                    }
                }

                override fun onError(exc: ImageCaptureException) {
                    cont.resumeWithException(exc)
                }
            },
        )
    }

    /** Capture, apply [filter], and save to the shared gallery. Returns the display name. */
    suspend fun capturePhoto(filter: FilterPreset): String {
        val jpeg = captureJpeg()
        val processed = applyFilter(jpeg, filter)
        return saveToGallery(processed)
    }

    private fun applyFilter(jpeg: ByteArray, filter: FilterPreset): ByteArray {
        if (filter.isIdentity) return jpeg
        val src = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.size) ?: return jpeg
        val out = Bitmap.createBitmap(src.width, src.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(out)
        val paint = Paint().apply {
            colorFilter = ColorMatrixColorFilter(ColorMatrix(filter.matrix.copyOf()))
        }
        canvas.drawBitmap(src, 0f, 0f, paint)
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
}

private fun ImageProxy.toJpegBytes(): ByteArray {
    // ImageCapture with default JPEG output: plane 0 already holds encoded JPEG.
    val buffer = planes[0].buffer
    val bytes = ByteArray(buffer.remaining())
    buffer.get(bytes)
    return bytes
}
