#define IMGUI_DEFINE_MATH_OPERATORS
#include "menu.hpp"
#include "bar.hpp"
#include "cfg.hpp"
#include "theme/theme.hpp"
#include "widgets/widgets.hpp"
#include "../protect/oxorany.hpp"
#include "imgui.h"
#include "imgui_internal.h"
#include <cmath>
#include <ctime>
#include <cstdlib>
#include <string>

namespace ui::menu {
    using namespace style;
    using namespace widgets;

    static float  ma      = 0.f;   // master alpha (open animation)
    static int    tab     = 0;
    static bool   drag    = false;
    static ImVec2 doff    = ImVec2(0, 0);
    static float  scr_tgt = 0.f;
    static float  scr_cur = 0.f;
    static float  ta      = 1.f;   // tab-switch fade
    static bool   tsw     = false;
    static int    ttab    = 0;

    static float mw  = 1020.f;
    static float mh  = 660.f;
    static float sw  = 200.f;
    static float hh  = 52.f;
    static float fh  = 38.f;

    // proxy floats for int-backed config values
    static float anim_count_f = 80.f;
    static float ammo_value_f = 10000.f;

    static const char* tabs[] = { "Aimbot", "Visuals", "Misc", "Settings" };
    static constexpr int tc   = sizeof(tabs) / sizeof(tabs[0]);

    static float lrp(float a, float b, float t) { return a + (b - a) * t; }

    // ── Shadow ────────────────────────────────────────────────────────────────
    static void shadow(ImVec2 p, ImVec2 s, float a) {
        if (a < 0.01f) return;
        ImDrawList* bg = ImGui::GetBackgroundDrawList();
        bg->AddRectFilled(ImVec2(p.x-3,  p.y-3),  ImVec2(p.x+s.x+3,  p.y+s.y+3),  IM_COL32(0,0,0,(int)(50*a)),  8.f);
        bg->AddRectFilled(ImVec2(p.x-6,  p.y-6),  ImVec2(p.x+s.x+6,  p.y+s.y+6),  IM_COL32(0,0,0,(int)(35*a)), 10.f);
        bg->AddRectFilled(ImVec2(p.x-10, p.y-10), ImVec2(p.x+s.x+10, p.y+s.y+10), IM_COL32(0,0,0,(int)(20*a)), 12.f);
        bg->AddRectFilled(ImVec2(p.x-15, p.y-15), ImVec2(p.x+s.x+15, p.y+s.y+15), IM_COL32(0,0,0,(int)(10*a)), 15.f);
    }

    // ── Section header ──────────────────────────────────────────────────────────
    static void section(const char* label, float a) {
        ImGuiWindow* w  = ImGui::GetCurrentWindow();
        ImDrawList*  dl = w->DrawList;
        ImVec2 sp = w->DC.CursorPos;
        dl->AddText(sp, col(clr::text_dim, a), label);
        ImGui::Dummy(ImVec2(0, ImGui::GetFontSize() + 4.f));
        separator(a);
    }

    // ── AIMBOT TAB ───────────────────────────────────────────────────────────────
    static void aimbot_tab(float a) {
        section(oxorany("AIMBOT"), a);

        checkbox(oxorany("Aimbot"), &cfg::aim::enabled, a);
        if (cfg::aim::enabled) {
            separator(a);
            slider(oxorany("FOV"),          &cfg::aim::fov,          1.f,  180.f, a, "%.0f");
            separator(a);
            slider(oxorany("Smooth"),       &cfg::aim::smooth,       0.f,  1.f,   a, "%.2f");
            separator(a);
            slider(oxorany("Max Distance"), &cfg::aim::max_distance, 20.f, 500.f, a, "%.0f");
            separator(a);
            spinner(oxorany("Target"), &cfg::aim::target, {"Head", "Body"}, a);
            separator(a);
            checkbox(oxorany("Visible Check"), &cfg::aim::visible_check, a);
            separator(a);
            checkbox(oxorany("Draw FOV"),      &cfg::aim::fov_display,   a);
            separator(a);
            checkbox(oxorany("Lock Line"),     &cfg::aim::lock_line,     a);
            separator(a);
            checkbox(oxorany("Lock Dot"),      &cfg::aim::lock_dot,      a);
        }
        separator(a);

        section(oxorany("ASPECT RATIO"), a);
        checkbox(oxorany("Aspect Ratio"), &cfg::aim::aspect_ratio, a);
        if (cfg::aim::aspect_ratio) {
            separator(a);
            slider(oxorany("Aspect Value"), &cfg::aim::aspect_value, 1.0f, 3.0f, a, "%.2f");
        }
        separator(a);
        checkbox(oxorany("Aspect Stretch"), &cfg::aim::aspect_stretch, a);
        if (cfg::aim::aspect_stretch) {
            separator(a);
            slider(oxorany("Stretch Value"), &cfg::aim::aspect_stretch_value, 1.0f, 3.0f, a, "%.2f");
        }
        separator(a);
    }

