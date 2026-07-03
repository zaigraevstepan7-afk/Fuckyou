"""
Скачивание русского корпуса для обучения нашей модели.

Три источника (все публичные, с HuggingFace), потоковое чтение:
  1. wikimedia/wikipedia  20231101.ru  — обычный русский текст (беглость языка)
  2. d0rj/alpaca-cleaned-ru             — инструкция -> ответ (учит отвечать)
  3. Den4ikAI/russian_dialogues_2       — многоходовые диалоги (учит вести беседу)

Инструкции и диалоги оборачиваются в наш chat-шаблон:
    <|user|>...<|assistant|>...<|endoftext|>

Результат: data/corpus.txt — единый текстовый файл, который дальше
токенизируется в prepare.py. Объём регулируется флагами --wiki_mb/--chat_mb.

Скрипт устойчив к сбоям источника: если какой-то датасет недоступен,
он пропускается с предупреждением, а не роняет весь процесс.
"""

import argparse
import os
import sys

HERE = os.path.dirname(os.path.abspath(__file__))
sys.path.insert(0, os.path.dirname(HERE))  # чтобы найти tokenizer.py в корне
from tokenizer import EOT, USER, ASSISTANT

OUT = os.path.join(HERE, "corpus.txt")


def _clean(text):
    if not text:
        return ""
    return " ".join(text.split()).strip()


def stream_wikipedia(out, budget_bytes):
    """Русская Википедия — статьи как обычный текст, разделённые <|endoftext|>."""
    from datasets import load_dataset
    written = 0
    n = 0
    ds = load_dataset("wikimedia/wikipedia", "20231101.ru",
                      split="train", streaming=True)
    for row in ds:
        text = _clean(row.get("text", ""))
        if len(text) < 200:
            continue
        block = text + "\n" + EOT + "\n"
        out.write(block)
        written += len(block.encode("utf-8"))
        n += 1
        if n % 2000 == 0:
            print(f"  wiki: {n} статей, {written/1e6:.1f} MB", flush=True)
        if written >= budget_bytes:
            break
    print(f"  wiki ИТОГО: {n} статей, {written/1e6:.1f} MB", flush=True)
    return written


def stream_alpaca(out, budget_bytes):
    """Инструкции -> ответ в chat-шаблоне."""
    from datasets import load_dataset
    written = 0
    n = 0
    ds = load_dataset("d0rj/alpaca-cleaned-ru", split="train", streaming=True)
    for row in ds:
        instr = _clean(row.get("instruction", ""))
        inp = _clean(row.get("input", ""))
        outp = _clean(row.get("output", ""))
        if not instr or not outp:
            continue
        user = instr if not inp else f"{instr}\n{inp}"
        block = f"{USER}{user}{ASSISTANT}{outp}{EOT}\n"
        out.write(block)
        written += len(block.encode("utf-8"))
        n += 1
        if written >= budget_bytes:
            break
    print(f"  alpaca ИТОГО: {n} пар, {written/1e6:.1f} MB", flush=True)
    return written


def stream_dialogues(out, budget_bytes):
    """Многоходовые диалоги: чередуем user/assistant."""
    from datasets import load_dataset
    written = 0
    n = 0
    ds = load_dataset("Den4ikAI/russian_dialogues_2", split="train", streaming=True)
    for row in ds:
        turns = row.get("sample") or []
        turns = [_clean(t) for t in turns if _clean(t)]
        if len(turns) < 2:
            continue
        parts = []
        for i, t in enumerate(turns):
            tag = USER if i % 2 == 0 else ASSISTANT
            parts.append(f"{tag}{t}")
        block = "".join(parts) + EOT + "\n"
        out.write(block)
        written += len(block.encode("utf-8"))
        n += 1
        if written >= budget_bytes:
            break
    print(f"  dialogues ИТОГО: {n} диалогов, {written/1e6:.1f} MB", flush=True)
    return written


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--wiki_mb", type=float, default=120.0,
                    help="сколько МБ Википедии скачать (беглость языка)")
    ap.add_argument("--chat_mb", type=float, default=60.0,
                    help="сколько МБ инструкций+диалогов (по половине на каждый)")
    ap.add_argument("--out", default=OUT)
    args = ap.parse_args()

    os.environ.setdefault("HF_HUB_DISABLE_PROGRESS_BARS", "0")
    total = 0
    with open(args.out, "w", encoding="utf-8") as out:
        # диалоговость пишем первой — она важнее для чат-бота, гарантированно попадёт
        for name, fn, budget in [
            ("alpaca (инструкции)", stream_alpaca, args.chat_mb / 2 * 1e6),
            ("russian_dialogues", stream_dialogues, args.chat_mb / 2 * 1e6),
            ("wikipedia (беглость)", stream_wikipedia, args.wiki_mb * 1e6),
        ]:
            print(f"[+] Скачиваю: {name} (бюджет {budget/1e6:.0f} MB)", flush=True)
            try:
                total += fn(out, budget)
            except Exception as e:
                print(f"[!] Источник '{name}' пропущен из-за ошибки: {e}", file=sys.stderr)

    print(f"\n[=] Готово. Всего {total/1e6:.1f} MB -> {args.out}")
    if total < 1e6:
        print("[!] Данных подозрительно мало — проверь сеть/прокси.", file=sys.stderr)
        sys.exit(1)


if __name__ == "__main__":
    main()
