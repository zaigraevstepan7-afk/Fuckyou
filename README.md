# Wear Браузер

Автономный веб-браузер для Wear OS 4 (OnePlus Watch, Pixel Watch, Galaxy Watch и др.) с поиском Google.

## Возможности

- **Поиск Google** — голосовой ввод или клавиатура часов; запрос уходит в `google.com/search`, а если ввести адрес сайта — он откроется напрямую.
- **Закладки** на главном экране: Google, YouTube, Википедия, Переводчик, Новости.
- **История** последних 10 страниц с кнопкой очистки.
- **Прокрутка вращающейся коронкой** OnePlus Watch (и безелем на других часах).
- **Тёмный режим страниц** (algorithmic darkening) — экономит AMOLED-экран.
- Работает **автономно**, телефон не нужен (`com.google.android.wearable.standalone`).
- Регистрируется как обработчик ссылок `http/https` — внешние ссылки на часах открываются в этом браузере.

## Структура

- `app/src/main/java/com/zaigraev/wearbrowser/MainActivity.kt` — главный экран (Compose for Wear OS): поиск, закладки, история.
- `app/src/main/java/com/zaigraev/wearbrowser/BrowserActivity.kt` — WebView с прогресс-баром, прокруткой коронкой и навигацией «назад» по истории страниц.
- `app/src/main/java/com/zaigraev/wearbrowser/UrlUtils.kt` — превращение ввода в URL или поисковый запрос Google.
- `app/src/main/java/com/zaigraev/wearbrowser/HistoryStore.kt` — история в SharedPreferences.

## Сборка

Нужны JDK 17 и Android SDK (compileSdk 34). Проще всего открыть проект в Android Studio, либо из консоли:

```bash
./gradlew :app:assembleDebug
# APK: app/build/outputs/apk/debug/app-debug.apk
```

## Установка на OnePlus Watch (Wear OS 4)

1. На часах: **Настройки → О часах →** нажать 7 раз на **Номер сборки** (включатся параметры разработчика).
2. **Настройки → Параметры разработчика → Отладка по Wi-Fi** → включить.
3. Выбрать **«Подключить устройство»** — часы покажут код и адрес `IP:порт`.
4. На компьютере (часы и ПК в одной Wi-Fi сети):
   ```bash
   adb pair <IP>:<порт-пары> <код>
   adb connect <IP>:<порт>
   adb install app/build/outputs/apk/debug/app-debug.apk
   ```
5. Запустить «Wear Браузер» из списка приложений на часах.

## Управление

- **Коронка** — прокрутка страницы.
- **Свайп/кнопка назад** — на страницу назад, затем выход на главный экран.
- **Двойной тап** — зум (стандартный жест WebView).
