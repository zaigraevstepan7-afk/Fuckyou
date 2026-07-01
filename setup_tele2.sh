#!/bin/bash
# ERA // TELE2 BYPASS SETUP
# Запускать строго от root (su / sudo)
set -euo pipefail

SCRIPT_DIR="$(cd "$(dirname "$(readlink -f "$0")")" && pwd)"
SPOOF_SCRIPT="$SCRIPT_DIR/tele2_spoof.py"
PID_FILE="/tmp/tele2_spoof.pid"
LOG_FILE="/tmp/tele2_spoof.log"

echo "[ERA] Инициализация обхода DPI Tele2..."

# 0. Проверка прав root
if [ "$(id -u)" -ne 0 ]; then
    echo "[ERA] Ошибка: запускать нужно от root (sudo $0)." >&2
    exit 1
fi

if [ ! -f "$SPOOF_SCRIPT" ]; then
    echo "[ERA] Ошибка: не найден $SPOOF_SCRIPT." >&2
    exit 1
fi

# 1. Останавливаем предыдущий экземпляр демона, если он ещё жив
if [ -f "$PID_FILE" ]; then
    OLD_PID="$(cat "$PID_FILE" 2>/dev/null || true)"
    if [ -n "$OLD_PID" ] && kill -0 "$OLD_PID" 2>/dev/null; then
        echo "[ERA] Останавливаю предыдущий демон (PID $OLD_PID)..."
        kill "$OLD_PID" 2>/dev/null || true
        sleep 1
    fi
    rm -f "$PID_FILE"
fi

# 2. Установка системных зависимостей
if command -v apt &> /dev/null; then
    apt update && apt install -y python3-pip python3-dev build-essential libnetfilter-queue-dev iptables
elif command -v pkg &> /dev/null; then
    pkg install -y python clang libnetfilter-queue iptables
else
    echo "[ERA] Предупреждение: не найден apt или pkg, пропускаю установку системных пакетов." >&2
fi

# 3. Установка Python библиотек
# На Debian/Ubuntu 12+/23.04+ pip блокирует установку в системное окружение (PEP 668).
if ! pip3 install scapy NetfilterQueue 2>/dev/null; then
    pip3 install --break-system-packages scapy NetfilterQueue
fi

# 4. Очистка старых правил (на всякий случай)
iptables -F
iptables -t nat -F
iptables -t mangle -F

# 5. Настройка NFQUEUE
# Перехватываем весь исходящий TCP на порты 80 и 443
iptables -I OUTPUT -p tcp --dport 80 -j NFQUEUE --queue-num 1
iptables -I OUTPUT -p tcp --dport 443 -j NFQUEUE --queue-num 1

# Разрешаем локальный трафик и ICMP, чтобы не убить связь
iptables -I OUTPUT -o lo -j ACCEPT
iptables -I OUTPUT -p icmp -j ACCEPT

echo "[ERA] iptables настроены. Трафик перенаправлен в очередь 1."

# 6. Запуск перехватчика
echo "[ERA] Запуск демона подмены SNI..."
nohup python3 "$SPOOF_SCRIPT" > "$LOG_FILE" 2>&1 &
SPOOF_PID=$!
echo "$SPOOF_PID" > "$PID_FILE"

# Быстрая проверка, что демон не упал сразу после старта
sleep 1
if ! kill -0 "$SPOOF_PID" 2>/dev/null; then
    echo "[ERA] Ошибка: демон не запустился, смотри $LOG_FILE" >&2
    cat "$LOG_FILE" >&2
    iptables -D OUTPUT -p tcp --dport 80 -j NFQUEUE --queue-num 1 || true
    iptables -D OUTPUT -p tcp --dport 443 -j NFQUEUE --queue-num 1 || true
    rm -f "$PID_FILE"
    exit 1
fi

echo "[ERA] Готово. PID: $SPOOF_PID. Логи: $LOG_FILE"
echo "[ERA] Чтобы остановить: kill \$(cat $PID_FILE) && iptables -F"
