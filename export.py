"""
Экспорт лёгкого инференс-чекпоинта.

Полный checkpoints/best.pt содержит веса + состояние оптимизатора (тяжёлый).
Для раздачи/коммита нам нужны только веса. Скрипт сохраняет их в fp16 в
checkpoints/model.pt — эту модель грузят sample.py / chat.py.

    python export.py                 # best.pt -> model.pt (fp16)
"""

import argparse
import os

import torch

ROOT = os.path.dirname(os.path.abspath(__file__))
CKPT_DIR = os.path.join(ROOT, "checkpoints")


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--src", default=os.path.join(CKPT_DIR, "best.pt"))
    ap.add_argument("--dst", default=os.path.join(CKPT_DIR, "model.pt"))
    ap.add_argument("--fp16", action="store_true", default=True)
    args = ap.parse_args()

    ckpt = torch.load(args.src, map_location="cpu")
    state = ckpt["model"]
    if args.fp16:
        state = {k: (v.half() if v.is_floating_point() else v) for k, v in state.items()}

    blob = {
        "model": state,
        "model_config": ckpt["model_config"],
        "preset": ckpt.get("preset"),
        "iter": ckpt.get("iter"),
        "val_loss": ckpt.get("val_loss"),
        "dtype": "float16" if args.fp16 else "float32",
    }
    torch.save(blob, args.dst)
    size = os.path.getsize(args.dst) / 1e6
    print(f"[=] {os.path.basename(args.src)} -> {os.path.basename(args.dst)} "
          f"({size:.1f} MB, шаг {blob['iter']}, val-loss {blob['val_loss']:.3f})")


if __name__ == "__main__":
    main()
