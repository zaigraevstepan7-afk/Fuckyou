#!/usr/bin/env python3
# Раннер Frida: спавнит Zenin External, грузит dump-secrets.js, пишет лог в dump.log.
# Использование: python3 run.py  [пакет]   (по умолчанию com.reddit.frontpage)
import sys, time, codecs
import frida

PACKAGE = sys.argv[1] if len(sys.argv) > 1 else "com.reddit.frontpage"
SCRIPT  = "dump-secrets.js"
LOGFILE = "dump.log"

log = codecs.open(LOGFILE, "w", "utf-8")
def on_message(message, data):
    if message.get("type") == "send":
        line = str(message.get("payload"))
    elif message.get("type") == "error":
        line = "[FRIDA-ERROR] " + str(message.get("stack") or message.get("description"))
    else:
        line = str(message)
    print(line)
    log.write(line + "\n"); log.flush()

def main():
    dev = frida.get_usb_device(timeout=10)
    print("[*] device:", dev)
    pid = dev.spawn([PACKAGE])
    print("[*] spawned pid:", pid)
    session = dev.attach(pid)
    with codecs.open(SCRIPT, "r", "utf-8") as f:
        src = f.read()
    script = session.create_script(src)
    script.on("message", on_message)
    # console.log из JS уходит в stdout процесса frida; перехватываем через runtime лог:
    script.set_log_handler(lambda level, text: (print(text), log.write(text + "\n"), log.flush()))
    script.load()
    dev.resume(pid)
    print("[*] running — Ctrl+C для выхода. Лог: " + LOGFILE)
    try:
        sys.stdin.read()
    except KeyboardInterrupt:
        pass

if __name__ == "__main__":
    main()
