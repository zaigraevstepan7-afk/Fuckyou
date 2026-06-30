// holycheatlo — menu ported from "Imgui Portifolio 8"
// Adapted to Android / OpenGL (ImGui 1.92.x), default font, touch input.
#define IMGUI_DEFINE_MATH_OPERATORS
#include "menu.hpp"
#include "cfg.hpp"
#include "theme/theme.hpp"
#include "../protect/oxorany.hpp"

#include "p8/colors.h"
#include "p8/layout.h"
#include "p8/ui_scale.h"
#include "p8/fonts.h"
#include "p8/glow.h"
#include "p8/widgets.h"
#include "p8/settings_panel.h"

#include "imgui.h"
#include "imgui_internal.h"

#include <cstdlib>
#include <cmath>

namespace {
    using namespace settings_panel;

    int   g_tab        = 0;          // 0 Visuals, 1 Aim, 2 Misc, 3 Settings
    int   g_prev_tab   = 0;
    float g_tab_fade   = 1.f;

    bool  g_open       = false;
    float g_open_anim  = 0.f;

    ImVec2 g_panel_pos = { -1.f, -1.f };
    bool   g_drag      = false;
    ImVec2 g_drag_off  = { 0.f, 0.f };

    // smoothed content scroll (touch friendly)
    float g_scroll_tgt = 0.f;
    float g_scroll_cur = 0.f;

    // settings-backed appearance values
    ImVec4 g_accent          = colors::accent;
    float  g_ui_scale_pct    = 170.f;
    float  g_menu_opacity    = 100.f;

    float lrp(float a, float b, float t) { return a + (b - a) * t; }

    // ── Brand diamond logo (pure draw-list, from the original framework) ───────
    void draw_brand_logo(ImDrawList* dl, const ImRect& area) {
        const ImVec2 c = area.GetCenter();
        const float  s = ui_scale::s(layout::sidebar_logo_size) * 0.5f;
        const ImU32 accent = ImGui::GetColorU32(colors::accent);
        const ImU32 glow   = ImGui::GetColorU32(ImVec4(colors::accent.x, colors::accent.y, colors::accent.z, 0.18f));

        dl->AddCircleFilled(c, s + 1.f, glow, 32);
        dl->AddCircle(c, s, accent, 32, ui_scale::s(1.5f));

        ImVec2 diamond[4] = {
            { c.x, c.y - s * 0.58f },
            { c.x + s * 0.50f, c.y },
            { c.x, c.y + s * 0.58f },
            { c.x - s * 0.50f, c.y },
        };
        dl->AddConvexPolyFilled(diamond, 4, accent);
        dl->AddCircleFilled(c, ui_scale::s(2.2f), ImGui::GetColorU32(colors::text), 12);
    }

    void draw_tab_label(ImDrawList* dl, const ImRect& bb, const char* text, ImU32 col) {
        const ImVec2 ts = ImGui::CalcTextSize(text);
        const ImVec2 pos = {
            bb.Min.x + (bb.GetWidth()  - ts.x) * 0.5f,
            bb.Min.y + (bb.GetHeight() - ts.y) * 0.5f };
        dl->AddText(pos, col, text);
    }

    ImRect sidebar_tab_rect(const ImRect& sidebar, float y) {
        const float tab_w = ui_scale::s(layout::sidebar_tab_w);
        const float tab_h = ui_scale::s(layout::sidebar_tab_h);
        const float x = sidebar.GetCenter().x - tab_w * 0.5f;
        return { { x, y }, { x + tab_w, y + tab_h } };
    }

