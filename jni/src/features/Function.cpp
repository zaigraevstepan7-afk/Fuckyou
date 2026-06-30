#include "../memory/memory.h"
#include "../dependencies/ANativeWindowCreator.h"
#include <cmath>
#include <cstdio>
#include <iostream>
#include "../dependencies/draw/draw.h"
#include "Function.h"
#include <map>
#include "../ui/common.h"
#include "../utils/entity/entities.h"
#include "../utils/entity/player.h"
#include "../utils/debug/debug_state.h"

Function::Function(uint64_t libunity_base) : libunity_base_(libunity_base) {}

template<typename T>
void set_prop(uint64_t player, const char* tag, T value) {
    uint64_t photon = memory_utils::read<uint64_t>(player + offsets::photon_player);
    uint64_t props = memory_utils::read<uint64_t>(photon + 0x38);
    if (props) {
        int size = memory_utils::read<int>(props + 0x20);
        constexpr int kMaxProps = 4096;
        if (size <= 0 || size > kMaxProps)
            return;
        uint64_t entries = memory_utils::read<uint64_t>(props + 0x18);
        if (!entries)
            return;
        for (int i = 0; i < size; i++) {
            uint64_t propkey = memory_utils::read<uint64_t>(entries + 0x28 + 0x18 * i);
            uint64_t propval = memory_utils::read<uint64_t>(entries + 0x30 + 0x18 * i);
            if (propkey != 0) {
                std::string keyVal = memory_utils::read<game_string>(propkey).get_string();
                if (keyVal == tag) {
                    memory_utils::write<T>(propval + 0x10, value);
                }
            }
        }
    }
}

void Function::Invisible()
{
    if (!vars::Function::invisible)
        return;

    uint64_t playermanager = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    if (!playermanager) return;

    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr1);
    if (!playermanager) return;

    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr2);
    if (!playermanager) return;

    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr3);
    if (!playermanager) return;

    player_manager manager(playermanager);
    uint64_t localPlayer = manager.get_local_player_base();
    if (!localPlayer) return;

    uint64_t weaponryController = memory_utils::read<uint64_t>(localPlayer + offsets::fields::weaponry_controller);
    if (!weaponryController) return;

    entity player_entity(localPlayer);
    std::string currentWeapon = player_entity.get_weapon_name().get_string();

    bool isKnife = (currentWeapon == "Knife" || currentWeapon == "Karambit" ||
                    currentWeapon == "Butterfly" || currentWeapon == "M9 Bayonet" ||
                    currentWeapon == "Kunai" || currentWeapon == "jKommando" ||
                    currentWeapon == "Scorpion" || currentWeapon == "Flip Knife" ||
                    currentWeapon == "Tanto" || currentWeapon == "Dual Daggers" ||
                    currentWeapon == "Kukri" || currentWeapon == "Stiletto" ||
                    currentWeapon == "Fang" || currentWeapon == "Sting");

    if (!isKnife) {
        memory_utils::write<int>(weaponryController + offsets::fields::weapon_invisibility, 10);
    }
}

void Function::Wallshot()
{
    if (!vars::Function::wallshot)
        return;

    uint64_t playermanager = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr1);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr2);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr3);
    if (!playermanager) return;

    player_manager manager(playermanager);
    uint64_t localPlayer = manager.get_local_player_base();
    if (!localPlayer) return;

    uint64_t weaponryController = memory_utils::read<uint64_t>(localPlayer + offsets::fields::weaponry_controller);
    if (!weaponryController) return;

    uint64_t weaponController = memory_utils::read<uint64_t>(weaponryController + offsets::fields::weapon_controller);
    if (!weaponController) return;

    memory_utils::write<bool>(weaponController + 0x218, false);
    memory_utils::write<float>(weaponController + 0x21C, 1000.0f);

    uint64_t gun_params = memory_utils::read<uint64_t>(weaponController + offsets::fields::gun_parameters);
    if (gun_params) {
        memory_utils::write<float>(gun_params + offsets::fields::weaponParams_armorPenetration, 9999.0f); // _armorPenetration
        memory_utils::write<int>(gun_params + offsets::fields::weaponParams_penetrationPower, 9999);      // _penetrationPower
        memory_utils::write<float>(gun_params + offsets::fields::weaponParams_armorPenetrationSafe, 9999.0f); // _armorPenetrationSafe.value
        memory_utils::write<int>(gun_params + offsets::fields::weaponParams_penetrationPowerSafe, 9999);      // _penetrationPowerSafe.value
    }
}

