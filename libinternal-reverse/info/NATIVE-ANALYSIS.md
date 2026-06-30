# Глубокий реверс `libinternal.so` (Zenin Internal 1.1)

Декомпиляция arm64 через Ghidra 12.1.2: **найдено 1226 функций, декомпилировано
1143 (93%)** в C → `../ghidra-decompiled/all_functions.c` (3.2 МБ). Плюс дизасм
x86_64 (178k строк), символы, строки.

## Что это за либа
**Dex2C-защищённое сетевое/крипто-ядро** приложения (НЕ ESP-рендер). Подтверждено:
- Маркеры VM-рантайма Dex2C в строках: `INVOKESPECIAL Void npe`, `PUTFIELD …`,
  `AALOAD npe` и т.п.
- Java-классы-обёртки: **`internal0/Internal`**, **`internal0/hidden/Hidden0`**
  (аналог `ZeninCPP0/ZLoader` + `Hidden0` из External-сборки).

## Точка входа и регистрация
```c
JNI_OnLoad(JavaVM*):
   GetEnv(&env, 0x10006);     // JNI 1.6
   FUN_00127e24(env);         // инициализация рантайма Dex2C + RegisterNatives
   return 0x10006;
```
- **28 косвенных вызовов `RegisterNatives`** (offset `+0x6b8` в таблице `JNIEnv`) —
  динамическая регистрация нативных методов (имён `Java_*` нет).

## Назначение (по ссылкам на Java-классы из натива)
Либа выполняет **защищённый сетевой обмен и расшифровку payload**:
| Класс | Роль |
|---|---|
| `javax/net/ssl/HttpsURLConnection`, `SSLContext`, `SSLSocketFactory` | HTTPS-запрос к серверу |
| `javax/net/ssl/X509TrustManager`, `TrustManagerFactory` | управление доверием TLS (возможен свой/ослабленный pinning) |
| `javax/crypto/Cipher` | **расшифровка зашифрованного ответа** сервера (статус `invalid_decrypt` в dex) |
| `org/json/JSONObject` | парсинг JSON-ответа (`status`/`token`/`data`/`map`) |

То есть именно `libinternal.so` принимает с `interhack.shop/api/start` зашифрованный
payload (офсеты IL2CPP / модуль чита для Standoff 2), проверяет TLS и **дешифрует**
его. ESP-оверлей рисуется уже в Java (Canvas/Compose в dex) по этим данным.

## Статистика функций
| | |
|---|---|
| Всего функций | 1226 |
| Декомпилировано в C | 1143 |
| Именованных (stdlib C++/libc) | 691 |
| `FUN_адрес` (логика приложения) | 454 |

## Что зашифровано (предел статики)
Как и в External: **все секреты в этой либе зашифрованы Dex2C**.
- URL `http(s)` в декомпиляции: **0**
- JSON-полей в открытом виде: **0**
- Ключи/токены/офсеты: расшифровываются в рантайме VM-диспетчером.

Сервер и протокол при этом **уже известны** из открытого dex Internal-сборки
(`../../реверс-internal/info/FINDINGS.md`): `POST https://interhack.shop/api/start`,
поля `key/hash/data`, статусы `key_success/key_taken/ip_banned/invalid_device/…`,
цель — Standoff 2. Так что эта либа лишь подтверждает крипто-часть протокола.

## Файлы
- `../ghidra-decompiled/all_functions.c` — C всех функций
- `../ghidra-decompiled/functions_index.txt` — индекс адрес→имя→размер
- `../ghidra-decompiled/named-functions.txt`, `symbols.txt`, `defined_strings.txt`
- `../disasm/x86_64-full-disasm.asm` — дизасм x86_64
- `libinternal-strings.txt`, `strings-all.txt` — строки
