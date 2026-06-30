#define IMGUI_DEFINE_MATH_OPERATORS
#include "widgets.hpp"
#include "../theme/theme.hpp"
#include <cmath>
#include <functional>
#include <cstdio>
#include <cstring>

namespace ui {
namespace style {
    static float dt      = 0.016f;
    static bool  clicked = false;

    static float lrp(float a, float b, float t) { return a + (b - a) * t; }
    static ImVec4 lrp_col(const ImVec4& a, const ImVec4& b, float t) {
        return ImVec4(lrp(a.x,b.x,t), lrp(a.y,b.y,t), lrp(a.z,b.z,t), lrp(a.w,b.w,t));
    }

    void tick() {
        clicked = false;
        static float lt = 0.f;
        float ct = ImGui::GetTime();
        if (lt > 0.f) {
            dt = ct - lt;
            dt = ImClamp(dt, 0.001f, 0.1f);
        }
        lt = ct;
    }

    float anim(const std::string& id, float tgt, float spd) {
        std::unordered_map<std::string, float>::iterator it = anims.find(id);
        if (it == anims.end()) { anims[id] = tgt; return tgt; }
        float t = ImClamp(spd * dt, 0.f, 1.f);
        it->second = lrp(it->second, tgt, t);
        if (fabsf(it->second - tgt) < 0.001f) it->second = tgt;
        return it->second;
    }

    ImVec4 anim_col(const std::string& id, const ImVec4& tgt, float spd) {
        std::unordered_map<std::string, ImVec4>::iterator it = anim_colors.find(id);
        if (it == anim_colors.end()) { anim_colors[id] = tgt; return tgt; }
        float t = ImClamp(spd * dt, 0.f, 1.f);
        it->second = lrp_col(it->second, tgt, t);
        return it->second;
    }

    ImU32 col(const ImVec4& c, float a) {
        return IM_COL32(
            (int)(c.x * 255),
            (int)(c.y * 255),
            (int)(c.z * 255),
            (int)(c.w * 255 * a * content_alpha));
    }

    bool popup() { return popup_open || !active_popup.empty(); }
    void close() { active_popup = ""; popup_open = false; }

    void popups() {
        if (active_popup.empty()) return;
        float pa = anim(active_popup + "_pa", 1.f, 18.f);
        if (pa < 0.01f) { active_popup = ""; return; }
        if (pa > 0.15f && ImGui::IsMouseClicked(0) && !clicked) {
            active_popup = "";
            popup_open   = false;
        }
    }
}

namespace widgets {
    using namespace style;

    // ─── helpers ─────────────────────────────────────────────────────────────

    // Интерполяция двух IM_COL32
    static ImU32 lerpU32(ImU32 from, ImU32 to, float t) {
        int fr = (from >> IM_COL32_R_SHIFT) & 0xFF;
        int fg = (from >> IM_COL32_G_SHIFT) & 0xFF;
        int fb = (from >> IM_COL32_B_SHIFT) & 0xFF;
        int fa = (from >> IM_COL32_A_SHIFT) & 0xFF;
        int tr = (to   >> IM_COL32_R_SHIFT) & 0xFF;
        int tg = (to   >> IM_COL32_G_SHIFT) & 0xFF;
        int tb = (to   >> IM_COL32_B_SHIFT) & 0xFF;
        int ta = (to   >> IM_COL32_A_SHIFT) & 0xFF;
        return IM_COL32(
            (int)(fr + (tr - fr) * t),
            (int)(fg + (tg - fg) * t),
            (int)(fb + (tb - fb) * t),
            (int)(fa + (ta - fa) * t));
    }

