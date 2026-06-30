#include "glow.h"
#include "colors.h"

namespace glow
{
    void draw_accent_rect(ImDrawList* dl, const ImRect& rect, float round, float strength)
    {
        if (!dl || strength <= 0.01f)
            return;

        const ImVec4 a = colors::accent;
        const int r = (int)(a.x * 255.f);
        const int g = (int)(a.y * 255.f);
        const int b = (int)(a.z * 255.f);

        for (int i = 1; i <= 3; ++i)
        {
            const float e = (float)i * 2.0f;
            const int alpha = (int)(strength * 38.0f / (float)i);
            if (alpha <= 0)
                continue;

            dl->AddRectFilled(
                ImVec2(rect.Min.x - e, rect.Min.y - e),
                ImVec2(rect.Max.x + e, rect.Max.y + e),
                IM_COL32(r, g, b, alpha), round + e);
        }
    }
}
