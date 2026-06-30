#define IMGUI_DEFINE_MATH_OPERATORS
#include "imgui.h"
#include "IconsFontAwesome5.h"
#include "menu.h"
#include "common.h"
#include <algorithm>

//==============================================================================
//  New menu. Visual language carried over from the old "Zenin" demo
//  (fade in/out, dark-red theme, rounded title), but every control is now
//  bound to a real cheat variable in vars:: (common.h).
//==============================================================================

namespace Menu
{
    static bool  menu_open = false;
    static float fade_alpha = 0.0f;
    constexpr float fade_speed = 6.0f;

    void Toggle() { menu_open = !menu_open; }
    bool IsOpen() { return menu_open; }

    //--------------------------------------------------------------------------
    //  Small UI helpers (kept local so the menu has no external deps).
    //--------------------------------------------------------------------------
    static void Section(const char* icon, const char* title)
    {
        ImGui::Dummy(ImVec2(0, 4));
        ImGui::TextColored(ImVec4(1.0f, 0.35f, 0.35f, 1.0f), "%s  %s", icon, title);
        ImGui::Separator();
        ImGui::Dummy(ImVec2(0, 2));
    }

    static void Toggle(const char* label, bool* v)
    {
        ImGui::Checkbox(label, v);
    }

    //--------------------------------------------------------------------------
    //  Tab pages.
    //--------------------------------------------------------------------------
    static void TabEsp()
    {
        Section(ICON_FA_EYE, "ESP");
        Toggle("Enable ESP", &vars::esp::enabled);

        ImGui::BeginDisabled(!vars::esp::enabled);
        {
            Section(ICON_FA_VECTOR_SQUARE, "Box");
            Toggle("Box", &vars::esp::rect);
            ImGui::SameLine();
            Toggle("Fill", &vars::esp::box_fill);
            const char* box_types[] = { "Default", "Corner", "Round" };
            ImGui::SetNextItemWidth(160);
            ImGui::Combo("Box style", &vars::esp::box_type, box_types, IM_ARRAYSIZE(box_types));

            Section(ICON_FA_INFO_CIRCLE, "Info");
            Toggle("Health bar", &vars::esp::health_bar);
            Toggle("Skeleton",   &vars::esp::skeleton);
            Toggle("Snapline",   &vars::esp::line);
            Toggle("Name",       &vars::esp::name);
            Toggle("Weapon",     &vars::esp::weapon);

            Section(ICON_FA_FLAG, "Flags");
            Toggle("Distance", &vars::esp::flag_distance);
            ImGui::SameLine();
            Toggle("Money", &vars::esp::flag_money);
            ImGui::SameLine();
            Toggle("Ping", &vars::esp::flag_ping);

            Section(ICON_FA_BOMB, "World");
            Toggle("Bomb ESP", &vars::esp::bomb);
        }
        ImGui::EndDisabled();
    }

    static void TabAimbot()
    {
        Section(ICON_FA_CROSSHAIRS, "Aimbot");
        Toggle("Enable Aimbot", &vars::aimbot::enabled);

        ImGui::BeginDisabled(!vars::aimbot::enabled);
        {
            Toggle("Visibility check", &vars::aimbot::visible_check);

            const char* hitboxes[] = { "Head", "Neck", "Chest", "Pelvis" };
            ImGui::SetNextItemWidth(160);
            ImGui::Combo("Hitbox", &vars::aimbot::Hitbox::type, hitboxes, IM_ARRAYSIZE(hitboxes));

            ImGui::SetNextItemWidth(220);
            ImGui::SliderFloat("Smoothing", &vars::aimbot::Smooth::pitch, 0.0f, 20.0f, "%.1f");

            Section(ICON_FA_DOT_CIRCLE, "FOV");
            Toggle("FOV check", &vars::aimbot::Fov::check);
            Toggle("Draw FOV",  &vars::aimbot::draw_fov);
            ImGui::SetNextItemWidth(220);
            ImGui::SliderFloat("FOV radius", &vars::aimbot::Fov::radius, 10.0f, 600.0f, "%.0f");
            ImGui::ColorEdit4("FOV color", vars::aimbot::fov_color,
                              ImGuiColorEditFlags_AlphaBar | ImGuiColorEditFlags_NoInputs);
        }
        ImGui::EndDisabled();
    }

