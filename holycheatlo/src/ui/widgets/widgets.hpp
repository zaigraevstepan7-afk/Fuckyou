#pragma once
#include "../theme/theme.hpp"
#include <vector>
#include <functional>

namespace ui::widgets {

bool checkbox(const char* name, bool* v, float a);

bool slider(const char* name, float* v, float mn, float mx, float a,
            const char* fmt = "%.1f");

// Кастомный спиннер (выпадающий список с кастомным рендером)
// items — список строк, v — текущий индекс
bool spinner(const char* name, int* v, const std::vector<const char*>& items, float a);

bool combo(const char* name, int* v, const std::vector<const char*>& items, float a);

void colorpick(const char* name, ImVec4* v, float a);
void separator(float a);
bool button(const char* name, float a, std::function<void()> on_click = nullptr);

}
