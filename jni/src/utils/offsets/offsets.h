#pragma once
#include <cstdint>

//==============================================================================
//  Standoff 2  (v0.39.1, x64)  -  Offsets
//  Source: dump.cs + script.json  (IL2CPP, clawclouds dump)
//
//  Legend:
//    [DUMP] - taken straight from the v0.39.1 dump (class layout / script.json)
//    [PTRN] - derived from the cheat's own access pattern
//    [VRFY] - best-known value, re-check in-game (not pinned by the dump alone)
//==============================================================================

namespace offsets
{
    // PlayerController + 0x160 -> local PhotonPlayer          [DUMP] PlayerController:0x160
    inline constexpr uint64_t photon_player = 0x160;

    //--------------------------------------------------------------------------
    //  Static (RVA) addresses - libil2cpp base-relative TypeInfo slots
    //  (script.json -> ScriptMetadata "*_TypeInfo").
    //  read(libil2cpp_base + addr) -> Il2CppClass*.
    //--------------------------------------------------------------------------
    namespace adresses
    {
        inline constexpr uint64_t player_manager       = 0xAA181F8; // [DUMP] PlayerManager_TypeInfo
        inline constexpr uint64_t bomb_manager         = 0xAA09DB8; // [DUMP] BombManager_TypeInfo
        inline constexpr uint64_t boltinventoryservice = 0xAA160D0; // [DUMP] InventoryManager_TypeInfo
    }

    namespace fields
    {
        //----------------------------------------------------------------------
        //  PlayerManager singleton chain.
        //  PlayerManager : LazySingleton<PlayerManager>.
        //  root  = read(base + adresses::player_manager)  // Il2CppClass*
        //  l1    = read(root + ptr1)                       // static_fields (Il2CppClass+0xB8)
        //  l2    = read(l1   + ptr2)                       // singleton instance (static_fields+0x0)
        //  mgr   = read(l2   + ptr3)                       // -> wrapper base
        //
        //  PlayerManager instance layout (dump #, line 21111):
        //    +0x28  Dictionary<int, PlayerController>  (all players by actorId)
        //    +0x38  HashSet<PlayerController>
        //    +0x68  PlayerController  (internal local)
        //    +0x70  PlayerController  (public local)
        //  -> If your entities.cpp wrapper expects the PlayerManager instance,
        //     keep ptr3 = 0x0 (mgr == instance). If it expects the players
        //     dictionary, set ptr3 = 0x28.  [VRFY against entities.cpp]
        //----------------------------------------------------------------------
        inline constexpr uint64_t PlayerManager_ptr1 = 0xB8; // [DUMP] Il2CppClass.static_fields
        inline constexpr uint64_t PlayerManager_ptr2 = 0x0;  // [DUMP] LazySingleton instance
        inline constexpr uint64_t PlayerManager_ptr3 = 0x0;  // [VRFY] wrapper base (see note above)

        //----------------------------------------------------------------------
        //  PlayerController            (dump #5, line 20556)
        //    +0x7C float Health, +0x79 byte Team (for reference)
        //----------------------------------------------------------------------
        inline constexpr uint64_t player_main_camera_holder   = 0x28;  // [DUMP] _mainCameraHolder
        inline constexpr uint64_t aim_controller              = 0x80;  // [DUMP] AimController*
        inline constexpr uint64_t weaponry_controller         = 0x88;  // [DUMP] WeaponryController*
        inline constexpr uint64_t player_occlusion_controller = 0xB8;  // [DUMP] PlayerOcclusionController*
        inline constexpr uint64_t player_main_camera          = 0xE8;  // [DUMP] PlayerMainCamera
        inline constexpr uint64_t player_character_view       = 0x50;  // [VRFY] PlayerCharacterView (also @0x48 / @0xD0)

        //----------------------------------------------------------------------
        //  AimController              (dump #13, line 26946)
        //  aimingData struct: view pitch/yaw @ +0x18/+0x1C, shot @ +0x24/+0x28
        //----------------------------------------------------------------------
        inline constexpr uint64_t aiming_data = 0x90; // [DUMP] aimingData

