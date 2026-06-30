#pragma once

// ============================================================================
//  OFFSETS — Standoff 2 (v0.39.1) — arm64-v8a / IL2CPP
//  Source: dump.cs + offsets.txt (FREECAMK) + Delexium offset table.
//  Единый источник оффсетов для проекта. Меняй только этот файл.
// ============================================================================

#include <stdint.h>

// ── Static type offset (get_static) ─────────────────────────────────────────
// Значение указателя на PlayerManager меняется от версии к версии.
// v0.39.1 -> 178356728 (актуальный). Остальные оставлены как fallback.
#define OFF_PLAYER_MANAGER          178356728ULL   // v0.39.1
#define OFF_PLAYER_MANAGER_ALT1     153868920ULL   // v0.38.2 (fallback)
#define OFF_PLAYER_MANAGER_ALT2     132435632ULL   // legacy  (fallback)

// ── PlayerManager fields ─────────────────────────────────────────────────────
#define OFF_PM_LOCAL_PLAYER         0x70
#define OFF_PM_PLAYER_LIST          0x28

// ── List<T> (Il2Cpp) fields ──────────────────────────────────────────────────
#define OFF_LIST_COUNT              0x20
#define OFF_LIST_BUFFER             0x18
#define OFF_LIST_ENTRY_BASE         0x30
#define OFF_LIST_ENTRY_STRIDE       0x18

// ── PlayerController fields (dump.cs line 20556) ─────────────────────────────
#define OFF_PLAYER_HEALTH           0x7C   // float  Health (прямое HP)
#define OFF_PLAYER_TEAM             0x79   // byte   команда (T/CT/Spec)
#define OFF_PLAYER_AIM_CONTROLLER   0x80   // AimController*
#define OFF_PLAYER_WEAPON_ROOT      0x88   // WeaponryController*
#define OFF_PLAYER_MECANIM_CTRL     0x90   // MecanimController*
#define OFF_PLAYER_MOVEMENT_CTRL    0x98   // MovementController*
#define OFF_PLAYER_ARMS_ANIM_CTRL   0xA0   // ArmsAnimationController*
#define OFF_PLAYER_HIT_CONTROLLER   0xA8   // PlayerHitController*
#define OFF_PLAYER_MATERIAL_CTRL    0xB0   // PlayerMaterialController*
#define OFF_PLAYER_OCCLUSION        0xB8   // PlayerOcclusionController*
#define OFF_PLAYER_NETWORK_CTRL     0xC0   // NetworkController*
#define OFF_PLAYER_SOUND_CTRL       0xE0   // PlayerSoundController*
#define OFF_PLAYER_MAIN_CAMERA      0xE8   // PlayerMainCamera*
#define OFF_PLAYER_FPS_CAMERA       0xF0   // PlayerFPSCamera*
#define OFF_PLAYER_PHOTON_PTR       0x160  // PhotonPlayer* (локальный PhotonPlayer)

// ── View / Skeleton (PlayerCharacterView) ────────────────────────────────────
#define OFF_PLAYER_VIEW_1           0x48   // PlayerCharacterView*
#define OFF_PLAYER_VIEW_2           0x50   // PlayerCharacterView*
#define OFF_VIEW_BIPED_MAP          0x48   // View -> BipedMap*

// ── Controller base (dump.cs line 20170) ─────────────────────────────────────
#define OFF_CTRL_OWNER_PHOTON       0x40   // PhotonPlayer* (владелец контроллера)

// ── PhotonPlayer fields (dump.cs line 557863) ────────────────────────────────
#define OFF_PHOTON_ACTOR_ID         0x18   // int    actorID
#define OFF_PHOTON_NAME             0x20   // string никнейм
#define OFF_PHOTON_PROPS_REG        0x38   // Hashtable CustomProperties

// ── PropertiesRegistry / Hashtable ───────────────────────────────────────────
#define OFF_PROPS_COUNT             0x20
#define OFF_PROPS_LIST              0x18
#define OFF_PROPS_KEY_BASE          0x28
#define OFF_PROPS_VAL_BASE          0x30
#define OFF_PROPS_VALUE_DATA        0x10

// ── PlayerHitController (dump.cs line 26361) ─────────────────────────────────
#define OFF_HIT_SOURCE_PHOTON       0xD0   // PhotonPlayer* (источник последнего урона)
#define OFF_HIT_LOCAL_TIME          0x100  // float  LocalTime

// ── MovementController (dump.cs line 24407) ──────────────────────────────────
#define OFF_MC_TRANSFORM_DATA       0xB0   // translationData*
#define OFF_TD_POSITION             0x44   // vec3 позиция

// ── Movement extras (Delexium — bunnyhop / airstrafe / crouch) ───────────────
#define OFF_MC_TRAJECTORY           0xA8   // MovementController -> TrajectoryPredictor*
#define OFF_MC_THRUST_DATA          0xB0   // MovementController -> ThrustData*
#define OFF_TP_JUMP_PARAMS          0x50   // TrajectoryPredictor -> JumpParams*
#define OFF_TP_CROUCH_PARAMS        0x48   // TrajectoryPredictor -> CrouchParams*
#define OFF_JP_JUMP_SPEED           0x10   // float — bunnyhop
#define OFF_JP_JUMP_SPEED2          0x60   // float — bunnyhop + airstrafe
#define OFF_CP_SPEED_MULT           0x10   // float
#define OFF_CP_SPEED_MULT2          0x14   // float
#define OFF_TD_THRUST_VEC           0x68   // vec3 — airstrafe

