"""
Наш GPT — decoder-only трансформер, реализованный с нуля на PyTorch.

Здесь нет никаких предобученных весов. PyTorch используется только как
библиотека тензоров и автоград; все параметры инициализируются случайно
и учатся исключительно на наших данных. Это «полностью наша» модель.

Архитектура в духе GPT-2 / nanoGPT:
  token embedding + learned positional embedding
  -> N блоков (pre-LN, causal multi-head self-attention, MLP с GELU)
  -> финальный LayerNorm -> линейная голова (веса расшарены с эмбеддингом)
"""

import math
import torch
import torch.nn as nn
from torch.nn import functional as F


class LayerNorm(nn.Module):
    """LayerNorm с опциональным bias (torch не даёт отключить bias у nn.LayerNorm)."""

    def __init__(self, ndim, bias):
        super().__init__()
        self.weight = nn.Parameter(torch.ones(ndim))
        self.bias = nn.Parameter(torch.zeros(ndim)) if bias else None

    def forward(self, x):
        return F.layer_norm(x, self.weight.shape, self.weight, self.bias, 1e-5)


class CausalSelfAttention(nn.Module):
    """Многоголовое причинное (causal) внимание."""

    def __init__(self, cfg):
        super().__init__()
        assert cfg.n_embd % cfg.n_head == 0
        # общая проекция для q, k, v сразу
        self.c_attn = nn.Linear(cfg.n_embd, 3 * cfg.n_embd, bias=cfg.bias)
        # выходная проекция
        self.c_proj = nn.Linear(cfg.n_embd, cfg.n_embd, bias=cfg.bias)
        self.attn_dropout = nn.Dropout(cfg.dropout)
        self.resid_dropout = nn.Dropout(cfg.dropout)
        self.n_head = cfg.n_head
        self.n_embd = cfg.n_embd
        self.dropout = cfg.dropout
        # используем быстрый scaled_dot_product_attention, если доступен
        self.flash = hasattr(F, "scaled_dot_product_attention")
        if not self.flash:
            # причинная маска: нижнетреугольная
            self.register_buffer(
                "mask",
                torch.tril(torch.ones(cfg.block_size, cfg.block_size))
                .view(1, 1, cfg.block_size, cfg.block_size),
            )

    def forward(self, x):
        B, T, C = x.size()
        q, k, v = self.c_attn(x).split(self.n_embd, dim=2)
        # разбиваем на головы: (B, nh, T, hs)
        k = k.view(B, T, self.n_head, C // self.n_head).transpose(1, 2)
        q = q.view(B, T, self.n_head, C // self.n_head).transpose(1, 2)
        v = v.view(B, T, self.n_head, C // self.n_head).transpose(1, 2)

        if self.flash:
            y = F.scaled_dot_product_attention(
                q, k, v, attn_mask=None,
                dropout_p=self.dropout if self.training else 0.0,
                is_causal=True,
            )
        else:
            att = (q @ k.transpose(-2, -1)) * (1.0 / math.sqrt(k.size(-1)))
            att = att.masked_fill(self.mask[:, :, :T, :T] == 0, float("-inf"))
            att = F.softmax(att, dim=-1)
            att = self.attn_dropout(att)
            y = att @ v
        y = y.transpose(1, 2).contiguous().view(B, T, C)
        return self.resid_dropout(self.c_proj(y))


class MLP(nn.Module):
    """Полносвязный блок 4x с GELU."""

    def __init__(self, cfg):
        super().__init__()
        self.c_fc = nn.Linear(cfg.n_embd, 4 * cfg.n_embd, bias=cfg.bias)
        self.gelu = nn.GELU()
        self.c_proj = nn.Linear(4 * cfg.n_embd, cfg.n_embd, bias=cfg.bias)
        self.dropout = nn.Dropout(cfg.dropout)

    def forward(self, x):
        return self.dropout(self.c_proj(self.gelu(self.c_fc(x))))


class Block(nn.Module):
    """Один блок трансформера: pre-LN + attention + pre-LN + MLP, с residual."""

    def __init__(self, cfg):
        super().__init__()
        self.ln_1 = LayerNorm(cfg.n_embd, cfg.bias)
        self.attn = CausalSelfAttention(cfg)
        self.ln_2 = LayerNorm(cfg.n_embd, cfg.bias)
        self.mlp = MLP(cfg)

    def forward(self, x):
        x = x + self.attn(self.ln_1(x))
        x = x + self.mlp(self.ln_2(x))
        return x


class GPT(nn.Module):
    """Наша языковая модель целиком."""

    def __init__(self, cfg):
        super().__init__()
        assert cfg.vocab_size is not None
        assert cfg.block_size is not None
        self.cfg = cfg

        self.transformer = nn.ModuleDict(dict(
            wte=nn.Embedding(cfg.vocab_size, cfg.n_embd),      # эмбеддинги токенов
            wpe=nn.Embedding(cfg.block_size, cfg.n_embd),      # эмбеддинги позиций
            drop=nn.Dropout(cfg.dropout),
            h=nn.ModuleList([Block(cfg) for _ in range(cfg.n_layer)]),
            ln_f=LayerNorm(cfg.n_embd, cfg.bias),
        ))
        self.lm_head = nn.Linear(cfg.n_embd, cfg.vocab_size, bias=False)
        # weight tying: вход и выход делят одну матрицу эмбеддингов
        self.transformer.wte.weight = self.lm_head.weight

        self.apply(self._init_weights)
        # особая инициализация residual-проекций (по мотивам GPT-2)
        for pn, p in self.named_parameters():
            if pn.endswith("c_proj.weight"):
                nn.init.normal_(p, mean=0.0, std=0.02 / math.sqrt(2 * cfg.n_layer))

    def _init_weights(self, module):
        if isinstance(module, nn.Linear):
            nn.init.normal_(module.weight, mean=0.0, std=0.02)
            if module.bias is not None:
                nn.init.zeros_(module.bias)
        elif isinstance(module, nn.Embedding):
            nn.init.normal_(module.weight, mean=0.0, std=0.02)

    def num_params(self, non_embedding=True):
        n = sum(p.numel() for p in self.parameters())
        if non_embedding:
            n -= self.transformer.wpe.weight.numel()
        return n

    def forward(self, idx, targets=None):
        device = idx.device
        b, t = idx.size()
        assert t <= self.cfg.block_size, \
            f"Длина последовательности {t} больше block_size {self.cfg.block_size}"
        pos = torch.arange(0, t, dtype=torch.long, device=device)

        tok_emb = self.transformer.wte(idx)      # (b, t, n_embd)
        pos_emb = self.transformer.wpe(pos)      # (t, n_embd)
        x = self.transformer.drop(tok_emb + pos_emb)
        for block in self.transformer.h:
            x = block(x)
        x = self.transformer.ln_f(x)

        if targets is not None:
            logits = self.lm_head(x)
            loss = F.cross_entropy(
                logits.view(-1, logits.size(-1)), targets.view(-1),
                ignore_index=-1,
            )
            return logits, loss
        else:
            # на инференсе считаем логиты только для последней позиции
            logits = self.lm_head(x[:, [-1], :])
            return logits, None

    def configure_optimizers(self, weight_decay, learning_rate, betas):
        """AdamW: weight decay применяем только к 2D-весам (матрицам), не к bias/LN."""
        decay, no_decay = [], []
        for _, p in self.named_parameters():
            if not p.requires_grad:
                continue
            if p.dim() >= 2:
                decay.append(p)
            else:
                no_decay.append(p)
        groups = [
            {"params": decay, "weight_decay": weight_decay},
            {"params": no_decay, "weight_decay": 0.0},
        ]
        return torch.optim.AdamW(groups, lr=learning_rate, betas=betas)

    @torch.no_grad()
    def generate(self, idx, max_new_tokens, temperature=1.0, top_k=None, eos_token=None):
        """Авторегрессионная генерация. idx: (b, t) стартовый контекст."""
        for _ in range(max_new_tokens):
            # обрезаем контекст до block_size
            idx_cond = idx if idx.size(1) <= self.cfg.block_size \
                else idx[:, -self.cfg.block_size:]
            logits, _ = self(idx_cond)
            logits = logits[:, -1, :] / max(temperature, 1e-6)
            if top_k is not None:
                v, _ = torch.topk(logits, min(top_k, logits.size(-1)))
                logits[logits < v[:, [-1]]] = float("-inf")
            probs = F.softmax(logits, dim=-1)
            idx_next = torch.multinomial(probs, num_samples=1)
            idx = torch.cat((idx, idx_next), dim=1)
            if eos_token is not None and (idx_next == eos_token).all():
                break
        return idx
