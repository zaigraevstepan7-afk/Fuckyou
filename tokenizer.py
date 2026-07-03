"""
Наш токенизатор.

Основной вариант — byte-level BPE, ОБУЧАЕМЫЙ с нуля на нашем русском корпусе
(словарь выучивается из наших данных, ничего предобученного мы не берём).
Реализован поверх библиотеки `tokenizers` — она только выполняет алгоритм BPE,
сам словарь — наш.

Спец-токены для чат-шаблона:
    <|endoftext|>  — разделитель документов / конец последовательности
    <|user|>       — начало реплики пользователя
    <|assistant|>  — начало реплики ассистента

Если `tokenizers` недоступна — есть чистый char-level fallback (100% наш,
без сторонних зависимостей, ценой качества).
"""

import json
import os

SPECIAL_TOKENS = ["<|endoftext|>", "<|user|>", "<|assistant|>"]
EOT = "<|endoftext|>"
USER = "<|user|>"
ASSISTANT = "<|assistant|>"


# ---------------------------------------------------------------------------
# Основной токенизатор: byte-level BPE
# ---------------------------------------------------------------------------
class BPETokenizer:
    def __init__(self, tok=None):
        self._tok = tok  # объект tokenizers.Tokenizer

    @classmethod
    def train(cls, files, vocab_size, save_path):
        """Обучить BPE с нуля на текстовых файлах `files`."""
        from tokenizers import Tokenizer, models, trainers, pre_tokenizers, decoders

        tok = Tokenizer(models.BPE(unk_token=None))
        tok.pre_tokenizer = pre_tokenizers.ByteLevel(add_prefix_space=False)
        tok.decoder = decoders.ByteLevel()
        trainer = trainers.BpeTrainer(
            vocab_size=vocab_size,
            special_tokens=SPECIAL_TOKENS,
            initial_alphabet=pre_tokenizers.ByteLevel.alphabet(),
            show_progress=True,
        )
        tok.train(files, trainer)
        os.makedirs(os.path.dirname(os.path.abspath(save_path)), exist_ok=True)
        tok.save(save_path)
        return cls(tok)

    @classmethod
    def load(cls, path):
        from tokenizers import Tokenizer
        return cls(Tokenizer.from_file(path))

    def encode(self, text):
        return self._tok.encode(text).ids

    def decode(self, ids):
        return self._tok.decode(ids, skip_special_tokens=False)

    def token_id(self, token):
        return self._tok.token_to_id(token)

    @property
    def vocab_size(self):
        return self._tok.get_vocab_size()


# ---------------------------------------------------------------------------
# Fallback: char-level токенизатор (без зависимостей)
# ---------------------------------------------------------------------------
class CharTokenizer:
    def __init__(self, stoi, itos):
        self.stoi = stoi
        self.itos = {int(k): v for k, v in itos.items()}
        # спец-токены получают отдельные id за пределами алфавита символов
        self.specials = {}
        base = max(self.itos) + 1 if self.itos else 0
        for i, s in enumerate(SPECIAL_TOKENS):
            self.specials[s] = base + i

    @classmethod
    def train(cls, files, save_path, **_):
        chars = set()
        for f in files:
            with open(f, "r", encoding="utf-8", errors="ignore") as fh:
                for line in fh:
                    chars.update(line)
        itos = {i: ch for i, ch in enumerate(sorted(chars))}
        stoi = {ch: i for i, ch in itos.items()}
        os.makedirs(os.path.dirname(os.path.abspath(save_path)), exist_ok=True)
        with open(save_path, "w", encoding="utf-8") as fh:
            json.dump({"stoi": stoi, "itos": itos}, fh, ensure_ascii=False)
        return cls(stoi, itos)

    @classmethod
    def load(cls, path):
        with open(path, "r", encoding="utf-8") as fh:
            d = json.load(fh)
        return cls(d["stoi"], d["itos"])

    def encode(self, text):
        ids = []
        i = 0
        while i < len(text):
            matched = False
            for s, sid in self.specials.items():
                if text.startswith(s, i):
                    ids.append(sid)
                    i += len(s)
                    matched = True
                    break
            if not matched:
                ids.append(self.stoi.get(text[i], 0))
                i += 1
        return ids

    def decode(self, ids):
        rev_special = {v: k for k, v in self.specials.items()}
        out = []
        for i in ids:
            if i in rev_special:
                out.append(rev_special[i])
            else:
                out.append(self.itos.get(i, ""))
        return "".join(out)

    def token_id(self, token):
        return self.specials.get(token)

    @property
    def vocab_size(self):
        return (max(self.itos) if self.itos else -1) + 1 + len(SPECIAL_TOKENS)


# ---------------------------------------------------------------------------
# Единая точка входа: авто-выбор BPE, иначе char
# ---------------------------------------------------------------------------
def load_tokenizer(path):
    """Загрузить токенизатор по пути. .json BPE или char-json."""
    if path.endswith(".char.json"):
        return CharTokenizer.load(path)
    try:
        return BPETokenizer.load(path)
    except Exception:
        return CharTokenizer.load(path)


def build_chat_prompt(history, user_message):
    """Собрать промпт в chat-шаблоне для инференса.

    history: список пар (user_text, assistant_text) — прошлые ходы.
    Возвращает строку, заканчивающуюся на <|assistant|> — модель продолжает ответ.
    """
    parts = []
    for u, a in history:
        parts.append(f"{USER}{u}{ASSISTANT}{a}{EOT}")
    parts.append(f"{USER}{user_message}{ASSISTANT}")
    return "".join(parts)


if __name__ == "__main__":
    import sys
    tok = load_tokenizer(sys.argv[1] if len(sys.argv) > 1 else "checkpoints/tokenizer.json")
    s = "Привет! Как дела? Это наша модель."
    ids = tok.encode(s)
    back = tok.decode(ids)
    print("vocab_size:", tok.vocab_size)
    print("текст   :", s)
    print("токенов :", len(ids))
    print("decode  :", back)
    print("roundtrip OK:", s in back)