    // ── VISUALS TAB (ESP) ──────────────────────────────────────────────────────────
    static void visuals_tab(float a) {
        section(oxorany("BOX"), a);
        checkbox(oxorany("Box"), &cfg::esp::box, a);
        if (cfg::esp::box) {
            separator(a);
            spinner(oxorany("Box type"), &cfg::esp::box_type, {"Full", "Corner"}, a);
            separator(a);
            slider(oxorany("Box rounding"), &cfg::esp::box_rounding, 0.f, 10.f, a, "%.0f");
            separator(a);
            colorpick(oxorany("Box color"), &cfg::esp::box_col, a);
        }
        separator(a);

        checkbox(oxorany("Name"), &cfg::esp::nickname, a);
        if (cfg::esp::nickname) {
            separator(a);
            colorpick(oxorany("Name color"), &cfg::esp::name_col, a);
        }
        separator(a);

        checkbox(oxorany("Health bar"), &cfg::esp::health, a);
        if (cfg::esp::health) {
            separator(a);
            colorpick(oxorany("Health color"), &cfg::esp::health_col, a);
        }
        separator(a);

        checkbox(oxorany("Distance"), &cfg::esp::distance, a);
        if (cfg::esp::distance) {
            separator(a);
            colorpick(oxorany("Distance color"), &cfg::esp::distance_col, a);
        }
        separator(a);

        checkbox(oxorany("Skeleton"), &cfg::esp::skeleton, a);
        if (cfg::esp::skeleton) {
            separator(a);
            colorpick(oxorany("Skeleton color"), &cfg::esp::skeleton_col, a);
        }
        separator(a);

        checkbox(oxorany("Flags"), &cfg::esp::flags, a);
        if (cfg::esp::flags) {
            separator(a);
            colorpick(oxorany("Flags color"), &cfg::esp::flags_col, a);
        }
        separator(a);

        checkbox(oxorany("Weapon"),        &cfg::esp::weapon,        a);
        separator(a);
        checkbox(oxorany("Line"),          &cfg::esp::line,          a);
        separator(a);
        checkbox(oxorany("Dropped items"), &cfg::esp::dropped_items, a);
        separator(a);
    }

    // ── MISC TAB ─────────────────────────────────────────────────────────────────
    static void misc_tab(float a) {
        section(oxorany("WEAPON"), a);
        checkbox(oxorany("Wallshot"), &cfg::wallshot::enabled, a);
        separator(a);
        checkbox(oxorany("Inf Ammo"), &cfg::inf_ammo::enabled, a);
        if (cfg::inf_ammo::enabled) {
            separator(a);
            ammo_value_f = (float)cfg::inf_ammo::value;
            slider(oxorany("Ammo value"), &ammo_value_f, 100.f, 30000.f, a, "%.0f");
            cfg::inf_ammo::value = (int)ammo_value_f;
        }
        separator(a);

        section(oxorany("PLAYER"), a);
        checkbox(oxorany("No Recoil"), &cfg::norecoil::enabled, a);
        if (cfg::norecoil::enabled) {
            separator(a);
            slider(oxorany("Recoil mult"), &cfg::norecoil::multiplier, 0.f, 0.5f, a, "%.2f");
        }
        separator(a);
        checkbox(oxorany("Invisible"), &cfg::test::invisible, a);
        separator(a);
    }

