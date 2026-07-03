"""
Чат с нашей моделью — наш собственный чат-бот.

Оборачивает реплики в chat-шаблон (<|user|>...<|assistant|>...) и генерирует
ответ ассистента, останавливаясь на <|endoftext|>. Держит короткую историю
диалога в контексте.

    python chat.py                        # интерактивный режим
    python chat.py --once "Привет!"       # один ответ и выход
"""

import argparse
import os

import torch

from sample import load_model, find_tokenizer, pick_checkpoint
from tokenizer import load_tokenizer, build_chat_prompt, EOT, ASSISTANT

ROOT = os.path.dirname(os.path.abspath(__file__))
CKPT_DIR = os.path.join(ROOT, "checkpoints")


def generate_reply(model, tok, history, user_msg, max_new_tokens=200,
                   temperature=0.8, top_k=40):
    prompt = build_chat_prompt(history, user_msg)
    ids = tok.encode(prompt)
    block = model.cfg.block_size
    if len(ids) > block:
        ids = ids[-block:]
    x = torch.tensor([ids], dtype=torch.long)
    eot_id = tok.token_id(EOT)
    out = model.generate(x, max_new_tokens=max_new_tokens,
                         temperature=temperature, top_k=top_k, eos_token=eot_id)
    new_ids = out[0].tolist()[len(ids):]
    text = tok.decode(new_ids)
    # обрезаем по спец-токенам, если модель начала новую реплику
    for stop in (EOT, "<|user|>", ASSISTANT):
        idx = text.find(stop)
        if idx != -1:
            text = text[:idx]
    return text.strip()


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--ckpt", default=None)
    ap.add_argument("--once", default=None, help="задать один вопрос и выйти")
    ap.add_argument("--temperature", type=float, default=0.8)
    ap.add_argument("--top_k", type=int, default=40)
    ap.add_argument("--max_history", type=int, default=4)
    args = ap.parse_args()

    if args.ckpt is None:
        args.ckpt = pick_checkpoint()

    tok = load_tokenizer(find_tokenizer())
    model, ckpt = load_model(args.ckpt)
    print(f"[наша модель: шаг {ckpt.get('iter')}, val-loss {ckpt.get('val_loss'):.3f}]")

    def answer(msg, history):
        return generate_reply(model, tok, history, msg,
                              temperature=args.temperature, top_k=args.top_k)

    if args.once is not None:
        print("Бот:", answer(args.once, []))
        return

    print("Чат с нашей моделью. Пустая строка или 'exit' — выход.\n")
    history = []
    while True:
        try:
            msg = input("Вы: ").strip()
        except (EOFError, KeyboardInterrupt):
            print()
            break
        if not msg or msg.lower() in ("exit", "quit", "выход"):
            break
        reply = answer(msg, history[-args.max_history:])
        print("Бот:", reply, "\n")
        history.append((msg, reply))


if __name__ == "__main__":
    main()
