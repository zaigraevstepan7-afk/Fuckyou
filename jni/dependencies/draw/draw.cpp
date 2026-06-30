
#include "dependencies/draw/draw.h"
#include <android/native_window_jni.h>
#include <android/log.h>
#include "dependencies/touch/touch_manager.h"
#include "dependencies/resources/font.h"
#include "dependencies/resources/ui_font_ttf.h"

const ImWchar FontRanges[] = {
	0x0020, 0x00FF, // Basic Latin + Latin Supplement
	0x0100, 0x017F, // Latin Extended-A
	0x0180, 0x024F, // Latin Extended-B
	0x0400, 0x052F, // Cyrillic + Cyrillic Supplement
	0x2DE0, 0x2DFF, // Cyrillic Extended-A
	0xA640, 0xA69F, // Cyrillic Extended-B
	0xE000, 0xE226, // icons
	0,
};

namespace draw
{
    static EGLDisplay display = EGL_NO_DISPLAY;
    static EGLConfig config;
    static EGLSurface surface = EGL_NO_SURFACE;
    static EGLContext context = EGL_NO_CONTEXT;
    static ANativeWindow *native_window = nullptr;
    static bool g_Initialized = false;
    static DisplayInfo g_displayInfo = {};

    DisplayInfo getDisplayInfo()
    {
        return g_displayInfo;
    }

    bool initialize(bool log)
    {
        if (g_Initialized)
            return true;

        auto info = android::ANativeWindowCreator::GetDisplayInfo();
        g_displayInfo.orientation = info.orientation;
        g_displayInfo.width = info.width;
        g_displayInfo.height = info.height;

        native_window = android::ANativeWindowCreator::Create("ImGuiWnd", info.width, info.height, false);
        if (!native_window)
            return false;

        display = eglGetDisplay(EGL_DEFAULT_DISPLAY);
        eglInitialize(display, 0, 0);
        EGLint num_config;
        // Use alpha channel so the surface can be composited without forcing a black backdrop.
        const EGLint attribs[] = {
            EGL_SURFACE_TYPE, EGL_WINDOW_BIT,
            EGL_RENDERABLE_TYPE, EGL_OPENGL_ES2_BIT,
            EGL_BLUE_SIZE, 8,
            EGL_GREEN_SIZE, 8,
            EGL_RED_SIZE, 8,
            EGL_ALPHA_SIZE, 8,
            EGL_DEPTH_SIZE, 16,
            EGL_NONE
        };

        eglChooseConfig(display, attribs, &config, 1, &num_config);
        EGLint format;
        eglGetConfigAttrib(display, config, EGL_NATIVE_VISUAL_ID, &format);
        ANativeWindow_setBuffersGeometry(native_window, 0, 0, format);
        const EGLint ctx_attribs[] = {EGL_CONTEXT_CLIENT_VERSION, 3, EGL_NONE};
        context = eglCreateContext(display, config, EGL_NO_CONTEXT, ctx_attribs);
        surface = eglCreateWindowSurface(display, config, native_window, nullptr);
        eglMakeCurrent(display, surface, surface, context);

        ImGui::CreateContext();
        ImGuiIO &io = ImGui::GetIO();
        io.IniFilename = NULL;

        static ImFontConfig font_cfg;
        font_cfg.SizePixels = 22.0f;
        oppoFont = io.Fonts->AddFontFromMemoryTTF((void *)OPPOSans_H, OPPOSans_H_size, 42.0f, &font_cfg, io.Fonts->GetGlyphRangesChineseFull());
        
        static ImFontConfig font_cfg2;
        font_cfg2.SizePixels = 22.0f;

        // UI font (embedded in binary) at multiple sizes.
        verdana_min = io.Fonts->AddFontFromMemoryTTF((void*)UiFontTTF, (int)UiFontTTF_size, 18.0f, &font_cfg2, io.Fonts->GetGlyphRangesCyrillic());
        verdana = io.Fonts->AddFontFromMemoryTTF((void*)UiFontTTF, (int)UiFontTTF_size, 22.0f, &font_cfg2, io.Fonts->GetGlyphRangesCyrillic());
        verdana_max = io.Fonts->AddFontFromMemoryTTF((void*)UiFontTTF, (int)UiFontTTF_size, 28.0f, &font_cfg2, io.Fonts->GetGlyphRangesCyrillic());

        // Use the embedded font everywhere.
        uiFont = verdana;
        skeetFont = verdana;

        font_pixel = io.Fonts->AddFontFromMemoryTTF((void *)SmallestPixel, sizeof SmallestPixel, 10.f, nullptr, io.Fonts->GetGlyphRangesCyrillic());
        font_pixel_flags = io.Fonts->AddFontFromMemoryTTF((void *)SmallestPixel, sizeof SmallestPixel, 25.f, nullptr, io.Fonts->GetGlyphRangesCyrillic());
        weapons = io.Fonts->AddFontFromMemoryTTF((void *)weaponfont, sizeof weaponfont, 15.f);

        logo = io.Fonts->AddFontFromMemoryTTF((void *)logo_raw, sizeof logo_raw, 45.f);
        icons = io.Fonts->AddFontFromMemoryTTF((void *)icons_raw, sizeof icons_raw, 35.f);
        icons_min = io.Fonts->AddFontFromMemoryTTF((void *)icons_raw, sizeof icons_raw, 15.f);

        io.Fonts->AddFontDefault(&font_cfg);
        ImGui::GetStyle().ScaleAllSizes(2.5f);
        ImGui::StyleColorsDark();
        ImGui_ImplAndroid_Init(native_window);
        ImGui_ImplOpenGL3_Init("#version 300 es");
        touch::init(info.width, info.height, info.orientation);
        g_Initialized = true;
        return true;
    }

    void processInput() {}

    void beginFrame()
    {
        ImGui_ImplOpenGL3_NewFrame();
        ImGui_ImplAndroid_NewFrame();
        ImGui::NewFrame();
    }

    void endFrame()
    {
        ImGui::Render();
        glDisable(GL_DEPTH_TEST);
        glDisable(GL_STENCIL_TEST);
        glEnable(GL_BLEND);

        glBlendFuncSeparate(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA, GL_ONE, GL_ONE_MINUS_SRC_ALPHA);

        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        glClear(GL_COLOR_BUFFER_BIT);

        ImGui_ImplOpenGL3_RenderDrawData(ImGui::GetDrawData());
        eglSwapBuffers(display, surface);
    }

    void shutdown()
    {
        if (!g_Initialized)
            return;
        ImGui_ImplOpenGL3_Shutdown();
        ImGui_ImplAndroid_Shutdown();
        ImGui::DestroyContext();
        if (display != EGL_NO_DISPLAY)
        {
            eglMakeCurrent(display, EGL_NO_SURFACE, EGL_NO_SURFACE, EGL_NO_CONTEXT);
            if (context != EGL_NO_CONTEXT)
                eglDestroyContext(display, context);
            if (surface != EGL_NO_SURFACE)
                eglDestroySurface(display, surface);
            eglTerminate(display);
        }
        display = EGL_NO_DISPLAY;
        context = EGL_NO_CONTEXT;
        surface = EGL_NO_SURFACE;
        if (native_window)
        {
            android::ANativeWindowCreator::Destroy(native_window);
            native_window = nullptr;
        }
        touch::shutdown();
        g_Initialized = false;
    }

}
