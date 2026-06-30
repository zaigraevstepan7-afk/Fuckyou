#include "bar.hpp"
#include "theme/theme.hpp"
#include "imgui.h"
#include "imgui_internal.h"
#include <cmath>

namespace ui::bar {
    static float lrp(float a, float b, float t) { return a + (b - a) * t; }
    static float ease(float t) { return -(cosf(3.14159265f * t) - 1.f) / 2.f; }

    void set_game_alpha(float a) { g_game_alpha = a; }
    float game_alpha() { return g_game_alpha; }

    // ── Аним-состояние ватермарка ─────────────────────────────────────────────
    static float wm_hover_a  = 0.f;   // анимация hover
    static float wm_press_a  = 0.f;   // анимация нажатия (flash)
    static float wm_pulse    = 0.f;   // фазовый пульс разделителя

    void render() {
        if (g_game_alpha < 0.001f) return;

        ImGuiIO& io  = ImGui::GetIO();
        float    dt  = io.DeltaTime;

        // ─────────────────────────────────────────────────────────────────────
        //  Скрытая кнопка для toggle (оставляем для совместимости, но
        //  основной тач теперь обрабатывается через ватермарк напрямую)
        // ─────────────────────────────────────────────────────────────────────
        static bool  state = true;
        static float prog  = 0.f;
        static float lt    = 0.f;

        float ct = ImGui::GetTime();
        wm_pulse += dt * 1.8f;

        // ── Размеры ватермарка ────────────────────────────────────────────────
        // Текст: "Delexium|t.me/DelexiumDLC|External"
        // Три секции разделены |
        static const char* WM_PART0 = "holycheatlo";
        static const char* WM_SEP   = " | ";
        static const char* WM_PART1 = "t.me/holycheatlo";
        static const char* WM_PART2 = "External";

        // Используем fontMedium если доступен, иначе дефолт
        ImFont* wm_font = ImGui::GetFont(); (void)wm_font;

        float pad_x = 12.f * 2.5f;
        float pad_y =  7.f * 2.5f;

        // Считаем ширину
        float w0  = ImGui::CalcTextSize(WM_PART0).x;
        float ws  = ImGui::CalcTextSize(WM_SEP).x;
        float w1  = ImGui::CalcTextSize(WM_PART1).x;
        float w2  = ImGui::CalcTextSize(WM_PART2).x;
        float fh2 = ImGui::GetFontSize();

        float total_w = w0 + ws + w1 + ws + w2;
        float box_w   = total_w + pad_x * 2.f;
        float box_h   = fh2 + pad_y * 2.f;

        // Позиция: левый верхний угол + небольшой отступ
        float bx = 16.f;
        float by = 16.f;

        ImRect wm_rect(ImVec2(bx, by), ImVec2(bx + box_w, by + box_h));

        // ── Тач через InvisibleButton — ТОЛЬКО зона ватермарка ───────────────
        ImGui::SetNextWindowPos(wm_rect.Min);
        ImGui::SetNextWindowSize(ImVec2(box_w, box_h));
        ImGui::SetNextWindowBgAlpha(0.f);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding, ImVec2(0, 0));
        ImGui::PushStyleVar(ImGuiStyleVar_WindowBorderSize, 0.f);
        ImGui::Begin("##wm_touch", nullptr,
            ImGuiWindowFlags_NoTitleBar   |
            ImGuiWindowFlags_NoDecoration |
            ImGuiWindowFlags_NoBackground |
            ImGuiWindowFlags_NoMove       |
            ImGuiWindowFlags_NoResize     |
            ImGuiWindowFlags_NoNav);

        ImGui::SetCursorScreenPos(wm_rect.Min);
        bool pressed = ImGui::InvisibleButton("##wm_btn",
            ImVec2(box_w, box_h),
            ImGuiButtonFlags_MouseButtonLeft);
        bool hov_wm  = ImGui::IsItemHovered();

        if (pressed) {
            if (ct - lt >= 0.15f) {
                state      = !state;
                lt         = ct;
                wm_press_a = 1.f;   // flash при клике
            }
        }

        ImGui::End();
        ImGui::PopStyleVar(2);

        // ── Toggle анимация ───────────────────────────────────────────────────
        float tgt = state ? 0.f : 1.f;
        float spd = 12.f * dt;
        if (prog < tgt) prog = ImMin(prog + spd, tgt);
        else            prog = ImMax(prog - spd, tgt);
        prog = ImClamp(prog, 0.f, 1.f);

        g_alpha = ease(prog);
        g_open  = g_alpha > 0.2f;

        // ── Hover / press анимации ────────────────────────────────────────────
        float ha_tgt = hov_wm ? 1.f : 0.f;
        float ha_spd = (hov_wm ? 18.f : 10.f) * dt;
        if (ha_spd > 1.f) ha_spd = 1.f;
        wm_hover_a = lrp(wm_hover_a, ha_tgt, ha_spd);

        // Flash decay
        wm_press_a = lrp(wm_press_a, 0.f, ImClamp(8.f * dt, 0.f, 1.f));

        // ── Draw ватермарка ───────────────────────────────────────────────────
        ImDrawList* fg = ImGui::GetBackgroundDrawList();

        float ga = g_game_alpha;

        // Подсветка flash (при клике)
        float flash = wm_press_a;

        // Цвет рамки: accent с анимацией + пульс
        float pulse_v = 0.5f + 0.5f * sinf(wm_pulse);
        float border_bright = 0.55f + wm_hover_a * 0.30f + pulse_v * 0.15f + flash * 0.30f;

