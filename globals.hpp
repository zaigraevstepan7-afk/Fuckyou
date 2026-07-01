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

    // inputs
    const uint32_t get_touch = oxorany(0x6A3A5D0); // 0.36.1
    const uint32_t get_count = oxorany(0x6A3AAE0); // 0.36.1

    // screen
    const uint32_t get_width = oxorany(0x4CF171C);  // 0.36.1
    const uint32_t get_heigth = oxorany(0x4CF1744); // 0.36.1

    // transform
    const uint32_t get_position = oxorany(0x4D1194C);     // 0.36.1
    const uint32_t set_position = oxorany(0x4D119EC);     // 0.36.1
    const uint32_t get_forward = oxorany(0x4D11F50);      // 0.36.1
    const uint32_t get_up = oxorany(0x4D11E50);           // 0.36.1
    const uint32_t get_euler_angles = oxorany(0x4D11BBC); // 0.36.1
    const uint32_t set_euler_angles = oxorany(0x4D11C44); // 0.36.1
    const uint32_t get_rotation = oxorany(0x4D11BEC);

    // playercontroller
    const uint32_t set_tps = oxorany(0x6C6FB40); // 0.36.1
    const uint32_t set_fps = oxorany(0x6C6FF48); // 0.36.1
    const uint32_t set_visible = oxorany(0x6C718F8); // 0.36.1

    // shader
    const uint32_t find = oxorany(0x4CF5F5C); // 0.36.1

    // material
    const uint32_t get_texture = oxorany(0x4CF6870);  // 0.36.1
    const uint32_t set_texture = oxorany(0x4CF69D4);  // 0.36.1
    const uint32_t get_shader = oxorany(0x4CF657C);   // 0.36.1
    const uint32_t set_shader = oxorany(0x4CF65B8);   // 0.36.1
    const uint32_t new_material = oxorany(0x4CF63B4); // 0.36.1
    const uint32_t set_color = oxorany(0x4CF671C);    // 0.36.1
    const uint32_t set_int = oxorany(0x4CF7630);      // 0.36.1
    const uint32_t set_float = oxorany(0x4CF7704);    // 0.36.1

    // type
    const uint32_t get_type = oxorany(0x474F8C0);             // 0.36.1
    const uint32_t find_objects_of_type = oxorany(0x4D0BAA8); // 0.36.1

    //object
    const uint32_t object_instantiate = oxorany(0x4D0B180);
    const uint32_t object_destroy = oxorany(0x4D0B928);
    const uint32_t is_native_object_alive = oxorany(0x4D0AFE0);

    // renderer
    const uint32_t get_material = oxorany(0x4CF5A2C);  // 0.36.1
    const uint32_t set_material = oxorany(0x4CF5A68);  // 0.36.1
    const uint32_t get_materials = oxorany(0x4CF59EC); // 0.36.1
    const uint32_t set_materials = oxorany(0x4CF5A28); // 0.36.1

    // gameobject
    const uint32_t set_active = oxorany(0x4D07928); // 0.36.1

    // PhotonPlayerExtension

    // fog
    const uint32_t rendersettings_manager = oxorany(0x3F1B494);     // 0.36.1
    const uint32_t call_rendersettings_update = oxorany(0x3F20438); // 0.36.1

    // physics
    const uint32_t linecast = oxorany(0x619AD10);    // 0.36.1
    const uint32_t sphere_cast = oxorany(0x619AF68); // 0.36.1

    // charachercontroller
    const uint32_t get_velocity = oxorany(0x5369B0C); // нахуй

    // raycast
    const uint32_t ray = oxorany(0x84DB9F0); // 0.36.1

    // icall
    const uint32_t icall = oxorany(0x46E5A6C); // 0.36.1

    // camera
    const uint32_t get_main = oxorany(0x4CE557C);     // 0.36.1
    const uint32_t set_fov = oxorany(0x4CE423C);      // 0.36.1
    const uint32_t set_flags = oxorany(0x4CE4708);    // 0.36.1
    const uint32_t set_bagcolor = oxorany(0x4CE4634); // 0.36.1
    const uint32_t fsdfds = oxorany(0x4CE4C4C); //0.36.1
    const uint32_t get_projection_matrix_injected = oxorany(0x4CE4CFC); //0.36.1

    // component
    const uint32_t get_transform = oxorany(0x4D04BF4);   // 0.36.1
    const uint32_t get_game_object = oxorany(0x4D04C30); // 0.36.1

    // other
    const uint32_t create_string = oxorany(0x57DACCC); // 0.36.1

    // api // corrected il2cpp export dump (libunity_base + offset)
    const uint32_t il2cpp_domain_get = oxorany(0x4FF4198);
    const uint32_t il2cpp_domain_assembly_open = oxorany(0x4FF419C);
    const uint32_t il2cpp_assembly_get_image = oxorany(0x4FF4060);
    const uint32_t il2cpp_class_from_name = oxorany(0x877F3A4);
    const uint32_t il2cpp_array_new = oxorany(0x4FF4044);
    const uint32_t il2cpp_object_new = oxorany(0x4FF434C);

    // present frame / gfx context
    // NOTE: значения ниже — из СТАРОГО билда (globalMetadata 0xADF...), НЕ из текущего дампа (0x989...).
    // Нужны present_frame/context для этого же билда, что и il2cpp-дамп.
    const uint32_t present_frame = oxorany(0x53C0330); // present_frame func (проверить под текущий билд)
    const uint32_t context = oxorany(0xAD63EE0);       // gfx present-frame context slot (void**) (проверить)
};

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
