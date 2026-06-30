# Frida-инструментарий: извлечение секретов `libZeninCPP.so`

Эти скрипты вытаскивают то, что **невозможно достать статически** — строки,
расшифровываемые только в нативном коде: адрес сервера авторизации, тело и
заголовки запроса проверки ключа `ZE-********`, целевой пакет игры и AES-ключи.

## Почему нужна динамика
Реальная логика приложения вынесена протектором **Dex2C/VMP («ZeninCPP»)** в
`libZeninCPP.so`. В `MainActivity` **ноль** Java-вызовов дешифровки строк — весь
сетевой и крипто-код выполняется в нативе, строки расшифровываются на лету из
таблицы `DAT_006c45xx` и в Java-коде не появляются. Но нативный код **обязан**
вызывать Android-классы (`URL`, `HttpURLConnection`, `Cipher`) и JNI-функции
(`NewStringUTF`, `RegisterNatives`) — на этой границе всё перехватывается.

## Что ловят скрипты (`dump-secrets.js`)
| Хук | Что даёт |
|-----|----------|
| `java.net.URL`, `HttpURLConnection.setRequestProperty`, тело запроса | **адрес сервера авторизации**, заголовки, токены, тело |
| `javax.crypto.Cipher.doFinal`, `SecretKeySpec`, `IvParameterSpec` | **AES-ключи/IV**, вход/выход шифрования |
| `android.util.Base64` | декодированные строки |
| `PackageManager`, `ComponentName`, `Intent` | **целевой пакет игры** |
| `java.io.File` | пути конфигов (`/sdcard/Zenin/cfg/`) |
| XOR-декодеры `m####(short[],int,int,int)` | все строки, что всё же идут через Java |
| `libart!NewStringUTF` / `GetStringUTFChars` | строки, передаваемые из натива в JVM |
| `libart!RegisterNatives` | **карта «нативный адрес ↔ Java-метод»** (231 натив) |
| `android_dlopen_ext` | момент загрузки `.so` — для хука нативного дешифратора по offset |

## Требования
- Рутованное устройство **или** эмулятор (x86_64 — в APK есть `lib/x86_64/`).
- Запущенный `frida-server` нужной архитектуры на устройстве.
- На ПК: `pip install frida-tools`.
- Приложение установлено (учти: это чит, ему нужен root и целевая игра — для
  чистого дампа авторизации игра не обязательна, ключ проверяется при старте).

## Запуск
Спавн с перехватом с самого старта (рекомендуется — авторизация идёт рано):
```bash
frida -U -f com.reddit.frontpage -l dump-secrets.js --no-pause
```
Attach к уже запущенному:
```bash
frida -U -n "Zenin External" -l dump-secrets.js
```
Через Python-раннер (с записью лога в файл):
```bash
python3 run.py            # спавнит и пишет dump.log
```

## Как закрепить нативный дешифратор строк (последний шаг для полного дампа)
1. В Ghidra найди функцию-дешифратор (XOR/AES-петля, на которую ссылаются
   указатели из таблицы `DAT_006c45xx`, см. `../info/NATIVE-ANALYSIS.md`).
2. Возьми её offset от базы модуля.
3. В `dump-secrets.js` в блоке `waitForLib()` раскомментируй `Interceptor.attach`
   и подставь offset:
   ```js
   var dec = m.base.add(0xДЕШИФРАТОР_OFFSET);
   Interceptor.attach(dec, { onLeave: function (r) {
     try { console.log('[NATIVE][str]', r.readUtf8String()); } catch (e) {}
   }});
   ```
   После этого в логе появятся ВСЕ расшифрованные строки, включая серверные.

## Обход анти-отладки (если приложение падает под Frida)
Dex2C-приложения часто проверяют наличие Frida/отладчика. Если процесс
завершается — спавни с `--no-pause`, используй переименование `frida-server`,
либо `frida-gadget` в режиме внедрения. Также помогает хук `ptrace`/`fork` и
ранний перехват строк сравнения (`strstr`/`strcmp` на "frida", "/proc/self/maps").
См. `anti-debug-bypass.js`.
