package com.glasscam.app.ai

import android.util.Base64
import com.glasscam.app.BuildConfig
import com.glasscam.app.filters.EnhanceParams
import com.glasscam.app.filters.FilterPresets
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.util.concurrent.TimeUnit

/**
 * Gemini generateContent REST client. Sends a camera frame + a Russian prompt and expects
 * a compact JSON object describing the scene, a composition tip, a recommended film filter,
 * an aiming hint and a suggested framing rectangle. Key/model come from BuildConfig.
 */
object GeminiService {

    private const val ENDPOINT = "https://generativelanguage.googleapis.com/v1beta/models"
    private val JSON = "application/json; charset=utf-8".toMediaType()

    private val client = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(45, TimeUnit.SECONDS)
        .build()

    fun hasKey(): Boolean = BuildConfig.GEMINI_API_KEY.isNotBlank()

    private val allowedFilters: String get() = FilterPresets.all.joinToString(", ") { it.id }

    private fun prompt(): String = """
        Ты — ИИ-ассистент фотографа в режиме умной компоновки (как в приложении-камере).
        Проанализируй кадр с камеры телефона и помоги снять лучший кадр.
        Ответь СТРОГО одним JSON-объектом на русском языке, без markdown и пояснений:
        {
          "scene": "<что в кадре, свет и цвета, до 12 слов>",
          "advice": "<совет по компоновке, 1 короткое предложение>",
          "hint": "<куда навести/какой зум, 2-4 слова, напр. 'Наведите выше' или 'Приблизьте 2x'>",
          "filter": "<один id из: $allowedFilters>",
          "filter_label": "<короткое имя плёнки/фильтра для показа, напр. 'F 160C' или 'Тёплый'>",
          "frame": {"x": <0..1>, "y": <0..1>, "w": <0..1>, "h": <0..1>}
        }
        frame — рекомендованная рамка кадрирования в долях ширины/высоты (левый верхний угол x,y и размер w,h).
    """.trimIndent()

    /** Analyze one JPEG frame. Fast path used by the continuous AI-compose loop. */
    suspend fun analyzeCompose(jpeg: ByteArray): Result<ComposeResult> = withContext(Dispatchers.IO) {
        if (!hasKey()) return@withContext Result.failure(IllegalStateException("NO_KEY"))
        try {
            val b64 = Base64.encodeToString(jpeg, Base64.NO_WRAP)
            val body = JSONObject().apply {
                put("contents", org.json.JSONArray().put(JSONObject().apply {
                    put("parts", org.json.JSONArray()
                        .put(JSONObject().put("text", prompt()))
                        .put(JSONObject().put("inline_data", JSONObject()
                            .put("mime_type", "image/jpeg")
                            .put("data", b64))))
                }))
                put("generationConfig", JSONObject()
                    .put("responseMimeType", "application/json")
                    .put("temperature", 0.6))
            }.toString()

            val url = "$ENDPOINT/${BuildConfig.GEMINI_MODEL}:generateContent?key=${BuildConfig.GEMINI_API_KEY}"
            val request = Request.Builder().url(url).post(body.toRequestBody(JSON)).build()
            client.newCall(request).execute().use { resp ->
                val text = resp.body?.string().orEmpty()
                if (!resp.isSuccessful) {
                    return@withContext Result.failure(RuntimeException(friendlyError(resp.code, text)))
                }
                Result.success(parse(text))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private val enhancePrompt = """
        Ты — ИИ-ретушёр. Оцени фотографию и предложи мягкую естественную коррекцию,
        как хорошая камера (без пересыщения). Ответь СТРОГО одним JSON-объектом:
        {"exposure": <-1..1>, "contrast": <0.7..1.4>, "saturation": <0.6..1.6>,
         "warmth": <-1..1>, "shadows": <-1..1>, "highlights": <-1..1>}
        exposure/shadows поднимают яркость и тени, warmth>0 — теплее, contrast и saturation — множители.
    """.trimIndent()

    /** Ask Gemini (vision) for gentle correction params for a captured photo. */
    suspend fun suggestEnhancement(jpeg: ByteArray): Result<EnhanceParams> = withContext(Dispatchers.IO) {
        if (!hasKey()) return@withContext Result.failure(IllegalStateException("NO_KEY"))
        try {
            val b64 = Base64.encodeToString(jpeg, Base64.NO_WRAP)
            val body = JSONObject().apply {
                put("contents", org.json.JSONArray().put(JSONObject().apply {
                    put("parts", org.json.JSONArray()
                        .put(JSONObject().put("text", enhancePrompt))
                        .put(JSONObject().put("inline_data", JSONObject()
                            .put("mime_type", "image/jpeg").put("data", b64))))
                }))
                put("generationConfig", JSONObject()
                    .put("responseMimeType", "application/json").put("temperature", 0.3))
            }.toString()
            val url = "$ENDPOINT/${BuildConfig.GEMINI_MODEL}:generateContent?key=${BuildConfig.GEMINI_API_KEY}"
            val request = Request.Builder().url(url).post(body.toRequestBody(JSON)).build()
            client.newCall(request).execute().use { resp ->
                val text = resp.body?.string().orEmpty()
                if (!resp.isSuccessful) return@withContext Result.failure(RuntimeException(friendlyError(resp.code, text)))
                val partText = JSONObject(text).getJSONArray("candidates").getJSONObject(0)
                    .getJSONObject("content").getJSONArray("parts").getJSONObject(0).getString("text")
                val o = JSONObject(partText.trim().removePrefix("```json").removePrefix("```").removeSuffix("```").trim())
                Result.success(EnhanceParams(
                    exposure = o.optDouble("exposure", 0.0).toFloat(),
                    contrast = o.optDouble("contrast", 1.0).toFloat(),
                    saturation = o.optDouble("saturation", 1.0).toFloat(),
                    warmth = o.optDouble("warmth", 0.0).toFloat(),
                    shadows = o.optDouble("shadows", 0.0).toFloat(),
                    highlights = o.optDouble("highlights", 0.0).toFloat(),
                ))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun friendlyError(code: Int, body: String): String = when (code) {
        400 -> "Ошибка запроса к Gemini (проверьте ключ)"
        403 -> "Ключ Gemini отклонён (403)"
        429 -> "Слишком много запросов к Gemini, подождите"
        else -> "Gemini: HTTP $code"
    }

    private fun parse(responseJson: String): ComposeResult {
        val root = JSONObject(responseJson)
        val partText = root.getJSONArray("candidates")
            .getJSONObject(0).getJSONObject("content")
            .getJSONArray("parts").getJSONObject(0).getString("text")
        val obj = JSONObject(
            partText.trim().removePrefix("```json").removePrefix("```").removeSuffix("```").trim(),
        )
        val filterId = obj.optString("filter", "none").ifBlank { "none" }
        val preset = FilterPresets.byId(filterId)
        val frame = obj.optJSONObject("frame")?.let {
            NormRect(
                it.optDouble("x", 0.1).toFloat().coerceIn(0f, 1f),
                it.optDouble("y", 0.1).toFloat().coerceIn(0f, 1f),
                it.optDouble("w", 0.8).toFloat().coerceIn(0.1f, 1f),
                it.optDouble("h", 0.8).toFloat().coerceIn(0.1f, 1f),
            )
        }
        return ComposeResult(
            scene = obj.optString("scene", "").trim(),
            advice = obj.optString("advice", "").trim(),
            filterId = preset.id,
            filterLabel = obj.optString("filter_label", preset.label).ifBlank { preset.label },
            hint = obj.optString("hint", "").trim(),
            frame = frame,
        )
    }
}
