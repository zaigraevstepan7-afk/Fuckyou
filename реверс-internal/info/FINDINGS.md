# Zenin **Internal** 1.1 — разбор (всё вшито в открытом виде)

Вопрос был: «есть вшитый или нет». **Ответ: ДА — сервер, эндпоинт, протокол
авторизации и целевая игра зашиты в открытом виде.** В отличие от External-сборки,
этот APK **не защищён Dex2C** — только R8-минификация (имена классов короткие
`al`, `nu0`, но строки и логика читаются).

## APK
| Параметр | Значение |
|---|---|
| Файл | `zenininternal1.1.apk` (3.25 МБ) |
| Пакет | `com.reddit.secondpage` (маскировка под Reddit) |
| Нативная либа чита | `lib/{arm64-v8a,x86_64}/libinternal.so` (~870 КБ) |
| Защита | R8 (минификация). **Dex2C НЕТ** |
| Сборка | 19.06.2026 |

## 🎯 Сервер и API (ХАРДКОД, открытым текстом)
```
POST https://interhack.shop/api/start
Content-Type: application/x-www-form-urlencoded
Connect timeout 15s, read timeout 30s
```
Код запроса — `defpackage/al.java`, метод `K(byte[])`:
```java
HttpURLConnection c = x61.a(new URL("https://interhack.shop/api/start"));
c.setRequestMethod("POST");
c.setDoOutput(true); c.setDoInput(true);
c.setConnectTimeout(15000); c.setReadTimeout(30000);
c.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
c.setRequestProperty("Content-Length", String.valueOf(bArr.length));
// тело bArr (поля key/hash/data) -> ответ je0(code, body, contentType)
```

## 🎯 Целевая игра
**Standoff 2** (`com.axlebolt.standoff2`, Unity/IL2CPP). Чит запускает её:
```
am start -n com.axlebolt.standoff2/com.google.firebase.MessagingUnityPlayerActivity
```
`libinternal.so` — внутренний чит (инжектится в процесс игры, рисует ESP и т.п.).

## Протокол авторизации (полностью восстановлен)
Поля запроса: `key`, `hash`, `data` (+ `timestamp`). Ответ — JSON со `status`,
`token`, `data`/`map` (зашифрованный payload/офсеты). Используется SHA-256 и
проверка timestamp (анти-replay), payload шифруется (есть статус «invalid_decrypt»).

Все коды ответа сервера — `defpackage/nu0.java`, метод `C(String)`:
| status | сообщение |
|---|---|
| `key_success` | Authorization successful. |
| `key_invalid` | Key is invalid. |
| `key_taken` | Key is already used. (привязка к 1 устройству) |
| `key_expired` | Key has expired. |
| `key_is_frozen` | Key is frozen. |
| `banned` | Your device is banned. |
| `ip_banned` | Your IP is banned. |
| `invalid_device` | Device is not allowed. (HWID-привязка) |
| `invalid_decrypt` | Invalid encrypted payload. |
| `invalid_timestamp` | Invalid request timestamp. |
| `invalid_fields` / `invalid_data` / `invalid_json` | Invalid request … |
| `data_not_found` | Data not found. |

## Функции чита
В открытом виде из dex видно `ESP`, `Distance`. Полное меню (Box/Skeleton/Aim/
FOV и т.п.) — внутри `libinternal.so`, которая, в отличие от остального APK,
**сама защищена** (в строках есть маркеры Dex2C `INVOKESPECIAL Void npe`), поэтому
имена функций там зашифрованы. ESP-рендер и работа с памятью Standoff2 — там.

## Вывод
- **Сервер: `interhack.shop` (84.32.84.56), эндпоинт `/api/start`** — подтверждён
  и сетевым перехватом (External), и хардкодом в коде (Internal).
- Internal-сборка раскрывает **весь протокол авторизации** (поля, статусы, крипто),
  т.к. защищён только нативный `libinternal.so`, а Java-обвязка — открыта.
- Цель — читы для **Standoff 2**.

См. также `../jadx/sources/defpackage/al.java` (запрос) и `nu0.java` (ответы).