    void draw_sidebar(ImDrawList* dl, const ImRect& sidebar, bool& blocks_drag) {
        using namespace layout;

        static const char* labels[] = { "ESP", "Aim", "Misc", "Set" };
        const int tab_count = 4;

        dl->AddRectFilled(sidebar.Min, sidebar.Max, ImGui::GetColorU32(colors::sidebar),
            ui_scale::s(shell_round), ImDrawFlags_RoundCornersLeft);

        const float tab_w  = ui_scale::s(sidebar_tab_w);
        const float tab_x  = sidebar.GetCenter().x - tab_w * 0.5f;
        const float logo_y = sidebar.Min.y + ui_scale::s(sidebar_pad);
        const ImRect logo_area({ tab_x, logo_y }, { tab_x + tab_w, logo_y + ui_scale::s(sidebar_logo_size) });
        draw_brand_logo(dl, logo_area);

        const float sep_y = logo_area.Max.y + ui_scale::s(sidebar_logo_gap) * 0.5f;
        dl->AddLine({ sidebar.Min.x + ui_scale::s(14.f), sep_y },
                    { sidebar.Max.x - ui_scale::s(14.f), sep_y },
                    ImGui::GetColorU32(colors::sidebar_sep));

        const float tab_h   = ui_scale::s(sidebar_tab_h);
        const float tab_gap = ui_scale::s(sidebar_tabs_gap);
        const float nav_h   = (float)tab_count * tab_h + (float)(tab_count - 1) * tab_gap;
        const float zone_top    = sep_y + ui_scale::s(8.f);
        const float zone_bottom = sidebar.Max.y - ui_scale::s(sidebar_bottom_pad + sidebar_exit_h + 8.f);
        float y = zone_top + ImMax(0.f, (zone_bottom - zone_top - nav_h) * 0.5f);

        ImRect tab_rects[4] = {};
        for (int i = 0; i < tab_count; ++i) {
            tab_rects[i] = sidebar_tab_rect(sidebar, y);
            y += tab_h + tab_gap;
        }

        // animated selection indicator
        static float indicator_y = 0.f;
        static bool  indicator_init = false;
        const ImRect& target = tab_rects[g_tab];
        if (!indicator_init) { indicator_y = target.Min.y; indicator_init = true; }
        indicator_y = lrp(indicator_y, target.Min.y, ImMin(1.f, ImGui::GetIO().DeltaTime * 20.f));

        dl->AddRectFilled({ tab_rects[0].Min.x, indicator_y },
                          { tab_rects[0].Max.x, indicator_y + tab_h },
                          ImGui::GetColorU32(ImVec4(colors::accent.x, colors::accent.y, colors::accent.z, 0.16f)),
                          ui_scale::s(sidebar_tab_round));

        static float sel_anim[4]   = {};
        static float hover_anim[4] = {};
        const float dt = ImGui::GetIO().DeltaTime;
        for (int i = 0; i < tab_count; ++i) {
            const ImRect& bb = tab_rects[i];
            ImGuiID id = ImGui::GetID((void*)(intptr_t)(100 + i));
            ImGui::ItemAdd(bb, id);
            bool hovered = false, held = false;
            const bool pressed = ImGui::ButtonBehavior(bb, id, &hovered, &held);
            if (hovered || held) blocks_drag = true;
            if (pressed) g_tab = i;

            const bool selected = (g_tab == i);
            sel_anim[i]   = lrp(sel_anim[i],   selected ? 1.f : 0.f,          ImMin(1.f, dt * 22.f));
            hover_anim[i] = lrp(hover_anim[i], hovered && !selected ? 1.f : 0.f, ImMin(1.f, dt * 24.f));

            if (hover_anim[i] > 0.01f)
                dl->AddRectFilled(bb.Min, bb.Max,
                    ImGui::GetColorU32(ImVec4(1.f, 1.f, 1.f, 0.05f * hover_anim[i])),
                    ui_scale::s(sidebar_tab_round));

            const ImVec4 lc = ImLerp(ImLerp(colors::text_muted, colors::text, hover_anim[i] * 0.35f),
                                     colors::accent, sel_anim[i]);
            draw_tab_label(dl, bb, labels[i], ImGui::GetColorU32(lc));
        }

        // exit
        const ImRect exit_bb = sidebar_tab_rect(sidebar, sidebar.Max.y - ui_scale::s(sidebar_bottom_pad + sidebar_exit_h));
        ImGuiID exit_id = ImGui::GetID("##p8_exit");
        ImGui::ItemAdd(exit_bb, exit_id);
        bool exit_hovered = false, exit_held = false;
        const bool exit_pressed = ImGui::ButtonBehavior(exit_bb, exit_id, &exit_hovered, &exit_held);
        if (exit_hovered || exit_held) blocks_drag = true;
        static float exit_hover = 0.f;
        exit_hover = lrp(exit_hover, exit_hovered ? 1.f : 0.f, ImMin(1.f, dt * 18.f));
        if (exit_hover > 0.01f)
            dl->AddRectFilled(exit_bb.Min, exit_bb.Max,
                ImGui::GetColorU32(ImVec4(colors::danger.x, colors::danger.y, colors::danger.z, 0.18f * exit_hover)),
                ui_scale::s(sidebar_exit_round));
        draw_tab_label(dl, exit_bb, "X",
            ImGui::GetColorU32(ImLerp(colors::text_muted, colors::danger, exit_hover)));
        if (exit_pressed) std::exit(0);
    }

