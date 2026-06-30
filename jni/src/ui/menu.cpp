#define IMGUI_DEFINE_MATH_OPERATORS
#include "imgui.h"
#include "imgui_internal.h"
#include "IconsFontAwesome5.h"
#include "menu.h"
#include "common.h"

#include <map>
#include <cmath>

//==============================================================================
//  New menu - ported from the "Imgui Portfolio 8" reference (sidebar shell,
//  rounded cards, custom accent toggles / sliders / combos, soft animations).
//  Adapted to the Android/GLES ImGui build and wired straight to vars (common.h).
//==============================================================================

namespace Menu
{
    //--------------------------------------------------------------------------
    //  Theme (from the reference colors.h)
    //--------------------------------------------------------------------------
    namespace clr
    {
        inline ImVec4 accent      = { 169.f / 255.f, 128.f / 255.f, 255.f / 255.f, 1.f };
        inline const ImVec4 panel        = { 20.f / 255.f, 20.f / 255.f, 23.f / 255.f, 1.f };
        inline const ImVec4 sidebar      = { 24.f / 255.f, 24.f / 255.f, 28.f / 255.f, 1.f };
        inline const ImVec4 box          = { 24.f / 255.f, 24.f / 255.f, 28.f / 255.f, 1.f };
        inline const ImVec4 control      = { 33.f / 255.f, 33.f / 255.f, 39.f / 255.f, 1.f };
        inline const ImVec4 control_hover= { 44.f / 255.f, 44.f / 255.f, 52.f / 255.f, 1.f };
        inline const ImVec4 knob_hover   = { 95.f / 255.f, 95.f / 255.f, 117.f / 255.f, 1.f };
        inline const ImVec4 text         = { 0.92f, 0.92f, 0.94f, 1.f };
        inline const ImVec4 text_muted   = { 99.f / 255.f, 99.f / 255.f, 118.f / 255.f, 1.f };
        inline const ImVec4 header_text  = { 130.f / 255.f, 130.f / 255.f, 155.f / 255.f, 1.f };
        inline const ImVec4 sidebar_sep  = { 35.f / 255.f, 35.f / 255.f, 43.f / 255.f, 0.65f };
        inline const ImVec4 separator    = { 35.f / 255.f, 35.f / 255.f, 43.f / 255.f, 0.55f };
    }

    //--------------------------------------------------------------------------
    //  State
    //--------------------------------------------------------------------------
    static bool  menu_open  = false;
    static float fade_alpha = 0.0f;
    static int   active_tab = 0;
    static float g_scale    = 1.0f;
    static float g_fade     = 1.0f;
    constexpr float fade_speed = 7.0f;

    void Toggle()  { menu_open = !menu_open; }
    bool IsOpen()  { return menu_open; }

    static inline float S(float v) { return v * g_scale; }
    static inline ImU32 U32(const ImVec4& c, float a = 1.f) { return ImGui::GetColorU32(ImVec4(c.x, c.y, c.z, c.w * a * g_fade)); }

    struct Anim { float hover = 0.f, on = 0.f, fill = 0.f, open = 0.f; };
    static std::map<ImGuiID, Anim> g_anim;
    static void smooth(float& v, float t, float sp) { v = ImLerp(v, t, ImMin(1.f, sp * ImGui::GetIO().DeltaTime)); }

    //--------------------------------------------------------------------------
    //  Layout cursor (single column, screen-space, scroll-aware)
    //--------------------------------------------------------------------------
    static float cx, cw, cy;
    static void content_begin(const ImVec2& origin, float width)
    {
        cx = origin.x + S(14.f);
        cw = width - S(28.f);
        cy = origin.y + S(12.f);
    }
    static float box_height(int rows) { return S(8.f) * 2.f + rows * S(30.f) + (rows - 1) * (S(5.f) * 2.f + S(1.f)); }
    static ImRect row_rect(const ImRect& box, int i)
    {
        const float rh = S(30.f);
        const float pitch = rh + S(5.f) * 2.f + S(1.f);
        const float y = box.Min.y + S(8.f) + i * pitch;
        return ImRect(box.Min.x, y, box.Max.x, y + rh);
    }
    static void row_sep(ImDrawList* dl, const ImRect& box, int i)
    {
        const ImRect r = row_rect(box, i);
        const float y = r.Max.y + S(5.f);
        dl->AddLine(ImVec2(box.Min.x + S(14.f), y), ImVec2(box.Max.x - S(14.f), y), U32(clr::separator), 1.f);
    }

