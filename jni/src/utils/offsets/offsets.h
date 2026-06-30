#pragma once
#include <cstdint>

//==============================================================================
//  Standoff 2  (v0.39.1)  -  Offsets
//  Source: dump.cs (IL2CPP)  ->  offsets.txt
//
//  Legend:
//    [DUMP] - confirmed straight from the v0.39.1 class dump (offsets.txt)
//    [PTRN] - derived from the cheat's own access pattern (stable across builds)
//    [VRFY] - NOT present in the class dump, keep best-known value and
//             re-check in-game for v0.39.1 before trusting it.
//==============================================================================

namespace offsets
{
    // PlayerController + 0x160 -> local PhotonPlayer            [DUMP] (line 117)
    // Used by Function::set_prop(player + photon_player).
    inline constexpr uint64_t photon_player = 0x160;

    //--------------------------------------------------------------------------
    //  Static (RVA) addresses.
    //  These are libunity_base-relative RVAs to IL2CPP static metadata and are
    //  NOT part of the instance-layout dump in offsets.txt. They must be pulled
    //  from the libil2cpp.so / global-metadata of the v0.39.1 build.
    //  Left at 0 on purpose: every feature null-checks the resulting pointer,
    //  so the cheat stays inert (no crash) until these are filled in.
    //--------------------------------------------------------------------------
    namespace adresses
    {
        inline constexpr uint64_t player_manager       = 0x0; // [VRFY] RVA -> PlayerManager static class
        inline constexpr uint64_t bomb_manager         = 0x0; // [VRFY] RVA -> BombManager TypeInfo
        inline constexpr uint64_t boltinventoryservice = 0x0; // [VRFY] RVA -> InventoryManager static class
    }

    namespace fields
    {
        //----------------------------------------------------------------------
        //  IL2CPP singleton traversal for PlayerManager.
        //  root = read(base + adresses::player_manager)
        //  l1   = read(root + ptr1)   // static_fields
        //  l2   = read(l1   + ptr2)   // singleton instance
        //  mgr  = read(l2   + ptr3)   // manager field
        //  (Not in the class dump - matches the IL2CPP layout used elsewhere.)
        //----------------------------------------------------------------------
        inline constexpr uint64_t PlayerManager_ptr1 = 0xB8; // [PTRN] il2cpp static_fields
        inline constexpr uint64_t PlayerManager_ptr2 = 0x0;  // [PTRN] singleton instance
        inline constexpr uint64_t PlayerManager_ptr3 = 0x0;  // [VRFY] manager field

        //----------------------------------------------------------------------
        //  PlayerController            (dump #5, line 20556)
        //----------------------------------------------------------------------
        inline constexpr uint64_t player_main_camera_holder   = 0x28;  // [DUMP] _mainCameraHolder
        inline constexpr uint64_t aim_controller              = 0x80;  // [DUMP] AimController*
        inline constexpr uint64_t weaponry_controller         = 0x88;  // [DUMP] WeaponryController*
        inline constexpr uint64_t player_occlusion_controller = 0xB8;  // [DUMP] PlayerOcclusionController*
        inline constexpr uint64_t player_main_camera          = 0xE8;  // [DUMP] PlayerMainCamera
        inline constexpr uint64_t player_character_view       = 0x50;  // [DUMP] PlayerCharacterView (view holding BipedMap)

        //----------------------------------------------------------------------
        //  AimController               (dump #13, line 26946)
        //----------------------------------------------------------------------
        inline constexpr uint64_t aiming_data = 0x90; // [DUMP] aimingData (view angles at +0x18/0x1C, shot at +0x24/0x28)

        //----------------------------------------------------------------------
        //  WeaponryController          (dump #10, line 21813)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_controller   = 0xA0; // [DUMP] current WeaponController*
        inline constexpr uint64_t weapon_invisibility = 0x88; // [DUMP] current-slot byte (writing an invalid slot hides the weapon)

        //----------------------------------------------------------------------
        //  WeaponController            (dump #11, line 48345)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_parameters = 0xA8; // [DUMP] WeaponParameters
        inline constexpr uint64_t gun_parameters    = 0xA8; // [DUMP] WeaponParameters (penetration block lives here)

        //----------------------------------------------------------------------
        //  PlayerCharacterView -> BipedMap
        //----------------------------------------------------------------------
        inline constexpr uint64_t pbipedmap = 0x30; // [VRFY] BipedMap pointer inside PlayerCharacterView

        //----------------------------------------------------------------------
        //  WeaponParameters sub-fields  (WeaponParameters class not expanded in dump)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_id     = 0x10; // [VRFY] weapon id (knife/grenade detection)
        inline constexpr uint64_t damage_struct = 0x18; // [VRFY] -> damage block

        // Damage block sub-fields (layout documented in Function::DamageHack)
        inline constexpr uint64_t damage_struct_headDamage         = 0x10; // [PTRN] _headDamage
        inline constexpr uint64_t damage_struct_chestAndArmsDamage = 0x14; // [PTRN] _chestAndArmsDamage
        inline constexpr uint64_t damage_struct_stomachDamage      = 0x18; // [PTRN] _stomachDamage
        inline constexpr uint64_t damage_struct_legsDamage         = 0x1C; // [PTRN] _legsDamage

        // Penetration / wallshot fields inside WeaponParameters
        inline constexpr uint64_t weaponParams_armorPenetration     = 0x10; // [VRFY] _armorPenetration
        inline constexpr uint64_t weaponParams_penetrationPower     = 0x14; // [VRFY] _penetrationPower
        inline constexpr uint64_t weaponParams_armorPenetrationSafe = 0x18; // [VRFY] _armorPenetrationSafe.value
        inline constexpr uint64_t weaponParams_penetrationPowerSafe = 0x1C; // [VRFY] _penetrationPowerSafe.value

        //----------------------------------------------------------------------
        //  Recoil / accuracy (RCS)
        //----------------------------------------------------------------------
        inline constexpr uint64_t accuracy_data = 0xB0;  // [VRFY] WeaponController -> accuracy/recoil data
        inline constexpr uint64_t rcs_anglePtr  = 0x1F0; // [VRFY] recoil angle floats (x,y,z at +0/+4/+8)

        //----------------------------------------------------------------------
        //  Planted bomb (esp_renderer::draw_bomb)
        //----------------------------------------------------------------------
        inline constexpr uint64_t plantedBombController     = 0xA8; // [PTRN] PlantedBombController*
        inline constexpr uint64_t plantedBombTransform      = 0x38; // [DUMP] Transform (Controller +0x38)
        inline constexpr uint64_t bombParameters            = 0x40; // [VRFY] BombParameters*
        inline constexpr uint64_t bombDetonationDuration    = 0x30; // [VRFY] BombParameters._detonationDuration
        inline constexpr uint64_t bombElapsedTime           = 0x48; // [VRFY] elapsed time

        //----------------------------------------------------------------------
        //  InventoryManager singleton (SkinChanger) - derived from access pattern
        //----------------------------------------------------------------------
        inline constexpr uint64_t InventoryManager               = 0x58; // [PTRN] singleton class
        inline constexpr uint64_t InventoryManager_static_fields = 0xB8; // [PTRN] static_fields
    }
}