    // ── Pages (wired to holycheatlo cfg) ───────────────────────────────────────
    template<typename Builder>
    void draw_panel(ImDrawList* dl, const ImVec2& pos, float width, const char* header,
                    int rows, bool& blk, Builder build) {
        draw_header(dl, pos, header);
        const ImVec2 box_pos = { pos.x, pos.y + header_block_h(header) };
        const ImRect box = draw_box(dl, box_pos, width, rows);
        build(dl, box, blk, rows);
    }

    void visuals_page(bool& blk) {
        using namespace widgets;
        ImDrawList* dl = ImGui::GetWindowDrawList();
        const ImVec2 origin = content_origin();
        const float lw = column_left_width();
        const float rw = column_right_width();

        // left: ESP
        draw_panel(dl, origin, lw, oxorany("ESP"), 7, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                static const char* box_types[] = { "Full", "Corner" };
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("v_box",  oxorany("Box"),         &cfg::esp::box,      next(), b);
                combo_row   ("v_bt",   oxorany("Box type"),    &cfg::esp::box_type, box_types, 2, next(), b);
                slider_row  ("v_br",   oxorany("Box rounding"),&cfg::esp::box_rounding, 0.f, 10.f, next(), b, "%.0f");
                checkbox_row("v_name", oxorany("Name"),        &cfg::esp::nickname, next(), b);
                checkbox_row("v_hp",   oxorany("Health bar"),  &cfg::esp::health,   next(), b);
                checkbox_row("v_dist", oxorany("Distance"),    &cfg::esp::distance, next(), b);
                checkbox_row("v_wep",  oxorany("Weapon"),      &cfg::esp::weapon,   next(), b);
            });

