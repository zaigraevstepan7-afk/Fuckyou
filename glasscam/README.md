# GlassCam — камера в стиле Liquid Glass на Gemini

Своя Android-камера «по типу Doka», написанная с нуля: **Kotlin + Jetpack Compose + CameraX**,
интерфейс целиком в стиле **Liquid Glass** (полупрозрачное «стекло» с бликами), ИИ-функции на
**Gemini `gemini-3.1-flash-lite`**. Язык интерфейса — русский.

## Возможности (v1)
- Камера: превью, съёмка, смена камеры, вспышка (CameraX).
- **ИИ-анализ кадра** (кнопка ✨): текущий кадр уходит в Gemini, приходит совет по компоновке,
  настроение сцены и рекомендованный фильтр — в стеклянной карточке.
- Локальные фильтры (ColorMatrix): Ориг, Ярко, Тепло, Холод, Плёнка, Ч/Б — применяются к снимку.
- Галерея снятых кадров (MediaStore, `Pictures/GlassCam`).
- Дизайн-система Liquid Glass: `glass/LiquidGlass.kt` (`liquidGlass()`-модификатор, `GlassCard`,
  `GlassCapsuleBar`, `GlassIconButton`, `GlassShutter`).

## Ключ Gemini (важно, секрет)
Ключ **не хранится в коде и не коммитится**. Он читается из `local.properties`:
```
sdk.dir=/opt/android-sdk
GEMINI_API_KEY=ВАШ_КЛЮЧ
```
и попадает в `BuildConfig.GEMINI_API_KEY` (см. `app/build.gradle.kts`). Модель — `BuildConfig.GEMINI_MODEL`
(`gemini-3.1-flash-lite`). `local.properties` в `.gitignore`.
> Ключ, присланный в чат, считается скомпрометированным — перевыпустите его в Google AI Studio.

## Сборка
Нужен Android SDK (platform 35, build-tools 35) и Gradle 8.9+/JDK 17+.
```
# один раз укажите путь к SDK и ключ в local.properties
ANDROID_HOME=/opt/android-sdk gradle assembleDebug      # debug APK
ANDROID_HOME=/opt/android-sdk gradle assembleRelease     # release (без подписи)
# APK: app/build/outputs/apk/...
```
Debug-APK уже подписан debug-ключом и ставится сразу. Release-APK нужно подписать `apksigner`.

## Структура
```
app/src/main/java/com/glasscam/app/
  MainActivity.kt            — разрешения + навигация (камера/галерея)
  glass/LiquidGlass.kt       — дизайн-система Liquid Glass
  camera/CameraController.kt — CameraX: превью, съёмка, фильтр, сохранение
  camera/CameraScreen.kt     — экран камеры со стеклянными контролами
  ai/GeminiService.kt        — REST-вызов Gemini (кадр + промпт → JSON)
  ai/AiModels.kt, AiPanel.kt — модель ответа и карточка результата
  filters/Filters.kt         — ColorMatrix-пресеты
  gallery/GalleryScreen.kt   — сетка снимков (Coil)
  ui/Theme.kt                — тёмная тема Material3
```

## Ограничения v1
Живой предпросмотр фильтра не накладывается на поток камеры (фильтр применяется к снимку) —
это упрощение MVP. Нет плёночных LUT, подписки, вотермарок — при желании добавляется дальше.
