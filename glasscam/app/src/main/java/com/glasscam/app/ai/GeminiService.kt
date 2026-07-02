package com.glasscam.app.ai

import android.util.Base64
import com.glasscam.app.BuildConfig
import com.glasscam.app.filters.EnhanceParams
import com.glasscam.app.filters.PhotoEffects
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import java.util.concurrent.TimeUnit

/**
 * Gemini generateContent REST client. The AI fully drives the camera: it inspects a frame and
 * returns scene/advice/hint, its own custom color grade (+ sharpen/grain), a framing rectangle,
 * a suggested zoom and a "ready to shoot" flag. Key/model come from BuildConfig.
 */
object GeminiService {

    private const val ENDPOINT = "https://generativelanguage.googleapis.com/v1beta/models"
    private val JSON = "application/json; charset=utf-8".toMediaType()

    private val client = OkHttpClient.Builder()
        .connectTimeout(15, TimeUnit.SECONDS)
        .readTimeout(45, TimeUnit.SECONDS)
        .build()

    fun hasKey(): Boolean = BuildConfig.GEMINI_API_KEY.isNotBlank()

    private val composePrompt = """
        Ты — ИИ-оператор камеры (режим умной съёмки). Проанализируй кадр и полностью управляй съёмкой.
        Сам подбери красивый естественный цветокор (не пресет). Ответь СТРОГО одним JSON на русском,
        без markdown:
        {
          "scene": "<что в кадре, свет, цвет — до 12 слов>",
          "advice": "<совет по компоновке, 1 короткое предложение>",
          "hint": "<куда навести, 2-4 слова>",
          "grade_label": "<короткое имя стиля, напр. 'Тёплый плёночный'>",
          "grade": {"exposure": <-1..1>, "contrast": <0.7..1.4>, "saturation": <0.6..1.6>,
                    "warmth": <-1..1>, "shadows": <-1..1>, "sharpen": <0..1>, "grain": <0..1>},
          "effects": {"bloom": <0..1>, "vignette": <0..1>, "glow_warmth": <-1..1>,
                      "grain": <0..1>, "chroma": <0..1>, "clarity": <0..1>,
                      "label": "<имя эффекта, напр. 'Золотой час'>"},
          "frame": {"x": <0..1>, "y": <0..1>, "w": <0..1>, "h": <0..1>},
          "zoom": <1..8>,
          "ready": <true|false>
        }
        effects — творческий набор эффектов ПОД ЭТУ сцену (ты сам собираешь «шейдер» момента):
        bloom — мягкое свечение бликов, vignette — затемнение краёв, glow_warmth — тепло свечения,
        grain — плёночное зерно, chroma — лёгкая дисперсия по краям, clarity — локальный контраст.
        Подбирай эффекты осмысленно: закат — тёплый bloom и vignette; ночь/неон — chroma и лёгкое зерно;
        портрет — мягкий bloom и vignette; пейзаж — clarity. Не переусердствуй, фото должно быть красивым.
        ВАЖНО про цвет и свет — не порти кадр:
        - НЕ пересвечивай: если сцена уже светлая, exposure держи около 0 или МИНУС; никогда не более 0.15.
        - Баланс белого: если сцена уже тёплая (лампы накаливания, дерево, закат) — warmth 0 или ОТРИЦАТЕЛЬНЫЙ,
          чтобы убрать лишнюю желтизну/оранжевость. Тёплое делай теплее ТОЛЬКО если кадр холодный.
        - saturation держи естественной (1.0..1.25), не перекручивай. bloom на светлых сценах ≤0.15.
        Цель — чистый, реалистичный, приятный кадр, без пересвета и без оранжевого налёта.
        frame — рекомендованная рамка кадрирования (доли). zoom — рекомендованный зум.
        ready=true только если кадр уже хорошо скомпонован и стоит снимать сейчас.
    """.trimIndent()