        // right top: Extra
        const ImVec2 rp = { origin.x + lw + ui_scale::s(layout::column_gap), origin.y };
        draw_panel(dl, rp, rw, oxorany("Extra"), 4, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("v_line", oxorany("Line"),          &cfg::esp::line,          next(), b);
                checkbox_row("v_skel", oxorany("Skeleton"),      &cfg::esp::skeleton,      next(), b);
                checkbox_row("v_flag", oxorany("Flags"),         &cfg::esp::flags,         next(), b);
                checkbox_row("v_drop", oxorany("Dropped items"), &cfg::esp::dropped_items, next(), b);
            });

        // right bottom: Colors
        const ImVec2 rcp = { rp.x, rp.y + panel_block_h(oxorany("Extra"), 4) + ui_scale::s(12.f) };
        draw_panel(dl, rcp, rw, oxorany("Colors"), 6, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                color_row("c_box",  oxorany("Box"),      &cfg::esp::box_col,      next(), b);
                color_row("c_name", oxorany("Name"),     &cfg::esp::name_col,     next(), b);
                color_row("c_hp",   oxorany("Health"),   &cfg::esp::health_col,   next(), b);
                color_row("c_dist", oxorany("Distance"), &cfg::esp::distance_col, next(), b);
                color_row("c_skel", oxorany("Skeleton"), &cfg::esp::skeleton_col, next(), b);
                color_row("c_flag", oxorany("Flags"),    &cfg::esp::flags_col,    next(), b);
            });

        const float lb = origin.y + panel_block_h(oxorany("ESP"), 7);
        const float rb = rcp.y + panel_block_h(oxorany("Colors"), 6);
        finalize_scroll(ImMax(lb, rb));
    }

    void aim_page(bool& blk) {
        using namespace widgets;
        ImDrawList* dl = ImGui::GetWindowDrawList();
        const ImVec2 origin = content_origin();
        const float lw = column_left_width();
        const float rw = column_right_width();

        draw_panel(dl, origin, lw, oxorany("Aimbot"), 5, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                static const char* bones[] = { "Head", "Body" };
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("a_en",   oxorany("Enable aimbot"), &cfg::aim::enabled,      next(), b);
                slider_row  ("a_sm",   oxorany("Smoothing"),     &cfg::aim::smooth,       0.f, 1.f,   next(), b, "%.2f");
                combo_row   ("a_bone", oxorany("Aimbone"),       &cfg::aim::target,       bones, 2,   next(), b);
                slider_row  ("a_fov",  oxorany("FOV"),           &cfg::aim::fov,          1.f, 180.f, next(), b, "%.0f");
                slider_row  ("a_dist", oxorany("Max distance"),  &cfg::aim::max_distance, 20.f, 500.f,next(), b, "%.0f");
            });

        const ImVec2 rp = { origin.x + lw + ui_scale::s(layout::column_gap), origin.y };
        draw_panel(dl, rp, rw, oxorany("Options"), 4, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("a_vis",  oxorany("Visible check"), &cfg::aim::visible_check, next(), b);
                checkbox_row("a_dfov", oxorany("Draw FOV"),      &cfg::aim::fov_display,   next(), b);
                checkbox_row("a_ll",   oxorany("Lock line"),     &cfg::aim::lock_line,     next(), b);
                checkbox_row("a_ld",   oxorany("Lock dot"),      &cfg::aim::lock_dot,      next(), b);
            });

        const ImVec2 rap = { rp.x, rp.y + panel_block_h(oxorany("Options"), 4) + ui_scale::s(12.f) };
        draw_panel(dl, rap, rw, oxorany("Aspect"), 4, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("a_ar",  oxorany("Aspect ratio"),   &cfg::aim::aspect_ratio,         next(), b);
                slider_row  ("a_arv", oxorany("Aspect value"),   &cfg::aim::aspect_value,         1.f, 3.f, next(), b, "%.2f");
                checkbox_row("a_as",  oxorany("Aspect stretch"), &cfg::aim::aspect_stretch,       next(), b);
                slider_row  ("a_asv", oxorany("Stretch value"),  &cfg::aim::aspect_stretch_value, 1.f, 3.f, next(), b, "%.2f");
            });

        const float lb = origin.y + panel_block_h(oxorany("Aimbot"), 5);
        const float rb = rap.y + panel_block_h(oxorany("Aspect"), 4);
        finalize_scroll(ImMax(lb, rb));
    }

    void misc_page(bool& blk) {
        using namespace widgets;
        ImDrawList* dl = ImGui::GetWindowDrawList();
        const ImVec2 origin = content_origin();
        const float lw = column_left_width();
        const float rw = column_right_width();

        static float ammo_f = (float)cfg::inf_ammo::value;

        draw_panel(dl, origin, lw, oxorany("Weapon"), 3, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("m_ws", oxorany("Wallshot"), &cfg::wallshot::enabled, next(), b);
                checkbox_row("m_ia", oxorany("Inf ammo"), &cfg::inf_ammo::enabled, next(), b);
                ammo_f = (float)cfg::inf_ammo::value;
                slider_row  ("m_av", oxorany("Ammo value"), &ammo_f, 100.f, 30000.f, next(), b, "%.0f");
                cfg::inf_ammo::value = (int)ammo_f;
            });

        const ImVec2 rp = { origin.x + lw + ui_scale::s(layout::column_gap), origin.y };
        draw_panel(dl, rp, rw, oxorany("Player"), 3, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                checkbox_row("m_nr",  oxorany("No recoil"),   &cfg::norecoil::enabled,    next(), b);
                slider_row  ("m_nrm", oxorany("Recoil mult"), &cfg::norecoil::multiplier, 0.f, 0.5f, next(), b, "%.2f");
                checkbox_row("m_inv", oxorany("Invisible"),   &cfg::test::invisible,      next(), b);
            });

        const float lb = origin.y + panel_block_h(oxorany("Weapon"), 3);
        const float rb = origin.y + panel_block_h(oxorany("Player"), 3);
        finalize_scroll(ImMax(lb, rb));
    }

    void settings_page(bool& blk) {
        using namespace widgets;
        ImDrawList* dl = ImGui::GetWindowDrawList();
        const ImVec2 origin = content_origin();
        const float lw = column_left_width();
        const float rw = column_right_width();

        draw_panel(dl, origin, lw, oxorany("Appearance"), 3, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                int i = 0;
                auto next = [&]() { ImRect r = row_rect(box, i); if (i + 1 < rows) draw_separator(d, r); ++i; return r; };
                color_row ("s_acc", oxorany("Accent color"), &g_accent,       next(), b);
                slider_row("s_ui",  oxorany("UI scale"),     &g_ui_scale_pct, 90.f, 220.f, next(), b, "%.0f");
                slider_row("s_op",  oxorany("Menu opacity"), &g_menu_opacity, 40.f, 100.f, next(), b, "%.0f");
            });

        const ImVec2 rp = { origin.x + lw + ui_scale::s(layout::column_gap), origin.y };
        draw_panel(dl, rp, rw, oxorany("Power"), 1, blk,
            [](ImDrawList* d, const ImRect& box, bool& b, int rows) {
                (void)rows;
                if (button_row("s_exit", oxorany("Exit"), row_rect(box, 0), b, colors::danger))
                    std::exit(0);
            });

        const float lb = origin.y + panel_block_h(oxorany("Appearance"), 3);
        const float rb = origin.y + panel_block_h(oxorany("Power"), 1);
        finalize_scroll(ImMax(lb, rb));
    }

    void draw_active_page(bool& blk) {
        switch (g_tab) {
            case 0: visuals_page(blk);  break;
            case 1: aim_page(blk);      break;
            case 2: misc_page(blk);     break;
            case 3: settings_page(blk); break;
            default: break;
        }
    }

    // ── Floating toggle button ─────────────────────────────────────────────────
    void render_toggle() {
        ImGui::SetNextWindowPos(ImVec2(24.f, 24.f), ImGuiCond_FirstUseEver);
        ImGui::SetNextWindowSize(ImVec2(108.f, 42.f), ImGuiCond_Always);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding, ImVec2(6.f, 6.f));
        ImGui::PushStyleColor(ImGuiCol_WindowBg, colors::sidebar);
        ImGui::PushStyleColor(ImGuiCol_Button, colors::control);
        ImGui::PushStyleColor(ImGuiCol_ButtonHovered, colors::control_hover);
        ImGui::PushStyleColor(ImGuiCol_ButtonActive, colors::accent);
        ImGui::PushStyleColor(ImGuiCol_Text, colors::text);

        if (ImGui::Begin(oxorany("##p8_toggle"), nullptr,
                ImGuiWindowFlags_NoTitleBar | ImGuiWindowFlags_NoResize |
                ImGuiWindowFlags_NoScrollbar | ImGuiWindowFlags_NoCollapse |
                ImGuiWindowFlags_NoSavedSettings)) {
            if (ImGui::Button(g_open ? oxorany("CLOSE") : oxorany("OPEN"), ImVec2(-1.f, -1.f)))
                g_open = !g_open;
        }
        ImGui::End();
        ImGui::PopStyleColor(5);
        ImGui::PopStyleVar();
    }
}