    static void section(ImDrawList* dl, const char* title)
    {
        ImFont* f = ImGui::GetFont();
        dl->AddText(f, S(12.f), ImVec2(cx + S(2.f), cy), U32(clr::header_text), title);
        cy += S(12.f) + S(8.f);
    }
    static ImRect box_begin(ImDrawList* dl, int rows)
    {
        const ImRect box(cx, cy, cx + cw, cy + box_height(rows));
        dl->AddRectFilled(box.Min, box.Max, U32(clr::box), S(6.f));
        return box;
    }
    static void box_end(const ImRect& box) { cy = box.Max.y + S(14.f); }

    static ImVec2 label_pos(const ImRect& row, const char* t)
    {
        ImFont* f = ImGui::GetFont();
        const ImVec2 ts = f->CalcTextSizeA(S(13.f), FLT_MAX, 0.f, t);
        return ImVec2(row.Min.x + S(14.f), row.Min.y + (row.GetHeight() - ts.y) * 0.5f - S(1.f));
    }

    //--------------------------------------------------------------------------
    //  Widgets
    //--------------------------------------------------------------------------
    static bool toggle_row(ImDrawList* dl, const ImRect& row, const char* id, const char* label, bool* v)
    {
        ImGuiID gid = ImGui::GetID(id);
        ImGui::ItemAdd(row, gid);
        bool hovered = false, held = false;
        const bool pressed = ImGui::ButtonBehavior(row, gid, &hovered, &held);
        if (pressed) *v = !*v;

        Anim& a = g_anim[gid];
        smooth(a.on, *v ? 1.f : 0.f, 16.f);
        smooth(a.hover, hovered ? 1.f : 0.f, 22.f);

        if (a.hover > 0.01f)
            dl->AddRectFilled(row.Min, row.Max, ImGui::GetColorU32(ImVec4(1, 1, 1, 0.022f * a.hover)), S(4.f));

        dl->AddText(ImGui::GetFont(), S(13.f), label_pos(row, label),
                    U32(ImLerp(clr::text_muted, clr::text, ImMax(a.on, a.hover))), label);

        const float tw = S(35.f), th = S(20.f);
        const float cyc = row.GetCenter().y;
        const ImRect tg(row.Max.x - S(14.f) - tw, cyc - th * 0.5f, row.Max.x - S(14.f), cyc + th * 0.5f);
        const float tr = th * 0.5f;
        dl->AddRectFilled(tg.Min, tg.Max, U32(ImLerp(clr::control, clr::control_hover, a.hover)), tr);
        if (a.on > 0.01f)
            dl->AddRectFilled(tg.Min, tg.Max, U32(clr::accent, 0.16f * a.on), tr);

        const ImVec4 knob = ImLerp(ImLerp(clr::text_muted, clr::knob_hover, a.hover), clr::accent, a.on);
        const float kx = tg.Min.x + S(10.f) + S(15.f) * a.on;
        dl->AddCircleFilled(ImVec2(kx, tg.GetCenter().y), S(7.f), U32(knob), 24);
        return pressed;
    }

