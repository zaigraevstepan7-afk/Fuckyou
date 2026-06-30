LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := holycheatlo
LOCAL_SRC_FILES := \
    ../src/main.cpp \
    ../src/ui/menu.cpp \
    ../src/ui/p8/widgets.cpp \
    ../src/ui/p8/settings_panel.cpp \
    ../src/ui/p8/glow.cpp \
    ../src/func/visuals.cpp \
    ../src/func/aim.cpp \
    ../src/func/wallshot.cpp \
    ../src/func/inf_ammo.cpp \
    ../src/func/norecoil.cpp \
    ../src/func/test_loader.cpp \
    ../src/protect/oxorany.cpp \
    ../../includes/draw/Android_draw/draw.cpp \
    ../../includes/draw/Android_touch/Touch.cpp \
    ../../imgui-1.92.8/imgui.cpp \
    ../../imgui-1.92.8/imgui_draw.cpp \
    ../../imgui-1.92.8/imgui_tables.cpp \
    ../../imgui-1.92.8/imgui_widgets.cpp \
    ../../imgui-1.92.8/backends/imgui_impl_android.cpp \
    ../../imgui-1.92.8/backends/imgui_impl_opengl3.cpp

LOCAL_C_INCLUDES := \
    $(LOCAL_PATH)/../src \
    $(LOCAL_PATH)/../src/ui \
    $(LOCAL_PATH)/../src/ui/p8 \
    $(LOCAL_PATH)/../src/game \
    $(LOCAL_PATH)/../src/func \
    $(LOCAL_PATH)/../src/protect \
    $(LOCAL_PATH)/../../includes \
    $(LOCAL_PATH)/../../includes/fonts \
    $(LOCAL_PATH)/../../includes/internal \
    $(LOCAL_PATH)/../../imgui-1.92.8 \
    $(LOCAL_PATH)/../../imgui-1.92.8/backends

LOCAL_CPPFLAGS := \
    -std=c++17 \
    -fno-rtti \
    -fno-exceptions \
    -fvisibility=hidden \
    -fvisibility-inlines-hidden \
    -Oz \
    -ffunction-sections \
    -fdata-sections \
    -fomit-frame-pointer \
    -Wno-error=format-security \
    -fno-color-diagnostics \
    -fmerge-all-constants \
    -fno-ident

LOCAL_LDFLAGS := \
    -Wl,--gc-sections \
    -Wl,--strip-all \
    -Wl,--build-id=none \
    -Wl,--no-undefined \
    -pie \
    -Wl,-z,relro \
    -Wl,-z,now \
    -Wl,-z,noexecstack

LOCAL_LDLIBS := \
    -llog \
    -landroid \
    -lEGL \
    -lGLESv3

include $(BUILD_EXECUTABLE)
