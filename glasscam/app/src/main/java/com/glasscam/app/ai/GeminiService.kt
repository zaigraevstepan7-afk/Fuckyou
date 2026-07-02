package com.glasscam.app.ai

import android.util.Base64
import com.glasscam.app.BuildConfig
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
 * Talks to the Gemini generateContent REST endpoint. Sends the current camera frame
 * plus a Russian prompt and expects a small JSON object back (composition tip, mood,
 * recommended filter). Key and model come from BuildConfig (local.properties).
 */
object GeminiService {

    private const val ENDPOINT = "https://generativelanguage.googleapis.com/v1beta/models"
    private val JSON = "application/json; charset=utf-8".toMediaType()

    private val client = OkHttpClient.Builder()
        .connectTimeout(20, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .build()

    fun hasKey(): Boolean = BuildConfig.GEMINI_API_KEY.isNotBlank()

    private val allowedFilters: String get() = FilterPresets.all.joinToString(", ") { it.id }

    private fun prompt(): String = """
        Ты — ассистент-фотограф. Проанализируй кадр с камеры телефона и дай короткий,
        практичный совет на русском языке. Ответь СТРОГО в формате JSON без пояснений:
        {"composition":"<совет по компоновке, 1-2 предложения>",
         "mood":"<настроение/свет сцены, до 5 слов>",
         "filter":"<один id из списка: $allowedFilters>"}
    """.trimIndent()

    suspend fun analyze(jpeg: ByteArray): Result<AiResult> = withContext(Dispatchers.IO) {
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
                    .put("temperature", 0.7))
            }.toString()

            val url = "$ENDPOINT/${BuildConfig.GEMINI_MODEL}:generateContent?key=${BuildConfig.GEMINI_API_KEY}"
            val request = Request.Builder().url(url).post(body.toRequestBody(JSON)).build()

            client.newCall(request).execute().use { resp ->
                val text = resp.body?.string().orEmpty()
                if (!resp.isSuccessful) {
                    return@withContext Result.failure(RuntimeException("HTTP ${resp.code}: $text"))
                }
                Result.success(parse(text))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun parse(responseJson: String): AiResult {
        val root = JSONObject(responseJson)
        val partText = root.getJSONArray("candidates")
            .getJSONObject(0).getJSONObject("content")
            .getJSONArray("parts").getJSONObject(0).getString("text")
        val obj = JSONObject(partText.trim().removePrefix("```json").removePrefix("```").removeSuffix("```").trim())
        val filterId = obj.optString("filter", "none").ifBlank { "none" }
        val preset = FilterPresets.byId(filterId)
        return AiResult(
            composition = obj.optString("composition", "").trim(),
            mood = obj.optString("mood", "").trim(),
            filterId = preset.id,
            filterLabel = preset.label,
        )
    }
}
