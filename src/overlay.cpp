#include "overlay.h"

#include "imgui.h"
#include "imgui_impl_opengl3.h"

#include <GLES3/gl3.h>
#include <mutex>

namespace overlay {

namespace {
bool g_init = false;
std::mutex g_mutex;
} // namespace

void init() {
    std::lock_guard<std::mutex> lock(g_mutex);
    if (g_init) return;

    IMGUI_CHECKVERSION();
    ImGui::CreateContext();
    ImGuiIO& io = ImGui::GetIO();
    io.ConfigFlags |= ImGuiConfigFlags_NoMouseCursorChange;

    ImGui_ImplOpenGL3_Init("#version 300 es");
    g_init = true;
}

void render_frame() {
    if (!g_init) return;

    GLint viewport[4];
    glGetIntegerv(GL_VIEWPORT, viewport);

    ImGuiIO& io = ImGui::GetIO();
    io.DisplaySize = ImVec2(static_cast<float>(viewport[2]), static_cast<float>(viewport[3]));
    io.DeltaTime = 1.0f / 60.0f;

    ImGui_ImplOpenGL3_NewFrame();
    ImGui::NewFrame();

    ImGui::Begin("zygisk_module (reconstructed)");
    ImGui::Text("Reversed overlay skeleton - fill in real menu contents here.");
    ImGui::End();

    ImGui::Render();
    ImGui_ImplOpenGL3_RenderDrawData(ImGui::GetDrawData());
}

} // namespace overlay
