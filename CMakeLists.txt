cmake_minimum_required(VERSION 3.22.1)
project(zygisk_module_reversed CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

# Matches the flags observed in the original binary (full RELRO + BIND_NOW).
add_compile_options(-fvisibility=hidden -ffunction-sections -fdata-sections)
add_link_options(-Wl,-z,relro,-z,now -Wl,--gc-sections)

set(IMGUI_DIR ${CMAKE_SOURCE_DIR}/third_party/imgui)

add_library(zygisk_module SHARED
    src/jni_bridge.cpp
    src/zygisk_entry.cpp
    src/anti_detect.cpp
    src/config.cpp
    src/overlay.cpp
    src/zygisk_module.cpp

    ${IMGUI_DIR}/imgui.cpp
    ${IMGUI_DIR}/imgui_draw.cpp
    ${IMGUI_DIR}/imgui_tables.cpp
    ${IMGUI_DIR}/imgui_widgets.cpp
    ${IMGUI_DIR}/backends/imgui_impl_android.cpp
    ${IMGUI_DIR}/backends/imgui_impl_opengl3.cpp
)

target_include_directories(zygisk_module PRIVATE
    src
    ${IMGUI_DIR}
    ${IMGUI_DIR}/backends
    third_party/zygisk
)

find_library(log-lib log)
find_library(android-lib android)
find_library(egl-lib EGL)
find_library(gles3-lib GLESv3)
find_library(osles-lib OpenSLES)
find_library(z-lib z)

target_link_libraries(zygisk_module
    ${log-lib}
    ${android-lib}
    ${egl-lib}
    ${gles3-lib}
    ${osles-lib}
    ${z-lib}
)

set_target_properties(zygisk_module PROPERTIES
    OUTPUT_NAME "zygisk_module"
)
