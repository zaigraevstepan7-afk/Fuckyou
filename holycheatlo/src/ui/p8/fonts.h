#pragma once

// ── Font shim for holycheatlo (Android / OpenGL, ImGui 1.92.x) ──────────────
// The original Imgui-Portfolio framework loaded custom Inter / icon / logo
// fonts via DirectX.  holycheatlo runs on Android with a single default font,
// so every request maps to the default ImGui font.  The icon font is absent,
// hence icon() returns nullptr — all icon draws are guarded and simply skipped.

#include "imgui.h"

namespace fonts
{
    inline void  init() {}
    inline void  shutdown() {}
    inline void  sync_ui_scale(float /*factor*/) {}
    inline float design_to_pixel(float design_size) { return design_size; }

    inline float size(ImFont* /*font*/) { return ImGui::GetFontSize(); }

    inline ImFont* inter(float /*design_size*/, bool /*bold*/ = false) { return ImGui::GetFont(); }
    inline ImFont* icon(float /*design_size*/) { return nullptr; }
    inline ImFont* logo(float /*design_size*/) { return ImGui::GetFont(); }
}
