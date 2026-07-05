# WebView JS-интерфейсов нет, дополнительных правил почти не требуется.

# snakeyaml (транзитивная зависимость GeckoView) ссылается на java.beans,
# которого нет в Android — эти ветки кода не используются
-dontwarn java.beans.**