    static void TabVisuals()
    {
        Section(ICON_FA_VIDEO, "Camera");
        Toggle("Custom FOV", &vars::visual::fov);
        ImGui::BeginDisabled(!vars::visual::fov);
        ImGui::SetNextItemWidth(220);
        ImGui::SliderFloat("FOV", &vars::visual::fov_value, 40.0f, 120.0f, "%.0f");
        ImGui::EndDisabled();
    }

    static void TabMisc()
    {
        Section(ICON_FA_GHOST, "Weapon");
        Toggle("Invisible weapon", &vars::Function::invisible);
        Toggle("Wallshot",         &vars::Function::wallshot);
        Toggle("Damage hack",      &vars::Function::damage_hack);

        Section(ICON_FA_CROSSHAIRS, "Recoil");
        Toggle("No recoil (RCS)", &vars::Function::rcs);
        ImGui::BeginDisabled(!vars::Function::rcs);
        ImGui::SetNextItemWidth(220);
        ImGui::SliderFloat("RCS value", &vars::Function::rcs_value, 0.0f, 1.0f, "%.2f");
        ImGui::EndDisabled();
    }

    static void TabSkins()
    {
        Section(ICON_FA_GEM, "Skin changer");
        ImGui::TextWrapped("Open the skin changer panel to swap inventory skins.");
        ImGui::TextDisabled("(handled by SkinChanger::render_skinchanger_ui)");
    }