    // ── SETTINGS TAB ───────────────────────────────────────────────────────────────
    static void settings_tab(float a) {
        // Info panels
        section(oxorany("INFO"), a);
        {
            ImGuiWindow* w  = ImGui::GetCurrentWindow();
            ImDrawList*  dl = w->DrawList;
            ImVec2 p   = w->DC.CursorPos;
            float  ww  = content_w > 0 ? content_w : ImGui::GetContentRegionAvail().x;
            float  pad = 8.f * S;
            float  h   = 26.f * S;
            float  gap = 4.f * S;
            constexpr float IR = 5.f;
            char buf[64];

            dl->AddRectFilled(p, ImVec2(p.x+ww, p.y+h), col(clr::panel, a), IR);
            dl->AddRect(      p, ImVec2(p.x+ww, p.y+h), col(clr::border, a), IR);
            snprintf(buf, sizeof(buf), "Screen: %.0f x %.0f", g_sw, g_sh);
            dl->AddText(ImVec2(p.x+pad, p.y+(h-ImGui::GetFontSize())*0.5f), col(clr::text, a), buf);
            ImGui::Dummy(ImVec2(0, h+gap));

            ImVec2 p2(p.x, p.y+h+gap);
            dl->AddRectFilled(p2, ImVec2(p2.x+ww, p2.y+h), col(clr::panel, a), IR);
            dl->AddRect(      p2, ImVec2(p2.x+ww, p2.y+h), col(clr::border, a), IR);
            snprintf(buf, sizeof(buf), "FPS: %.0f", ImGui::GetIO().Framerate);
            dl->AddText(ImVec2(p2.x+pad, p2.y+(h-ImGui::GetFontSize())*0.5f), col(clr::text, a), buf);
            ImGui::Dummy(ImVec2(0, h+gap));
        }
        separator(a);

        section(oxorany("APPEARANCE"), a);
        colorpick(oxorany("Accent color"), &cfg_accent_color, a);
        checkbox(oxorany("RGB Menu"), &cfg_rgb_menu, a);
        if (cfg_rgb_menu) {
            separator(a);
            slider(oxorany("RGB Speed"), &cfg_rgb_speed, 0.1f, 5.f, a, "%.1f");
        }
        separator(a);
        checkbox(oxorany("Corner Dots"), &cfg_corner_dots, a);
        if (cfg_corner_dots) {
            separator(a);
            slider(oxorany("Dot Size"), &cfg_corner_dot_size, 1.f, 8.f, a, "%.1f");
        }
        separator(a);

        section(oxorany("BACKGROUND ANIMATION"), a);
        spinner(oxorany("Type"), &cfg_anim_type, {"Snow", "Rain", "Stars"}, a);
        separator(a);
        slider(oxorany("Speed"), &cfg_anim_speed, 0.1f, 5.f, a, "%.1f");
        separator(a);
        anim_count_f = (float)cfg_anim_count;
        slider(oxorany("Count"), &anim_count_f, 20.f, 200.f, a, "%.0f");
        cfg_anim_count = (int)anim_count_f;
        separator(a);

        button(oxorany("Exit"), a, []() { exit(0); });
    }

