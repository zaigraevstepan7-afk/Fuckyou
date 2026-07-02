#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
generate_sub.py — self-updating "best working free servers" subscription for Happ.

Every server in the output has been REALLY tested end-to-end with xray-core
(via xray-knife): a full proxy connection is established and an HTTP request is
routed through it. Dead servers, wrong SNI/UUID and broken TLS are dropped — so
you don't get "TLS handshake" errors on import.

Pipeline:
  1. Fetch public free-config lists from sources.txt (auto-detect base64/plaintext).
  2. Parse vless:// / vmess:// / trojan:// / ss:// URIs, dedup by (host, port).
  3. Fast TCP prefilter (asyncio) to drop obviously-dead endpoints.
  4. Real validation with xray-knife: keep only configs that actually proxy
     traffic; record real delay (ms) and true exit country (via /cdn-cgi/trace).
  5. Rank: Canada first, then US, then other known countries, then unknown —
     each group fastest-first. Take TARGET servers. #1 is labelled AUTO.
  6. Write canada.txt (plaintext) and canada_base64.txt (base64).

NOTE: genuine *Canadian-exit* free servers are effectively nonexistent in public
pools, so the list is "Canada-preferred, then nearest working". Labels always
show each server's REAL exit country — no fake "Canada" tags.

Needs: Python 3 (stdlib only) + the `xray-knife` binary on PATH (or $XRAY_KNIFE).
"""

import asyncio
import base64
import csv
import json
import os
import re
import shutil
import subprocess
import sys
import tempfile
import urllib.request
import urllib.parse
from datetime import datetime, timezone

HERE = os.path.dirname(os.path.abspath(__file__))
SOURCES_FILE = os.path.join(HERE, "sources.txt")
OUT_PLAIN = os.path.join(HERE, "canada.txt")
OUT_B64 = os.path.join(HERE, "canada_base64.txt")

TARGET = 11              # 1 AUTO + 10 servers
TCP_TIMEOUT = 3.0        # seconds per TCP connect (prefilter)
CONCURRENCY = 300        # simultaneous TCP checks
FETCH_TIMEOUT = 30       # seconds per source download
MAX_VALIDATE = 1800      # cap configs handed to xray-knife (bounds runtime)
KNIFE_THREADS = "100"
KNIFE_MDELAY = "4500"    # ms; a config slower than this is treated as dead

UA = "Mozilla/5.0 (compatible; happ-sub/2.0)"
PROTO_PREFIXES = ("vless://", "vmess://", "trojan://", "ss://", "hysteria2://", "hy2://")

COUNTRY_FLAG = {
    "CA": "🇨🇦", "US": "🇺🇸", "FR": "🇫🇷", "DE": "🇩🇪", "NL": "🇳🇱", "GB": "🇬🇧",
    "PL": "🇵🇱", "SG": "🇸🇬", "JP": "🇯🇵", "FI": "🇫🇮", "SE": "🇸🇪", "CH": "🇨🇭",
    "RO": "🇷🇴", "IT": "🇮🇹", "ES": "🇪🇸", "IN": "🇮🇳", "PH": "🇵🇭", "AT": "🇦🇹",
    "AU": "🇦🇺", "HK": "🇭🇰", "KR": "🇰🇷", "TR": "🇹🇷", "RU": "🇷🇺", "UA": "🇺🇦",
}
COUNTRY_NAME = {
    "CA": "Canada", "US": "USA", "GB": "UK", "FR": "France", "DE": "Germany",
    "NL": "Netherlands", "PL": "Poland", "SG": "Singapore", "JP": "Japan",
    "FI": "Finland", "SE": "Sweden", "CH": "Switzerland", "RO": "Romania",
    "IT": "Italy", "ES": "Spain", "IN": "India", "PH": "Philippines",
    "AT": "Austria", "AU": "Australia",
}
# Ranking: lower = higher priority. Canada, then US, then any known country,
# then unknown/CDN-fronted (null exit).
RANK = {"CA": 0, "US": 1}


# ---------------------------------------------------------------- fetching
def http_get(url, timeout=FETCH_TIMEOUT, retries=3):
    last = None
    for attempt in range(retries):
        try:
            req = urllib.request.Request(url, headers={"User-Agent": UA})
            with urllib.request.urlopen(req, timeout=timeout) as r:
                return r.read()
        except Exception as e:  # transient IncompleteRead / timeouts / resets
            last = e
            if isinstance(e, urllib.error.HTTPError) and e.code in (403, 404):
                raise
    raise last


def looks_like_configs(text):
    return any(p in text for p in ("vless://", "vmess://", "trojan://", "ss://", "hysteria2://", "hy2://"))


def decode_body(raw):
    """Return list of config lines, auto-decoding base64 subscriptions."""
    text = raw.decode("utf-8", "ignore") if isinstance(raw, (bytes, bytearray)) else str(raw)
    if looks_like_configs(text):
        return text.splitlines()
    compact = "".join(text.split())
    try:
        pad = compact + "=" * (-len(compact) % 4)
        dec = base64.b64decode(pad).decode("utf-8", "ignore")
        if looks_like_configs(dec):
            return dec.splitlines()
    except Exception:
        pass
    return text.splitlines()


def load_sources():
    urls = []
    try:
        with open(SOURCES_FILE, "r", encoding="utf-8") as f:
            for line in f:
                line = line.strip()
                if line and not line.startswith("#"):
                    urls.append(line)
    except FileNotFoundError:
        print(f"[!] {SOURCES_FILE} not found", file=sys.stderr)
    return urls


def collect_configs(urls):
    lines = []
    for url in urls:
        try:
            raw = http_get(url)
            got = [l.strip() for l in decode_body(raw) if l.strip().startswith(PROTO_PREFIXES)]
            lines.extend(got)
            print(f"[+] {len(got):5d} configs  <-  {url}")
        except Exception as e:
            print(f"[-] skip (failed: {type(e).__name__}) {url}", file=sys.stderr)
    return lines


# ---------------------------------------------------------------- parsing
def parse_host_port(uri):
    """Extract (host, port) from a proxy URI, or None."""
    try:
        if uri.startswith("vmess://"):
            body = uri[len("vmess://"):].split("#", 1)[0]
            pad = body + "=" * (-len(body) % 4)
            data = json.loads(base64.b64decode(pad).decode("utf-8", "ignore"))
            host = str(data.get("add", "")).strip()
            port = str(data.get("port", "")).strip()
            return (host, int(port)) if host and port.isdigit() else None
        m = re.search(r"@\[?([^\]/?#@]+?)\]?:(\d{1,5})", uri)
        if m:
            return m.group(1), int(m.group(2))
    except Exception:
        return None
    return None


# ---------------------------------------------------------------- tcp prefilter
async def tcp_probe(host, port, sem):
    async with sem:
        try:
            fut = asyncio.open_connection(host, port)
            _, writer = await asyncio.wait_for(fut, timeout=TCP_TIMEOUT)
            writer.close()
            try:
                await writer.wait_closed()
            except Exception:
                pass
            return True
        except Exception:
            return False


async def check_all(targets):
    sem = asyncio.Semaphore(CONCURRENCY)
    results = await asyncio.gather(*(tcp_probe(h, p, sem) for (h, p) in targets))
    return {t for t, ok in zip(targets, results) if ok}


# ---------------------------------------------------------------- validation
def find_xray_knife():
    for cand in (os.environ.get("XRAY_KNIFE"),
                 shutil.which("xray-knife"),
                 os.path.expanduser("~/go/bin/xray-knife"),
                 "/tmp/gobin/xray-knife"):
        if cand and os.path.exists(cand):
            return cand
    return None


def validate(uris):
    """Real end-to-end test via xray-knife. Returns list of dicts:
       {link, delay(int ms), ip, cc}. Only genuinely-working configs."""
    knife = find_xray_knife()
    if not knife:
        print("[!] xray-knife not found. Install it:\n"
              "    go install github.com/lilendian0x00/xray-knife/v3@latest\n"
              "    (or set XRAY_KNIFE=/path/to/xray-knife)", file=sys.stderr)
        sys.exit(2)

    with tempfile.TemporaryDirectory() as td:
        infile = os.path.join(td, "in.txt")
        outfile = os.path.join(td, "out.csv")
        with open(infile, "w", encoding="utf-8") as f:
            f.write("\n".join(uris) + "\n")

        cmd = [knife, "net", "http", "-f", infile, "-o", outfile, "-x", "csv",
               "-r", "-s", "-t", KNIFE_THREADS, "-d", KNIFE_MDELAY]
        print(f"[*] Validating {len(uris)} configs with xray-knife "
              f"(threads={KNIFE_THREADS}, timeout={KNIFE_MDELAY}ms)...")
        try:
            subprocess.run(cmd, cwd=td, stdout=subprocess.DEVNULL,
                           stderr=subprocess.DEVNULL, timeout=3000)
        except subprocess.TimeoutExpired:
            print("[!] xray-knife timed out; using partial results.", file=sys.stderr)

        rows = []
        if os.path.exists(outfile):
            with open(outfile, newline="", encoding="utf-8", errors="ignore") as f:
                for rec in csv.reader(f):
                    if not rec or rec[0] == "link" or len(rec) < 9:
                        continue
                    link, status = rec[0], rec[1]
                    ip, delay, loc = rec[4], rec[5], rec[-1]
                    if status != "passed" or not delay.strip().isdigit():
                        continue
                    cc = loc.strip().upper()
                    if cc in ("NULL", "NONE", ""):
                        cc = ""
                    rows.append({"link": link, "delay": int(delay), "ip": ip.strip(), "cc": cc})
        return rows


def geoip_fill(rows):
    """For working configs with unknown country but a real exit IP, resolve the
    country via ip-api so ranking/labels are accurate."""
    unknown_ips = sorted({r["ip"] for r in rows if not r["cc"] and r["ip"]
                          and re.match(r"^\d{1,3}(\.\d{1,3}){3}$", r["ip"])})
    if not unknown_ips:
        return
    ip2cc = {}
    for i in range(0, len(unknown_ips), 100):
        chunk = unknown_ips[i:i + 100]
        payload = json.dumps([{"query": ip} for ip in chunk]).encode()
        req = urllib.request.Request(
            "http://ip-api.com/batch?fields=status,countryCode,query",
            data=payload, headers={"User-Agent": UA, "Content-Type": "application/json"},
            method="POST")
        try:
            with urllib.request.urlopen(req, timeout=FETCH_TIMEOUT) as r:
                for item in json.loads(r.read().decode("utf-8", "ignore")):
                    if isinstance(item, dict) and item.get("status") == "success":
                        ip2cc[item["query"]] = item.get("countryCode", "")
        except Exception:
            pass
    for r in rows:
        if not r["cc"]:
            r["cc"] = ip2cc.get(r["ip"], "")


# ---------------------------------------------------------------- labeling
def relabel(uri, label):
    # vmess carries its display name in the JSON "ps" field, not a #fragment.
    if uri.startswith("vmess://"):
        try:
            body = uri[len("vmess://"):].split("#", 1)[0].strip()
            pad = body + "=" * (-len(body) % 4)
            data = json.loads(base64.b64decode(pad).decode("utf-8", "ignore"))
            data["ps"] = label
            return "vmess://" + base64.b64encode(
                json.dumps(data, ensure_ascii=False).encode()).decode()
        except Exception:
            pass
    return uri.split("#", 1)[0] + "#" + urllib.parse.quote(label)


def build_list(picks):
    out = []
    for idx, p in enumerate(picks):
        cc = p["cc"]
        flag = COUNTRY_FLAG.get(cc, "🌐")
        name = COUNTRY_NAME.get(cc, cc or "Server")
        if idx == 0:
            label = f"{flag} {name} · AUTO (fastest {p['delay']}ms)"
        else:
            label = f"{flag} {name}-{idx:02d} · {p['delay']}ms"
        out.append(relabel(p["link"], label))
    return out


# ---------------------------------------------------------------- main
def main():
    urls = load_sources()
    if not urls:
        print("No sources configured.", file=sys.stderr)
        return 1

    print(f"[*] Fetching {len(urls)} source(s)...")
    configs = collect_configs(urls)
    print(f"[*] Total configs collected: {len(configs)}")

    by_endpoint = {}
    for uri in configs:
        hp = parse_host_port(uri)
        if hp and hp not in by_endpoint:
            by_endpoint[hp] = uri
    targets = list(by_endpoint.keys())
    print(f"[*] Unique endpoints: {len(targets)}")

    print("[*] TCP prefilter...")
    alive = asyncio.run(check_all(targets))
    alive_uris = [by_endpoint[t] for t in alive]
    print(f"[*] TCP-alive: {len(alive_uris)}")
    if not alive_uris:
        print("Nothing alive.", file=sys.stderr)
        return 1

    if len(alive_uris) > MAX_VALIDATE:
        print(f"[*] Capping validation set to {MAX_VALIDATE} (of {len(alive_uris)}).")
        alive_uris = alive_uris[:MAX_VALIDATE]

    working = validate(alive_uris)
    print(f"[*] Genuinely working: {len(working)}")
    if not working:
        print("No servers passed real validation.", file=sys.stderr)
        return 1

    geoip_fill(working)

    # dedup by exit ip (fall back to link), then rank
    seen, uniq = set(), []
    for r in sorted(working, key=lambda x: x["delay"]):
        key = r["ip"] or r["link"]
        if key not in seen:
            seen.add(key)
            uniq.append(r)

    uniq.sort(key=lambda r: (RANK.get(r["cc"], 2 if r["cc"] else 3), r["delay"]))
    picks = uniq[:TARGET]

    from collections import Counter
    dist = Counter(r["cc"] or "??" for r in working)

    lines = build_list(picks)
    plaintext = "\n".join(lines) + "\n"
    with open(OUT_PLAIN, "w", encoding="utf-8") as f:
        f.write(plaintext)
    with open(OUT_B64, "w", encoding="utf-8") as f:
        f.write(base64.b64encode(plaintext.encode()).decode() + "\n")

    ts = datetime.now(timezone.utc).strftime("%Y-%m-%d %H:%M UTC")
    print("-" * 64)
    print(f"[✓] {len(lines)} working servers -> canada.txt @ {ts}")
    print(f"    exit-country distribution of all working: {dict(dist)}")
    for i, p in enumerate(picks):
        tag = "AUTO" if i == 0 else f"#{i:02d}"
        print(f"    {tag:>4}  {(p['cc'] or '??'):>2}  {p['delay']:>4}ms  {p['ip'] or p['link'][:40]}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