    //--------------------------------------------------------------------------
    //  Main entry.
    //--------------------------------------------------------------------------
    void Render()
    {
        ImGuiIO& io = ImGui::GetIO();

        // ---- Bottom toggle bar (click to open/close) ----
        ImDrawList* bg = ImGui::GetBackgroundDrawList();
        ImVec2 bar_min(io.DisplaySize.x * 0.5f - 100, io.DisplaySize.y - 28);
        ImVec2 bar_max(io.DisplaySize.x * 0.5f + 100, io.DisplaySize.y - 12);
        bg->AddRectFilled(bar_min, bar_max, IM_COL32(60, 0, 0, 220), 4.0f);
        bg->AddRect(bar_min, bar_max, IM_COL32(255, 60, 60, 255), 4.0f, 0, 1.0f);
        const char* bar_label = menu_open ? "CLOSE" : "MENU";
        ImVec2 ts = ImGui::CalcTextSize(bar_label);
        bg->AddText(ImVec2((bar_min.x + bar_max.x) * 0.5f - ts.x * 0.5f,
                           (bar_min.y + bar_max.y) * 0.5f - ts.y * 0.5f),
                    IM_COL32(255, 230, 230, 255), bar_label);

        ImGui::SetNextWindowPos(ImVec2(0, 0));
        ImGui::SetNextWindowSize(io.DisplaySize);
        ImGui::Begin("##menu_click", nullptr,
                     ImGuiWindowFlags_NoBackground | ImGuiWindowFlags_NoDecoration |
                     ImGuiWindowFlags_NoInputs);
        if (ImGui::IsMouseHoveringRect(bar_min, bar_max) && ImGui::IsMouseClicked(0))
            menu_open = !menu_open;
        ImGui::End();

        // ---- Fade ----
        fade_alpha = std::clamp(fade_alpha + (menu_open ? fade_speed : -fade_speed) * io.DeltaTime, 0.0f, 1.0f);
        if (fade_alpha <= 0.0f)
            return;

        // ---- Theme ----
        ImGuiStyle& style = ImGui::GetStyle();
        style.WindowRounding   = 10.0f;
        style.FrameRounding    = 4.0f;
        style.GrabRounding     = 4.0f;
        style.WindowBorderSize = 0.0f;
        style.Colors[ImGuiCol_WindowBg]      = ImVec4(0.07f, 0.07f, 0.07f, 0.97f * fade_alpha);
        style.Colors[ImGuiCol_ChildBg]       = ImVec4(0.10f, 0.10f, 0.10f, 0.70f * fade_alpha);
        style.Colors[ImGuiCol_FrameBg]       = ImVec4(0.18f, 0.04f, 0.04f, 0.85f * fade_alpha);
        style.Colors[ImGuiCol_FrameBgHovered]= ImVec4(0.30f, 0.05f, 0.05f, 0.90f * fade_alpha);
        style.Colors[ImGuiCol_FrameBgActive] = ImVec4(0.45f, 0.05f, 0.05f, 1.00f * fade_alpha);
        style.Colors[ImGuiCol_Button]        = ImVec4(0.20f, 0.02f, 0.02f, 0.85f * fade_alpha);
        style.Colors[ImGuiCol_ButtonHovered] = ImVec4(0.40f, 0.03f, 0.03f, 0.90f * fade_alpha);
        style.Colors[ImGuiCol_ButtonActive]  = ImVec4(0.60f, 0.00f, 0.00f, 1.00f * fade_alpha);
        style.Colors[ImGuiCol_CheckMark]     = ImVec4(1.00f, 0.25f, 0.25f, 1.00f * fade_alpha);
        style.Colors[ImGuiCol_SliderGrab]    = ImVec4(0.80f, 0.15f, 0.15f, 1.00f * fade_alpha);
        style.Colors[ImGuiCol_SliderGrabActive] = ImVec4(1.00f, 0.20f, 0.20f, 1.00f * fade_alpha);
        style.Colors[ImGuiCol_Text]          = ImVec4(1.00f, 0.90f, 0.90f, 1.00f);
        style.Colors[ImGuiCol_Separator]     = ImVec4(0.40f, 0.10f, 0.10f, 0.60f * fade_alpha);

        ImGui::SetNextWindowBgAlpha(fade_alpha);
        ImVec2 menu_size(io.DisplaySize.x * 0.6f, io.DisplaySize.y * 0.62f);
        ImVec2 menu_pos((io.DisplaySize.x - menu_size.x) * 0.5f,
                        (io.DisplaySize.y - menu_size.y) * 0.5f);
        ImGui::SetNextWindowPos(menu_pos, ImGuiCond_Always);
        ImGui::SetNextWindowSize(menu_size);

        ImGui::Begin("##NewMenu", nullptr,
                     ImGuiWindowFlags_NoCollapse | ImGuiWindowFlags_NoResize |
                     ImGuiWindowFlags_NoScrollbar | ImGuiWindowFlags_NoTitleBar);

        // ---- Title bar ----
        ImVec2 win_pos  = ImGui::GetWindowPos();
        ImVec2 win_size = ImGui::GetWindowSize();
        ImDrawList* list = ImGui::GetWindowDrawList();
        list->AddRectFilled(win_pos, ImVec2(win_pos.x + win_size.x, win_pos.y + 56),
                            IM_COL32(60, 0, 0, static_cast<int>(200 * fade_alpha)),
                            10.0f, ImDrawFlags_RoundCornersTop);
        ImGui::SetCursorPos(ImVec2(20, 18));
        ImGui::TextColored(ImVec4(1, 0.2f, 0.2f, 1), ICON_FA_FIRE "  Cheat Menu");

        // ---- Tab buttons ----
        static int tab = 0;
        struct TabDef { const char* label; };
        const TabDef tabs[] = {
            { ICON_FA_EYE "  ESP" },
            { ICON_FA_CROSSHAIRS "  Aimbot" },
            { ICON_FA_VIDEO "  Visuals" },
            { ICON_FA_GEM "  Skins" },
            { ICON_FA_GHOST "  Misc" },
        };
        ImGui::SetCursorPos(ImVec2(20, 70));
        for (int i = 0; i < IM_ARRAYSIZE(tabs); ++i)
        {
            const bool active = (tab == i);
            if (active)
                ImGui::PushStyleColor(ImGuiCol_Button, ImVec4(0.55f, 0.05f, 0.05f, 1.0f * fade_alpha));
            if (ImGui::Button(tabs[i].label, ImVec2(110, 34)))
                tab = i;
            if (active)
                ImGui::PopStyleColor();
            if (i + 1 < IM_ARRAYSIZE(tabs))
                ImGui::SameLine();
        }

        ImGui::Dummy(ImVec2(0, 8));
        ImGui::BeginChild("##content", ImVec2(-1, -1), true);
        switch (tab)
        {
            case 0: TabEsp();     break;
            case 1: TabAimbot();  break;
            case 2: TabVisuals(); break;
            case 3: TabSkins();   break;
            case 4: TabMisc();    break;
        }
        ImGui::EndChild();

        ImGui::End();
    }
}
