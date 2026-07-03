"""
Конфигурация нашей модели и обучения.

Здесь живут пресеты размеров модели. Архитектура всегда одна и та же
(наш GPT из model.py) — меняется только масштаб. Число «8 миллиардов»
честно заложено пресетом `8B`, но он рассчитан на GPU-железо и НЕ запускается
на этом CPU-сервере (см. поле `note`).
"""

from dataclasses import dataclass, asdict, field


@dataclass
class ModelConfig:
    """Гиперпараметры архитектуры нашего трансформера."""
    vocab_size: int = 16000     # реальный размер задаётся токенизатором после обучения
    block_size: int = 256       # длина контекста (сколько токенов видит модель)
    n_layer: int = 8            # число блоков-трансформеров
    n_head: int = 8             # число голов внимания
    n_embd: int = 512           # размерность эмбеддингов
    dropout: float = 0.1
    bias: bool = True           # использовать ли bias в Linear/LayerNorm

    def n_params_estimate(self) -> int:
        """Грубая оценка числа обучаемых параметров (без эмбеддингов позиций)."""
        # эмбеддинги токенов (расшарены с выходной головой)
        emb = self.vocab_size * self.n_embd
        # на блок: attention (4 * n_embd^2) + mlp (8 * n_embd^2)
        per_block = 12 * self.n_embd * self.n_embd
        return emb + self.n_layer * per_block


@dataclass
class TrainConfig:
    """Гиперпараметры цикла обучения."""
    batch_size: int = 32
    grad_accum_steps: int = 4       # эффективный batch = batch_size * grad_accum_steps
    learning_rate: float = 3e-4
    min_lr: float = 3e-5
    warmup_iters: int = 200
    max_iters: int = 20000
    weight_decay: float = 0.1
    beta1: float = 0.9
    beta2: float = 0.95
    grad_clip: float = 1.0
    eval_interval: int = 250        # как часто считать val-loss и чекпоинтить
    eval_iters: int = 50
    log_interval: int = 10
    num_threads: int = 4            # число CPU-потоков torch


# ---------------------------------------------------------------------------
# Пресеты. Ключ -> (ModelConfig, TrainConfig, человекочитаемое описание).
# ---------------------------------------------------------------------------

PRESETS = {
    # быстрый прогон для отладки — секунды/минуты на CPU
    "debug": dict(
        model=ModelConfig(block_size=128, n_layer=4, n_head=4, n_embd=256, dropout=0.1),
        train=TrainConfig(batch_size=16, grad_accum_steps=1, max_iters=2000,
                          eval_interval=200, warmup_iters=50),
        note="Отладочный пресет. Быстро, качество низкое — только чтобы убедиться, что учится.",
        runnable_here=True,
    ),

    # то, что реально обучаем на этом сервере (4 CPU, 15 GB RAM)
    # Размер подобран по замеру скорости CPU: ~2.8 с/шаг, чтобы за часы фонового
    # обучения пройти тысячи шагов и получить связный русский.
    "max-quality-cpu": dict(
        model=ModelConfig(block_size=256, n_layer=6, n_head=6, n_embd=384, dropout=0.1),
        train=TrainConfig(batch_size=32, grad_accum_steps=1, max_iters=20000,
                          learning_rate=6e-4, min_lr=6e-5,
                          eval_interval=200, warmup_iters=200),
        note="Максимум, что честно тянет этот CPU-сервер по скорости. ~14M параметров. Наша модель с нуля.",
        runnable_here=True,
    ),

    # честно заложенное «8 миллиардов параметров» — НЕ для этого сервера
    "8B": dict(
        model=ModelConfig(block_size=2048, n_layer=40, n_head=32, n_embd=4096, dropout=0.0),
        train=TrainConfig(batch_size=4, grad_accum_steps=256, max_iters=500000,
                          learning_rate=1.5e-4, warmup_iters=2000),
        note=("8 МЛРД параметров. Та же наша архитектура, просто крупнее. "
              "ТРЕБУЕТ GPU и ~128 GB RAM для обучения. На этом сервере (15 GB RAM, без GPU) "
              "запуск невозможен физически: только веса в fp32 = 32 GB. "
              "Пресет существует, чтобы запустить нашу модель на подходящем железе."),
        runnable_here=False,
    ),
}

DEFAULT_PRESET = "max-quality-cpu"


def get_preset(name: str):
    if name not in PRESETS:
        raise KeyError(f"Неизвестный пресет '{name}'. Доступны: {list(PRESETS)}")
    p = PRESETS[name]
    return p["model"], p["train"], p


def describe_presets() -> str:
    lines = []
    for name, p in PRESETS.items():
        m = p["model"]
        n = m.n_params_estimate()
        flag = "запускается здесь" if p["runnable_here"] else "ТОЛЬКО GPU"
        lines.append(
            f"  {name:16s} ~{n/1e6:8.1f}M параметров  [{flag}]\n"
            f"        {p['note']}"
        )
    return "\n".join(lines)


if __name__ == "__main__":
    print("Доступные пресеты нашей модели:\n")
    print(describe_presets())
