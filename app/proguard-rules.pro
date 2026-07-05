# WebView JS-интерфейсов нет, дополнительных правил почти не требуется.

# Системный ввод Wear (RemoteInput) — не даём R8 трогать хелперы
-keep class androidx.wear.input.** { *; }

# snakeyaml (транзитивная зависимость GeckoView) ссылается на java.beans,
# которого нет в Android — эти ветки кода не используются
-dontwarn java.beans.**