    // ── Background animations ──────────────────────────────────────────────────────
    static void background_anim() {
        ImDrawList* bg = ImGui::GetBackgroundDrawList();
        ImGuiIO& io2 = ImGui::GetIO();
        if (cfg_anim_type == 0) {
            struct Flake { float x, y, spd, alpha, sz; };
            static Flake snow[200]; static bool si = false; static int lc = 0;
            int cnt = cfg_anim_count; if (cnt > 200) cnt = 200; if (cnt < 10) cnt = 10;
            if (!si || lc != cnt) {
                srand(12345u);
                for (int i = 0; i < cnt; i++) {
                    snow[i].x     = (float)(rand() % (int)(io2.DisplaySize.x + 1));
                    snow[i].y     = (float)(rand() % (int)(io2.DisplaySize.y + 1));
                    snow[i].spd   = 0.5f + (rand() % 100) / 100.f;
                    snow[i].alpha = 0.10f + (rand() % 35)  / 100.f;
                    snow[i].sz    = 1.2f  + (rand() % 4);
                }
                si = true; lc = cnt;
            }
            for (int i = 0; i < cnt; i++) {
                snow[i].y += snow[i].spd * cfg_anim_speed;
                snow[i].x += sinf(snow[i].y * 0.018f) * 0.45f;
                if (snow[i].y > io2.DisplaySize.y + 4.f) {
                    snow[i].y = -4.f;
                    snow[i].x = (float)(rand() % (int)io2.DisplaySize.x);
                }
                bg->AddCircleFilled(ImVec2(snow[i].x, snow[i].y), snow[i].sz,
                    IM_COL32(200, 190, 255, (int)(snow[i].alpha * 255)));
            }
        } else if (cfg_anim_type == 1) {
            struct Drop { float x, y, spd, len, alpha; };
            static Drop rain[200]; static bool ri = false; static int rc = 0;
            int cnt = cfg_anim_count; if (cnt > 200) cnt = 200; if (cnt < 10) cnt = 10;
            if (!ri || rc != cnt) {
                srand(54321u);
                for (int i = 0; i < cnt; i++) {
                    rain[i].x     = (float)(rand() % (int)(io2.DisplaySize.x + 1));
                    rain[i].y     = (float)(rand() % (int)(io2.DisplaySize.y + 1));
                    rain[i].spd   = 4.f  + (rand() % 80) / 10.f;
                    rain[i].len   = 8.f  + (rand() % 16);
                    rain[i].alpha = 0.12f + (rand() % 35) / 100.f;
                }
                ri = true; rc = cnt;
            }
            for (int i = 0; i < cnt; i++) {
                rain[i].y += rain[i].spd * cfg_anim_speed;
                if (rain[i].y > io2.DisplaySize.y + rain[i].len) {
                    rain[i].y = -rain[i].len;
                    rain[i].x = (float)(rand() % (int)io2.DisplaySize.x);
                }
                bg->AddLine(ImVec2(rain[i].x, rain[i].y),
                            ImVec2(rain[i].x, rain[i].y + rain[i].len),
                            IM_COL32(130, 90, 240, (int)(rain[i].alpha * 255)), 1.f);
            }
        } else if (cfg_anim_type == 2) {
            struct Star { float x, y, drift, phase, sz; };
            static Star stars[200]; static bool sti = false; static int stc = 0;
            int cnt = cfg_anim_count; if (cnt > 200) cnt = 200; if (cnt < 10) cnt = 10;
            if (!sti || stc != cnt) {
                srand(99999u);
                for (int i = 0; i < cnt; i++) {
                    stars[i].x     = (float)(rand() % (int)(io2.DisplaySize.x + 1));
                    stars[i].y     = (float)(rand() % (int)(io2.DisplaySize.y + 1));
                    stars[i].drift = -0.12f + (rand() % 24) / 100.f;
                    stars[i].phase = (rand() % 628) / 100.f;
                    stars[i].sz    = 1.f + (rand() % 3);
                }
                sti = true; stc = cnt;
            }
            for (int i = 0; i < cnt; i++) {
                stars[i].phase += 0.022f * cfg_anim_speed;
                stars[i].x     += stars[i].drift * cfg_anim_speed;
                if (stars[i].x < -4.f)                    stars[i].x = io2.DisplaySize.x + 2.f;
                if (stars[i].x > io2.DisplaySize.x + 4.f) stars[i].x = -2.f;
                float al = 0.25f + 0.40f * sinf(stars[i].phase);
                float hs = stars[i].sz + 1.f;
                ImU32 sc = IM_COL32(200, 180, 255, (int)(al * 255));
                bg->AddLine(ImVec2(stars[i].x - hs, stars[i].y),
                            ImVec2(stars[i].x + hs, stars[i].y), sc, 1.f);
                bg->AddLine(ImVec2(stars[i].x, stars[i].y - hs),
                            ImVec2(stars[i].x, stars[i].y + hs), sc, 1.f);
            }
        }
    }