namespace ui::menu {
    void render(bool game_running) {
        (void)game_running;

        render_toggle();

        const float dt = ImGui::GetIO().DeltaTime > 0.f ? ImGui::GetIO().DeltaTime : 0.016f;
        g_open_anim = lrp(g_open_anim, g_open ? 1.f : 0.f, ImMin(1.f, dt * 12.f));
        if (g_open_anim < 0.01f) return;

        // appearance / scale
        colors::accent = g_accent;
        ui_scale::set_percent(g_ui_scale_pct);

        // dim backdrop
        ImGui::GetBackgroundDrawList()->AddRectFilled(
            ImVec2(0.f, 0.f), ImVec2(g_sw, g_sh), IM_COL32(0, 0, 0, (int)(150 * g_open_anim)));

        const float panel_w = ui_scale::s(layout::window_w);
        const float panel_h = ui_scale::s(layout::window_h);
        const float sb_w    = ui_scale::s(layout::sidebar_w);
        const float round   = ui_scale::s(layout::shell_round);

        if (g_panel_pos.x < 0.f) {
            g_panel_pos.x = (g_sw - panel_w) * 0.5f;
            g_panel_pos.y = (g_sh - panel_h) * 0.5f;
        }

        // tab fade
        if (g_tab != g_prev_tab) { g_tab_fade = 0.f; g_prev_tab = g_tab; g_scroll_tgt = 0.f; g_scroll_cur = 0.f; }
        g_tab_fade = lrp(g_tab_fade, 1.f, ImMin(1.f, dt * 12.f));

        const float master_alpha = g_open_anim * (g_menu_opacity / 100.f);

        ImGui::PushStyleVar(ImGuiStyleVar_Alpha, master_alpha);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowRounding, 0.f);
        ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding, ImVec2(0.f, 0.f));
        ImGui::PushStyleVar(ImGuiStyleVar_WindowBorderSize, 0.f);
        ImGui::PushStyleColor(ImGuiCol_WindowBg, ImVec4(0.f, 0.f, 0.f, 0.f));

        ImGui::SetNextWindowPos(g_panel_pos, ImGuiCond_Always);
        ImGui::SetNextWindowSize(ImVec2(panel_w, panel_h), ImGuiCond_Always);

        if (ImGui::Begin(layout::main_window_id, nullptr,
                ImGuiWindowFlags_NoTitleBar | ImGuiWindowFlags_NoResize |
                ImGuiWindowFlags_NoMove     | ImGuiWindowFlags_NoScrollbar |
                ImGuiWindowFlags_NoCollapse | ImGuiWindowFlags_NoSavedSettings |
                ImGuiWindowFlags_NoBackground)) {
            const ImVec2 wp = ImGui::GetWindowPos();
            ImDrawList* dl  = ImGui::GetWindowDrawList();
            const ImVec2 mp = ImGui::GetIO().MousePos;
            const ImRect panel_bb(wp, ImVec2(wp.x + panel_w, wp.y + panel_h));

            // accent border (background list — not clipped by the panel window) + panel fill
            const float bw = ui_scale::s(2.f);
            ImGui::GetBackgroundDrawList()->AddRectFilled(
                ImVec2(panel_bb.Min.x - bw, panel_bb.Min.y - bw),
                ImVec2(panel_bb.Max.x + bw, panel_bb.Max.y + bw),
                ImGui::GetColorU32(colors::accent), round + bw); // GetColorU32 applies style.Alpha (master_alpha)
            dl->AddRectFilled(panel_bb.Min, panel_bb.Max, ImGui::GetColorU32(colors::panel), round);

            bool blocks_drag = false;

            const ImRect sidebar(panel_bb.Min, ImVec2(panel_bb.Min.x + sb_w, panel_bb.Max.y));
            draw_sidebar(dl, sidebar, blocks_drag);

            // content child (scrolling)
            ImGui::SetCursorScreenPos(ImVec2(panel_bb.Min.x + sb_w, panel_bb.Min.y));
            ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding, ImVec2(0.f, 0.f));
            ImGui::PushStyleColor(ImGuiCol_ChildBg, ImVec4(0.f, 0.f, 0.f, 0.f));
            ImGui::BeginChild(layout::content_child_id, ImVec2(panel_w - sb_w, panel_h),
                ImGuiChildFlags_None, ImGuiWindowFlags_NoBackground | ImGuiWindowFlags_NoScrollbar);

            const ImRect content_bb(ImGui::GetWindowPos(),
                ImVec2(ImGui::GetWindowPos().x + ImGui::GetWindowWidth(),
                       ImGui::GetWindowPos().y + ImGui::GetWindowHeight()));

            // smooth scroll (clamped to previous frame's max)
            float maxy = ImGui::GetScrollMaxY();
            if (ImGui::IsMouseHoveringRect(content_bb.Min, content_bb.Max)) {
                float wh = ImGui::GetIO().MouseWheel;
                if (wh != 0.f) g_scroll_tgt -= wh * ui_scale::s(70.f);
            }
            g_scroll_tgt = ImClamp(g_scroll_tgt, 0.f, ImMax(maxy, 0.f));
            g_scroll_cur = lrp(g_scroll_cur, g_scroll_tgt, ImMin(1.f, dt * 16.f));
            if (fabsf(g_scroll_cur - g_scroll_tgt) < 0.5f) g_scroll_cur = g_scroll_tgt;
            ImGui::SetScrollY(g_scroll_cur);

            ImGui::PushStyleVar(ImGuiStyleVar_Alpha, master_alpha * g_tab_fade);
            draw_active_page(blocks_drag);
            ImGui::PopStyleVar();

            maxy = ImGui::GetScrollMaxY();
            g_scroll_tgt = ImClamp(g_scroll_tgt, 0.f, ImMax(maxy, 0.f));

            ImGui::EndChild();
            ImGui::PopStyleColor();
            ImGui::PopStyleVar();

            // custom scrollbar + finger-drag scroll on empty content
            if (maxy > 0.f) {
                const float sb_pad = ui_scale::s(4.f);
                const float bar_w  = ui_scale::s(4.f);
                const float bx = content_bb.Max.x - bar_w - sb_pad;
                const float by = content_bb.Min.y + sb_pad;
                const float bh = content_bb.GetHeight() - sb_pad * 2.f;
                dl->AddRectFilled(ImVec2(bx, by), ImVec2(bx + bar_w, by + bh),
                    ImGui::GetColorU32(colors::control), bar_w * 0.5f);
                const float frac = bh / (bh + maxy);
                const float gh = ImMax(bh * frac, ui_scale::s(28.f));
                const float gy = by + (bh - gh) * (g_scroll_tgt / maxy);
                dl->AddRectFilled(ImVec2(bx, gy), ImVec2(bx + bar_w, gy + gh),
                    ImGui::GetColorU32(colors::accent), bar_w * 0.5f);
            }

            // finger-drag scroll: start on empty content (no widget under finger)
            static bool scroll_drag = false;
            static float last_my = 0.f;
            const bool in_content = mp.x >= content_bb.Min.x && mp.x <= content_bb.Max.x &&
                                    mp.y >= content_bb.Min.y && mp.y <= content_bb.Max.y;
            if (ImGui::IsMouseClicked(0) && in_content && !blocks_drag) { scroll_drag = true; last_my = mp.y; }
            if (!ImGui::IsMouseDown(0)) scroll_drag = false;
            if (scroll_drag) {
                g_scroll_tgt = ImClamp(g_scroll_tgt - (mp.y - last_my), 0.f, ImMax(maxy, 0.f));
                g_scroll_cur = g_scroll_tgt;
                last_my = mp.y;
            }

            // panel drag (sidebar empty space)
            const bool in_panel = mp.x >= panel_bb.Min.x && mp.x <= panel_bb.Max.x &&
                                  mp.y >= panel_bb.Min.y && mp.y <= panel_bb.Max.y;
            if (ImGui::IsMouseClicked(0) && in_panel && !in_content && !blocks_drag && !scroll_drag) {
                g_drag = true;
                g_drag_off = ImVec2(mp.x - wp.x, mp.y - wp.y);
            }
            if (g_drag) {
                if (ImGui::IsMouseDown(0)) {
                    g_panel_pos = ImVec2(ImClamp(mp.x - g_drag_off.x, 0.f, g_sw - panel_w),
                                         ImClamp(mp.y - g_drag_off.y, 0.f, g_sh - panel_h));
                    ImGui::SetWindowPos(layout::main_window_id, g_panel_pos);
                } else {
                    g_drag = false;
                }
            }
        }
        ImGui::End();
        ImGui::PopStyleColor();
        ImGui::PopStyleVar(4);
    }
}
