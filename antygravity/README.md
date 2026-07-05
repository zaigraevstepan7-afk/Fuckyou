# 🛰️ Подписка «antygravity»

Моя сборная подписка.

## 📥 Как добавить подписку

1. Открой клиент (v2rayNG / v2rayTun / Streisand / Hiddify).
2. **Подписки** (Subscriptions) → **Добавить**.
3. Вставь URL:

```
https://raw.githubusercontent.com/zaigraevstepan7-afk/Fuckyou/claude/vpn-server-config-y9rpro/antygravity/subscription.txt
```

4. Назови подписку `antygravity` → сохрани → **Обновить**.

## 📋 Что внутри подписки (`subscription.txt` / `servers.txt`)

| # | Сервер | Тип |
|---|--------|-----|
| 1 | 🇳🇱 Обход #1 \| тгк: Vlesstrogan | VLESS / Reality / TCP |
| 2 | 🇨🇭 Швейцария \| VPN | VLESS / Reality / TCP |
| 3 | 🇷🇺 YouTube без рекламы | VLESS / WS |

> `subscription.txt` — base64 (стандартный формат подписки).
> `servers.txt` — те же ссылки в читаемом виде.

## 🧩 Отдельные JSON-конфиги (импортировать вручную)

Полноценные конфиги с маршрутизацией/белыми списками — их нельзя засунуть в подписку одной ссылкой. Импортируй как «конфиг из буфера» / «Import config»:

- [`02-switzerland.json`](./02-switzerland.json) — 🇨🇭 Швейцария \| VPN (xhttp, post-quantum encryption).
- [`pl-lte.json`](./pl-lte.json) — 🇵🇱 LTE #1 \| Все операторы (большой белый список: РФ-домены, банки, Госуслуги, Яндекс, VK и т.д. напрямую; телеметрия/трекеры/торрент-трекеры режутся; остальное через прокси с балансировщиком).
- [`md-lte.json`](./md-lte.json) — 🇲🇩 LTE \| Не все операторы (балансировщик + белый список).

> ⚠️ Все серверы — публичные/шэрные (тгк Vlesstrogan). Стабильность и скорость не гарантированы.