    static bool slider_row(ImDrawList* dl, const ImRect& row, const char* id, const char* label,
                           float* value, float mn, float mx, const char* fmt)
    {
        const float sw = S(108.f);
        const float right = row.Max.x - S(14.f);
        const ImRect track(right - sw, row.GetCenter().y - S(3.f), right, row.GetCenter().y + S(3.f));

        ImGuiID gid = ImGui::GetID(id);
        ImGui::ItemAdd(row, gid);
        bool hovered = false, held = false;
        ImGui::ButtonBehavior(track, gid, &hovered, &held);

        if (held)
        {
            const float t = ImClamp((ImGui::GetIO().MousePos.x - track.Min.x) / ImMax(track.GetWidth(), 1.f), 0.f, 1.f);
            *value = mn + (mx - mn) * t;
        }

        Anim& a = g_anim[gid];
        smooth(a.hover, hovered || held ? 1.f : 0.f, 18.f);
        smooth(a.fill, ImClamp((*value - mn) / (mx - mn), 0.f, 1.f), held ? 28.f : 16.f);

        if (a.hover > 0.01f)
            dl->AddRectFilled(row.Min, row.Max, ImGui::GetColorU32(ImVec4(1, 1, 1, 0.018f * a.hover)), S(4.f));

        dl->AddText(ImGui::GetFont(), S(13.f), label_pos(row, label),
                    U32(ImLerp(clr::text_muted, clr::text, ImMax(a.hover, 0.4f))), label);

        const float cyc = track.GetCenter().y;
        dl->AddRectFilled(ImVec2(track.Min.x, cyc - S(1.f)), ImVec2(track.Max.x, cyc + S(1.f)), U32(clr::control), S(1.f));
        const float fw = track.GetWidth() * a.fill;
        if (fw > 0.5f)
            dl->AddRectFilled(ImVec2(track.Min.x, cyc - S(3.f)), ImVec2(track.Min.x + fw, cyc + S(3.f)), U32(clr::accent), S(3.f));

        char buf[24];
        ImFormatString(buf, IM_ARRAYSIZE(buf), fmt, *value);
        const ImVec2 vs = ImGui::GetFont()->CalcTextSizeA(S(13.f), FLT_MAX, 0.f, buf);
        dl->AddText(ImGui::GetFont(), S(13.f), ImVec2(track.Min.x - S(10.f) - vs.x, row.GetCenter().y - vs.y * 0.5f),
                    U32(ImLerp(clr::text_muted, clr::text, a.hover + (held ? 0.5f : 0.f))), buf);
        return held;
    }

    static bool slider_int_row(ImDrawList* dl, const ImRect& row, const char* id, const char* label,
                               int* value, int mn, int mx)
    {
        float f = (float)*value;
        const bool r = slider_row(dl, row, id, label, &f, (float)mn, (float)mx, "%.0f");
        *value = (int)(f + 0.5f);
        return r;
    }

    // Compact segmented selector (touch friendly substitute for the combo dropdown)
    static void combo_row(ImDrawList* dl, const ImRect& row, const char* id, const char* label,
                          int* index, const char* const* items, int count)
    {
        dl->AddText(ImGui::GetFont(), S(13.f), label_pos(row, label), U32(clr::text), label);

        const float seg_w = S(124.f);
        const float right = row.Max.x - S(14.f);
        const float cyc = row.GetCenter().y;
        const ImRect bar(right - seg_w, cyc - S(11.f), right, cyc + S(11.f));
        dl->AddRectFilled(bar.Min, bar.Max, U32(clr::control), S(4.f));

        const float iw = bar.GetWidth() / (float)count;
        for (int i = 0; i < count; ++i)
        {
            const ImRect seg(bar.Min.x + iw * i, bar.Min.y, bar.Min.x + iw * (i + 1), bar.Max.y);
            char sid[64];
            ImFormatString(sid, IM_ARRAYSIZE(sid), "%s_%d", id, i);
            ImGuiID gid = ImGui::GetID(sid);
            ImGui::ItemAdd(seg, gid);
            bool hovered = false, held = false;
            if (ImGui::ButtonBehavior(seg, gid, &hovered, &held))
                *index = i;

            const bool sel = (*index == i);
            if (sel)
                dl->AddRectFilled(seg.Min + ImVec2(S(2.f), S(2.f)), seg.Max - ImVec2(S(2.f), S(2.f)), U32(clr::accent, 0.85f), S(3.f));
            else if (hovered)
                dl->AddRectFilled(seg.Min + ImVec2(S(2.f), S(2.f)), seg.Max - ImVec2(S(2.f), S(2.f)), ImGui::GetColorU32(ImVec4(1, 1, 1, 0.05f)), S(3.f));

            const ImVec2 ts = ImGui::GetFont()->CalcTextSizeA(S(11.f), FLT_MAX, 0.f, items[i]);
            dl->AddText(ImGui::GetFont(), S(11.f),
                        ImVec2(seg.GetCenter().x - ts.x * 0.5f, seg.GetCenter().y - ts.y * 0.5f),
                        U32(sel ? clr::text : clr::text_muted), items[i]);
        }
    }

