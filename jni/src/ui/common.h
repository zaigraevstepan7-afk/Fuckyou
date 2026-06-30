#pragma once

//==============================================================================
//  Shared cheat state (vars).
//  These flags are toggled by the menu (menu.cpp) and read by the features
//  (esp.cpp, aim.cpp, Function.cpp, fov_editor.cpp, ...).
//  C++17 `inline` variables => one definition shared across all TUs.
//==============================================================================

namespace vars
{
    namespace esp
    {
        inline bool enabled        = false;
        inline bool rect           = true;
        inline bool box_fill       = false;
        inline int  box_type       = 0;     // 0 = default, 1 = corner, 2 = round
        inline bool health_bar     = true;
        inline bool skeleton       = false;
        inline bool line           = false;
        inline bool name           = true;
        inline bool weapon         = true;
        inline bool bomb           = true;
        inline bool flag_distance  = true;
        inline bool flag_money     = false;
        inline bool flag_ping      = false;
    }

    namespace aimbot
    {
        inline bool  enabled       = false;
        inline bool  draw_fov      = true;
        inline bool  visible_check = true;
        inline float fov_color[4]  = { 1.0f, 0.10f, 0.10f, 0.60f };

        namespace Fov
        {
            inline bool  check  = true;
            inline float radius = 120.0f;
        }

        namespace Smooth
        {
            inline float pitch = 3.0f;
        }

        namespace Hitbox
        {
            inline int type = 0; // 0 = head, 1 = neck, 2 = chest, 3 = pelvis
        }
    }

    namespace visual
    {
        inline bool  fov       = false;
        inline float fov_value = 80.0f;
    }

    namespace Function
    {
        inline bool  invisible   = false;
        inline bool  wallshot    = false;
        inline bool  damage_hack = false;
        inline bool  rcs         = false;
        inline float rcs_value   = 0.0f;
    }
}
