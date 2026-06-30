# Реверс-инжиниринг APK

Полная декомпиляция файла `app.apk` (исходный загруженный `c4a5ad62-1.apk`).
Сделано максимально глубоко: исходники Java, smali, ресурсы, сырой архив и анализ нативной библиотеки.

## Содержимое папки

| Папка | Что внутри | Чем сделано |
|-------|-----------|-------------|
| `jadx/` | Декомпилированные **Java-исходники** (`sources/`) + ресурсы (`resources/`), 1274 `.java` файла | jadx 1.5.5 (`--show-bad-code --deobf`) |
| `apktool/` | **smali**-код (1292 файла), декодированный `AndroidManifest.xml`, ресурсы `res/`, `apktool.yml` | apktool 2.11.1 |
| `raw/` | **Сырая распаковка** APK как ZIP — все 935 файлов «как есть» (dex, .so, сертификаты, assets) | unzip |
| `info/` | Сводный анализ: манифест, разрешения, сертификат, хэши, дерево, анализ нативной либы | вручную |

## Краткая сводка по APK

| Параметр | Значение |
|----------|----------|
| Имя пакета | `com.reddit.frontpage` *(заявлен как Reddit)* |
| versionName / versionCode | `4.1` / `41` |
| minSdk / targetSdk / compileSdk | 21 / 35 / 35 |
| DEX-файлы | `classes.dex`, `classes2.dex` |
| Нативные либы | `lib/arm64-v8a/libZeninCPP.so`, `lib/x86_64/libZeninCPP.so` (~6 МБ, ELF, stripped) |
| Подпись | Самоподписан **тестовым ключом AOSP** (`CN=Android, O=Android`, `android@android.com`), алгоритм SHA1withRSA |
| SHA-256 APK | `524c9135d43861f3c9ed690dcc20aa747164805d321e3c227faa2745a9af7115` |

### Разрешения
```
ACCESS_NETWORK_STATE
DUMP
INTERNET
MANAGE_EXTERNAL_STORAGE
QUERY_ALL_PACKAGES
READ_EXTERNAL_STORAGE
WRITE_EXTERNAL_STORAGE
```

### Компоненты (из манифеста)
- `com.reddit.frontpage.MainActivity` — главная активность (launcher)
- `com.reddit.frontpage.ConfigsActivity`
- `androidx.startup.InitializationProvider`
- `androidx.profileinstaller.ProfileInstallReceiver`

## Главный вывод анализа — защита Dex2C

Это **не оригинальный Reddit**, а перепакованное/модифицированное приложение:

1. **Подпись тестовым ключом AOSP** — приложение переподписано, не из Google Play.
2. **Dex2C / VMP-обфускация**. Ключевые классы (`MainActivity`, `ConfigsActivity`)
   помечены `JADX INFO: compiled from: Dex2C`. Почти все методы объявлены как
   `native`, а реальная логика вынесена в `libZeninCPP.so` и регистрируется
   динамически через `ZLoader.registerNativesForClass(...)` + `JNI_OnLoad`
   (поэтому в либе нет символов `Java_*`, только `JNI_OnLoad`).
3. **Шифрование строк.** Строки собираются в рантайме (`short[]`-таблицы +
   нативные геттеры вида `m4281()`, дешифраторы `C1122.m2840(...)`), поэтому в
   декомпилированном Java мало читаемого текста, а в `.so` строки хранятся
   зашифрованными — в открытом виде нет ни одного C2-URL.
4. В нативной библиотеке присутствуют признаки **сетевого слоя и крипто**:
   `HttpURLConnection`, `HttpsURLConnection`, `X509TrustManager`/`TrustManager`
   (возможен кастомный/отключённый TLS-pinning), `javax.crypto.spec.SecretKeySpec`.

`libZeninCPP.so` (имя «Zenin») и набор разрешений
(`MANAGE_EXTERNAL_STORAGE`, `QUERY_ALL_PACKAGES`, `DUMP`) указывают на загрузчик/
инжектор конфигов. Так как логика спрятана в нативе, статически из Java её не
восстановить — нужен анализ самой `libZeninCPP.so` (disassembler/IDA/Ghidra)
или динамический анализ (Frida).

## Как воспроизвести декомпиляцию

```bash
# Java-исходники
jadx --output-dir out_jadx --show-bad-code --deobf app.apk
# smali + ресурсы (нужна UTF-8 локаль для путей)
LANG=C.UTF-8 java -jar apktool.jar d -f -o out_apktool app.apk
# сырой архив
unzip app.apk -d out_raw
# нативный анализ
readelf -d  lib/arm64-v8a/libZeninCPP.so
nm -D       lib/arm64-v8a/libZeninCPP.so
strings -n6 lib/arm64-v8a/libZeninCPP.so
```

## Файлы анализа в `info/`
- `AndroidManifest.xml` — декодированный манифест
- `apktool.yml` — метаданные сборки (версии, doNotCompress и т.д.)
- `certificate.txt` — детали сертификата подписи
- `permissions.txt` — список разрешений
- `hashes.txt` — MD5/SHA1/SHA256 APK
- `tree.txt` — структура декомпиляции
- `native/` — ELF-заголовок, динамическая секция, дамп символов (779), все строки (2656) из `libZeninCPP.so`

> ⚠️ Декомпиляция выполнена для исследовательских целей (анализ безопасности /
> reverse engineering). Учитывайте признаки переподписи и сокрытия логики.
