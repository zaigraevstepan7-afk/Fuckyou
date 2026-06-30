#pragma once

#include "imgui.h"
#include <cstdint>

namespace visuals {
    void draw();
    void dbox(const ImVec2& t, const ImVec2& b, float a);
    void dhp(int hp, const ImVec2& t, const ImVec2& b, float box_h, float a);
    void dnick(const char* name, const ImVec2& box_min, float cx, float sz, float a);
    void ddist(float dist, float x, float y, float sz, float a);
    void dline(const ImVec2& from, const ImVec2& to, float a);
    void dweapon(const char* weapon, const ImVec2& box_max, float cx, float sz, float a);
    void dflags(uint64_t player, float dist, const ImVec2& box_min, const ImVec2& box_max, float sz, float a);
    void draw_text_outlined(ImDrawList* dl, ImFont* font, float size, const ImVec2& pos, ImU32 color, const char* text);
}
