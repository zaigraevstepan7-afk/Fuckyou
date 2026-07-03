"""
Генерация сырого текста нашей моделью (проверка, что она выучила язык).

    python sample.py --prompt "Москва — это" --tokens 200
"""

import argparse
import os

import torch

from config import ModelConfig
from model import GPT
from tokenizer import load_tokenizer

ROOT = os.path.dirname(os.path.abspath(__file__))
CKPT_DIR = os.path.join(ROOT, "checkpoints")


def load_model(ckpt_path, device="cpu"):
    ckpt = torch.load(ckpt_path, map_location=device)
    mcfg = ModelConfig(**ckpt["model_config"])
    model = GPT(mcfg)
    model.load_state_dict(ckpt["model"])
    model.to(device).eval()
    return model, ckpt


def find_tokenizer():
    for name in ("tokenizer.json", "tokenizer.char.json"):
        p = os.path.join(CKPT_DIR, name)
        if os.path.exists(p):
            return p
    raise SystemExit("Не найден токенизатор в checkpoints/")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--ckpt", default=os.path.join(CKPT_DIR, "best.pt"))
    ap.add_argument("--prompt", default="Однажды")
    ap.add_argument("--tokens", type=int, default=200)
    ap.add_argument("--temperature", type=float, default=0.8)
    ap.add_argument("--top_k", type=int, default=50)
    args = ap.parse_args()

    if not os.path.exists(args.ckpt):
        args.ckpt = os.path.join(CKPT_DIR, "ckpt.pt")

    tok = load_tokenizer(find_tokenizer())
    model, ckpt = load_model(args.ckpt)
    print(f"[модель из {os.path.basename(args.ckpt)}, шаг {ckpt.get('iter')}, "
          f"val-loss {ckpt.get('val_loss'):.3f}]\n")

    ids = torch.tensor([tok.encode(args.prompt)], dtype=torch.long)
    out = model.generate(ids, max_new_tokens=args.tokens,
                         temperature=args.temperature, top_k=args.top_k)
    print(tok.decode(out[0].tolist()))


if __name__ == "__main__":
    main()
