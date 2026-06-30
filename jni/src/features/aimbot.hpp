#pragma once
#include "../utils/math/math.h"

namespace Aimbot {
    inline vector3 worldToScreen3(const matrix &viewMatrix, const vector3 &pos) {
        float screenWidth = 0.0f;
        float screenHeight = 0.0f;
        math_utils::get_screen_size(screenWidth, screenHeight);
        if (screenWidth <= 0 || screenHeight <= 0) {
            return vector3(0.0f, 0.0f, -1.0f);
        }

        float screenW = viewMatrix.m14 * pos.x + viewMatrix.m24 * pos.y + viewMatrix.m34 * pos.z + viewMatrix.m44;
        if (screenW <= 0.0001f) {
            return vector3(0.0f, 0.0f, -1.0f);
        }

        float screenX = viewMatrix.m11 * pos.x + viewMatrix.m21 * pos.y + viewMatrix.m31 * pos.z + viewMatrix.m41;
        float screenY = viewMatrix.m12 * pos.x + viewMatrix.m22 * pos.y + viewMatrix.m32 * pos.z + viewMatrix.m42;

        float x = screenWidth / 2.0f + (screenWidth / 2.0f) * screenX / screenW;
        float y = screenHeight / 2.0f - (screenHeight / 2.0f) * screenY / screenW;

        if (x < 0 || x > screenWidth || y < 0 || y > screenHeight) {
            return vector3(0.0f, 0.0f, -1.0f);
        }

        return vector3(x, y, screenW);
    }
}

