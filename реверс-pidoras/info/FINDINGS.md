# Разбор `8590cf72-0371_1.apk` — ESP-чит для Standoff 2 (открытый)

В отличие от Zenin, эта сборка **почти не защищена** — весь флоу читается, а
«авторизация» фейковая (локальный флаг). Реальный чит — нативный ELF `assets/tenmi`.

## APK
| Параметр | Значение |
|---|---|
| Пакет | `com.ildar.pidoras` |
| Главная активность | `com.android.danilapaster.danila_pasterila` |
| Разрешения | `ACCESS_SUPERUSER` (root), DUMP, INTERNET, R/W storage |
| Защита dex | R8-минификация (без Dex2C). Логика читается |
| Контакт/продажа | Telegram **`t.me/melrele`** |
| Цель | **Standoff 2** (`com.axlebolt.standoff2`, Unity) |
| Root-библиотека | `com.topjohnwu.superuser` (libsu) |

## Как работает (полностью восстановлено из `danila_pasterila.java`)
1. Копирует ассет `tenmi` → `filesDir/tenmi`, затем:
   ```
   mv …/tenmi /data/local/tmp/delaem
   chmod 777 /data/local/tmp/delaem
   ```
2. **«Подписка» фейковая:** диалог «Подпишись чтобы поиграть» → кнопка
   «Подписаться» просто открывает `https://t.me/melrele` и ставит локальный
   `isSubscribed = true`. **Никакой серверной проверки нет** — гейт обходится
   клиентским булевым флагом.
3. По кнопке Start (если `isSubscribed`):
   ```java
   cmd("am start -n com.axlebolt.standoff2/...MessagingUnityPlayerActivity"); // запуск игры
   // через 5 сек:
   cmd("/data/local/tmp/delaem");   // запуск чит-движка под root
   ```
   где `cmd(x) = Runtime.exec("su -c " + x)`.

То есть чит **бесплатный/без авторизации**, гейт — только «подпишись на телегу».

## Нативный движок `assets/tenmi` (это и есть чит)
ELF ARM64 PIE, 1.5 МБ, **не Dex2C** (строки читаемы). Декомпиляция Ghidra:
**3931 функция найдена, 3727 декомпилировано** (`../tenmi-ghidra/all_functions.c`).

**Что делает (по строкам/импортам):**
- **Чтение/запись памяти игры:** `process_vm_readv`, `process_vm_writev`,
  `/proc/%d/maps`, «Failed to read/write memory location».
- **Оверлей-меню ImGui:** `Dear ImGui 1.91.4`, OpenGL-шейдеры
  (`gl_Position = ProjMtx * vec4(...)`, `Texture`), `libEGL/libGLESv3/libgui`
  (рисует поверх игры через SurfaceFlinger).
- **ESP:** строки `ESP`, `BOX`, `Head`, `Visible`, `Menu`, `Main menu bar`.
- **Оружие Standoff 2** (список для ESP/идентификации):
  `AWM, AwP, M4A1, M40, Famas, Deagle, USP, Five-Seven, Akimbo Uzi, Knife, Scaron…`

То есть `tenmi` запускается под root, читает память Standoff 2 через
`process_vm_readv`, и рисует ESP (боксы/голова/видимость) ImGui-оверлеем.

## Сводка по защите (сравнение с Zenin)
| | Zenin External/Internal | Этот (pidoras) |
|---|---|---|
| Защита | Dex2C/VMP, строки зашифрованы | R8, всё открыто |
| Авторизация | сервер `interhack.shop` + ключ `ZE-` | фейковая (локальный флаг + телега) |
| Чит | payload с сервера | вшит в APK (`assets/tenmi`) |
| Анти-Frida | да | нет |

## Файлы
- `../jadx/` — Java/Kotlin декомпиляция (2654 файла); ключевой класс
  `sources/com/android/danilapaster/danila_pasterila.java`
- `../raw/assets/tenmi` — нативный чит-движок (ELF)
- `../tenmi-ghidra/all_functions.c` — C-декомпиляция движка (3727 функций)
- `tenmi-strings.txt` — строки движка
