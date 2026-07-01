#!/usr/bin/env python3
# ERA // TELE2 SNI & HOST SPOOFER
# Requires: scapy, NetfilterQueue

import atexit
import re
import signal
import struct
import subprocess
import sys

from netfilterqueue import NetfilterQueue
from scapy.all import IP, TCP, Raw

QUEUE_NUM = 1
FAKE_SNI = b"m.vk.com"
FAKE_HOST = b"m.vk.com"

# Правила, которые должен снять этот процесс при выходе (нормальном или аварийном),
# чтобы осиротевшая NFQUEUE не "убила" весь исходящий HTTP/HTTPS трафик.
IPTABLES_RULES = [
    ["-D", "OUTPUT", "-p", "tcp", "--dport", "80", "-j", "NFQUEUE", "--queue-num", str(QUEUE_NUM)],
    ["-D", "OUTPUT", "-p", "tcp", "--dport", "443", "-j", "NFQUEUE", "--queue-num", str(QUEUE_NUM)],
]


def cleanup_iptables():
    for rule in IPTABLES_RULES:
        subprocess.run(["iptables", *rule], check=False,
                        stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)


def pack_uint24(value):
    return value.to_bytes(3, "big")


def patch_tls_sni(payload):
    """
    Патчит TLS ClientHello, заменяя SNI на FAKE_SNI.
    Возвращает модифицированный payload (bytes) или None, если патчить не удалось.
    """
    if len(payload) < 43 or payload[0] != 0x16 or payload[5] != 0x01:
        return None

    try:
        # Пропускаем заголовки TLS Record(5) + Handshake(4) + Version(2) + Random(32)
        idx = 43

        # Session ID
        sess_len = payload[idx]
        idx += 1 + sess_len

        # Cipher Suites
        cs_len = struct.unpack("!H", payload[idx:idx + 2])[0]
        idx += 2 + cs_len

        # Compression Methods
        cm_len = payload[idx]
        idx += 1 + cm_len

        # Extensions Length
        ext_len_offset = idx
        ext_len = struct.unpack("!H", payload[idx:idx + 2])[0]
        ext_start = idx + 2
        ext_end = ext_start + ext_len

        curr = ext_start
        while curr < ext_end - 4:
            ext_type = struct.unpack("!H", payload[curr:curr + 2])[0]
            ext_data_len = struct.unpack("!H", payload[curr + 2:curr + 4])[0]

            if ext_type == 0x0000:  # SNI extension
                # Структура: ListLen(2) + Type(1) + SniLen(2) + Sni
                list_len_offset = curr + 4
                sni_len_offset = curr + 7

                orig_sni_len = struct.unpack("!H", payload[sni_len_offset:sni_len_offset + 2])[0]
                sni_start = sni_len_offset + 2

                diff = len(FAKE_SNI) - orig_sni_len

                new_payload = bytearray(payload)

                # 1. Патчим длину SNI (2 байта)
                struct.pack_into("!H", new_payload, sni_len_offset, len(FAKE_SNI))

                # 2. Патчим длину SNI List (2 байта)
                orig_list_len = struct.unpack("!H", new_payload[list_len_offset:list_len_offset + 2])[0]
                struct.pack_into("!H", new_payload, list_len_offset, orig_list_len + diff)

                # 3. Патчим длину Extensions (2 байта)
                struct.pack_into("!H", new_payload, ext_len_offset, ext_len + diff)

                # 4. Патчим длину ClientHello (3 байта, offset 6)
                ch_len = int.from_bytes(new_payload[6:9], "big")
                new_payload[6:9] = pack_uint24(ch_len + diff)

                # 5. Патчим длину TLS Record (2 байта, offset 3)
                tls_len = struct.unpack("!H", new_payload[3:5])[0]
                struct.pack_into("!H", new_payload, 3, tls_len + diff)

                # 6. Заменяем саму строку SNI последней: bytearray сам растянет/сожмёт
                #    буфер под новую длину и сдвинет всё, что идёт после неё.
                new_payload[sni_start:sni_start + orig_sni_len] = FAKE_SNI

                return bytes(new_payload)

            curr += 4 + ext_data_len

    except (struct.error, IndexError):
        pass

    return None


def process_packet(packet):
    try:
        scapy_pkt = IP(packet.get_payload())
        if scapy_pkt.haslayer(TCP) and scapy_pkt[TCP].dport in (80, 443) and scapy_pkt.haslayer(Raw):
            payload = bytes(scapy_pkt[Raw].load)
            new_payload = None

            # 1. Патчим HTTP Host (для порта 80 или CONNECT-запросов)
            if payload.startswith((b"GET", b"POST", b"HEAD", b"CONNECT")):
                candidate = re.sub(b"Host: [^\r\n]+", b"Host: " + FAKE_HOST, payload, count=1)
                if candidate != payload:
                    new_payload = candidate

            # 2. Патчим TLS SNI (для порта 443)
            elif scapy_pkt[TCP].dport == 443:
                new_payload = patch_tls_sni(payload)

            if new_payload is not None:
                scapy_pkt[Raw].load = new_payload
                # Сбрасываем длины и чексуммы, чтобы Scapy пересчитала их автоматически
                del scapy_pkt[IP].len
                del scapy_pkt[IP].chksum
                del scapy_pkt[TCP].chksum
                packet.set_payload(bytes(scapy_pkt))
    except Exception as exc:
        print(f"[ERA] Ошибка обработки пакета: {exc}", file=sys.stderr)
    finally:
        # Пакет обязательно должен получить вердикт, иначе он зависнет в очереди.
        packet.accept()


def handle_signal(signum, frame):
    sys.exit(0)


def main():
    atexit.register(cleanup_iptables)
    signal.signal(signal.SIGTERM, handle_signal)
    signal.signal(signal.SIGINT, handle_signal)

    queue = NetfilterQueue()
    try:
        queue.bind(QUEUE_NUM, process_packet)
        print("[ERA] NFQUEUE привязан. Перехват и подмена SNI/Host активны.")
        queue.run()
    finally:
        queue.unbind()


if __name__ == "__main__":
    main()
