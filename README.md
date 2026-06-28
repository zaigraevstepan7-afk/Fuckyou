# FuckYou — сторонний клиент Telegram

Лёгкий Android-клиент Telegram в духе «грам»-модов, но **легально и без рекламы**.
Построен на официальном открытом стеке Telegram (TDLib / MTProto), а не на
реверсе чужих приложений. Реклама не вырезается — её здесь просто нет by design.

## Что уже есть

- 📱 Нативное Android-приложение на Kotlin + Jetpack Compose.
- 🔐 Экран входа Telegram: телефон → код → пароль 2FA.
- 🗑️ **Анти-удаление** — сообщения, удалённые отправителем, сохраняются и
  помечаются «удалено отправителем».
- ✏️ **Анти-редактирование** — показывает исходный текст до правки.
- 👻 **Режим призрака** и **фейковый онлайн** (тумблеры в настройках мода).
- 🎨 Выбор акцентного цвета.
- ⚙️ Экран **«Настройки мода»** со всеми переключателями.
- 🤖 Сборка APK через **GitHub Actions** (artifact `fuckyou-debug-apk`).

Приложение полностью собирается и запускается уже сейчас: бэкенд по умолчанию —
`MockTelegramClient` (встроенные демо-чаты), который проигрывает удаление и
редактирование сообщения через несколько секунд после входа, чтобы фичи мода
было видно вживую.

## Сборка

### Через GitHub Actions (рекомендуется)
Любой push запускает workflow **Build APK**. Готовый APK лежит в артефактах
запуска (вкладка Actions → конкретный run → Artifacts → `fuckyou-debug-apk`).

### Локально
```bash
gradle wrapper --gradle-version 8.9
./gradlew :app:assembleDebug
# APK: app/build/outputs/apk/debug/app-debug.apk
```
Нужен JDK 17 и Android SDK (compileSdk 34).

## Включение реального входа в Telegram

Демо-бэкенд не ходит в сеть. Чтобы оживить настоящий вход и реальные чаты:

1. **Получи api_id / api_hash** бесплатно на <https://my.telegram.org> →
   *API development tools*. Пропиши их в `app/build.gradle.kts`:
   ```kotlin
   buildConfigField("int", "TG_API_ID", "123456")
   buildConfigField("String", "TG_API_HASH", "\"твой_хеш\"")
   ```
2. **Подключи нативную TDLib** для Android. Собери её из
   <https://github.com/tdlib/td> (раздел *Building → Android*) — получишь
   `libtdjni.so` под каждый ABI и Java-обёртку `org.drinkless.tdlib.Client`.
   Положи `.so` в `app/src/main/jniLibs/<abi>/`.
3. **Реализуй `TdLibTelegramClient`** — там размечены все TODO с нужными
   вызовами TdApi. Update `TdApi.UpdateDeleteMessages` маппится в
   `TgUpdate.MessageDeleted`, который и питает анти-удаление.
4. В `AppViewModel` замени `MockTelegramClient()` на `TdLibTelegramClient()`.

Архитектура построена вокруг интерфейса `TelegramClient`, поэтому UI и логика
мода менять не нужно — достаточно подставить рабочий бэкенд.

## Структура

```
app/src/main/java/com/fuckyou/app/
├── MainActivity.kt          навигация между экранами
├── AppViewModel.kt          состояние + логика анти-удаления/редактирования
├── data/ModSettings.kt      хранилище настроек мода (DataStore)
├── telegram/
│   ├── TelegramClient.kt    интерфейс бэкенда
│   ├── MockTelegramClient   рабочий демо-бэкенд (без сети)
│   ├── TdLibTelegramClient  реальный бэкенд на TDLib (точка интеграции)
│   └── Model.kt             Chat / Message / LoginState / TgUpdate
└── ui/                      экраны Compose (Login, ChatList, Chat, Settings)
```

## Лицензия и правовая база

Клиент использует официальный, поддерживаемый Telegram способ подключения
сторонних клиентов (открытый протокол MTProto / библиотека TDLib). Он не
содержит и не распространяет код других приложений.
