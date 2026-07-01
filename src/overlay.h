#pragma once

// Reconstructed ImGui overlay glue. The original binary links Dear ImGui
// 1.92.2b (confirmed by the embedded version string) with its official
// android + opengl3 backends and two baked-in fonts. This vendors the same
// upstream ImGui version and wires up context creation + the GLES3
// renderer backend; it does not reproduce the original's embedded fonts
// (Verdana and "Smallest Pixel-7" are third-party font assets, not
// something to redistribute here) or any game-specific memory-reading
// logic, since that wasn't recovered from the disassembly.

namespace overlay {

// Creates the ImGui context and the OpenGL3 renderer backend.
// Safe to call once; subsequent calls are no-ops.
void init();

// Call once per frame from inside a hooked present/swap function
// (see the eglSwapBuffers hook in zygisk_module.cpp).
void render_frame();

} // namespace overlay