        // ── Тень под ватермарком ──────────────────────────────────────────────
        fg->AddRectFilled(
            ImVec2(bx - 4, by - 4),
            ImVec2(bx + box_w + 4, by + box_h + 4),
            IM_COL32(0, 0, 0, (int)(60 * ga)), 10.f);

        // ── Фон — двух-слойный градиент ──────────────────────────────────────
        {
            // Базовый тёмный слой
            ImU32 bg_tl = IM_COL32(
                (int)(clr::bg_two.x * 255 * 1.3f > 30 ? 30 : clr::bg_two.x * 255 * 1.3f),
                (int)(clr::bg_two.y * 255),
                (int)(clr::bg_two.z * 255),
                (int)(220 * ga));
            ImU32 bg_br = IM_COL32(
                (int)(clr::bg.x * 255),
                (int)(clr::bg.y * 255),
                (int)(clr::bg.z * 255),
                (int)(200 * ga));
            fg->AddRectFilledMultiColor(
                ImVec2(bx, by), ImVec2(bx + box_w, by + box_h),
                bg_tl, bg_tl, bg_br, bg_br);

            // Hover-highlight поверх (акцент)
            if (wm_hover_a > 0.01f || flash > 0.01f) {
                float ha2 = wm_hover_a * 0.15f + flash * 0.25f;
                fg->AddRectFilled(
                    ImVec2(bx, by), ImVec2(bx + box_w, by + box_h),
                    IM_COL32(
                        (int)(clr::accent.x * 255),
                        (int)(clr::accent.y * 255),
                        (int)(clr::accent.z * 255),
                        (int)(255 * ha2 * ga)), 8.f);
            }
        }

        // ── Обводка — accent с пульсом ────────────────────────────────────────
        {
            ImU32 brd = IM_COL32(
                (int)(clr::accent.x * 255 * border_bright),
                (int)(clr::accent.y * 255 * border_bright * 0.4f),
                (int)(clr::accent.z * 255 * border_bright * 0.4f),
                (int)(200 * ga));
            fg->AddRect(ImVec2(bx, by), ImVec2(bx + box_w, by + box_h),
                brd, 8.f, ImDrawFlags_RoundCornersAll, 1.2f);
        }

        // ── Тонкая линия-блик сверху ─────────────────────────────────────────
        fg->AddRectFilled(
            ImVec2(bx + 3, by + 1),
            ImVec2(bx + box_w - 3, by + 2.f),
            IM_COL32(255, 255, 255, (int)(22 * ga)), 4.f);

        // ── Текст ─────────────────────────────────────────────────────────────

        float ty = by + pad_y;
        float tx = bx + pad_x;

        // "Delexium" — accent_light
        fg->AddText(ImVec2(tx, ty),
            IM_COL32(
                (int)(clr::accent_light.x * 255),
                (int)(clr::accent_light.y * 255),
                (int)(clr::accent_light.z * 255),
                (int)(230 * ga)),
            WM_PART0);
        tx += w0;

        // Первый разделитель " | " — пульсирует
        {
            float sp_a = 0.35f + pulse_v * 0.35f;
            fg->AddText(ImVec2(tx, ty),
                IM_COL32(
                    (int)(clr::accent.x * 255),
                    (int)(clr::accent.y * 255),
                    (int)(clr::accent.z * 255),
                    (int)(255 * sp_a * ga)),
                WM_SEP);
        }
        tx += ws;

        // "t.me/DelexiumDLC" — приглушённый белый
        fg->AddText(ImVec2(tx, ty),
            IM_COL32(
                (int)(clr::text_dim.x * 255),
                (int)(clr::text_dim.y * 255),
                (int)(clr::text_dim.z * 255),
                (int)(210 * ga)),
            WM_PART1);
        tx += w1;

        // Второй разделитель
        {
            float sp_a = 0.35f + (1.f - pulse_v) * 0.35f;
            fg->AddText(ImVec2(tx, ty),
                IM_COL32(
                    (int)(clr::accent.x * 255),
                    (int)(clr::accent.y * 255),
                    (int)(clr::accent.z * 255),
                    (int)(255 * sp_a * ga)),
                WM_SEP);
        }
        tx += ws;

        // "External" — текст с hover-brightening
        {
            float eb = 0.7f + wm_hover_a * 0.3f;
            fg->AddText(ImVec2(tx, ty),
                IM_COL32(
                    (int)(clr::text.x * 255 * eb),
                    (int)(clr::text.y * 255 * eb),
                    (int)(clr::text.z * 255 * eb),
                    (int)(215 * ga)),
                WM_PART2);
        }


        // ── Индикатор состояния меню — маленькая точка справа внизу ──────────
        {
            float dot_x = bx + box_w - 8.f;
            float dot_y = by + box_h - 8.f;
            float dot_r = 3.5f;
            // Открыто = accent, закрыто = тёмный
            float oa = g_alpha;
            ImU32 dot_col = IM_COL32(
                (int)(lrp(80, clr::accent_light.x * 255, oa)),
                (int)(lrp(30, clr::accent_light.y * 255, oa)),
                (int)(lrp(30, clr::accent_light.z * 255, oa)),
                (int)(200 * ga));
            fg->AddCircleFilled(ImVec2(dot_x, dot_y), dot_r, dot_col);
            // Glow когда открыто
            if (oa > 0.05f) {
                fg->AddCircleFilled(ImVec2(dot_x, dot_y), dot_r + 3.f,
                    IM_COL32(
                        (int)(clr::accent.x * 255),
                        (int)(clr::accent.y * 255),
                        (int)(clr::accent.z * 255),
                        (int)(50 * oa * ga)));
            }
        }
    }
}
