LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)
LOCAL_MODULE := big_array
LOCAL_CFLAGS += -O3
include $(BUILD_STATIC_LIBRARY)

include $(CLEAR_VARS)
LOCAL_MODULE := cheat

LOCAL_SRC_FILES := \
	src/main.cpp \
	src/process/process_manager.cpp \
	src/memory/memory.cpp \
	src/features/esp.cpp \
	src/features/aim.cpp \
	src/features/Function.cpp \
	src/features/SkinChanger.cpp \
	src/features/fov_editor.cpp \
	src/features/rage.cpp \
	src/utils/offsets/offsets.cpp \
	src/utils/math/math.cpp \
	src/utils/entity/entities.cpp \
	src/utils/entity/game_utils.cpp \
	src/utils/utils.cpp \
	src/utils/debug/debug_state.cpp \
	dependencies/draw/draw.cpp \
	dependencies/touch/touch_manager.cpp \
	src/ui/menu.cpp \
	src/ui/gui/gui.cpp \
	src/ui/gui/helpers/config.cpp \
	src/ui/gui/helpers/draw.cpp \
	src/ui/gui/helpers/fonts.cpp \
	src/ui/gui/widgets/helpers.cpp \
	src/ui/gui/widgets/notify.cpp \
	src/ui/gui/widgets/text_field.cpp \
	src/ui/gui/widgets/widgets.cpp \
	src/ui/gui/widgets/window.cpp \
	src/ui/imgui/imgui.cpp \
	src/ui/imgui/imgui_draw.cpp \
	src/ui/imgui/imgui_tables.cpp \
	src/ui/imgui/imgui_widgets.cpp \
	src/ui/imgui/backends/imgui_impl_android.cpp \
	src/ui/imgui/backends/imgui_impl_opengl3.cpp

LOCAL_C_INCLUDES := \
	$(LOCAL_PATH) \
	$(LOCAL_PATH)/src \
	$(LOCAL_PATH)/src/ui \
	$(LOCAL_PATH)/src/ui/gui \
	$(LOCAL_PATH)/src/ui/gui/headers \
	$(LOCAL_PATH)/src/ui/imgui \
	$(LOCAL_PATH)/src/ui/imgui/backends \
	$(LOCAL_PATH)/dependencies \
	$(LOCAL_PATH)/dependencies/draw \
	$(LOCAL_PATH)/dependencies/touch \
	$(LOCAL_PATH)/dependencies/android

LOCAL_STATIC_LIBRARIES := big_array
LOCAL_LDLIBS := -llog -landroid -lEGL -lGLESv3

LOCAL_CFLAGS += \
	-O2 \
	-Wno-unused-command-line-argument \
	-fvisibility=hidden \
	-ffunction-sections \
	-fdata-sections \
	-DIMGUI_DISABLE_DEMO_WINDOWS

LOCAL_CPPFLAGS += -std=c++20

LOCAL_LDFLAGS += \
	-Wl,--gc-sections \
	-Wl,--exclude-libs,ALL

include $(BUILD_EXECUTABLE)
