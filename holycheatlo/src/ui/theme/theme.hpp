#pragma once
#include "imgui.h"
#include "imgui_internal.h"
#include <string>
#include <unordered_map>

inline float g_sw, g_sh;

namespace ui {

namespace clr {
    // ── Red dark theme ────────────────────────────────────────────────────
    // bg: очень тёмный, с красным подтоном
    inline ImVec4 bg           = ImVec4(12/255.f,   6/255.f,   6/255.f,  0.98f);
    inline ImVec4 bg_two       = ImVec4(18/255.f,   8/255.f,   8/255.f,  0.97f);
    inline ImVec4 sidebar      = ImVec4(20/255.f,   8/255.f,   8/255.f,  0.97f);
    inline ImVec4 panel        = ImVec4(28/255.f,  10/255.f,  10/255.f,  0.95f);
    inline ImVec4 widget       = ImVec4(55/255.f,  18/255.f,  18/255.f,  0.80f);
    // accent — чистый красный
    inline ImVec4 accent       = ImVec4(220/255.f,  30/255.f,  30/255.f, 0.92f);
    inline ImVec4 accent_light = ImVec4(255/255.f,  70/255.f,  70/255.f, 1.0f);
    inline ImVec4 accent_dark  = ImVec4(140/255.f,  15/255.f,  15/255.f, 0.40f);
    inline ImVec4 text         = ImVec4(230/255.f, 210/255.f, 210/255.f, 1.f);
    inline ImVec4 text_light   = ImVec4(255/255.f, 240/255.f, 240/255.f, 1.f);
    inline ImVec4 text_dim     = ImVec4(130/255.f, 100/255.f, 100/255.f, 1.f);
    inline ImVec4 border       = ImVec4(80/255.f,  25/255.f,  25/255.f,  0.85f);
    inline ImVec4 border_light = ImVec4(255/255.f, 100/255.f, 100/255.f, 0.06f);
    inline ImVec4 border_dark  = ImVec4(0/255.f,   0/255.f,   0/255.f,   1.f);
    inline ImVec4 subtab_bg    = ImVec4(20/255.f,   8/255.f,   8/255.f,  0.97f);
}

namespace style {
    inline std::unordered_map<std::string, float>   anims;
    inline std::unordered_map<std::string, ImVec4>  anim_colors;
    inline float content_w     = 0.f;
    inline float content_alpha = 1.f;
    inline bool  popup_open    = false;
    inline std::string active_popup = "";
    inline constexpr float S = 2.5f;


    // ── Customization cfg ─────────────────────────────────────────────────
    inline float cfg_menu_opacity     = 1.0f;
    inline float cfg_win_rounding     = 10.f;
    inline bool  cfg_corner_dots      = false;
    inline float cfg_corner_dot_size  = 3.0f;
    inline bool  cfg_inner_shine      = true;
    inline bool  cfg_rgb_menu         = false;
    inline float cfg_rgb_speed        = 1.0f;
    inline ImVec4 cfg_accent_color    = ImVec4(220.f/255.f, 30.f/255.f, 30.f/255.f, 1.f);
    inline int   cfg_font_idx         = 1;    // 0=PixelOp 1=Comfortaa 2=ComicSans 3=Minecraft
    inline float cfg_font_scale       = 1.0f;
    inline int   cfg_anim_type        = 0;    // 0=Snow 1=Rain 2=Stars
    inline float cfg_anim_speed       = 1.0f;
    inline int   cfg_anim_count       = 80;
    inline float cfg_open_speed       = 6.0f;
    inline float cfg_tab_fade_speed   = 10.0f;

    void   tick();
    float  anim(const std::string& id, float tgt, float spd = 12.f);
    ImVec4 anim_col(const std::string& id, const ImVec4& tgt, float spd = 12.f);
    ImU32  col(const ImVec4& c, float a = 1.f);
    bool   popup();
    void   close();
    void   popups();
}

}

