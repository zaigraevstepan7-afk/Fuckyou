#pragma once

#include "imgui.h"

namespace cfg {

namespace esp {
    inline bool box = true;
    inline bool name = false;
    inline bool nickname = true;
    inline bool health = true;
    inline bool distance = false;
    inline bool weapon = false;
    inline bool line = false;
    inline bool skeleton = false;
    inline bool flags = false;
    inline bool dropped_items = false;
    inline int box_type = 0;
    inline float box_rounding = 0.0f;
    inline ImVec4 box_col = ImVec4(1.0f, 1.0f, 1.0f, 1.0f);
    inline ImVec4 name_col = ImVec4(1.0f, 1.0f, 1.0f, 1.0f);
    inline ImVec4 health_col = ImVec4(0.0f, 1.0f, 0.25f, 1.0f);
    inline ImVec4 distance_col = ImVec4(1.0f, 1.0f, 1.0f, 1.0f);
    inline ImVec4 skeleton_col = ImVec4(1.0f, 1.0f, 1.0f, 1.0f);
    inline ImVec4 flags_col = ImVec4(1.0f, 1.0f, 1.0f, 1.0f);
}

namespace aim {
    inline bool enabled = false;
    inline bool visible_check = false;
    inline float fov = 70.0f;
    inline float smooth = 0.25f;
    inline bool fov_display = true;
    inline bool lock_line = true;
    inline bool lock_dot = true;
    inline bool aspect_ratio = false;
    inline float aspect_value = 1.78f;
    inline bool aspect_stretch = false;
    inline float aspect_stretch_value = 1.33f;
    inline int target = 0;
    inline float max_distance = 250.0f;
}

namespace wallshot {
    inline bool enabled = false;
    inline int value = 2147483646;
    inline int restore_value = 150;
}

namespace inf_ammo {
    inline bool enabled = false;
    inline int value = 10000;
}

namespace norecoil {
    inline bool enabled = false;
    inline float multiplier = 0.0f;
}

namespace test {
    inline bool invisible = false;
}

namespace menu {
    inline float scale = 1.0f;
    inline ImVec4 accent_col = ImVec4(0.95f, 0.15f, 0.15f, 1.0f);
}

}