    // Градиентный фон строки — цвет берётся из clr::accent (настраивается пользователем)
    // p,sz — позиция и размер строки; a — мастер-альфа; bright — 0..1 интенсивность
    static void row_gradient(ImDrawList* dl, ImVec2 p, ImVec2 sz,
                              float a, float bright, float rounding)
    {
        // Берём акцент из темы — так цвет реагирует на настройку пользователя
        float ar = clr::accent.x;
        float ag = clr::accent.y;
        float ab = clr::accent.z;

        // Левый край ярче (0.25 от accent), правый темнее (0.08 от accent)
        ImU32 c_l = IM_COL32(
            (int)(ar * 255 * 0.25f * bright),
            (int)(ag * 255 * 0.06f * bright),
            (int)(ab * 255 * 0.06f * bright),
            (int)(180 * a * content_alpha));
        ImU32 c_r = IM_COL32(
            (int)(ar * 255 * 0.10f * bright),
            (int)(ag * 255 * 0.03f * bright),
            (int)(ab * 255 * 0.03f * bright),
            (int)(140 * a * content_alpha));
        dl->AddRectFilledMultiColor(p, ImVec2(p.x+sz.x, p.y+sz.y), c_l, c_r, c_r, c_l);
        // тонкая обводка в цвет accent (приглушённая)
        dl->AddRect(p, ImVec2(p.x+sz.x, p.y+sz.y),
            IM_COL32(
                (int)(ar * 255 * 0.55f),
                (int)(ag * 255 * 0.12f),
                (int)(ab * 255 * 0.12f),
                (int)(90 * a * content_alpha)),
            rounding);
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  CHECKBOX — pill-toggle с красным акцентом + градиентный фон строки
    // ─────────────────────────────────────────────────────────────────────────
    static float s_toggleAnim[256] = {};
    static int toggleHash(const char* s) {
        unsigned h = 2166136261u;
        while (*s) { h ^= (unsigned char)*s++; h *= 16777619u; }
        return (int)(h & 0xFF);
    }

    bool checkbox(const char* name, bool* v, float a) {
        if (a < 0.01f) return false;

        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return false;

        std::string  ids = std::string("tgl_") + name;
        ImGuiID      id  = w->GetID(ids.c_str());

        const float ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        const float row = 30.f * S;   // высота строки
        const float tw  = 44.f * S;   // ширина pill
        const float th  = 22.f * S;   // высота pill
        const float pad = 10.f * S;

        ImVec2 pos = w->DC.CursorPos;
        ImRect r(pos, ImVec2(pos.x + ww, pos.y + row));

        ImGui::ItemSize(r);
        if (!ImGui::ItemAdd(r, id)) return false;

        bool hov   = ImGui::IsMouseHoveringRect(r.Min, r.Max) && !popup();
        bool press = hov && ImGui::IsMouseClicked(0) && !clicked;
        if (press) { *v = !*v; clicked = true; }

        // анимация toggle
        int   slot   = toggleHash(name);
        float target = *v ? 1.f : 0.f;
        {
            float spd = ImGui::GetIO().DeltaTime * 14.f;
            if (spd > 1.f) spd = 1.f;
            s_toggleAnim[slot] = lrp(s_toggleAnim[slot], target, spd);
            if (fabsf(s_toggleAnim[slot] - target) < 0.005f)
                s_toggleAnim[slot] = target;
        }
        float ta = s_toggleAnim[slot];

        // анимация hover
        float ha = anim(ids + "_h", hov ? 1.f : 0.f, hov ? 18.f : 12.f);

        ImDrawList* dl = w->DrawList;

        // ── градиентный фон строки (врезается в меню)
        ImVec2 bg_sz(ww, row);
        row_gradient(dl, pos, bg_sz, a, 0.6f + ha * 0.4f, 4.f);

        // ── pill track
        ImVec2 ta_v(pos.x + ww - tw - pad, pos.y + (row - th) * 0.5f);
        ImVec2 tb_v(pos.x + ww - pad,      ta_v.y + th);

        // track: OFF = тёмная версия accent, ON = accent
        ImU32 off_col = IM_COL32(
            (int)(clr::accent.x * 255 * 0.25f),
            (int)(clr::accent.y * 255 * 0.08f),
            (int)(clr::accent.z * 255 * 0.08f),
            (int)(220 * a * content_alpha));
        ImU32 on_col  = IM_COL32(
            (int)(clr::accent.x * 255),
            (int)(clr::accent.y * 255),
            (int)(clr::accent.z * 255),
            (int)(230 * a * content_alpha));
        ImU32 track = lerpU32(off_col, on_col, ta);
        dl->AddRectFilled(ta_v, tb_v, track, th * 0.5f);

        // внутренний градиент поверх track — сверху светлее
        {
            ImU32 shine_t = IM_COL32(255, 255, 255, (int)(30 * ta * a * content_alpha));
            ImU32 shine_b = IM_COL32(0,   0,   0,   0);
            dl->AddRectFilledMultiColor(
                ta_v, ImVec2(tb_v.x, ta_v.y + th * 0.5f),
                shine_t, shine_t, shine_b, shine_b);
        }

        // thumb — белый кружок с тенью
        float thumb_cx = lrp(ta_v.x + th * 0.5f, tb_v.x - th * 0.5f, ta);
        float thumb_cy = ta_v.y + th * 0.5f;
        float thumb_r  = th * 0.5f - 3.f * S;
        // тень
        dl->AddCircleFilled(
            ImVec2(thumb_cx + 1.5f * S, thumb_cy + 1.5f * S),
            thumb_r, IM_COL32(0, 0, 0, (int)(80 * a * content_alpha)));
        // thumb
        ImU32 thumb_col = lerpU32(
            IM_COL32(160, 130, 130, (int)(240 * a * content_alpha)),
            IM_COL32(255, 240, 240, (int)(255 * a * content_alpha)),
            ta);
        dl->AddCircleFilled(ImVec2(thumb_cx, thumb_cy), thumb_r, thumb_col);

        // glow вокруг pill когда ON — цвет accent
        if (ta > 0.05f) {
            ImU32 glow = IM_COL32(
                (int)(clr::accent.x * 255),
                (int)(clr::accent.y * 255),
                (int)(clr::accent.z * 255),
                (int)(35 * ta * a * content_alpha));
            dl->AddRectFilled(
                ImVec2(ta_v.x - 4, ta_v.y - 3),
                ImVec2(tb_v.x + 4, tb_v.y + 3),
                glow, th * 0.5f + 3.f);
        }

        // обводка pill — от тёмного accent до яркого accent
        dl->AddRect(ta_v, tb_v,
            lerpU32(
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.4f),
                    (int)(clr::accent.y * 255 * 0.1f),
                    (int)(clr::accent.z * 255 * 0.1f),
                    (int)(180 * a * content_alpha)),
                IM_COL32(
                    (int)(clr::accent_light.x * 255),
                    (int)(clr::accent_light.y * 255),
                    (int)(clr::accent_light.z * 255),
                    (int)(200 * a * content_alpha)),
                ta),
            th * 0.5f, ImDrawFlags_RoundCornersAll, 1.f);

        // ── текст
        float text_h = ImGui::GetFontSize();
        float text_y = pos.y + (row - text_h) * 0.5f;
        ImVec4 tc = anim_col(ids + "_tc",
            *v ? clr::text_light : clr::text, 12.f);
        dl->AddText(ImVec2(pos.x + pad, text_y), col(tc, a), name);

        return press;
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  SLIDER — закруглённый, красный градиентный трек + врезка в фон
    // ─────────────────────────────────────────────────────────────────────────
    static std::unordered_map<ImGuiID, bool> sl_active;
    static std::unordered_map<ImGuiID, bool> sl_locked;

