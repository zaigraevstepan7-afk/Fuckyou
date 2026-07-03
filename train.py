"""
Обучение нашей модели с нуля на CPU.

Читает токены из data/train.bin / data/val.bin, обучает GPT из model.py
со случайной инициализации (никаких предобученных весов), периодически
считает val-loss и сохраняет чекпоинт в checkpoints/ckpt.pt.

Особенности под эфемерный сервер:
  * чекпоинт каждые eval_interval шагов + сохранение лучшего по val-loss
  * возобновление обучения: --resume (подхватывает шаг, оптимизатор, лучший loss)
  * можно прервать и продолжить без потери прогресса

Примеры:
    python train.py --preset debug --max_iters 300      # быстрый смоук-тест
    python train.py --preset max-quality-cpu            # полноценное обучение
    python train.py --resume                            # продолжить с чекпоинта
"""

import argparse
import json
import math
import os
import time

import numpy as np
import torch

from config import get_preset
from model import GPT

ROOT = os.path.dirname(os.path.abspath(__file__))
DATA = os.path.join(ROOT, "data")
CKPT_DIR = os.path.join(ROOT, "checkpoints")
CKPT = os.path.join(CKPT_DIR, "ckpt.pt")


def get_batch(split, data_dir, block_size, batch_size, device):
    path = os.path.join(data_dir, f"{split}.bin")
    data = np.memmap(path, dtype=np.uint16, mode="r")
    ix = torch.randint(len(data) - block_size - 1, (batch_size,))
    x = torch.stack([torch.from_numpy(data[i:i + block_size].astype(np.int64)) for i in ix])
    y = torch.stack([torch.from_numpy(data[i + 1:i + 1 + block_size].astype(np.int64)) for i in ix])
    return x.to(device), y.to(device)


@torch.no_grad()
def estimate_loss(model, data_dir, block_size, batch_size, eval_iters, device):
    model.eval()
    out = {}
    for split in ("train", "val"):
        losses = torch.zeros(eval_iters)
        for k in range(eval_iters):
            x, y = get_batch(split, data_dir, block_size, batch_size, device)
            _, loss = model(x, y)
            losses[k] = loss.item()
        out[split] = losses.mean().item()
    model.train()
    return out


def lr_at(it, tcfg):
    if it < tcfg.warmup_iters:
        return tcfg.learning_rate * (it + 1) / (tcfg.warmup_iters + 1)
    if it > tcfg.max_iters:
        return tcfg.min_lr
    ratio = (it - tcfg.warmup_iters) / max(1, tcfg.max_iters - tcfg.warmup_iters)
    coeff = 0.5 * (1.0 + math.cos(math.pi * ratio))
    return tcfg.min_lr + coeff * (tcfg.learning_rate - tcfg.min_lr)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--preset", default="max-quality-cpu")
    ap.add_argument("--max_iters", type=int, default=None, help="переопределить max_iters пресета")
    ap.add_argument("--resume", action="store_true", help="продолжить с checkpoints/ckpt.pt")
    ap.add_argument("--data_dir", default=DATA)
    ap.add_argument("--seed", type=int, default=1337)
    args = ap.parse_args()

    torch.manual_seed(args.seed)
    mcfg, tcfg, meta = get_preset(args.preset)
    if not meta["runnable_here"]:
        print(f"[!] ВНИМАНИЕ: пресет '{args.preset}' помечен как не запускаемый на этом сервере:")
        print(f"    {meta['note']}")
        print("[!] Обучение почти наверняка упадёт по памяти. Продолжаю по твоей команде...")
    if args.max_iters is not None:
        tcfg.max_iters = args.max_iters

    torch.set_num_threads(tcfg.num_threads)
    device = "cpu"

    # размер словаря берём из подготовленных данных
    with open(os.path.join(args.data_dir, "meta.json"), encoding="utf-8") as fh:
        data_meta = json.load(fh)
    mcfg.vocab_size = data_meta["vocab_size"]

    os.makedirs(CKPT_DIR, exist_ok=True)

    # инициализация модели / возобновление
    start_iter = 0
    best_val = float("inf")
    model = GPT(mcfg)
    model.to(device)
    optimizer = model.configure_optimizers(
        tcfg.weight_decay, tcfg.learning_rate, (tcfg.beta1, tcfg.beta2))

    if args.resume and os.path.exists(CKPT):
        print(f"[+] Возобновляю с {CKPT}")
        ckpt = torch.load(CKPT, map_location=device)
        model.load_state_dict(ckpt["model"])
        optimizer.load_state_dict(ckpt["optimizer"])
        start_iter = ckpt["iter"] + 1
        best_val = ckpt.get("best_val", best_val)

    n_params = model.num_params()
    print(f"[+] Пресет '{args.preset}': модель {n_params/1e6:.1f}M параметров, "
          f"vocab={mcfg.vocab_size}, block={mcfg.block_size}")
    print(f"[+] Обучаю с шага {start_iter} до {tcfg.max_iters} на {device} "
          f"({tcfg.num_threads} потоков)")
    print(f"[+] Эффективный batch = {tcfg.batch_size} x {tcfg.grad_accum_steps} "
          f"= {tcfg.batch_size * tcfg.grad_accum_steps} последовательностей")

    def save_ckpt(it, val_loss, tag=None):
        blob = {
            "model": model.state_dict(),
            "optimizer": optimizer.state_dict(),
            "iter": it,
            "best_val": best_val,
            "val_loss": val_loss,
            "model_config": vars(mcfg),
            "preset": args.preset,
        }
        torch.save(blob, CKPT)
        if tag:
            torch.save(blob, os.path.join(CKPT_DIR, tag))

    t0 = time.time()
    running = None
    model.train()
    for it in range(start_iter, tcfg.max_iters + 1):
        lr = lr_at(it, tcfg)
        for g in optimizer.param_groups:
            g["lr"] = lr

        # оценка + чекпоинт
        if it % tcfg.eval_interval == 0:
            losses = estimate_loss(model, args.data_dir, mcfg.block_size,
                                   tcfg.batch_size, tcfg.eval_iters, device)
            print(f"[eval] шаг {it}: train {losses['train']:.4f} | "
                  f"val {losses['val']:.4f} | lr {lr:.2e} | "
                  f"{ (time.time()-t0)/60:.1f} мин", flush=True)
            is_best = losses["val"] < best_val
            if is_best:
                best_val = losses["val"]
            save_ckpt(it, losses["val"], tag="best.pt" if is_best else None)

        if it == tcfg.max_iters:
            break

        # шаг обучения с накоплением градиента
        optimizer.zero_grad(set_to_none=True)
        loss_accum = 0.0
        for micro in range(tcfg.grad_accum_steps):
            x, y = get_batch("train", args.data_dir, mcfg.block_size,
                             tcfg.batch_size, device)
            _, loss = model(x, y)
            loss = loss / tcfg.grad_accum_steps
            loss.backward()
            loss_accum += loss.item()
        if tcfg.grad_clip > 0:
            torch.nn.utils.clip_grad_norm_(model.parameters(), tcfg.grad_clip)
        optimizer.step()

        running = loss_accum if running is None else 0.9 * running + 0.1 * loss_accum
        if it % tcfg.log_interval == 0:
            print(f"  шаг {it}: loss {loss_accum:.4f} (сглаж. {running:.4f}) "
                  f"lr {lr:.2e}", flush=True)

    print(f"[=] Обучение завершено. Лучший val-loss: {best_val:.4f}")
    print(f"[=] Чекпоинты: {CKPT} и {os.path.join(CKPT_DIR, 'best.pt')}")


if __name__ == "__main__":
    main()