    // ── RENDER ───────────────────────────────────────────────────────────────────
    void render(bool game_running) {
        ui::bar::set_game_alpha(1.f);
        ui::bar::render();

        float dt = ImGui::GetIO().DeltaTime;
        if (dt <= 0.f || dt > 0.1f) dt = 0.016f;

        ma = lrp(ma, ui::bar::g_open ? 1.f : 0.f, ImClamp(12.f*dt, 0.f, 1.f));

        if (ma > 0.01f) {
            ImDrawList* bg = ImGui::GetBackgroundDrawList();
            int da = (int)(200 * ma);
            bg->AddRectFilled(ImVec2(0,0), ImVec2(g_sw,g_sh), IM_COL32(0,0,0,da));
        }

        if (ma < 0.01f) return;

        // Accent (RGB or fixed)
        if (cfg_rgb_menu) {
            float _t = (float)ImGui::GetTime() * cfg_rgb_speed;
            ImVec4 rc = ImVec4(0.5f + 0.5f * sinf(_t), 0.5f + 0.5f * sinf(_t + 2.094f), 0.5f + 0.5f * sinf(_t + 4.189f), 1.f);
            clr::accent       = ImVec4(rc.x, rc.y, rc.z, 0.92f);
            clr::accent_light = ImVec4(rc.x, rc.y, rc.z, 1.0f);
        } else {
            clr::accent       = ImVec4(cfg_accent_color.x, cfg_accent_color.y, cfg_accent_color.z, 0.92f);
            clr::accent_light = ImVec4(cfg_accent_color.x, cfg_accent_color.y, cfg_accent_color.z, 1.0f);
        }
        cfg::menu::accent_col = cfg_accent_color;

        tick();

        if (tsw) {
            ta = lrp(ta, 0.f, ImClamp(18.f*dt, 0.f, 1.f));
            if (ta < 0.05f) {
                tab     = ttab;
                tsw     = false;
                scr_tgt = 0.f;
                scr_cur = 0.f;
            }
        } else {
            ta = lrp(ta, 1.f, ImClamp(14.f*dt, 0.f, 1.f));
        }

        content_alpha = 1.f;

        ImGui::PushStyleVar(ImGuiStyleVar_Alpha,            ma);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowRounding,   0.f);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding,    ImVec2(0,0));
        ImGui::PushStyleVar(ImGuiStyleVar_WindowBorderSize, 0.f);
        ImGui::PushStyleColor(ImGuiCol_WindowBg, ImVec4(0,0,0,0));

        ImVec2 wsz(mw, mh);
        ImGui::SetNextWindowSize(wsz, ImGuiCond_Always);
        ImGui::SetNextWindowPos(ImVec2((g_sw-mw)*0.5f,(g_sh-mh)*0.5f), ImGuiCond_Once);

        ImGuiWindowFlags wf = ImGuiWindowFlags_NoTitleBar   |
                              ImGuiWindowFlags_NoResize      |
                              ImGuiWindowFlags_NoScrollbar   |
                              ImGuiWindowFlags_NoCollapse    |
                              ImGuiWindowFlags_NoMove;

        if (ImGui::Begin(oxorany("##holy_menu"), nullptr, wf)) {
            ImVec2      wp  = ImGui::GetWindowPos();
            ImDrawList* dl  = ImGui::GetWindowDrawList();
            ImGuiIO&    io  = ImGui::GetIO();
            ImVec2      mp  = io.MousePos;

            background_anim();
            shadow(wp, wsz, ma);

            constexpr float MR = 10.f;
            dl->AddRectFilled(wp, ImVec2(wp.x+wsz.x, wp.y+wsz.y), col(clr::bg, ma), MR);
            {
                ImU32 c_tl = IM_COL32(60,  8,  8, (int)(220 * ma));
                ImU32 c_tr = IM_COL32(35,  6,  6, (int)(200 * ma));
                ImU32 c_bl = IM_COL32(18,  4,  4, (int)(180 * ma));
                ImU32 c_br = IM_COL32(10,  2,  2, (int)(160 * ma));
                dl->AddRectFilledMultiColor(wp, ImVec2(wp.x+wsz.x, wp.y+wsz.y), c_tl, c_tr, c_br, c_bl);
            }
            dl->AddRect(wp, ImVec2(wp.x+wsz.x, wp.y+wsz.y), col(clr::border_dark, ma), MR);
            dl->AddRect(ImVec2(wp.x+1,wp.y+1), ImVec2(wp.x+wsz.x-1,wp.y+wsz.y-1), col(clr::border, ma), MR-1.f);

            // Header
            dl->AddRectFilledMultiColor(
                ImVec2(wp.x+2,wp.y+2), ImVec2(wp.x+wsz.x-2,wp.y+hh),
                col(clr::sidebar,ma), col(clr::sidebar,ma),
                col(clr::bg,ma),      col(clr::bg,ma));
            dl->AddLine(ImVec2(wp.x,wp.y+hh),   ImVec2(wp.x+wsz.x,wp.y+hh),   col(clr::border_dark,ma));
            dl->AddLine(ImVec2(wp.x,wp.y+hh+1), ImVec2(wp.x+wsz.x,wp.y+hh+1), col(clr::border,ma));
            {
                const char* title = oxorany("holycheatlo");
                ImVec2 tsz = ImGui::CalcTextSize(title);
                float  tx  = wp.x + (wsz.x - tsz.x) * 0.5f;
                float  ty2 = wp.y + hh * 0.5f - ImGui::GetFontSize() * 0.5f;
                dl->AddText(ImVec2(tx, ty2), col(clr::accent_light, ma), title);
            }

            // Footer
            dl->AddLine(ImVec2(wp.x,wp.y+wsz.y-fh),   ImVec2(wp.x+wsz.x,wp.y+wsz.y-fh),   col(clr::border,ma));
            dl->AddLine(ImVec2(wp.x,wp.y+wsz.y-fh-1), ImVec2(wp.x+wsz.x,wp.y+wsz.y-fh-1), col(clr::border_dark,ma));
            {
                time_t now_t = time(0);
                tm*    ltm   = localtime(&now_t);
                char   tb[32];
                if (ltm) snprintf(tb, sizeof(tb), "%02d:%02d:%02d", ltm->tm_hour, ltm->tm_min, ltm->tm_sec);
                else     snprintf(tb, sizeof(tb), "--:--:--");
                float footer_y = wp.y + wsz.y - fh + (fh - ImGui::GetFontSize()) * 0.5f;
                dl->AddText(ImVec2(wp.x+10, footer_y), col(clr::text_dim,ma), oxorany("Time"));
                ImVec2 lsz = ImGui::CalcTextSize(oxorany("Time "));
                dl->AddText(ImVec2(wp.x+10+lsz.x, footer_y), col(clr::accent,ma), tb);

                const char* state = game_running ? oxorany("game") : oxorany("waiting");
                ImVec2 ssz = ImGui::CalcTextSize(state);
                dl->AddText(ImVec2(wp.x+wsz.x-ssz.x-12.f, footer_y),
                    game_running ? IM_COL32(120,255,120,(int)(255*ma)) : IM_COL32(255,170,80,(int)(255*ma)),
                    state);
            }

            // Sidebar
            ImVec2 smin(wp.x+2,  wp.y+hh+2);
            ImVec2 smax(wp.x+sw, wp.y+wsz.y-fh);
            dl->AddRectFilled(smin, smax, col(clr::sidebar, ma));
            dl->AddLine(ImVec2(smax.x,smin.y), ImVec2(smax.x,smax.y), col(clr::border,ma));

            float tsy  = smin.y + 16.f;
            float th   = 50.f;
            float tg   = 6.f;
            float tp_l = 16.f;

            for (int i = 0; i < tc; i++) {
                float ty2 = tsy + i * (th + tg);
                float tx2 = smin.x + 6.f;
                float tw2 = sw - 14.f;

                ImVec2 tmin(tx2,      ty2);
                ImVec2 tmax(tx2+tw2, ty2+th);

                bool sel = (tab == i);
                bool hov = ImGui::IsMouseHoveringRect(tmin, tmax);

                float sa  = anim("t_"  + std::to_string(i), sel ? 1.f : 0.f,           14.f);
                float hav = anim("th_" + std::to_string(i), hov && !sel ? 0.4f : 0.f,  14.f);

                constexpr float TR = 6.f;
                if (sa > 0.01f) {
                    dl->AddRectFilled(tmin, tmax, col(clr::widget, sa*ma), TR);
                    dl->AddRect(      tmin, tmax, col(clr::border_light, sa*ma*0.5f), TR, ImDrawFlags_RoundCornersAll, 1.f);
                    dl->AddRectFilled(tmin, ImVec2(tmin.x+3, tmax.y), col(clr::accent, sa*ma), TR, ImDrawFlags_RoundCornersLeft);
                } else if (hav > 0.01f) {
                    dl->AddRectFilled(tmin, tmax, col(clr::panel, hav*ma), TR);
                }

                ImVec4 ttc = anim_col("tt_" + std::to_string(i), sel ? clr::accent_light : clr::text_dim, 14.f);
                float ny = ty2 + (th - ImGui::GetFontSize()) * 0.5f;
                dl->AddText(ImVec2(tx2+tp_l, ny), col(ttc,ma), tabs[i]);

                if (hov && ImGui::IsMouseClicked(0) && ma > 0.5f && !tsw) {
                    if (!popup() && tab != i) {
                        ttab  = i;
                        tsw   = true;
                    }
                    close();
                }
            }

            // Content
            float csx = wp.x + sw + 1.f;
            float cex = wp.x + wsz.x - 2.f;

            float cp_pad = 14.f;
            float sbw    = 20.f;
            float sbg    = 10.f;

            content_w = cex - csx - cp_pad*2.f - sbg - sbw;

            float cw  = content_w;
            float csy = wp.y + hh + 2.f + cp_pad;
            float ch  = (wp.y + wsz.y - fh) - csy - cp_pad;

            ImVec2 cpos(csx + cp_pad, csy);
            ImVec2 cmax_v(cpos.x + cw, cpos.y + ch);

            ImGui::SetCursorScreenPos(cpos);
            ImGui::PushStyleVar(ImGuiStyleVar_Alpha,       ma * ta);
            ImGui::PushStyleVar(ImGuiStyleVar_ItemSpacing, ImVec2(0,0));
            ImGui::PushStyleColor(ImGuiCol_ChildBg, ImVec4(0,0,0,0));
            ImGui::PushClipRect(cpos, cmax_v, true);

            content_alpha = ta;
            ImGui::BeginChild(oxorany("##content"), ImVec2(cw,ch), false, ImGuiWindowFlags_NoScrollbar);

            float sm = ImGui::GetScrollMaxY();

            if (ImGui::IsMouseHoveringRect(cpos, cmax_v) && !popup()) {
                float wh = io.MouseWheel;
                if (wh != 0.f) scr_tgt -= wh * 60.f;
            }
            scr_tgt = ImClamp(scr_tgt, 0.f, ImMax(sm, 0.f));
            scr_cur = lrp(scr_cur, scr_tgt, ImClamp(16.f*dt, 0.f, 1.f));
            if (fabsf(scr_cur - scr_tgt) < 0.5f) scr_cur = scr_tgt;
            ImGui::SetScrollY(scr_cur);

            switch (tab) {
                case 0: aimbot_tab(ma);   break;
                case 1: visuals_tab(ma);  break;
                case 2: misc_tab(ma);     break;
                case 3: settings_tab(ma); break;
            }

            sm = ImGui::GetScrollMaxY();
            scr_tgt = ImClamp(scr_tgt, 0.f, ImMax(sm, 0.f));

            ImGui::EndChild();
            ImGui::PopClipRect();
            ImGui::PopStyleColor(1);
            ImGui::PopStyleVar(2);

            // Scrollbar
            float sbx = cmax_v.x + sbg;
            float sby = cpos.y;
            float sbh = ch;

            if (sm > 0.f) {
                constexpr float SBR = 4.f;
                dl->AddRectFilled(ImVec2(sbx, sby), ImVec2(sbx+sbw, sby+sbh), col(clr::bg_two, ma), SBR);
                dl->AddRect(      ImVec2(sbx, sby), ImVec2(sbx+sbw, sby+sbh), col(clr::border, ma), SBR, ImDrawFlags_RoundCornersAll, 1.f);

                float sr = ch / (ch + sm);
                float gh = ImMax(sbh * sr, 40.f);
                float sn = scr_tgt / sm;
                float gy = sby + (sbh - gh) * sn;

                dl->AddRectFilled(ImVec2(sbx+2, gy+2), ImVec2(sbx+sbw-2, gy+gh-2), col(clr::accent, ma), SBR);
                dl->AddRect(      ImVec2(sbx+2, gy+2), ImVec2(sbx+sbw-2, gy+gh-2), col(clr::accent_dark, ma), SBR, ImDrawFlags_RoundCornersAll, 1.f);

                ImRect sbr(ImVec2(sbx-30.f,sby), ImVec2(sbx+sbw+10.f,sby+sbh));
                bool sbhov = ImGui::IsMouseHoveringRect(sbr.Min, sbr.Max);
                static bool  sbd  = false;
                static float sbds = 0.f;

                if (sbhov && ImGui::IsMouseClicked(0) && !popup()) {
                    sbd  = true;
                    sbds = mp.y - gy;
                }
                if (!ImGui::IsMouseDown(0)) sbd = false;

                if (sbd && sm > 0.f) {
                    float nn = ((mp.y - sbds) - sby) / (sbh - gh);
                    nn = ImClamp(nn, 0.f, 1.f);
                    scr_tgt = nn * sm;
                    scr_cur = scr_tgt;
                }
            }

            // Drag (header / empty area, away from tabs/content/scrollbar)
            bool inm = (mp.x >= wp.x && mp.x <= wp.x+wsz.x &&
                        mp.y >= wp.y && mp.y <= wp.y+wsz.y);

            if (inm && !popup() && ImGui::IsMouseClicked(0)) {
                bool ont = false;
                for (int i = 0; i < tc; i++) {
                    float ty2 = tsy + i*(th+tg);
                    float tx2 = smin.x + 6.f;
                    float tw2 = sw - 14.f;
                    if (mp.x >= tx2 && mp.x <= tx2+tw2 &&
                        mp.y >= ty2 && mp.y <= ty2+th) { ont = true; break; }
                }
                bool inca = (mp.x >= cpos.x    && mp.x <= cmax_v.x &&
                             mp.y >= cpos.y    && mp.y <= cmax_v.y);
                bool insb = (mp.x >= sbx-30.f  && mp.x <= sbx+sbw+10.f &&
                             mp.y >= sby        && mp.y <= sby+sbh);

                if (!ont && !inca && !insb) {
                    drag = true;
                    doff = ImVec2(mp.x-wp.x, mp.y-wp.y);
                }
            }

            if (drag) {
                if (ImGui::IsMouseDown(0)) {
                    ImVec2 np(mp.x-doff.x, mp.y-doff.y);
                    np.x = ImClamp(np.x, 0.f, g_sw-wsz.x);
                    np.y = ImClamp(np.y, 0.f, g_sh-wsz.y);
                    ImGui::SetWindowPos(oxorany("##holy_menu"), np);
                } else {
                    drag = false;
                }
            }
            if (popup()) drag = false;

            // Corner dots
            if (cfg_corner_dots) {
                float cr  = cfg_win_rounding;
                float ds  = cfg_corner_dot_size;
                ImU32 dc  = col(clr::accent, ma);
                dl->AddCircleFilled(ImVec2(wp.x + cr,        wp.y + cr       ), ds, dc);
                dl->AddCircleFilled(ImVec2(wp.x+wsz.x - cr,  wp.y + cr       ), ds, dc);
                dl->AddCircleFilled(ImVec2(wp.x + cr,        wp.y+wsz.y - cr ), ds, dc);
                dl->AddCircleFilled(ImVec2(wp.x+wsz.x - cr,  wp.y+wsz.y - cr ), ds, dc);
            }
        }
        ImGui::End();
        ImGui::PopStyleColor(1);
        ImGui::PopStyleVar(4);

        popups();
    }

} // namespace ui::menu