    static void color_row(const ImRect& row, const char* id, const char* label, float col[4])
    {
        ImDrawList* dl = ImGui::GetWindowDrawList();
        dl->AddText(ImGui::GetFont(), S(13.f), label_pos(row, label), U32(clr::text), label);

        const float sz = S(22.f);
        const float right = row.Max.x - S(14.f);
        const ImRect sw(right - sz, row.GetCenter().y - sz * 0.5f, right, row.GetCenter().y + sz * 0.5f);
        dl->AddRectFilled(sw.Min, sw.Max, U32(clr::control), S(4.f));
        dl->AddRectFilled(sw.Min + ImVec2(S(3.f), S(3.f)), sw.Max - ImVec2(S(3.f), S(3.f)),
                          ImGui::GetColorU32(ImVec4(col[0], col[1], col[2], col[3])), S(3.f));

        ImGui::SetCursorScreenPos(sw.Min);
        ImGui::InvisibleButton(id, sw.GetSize());
        char pid[64];
        ImFormatString(pid, IM_ARRAYSIZE(pid), "##cp_%s", id);
        if (ImGui::IsItemClicked())
            ImGui::OpenPopup(pid);
        if (ImGui::BeginPopup(pid))
        {
            ImGui::ColorPicker4("##pick", col, ImGuiColorEditFlags_AlphaBar | ImGuiColorEditFlags_NoSidePreview);
            ImGui::EndPopup();
        }
    }

    //--------------------------------------------------------------------------
    //  Pages
    //--------------------------------------------------------------------------
    static void page_visuals(ImDrawList* dl)
    {
        section(dl, "ESP");
        ImRect b = box_begin(dl, 4);
        toggle_row(dl, row_rect(b, 0), "v_en", "Enable ESP", &vars::esp::enabled);   row_sep(dl, b, 0);
        toggle_row(dl, row_rect(b, 1), "v_box", "Box", &vars::esp::rect);            row_sep(dl, b, 1);
        toggle_row(dl, row_rect(b, 2), "v_fill", "Box fill", &vars::esp::box_fill);  row_sep(dl, b, 2);
        static const char* box_styles[] = { "Default", "Corner", "Round" };
        combo_row(dl, row_rect(b, 3), "v_bt", "Box style", &vars::esp::box_type, box_styles, 3);
        box_end(b);

        section(dl, "INFORMATION");
        b = box_begin(dl, 6);
        toggle_row(dl, row_rect(b, 0), "v_hp", "Health bar", &vars::esp::health_bar); row_sep(dl, b, 0);
        toggle_row(dl, row_rect(b, 1), "v_sk", "Skeleton", &vars::esp::skeleton);     row_sep(dl, b, 1);
        toggle_row(dl, row_rect(b, 2), "v_ln", "Snapline", &vars::esp::line);         row_sep(dl, b, 2);
        toggle_row(dl, row_rect(b, 3), "v_nm", "Name", &vars::esp::name);             row_sep(dl, b, 3);
        toggle_row(dl, row_rect(b, 4), "v_wp", "Weapon", &vars::esp::weapon);         row_sep(dl, b, 4);
        toggle_row(dl, row_rect(b, 5), "v_bmb", "Bomb", &vars::esp::bomb);
        box_end(b);

        section(dl, "FLAGS");
        b = box_begin(dl, 3);
        toggle_row(dl, row_rect(b, 0), "v_fd", "Distance", &vars::esp::flag_distance); row_sep(dl, b, 0);
        toggle_row(dl, row_rect(b, 1), "v_fm", "Money", &vars::esp::flag_money);       row_sep(dl, b, 1);
        toggle_row(dl, row_rect(b, 2), "v_fp", "Ping", &vars::esp::flag_ping);
        box_end(b);

        section(dl, "CAMERA");
        b = box_begin(dl, 2);
        toggle_row(dl, row_rect(b, 0), "v_fov", "Custom FOV", &vars::visual::fov);     row_sep(dl, b, 0);
        slider_row(dl, row_rect(b, 1), "v_fovv", "FOV", &vars::visual::fov_value, 40.f, 120.f, "%.0f");
        box_end(b);
    }