        //----------------------------------------------------------------------
        //  WeaponryController         (dump #10, line 21813)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_controller   = 0xA0; // [DUMP] current WeaponController*
        inline constexpr uint64_t weapon_invisibility = 0x88; // [DUMP] current-slot byte (invalid slot hides weapon)

        //----------------------------------------------------------------------
        //  WeaponController          (dump #11, line 48345)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_parameters = 0xA8; // [DUMP] WeaponParameters (GunParameters for guns)
        inline constexpr uint64_t gun_parameters    = 0xA8; // [DUMP] same block
        inline constexpr uint64_t accuracy_data     = 0xB0; // [VRFY] WeaponController -> accuracy/recoil data
        inline constexpr uint64_t rcs_anglePtr      = 0x30; // [VRFY] recoil angle vector (x,y,z @ +0/+4/+8)

        //----------------------------------------------------------------------
        //  PlayerCharacterView -> BipedMap   (line 20516)
        //----------------------------------------------------------------------
        inline constexpr uint64_t pbipedmap = 0x48; // [DUMP] BipedMap inside PlayerCharacterView

        //----------------------------------------------------------------------
        //  InventoryParameters / GunParameters / Damage
        //    InventoryParameters._id (enum int)        @ 0x18  (line 47885)
        //    GunParameters._damage (Damage*)           @ 0x140 (line 51206)
        //    GunParameters._armorPenetration (float)   @ 0x1A0
        //    GunParameters._penetrationPower (int)     @ 0x1A4
        //    Damage._headDamage/_chest/_stomach/_legs  @ 0x10/0x14/0x18/0x1C (line 47677)
        //----------------------------------------------------------------------
        inline constexpr uint64_t weapon_id     = 0x18;  // [DUMP] InventoryParameters._id
        inline constexpr uint64_t damage_struct = 0x140; // [DUMP] GunParameters._damage

        inline constexpr uint64_t damage_struct_headDamage         = 0x10; // [DUMP] _headDamage
        inline constexpr uint64_t damage_struct_chestAndArmsDamage = 0x14; // [DUMP] _chestAndArmsDamage
        inline constexpr uint64_t damage_struct_stomachDamage      = 0x18; // [DUMP] _stomachDamage
        inline constexpr uint64_t damage_struct_legsDamage         = 0x1C; // [DUMP] _legsDamage

        inline constexpr uint64_t weaponParams_armorPenetration     = 0x1A0; // [DUMP] _armorPenetration
        inline constexpr uint64_t weaponParams_penetrationPower     = 0x1A4; // [DUMP] _penetrationPower
        inline constexpr uint64_t weaponParams_armorPenetrationSafe = 0x258; // [DUMP] Nullable<SafeFloat> (VERIFY .value)
        inline constexpr uint64_t weaponParams_penetrationPowerSafe = 0x264; // [DUMP] Nullable<SafeInt> (VERIFY .value)

        //----------------------------------------------------------------------
        //  Bomb
        //    BombManager instance.PlantedBombController       @ 0xA8 (line 52904)
        //    PlantedBombController.BombParameters             @ 0x20 (line 53514)
        //    PlantedBombController.Transform                  @ 0x38
        //    PlantedBombController elapsed (float)            @ 0x48
        //    BombParameters._detonationDuration (float)       @ 0x114 (line 53164)
        //----------------------------------------------------------------------
        inline constexpr uint64_t plantedBombController  = 0xA8;  // [DUMP]
        inline constexpr uint64_t plantedBombTransform   = 0x38;  // [DUMP]
        inline constexpr uint64_t bombParameters         = 0x20;  // [DUMP]
        inline constexpr uint64_t bombDetonationDuration = 0x114; // [DUMP]
        inline constexpr uint64_t bombElapsedTime        = 0x48;  // [DUMP]

        //----------------------------------------------------------------------
        //  InventoryManager singleton (SkinChanger)
        //----------------------------------------------------------------------
        inline constexpr uint64_t InventoryManager               = 0x58; // [PTRN] singleton class
        inline constexpr uint64_t InventoryManager_static_fields = 0xB8; // [PTRN] static_fields
    }
}
