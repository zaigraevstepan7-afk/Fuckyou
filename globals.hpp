#pragma once
#include <cstdint>
#include "includes/structs.h"
#include "includes/oxorany/Oxorany.hpp"
#include <android/log.h>
#include "includes/matrix.h"
#include "includes/Obfuscate.hpp"
#include <vector>
using namespace structs;
inline uintptr_t base;

#define str_(text) \
    []() noexcept { \
        static char buff[sizeof(text)]; \
        if (buff[0] == 0) { \
            memcpy(buff, oxorany(text), sizeof(buff) - 1); \
            buff[sizeof(buff) - 1] = '\0'; \
        } \
        return buff; }()

#define LOGD(fmt, ...) \
    __android_log_print(ANDROID_LOG_DEBUG, "tenmi", fmt, ##__VA_ARGS__)
class c_player_controller;
class c_playermanager;
class c_player_controls;
class c_game_controller;
class c_photon_player;
class c_component;
class c_weapon_controller;
class c_gun_controller;
class c_weapon_parameters;
class c_gun_parameters;
class globals
{
public:
    bool is_allocated(void *x);
    void *get_lazysingleton_typeinfo(uintptr_t addr);
    void *type_info_instance(uintptr_t addr, uintptr_t field);
    Vector3 world2screen(const Matrix &viewMatrix, const Vector3 &pos);
    bool is_bone_visible(Vector3 start, Vector3 end_pos);
    bool is_alive(c_player_controller *player);
    bool is_enemy(c_player_controller *local, c_player_controller *enemy);
    bool holding_gun();
    bool is_sniper();
    void updateGun();
    void update();
    void updateTarget();
    void init();
    bool is_scoped();
};

inline struct target
{
public:
    bool b_found{};
    Vector3 pos{};
    Vector3 camera_pos{};
    bool fire;
    bool lag;
    c_player_controller *player{};
    bool visible{};
    bool head{};
    int damage{};
    c_player_controller *hitted{};
} target_t;

class methods
{
public:
    int (*get_width)();
    int (*get_heigth)();
    int (*get_count)();
    UnityEngine_Touch_o (*get_touch)(int id);
    void *(*game_controller)();
    bool (*linecast)(Vector3 start, Vector3 end, raycast_hit_t *hitInfo, int layerMask);
    bool (*sphere_cast)(ray_t ray, float radius, raycast_hit_t *hit, float max, int layer);
    monoString *(*create_string)(void *, const char *, int, int);
    monoString *new_str(const char *text)
    {
        return create_string(NULL, text, 0, std::strlen(text));
    }
    void (*set_active)(void *, bool val);
    void (*set_flags)(void *, uint8_t);
    void (*set_bagcolor)(void *, color_t);
    c_component *(*get_collider)(raycast_hit_t);
    uint8_t (*from_tag)(c_component *);
    void *(*object_instantiate)(void *game_object, Vector3 pos, Quaternion rot);
    void (*object_destroy)(void *game_object, float time);
    bool (*is_native_object_alive)(void *game_object);

};

class offsets
{
public:
    // typeinfo
    const uint32_t c_anticheatmanager = oxorany(0x7D97618); // decimal to hex //0.36.0
    const uint32_t c_player_controls = oxorany(131738640);  // decimal to hex //0.36.0

    // inputs // 0.39.1
    const uint32_t get_touch = oxorany(0x7118204); // 0.39.1  Input::GetTouch(int)
    const uint32_t get_count = oxorany(0x71181DC); // 0.39.1  Input::get_touchCount

    // screen // 0.39.1
    const uint32_t get_width = oxorany(0x5DEB04C);  // 0.39.1  Screen::get_width
    const uint32_t get_heigth = oxorany(0x5DF07AC); // 0.39.1  Screen::get_height

    // transform // 0.39.1 (public wrappers, return by value)
    const uint32_t get_position = oxorany(0x602ECFC);     // 0.39.1
    const uint32_t set_position = oxorany(0x602A9A8);     // 0.39.1
    const uint32_t get_forward = oxorany(0x603DF30);      // 0.39.1
    const uint32_t get_up = oxorany(0x6041414);           // 0.39.1
    const uint32_t get_euler_angles = oxorany(0x60374F8); // 0.39.1  get_eulerAngles
    const uint32_t set_euler_angles = oxorany(0x6027270); // 0.39.1  set_eulerAngles
    const uint32_t get_rotation = oxorany(0x6037544);     // 0.39.1

    // playercontroller
    // TODO: обфусцированные имена методов PlayerController — по имени в dump.cs не найти,
    // нужен ручной xref по libunity.so 0.39.1. Значения от 0.36.1 (third-person/visible не работают).
    const uint32_t set_tps = oxorany(0x6C6FB40); // 0.36.1 (НЕ обновлено, проверить!)
    const uint32_t set_fps = oxorany(0x6C6FF48); // 0.36.1 (НЕ обновлено, проверить!)
    const uint32_t set_visible = oxorany(0x6C718F8); // 0.36.1 (НЕ обновлено, проверить!)

    // shader // 0.39.1
    const uint32_t find = oxorany(0x5E32C98); // 0.39.1  Shader::Find(string)

    // material // 0.39.1
    const uint32_t get_texture = oxorany(0x5E3777C);  // 0.39.1  get_mainTexture
    const uint32_t set_texture = oxorany(0x5E33054);  // 0.39.1  set_mainTexture
    const uint32_t get_shader = oxorany(0x5E394F8);   // 0.39.1
    const uint32_t set_shader = oxorany(0x5E3C820);   // 0.39.1
    const uint32_t new_material = oxorany(0x5E3D5B0); // 0.39.1  Material::.ctor(Shader)
    const uint32_t set_color = oxorany(0x5E330E4);    // 0.39.1
    const uint32_t set_int = oxorany(0x5E3A520);      // 0.39.1  SetInt(string,int)
    const uint32_t set_float = oxorany(0x5E355EC);    // 0.39.1  SetFloat(string,float)

    // type // 0.39.1
    const uint32_t get_type = oxorany(0x5BD3414);            // 0.39.1  Type::GetType(string)
    const uint32_t find_objects_of_type = oxorany(0x6039798); // 0.39.1  Object::FindObjectsOfType(Type)

    //object // 0.39.1
    const uint32_t object_instantiate = oxorany(0x602B630);   // 0.39.1  Instantiate(obj,Vec3,Quat)
    const uint32_t object_destroy = oxorany(0x60384B8);       // 0.39.1  Destroy(obj,float)
    const uint32_t is_native_object_alive = oxorany(0x6030C4C); // 0.39.1  IsNativeObjectAlive

    // renderer // 0.39.1
    const uint32_t get_material = oxorany(0x5E350D0);  // 0.39.1
    const uint32_t set_material = oxorany(0x5E3C5A8);  // 0.39.1
    const uint32_t get_materials = oxorany(0x5E29C88); // 0.39.1
    const uint32_t set_materials = oxorany(0x4CF5A28); // 0.36.1 (setter не найден в dump.cs, проверить!)

    // gameobject // 0.39.1
    const uint32_t set_active = oxorany(0x603324C); // 0.39.1  GameObject::SetActive(bool)

    // PhotonPlayerExtension

    // fog // NATIVE (движок) — нет в managed dump.cs, нужен ручной xref по libunity.so
    const uint32_t rendersettings_manager = oxorany(0x3F1B494);     // 0.36.1 (native, проверить!)
    const uint32_t call_rendersettings_update = oxorany(0x3F20438); // 0.36.1 (native, проверить!)

    // physics // 0.39.1
    const uint32_t linecast = oxorany(0x7641184);    // 0.39.1  Linecast(V3,V3,RaycastHit,int)
    const uint32_t sphere_cast = oxorany(0x7641F8C); // 0.39.1  SphereCast(Ray,f,RaycastHit,f,int)

    // charachercontroller // 0.39.1
    const uint32_t get_velocity = oxorany(0x7642F10); // 0.39.1  CharacterController::get_velocity

    // raycast // NATIVE слот делегата Internal_Raycast_Injected — нужен ручной xref по libunity.so
    const uint32_t ray = oxorany(0x84DB9F0); // 0.36.1 (native slot, проверить!)

    // icall // 0.39.1  il2cpp_resolve_icall
    const uint32_t icall = oxorany(0x5B9A4B8); // 0.39.1

    // camera // 0.39.1
    const uint32_t get_main = oxorany(0x5DE51E8);     // 0.39.1  Camera::get_main
    const uint32_t set_fov = oxorany(0x5DEF034);      // 0.39.1  set_fieldOfView
    const uint32_t set_flags = oxorany(0x5DFEBD8);    // 0.39.1  set_clearFlags
    const uint32_t set_bagcolor = oxorany(0x5DDF98C); // 0.39.1  set_backgroundColor
    const uint32_t fsdfds = oxorany(0x5DF0AD8); // 0.39.1  get_worldToCameraMatrix_Injected
    const uint32_t get_projection_matrix_injected = oxorany(0x5DE51A4); // 0.39.1

    // component // 0.39.1
    const uint32_t get_transform = oxorany(0x603CFF4);   // 0.39.1
    const uint32_t get_game_object = oxorany(0x60322E4); // 0.39.1  get_gameObject

    // other // 0.39.1
    const uint32_t create_string = oxorany(0x5C057D0); // 0.39.1  String::CreateString(sbyte*,int,int) [alt 0x5BFB270]

    // api // 0.39.1 (libunity_base + offset, primary = B-трамплины, callable)
    const uint32_t il2cpp_domain_get = oxorany(0x5B763D4);
    const uint32_t il2cpp_domain_assembly_open = oxorany(0x5B763D8);
    const uint32_t il2cpp_assembly_get_image = oxorany(0x5B7627C);
    const uint32_t il2cpp_class_from_name = oxorany(0x9B3D990);
    const uint32_t il2cpp_array_new = oxorany(0x5B76260);
    const uint32_t il2cpp_object_new = oxorany(0x5B76578);

    // present frame / gfx context // 0.39.1 (подтверждено по libunity.so: чистый вход функции)
    const uint32_t present_frame = oxorany(0x53C0330); // 0.39.1  GfxDeviceGLES::PresentFrame
    const uint32_t context = oxorany(0xAD63EE0);       // 0.39.1  present-frame context slot (void**)
};

// il2cpp 0.39.1 обфусцированный runtime-layout структур (поля переставлены!).
// Оффсеты подтверждены дизассемблером libunity.so 0.39.1 по il2cpp-геттерам.
// Использовать эти хелперы вместо обращений к полям стандартной il2cpp.h.
namespace il2cpp39
{
    inline uint16_t class_method_count(void *k) { return *reinterpret_cast<uint16_t *>(reinterpret_cast<uintptr_t>(k) + 0xBC); }
    inline void **class_methods(void *k) { return *reinterpret_cast<void ***>(reinterpret_cast<uintptr_t>(k) + 0x78); }
    inline const char *method_name(void *m) { return *reinterpret_cast<const char **>(reinterpret_cast<uintptr_t>(m) + 0x18); }
    inline bool method_is_generic(void *m) { return (*reinterpret_cast<uint8_t *>(reinterpret_cast<uintptr_t>(m) + 0x54)) & 1; }
    inline uint8_t method_param_count(void *m) { return *reinterpret_cast<uint8_t *>(reinterpret_cast<uintptr_t>(m) + 0x00); }
    inline uint16_t method_slot(void *m) { return *reinterpret_cast<uint16_t *>(reinterpret_cast<uintptr_t>(m) + 0x52); }
    inline void *get_method_ptr(void *m) { return *reinterpret_cast<void **>(reinterpret_cast<uintptr_t>(m) + 0x30); }
    inline void set_method_ptr(void *m, void *hook) { *reinterpret_cast<void **>(reinterpret_cast<uintptr_t>(m) + 0x30) = hook; }
    // vtable @ +0x198, VirtualInvokeData stride 0x10, methodPtr @ +0x0
    inline void set_vtable_slot(void *k, uint32_t slot, void *hook) { *reinterpret_cast<void **>(reinterpret_cast<uintptr_t>(k) + 0x198 + static_cast<uintptr_t>(slot) * 0x10) = hook; }
    inline void *get_vtable_slot(void *k, uint32_t slot) { return *reinterpret_cast<void **>(reinterpret_cast<uintptr_t>(k) + 0x198 + static_cast<uintptr_t>(slot) * 0x10); }
}

struct Il2CppClass;
class callback
{
public:
    c_player_controller *local_player{};
    c_player_controller *enemy_player{};
    c_playermanager *player_manager{};
    c_player_controls *player_controls{};
    Il2CppClass *playermanager;
    void *weaponry_controller{};
    void *weapon_controller{};
    void *weapon_parameters{};
    c_photon_player *photon{};
};

class egl
{
public:
    int heigth;
    int width;
};

template < typename T >
struct safe_type
{
    T value;
    bool has_value;
};


class player
{
public:
    c_player_controller *enemy{};
    std::vector<c_player_controller *> list{};
    std::vector<c_player_controller *> entity{};
    c_player_controller *local{};

    void reset();
    void collect(c_player_controller *player);
    void after_match();
    void update();

    c_weapon_controller *weapon_controller{};
    c_gun_controller *gun_controller{};
    c_weapon_parameters *weapon_parameters{};
    c_gun_parameters *gun_parameters{};
    c_game_controller *game{};
    c_player_controls *controls{};
};

inline globals *c_globals = new globals();
inline offsets *c_offsets = new offsets();
inline callback *c_callback = new callback();
inline egl *c_egl = new egl();
inline methods *c_methods = new methods();
inline player *c_player = new player();

inline const char *sky_flags[] = {"none", "skybox", "color", "solid", "depth", "nothing"};
inline const char *pitch_[] = {("local"), ("up"), ("down")};
inline const char *yaw_[] = {("local"), ("backward"), ("spiral"), ("chaos")};
inline const char *enemy_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *weapon_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *local_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *hands_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *arms_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *hit_[] = {("solid"), ("flat"), ("glass"), ("glow"), ("transparent")};
inline const char *knifes[] = {"m9", "karambit", "jkommando", "butterfly", "flip", "kunai", "scorpion", "tanto", "daggers", "kukri", "stilet", "mantis", "fang", "sting", "hands"};

inline struct g_
{
    // esp
    bool b_esp;
    bool b_line;
    bool b_rect;
    bool b_health;
    bool b_name;
    bool b_ammo;
    bool b_skeleton;
    bool b_eweapon;
    float m_ammo[4] = {0.077f, 0.251f, 0.605f, 1.0f};
    float m_health[4] = {0.025f, 0.560f, 0.025f, 1.0f};
    float m_rect[4] = {1.0f, 0.0f, 0.0f, 1.0f};
    float m_skeleton[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    bool b_tracer;
    float m_tracer[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    bool b_marker;
    float m_marker[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    bool b_dmarker;
    bool b_sk;
    float m_sk[4] = {1.0f, 1.0f, 1.0f, 1.0f};

    // ragebot
    bool b_silent;
    bool b_fire;
    bool b_endless;
    bool b_duck;
    bool b_stop;
    int hitchance = 75;
    bool hitbox[4];
    bool b_dt;
    bool predict;
    float factor = 1;
    int fak = 5;
    float dist = 1.65;
    float mom = 2.5;

    // anti aim
    bool b_antiaim;
    int i_pitch = 0;
    int i_yaw = 0;
    bool b_jitter;
    int i_range = 0;
    float f_speed;
    bool b_chaos;
    float f_jitter_speed = 0.3f;
    int frames = 1;

    // misc
    bool b_strafer;
    bool b_walk;
    bool b_third;
    int knife = 0;
    bool b_peek;
    bool b_aspect;
    float f_aspect = 1.5;
    bool b_scope;
    float m_fov = 59.9f;

    // chams
    bool b_players;
    bool b_local;
    bool b_gloves;
    float m_players[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    float m_local[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    float m_gloves[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    float m_hit[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    float m_weapon[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    int i_local = 0;
    int i_players = 0;
    int i_gloves = 0;
    int i_hit = 0;
    int i_weapon = 0;
    bool hit_chams;
    bool weapon_chams;


    // world
    bool b_world;
    bool b_solid;
    bool b_fog;
    float m_world[4] = {0.500f, 0.500f, 0.500f, 0.700f};
    float m_fog[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    float f_start = 5.0f;
    float f_end = 20.0f;
    bool b_sky;
    float m_sky[4] = {1.0f, 1.0f, 1.0f, 1.0f};
    int c_flags = 2;

    // exploits
    bool b_onehit;
    bool b_frate;
    bool b_god;
    bool sethp;
    float dur = 100;
    bool b_weapon;
    bool b_bomb;

    int steps = 2500;
    bool update_matrix{};

} g;
enum class team_t : uint8_t;

inline bool fire{};
inline struct abc
{
    void *player{};
} abcd;
inline bool open = true;
#include "sdk/game/include.h"