    bool slider(const char* name, float* v, float mn, float mx, float a,
                const char* fmt) {
        if (a < 0.01f) return false;

        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return false;

        std::string ids = std::string("sl_") + name;
        ImGuiID     id  = w->GetID(ids.c_str());

        const float ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        const float row = 44.f * S;
        const float pad = 10.f * S;

        // вычисляем ширину текста для лейбла и значения
        float lab_w = ImGui::CalcTextSize(name).x;
        char  vbuf[48];
        snprintf(vbuf, sizeof(vbuf), fmt, *v);
        float val_w = ImGui::CalcTextSize(vbuf).x + pad;

        const float track_h = 5.f * S;
        const float gap     = 8.f * S;
        const float track_x = pad + lab_w + gap;
        float track_w = ww - track_x - val_w - pad;
        if (track_w < 20.f * S) track_w = 20.f * S;

        ImVec2 pos = w->DC.CursorPos;
        ImRect r(pos, ImVec2(pos.x + ww, pos.y + row));

        float cy = pos.y + row * 0.5f;
        ImVec2 sa(pos.x + track_x,           cy - track_h * 0.5f);
        ImVec2 sb(pos.x + track_x + track_w, cy + track_h * 0.5f);
        ImRect bar(sa, sb);

        ImGui::ItemSize(r);
        if (!ImGui::ItemAdd(r, id)) return false;

        bool hov_btn = false, held = false;
        ImGui::ButtonBehavior(bar, id, &hov_btn, &held, ImGuiButtonFlags_None);

        if (held && !popup()) {
            if (sl_active.find(id) == sl_active.end()) {
                sl_active[id] = false;
                sl_locked[id] = false;
            }
            ImVec2 drag = ImGui::GetMouseDragDelta(0, 0.f);
            float dx = fabsf(drag.x), dy = fabsf(drag.y);
            if (!sl_active[id] && !sl_locked[id]) {
                if (dy > 8.f)        sl_locked[id] = true;
                else if (dx > 5.f)  sl_active[id] = true;
            }
            if (sl_active[id]) {
                float mp_x = ImGui::GetIO().MousePos.x;
                float nn = ImClamp((mp_x - bar.Min.x) / bar.GetWidth(), 0.f, 1.f);
                *v = mn + nn * (mx - mn);
            }
        } else {
            sl_active.erase(id);
            sl_locked.erase(id);
        }

        float norm    = (*v - mn) / (mx - mn);
        float na      = anim(ids + "_n", norm, 20.f);
        bool  is_held = held && !popup() &&
                        sl_active.count(id) && sl_active[id];
        float ha      = anim(ids + "_h", is_held ? 1.f : 0.f,
                             is_held ? 20.f : 12.f);
        float hov_a   = anim(ids + "_hov", hov_btn ? 1.f : 0.f, 14.f);

        ImDrawList* dl = w->DrawList;

        // ── градиентный фон строки (врезка в меню)
        row_gradient(dl, pos, ImVec2(ww, row), a, 0.55f + hov_a * 0.45f, 4.f);

        // ── текст лейбла
        float lh = ImGui::GetFontSize();
        dl->AddText(ImVec2(pos.x + pad, cy - lh * 0.5f),
                    col(clr::text_dim, a), name);

        // ── значение справа
        snprintf(vbuf, sizeof(vbuf), fmt, *v);
        ImVec2 vs = ImGui::CalcTextSize(vbuf);
        ImVec4 val_col = lrp_col(clr::text_dim, clr::accent_light, ha);
        dl->AddText(ImVec2(sb.x + gap, cy - vs.y * 0.5f),
                    col(val_col, a), vbuf);

        // ── track background — закруглённый, тёмная версия accent
        float r_track = track_h * 0.5f;
        dl->AddRectFilled(sa, sb,
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.20f),
                (int)(clr::accent.y * 255 * 0.06f),
                (int)(clr::accent.z * 255 * 0.06f),
                (int)(220 * a * content_alpha)), r_track);
        dl->AddRect(sa, sb,
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.35f),
                (int)(clr::accent.y * 255 * 0.08f),
                (int)(clr::accent.z * 255 * 0.08f),
                (int)(160 * a * content_alpha)), r_track);

        // ── filled part — красный градиент слева направо
        if (na > 0.005f) {
            float gx = sa.x + na * track_w;
            ImU32 fill_l = IM_COL32(
                (int)(clr::accent_light.x * 255),
                (int)(clr::accent_light.y * 255),
                (int)(clr::accent_light.z * 255),
                (int)(220 * a * content_alpha));
            ImU32 fill_r = IM_COL32(
                (int)(clr::accent.x * 255),
                (int)(clr::accent.y * 255),
                (int)(clr::accent.z * 255),
                (int)(200 * a * content_alpha));
            dl->AddRectFilledMultiColor(
                sa, ImVec2(gx, sb.y),
                fill_l, fill_r, fill_r, fill_l);
            // блик сверху
            ImU32 shine = IM_COL32(255, 255, 255, (int)(40 * a * content_alpha));
            dl->AddRectFilledMultiColor(
                sa, ImVec2(gx, sa.y + track_h * 0.45f),
                shine, shine,
                IM_COL32(255,255,255,0), IM_COL32(255,255,255,0));
        }

        // ── thumb — закруглённый ромбик/кружок с красным свечением
        {
            float gx    = sa.x + na * track_w;
            float dot_r = (is_held ? 7.5f : 6.f) * S;
            // тень
            dl->AddCircleFilled(
                ImVec2(gx + 1.5f * S, cy + 1.5f * S),
                dot_r * 0.85f,
                IM_COL32(0, 0, 0, (int)(70 * a * content_alpha)));
            // glow
            if (ha > 0.01f) {
                dl->AddCircleFilled(
                    ImVec2(gx, cy),
                    dot_r + 4.f * S,
                    IM_COL32(
                        (int)(clr::accent.x * 255),
                        (int)(clr::accent.y * 255),
                        (int)(clr::accent.z * 255),
                        (int)(40 * ha * a * content_alpha)));
            }
            // thumb тело: белый с красным оттенком
            ImU32 dot_col = lerpU32(
                IM_COL32(220, 200, 200, (int)(240 * a * content_alpha)),
                IM_COL32(255, 240, 240, (int)(255 * a * content_alpha)),
                ha);
            dl->AddCircleFilled(ImVec2(gx, cy), dot_r, dot_col);
            // обводка thumb — accent
            dl->AddCircle(ImVec2(gx, cy), dot_r,
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.80f),
                    (int)(clr::accent.y * 255 * 0.20f),
                    (int)(clr::accent.z * 255 * 0.20f),
                    (int)(180 * a * content_alpha)), 12, 1.5f);
        }

        return is_held;
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  COMBO — оставляем нативный ImGui, тема подхватит цвета
    // ─────────────────────────────────────────────────────────────────────────
    bool combo(const char* name, int* v,
               const std::vector<const char*>& items, float a) {
        if (a < 0.01f) return false;
        float ww = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        ImGui::PushStyleVar(ImGuiStyleVar_Alpha, a * content_alpha);
        ImGui::PushItemWidth(ww * 0.55f);

        char buf[512];
        int  pos = 0;
        for (int i = 0; i < (int)items.size() && pos < 500; i++) {
            const char* s = items[i];
            while (*s && pos < 510) buf[pos++] = *s++;
            buf[pos++] = '\0';
        }
        buf[pos] = '\0';

        bool changed = ImGui::Combo(name, v, buf);
        ImGui::PopItemWidth();
        ImGui::PopStyleVar();
        return changed;
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  COLORPICK — полностью кастомный, без альфа-бара, touch-safe
    //
    //  Архитектура:
    //   • Строка-кнопка: превью цвета + имя → нажатие открывает popup
    //   • Popup рисуется через ForegroundDrawList поверх всего контента
    //   • Внутри popup: SV-квадрат (saturation/value) + H-полоска (hue)
    //   • Никакого ImGui::ColorEdit / BeginPopup — 100% custom draw + touch
    //   • Тач не проходит сквозь: popup перехватывает клики через ItemAdd
    // ─────────────────────────────────────────────────────────────────────────

    // HSV <-> RGB (без STL, без lambda, C++14)
    static void rgb2hsv(float r, float g, float b,
                        float& h, float& s, float& v2) {
        float mx = r > g ? (r > b ? r : b) : (g > b ? g : b);
        float mn = r < g ? (r < b ? r : b) : (g < b ? g : b);
        float d  = mx - mn;
        v2 = mx;
        s  = (mx > 0.f) ? (d / mx) : 0.f;
        if (d < 1e-6f) { h = 0.f; return; }
        if      (mx == r) h = (g - b) / d + (g < b ? 6.f : 0.f);
        else if (mx == g) h = (b - r) / d + 2.f;
        else              h = (r - g) / d + 4.f;
        h /= 6.f;
    }

    static void hsv2rgb(float h, float s, float v2,
                        float& r, float& g, float& b) {
        if (s < 1e-6f) { r = g = b = v2; return; }
        h *= 6.f;
        int   i  = (int)h;
        float f  = h - (float)i;
        float p  = v2 * (1.f - s);
        float q  = v2 * (1.f - s * f);
        float t  = v2 * (1.f - s * (1.f - f));
        switch (i % 6) {
            case 0: r=v2; g=t;  b=p;  break;
            case 1: r=q;  g=v2; b=p;  break;
            case 2: r=p;  g=v2; b=t;  break;
            case 3: r=p;  g=q;  b=v2; break;
            case 4: r=t;  g=p;  b=v2; break;
            default:r=v2; g=p;  b=q;  break;
        }
    }

    // Состояние всех колорпикеров
    struct CPState {
        bool  open;
        float h, s, v2;   // текущий HSV
        bool  drag_sv;     // тащим по SV-квадрату
        bool  drag_h;      // тащим по H-полоске
        CPState() : open(false), h(0.f), s(1.f), v2(1.f),
                    drag_sv(false), drag_h(false) {}
    };
    static std::unordered_map<ImGuiID, CPState> cp_state;

    void colorpick(const char* name, ImVec4* v, float a) {
        if (a < 0.01f) return;

        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return;

        std::string  ids = std::string("cp_") + name;
        ImGuiID      id  = w->GetID(ids.c_str());

        // Инициализация состояния
        if (cp_state.find(id) == cp_state.end()) {
            CPState st;
            rgb2hsv(v->x, v->y, v->z, st.h, st.s, st.v2);
            cp_state[id] = st;
        }
        CPState& st = cp_state[id];

        const float ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        const float row = 36.f * S;
        const float pad = 10.f * S;
        // Превью-кружок справа
        const float pr  = 13.f * S;
        const float pr2 = pr * 2.f;

        ImVec2 pos = w->DC.CursorPos;
        ImRect r(pos, ImVec2(pos.x + ww, pos.y + row));

        ImGui::ItemSize(r);
        if (!ImGui::ItemAdd(r, id)) return;

        bool hov   = ImGui::IsMouseHoveringRect(r.Min, r.Max);
        // popup() блокирует клики на других элементах, но строка самого пикера
        // должна реагировать даже когда st.open=true (чтобы закрыть).
        // Поэтому разрешаем press если popup открыт нами (st.open).
        bool press = hov && ImGui::IsMouseClicked(0) && !clicked && (!popup() || st.open);

        if (press) {
            // Синхронизируем HSV из текущего RGB при открытии
            if (!st.open) {
                rgb2hsv(v->x, v->y, v->z, st.h, st.s, st.v2);
                // Закрываем другие пикеры
                for (std::unordered_map<ImGuiID, CPState>::iterator it = cp_state.begin();
                     it != cp_state.end(); ++it) {
                    if (it->first != id) it->second.open = false;
                }
                popup_open = true;
            } else {
                popup_open = false;
            }
            st.open = !st.open;
            clicked = true;
        }

        float ha = anim(ids + "_h", hov ? 1.f : 0.f, hov ? 18.f : 12.f);

        ImDrawList* dl = w->DrawList;

        // ── Фон строки
        row_gradient(dl, pos, ImVec2(ww, row), a, 0.55f + ha * 0.45f, 6.f);

        // ── Превью круг (текущий цвет) — справа
        ImVec2 pc(pos.x + ww - pad - pr, pos.y + row * 0.5f);
        // Шахматный фон под кружком (показывает что альфы нет)
        dl->AddCircleFilled(pc, pr, IM_COL32(80, 80, 80, (int)(180 * a * content_alpha)));
        // Сам цвет
        dl->AddCircleFilled(pc, pr, IM_COL32(
            (int)(v->x * 255), (int)(v->y * 255), (int)(v->z * 255),
            (int)(255 * a * content_alpha)));
        // Обводка кружка
        dl->AddCircle(pc, pr,
            lerpU32(
                IM_COL32(60, 60, 60, (int)(180 * a * content_alpha)),
                IM_COL32(
                    (int)(clr::accent_light.x * 255),
                    (int)(clr::accent_light.y * 255),
                    (int)(clr::accent_light.z * 255),
                    (int)(220 * a * content_alpha)),
                ha),
            16, 1.5f);

        // ── Лейбл
        float th2 = ImGui::GetFontSize();
        dl->AddText(ImVec2(pos.x + pad, pos.y + (row - th2) * 0.5f),
                    col(clr::text, a), name);

        // ─────────────────────────────────────────────────────────────────────
        //  POPUP — рисуем через ForegroundDrawList
        // ─────────────────────────────────────────────────────────────────────
        if (!st.open) return;

        // Размеры popup — компактный пикер (не на всю ширину меню)
        const float PW  = 220.f * S;    // фиксированная ширина
        const float SV  = PW - 28.f*S; // SV-квадрат (квадратный)
        const float HH2 = 14.f * S;    // высота H-полоски
        const float PH  = SV + HH2 + 22.f*S + 18.f*S; // общая высота
        const float PPD = 10.f * S;    // padding внутри popup

        // Экранная позиция строки через GetItemRectMin — корректно работает
        // даже внутри BeginChild со скроллом
        ImVec2 item_screen = ImGui::GetItemRectMin();

        // Спавн СПРАВА от меню. Берём правый край окна меню.
        // g_sw — ширина экрана, item_screen.x — левый край строки внутри меню.
        // Ищем правый край окна через GetWindowPos + GetWindowSize
        ImVec2 win_pos  = ImGui::GetWindowPos();
        ImVec2 win_size = ImGui::GetWindowSize();
        float  menu_right = win_pos.x + win_size.x;

        // Пикер появляется справа от меню на уровне строки
        ImVec2 pp(menu_right + 6.f, item_screen.y);

        // Если не влезает справа — слева от меню
        if (pp.x + PW > g_sw - 8.f) {
            pp.x = win_pos.x - PW - 6.f;
        }
        // Не вылезаем за низ экрана
        if (pp.y + PH > g_sh - 8.f) {
            pp.y = g_sh - PH - 8.f;
        }
        // Не вылезаем за верх
        if (pp.y < 8.f) pp.y = 8.f;

        ImVec2 pp_max(pp.x + PW, pp.y + PH);

        ImDrawList* fg = ImGui::GetForegroundDrawList();

        // Тень
        fg->AddRectFilled(
            ImVec2(pp.x - 6, pp.y - 6),
            ImVec2(pp_max.x + 6, pp_max.y + 6),
            IM_COL32(0, 0, 0, 80), 10.f);

        // Фон popup — gradient
        {
            ImU32 bg_t = IM_COL32(
                (int)(clr::bg_two.x * 255 * 1.4f > 255 ? 255 : clr::bg_two.x * 255 * 1.4f),
                (int)(clr::bg_two.y * 255 * 1.2f),
                (int)(clr::bg_two.z * 255 * 1.2f),
                250);
            ImU32 bg_b = IM_COL32(
                (int)(clr::bg.x * 255),
                (int)(clr::bg.y * 255),
                (int)(clr::bg.z * 255),
                245);
            fg->AddRectFilledMultiColor(pp, pp_max, bg_t, bg_t, bg_b, bg_b);
        }
        // Обводка popup
        fg->AddRect(pp, pp_max,
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.60f),
                (int)(clr::accent.y * 255 * 0.18f),
                (int)(clr::accent.z * 255 * 0.18f),
                220), 8.f, ImDrawFlags_RoundCornersAll, 1.5f);
        // Тонкий блик сверху
        fg->AddRectFilled(
            ImVec2(pp.x + 2, pp.y + 2),
            ImVec2(pp_max.x - 2, pp.y + 2 + 1.5f * S),
            IM_COL32(255, 255, 255, 18), 8.f);

        // ── SV-квадрат ───────────────────────────────────────────────────────
        float sv_x  = pp.x + PPD;
        float sv_y  = pp.y + PPD;
        float sv_sz = SV - PPD;   // квадрат

        // Цвет чистого hue при S=1 V=1
        float hr2, hg2, hb2;
        hsv2rgb(st.h, 1.f, 1.f, hr2, hg2, hb2);
        ImU32 hue_col = IM_COL32((int)(hr2*255), (int)(hg2*255), (int)(hb2*255), 255);

        // Белый → Hue (горизонтально)
        fg->AddRectFilledMultiColor(
            ImVec2(sv_x, sv_y),
            ImVec2(sv_x + sv_sz, sv_y + sv_sz),
            IM_COL32(255, 255, 255, 255), hue_col,
            hue_col, IM_COL32(255, 255, 255, 255));
        // Прозрачный → Чёрный (вертикально, поверх)
        fg->AddRectFilledMultiColor(
            ImVec2(sv_x, sv_y),
            ImVec2(sv_x + sv_sz, sv_y + sv_sz),
            IM_COL32(0, 0, 0, 0), IM_COL32(0, 0, 0, 0),
            IM_COL32(0, 0, 0, 255), IM_COL32(0, 0, 0, 255));
        // Обводка SV
        fg->AddRect(
            ImVec2(sv_x, sv_y),
            ImVec2(sv_x + sv_sz, sv_y + sv_sz),
            IM_COL32(40, 40, 40, 200), 3.f);

        // Курсор на SV
        float cur_sx = sv_x + st.s * sv_sz;
        float cur_sy = sv_y + (1.f - st.v2) * sv_sz;
        cur_sx = ImClamp(cur_sx, sv_x, sv_x + sv_sz);
        cur_sy = ImClamp(cur_sy, sv_y, sv_y + sv_sz);
        // Тень курсора
        fg->AddCircleFilled(ImVec2(cur_sx + 1.f, cur_sy + 1.f), 7.f*S,
            IM_COL32(0, 0, 0, 90));
        // Внешнее кольцо
        fg->AddCircleFilled(ImVec2(cur_sx, cur_sy), 7.f*S,
            IM_COL32(255, 255, 255, 230));
        // Внутренний кружок — текущий цвет
        fg->AddCircleFilled(ImVec2(cur_sx, cur_sy), 5.f*S,
            IM_COL32((int)(v->x*255),(int)(v->y*255),(int)(v->z*255), 255));

        // Тач-обработка SV
        // IsMouseHoveringRect обрезается clip rect BeginChild — используем
        // прямое сравнение MousePos, минуя ImGui clip-систему
        {
            ImVec2 mp2 = ImGui::GetIO().MousePos;
            bool sv_hit = (mp2.x >= sv_x && mp2.x <= sv_x + sv_sz &&
                           mp2.y >= sv_y && mp2.y <= sv_y + sv_sz);

            if (sv_hit && ImGui::IsMouseClicked(0)) {
                st.drag_sv = true;
                clicked    = true;
            }
            if (!ImGui::IsMouseDown(0)) st.drag_sv = false;
            if (st.drag_sv) {
                st.s  = ImClamp((mp2.x - sv_x) / sv_sz, 0.f, 1.f);
                st.v2 = 1.f - ImClamp((mp2.y - sv_y) / sv_sz, 0.f, 1.f);
                float nr2, ng2, nb2;
                hsv2rgb(st.h, st.s, st.v2, nr2, ng2, nb2);
                v->x = nr2; v->y = ng2; v->z = nb2;
                clicked = true;
            }
        }

        // ── H-полоска ────────────────────────────────────────────────────────
        float hbar_x  = sv_x;
        float hbar_y  = sv_y + sv_sz + 14.f * S;
        float hbar_w  = sv_sz;
        float hbar_h  = HH2;

        // Рисуем полоску как 6 сегментов радуги
        static const float hue_stops[7] = { 0.f, 1.f/6.f, 2.f/6.f, 3.f/6.f, 4.f/6.f, 5.f/6.f, 1.f };
        for (int i = 0; i < 6; i++) {
            float x0 = hbar_x + hue_stops[i]   * hbar_w;
            float x1 = hbar_x + hue_stops[i+1] * hbar_w;
            float hr0, hg0, hb0, hr1, hg1, hb1;
            hsv2rgb(hue_stops[i],   1.f, 1.f, hr0, hg0, hb0);
            hsv2rgb(hue_stops[i+1], 1.f, 1.f, hr1, hg1, hb1);
            fg->AddRectFilledMultiColor(
                ImVec2(x0, hbar_y), ImVec2(x1, hbar_y + hbar_h),
                IM_COL32((int)(hr0*255),(int)(hg0*255),(int)(hb0*255),255),
                IM_COL32((int)(hr1*255),(int)(hg1*255),(int)(hb1*255),255),
                IM_COL32((int)(hr1*255),(int)(hg1*255),(int)(hb1*255),255),
                IM_COL32((int)(hr0*255),(int)(hg0*255),(int)(hb0*255),255));
        }
        fg->AddRect(
            ImVec2(hbar_x, hbar_y),
            ImVec2(hbar_x + hbar_w, hbar_y + hbar_h),
            IM_COL32(40, 40, 40, 200), 3.f);

        // Курсор на H-полоске — вертикальная линия + кружок
        float hcx = hbar_x + st.h * hbar_w;
        hcx = ImClamp(hcx, hbar_x + 2.f, hbar_x + hbar_w - 2.f);
        fg->AddRectFilled(
            ImVec2(hcx - 2.f*S, hbar_y - 3.f*S),
            ImVec2(hcx + 2.f*S, hbar_y + hbar_h + 3.f*S),
            IM_COL32(255, 255, 255, 240), 2.f);
        fg->AddRect(
            ImVec2(hcx - 2.f*S, hbar_y - 3.f*S),
            ImVec2(hcx + 2.f*S, hbar_y + hbar_h + 3.f*S),
            IM_COL32(0, 0, 0, 180), 2.f);

        // Тач H-полоска — прямое сравнение MousePos
        {
            ImVec2 mp2 = ImGui::GetIO().MousePos;
            bool h_hit = (mp2.x >= hbar_x && mp2.x <= hbar_x + hbar_w &&
                          mp2.y >= hbar_y - 6.f*S && mp2.y <= hbar_y + hbar_h + 6.f*S);

            if (h_hit && ImGui::IsMouseClicked(0) && !st.drag_sv) {
                st.drag_h = true;
                clicked   = true;
            }
            if (!ImGui::IsMouseDown(0)) st.drag_h = false;
            if (st.drag_h) {
                st.h = ImClamp((mp2.x - hbar_x) / hbar_w, 0.f, 1.f);
                float nr2, ng2, nb2;
                hsv2rgb(st.h, st.s, st.v2, nr2, ng2, nb2);
                v->x = nr2; v->y = ng2; v->z = nb2;
                clicked = true;
            }
        }

        // ── Hex-превью строка внизу ───────────────────────────────────────────
        float hex_y = hbar_y + hbar_h + 10.f * S;
        int   rx = (int)(v->x * 255);
        int   ry = (int)(v->y * 255);
        int   rz = (int)(v->z * 255);
        char  hex_buf[16];
        snprintf(hex_buf, sizeof(hex_buf), "#%02X%02X%02X", rx, ry, rz);

        ImVec2 hex_sz = ImGui::CalcTextSize(hex_buf);
        // Фон hex-строки
        fg->AddRectFilled(
            ImVec2(pp.x + PPD, hex_y - 2.f*S),
            ImVec2(pp_max.x - PPD, hex_y + hex_sz.y + 2.f*S),
            IM_COL32(
                (int)(clr::bg.x * 255),
                (int)(clr::bg.y * 255),
                (int)(clr::bg.z * 255),
                200), 4.f);
        fg->AddRect(
            ImVec2(pp.x + PPD, hex_y - 2.f*S),
            ImVec2(pp_max.x - PPD, hex_y + hex_sz.y + 2.f*S),
            IM_COL32(50, 50, 50, 160), 4.f);
        // Цветной квадратик рядом с hex
        fg->AddRectFilled(
            ImVec2(pp.x + PPD + 4.f*S, hex_y),
            ImVec2(pp.x + PPD + 4.f*S + hex_sz.y, hex_y + hex_sz.y),
            IM_COL32(rx, ry, rz, 255), 2.f);
        // Hex текст
        fg->AddText(
            ImVec2(pp.x + PPD + 4.f*S + hex_sz.y + 6.f*S, hex_y),
            IM_COL32(200, 200, 200, 220), hex_buf);

        // ── Блокировка тача сквозь popup ──────────────────────────────────────
        // InvisibleButton внутри BeginChild не перехватывает клики на
        // ForegroundDrawList — используем прямую проверку мыши.
        {
            ImVec2 mp2 = ImGui::GetIO().MousePos;
            bool in_popup = (mp2.x >= pp.x && mp2.x <= pp_max.x &&
                             mp2.y >= pp.y && mp2.y <= pp_max.y);

            if (in_popup) {
                // Тач внутри popup — блокируем проброс в меню
                clicked = true;
            } else if (ImGui::IsMouseClicked(0) && !clicked) {
                // Тач вне popup — закрываем пикер
                st.open    = false;
                popup_open = false;
                // НЕ ставим clicked = true: клик должен дойти до элемента меню
            }
        }
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  SEPARATOR
    // ─────────────────────────────────────────────────────────────────────────
    void separator(float a) {
        if (a < 0.01f) return;
        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return;

        float ww = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        float h  = 5.f * S;
        ImVec2 pos = w->DC.CursorPos;
        ImRect rc(pos, ImVec2(pos.x + ww, pos.y + h));
        ImGui::ItemSize(rc);
        if (!ImGui::ItemAdd(rc, 0)) return;

        float cy = pos.y + h * 0.5f;
        ImDrawList* dl = w->DrawList;
        // градиентная разделительная линия — accent-based
        dl->AddRectFilledMultiColor(
            ImVec2(pos.x,        cy - 0.8f),
            ImVec2(pos.x + ww,   cy + 0.8f),
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.40f),
                (int)(clr::accent.y * 255 * 0.10f),
                (int)(clr::accent.z * 255 * 0.10f),
                (int)(120 * a * content_alpha)),
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.18f),
                (int)(clr::accent.y * 255 * 0.04f),
                (int)(clr::accent.z * 255 * 0.04f),
                (int)( 60 * a * content_alpha)),
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.18f),
                (int)(clr::accent.y * 255 * 0.04f),
                (int)(clr::accent.z * 255 * 0.04f),
                (int)( 60 * a * content_alpha)),
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.40f),
                (int)(clr::accent.y * 255 * 0.10f),
                (int)(clr::accent.z * 255 * 0.10f),
                (int)(120 * a * content_alpha)));
    }

    // ─────────────────────────────────────────────────────────────────────────
    //  BUTTON
    // ─────────────────────────────────────────────────────────────────────────
    bool button(const char* name, float a, std::function<void()> on_click) {
        if (a < 0.01f) return false;

        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return false;

        std::string ids = std::string("btn_") + name;
        ImGuiID     id  = w->GetID(ids.c_str());

        float ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        float h   = 36.f * S;
        float pad = 10.f * S;

        ImVec2 pos = w->DC.CursorPos;
        ImRect r(pos, ImVec2(pos.x + ww, pos.y + h));

        ImGui::ItemSize(r);
        if (!ImGui::ItemAdd(r, id)) return false;

        bool hov   = ImGui::IsMouseHoveringRect(r.Min, r.Max) && !popup();
        bool press = hov && ImGui::IsMouseClicked(0) && !clicked;
        if (press) { if (on_click) on_click(); clicked = true; }

        float ha = anim(ids + "_h", hov ? 1.f : 0.f, hov ? 20.f : 12.f);

        ImDrawList* dl = w->DrawList;

        constexpr float BR = 5.f;
        // градиентный фон кнопки — accent-based
        {
            ImU32 c_l = lerpU32(
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.22f),
                    (int)(clr::accent.y * 255 * 0.06f),
                    (int)(clr::accent.z * 255 * 0.06f),
                    (int)(200 * a * content_alpha)),
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.80f),
                    (int)(clr::accent.y * 255 * 0.12f),
                    (int)(clr::accent.z * 255 * 0.12f),
                    (int)(220 * a * content_alpha)),
                ha);
            ImU32 c_r = lerpU32(
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.12f),
                    (int)(clr::accent.y * 255 * 0.03f),
                    (int)(clr::accent.z * 255 * 0.03f),
                    (int)(180 * a * content_alpha)),
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.55f),
                    (int)(clr::accent.y * 255 * 0.08f),
                    (int)(clr::accent.z * 255 * 0.08f),
                    (int)(200 * a * content_alpha)),
                ha);
            dl->AddRectFilledMultiColor(r.Min, r.Max, c_l, c_r, c_r, c_l);
        }
        // обводка кнопки — accent
        ImU32 brd = lerpU32(
            IM_COL32(
                (int)(clr::accent.x * 255 * 0.40f),
                (int)(clr::accent.y * 255 * 0.10f),
                (int)(clr::accent.z * 255 * 0.10f),
                (int)(160 * a * content_alpha)),
            IM_COL32(
                (int)(clr::accent_light.x * 255),
                (int)(clr::accent_light.y * 255),
                (int)(clr::accent_light.z * 255),
                (int)(200 * a * content_alpha)),
            ha);
        dl->AddRect(r.Min, r.Max, brd, BR);
        // блик сверху
        dl->AddRectFilledMultiColor(
            r.Min, ImVec2(r.Max.x, r.Min.y + h * 0.4f),
            IM_COL32(255,255,255, (int)(15 * a * content_alpha)),
            IM_COL32(255,255,255, (int)(15 * a * content_alpha)),
            IM_COL32(255,255,255, 0),
            IM_COL32(255,255,255, 0));

        ImVec2 tsz = ImGui::CalcTextSize(name);
        float  tx  = r.Min.x + (ww - tsz.x) * 0.5f;
        float  ty2 = r.Min.y + (h  - tsz.y) * 0.5f;
        ImVec4 tc  = lrp_col(clr::text, clr::text_light, ha);
        dl->AddText(ImVec2(tx, ty2), col(tc, a), name);

        return press;
    }


    // ─────────────────────────────────────────────────────────────────────────
    //  SPINNER — кастомный выпадающий список с accent-градиентом
    //  Архитектура: строка-кнопка с текущим значением + стрелка,
    //  при нажатии открывается overlay-список через popup-систему.
    //  Не использует ImGui::BeginCombo — полностью custom draw.
    // ─────────────────────────────────────────────────────────────────────────

    // Хранилище открытых спиннеров — по ImGuiID храним индекс открытого
    static std::unordered_map<ImGuiID, bool>  sp_open;
    // Анимация высоты dropdown
    static std::unordered_map<ImGuiID, float> sp_drop_a;

    bool spinner(const char* name, int* v,
                 const std::vector<const char*>& items, float a)
    {
        if (a < 0.01f) return false;
        if (items.empty()) return false;

        ImGuiWindow* w = ImGui::GetCurrentWindow();
        if (w->SkipItems) return false;

        std::string  ids = std::string("sp_") + name;
        ImGuiID      id  = w->GetID(ids.c_str());

        const float ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
        const float row = 36.f * S;
        const float pad = 10.f * S;
        const float arr = 22.f * S;   // ширина зоны стрелки справа

        // Высота одного элемента dropdown
        const float item_h = 32.f * S;

        ImVec2 pos = w->DC.CursorPos;
        ImRect r(pos, ImVec2(pos.x + ww, pos.y + row));

        ImGui::ItemSize(r);
        if (!ImGui::ItemAdd(r, id)) return false;

        bool hov   = ImGui::IsMouseHoveringRect(r.Min, r.Max) && !popup();
        bool press = hov && ImGui::IsMouseClicked(0) && !clicked;

        // Инициализируем состояние
        if (sp_open.find(id) == sp_open.end()) {
            sp_open[id]   = false;
            sp_drop_a[id] = 0.f;
        }

        if (press) {
            if (!sp_open[id]) {
                // Открываем — закрываем все остальные
                for (std::unordered_map<ImGuiID, bool>::iterator it = sp_open.begin();
                     it != sp_open.end(); ++it) {
                    if (it->first != id) it->second = false;
                }
                sp_open[id] = true;
                popup_open  = true;
            } else {
                sp_open[id] = false;
                popup_open  = false;
            }
            clicked = true;
        }

        // Анимация стрелки
        float spd_a = ImGui::GetIO().DeltaTime * 16.f;
        if (spd_a > 1.f) spd_a = 1.f;
        float& da = sp_drop_a[id];
        float  da_tgt = sp_open[id] ? 1.f : 0.f;
        da = lrp(da, da_tgt, spd_a);
        if (fabsf(da - da_tgt) < 0.005f) da = da_tgt;

        float ha = anim(ids + "_h", hov ? 1.f : 0.f, hov ? 18.f : 12.f);

        ImDrawList* dl = w->DrawList;

        // ── Фон строки — accent gradient
        row_gradient(dl, pos, ImVec2(ww, row), a, 0.55f + ha * 0.45f, 6.f);

        // ── Зона стрелки справа — чуть темнее
        ImVec2 arr_min(pos.x + ww - arr - pad * 0.5f, pos.y + 3.f * S);
        ImVec2 arr_max(pos.x + ww - pad * 0.5f,       pos.y + row - 3.f * S);
        {
            ImU32 arr_bg = IM_COL32(
                (int)(clr::accent.x * 255 * 0.35f),
                (int)(clr::accent.y * 255 * 0.10f),
                (int)(clr::accent.z * 255 * 0.10f),
                (int)(180 * a * content_alpha));
            dl->AddRectFilled(arr_min, arr_max, arr_bg, 4.f);
        }

        // ── Стрелка — вращается при открытии (rotate от 0 до PI)
        {
            float cx = (arr_min.x + arr_max.x) * 0.5f;
            float cy = (arr_min.y + arr_max.y) * 0.5f;
            float angle = da * 3.14159f;   // 0 = вниз, PI = вверх

            // Треугольник стрелки — 3 точки, повёрнутые на angle
            float sz = 5.f * S;
            // Точки треугольника в локальных координатах (вниз = dir 0)
            float pts[3][2] = {
                { 0.f,      sz      },  // низ (вершина)
                {-sz,      -sz*0.6f },  // лево
                { sz,      -sz*0.6f }   // право
            };
            ImVec2 tri[3];
            float  cs = cosf(angle), sn2 = sinf(angle);
            for (int i = 0; i < 3; i++) {
                float rx = pts[i][0] * cs - pts[i][1] * sn2;
                float ry = pts[i][0] * sn2 + pts[i][1] * cs;
                tri[i]   = ImVec2(cx + rx, cy + ry);
            }
            ImU32 arr_col = IM_COL32(
                (int)(clr::accent_light.x * 255),
                (int)(clr::accent_light.y * 255),
                (int)(clr::accent_light.z * 255),
                (int)(220 * a * content_alpha * (0.6f + ha * 0.4f)));
            dl->AddTriangleFilled(tri[0], tri[1], tri[2], arr_col);
        }

        // ── Лейбл (имя параметра) — слева, тусклый
        float text_h = ImGui::GetFontSize();
        float text_y = pos.y + (row - text_h) * 0.5f;
        dl->AddText(ImVec2(pos.x + pad, text_y), col(clr::text_dim, a), name);

        // ── Текущее значение — по центру правой части
        const char* cur_val = (*v >= 0 && *v < (int)items.size()) ? items[*v] : "?";
        ImVec2 val_sz = ImGui::CalcTextSize(cur_val);
        float  val_x  = pos.x + pad + (ww - arr - pad * 2.f - ImGui::CalcTextSize(name).x - pad) * 0.5f
                       + ImGui::CalcTextSize(name).x + pad;
        // Проще: центрируем между концом лейбла и началом стрелки
        float zone_l = pos.x + pad + ImGui::CalcTextSize(name).x + pad;
        float zone_r = arr_min.x - pad;
        float vx     = zone_l + (zone_r - zone_l - val_sz.x) * 0.5f;
        if (vx < zone_l) vx = zone_l;
        ImVec4 val_col_v = anim_col(ids + "_vc",
            sp_open[id] ? clr::accent_light : clr::text, 14.f);
        dl->AddText(ImVec2(vx, text_y), col(val_col_v, a), cur_val);

        bool changed = false;

        // ── Dropdown overlay — рисуем поверх через ForegroundDrawList
        if (da > 0.01f) {
            float full_h  = item_h * (float)(int)items.size();
            float drop_h  = full_h * da;   // анимированная высота

            ImVec2 dp(pos.x, pos.y + row + 2.f * S);   // позиция dropdown
            ImVec2 ds(ww, drop_h);

            ImDrawList* fg = ImGui::GetForegroundDrawList();

            // Тень dropdown
            fg->AddRectFilled(
                ImVec2(dp.x - 4, dp.y - 4),
                ImVec2(dp.x + ds.x + 4, dp.y + ds.y + 4),
                IM_COL32(0, 0, 0, (int)(60 * da * a)), 8.f);

            // Фон dropdown
            {
                ImU32 bg_l = IM_COL32(
                    (int)(clr::bg_two.x * 255 + clr::accent.x * 255 * 0.08f),
                    (int)(clr::bg_two.y * 255 + clr::accent.y * 255 * 0.02f),
                    (int)(clr::bg_two.z * 255 + clr::accent.z * 255 * 0.02f),
                    (int)(245 * da * a));
                ImU32 bg_r = IM_COL32(
                    (int)(clr::bg.x * 255),
                    (int)(clr::bg.y * 255),
                    (int)(clr::bg.z * 255),
                    (int)(235 * da * a));
                fg->AddRectFilledMultiColor(dp, ImVec2(dp.x+ds.x, dp.y+ds.y),
                    bg_l, bg_r, bg_r, bg_l);
            }
            // Обводка dropdown
            fg->AddRect(dp, ImVec2(dp.x+ds.x, dp.y+ds.y),
                IM_COL32(
                    (int)(clr::accent.x * 255 * 0.55f),
                    (int)(clr::accent.y * 255 * 0.15f),
                    (int)(clr::accent.z * 255 * 0.15f),
                    (int)(200 * da * a)), 6.f);

            // Клипрект — обрезаем по анимированной высоте
            fg->PushClipRect(dp, ImVec2(dp.x+ww, dp.y+drop_h), true);

            for (int i = 0; i < (int)items.size(); i++) {
                float iy  = dp.y + (float)i * item_h;
                ImVec2 imin(dp.x,      iy);
                ImVec2 imax(dp.x + ww, iy + item_h);

                ImVec2 mp2   = ImGui::GetIO().MousePos;
                bool i_hov   = sp_open[id] &&
                               (mp2.x >= imin.x && mp2.x <= imax.x &&
                                mp2.y >= imin.y && mp2.y <= imax.y);
                bool i_sel   = (*v == i);

                // Hover / selected подсветка
                float ih = anim(ids + "_ih_" + std::to_string(i),
                    i_sel ? 1.f : (i_hov ? 0.5f : 0.f),
                    i_hov ? 18.f : 12.f);

                if (ih > 0.01f) {
                    ImU32 sel_l = IM_COL32(
                        (int)(clr::accent.x * 255 * (i_sel ? 0.30f : 0.18f)),
                        (int)(clr::accent.y * 255 * (i_sel ? 0.08f : 0.05f)),
                        (int)(clr::accent.z * 255 * (i_sel ? 0.08f : 0.05f)),
                        (int)(200 * ih * da * a));
                    ImU32 sel_r = IM_COL32(
                        (int)(clr::accent.x * 255 * (i_sel ? 0.10f : 0.06f)),
                        (int)(clr::accent.y * 255 * (i_sel ? 0.03f : 0.02f)),
                        (int)(clr::accent.z * 255 * (i_sel ? 0.03f : 0.02f)),
                        (int)(160 * ih * da * a));
                    fg->AddRectFilledMultiColor(imin, imax, sel_l, sel_r, sel_r, sel_l);
                }

                // Акцентная полоска слева для выбранного
                if (i_sel && ih > 0.01f) {
                    fg->AddRectFilled(
                        ImVec2(dp.x, iy + 4.f * S),
                        ImVec2(dp.x + 3.f * S, iy + item_h - 4.f * S),
                        IM_COL32(
                            (int)(clr::accent.x * 255),
                            (int)(clr::accent.y * 255),
                            (int)(clr::accent.z * 255),
                            (int)(220 * ih * da * a)), 2.f);
                }

                // Разделитель между элементами
                if (i < (int)items.size() - 1) {
                    fg->AddLine(
                        ImVec2(imin.x + 8.f * S, imax.y - 1),
                        ImVec2(imax.x - 8.f * S, imax.y - 1),
                        IM_COL32(
                            (int)(clr::accent.x * 255 * 0.3f),
                            (int)(clr::accent.y * 255 * 0.08f),
                            (int)(clr::accent.z * 255 * 0.08f),
                            (int)(60 * da * a)));
                }

                // Текст элемента
                ImVec2 tsz2 = ImGui::CalcTextSize(items[i]);
                float  tx2  = dp.x + pad;
                float  ty2  = iy + (item_h - tsz2.y) * 0.5f;
                ImVec4 tc2  = i_sel ?
                    anim_col(ids + "_ic_" + std::to_string(i), clr::accent_light, 14.f) :
                    anim_col(ids + "_ic_" + std::to_string(i), i_hov ? clr::text_light : clr::text, 14.f);
                fg->AddText(ImVec2(tx2, ty2),
                    IM_COL32(
                        (int)(tc2.x * 255),
                        (int)(tc2.y * 255),
                        (int)(tc2.z * 255),
                        (int)(tc2.w * 255 * da * a * content_alpha)),
                    items[i]);

                // Клик по элементу
                if (i_hov && ImGui::IsMouseClicked(0) && sp_open[id]) {
                    *v          = i;
                    sp_open[id] = false;
                    popup_open  = false;
                    clicked     = true;
                    changed     = true;
                }
            }

            fg->PopClipRect();

            // Клик вне dropdown — закрываем
            if (sp_open[id] && ImGui::IsMouseClicked(0) && !clicked) {
                ImVec2 mp2 = ImGui::GetIO().MousePos;
                bool in_drop = (mp2.x >= dp.x && mp2.x <= dp.x + ww &&
                                mp2.y >= dp.y && mp2.y <= dp.y + full_h);
                if (!in_drop) {
                    sp_open[id] = false;
                    popup_open  = false;
                }
            }
        }

        return changed;
    }


} // namespace widgets
} // namespace ui
