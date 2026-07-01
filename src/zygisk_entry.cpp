// Reconstructed from the payload thread at file offset 0x4c040 in the
// original libzygisk_module.so:
//   1. log "zygisk entry started"
//   2. walk /proc/self/maps, dladdr() each region to resolve module names
//   3. locate the module whose path matches an (obfuscated) "libunity.so"
//   4. log "zygisk libunity base=%p"
//   5. run the local config/anti-detect gate before bringing up the overlay
//
// The maps-walking approach (rather than calling dlopen("libunity.so"))
// matches what's in the binary: it wants the base address of a module that
// is already loaded by the host process, not one it loads itself.

#include "zygisk_entry.h"
#include "obfuscate.h"
#include "anti_detect.h"
#include "config.h"
#include "overlay.h"

#include <android/log.h>
#include <dlfcn.h>
#include <pthread.h>
#include <cstdio>
#include <cstdlib>
#include <cstring>

#define LOG_TAG "zygisk_module"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

namespace zentry {

namespace {

OBF_DECL(k_libunity, "libunity.so", 0xc78cf373u, 0x25);

// Scans /proc/self/maps for a mapped path containing `needle`, resolves its
// load base via dladdr() on an address taken from within the mapped range.
void* find_module_base(const char* needle) {
    FILE* f = fopen("/proc/self/maps", "r");
    if (!f) return nullptr;

    char line[512];
    void* base = nullptr;
    while (fgets(line, sizeof(line), f)) {
        unsigned long start = 0, end = 0;
        if (sscanf(line, "%lx-%lx", &start, &end) != 2) continue;
        if (!strstr(line, needle)) continue;

        Dl_info info{};
        if (dladdr(reinterpret_cast<void*>(start), &info) && info.dli_fname &&
            strstr(info.dli_fname, needle)) {
            base = info.dli_fbase;
            break;
        }
    }
    fclose(f);
    return base;
}

void* entry_main(void*) {
    LOGD("zygisk entry started");

    const char* libunity = OBF_STR(k_libunity);
    void* base = find_module_base(libunity);
    LOGD("zygisk libunity base=%p", base);

    if (anti_detect::analysis_tools_present()) {
        // Original binary bails out silently when frida/substrate/riru is
        // detected in the process's own maps; we log instead of no-op'ing
        // silently so this is observable while you're testing the build.
        LOGD("analysis tooling detected, staying dormant");
        return nullptr;
    }

    if (!config::load_and_validate()) {
        LOGD("local config missing/invalid, staying dormant");
        return nullptr;
    }

    overlay::init();
    return nullptr;
}

} // namespace

void start_thread() {
    pthread_t t;
    pthread_create(&t, nullptr, entry_main, nullptr);
}

} // namespace zentry