    static void page_aim(ImDrawList* dl)
    {
        section(dl, "AIMBOT");
        ImRect b = box_begin(dl, 5);
        toggle_row(dl, row_rect(b, 0), "a_en", "Enable aimbot", &vars::aimbot::enabled);   row_sep(dl, b, 0);
        slider_row(dl, row_rect(b, 1), "a_sm", "Smoothing", &vars::aimbot::Smooth::pitch, 0.f, 20.f, "%.1f"); row_sep(dl, b, 1);
        static const char* bones[] = { "Head", "Neck", "Chest", "Pelvis" };
        combo_row(dl, row_rect(b, 2), "a_bone", "Hitbox", &vars::aimbot::Hitbox::type, bones, 4); row_sep(dl, b, 2);
        toggle_row(dl, row_rect(b, 3), "a_vis", "Visible only", &vars::aimbot::visible_check); row_sep(dl, b, 3);
        slider_row(dl, row_rect(b, 4), "a_fovr", "FOV radius", &vars::aimbot::Fov::radius, 10.f, 600.f, "%.0f");
        box_end(b);

        section(dl, "FOV");
        b = box_begin(dl, 3);
        toggle_row(dl, row_rect(b, 0), "a_fc", "FOV check", &vars::aimbot::Fov::check); row_sep(dl, b, 0);
        toggle_row(dl, row_rect(b, 1), "a_df", "Draw FOV", &vars::aimbot::draw_fov);    row_sep(dl, b, 1);
        color_row(row_rect(b, 2), "a_fcol", "FOV color", vars::aimbot::fov_color);
        box_end(b);
    }

    static void page_misc(ImDrawList* dl)
    {
        section(dl, "WEAPON");
        ImRect b = box_begin(dl, 3);
        toggle_row(dl, row_rect(b, 0), "m_inv", "Invisible weapon", &vars::Function::invisible); row_sep(dl, b, 0);
        toggle_row(dl, row_rect(b, 1), "m_ws", "Wallshot", &vars::Function::wallshot);            row_sep(dl, b, 1);
        toggle_row(dl, row_rect(b, 2), "m_dmg", "Damage hack", &vars::Function::damage_hack);
        box_end(b);

        section(dl, "RECOIL");
        b = box_begin(dl, 2);
        toggle_row(dl, row_rect(b, 0), "m_rcs", "No recoil (RCS)", &vars::Function::rcs); row_sep(dl, b, 0);
        slider_row(dl, row_rect(b, 1), "m_rcsv", "RCS value", &vars::Function::rcs_value, 0.f, 1.f, "%.2f");
        box_end(b);
    }

    static void page_settings(ImDrawList* dl)
    {
        section(dl, "INTERFACE");
        ImRect b = box_begin(dl, 1);
        color_row(row_rect(b, 0), "s_acc", "Accent color", (float*)&clr::accent);
        box_end(b);
    }

    //--------------------------------------------------------------------------
    //  Sidebar
    //--------------------------------------------------------------------------
    struct TabDef { const char* icon; };
    static const TabDef TABS[] = {
        { ICON_FA_EYE },
        { ICON_FA_CROSSHAIRS },
        { ICON_FA_GHOST },
        { ICON_FA_COG },
    };
    static constexpr int TAB_COUNT = (int)(sizeof(TABS) / sizeof(TABS[0]));

