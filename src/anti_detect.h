#pragma once

namespace anti_detect {

// Scans /proc/self/maps for loaded modules associated with common
// instrumentation/analysis tooling (frida-gadget, cydia substrate, riru).
// Mirrors the "frida"/"substrate"/"libriru" string references found in the
// original .rodata.
bool analysis_tools_present();

} // namespace anti_detect