    suspend fun analyzeCompose(jpeg: ByteArray): Result<ComposeResult> = withContext(Dispatchers.IO) {
        if (!hasKey()) return@withContext Result.failure(IllegalStateException("NO_KEY"))
        try {
            val text = request(jpeg, composePrompt).getOrElse { return@withContext Result.failure(it) }
            Result.success(parseCompose(text))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /** Standalone gentle enhancement params (used when AI-compose is off). */
    suspend fun suggestEnhancement(jpeg: ByteArray): Result<EnhanceParams> = withContext(Dispatchers.IO) {
        if (!hasKey()) return@withContext Result.failure(IllegalStateException("NO_KEY"))
        try {
            val prompt = "Ты — ИИ-ретушёр. Предложи мягкую естественную коррекцию фото. Ответь СТРОГО JSON: " +
                "{\"exposure\":<-1..1>,\"contrast\":<0.7..1.4>,\"saturation\":<0.6..1.6>,\"warmth\":<-1..1>," +
                "\"shadows\":<-1..1>,\"sharpen\":<0..1>,\"grain\":<0..1>}"
            val text = request(jpeg, prompt).getOrElse { return@withContext Result.failure(it) }
            Result.success(parseGrade(extractJson(text)))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun request(jpeg: ByteArray, prompt: String): Result<String> {
        val b64 = Base64.encodeToString(jpeg, Base64.NO_WRAP)
        val body = JSONObject().apply {
            put("contents", org.json.JSONArray().put(JSONObject().apply {
                put("parts", org.json.JSONArray()
                    .put(JSONObject().put("text", prompt))
                    .put(JSONObject().put("inline_data", JSONObject()
                        .put("mime_type", "image/jpeg").put("data", b64))))
            }))
            put("generationConfig", JSONObject().put("responseMimeType", "application/json").put("temperature", 0.5))
        }.toString()
        val url = "$ENDPOINT/${BuildConfig.GEMINI_MODEL}:generateContent?key=${BuildConfig.GEMINI_API_KEY}"
        val req = Request.Builder().url(url).post(body.toRequestBody(JSON)).build()
        return try {
            client.newCall(req).execute().use { resp ->
                val text = resp.body?.string().orEmpty()
                if (!resp.isSuccessful) Result.failure(RuntimeException(friendlyError(resp.code)))
                else Result.success(text)
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    private fun friendlyError(code: Int): String = when (code) {
        400 -> "Ошибка запроса к Gemini"
        403 -> "Ключ Gemini отклонён (403)"
        429 -> "Лимит Gemini исчерпан, подождите"
        else -> "Gemini: HTTP $code"
    }

    private fun extractJson(responseJson: String): JSONObject {
        val partText = JSONObject(responseJson).getJSONArray("candidates").getJSONObject(0)
            .getJSONObject("content").getJSONArray("parts").getJSONObject(0).getString("text")
        return JSONObject(partText.trim().removePrefix("```json").removePrefix("```").removeSuffix("```").trim())
    }

    private fun parseGrade(o: JSONObject): EnhanceParams = EnhanceParams(
        exposure = o.optDouble("exposure", 0.0).toFloat(),
        contrast = o.optDouble("contrast", 1.0).toFloat(),
        saturation = o.optDouble("saturation", 1.0).toFloat(),
        warmth = o.optDouble("warmth", 0.0).toFloat(),
        shadows = o.optDouble("shadows", 0.0).toFloat(),
        sharpen = o.optDouble("sharpen", 0.0).toFloat(),
        grain = o.optDouble("grain", 0.0).toFloat(),
    )

    private fun parseEffects(o: JSONObject): PhotoEffects = PhotoEffects(
        bloom = o.optDouble("bloom", 0.0).toFloat().coerceIn(0f, 1f),
        vignette = o.optDouble("vignette", 0.0).toFloat().coerceIn(0f, 1f),
        glowWarmth = o.optDouble("glow_warmth", 0.0).toFloat().coerceIn(-1f, 1f),
        grain = o.optDouble("grain", 0.0).toFloat().coerceIn(0f, 1f),
        chroma = o.optDouble("chroma", 0.0).toFloat().coerceIn(0f, 1f),
        clarity = o.optDouble("clarity", 0.0).toFloat().coerceIn(0f, 1f),
        label = o.optString("label", "").trim(),
    )

    private fun parseCompose(responseJson: String): ComposeResult {
        val obj = extractJson(responseJson)
        val gradeObj = obj.optJSONObject("grade") ?: JSONObject()
        val effects = obj.optJSONObject("effects")?.let { parseEffects(it) } ?: PhotoEffects.auto()
        val frame = obj.optJSONObject("frame")?.let {
            // keep the frame a sensible sub-rect (never full-screen) and inside bounds
            val fw = it.optDouble("w", 0.62).toFloat().coerceIn(0.35f, 0.8f)
            val fh = it.optDouble("h", 0.62).toFloat().coerceIn(0.35f, 0.8f)
            val fx = it.optDouble("x", 0.19).toFloat().coerceIn(0f, 1f - fw)
            val fy = it.optDouble("y", 0.19).toFloat().coerceIn(0f, 1f - fh)
            NormRect(fx, fy, fw, fh)
        }
        val zoom = if (obj.has("zoom")) obj.optDouble("zoom", 1.0).toFloat().coerceIn(1f, 10f) else null
        return ComposeResult(
            scene = obj.optString("scene", "").trim(),
            advice = obj.optString("advice", "").trim(),
            hint = obj.optString("hint", "").trim(),
            grade = parseGrade(gradeObj),
            gradeLabel = obj.optString("grade_label", "").trim(),
            frame = frame,
            zoom = zoom,
            ready = obj.optBoolean("ready", false),
            effects = effects,
        )
    }
}