    static void draw_sidebar(ImDrawList* dl, const ImRect& sb)
    {
        dl->AddRectFilled(sb.Min, sb.Max, U32(clr::sidebar), S(12.f), ImDrawFlags_RoundCornersLeft);

        // Brand logo (diamond)
        const float lx = sb.GetCenter().x;
        const float ly = sb.Min.y + S(14.f) + S(14.f);
        const float ls = S(14.f);
        dl->AddCircle(ImVec2(lx, ly), ls, U32(clr::accent), 32, S(1.5f));
        ImVec2 dia[4] = { {lx, ly - ls * 0.58f}, {lx + ls * 0.5f, ly}, {lx, ly + ls * 0.58f}, {lx - ls * 0.5f, ly} };
        dl->AddConvexPolyFilled(dia, 4, U32(clr::accent));

        const float sep_y = ly + ls + S(10.f);
        dl->AddLine(ImVec2(sb.Min.x + S(14.f), sep_y), ImVec2(sb.Max.x - S(14.f), sep_y), U32(clr::sidebar_sep));

        const float tab_h = S(44.f), tab_w = S(44.f), gap = S(8.f);
        const float total = TAB_COUNT * tab_h + (TAB_COUNT - 1) * gap;
        float y = sep_y + ((sb.Max.y - sep_y - total) * 0.5f);
        const float tx = sb.GetCenter().x - tab_w * 0.5f;

        // animated indicator
        static float ind_y = 0.f; static bool init = false;
        ImRect rects[8];
        for (int i = 0; i < TAB_COUNT; ++i)
            rects[i] = ImRect(tx, y + i * (tab_h + gap), tx + tab_w, y + i * (tab_h + gap) + tab_h);
        if (!init) { ind_y = rects[active_tab].Min.y; init = true; }
        smooth(ind_y, rects[active_tab].Min.y, 20.f);
        dl->AddRectFilled(ImVec2(tx, ind_y), ImVec2(tx + tab_w, ind_y + tab_h), U32(clr::accent, 0.16f), tab_w * 0.5f);

        ImFont* f = ImGui::GetFont();
        for (int i = 0; i < TAB_COUNT; ++i)
        {
            ImGuiID gid = ImGui::GetID(TABS[i].icon);
            ImGui::ItemAdd(rects[i], gid);
            bool hovered = false, held = false;
            if (ImGui::ButtonBehavior(rects[i], gid, &hovered, &held))
                active_tab = i;

            Anim& a = g_anim[gid];
            smooth(a.hover, hovered && active_tab != i ? 1.f : 0.f, 22.f);
            if (a.hover > 0.01f)
                dl->AddRectFilled(rects[i].Min, rects[i].Max, ImGui::GetColorU32(ImVec4(1, 1, 1, 0.05f * a.hover)), tab_w * 0.5f);

            const ImVec4 ic = active_tab == i ? clr::accent : ImLerp(clr::text_muted, clr::text, a.hover * 0.4f);
            const ImVec2 ts = f->CalcTextSizeA(S(20.f), FLT_MAX, 0.f, TABS[i].icon);
            dl->AddText(f, S(20.f),
                        ImVec2(rects[i].GetCenter().x - ts.x * 0.5f, rects[i].GetCenter().y - ts.y * 0.5f),
                        U32(ic), TABS[i].icon);
        }
    }

