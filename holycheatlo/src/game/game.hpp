#pragma once

#include "../other/memory.hpp"
#include "../protect/oxorany.hpp"
#include "offsets.hpp"
#include <stdint.h>

struct matrix {
    float m11, m12, m13, m14;
    float m21, m22, m23, m24;
    float m31, m32, m33, m34;
    float m41, m42, m43, m44;
};

namespace offsets {
    inline uint64_t player_manager = oxorany(OFF_PLAYER_MANAGER);
}

namespace dyn {
    
    inline bool     direct     = true;
}

template<typename T = uint64_t>
inline T get_static(uint64_t type_offset) noexcept {
    if (proc::lib == 0) return 0;
    uint64_t cls = rpm<uint64_t>(proc::lib + type_offset);
    if (!cls) return 0;
    uint64_t obj = rpm<uint64_t>(cls + 0x60);
    if (!obj) return 0;
    uint64_t fields = rpm<uint64_t>(obj + 0x10);
    if (!fields) return 0;
    if (dyn::direct) return static_cast<T>(fields);
    return rpm<T>(fields);
}

template<typename T = uint64_t>
inline T get_static_indirect(uint64_t type_offset) noexcept {
    if (proc::lib == 0) return 0;
    uint64_t cls = rpm<uint64_t>(proc::lib + type_offset);
    if (!cls) return 0;
    uint64_t obj = rpm<uint64_t>(cls + 0x60);
    if (!obj) return 0;
    uint64_t fields = rpm<uint64_t>(obj + 0x10);
    if (!fields) return 0;
    return rpm<T>(fields);
}

inline bool likely_ptr_fast(uint64_t p) noexcept {
    return p > 0x10000ull && p < 0x0000FFFFFFFFFFFFull;
}

inline uint64_t get_player_manager() noexcept {
    const uint64_t candidates[] = {
        offsets::player_manager,
        static_cast<uint64_t>(oxorany(OFF_PLAYER_MANAGER_ALT1)),
        static_cast<uint64_t>(oxorany(OFF_PLAYER_MANAGER_ALT2))
    };

    for (uint64_t off : candidates) {
        if (!off) continue;

        uint64_t pm = get_static<uint64_t>(off);
        if (likely_ptr_fast(pm)) return pm;

        pm = get_static_indirect<uint64_t>(off);
        if (likely_ptr_fast(pm)) return pm;
    }

    return 0;
}
