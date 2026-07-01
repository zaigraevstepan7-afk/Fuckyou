#include "anti_detect.h"
#include "obfuscate.h"

#include <cstdio>
#include <cstring>

namespace anti_detect {

namespace {

OBF_DECL(k_frida, "frida", 0x9e3779b9u, 0x11);
OBF_DECL(k_substrate, "substrate", 0x85ebca6bu, 0x2f);
OBF_DECL(k_riru, "libriru", 0xc2b2ae35u, 0x07);

bool maps_contain(const char* needle) {
    FILE* f = fopen("/proc/self/maps", "r");
    if (!f) return false;
    char line[512];
    bool found = false;
    while (fgets(line, sizeof(line), f)) {
        if (strstr(line, needle)) { found = true; break; }
    }
    fclose(f);
    return found;
}

} // namespace

bool analysis_tools_present() {
    return maps_contain(OBF_STR(k_frida)) ||
           maps_contain(OBF_STR(k_substrate)) ||
           maps_contain(OBF_STR(k_riru));
}

} // namespace anti_detect
