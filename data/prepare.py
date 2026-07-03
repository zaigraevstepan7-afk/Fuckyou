"""
Подготовка данных: обучение НАШЕГО токенизатора и токенизация корпуса.

Вход:  data/corpus.txt (из download_data.py)
Выход: checkpoints/tokenizer.json   — наш BPE-словарь, выученный из корпуса
       data/train.bin, data/val.bin — токены (uint16) для быстрой подачи в обучение
       data/meta.json               — vocab_size, id спец-токенов

Запуск:
    python data/prepare.py --vocab_size 16000
Fallback на char-level токенизатор:
    python data/prepare.py --char
"""

import argparse
import json
import os
import sys

import numpy as np

HERE = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.dirname(HERE)
sys.path.insert(0, ROOT)  # чтобы найти tokenizer.py в корне
from tokenizer import BPETokenizer, CharTokenizer, SPECIAL_TOKENS, EOT

CORPUS = os.path.join(HERE, "corpus.txt")
CKPT_DIR = os.path.join(ROOT, "checkpoints")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--corpus", default=CORPUS)
    ap.add_argument("--vocab_size", type=int, default=16000)
    ap.add_argument("--val_frac", type=float, default=0.01)
    ap.add_argument("--char", action="store_true",
                    help="использовать char-level токенизатор (fallback, без BPE)")
    args = ap.parse_args()

    if not os.path.exists(args.corpus):
        raise SystemExit(f"Нет корпуса {args.corpus}. Сначала запусти data/download_data.py")

    os.makedirs(CKPT_DIR, exist_ok=True)

    # 1) обучаем токенизатор на нашем корпусе
    if args.char:
        tok_path = os.path.join(CKPT_DIR, "tokenizer.char.json")
        print("[+] Обучаю char-level токенизатор...")
        tok = CharTokenizer.train([args.corpus], save_path=tok_path)
    else:
        tok_path = os.path.join(CKPT_DIR, "tokenizer.json")
        print(f"[+] Обучаю BPE-токенизатор (vocab_size={args.vocab_size}) на корпусе...")
        tok = BPETokenizer.train([args.corpus], vocab_size=args.vocab_size,
                                 save_path=tok_path)
    vocab_size = tok.vocab_size
    print(f"[+] Токенизатор готов: vocab_size={vocab_size} -> {tok_path}")

    # 2) токенизируем весь корпус (документы разделены <|endoftext|>)
    print("[+] Токенизирую корпус...")
    eot_id = tok.token_id(EOT)
    ids = []
    buf = []
    n_docs = 0
    with open(args.corpus, "r", encoding="utf-8", errors="ignore") as fh:
        for line in fh:
            if line.strip() == EOT:
                buf.append(EOT)
                text = "".join(buf)
                ids.extend(tok.encode(text))
                buf = []
                n_docs += 1
                if n_docs % 5000 == 0:
                    print(f"    {n_docs} документов, {len(ids)/1e6:.1f}M токенов", flush=True)
            else:
                buf.append(line)
    if buf:
        ids.extend(tok.encode("".join(buf)))

    ids = np.array(ids, dtype=np.uint16)
    print(f"[+] Всего токенов: {len(ids)/1e6:.2f}M ({n_docs} документов)")

    # 3) train/val split и запись бинарников
    n_val = int(len(ids) * args.val_frac)
    train_ids = ids[:-n_val] if n_val > 0 else ids
    val_ids = ids[-n_val:] if n_val > 0 else ids[:1]

    train_ids.tofile(os.path.join(HERE, "train.bin"))
    val_ids.tofile(os.path.join(HERE, "val.bin"))

    meta = {
        "vocab_size": int(vocab_size),
        "tokenizer": os.path.relpath(tok_path, ROOT),
        "special_tokens": {t: tok.token_id(t) for t in SPECIAL_TOKENS},
        "train_tokens": int(len(train_ids)),
        "val_tokens": int(len(val_ids)),
    }
    with open(os.path.join(HERE, "meta.json"), "w", encoding="utf-8") as fh:
        json.dump(meta, fh, ensure_ascii=False, indent=2)

    print(f"[=] train.bin: {len(train_ids)/1e6:.2f}M токенов")
    print(f"[=] val.bin:   {len(val_ids)/1e6:.2f}M токенов")
    print(f"[=] meta.json записан. Спец-токены: {meta['special_tokens']}")


if __name__ == "__main__":
    main()
