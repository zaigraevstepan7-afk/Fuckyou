#pragma once

namespace zentry {

// Spawns the background payload thread (mirrors the pthread_create call
// found in the original JNI_OnLoad at 0x4ce9c, entry point at 0x4c040).
void start_thread();

} // namespace zentry