    //--------------------------------------------------------------------------
    //  Entry point
    //--------------------------------------------------------------------------
    void Render()
    {
        ImGuiIO& io = ImGui::GetIO();
        g_scale = ImClamp(io.DisplaySize.y / 900.f, 0.85f, 3.0f);

        // ---- bottom toggle bar ----
        ImDrawList* bg = ImGui::GetBackgroundDrawList();
        const ImRect bar(io.DisplaySize.x * 0.5f - S(70.f), io.DisplaySize.y - S(34.f),
                         io.DisplaySize.x * 0.5f + S(70.f), io.DisplaySize.y - S(14.f));
        bg->AddRectFilled(bar.Min, bar.Max, U32(clr::sidebar), S(6.f));
        bg->AddRect(bar.Min, bar.Max, U32(clr::accent, 0.8f), S(6.f), 0, S(1.f));
        const char* bl = menu_open ? "CLOSE" : "MENU";
        const ImVec2 bts = ImGui::GetFont()->CalcTextSizeA(S(13.f), FLT_MAX, 0.f, bl);
        bg->AddText(ImGui::GetFont(), S(13.f), ImVec2(bar.GetCenter().x - bts.x * 0.5f, bar.GetCenter().y - bts.y * 0.5f), U32(clr::text), bl);

        ImGui::SetNextWindowPos(ImVec2(0, 0));
        ImGui::SetNextWindowSize(io.DisplaySize);
        ImGui::Begin("##menu_hit", nullptr,
                     ImGuiWindowFlags_NoBackground | ImGuiWindowFlags_NoDecoration | ImGuiWindowFlags_NoInputs);
        if (ImGui::IsMouseHoveringRect(bar.Min, bar.Max) && ImGui::IsMouseClicked(0))
            menu_open = !menu_open;
        ImGui::End();

        // ---- fade ----
        fade_alpha = ImClamp(fade_alpha + (menu_open ? fade_speed : -fade_speed) * io.DeltaTime, 0.f, 1.f);
        if (fade_alpha <= 0.001f)
            return;

        // ---- shell ----
        g_fade = fade_alpha;
        const ImVec2 panel_size(S(700.f), S(430.f));
        const ImVec2 panel_pos((io.DisplaySize.x - panel_size.x) * 0.5f, (io.DisplaySize.y - panel_size.y) * 0.5f);
        const ImRect panel(panel_pos, panel_pos + panel_size);
        const float sb_w = S(68.f);

        ImGui::SetNextWindowPos(ImVec2(0, 0));
        ImGui::SetNextWindowSize(io.DisplaySize);
        ImGui::PushStyleColor(ImGuiCol_WindowBg, ImVec4(0, 0, 0, 0));
        ImGui::PushStyleVar(ImGuiStyleVar_WindowPadding, ImVec2(0, 0));
        ImGui::PushStyleVar(ImGuiStyleVar_Alpha, fade_alpha);
        ImGui::Begin("##menu_root", nullptr,
                     ImGuiWindowFlags_NoTitleBar | ImGuiWindowFlags_NoResize | ImGuiWindowFlags_NoMove |
                     ImGuiWindowFlags_NoScrollbar | ImGuiWindowFlags_NoCollapse | ImGuiWindowFlags_NoBringToFrontOnFocus |
                     ImGuiWindowFlags_NoSavedSettings);

        ImDrawList* dl = ImGui::GetWindowDrawList();
        dl->AddRectFilled(panel.Min, panel.Max, U32(clr::panel), S(12.f));

        const ImRect sb(panel.Min, ImVec2(panel.Min.x + sb_w, panel.Max.y));
        draw_sidebar(dl, sb);

        // header label
        dl->AddText(ImGui::GetFont(), S(15.f), ImVec2(panel.Min.x + sb_w + S(16.f), panel.Min.y + S(14.f)),
                    U32(clr::text), "Standoff 2  -  v0.39.1");
        dl->AddLine(ImVec2(panel.Min.x + sb_w, panel.Min.y + S(44.f)), ImVec2(panel.Max.x, panel.Min.y + S(44.f)), U32(clr::sidebar_sep));

        // ---- scrolling content ----
        ImGui::SetCursorScreenPos(ImVec2(panel.Min.x + sb_w, panel.Min.y + S(45.f)));
        ImGui::PushClipRect(ImVec2(panel.Min.x + sb_w, panel.Min.y + S(45.f)), panel.Max, true);
        ImGui::BeginChild("##menu_content", ImVec2(panel_size.x - sb_w, panel_size.y - S(45.f)), false,
                          ImGuiWindowFlags_NoBackground);

        ImDrawList* cdl = ImGui::GetWindowDrawList();
        const ImVec2 origin = ImGui::GetCursorScreenPos();
        content_begin(origin, panel_size.x - sb_w);

        switch (active_tab)
        {
            case 0: page_visuals(cdl); break;
            case 1: page_aim(cdl); break;
            case 2: page_misc(cdl); break;
            case 3: page_settings(cdl); break;
        }

        // reserve scroll height (reset cursor first - color rows move it)
        ImGui::SetCursorScreenPos(origin);
        ImGui::Dummy(ImVec2(0, (cy - origin.y) + S(12.f)));
        ImGui::EndChild();
        ImGui::PopClipRect();

        ImGui::End();
        ImGui::PopStyleVar(2);
        ImGui::PopStyleColor();
        g_fade = 1.0f;
    }
}
