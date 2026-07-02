#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
generate_sub.py — Free Canada VPN subscription builder for the Happ app.

Pipeline:
  1. Fetch public free-config lists from sources.txt (auto-detect base64/plaintext).
  2. Parse vless:// / vmess:// / trojan:// / ss:// URIs -> (host, port).
  3. Dedup by (host, port).
  4. TCP-check every server concurrently (asyncio) and record latency (ms).
  5. GeoIP the alive hosts via ip-api.com/batch -> countryCode.
  6. Keep Canada, sort by latency, dedup by resolved IP, take up to TARGET.
     If fewer than TARGET Canada servers are alive, top up with the fastest
     US servers (then any other country) so the list always has TARGET entries.
  7. Rewrite the "#" label: entry #1 = AUTO (fastest), rest numbered.
  8. Write canada.txt (plaintext) and canada_base64.txt (base64).

Standard library only — runs in GitHub Actions with no `pip install`.
"""

import asyncio
import base64
import json
import re
import socket
import sys
import time
import urllib.request
import urllib.parse
from datetime import datetime, timezone

HERE = __file__.rsplit("/", 1)[0] if "/" in __file__ else "."
SOURCES_FILE = HERE + "/sources.txt"
OUT_PLAIN = HERE + "/canada.txt"
OUT_B64 = HERE + "/canada_base64.txt"

TARGET = 11            # 1 AUTO + 10 servers
TCP_TIMEOUT = 3.0      # seconds per connect attempt
CONCURRENCY = 300      # simultaneous TCP checks
FETCH_TIMEOUT = 30     # seconds per source download
GEO_BATCH = 100        # ip-api batch size (free tier max)

UA = "Mozilla/5.0 (compatible; happ-canada-sub/1.0)"
PROTO_PREFIXES = ("vless://", "vmess://", "trojan://", "ss://", "hysteria2://", "hy2://")


# ---------------------------------------------------------------- fetching
def http_get(url, timeout=FETCH_TIMEOUT):
    req = urllib.request.Request(url, headers={"User-Agent": UA})
    with urllib.request.urlopen(req, timeout=timeout) as r:
        return r.read()


def looks_like_configs(text):
    return any(p in text for p in ("vless://", "vmess://", "trojan://", "ss://", "hysteria2://", "hy2://"))


def decode_body(raw):
    """Return list of config lines, auto-decoding base64 subscriptions."""
    try:
        text = raw.decode("utf-8", "ignore")
    except Exception:
        text = str(raw)
    if looks_like_configs(text):
        return text.splitlines()
    # maybe base64 (subscriptions are often a single base64 blob)
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
            body = uri[len("vmess://"):]
            body = body.split("#", 1)[0]
            pad = body + "=" * (-len(body) % 4)
            data = json.loads(base64.b64decode(pad).decode("utf-8", "ignore"))
            host = str(data.get("add", "")).strip()
            port = str(data.get("port", "")).strip()
            if host and port.isdigit():
                return host, int(port)
            return None
        # vless / trojan / ss / hysteria2: scheme://cred@host:port?...#tag
        m = re.search(r"@\[?([^\]/?#@]+?)\]?:(\d{1,5})", uri)
        if m:
            return m.group(1), int(m.group(2))
    except Exception:
        return None
    return None


# ---------------------------------------------------------------- tcp check
async def tcp_probe(host, port, sem):
    async with sem:
        start = time.monotonic()
        try:
            fut = asyncio.open_connection(host, port)
            reader, writer = await asyncio.wait_for(fut, timeout=TCP_TIMEOUT)
            writer.close()
            try:
                await writer.wait_closed()
            except Exception:
                pass
            return int((time.monotonic() - start) * 1000)
        except Exception:
            return None


async def check_all(targets):
    """targets: list of (host, port). Returns dict {(host,port): latency_ms}."""
    sem = asyncio.Semaphore(CONCURRENCY)
    tasks = [tcp_probe(h, p, sem) for (h, p) in targets]
    results = await asyncio.gather(*tasks)
    alive = {}
    for (h, p), lat in zip(targets, results):
        if lat is not None:
            alive[(h, p)] = lat
    return alive


# ---------------------------------------------------------------- geoip
# Anycast CDN / big-cloud fronts: their edge IP geolocates to wherever the
# client is, NOT to the real exit server. We flag them so genuine
# datacenter-hosted Canadian servers get priority over CDN-fronted ones.
CDN_RE = re.compile(
    r"cloudflare|fastly|akamai|amazon|aws|google|microsoft|azure|oracle|"
    r"linode|digitalocean\s+cdn|cloudfront|gcore|bunnycdn|edgecast|incapsula",
    re.I,
)


def geoip_countries(hosts):
    """Return dict {host: (countryCode, resolved_ip, is_cdn)} via ip-api batch."""
    out = {}
    hosts = list(hosts)
    for i in range(0, len(hosts), GEO_BATCH):
        chunk = hosts[i:i + GEO_BATCH]
        payload = json.dumps([{"query": h} for h in chunk]).encode()
        req = urllib.request.Request(
            "http://ip-api.com/batch?fields=status,countryCode,as,isp,query",
            data=payload,
            headers={"User-Agent": UA, "Content-Type": "application/json"},
            method="POST",
        )
        try:
            with urllib.request.urlopen(req, timeout=FETCH_TIMEOUT) as r:
                arr = json.loads(r.read().decode("utf-8", "ignore"))
            for host, item in zip(chunk, arr):
                if isinstance(item, dict) and item.get("status") == "success":
                    org = f"{item.get('as', '')} {item.get('isp', '')}"
                    is_cdn = bool(CDN_RE.search(org))
                    out[host] = (item.get("countryCode", ""), item.get("query", host), is_cdn)
        except Exception as e:
            print(f"[-] geoip batch failed: {type(e).__name__}", file=sys.stderr)
        # respect ip-api free rate limit (~45 req/min)
        if i + GEO_BATCH < len(hosts):
            time.sleep(1.5)
    return out


# ---------------------------------------------------------------- labeling
def relabel(uri, label):
    # vmess carries its display name in the JSON "ps" field, not a #fragment.
    if uri.startswith("vmess://"):
        try:
            body = uri[len("vmess://"):].split("#", 1)[0].strip()
            pad = body + "=" * (-len(body) % 4)
            data = json.loads(base64.b64decode(pad).decode("utf-8", "ignore"))
            data["ps"] = label
            packed = base64.b64encode(
                json.dumps(data, ensure_ascii=False).encode()).decode()
            return "vmess://" + packed
        except Exception:
            pass
    base = uri.split("#", 1)[0]
    return base + "#" + urllib.parse.quote(label)


COUNTRY_FLAG = {"CA": "🇨🇦", "US": "🇺🇸"}


def build_list(picks):
    """picks: ordered list of dicts {uri, cc, lat}. First = AUTO."""
    lines = []
    for idx, p in enumerate(picks):
        flag = COUNTRY_FLAG.get(p["cc"], "🌐")
        country = "Canada" if p["cc"] == "CA" else (p["cc"] or "Server")
        if idx == 0:
            label = f"{flag} {country} · AUTO (fastest {p['lat']}ms)"
        else:
            label = f"{flag} {country}-{idx:02d} · {p['lat']}ms"
        lines.append(relabel(p["uri"], label))
    return lines


# ---------------------------------------------------------------- main
def main():
    urls = load_sources()
    if not urls:
        print("No sources configured.", file=sys.stderr)
        return 1

    print(f"[*] Fetching {len(urls)} source(s)...")
    configs = collect_configs(urls)
    print(f"[*] Total configs collected: {len(configs)}")

    # parse + dedup by (host, port), keep first URI seen per endpoint
    by_endpoint = {}
    for uri in configs:
        hp = parse_host_port(uri)
        if hp and hp not in by_endpoint:
            by_endpoint[hp] = uri
    targets = list(by_endpoint.keys())
    print(f"[*] Unique endpoints to TCP-check: {len(targets)}")

    print("[*] Running TCP reachability checks...")
    alive = asyncio.run(check_all(targets))
    print(f"[*] Alive (TCP): {len(alive)}")
    if not alive:
        print("No servers passed the TCP check.", file=sys.stderr)
        return 1

    # GeoIP only the alive hosts (unique host strings)
    alive_hosts = sorted({h for (h, p) in alive})
    print(f"[*] GeoIP lookup for {len(alive_hosts)} alive host(s)...")
    geo = geoip_countries(alive_hosts)

    # assemble candidates
    candidates = []
    for (h, p), lat in alive.items():
        cc, ip, is_cdn = geo.get(h, ("", h, False))
        candidates.append({"uri": by_endpoint[(h, p)], "host": h, "port": p,
                           "lat": lat, "cc": cc, "ip": ip, "cdn": is_cdn})

    def pool(cc_test, cdn):
        items = [c for c in candidates if cc_test(c["cc"]) and c["cdn"] == cdn]
        items.sort(key=lambda x: x["lat"])
        seen, out = set(), []
        for it in items:
            key = it["ip"] or it["host"]
            if key not in seen:
                seen.add(key)
                out.append(it)
        return out

    is_ca = lambda cc: cc == "CA"
    is_us = lambda cc: cc == "US"
    is_other = lambda cc: cc not in ("CA", "US")

    ca_direct, ca_cdn = pool(is_ca, False), pool(is_ca, True)
    us_direct, us_cdn = pool(is_us, False), pool(is_us, True)
    other = pool(is_other, False) + pool(is_other, True)

    print(f"[*] Canada: {len(ca_direct)} direct + {len(ca_cdn)} cdn | "
          f"US: {len(us_direct)} direct + {len(us_cdn)} cdn | other: {len(other)}")

    # Priority: real Canadian datacenter servers first, then CDN-fronted CA,
    # then nearest (US direct/cdn), then anything else — until we hit TARGET.
    picks, used_ips = [], set()
    for src in (ca_direct, ca_cdn, us_direct, us_cdn, other):
        for c in src:
            if len(picks) >= TARGET:
                break
            key = c["ip"] or c["host"]
            if key not in used_ips:
                picks.append(c)
                used_ips.add(key)

    if len(picks) < TARGET:
        print(f"[!] Only {len(picks)} servers available (< {TARGET}).", file=sys.stderr)
    if not picks:
        print("No usable servers.", file=sys.stderr)
        return 1

    lines = build_list(picks)
    plaintext = "\n".join(lines) + "\n"
    b64 = base64.b64encode(plaintext.encode()).decode()

    with open(OUT_PLAIN, "w", encoding="utf-8") as f:
        f.write(plaintext)
    with open(OUT_B64, "w", encoding="utf-8") as f:
        f.write(b64 + "\n")

    ts = datetime.now(timezone.utc).strftime("%Y-%m-%d %H:%M UTC")
    n_ca = sum(1 for p in picks if p["cc"] == "CA")
    print("-" * 60)
    print(f"[✓] Wrote {len(lines)} servers ({n_ca} CA) -> canada.txt @ {ts}")
    for i, p in enumerate(picks):
        tag = "AUTO" if i == 0 else f"#{i:02d}"
        print(f"    {tag:>4}  {p['cc'] or '??':>2}  {p['lat']:>4}ms  {p['host']}:{p['port']}")
    return 0


if __name__ == "__main__":
    sys.exit(main())
