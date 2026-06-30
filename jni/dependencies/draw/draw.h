#ifndef NATIVESURFACE_DRAW_H
#define NATIVESURFACE_DRAW_H
#include <android/native_window.h>
#include <EGL/egl.h>
#include <GLES3/gl3.h>
#include "imgui.h"
#include "backends/imgui_impl_android.h"
#include "backends/imgui_impl_opengl3.h"
#include "dependencies/ANativeWindowCreator.h"
#include "../resources/fonts.h"
#include "../resources/bytes.h"

namespace draw 
{
    struct DisplayInfo {
        uint32_t orientation;
        int32_t width;
        int32_t height;
    };

    bool initialize(bool log = false);
    void processInput();
    void beginFrame();
    void endFrame();
    void shutdown();
    DisplayInfo getDisplayInfo();
}
#endif
