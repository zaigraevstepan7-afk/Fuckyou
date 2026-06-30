#include "inf_ammo.hpp"
#include "../game/game.hpp"
#include "../ui/cfg.hpp"
#include "../protect/oxorany.hpp"
#include <algorithm>
#include <vector>

namespace {
    static constexpr uint64_t kOffPlayerManagerStaticLegacy = OFF_PLAYER_MANAGER_ALT2;
    static constexpr uint64_t kOffPlayerManagerLocalPlayer = OFF_PM_LOCAL_PLAYER;
    static constexpr uint64_t kOffPlayerWeaponryController = OFF_PLAYER_WEAPON_ROOT;
    static constexpr uint64_t kOffWeaponryCurrentWeapon = OFF_WRC_ACTIVE_WEAPON;
    static constexpr uint64_t kOffWeaponWeaponParameters = OFF_WC_WEAPON_PARAMETERS;
    static constexpr uint64_t kOffWeaponParametersAmmunition = OFF_WP_AMMUNITION;

    // Ammunition fields (v0.39.1)
    static constexpr uint64_t kOffAmmoMagazineCapacity = OFF_AMMO_MAGAZINE_CAP;
    static constexpr uint64_t kOffAmmoCapacity = OFF_AMMO_CAP;
    static constexpr uint64_t kOffAmmoMagazineCapacitySafe = OFF_AMMO_MAGAZINE_CAP_SAFE;
    static constexpr uint64_t kOffAmmoCapacitySafe = OFF_AMMO_CAP_SAFE;

    struct SafeIntMem {
        int salt;
        int value;
    };

    struct NullableSafeIntMem {
        uint8_t has_value;
        uint8_t pad[3];
        SafeIntMem value;
    };

    static bool likely_ptr(uint64_t p) {
        return p > 0x10000ull && p < 0x0000FFFFFFFFFFFFull;
    }

    static void add_unique(std::vector<uint64_t>& out, uint64_t p) {
        if (!likely_ptr(p)) return;
        for (uint64_t v : out) {
            if (v == p) return;
        }
        out.push_back(p);
    }

    static bool write_nullable_safe_int(uint64_t addr, int value) {
        if (!addr) return false;

        NullableSafeIntMem v{};
        if (!mem_read(addr, &v, sizeof(v))) return false;
        v.has_value = 1;
        v.value.salt = 0;
        v.value.value = value;
        return mem_write(addr, &v, sizeof(v));
    }

    static std::vector<uint64_t> collect_weapon_params() {
        std::vector<uint64_t> out;

        uint64_t player_manager = get_player_manager();
        if (!player_manager) {
            player_manager = get_static<uint64_t>(oxorany(kOffPlayerManagerStaticLegacy));
        }
        if (!player_manager) return out;

        uint64_t local_player = rpm<uint64_t>(player_manager + oxorany(kOffPlayerManagerLocalPlayer));
        if (!likely_ptr(local_player)) return out;

        std::vector<uint64_t> weaponry_list;
        add_unique(weaponry_list, rpm<uint64_t>(local_player + oxorany(kOffPlayerWeaponryController)));

        for (uint64_t weaponry : weaponry_list) {
            std::vector<uint64_t> weapon_list;
            add_unique(weapon_list, rpm<uint64_t>(weaponry + oxorany(kOffWeaponryCurrentWeapon)));

            for (uint64_t weapon : weapon_list) {
                add_unique(out, rpm<uint64_t>(weapon + oxorany(kOffWeaponWeaponParameters)));
            }
        }

        return out;
    }

    static void patch_ammo(uint64_t ammo, short value) {
        if (!likely_ptr(ammo)) return;

        wpm<short>(ammo + oxorany(kOffAmmoMagazineCapacity), value);
        wpm<short>(ammo + oxorany(kOffAmmoCapacity), value);
        write_nullable_safe_int(ammo + oxorany(kOffAmmoMagazineCapacitySafe), value);
        write_nullable_safe_int(ammo + oxorany(kOffAmmoCapacitySafe), value);
    }
}

void inf_ammo::run() {
    if (!cfg::inf_ammo::enabled) return;

    int clamped = std::clamp(cfg::inf_ammo::value, 100, 30000);
    short value = static_cast<short>(clamped);

    auto params_list = collect_weapon_params();
    for (uint64_t params : params_list) {
        uint64_t ammo = rpm<uint64_t>(params + oxorany(kOffWeaponParametersAmmunition));
        if (!likely_ptr(ammo)) continue;
        patch_ammo(ammo, value);
    }
}
