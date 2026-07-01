#include "config.h"

#include <android/log.h>
#include <cstdio>
#include <ctime>

#define LOG_TAG "zygisk_module"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)

namespace config {

namespace {
// TODO: replace with the real path from your source tree.
constexpr const char* kConfigPath = "/data/local/tmp/.zygisk_module.cfg";
} // namespace

bool load_and_validate() {
    FILE* f = fopen(kConfigPath, "r");
    if (!f) {
        LOGD("config: %s not found", kConfigPath);
        return false;
    }

    char line[512];
    bool ok = false;
    unsigned long lo = 0, hi = 0;
    while (fgets(line, sizeof(line), f)) {
        if (sscanf(line, "%lx %lx", &lo, &hi) != 2) continue;
        unsigned long now = static_cast<unsigned long>(time(nullptr));
        if (now >= lo && now <= hi) {
            ok = true;
            break;
        }
    }
    fclose(f);
    return ok;
}

} // namespace config
