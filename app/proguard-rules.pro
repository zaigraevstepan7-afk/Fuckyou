# WebView JS-интерфейсов нет, дополнительных правил почти не требуется.

# Системный ввод Wear (RemoteInput) — не даём R8 трогать хелперы
-keep class androidx.wear.input.** { *; }