void Function::DamageHack()
{
    if (!vars::Function::damage_hack)
        return;

    uint64_t playermanager = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr1);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr2);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr3);
    if (!playermanager) return;

    player_manager manager(playermanager);
    uint64_t localPlayer = manager.get_local_player_base();
    if (!localPlayer) return;

    uint64_t weaponryController = memory_utils::read<uint64_t>(localPlayer + offsets::fields::weaponry_controller);
    if (!weaponryController) return;

    uint64_t weaponController = memory_utils::read<uint64_t>(weaponryController + offsets::fields::weapon_controller);
    if (!weaponController) return;

    uint64_t weaponParameters = memory_utils::read<uint64_t>(weaponController + offsets::fields::weapon_parameters);
    if (!weaponParameters) return;

    entity player_entity(localPlayer);
    std::string currentWeapon = player_entity.get_weapon_name().get_string();
    
    bool isKnife = (currentWeapon == "Knife" || currentWeapon == "Karambit" ||
                    currentWeapon == "Butterfly" || currentWeapon == "M9 Bayonet" ||
                    currentWeapon == "Kunai" || currentWeapon == "jKommando" ||
                    currentWeapon == "Scorpion" || currentWeapon == "Flip Knife" ||
                    currentWeapon == "Tanto" || currentWeapon == "Dual Daggers" ||
                    currentWeapon == "Kukri" || currentWeapon == "Stiletto" ||
                    currentWeapon == "Fang" || currentWeapon == "Sting");

    if (!isKnife) {
        uint64_t damage = memory_utils::read<uint64_t>(weaponParameters + offsets::fields::damage_struct);
        if (damage) {
            int newDamage = 9999;
            // private int _headDamage; // 0x10
            memory_utils::write<int>(damage + offsets::fields::damage_struct_headDamage, newDamage);
            // private int _chestAndArmsDamage; // 0x14
            memory_utils::write<int>(damage + offsets::fields::damage_struct_chestAndArmsDamage, newDamage);
            // private int _stomachDamage; // 0x18
            memory_utils::write<int>(damage + offsets::fields::damage_struct_stomachDamage, newDamage);
            // private int _legsDamage; // 0x1C
            memory_utils::write<int>(damage + offsets::fields::damage_struct_legsDamage, newDamage);
        }
    }
}


void Function::RCS()
{
    if (!vars::Function::rcs)
        return;

    uint64_t playermanager = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr1);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr2);
    if (!playermanager) return;
    playermanager = memory_utils::read<uint64_t>(playermanager + offsets::fields::PlayerManager_ptr3);
    if (!playermanager) return;

    player_manager manager(playermanager);
    uint64_t localPlayer = manager.get_local_player_base();
    if (!localPlayer) return;

    uint64_t weaponryController = memory_utils::read<uint64_t>(localPlayer + offsets::fields::weaponry_controller);
    if (!weaponryController) return;

    uint64_t weaponController = memory_utils::read<uint64_t>(weaponryController + offsets::fields::weapon_controller);
    if (!weaponController) return;

    uint64_t weaponParameters = memory_utils::read<uint64_t>(weaponController + offsets::fields::weapon_parameters);
    if (!weaponParameters) return;

    entity player_entity(localPlayer);
    std::string currentWeapon = player_entity.get_weapon_name().get_string();
    bool isKnife = (currentWeapon == "Knife" || currentWeapon == "Karambit" ||
                    currentWeapon == "Butterfly" || currentWeapon == "M9 Bayonet" ||
                    currentWeapon == "Kunai" || currentWeapon == "jKommando" ||
                    currentWeapon == "Scorpion" || currentWeapon == "Flip Knife" ||
                    currentWeapon == "Tanto" || currentWeapon == "Dual Daggers" ||
                    currentWeapon == "Kukri" || currentWeapon == "Stiletto" ||
                    currentWeapon == "Fang" || currentWeapon == "Sting");
    int weaponId = memory_utils::read<int>(weaponParameters + offsets::fields::weapon_id);
    bool isGrenade = (weaponId >= 91 && weaponId <= 99);
    if (isKnife || isGrenade) return;

    uint64_t accuracy = memory_utils::read<uint64_t>(weaponController + offsets::fields::accuracy_data);
    if (!accuracy) return;

    auto write_if_valid = [](uint64_t addr, float value) {
        if (memory_utils::is_address_valid(addr)) {
            memory_utils::write<float>(addr, value);
        }
    };

    write_if_valid(accuracy + 0x10, vars::Function::rcs_value);
    write_if_valid(accuracy + 0x14, vars::Function::rcs_value);
    write_if_valid(weaponController + offsets::fields::rcs_anglePtr, vars::Function::rcs_value);
    write_if_valid(weaponController + offsets::fields::rcs_anglePtr + 4, vars::Function::rcs_value);
    write_if_valid(weaponController + offsets::fields::rcs_anglePtr + 8, vars::Function::rcs_value);
}
