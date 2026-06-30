#pragma once

#include "imgui.h"
#include "imgui_internal.h"

namespace glow
{
    // Soft accent glow drawn directly on the ImGui draw list (no DX renderer).
    void draw_accent_rect(ImDrawList* dl, const ImRect& rect, float round, float strength = 1.f);
    inline void clear_frame() {}
}
