#pragma once
#include <cstdint>

enum class team_t : uint8_t
{
    none = 0,
    tr = 1,
    ct = 2,
    spectator = 3,
};

enum class view_mode_t : uint8_t
{
    none = 0,
    fps = 1,
    tps = 2,
};
class c_transform;
#pragma pack(1)
class c_biped_map
{
    char pad[0x20];

public:
    c_transform *head;
    c_transform *neck;
    c_transform *spine;
    c_transform *spine1;
    c_transform *spine2;
    c_transform *left_shoulder;
    c_transform *left_upperarm;
    c_transform *left_forearm;
    c_transform *left_hand;
    c_transform *right_shoulder;
    c_transform *right_upperarm;
    c_transform *right_forearm;
    c_transform *right_hand;
    c_transform *hip;
    c_transform *left_up_leg;
    c_transform *left_leg;
    c_transform *left_foot;
    c_transform *left_toe_base;
    c_transform *right_up_leg;
    c_transform *right_leg;
    c_transform *right_foot;
    c_transform *right_toe_base;
    c_transform *left_hand_index1;
    c_transform *left_hand_index2;
    c_transform *left_hand_index3;
    c_transform *left_hand_index4;
    c_transform *left_in_hand_middle;
    c_transform *left_hand_middle1;
    c_transform *left_hand_middle2;
    c_transform *left_hand_middle3;
    c_transform *left_hand_middle4;
    c_transform *left_in_hand_pinky;
    c_transform *left_hand_pinky1;
    c_transform *left_hand_pinky2;
    c_transform *left_hand_pinky3;
    c_transform *left_hand_pinky4;
    c_transform *left_in_hand_ring;
    c_transform *left_hand_ring1;
    c_transform *left_hand_ring2;
    c_transform *left_hand_ring3;
    c_transform *left_hand_ring4;
    c_transform *left_in_hand_thumb;
    c_transform *left_hand_thumb1;
    c_transform *left_hand_thumb2;
    c_transform *left_hand_thumb3;
    c_transform *right_in_hand_index;
    c_transform *right_hand_index1;
    c_transform *right_hand_index2;
    c_transform *right_hand_index3;
    c_transform *right_hand_index4;
    c_transform *right_in_hand_middle;
    c_transform *right_hand_middle1;
    c_transform *right_hand_middle2;
    c_transform *right_hand_middle3;
    c_transform *right_hand_middle4;
    c_transform *right_in_hand_pinky;
    c_transform *right_hand_pinky1;
    c_transform *right_hand_pinky2;
    c_transform *right_hand_pinky3;
    c_transform *right_hand_pinky4;
    c_transform *right_in_hand_ring;
    c_transform *right_hand_ring1;
    c_transform *right_hand_ring2;
    c_transform *right_hand_ring3;
    c_transform *right_hand_ring4;
    c_transform *right_in_hand_thumb;
    c_transform *right_hand_thumb1;
    c_transform *right_hand_thumb2;
    c_transform *right_hand_thumb3;
};
#pragma pack()
class c_transform;
class c_object_occludee;
#pragma pack(1)
class c_player_character_view
{
    char pad[0x30];

public:
    bool oclussion; // 0x30
    char padd[0x17];
    c_biped_map *c_biped; // 0x48
};
#pragma pack()
// static_assert(offsetof(c_player_character_view, c_biped) == 0x48);
class c_player_main_camera;
class c_photon_player;
class c_aim_controller;
class c_weaponry_controller;
class c_movement_controller;
class c_characher_lod_group;
class c_renderer;
#pragma pack(1)
class c_arms_lod_group
{
    char pad[0x38];

public:
    c_renderer *gloves;
    c_renderer *arms;
};
#pragma pack()
#pragma pack(1)
class c_characher_controller
{
public:
    Vector3 get_velocity()
    {
        if (!this || !c_offsets)
            return Vector3{};

        uintptr_t addr = base + c_offsets->get_velocity;
        if (!addr)
            return Vector3{};

        using fn = Vector3 (*)(c_characher_controller *);
        fn f = reinterpret_cast<fn>(addr);
        if (!f)
            return Vector3{};

        return f(this);
    }
};
#pragma pack()
#pragma pack(1)
class c_player_controller
{
    // 0.39.1: явные оффсеты (pack(1)). Разметка вытащена из dump.cs 0.39.1 по типам полей.
    // В 0.39.1 добавлены поля на 0x58-0x70 и 0xD0 -> старый последовательный layout уезжал.
    char __pad_a[0x28];

public:
    c_transform *m_pMainCameraHolder;          // 0x28  Transform _mainCameraHolder
    char __pad_b[0x48 - 0x30];
    c_player_character_view *m_pCharacterView; // 0x48  PlayerCharacterView
    char __pad_c[0x79 - 0x50];
    team_t m_team;                             // 0x79  enum (проверить в игре)
    char __pad_d[0x80 - 0x7A];
    c_aim_controller *m_pAim;                  // 0x80  AimController
    c_weaponry_controller *m_pWeaponry;        // 0x88  WeaponryController
    char __pad_e[0x98 - 0x90];
    c_movement_controller *m_pMovement;        // 0x98  MovementController
    char __pad_f[0xC8 - 0xA0];
    c_arms_lod_group *m_pLOD;                  // 0xC8  ArmsLodGroup
    char __pad_g[0xD8 - 0xD0];
    bool m_bCharacterVisible;                  // 0xD8  bool (проверить в игре)
    char __pad_h[0xE8 - 0xD9];
    c_player_main_camera *m_pMainCamera;       // 0xE8  PlayerMainCamera
    char __pad_i[0x100 - 0xF0];
    c_transform *m_pTransform;                 // 0x100 Transform
    char __pad_j[0x128 - 0x108];
    c_characher_lod_group *m_pCharacterLOD;    // 0x128 CharacterLodGroup
    char __pad_k[0x160 - 0x130];
    c_photon_player *m_pPhoton;                // 0x160 PhotonPlayer

    void set_tps()
    {
        using a = void (*)(c_player_controller *);
        a b = reinterpret_cast<a>(base + c_offsets->set_tps);
        return b(this);
    }
    void set_fps()
    {
        using a = void (*)(c_player_controller *);
        a b = reinterpret_cast<a>(base + c_offsets->set_fps);
        return b(this);
    }

    void set_visible()
    {
        using a = void (*)(c_player_controller *);
        a b = reinterpret_cast<a>(base + c_offsets->set_visible);
        return b(this);
    }

    // void instantiate(bool bb, float cc)
    // {
    //     using a = void (*)(c_player_controller *, int health, int armor, bool has_halmet, bool unt, float dur);
    //     a b = reinterpret_cast<a>(base + c_offsets->instantiate);
    //     return b(this, 99, 99, true, bb, cc);
    // }
};
#pragma pack()

#pragma pack(1)
class c_characher_lod_group
{
public:
    char pad[0x30]; // 0.39.1: CharacterLodGroup::_meshRenderer @ 0x30
    c_renderer *skinned_mesh_render;
};
#pragma pack()