# libzygisk_module — reversed skeleton

Reconstruction of `libinternal.so` (SONAME `libzygisk_module.so`, ARM64, NDK r27b,
Dear ImGui 1.92.2b, Zygisk). See the reverse-engineering notes in the chat for
the disassembly evidence behind each piece. This is a faithful *architectural*
reconstruction, not a byte-identical decompile — a few pieces (the exact
config-file path/format, any actual il2cpp memory-hooking logic) weren't
recoverable from the stripped binary and are marked with `TODO` where guessed.

## What's confirmed vs. reconstructed

| Piece | Status |
|---|---|
| `JNI_OnLoad` magic-number (`1337`) gate | confirmed from disassembly (0x4ce38) |
| Background thread: `/proc/self/maps` walk + `dladdr` to find `libunity.so` base | confirmed (0x4c040) |
| String obfuscation scheme (`obfuscate.h`) | confirmed — algorithm recovered by emulating the decode loop against real bytes at 0x15ac8/0x159d0 |
| Dear ImGui 1.92.2b + `imgui_impl_android` + `imgui_impl_opengl3` | confirmed by embedded version string; vendored from upstream tag `v1.92.2b` |
| Anti-analysis checks (frida/substrate/riru) | confirmed present as string references; detection logic reconstructed |
| Local config/license gate (`config.cpp`) | shape confirmed (`fopen`+`sscanf("%lx %lx")`), exact path/semantics guessed |
| Embedded fonts (Verdana, Smallest Pixel-7) | **not included** — third-party font assets, not something to redistribute |
| Actual il2cpp/game memory hooking | **not included** — never observed in the disassembly that was analyzed |
| Official `zygisk_module_entry` export | the original binary does **not** have this; this project adds it so it's actually loadable as a real Zygisk module (see `src/zygisk_module.cpp`) |

## Build

Requires the Android NDK (this was built and verified against **r27b**,
matching the build stamp in the original binary's `.note.android.ident`).

```sh
export NDK=/path/to/android-ndk-r27b
cmake -B build -G Ninja \
  -DCMAKE_TOOLCHAIN_FILE=$NDK/build/cmake/android.toolchain.cmake \
  -DANDROID_ABI=arm64-v8a \
  -DANDROID_PLATFORM=android-26 \
  -DCMAKE_BUILD_TYPE=Release
cmake --build build -j$(nproc)
```

Produces `build/libzygisk_module.so` (arm64-v8a). Verified: builds cleanly,
exports both `JNI_OnLoad` and `zygisk_module_entry`, and links the exact same
NEEDED set (`liblog`, `libandroid`, `libEGL`, `libGLESv3`, `libOpenSLES`,
`libz`, `libm`, `libdl`, `libc`) as the original.

To match the original's stripped form:

```sh
$NDK/toolchains/llvm/prebuilt/linux-x86_64/bin/llvm-strip --strip-all build/libzygisk_module.so
```

## Layout

```
src/
  jni_bridge.cpp     JNI_OnLoad + the 1337 magic-number gate
  zygisk_entry.cpp   background thread: log, maps walk, dladdr, libunity.so lookup
  zygisk_module.cpp  real Zygisk entry (ModuleBase), eglSwapBuffers PLT hook
  anti_detect.cpp    frida/substrate/riru presence check
  config.cpp         local gate file (TODO: confirm real path/format)
  overlay.cpp        ImGui context + OpenGL3 backend glue
  obfuscate.h         compile-time string scrambler matching the recovered cipher
third_party/
  imgui/             vendored Dear ImGui v1.92.2b + backends (MIT)
  zygisk/            official Zygisk module API header (topjohnwu, MIT)
```