// ── AimController / AimingData (dump.cs line 26946) ──────────────────────────
#define OFF_AIM_CONTROLLER_DATA     0x90   // AimController -> AimingData*
#define OFF_AIMDATA_PITCH           0x18   // float pitch
#define OFF_AIMDATA_YAW             0x1C   // float yaw
#define OFF_AIMDATA_PITCH_YAW_VEC3  0x18   // vec3  pitch/yaw/roll
#define OFF_AIMDATA_SECOND_VEC3     0x24   // vec3  secondary

// ── Camera system ─────────────────────────────────────────────────────────────
#define OFF_CAM_TRANSFORM           0x20   // PlayerMainCamera -> CameraTransform
#define OFF_CAM_TRANSFORM_MATRIX    0x10   // -> matrix holder
#define OFF_CAM_MATRIX_DATA         0x100  // -> view matrix (Holy)
#define OFF_PLAYER_MAIN_CAM_DATA    0x40   // PlayerMainCamera -> CameraData*
#define OFF_CAM_MOVEMENT_CTRL       0xA0   // CameraData -> MovementController*
#define OFF_CAM_NATIVE              0x10   // -> NativeCamera*
#define OFF_NATIVE_CAM_ASPECT       0x4F0  // float aspectRatio
#define OFF_NATIVE_CAM_FOV_FIELD    0x180  // float fieldOfView

// ── Occlusion / visibility ────────────────────────────────────────────────────
#define OFF_OCCLUSION_CURRENT       0x34   // int currentState
#define OFF_OCCLUSION_NEXT          0x38   // int nextState

// ── Bone offsets (from BipedMap) ──────────────────────────────────────────────
#define OFF_BONE_HEAD_1             0x28
#define OFF_BONE_HEAD_2             0x20
#define OFF_BONE_CHEST_1            0x40
#define OFF_BONE_CHEST_2            0x38
#define OFF_BONE_CHEST_3            0x30
#define OFF_BONE_CHEST_4            0x88
#define OFF_BONE_FOOT_LEFT          0x98
#define OFF_BONE_FOOT_RIGHT         0xB8
#define OFF_BONE_SPINE_1            0x88
#define OFF_BONE_SPINE_2            0x90
#define OFF_BONE_SPINE_3            0xB0

// ── Transform system ──────────────────────────────────────────────────────────
#define OFF_TRANSFORM_NATIVE        0x10
#define OFF_NATIVE_TRANSFORM_DATA   0x38
#define OFF_NATIVE_TRANSFORM_INDEX  0x40
#define OFF_NATIVE_TRANSFORM_DIRECT 0x90
#define OFF_TRANSFORM_DATA_ARRAY    0x18
#define OFF_TRANSFORM_DATA_INDICES  0x20

// ── WeaponryController (dump.cs line 21813) ──────────────────────────────────
#define OFF_WRC_ACTIVE_WEAPON       0xA0   // WeaponryController -> WeaponController* (текущее оружие)
#define OFF_WRC_SLOT                0x88   // byte текущий слот

// ── WeaponController (dump.cs line 48345) ────────────────────────────────────
#define OFF_WC_FIRE_RATE            0x80   // float FireRate
#define OFF_WC_RELOAD_DURATION      0x84   // float ReloadDuration
#define OFF_WC_SLOT_INDEX           0x94   // byte  SlotIndex
#define OFF_WC_AMMO_IN_MAGAZINE     0xA0   // int   AmmoInMagazine
#define OFF_WC_AMMO_RESERVE         0xA4   // int   AmmoReserve
#define OFF_WC_WEAPON_PARAMETERS    0xA8   // WeaponParameters*
#define OFF_WC_IS_FIRING            0xC1   // bool  IsFiring

// ── WeaponParameters / GunParameters (combat, Holy combat features) ──────────
#define OFF_WP_AMMUNITION           0x130  // Ammunition*
#define OFF_WP_RECOIL_CONTROL       0x150  // recoil control (int)
#define OFF_WP_RECOIL_PARAMETERS    0x158  // RecoilParameters*
#define OFF_WP_PENETRATION_POWER    0x1A4  // int   wallshot penetration
#define OFF_WP_PENETRATION_SAFE     0x264  // Nullable<int> safe penetration

// ── Ammunition fields ────────────────────────────────────────────────────────
#define OFF_AMMO_MAGAZINE_CAP       0x10   // short
#define OFF_AMMO_CAP                0x12   // short
#define OFF_AMMO_MAGAZINE_CAP_SAFE  0x14   // Nullable<int>
#define OFF_AMMO_CAP_SAFE           0x20   // Nullable<int>

// ── Aimbot constants ──────────────────────────────────────────────────────────
#define AIMBOT_VERTICAL_FOV_DEG     70.0f
#define AIMBOT_PI                   3.14159265f
#define AIMBOT_RAD_TO_DEG           57.2957795f

// ── ESP ───────────────────────────────────────────────────────────────────────
#define PLAYER_HEIGHT               1.67f
