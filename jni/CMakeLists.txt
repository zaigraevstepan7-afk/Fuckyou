cmake_minimum_required(VERSION 3.22)
project(cheat LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Android-specific settings
set(ANDROID_ABI x86_64 CACHE STRING "Android ABI")
set(ANDROID_PLATFORM android-21 CACHE STRING "Android platform")
set(ANDROID_STL c++_static CACHE STRING "Android STL")

# Source files (matching Android.mk)
set(SOURCES
    src/main.cpp
    src/process/process_manager.cpp
    src/memory/memory.cpp
    src/features/esp.cpp
    src/features/aim.cpp
    src/features/Function.cpp
    src/features/SkinChanger.cpp
    src/features/fov_editor.cpp
    src/features/rage.cpp
    src/utils/offsets/offsets.cpp
    src/utils/math/math.cpp
    src/utils/entity/entities.cpp
    src/utils/entity/game_utils.cpp
    src/utils/utils.cpp
    src/utils/debug/debug_state.cpp
    dependencies/draw/draw.cpp
    dependencies/touch/touch_manager.cpp
    src/ui/menu.cpp
    src/ui/gui/gui.cpp
    src/ui/gui/helpers/config.cpp
    src/ui/gui/helpers/draw.cpp
    src/ui/gui/helpers/fonts.cpp
    src/ui/gui/widgets/helpers.cpp
    src/ui/gui/widgets/notify.cpp
    src/ui/gui/widgets/text_field.cpp
    src/ui/gui/widgets/widgets.cpp
    src/ui/gui/widgets/window.cpp
    src/ui/imgui/imgui.cpp
    src/ui/imgui/imgui_draw.cpp
    src/ui/imgui/imgui_tables.cpp
    src/ui/imgui/imgui_widgets.cpp
    src/ui/imgui/backends/imgui_impl_android.cpp
    src/ui/imgui/backends/imgui_impl_opengl3.cpp
)

# Include directories
include_directories(
    ${CMAKE_CURRENT_SOURCE_DIR}
    ${CMAKE_CURRENT_SOURCE_DIR}/src
    ${CMAKE_CURRENT_SOURCE_DIR}/src/ui
    ${CMAKE_CURRENT_SOURCE_DIR}/src/ui/gui
    ${CMAKE_CURRENT_SOURCE_DIR}/src/ui/gui/headers
    ${CMAKE_CURRENT_SOURCE_DIR}/src/ui/imgui
    ${CMAKE_CURRENT_SOURCE_DIR}/src/ui/imgui/backends
    ${CMAKE_CURRENT_SOURCE_DIR}/dependencies
    ${CMAKE_CURRENT_SOURCE_DIR}/dependencies/draw
    ${CMAKE_CURRENT_SOURCE_DIR}/dependencies/touch
    ${CMAKE_CURRENT_SOURCE_DIR}/dependencies/android
)

# Create executable
add_executable(${PROJECT_NAME} ${SOURCES})

# Compiler flags
target_compile_options(${PROJECT_NAME} PRIVATE
    -O2
    -Wno-unused-command-line-argument
    -fvisibility=hidden
    -ffunction-sections
    -fdata-sections
)

target_compile_definitions(${PROJECT_NAME} PRIVATE
    IMGUI_DISABLE_DEMO_WINDOWS
)

# Linker flags
target_link_options(${PROJECT_NAME} PRIVATE
    -Wl,--gc-sections
    -Wl,--exclude-libs,ALL
    -fuse-ld=lld
)

# Link Android libraries
target_link_libraries(${PROJECT_NAME} PRIVATE
    log
    android
    EGL
    GLESv3
)

# Strip binary (remove debug symbols, like APP_OPTIM=release in ndk-build)
add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
    COMMAND ${CMAKE_STRIP} "$<TARGET_FILE:${PROJECT_NAME}>"
    COMMENT "[OK] Stripping debug symbols"
)

# Post-build: copy binary to loader folder
set(LOADER_DIR "${CMAKE_CURRENT_SOURCE_DIR}/../лоадерабаюдна (dlya pc)")

# Determine destination filename based on ABI
if(ANDROID_ABI STREQUAL "arm64-v8a")
    set(DEST_BINARY_NAME "cheat_arm")
elseif(ANDROID_ABI STREQUAL "x86_64")
    set(DEST_BINARY_NAME "cheat_x86")
elseif(ANDROID_ABI STREQUAL "x86")
    set(DEST_BINARY_NAME "cheat_x86")
elseif(ANDROID_ABI STREQUAL "armeabi-v7a")
    set(DEST_BINARY_NAME "cheat_arm")
else()
    # Fallback
    set(DEST_BINARY_NAME "cheat")
endif()

if(EXISTS "${LOADER_DIR}")
    add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
        COMMAND ${CMAKE_COMMAND} -E copy_if_different
            "$<TARGET_FILE:${PROJECT_NAME}>"
            "${LOADER_DIR}/${DEST_BINARY_NAME}"
        COMMENT "[OK] Copying ${ANDROID_ABI} binary to ${LOADER_DIR}/${DEST_BINARY_NAME}"
    )

    # Copy icons if they exist
    if(EXISTS "${CMAKE_CURRENT_SOURCE_DIR}/icons")
        add_custom_command(TARGET ${PROJECT_NAME} POST_BUILD
            COMMAND ${CMAKE_COMMAND} -E copy_directory
                "${CMAKE_CURRENT_SOURCE_DIR}/icons"
                "${LOADER_DIR}/icons"
            COMMENT "[OK] Copying icons to loader folder"
        )
    endif()
endif()
