#include "visuals.hpp"
#include "../game/game.hpp"
#include "../game/math.hpp"
#include "../game/player.hpp"
#include "../ui/theme/theme.hpp"
#include "../ui/cfg.hpp"
#include "../protect/oxorany.hpp"
#include "imgui.h"
#include <cmath>
#include <algorithm>
#include <array>
#include <cctype>
#include <cstdio>
#include <initializer_list>
#include <string>
#include <vector>

extern ImFont* espFont;

namespace {
    static constexpr uint64_t kOffPlayerManagerLocalPlayer = OFF_PM_LOCAL_PLAYER;
    static constexpr uint64_t kOffPlayerWeaponryController = OFF_PLAYER_WEAPON_ROOT;
    static constexpr uint64_t kOffPlayerPhotonView = OFF_PLAYER_PHOTON_VIEW;
    static constexpr uint64_t kOffWeaponryCurrentWeapon = OFF_WRC_ACTIVE_WEAPON;
    static constexpr uint64_t kOffWeaponryCurrentWeaponAlt = 0x98;
    static constexpr uint64_t kOffWeaponParameters = OFF_WC_WEAPON_PARAMETERS;
    static constexpr uint64_t kOffWeaponParametersAlt = 0xA0;
    static constexpr uint64_t kOffWeaponId = OFF_WEAPON_ID;
    static constexpr uint64_t kOffGunShootingLoopState = 0x148;
    static constexpr uint64_t kOffGunStateSimple = 0x188;
    static constexpr uint64_t kOffGunAimingModeSimple = 0x190;

    static bool valid_read_string(const read_string& s) {
        return s.string_length > 0 && s.string_length < 128;
    }

    static ImU32 col_from_vec4(const ImVec4& c, float a) {
        return IM_COL32(
            static_cast<int>(std::clamp(c.x, 0.f, 1.f) * 255),
            static_cast<int>(std::clamp(c.y, 0.f, 1.f) * 255),
            static_cast<int>(std::clamp(c.z, 0.f, 1.f) * 255),
            static_cast<int>(std::clamp(c.w * a, 0.f, 1.f) * 255)
        );
    }

    static std::string lower_ascii(std::string s) {
        for (char& c : s) {
            c = static_cast<char>(std::tolower(static_cast<unsigned char>(c)));
        }
        return s;
    }

    static bool contains_ci(const std::string& text, const char* needle) {
        if (!needle || !needle[0]) return false;
        return lower_ascii(text).find(lower_ascii(needle)) != std::string::npos;
    }

    static bool find_property_value(uint64_t player_ptr, const char* tag, uint64_t& out_value) {
        out_value = 0;

        uint64_t photon_player = player::photon_ptr(player_ptr);
        if (!player::likely_ptr(photon_player)) return false;

        uint64_t properties_registry = rpm<uint64_t>(photon_player + oxorany(0x38));
        if (!player::likely_ptr(properties_registry)) return false;

        int count = rpm<int>(properties_registry + oxorany(0x20));
        if (count <= 0 || count > 128) return false;

        uint64_t properties_list = rpm<uint64_t>(properties_registry + oxorany(0x18));
        if (!player::likely_ptr(properties_list)) return false;

        for (int i = 0; i < count; ++i) {
            uint64_t key = rpm<uint64_t>(properties_list + oxorany(0x28) + oxorany(0x18) * i);
            uint64_t value = rpm<uint64_t>(properties_list + oxorany(0x30) + oxorany(0x18) * i);
            if (!player::likely_ptr(key) || !player::likely_ptr(value)) continue;

            read_string raw_key = rpm<read_string>(key);
            if (!valid_read_string(raw_key)) continue;

            std::string key_string = raw_key.as_utf8();
            if (contains_ci(key_string, tag)) {
                out_value = value;
                return true;
            }
        }

        return false;
    }

    static bool read_property_int(uint64_t player_ptr, const char* tag, int& out_value) {
        uint64_t value = 0;
        if (!find_property_value(player_ptr, tag, value)) return false;

        int raw = rpm<int>(value + oxorany(0x10));
        if (raw < -10000000 || raw > 10000000) return false;

        out_value = raw;
        return true;
    }

    static bool read_property_bool(uint64_t player_ptr, const char* tag, bool& out_value) {
        uint64_t value = 0;
        if (!find_property_value(player_ptr, tag, value)) return false;

        int raw = rpm<int>(value + oxorany(0x10));
        if (raw == 0 || raw == 1) {
            out_value = raw != 0;
            return true;
        }

        uint8_t byte_value = rpm<uint8_t>(value + oxorany(0x10));
        if (byte_value == 0 || byte_value == 1) {
            out_value = byte_value != 0;
            return true;
        }

        return false;
    }

    static std::string read_managed_string(uint64_t value) {
        if (!player::likely_ptr(value)) return {};

        read_string raw = rpm<read_string>(value);
        if (valid_read_string(raw)) {
            std::string text = raw.as_utf8();
            if (text.size() > 32) text.resize(32);
            return text;
        }

        uint64_t nested = rpm<uint64_t>(value + oxorany(0x10));
        if (player::likely_ptr(nested)) {
            raw = rpm<read_string>(nested);
            if (valid_read_string(raw)) {
                std::string text = raw.as_utf8();
                if (text.size() > 32) text.resize(32);
                return text;
            }
        }

        return {};
    }

    static std::string try_property_string(uint64_t player, const char* tag) {
        uint64_t value = 0;
        if (!find_property_value(player, tag, value)) return {};

        std::string txt = read_managed_string(value);
        if (txt.empty()) return {};
        if (txt.size() > 32) txt.resize(32);
        return txt;
    }

    static std::string weapon_name(uint64_t player) {
        static const std::array<const char*, 4> tags = {
            oxorany("weapon"),
            oxorany("gun"),
            oxorany("wpn"),
            oxorany("Weapon")
        };
        for (const char* tag : tags) {
            std::string name = try_property_string(player, tag);
            if (!name.empty()) return name;
        }
        return {};
    }

    static bool get_weapon_chain(uint64_t player_ptr, uint64_t& out_weapon, int& out_weapon_id) {
        out_weapon = 0;
        out_weapon_id = -1;

        uint64_t weaponry = rpm<uint64_t>(player_ptr + oxorany(kOffPlayerWeaponryController));
        if (!player::likely_ptr(weaponry)) return false;

        uint64_t weapon = rpm<uint64_t>(weaponry + oxorany(kOffWeaponryCurrentWeapon));
        if (!player::likely_ptr(weapon)) {
            weapon = rpm<uint64_t>(weaponry + oxorany(kOffWeaponryCurrentWeaponAlt));
        }
        if (!player::likely_ptr(weapon)) return false;

        uint64_t params = rpm<uint64_t>(weapon + oxorany(kOffWeaponParameters));
        if (!player::likely_ptr(params)) {
            params = rpm<uint64_t>(weapon + oxorany(kOffWeaponParametersAlt));
        }
        if (!player::likely_ptr(params)) return false;

        out_weapon = weapon;
        out_weapon_id = rpm<int>(params + oxorany(kOffWeaponId));
        return true;
    }

    static bool read_state_simple_current(uint64_t state_simple, int& out_state) {
        if (!player::likely_ptr(state_simple)) return false;

        int state = rpm<int>(state_simple + oxorany(0x10));
        if (state < 0 || state > 16) return false;

        out_state = state;
        return true;
    }

    static bool is_bomb_weapon_id(int id) {
        return id == 4 || id == 90 || id == 100;
    }

    static bool is_host_player(uint64_t player_ptr) {
        uint64_t photon_player = player::photon_ptr(player_ptr);
        if (!player::likely_ptr(photon_player)) return false;

        int actor_id = rpm<int>(photon_player + oxorany(0x18));
        if (actor_id <= 0) return false;

        uint64_t photon_view = rpm<uint64_t>(player_ptr + oxorany(kOffPlayerPhotonView));
        if (!player::likely_ptr(photon_view)) return false;

        int master_id = rpm<int>(photon_view + oxorany(0x78));
        return master_id > 0 && master_id == actor_id;
    }

    static bool property_flag(uint64_t player_ptr, std::initializer_list<const char*> tags) {
        for (const char* tag : tags) {
            bool value = false;
            if (read_property_bool(player_ptr, tag, value)) return value;
        }
        return false;
    }

    static bool is_firing_player(uint64_t player_ptr, uint64_t weapon) {
        if (player::likely_ptr(weapon)) {
            uint8_t loop_state = rpm<uint8_t>(weapon + oxorany(kOffGunShootingLoopState));
            if (loop_state == 3) return true;
        }

        return property_flag(player_ptr, { "firing", "isFiring", "shooting", "isShooting", "fire" });
    }

    static bool is_reloading_player(uint64_t player_ptr, uint64_t weapon) {
        if (player::likely_ptr(weapon)) {
            uint64_t state_simple = rpm<uint64_t>(weapon + oxorany(kOffGunStateSimple));
            int state = -1;
            if (read_state_simple_current(state_simple, state) && (state == 0 || state == 1)) return true;
        }

        return property_flag(player_ptr, { "reloading", "isReloading", "reload" });
    }

    static bool is_aiming_player(uint64_t player_ptr, uint64_t weapon) {
        if (player::likely_ptr(weapon)) {
            uint64_t aiming_simple = rpm<uint64_t>(weapon + oxorany(kOffGunAimingModeSimple));
            int mode = -1;
            if (read_state_simple_current(aiming_simple, mode) && (mode == 0 || mode == 1 || mode == 3)) return true;
        }

        return property_flag(player_ptr, { "aiming", "isAiming", "aim" });
    }

    static std::string os_flag(uint64_t player_ptr) {
        std::string platform = try_property_string(player_ptr, "platform");
        if (platform.empty()) platform = try_property_string(player_ptr, "os_name");
        if (platform.empty()) platform = try_property_string(player_ptr, "os");

        if (!platform.empty()) {
            std::string low = lower_ascii(platform);
            if (low.find("ios") != std::string::npos || low.find("iphone") != std::string::npos || low.find("ipad") != std::string::npos) return "OS:iOS";
            if (low.find("android") != std::string::npos) return "OS:AND";
            if (low.size() > 8) low.resize(8);
            return "OS:" + low;
        }

        int platform_id = -1;
        if (read_property_int(player_ptr, "platform", platform_id) && platform_id >= 0 && platform_id <= 20) {
            char buf[16];
            std::snprintf(buf, sizeof(buf), "OS:%d", platform_id);
            return buf;
        }

        return {};
    }

    static bool is_bomber_player(uint64_t player_ptr, int weapon_id) {
        if (is_bomb_weapon_id(weapon_id)) return true;

        std::string weapon = lower_ascii(weapon_name(player_ptr));
        return weapon.find("bomb") != std::string::npos || weapon.find("c4") != std::string::npos;
    }

    struct BoneScreen {
        bool ok = false;
        ImVec2 pos{};
    };

    enum SkeletonBone {
        BoneHead,
        BoneNeck,
        BoneSpine2,
        BoneSpine1,
        BoneSpine,
        BoneHip,
        BoneLeftShoulder,
        BoneLeftUpperarm,
        BoneLeftForearm,
        BoneLeftHand,
        BoneRightShoulder,
        BoneRightUpperarm,
        BoneRightForearm,
        BoneRightHand,
        BoneLeftUpLeg,
        BoneLeftLeg,
        BoneLeftFoot,
        BoneRightUpLeg,
        BoneRightLeg,
        BoneRightFoot,
        BoneCount
    };

    static void draw_skeleton(uint64_t player_ptr, const Vector3& base, const matrix& view_matrix) {
        uint64_t map = player::biped_map(player_ptr);
        if (!player::likely_ptr(map)) return;

        std::array<BoneScreen, BoneCount> bones{};

        auto read_bone = [&](int index, uint64_t offset) {
            Vector3 world{};
            ImVec2 screen{};
            if (!player::read_biped_bone(map, offset, base, world)) return;
            if (!world_to_screen(world, view_matrix, screen)) return;

            bones[index].ok = true;
            bones[index].pos = screen;
        };

        read_bone(BoneHead, oxorany(0x20));
        read_bone(BoneNeck, oxorany(0x28));
        read_bone(BoneSpine, oxorany(0x30));
        read_bone(BoneSpine1, oxorany(0x38));
        read_bone(BoneSpine2, oxorany(0x40));
        read_bone(BoneLeftShoulder, oxorany(0x48));
        read_bone(BoneLeftUpperarm, oxorany(0x50));
        read_bone(BoneLeftForearm, oxorany(0x58));
        read_bone(BoneLeftHand, oxorany(0x60));
        read_bone(BoneRightShoulder, oxorany(0x68));
        read_bone(BoneRightUpperarm, oxorany(0x70));
        read_bone(BoneRightForearm, oxorany(0x78));
        read_bone(BoneRightHand, oxorany(0x80));
        read_bone(BoneHip, oxorany(0x88));
        read_bone(BoneLeftUpLeg, oxorany(0x90));
        read_bone(BoneLeftLeg, oxorany(0x98));
        read_bone(BoneLeftFoot, oxorany(0xA0));
        read_bone(BoneRightUpLeg, oxorany(0xB0));
        read_bone(BoneRightLeg, oxorany(0xB8));
        read_bone(BoneRightFoot, oxorany(0xC0));

        ImDrawList* dl = ImGui::GetBackgroundDrawList();
        if (!dl) return;

        ImU32 col = col_from_vec4(cfg::esp::skeleton_col, 1.f);
        ImU32 outline = IM_COL32(0, 0, 0, 190);

        auto line = [&](int a, int b) {
            if (!bones[a].ok || !bones[b].ok) return;
            dl->AddLine(bones[a].pos, bones[b].pos, outline, 3.f);
            dl->AddLine(bones[a].pos, bones[b].pos, col, 1.2f);
        };

        line(BoneHead, BoneNeck);
        line(BoneNeck, BoneSpine2);
        line(BoneSpine2, BoneSpine1);
        line(BoneSpine1, BoneSpine);
        line(BoneSpine, BoneHip);

        line(BoneSpine2, BoneLeftShoulder);
        line(BoneLeftShoulder, BoneLeftUpperarm);
        line(BoneLeftUpperarm, BoneLeftForearm);
        line(BoneLeftForearm, BoneLeftHand);

        line(BoneSpine2, BoneRightShoulder);
        line(BoneRightShoulder, BoneRightUpperarm);
        line(BoneRightUpperarm, BoneRightForearm);
        line(BoneRightForearm, BoneRightHand);

        line(BoneHip, BoneLeftUpLeg);
        line(BoneLeftUpLeg, BoneLeftLeg);
        line(BoneLeftLeg, BoneLeftFoot);

        line(BoneHip, BoneRightUpLeg);
        line(BoneRightUpLeg, BoneRightLeg);
        line(BoneRightLeg, BoneRightFoot);
    }
}

void visuals::draw() {
    bool any = cfg::esp::box ||
               cfg::esp::name ||
               cfg::esp::nickname ||
               cfg::esp::health ||
               cfg::esp::distance ||
               cfg::esp::weapon ||
               cfg::esp::line ||
               cfg::esp::skeleton ||
               cfg::esp::flags ||
               cfg::esp::dropped_items;
    if (!any) return;

    uint64_t PlayerManager = get_player_manager();
    if (!PlayerManager) return;

    uint64_t LocalPlayer = rpm<uint64_t>(PlayerManager + oxorany(kOffPlayerManagerLocalPlayer));
    if (!LocalPlayer) return;

    matrix ViewMatrix = player::view_matrix(LocalPlayer);
    Vector3 LocalPosition = player::position(LocalPlayer);
    int LocalTeam = rpm<uint8_t>(LocalPlayer + oxorany(0x79));

    uint64_t PlayerList = rpm<uint64_t>(PlayerManager + oxorany(0x28));
    if (!PlayerList) return;

    int PlayerCount = rpm<int>(PlayerList + oxorany(0x20));
    if (PlayerCount <= 0 || PlayerCount > 64) return;

    uint64_t ListBuffer = rpm<uint64_t>(PlayerList + oxorany(0x18));
    if (!ListBuffer) return;

    for (int i = 0; i < PlayerCount; i++) {
        uint64_t Player = rpm<uint64_t>(ListBuffer + oxorany(0x30) + oxorany(0x18) * i);
        if (!Player || Player == LocalPlayer) continue;

        uint8_t PlayerTeam = rpm<uint8_t>(Player + oxorany(0x79));
        if (PlayerTeam == static_cast<uint8_t>(LocalTeam)) continue;

        Vector3 PlayerPosition = player::position(Player);
        if (PlayerPosition.x == 0.f && PlayerPosition.y == 0.f && PlayerPosition.z == 0.f) continue;

        int Health = player::health(Player);
        if (Health <= 0) continue;

        float Distance = calculate_distance(PlayerPosition, LocalPosition);
        if (Distance > 500.f) continue;

        Vector3 HeadPosition{};
        if (!player::bone_position(Player, 0, PlayerPosition, HeadPosition)) {
            HeadPosition = Vector3(PlayerPosition.x, PlayerPosition.y + 1.67f, PlayerPosition.z);
        }

        ImVec2 ScreenHead, ScreenFoot;
        bool HeadVisible = world_to_screen(HeadPosition, ViewMatrix, ScreenHead);
        bool FootVisible = world_to_screen(PlayerPosition, ViewMatrix, ScreenFoot);
        if (!HeadVisible || !FootVisible) continue;

        float x1 = roundf(ScreenHead.x);
        float y1 = roundf(fminf(ScreenHead.y, ScreenFoot.y));
        float x2 = roundf(ScreenFoot.x);
        float y2 = roundf(fmaxf(ScreenHead.y, ScreenFoot.y));

        float bh = fabsf(y2 - y1);
        float bw = roundf(bh * 0.25f);
        float cx = roundf((x1 + x2) * 0.5f);

        ImVec2 BoxMin(cx - bw, y1);
        ImVec2 BoxMax(cx + bw, y2);

        float inv_dist = 1.f / (Distance + 0.1f);
        float font_sz = std::clamp(400.f * inv_dist, 10.f, 18.f);

        if (cfg::esp::box) {
            dbox(BoxMin, BoxMax, 1.f);
        }

        if (cfg::esp::line) {
            dline(ImVec2(g_sw * 0.5f, g_sh - 2.f), ImVec2(cx, BoxMax.y), 1.f);
        }

        if (cfg::esp::skeleton) {
            draw_skeleton(Player, PlayerPosition, ViewMatrix);
        }

        if (cfg::esp::health) {
            dhp(Health, BoxMin, BoxMax, bh, 1.f);
        }

        if (cfg::esp::name || cfg::esp::nickname) {
            read_string PlayerName = player::name(Player);
            std::string ns = PlayerName.as_utf8();
            if (!ns.empty()) {
                dnick(ns.c_str(), BoxMin, cx, font_sz, 1.f);
            }
        }

        if (cfg::esp::weapon) {
            std::string wn = weapon_name(Player);
            if (!wn.empty()) {
                dweapon(wn.c_str(), BoxMax, cx, font_sz, 1.f);
            }
        }

        if (cfg::esp::distance) {
            ddist(Distance, BoxMax.x, BoxMin.y, font_sz, 1.f);
        }

        if (cfg::esp::flags) {
            dflags(Player, Distance, BoxMin, BoxMax, font_sz, 1.f);
        }
    }
}

void visuals::dbox(const ImVec2& t, const ImVec2& b, float a) {
    if (a < 0.01f) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();

    float x1 = t.x, y1 = t.y, x2 = b.x, y2 = b.y;
    float r = cfg::esp::box_rounding;

    ImU32 col = IM_COL32(
        static_cast<int>(cfg::esp::box_col.x * 255),
        static_cast<int>(cfg::esp::box_col.y * 255),
        static_cast<int>(cfg::esp::box_col.z * 255),
        static_cast<int>(cfg::esp::box_col.w * 255 * a)
    );

    if (cfg::esp::box_type == 0) {
        dl->AddRect(ImVec2(x1 + 2.f, y1 + 2.f), ImVec2(x2 + 2.f, y2 + 2.f), IM_COL32(0, 0, 0, (int)(100 * a)), r, 0, 2.f);
        dl->AddRect(ImVec2(x1 - 1.f, y1 - 1.f), ImVec2(x2 + 1.f, y2 + 1.f), IM_COL32(0, 0, 0, (int)(180 * a)), r, 0, 1.f);
        dl->AddRect(ImVec2(x1, y1), ImVec2(x2, y2), col, r, 0, 1.f);
    } else {
        float w = x2 - x1, h = y2 - y1;
        float sz = std::min(w, h) * 0.25f;
        float cr = std::min(r, sz * 0.5f);

        ImU32 s1 = IM_COL32(0, 0, 0, (int)(100 * a));
        ImU32 s2 = IM_COL32(0, 0, 0, (int)(180 * a));

        auto corner = [&](float cx, float cy, float dx, float dy) {
            if (cr > 0.5f) {
                float arc_cx = cx + dx * cr;
                float arc_cy = cy + dy * cr;

                float angle_start, angle_end;
                if (dx > 0 && dy > 0) { angle_start = 3.14159265f; angle_end = 4.71238898f; }
                else if (dx < 0 && dy > 0) { angle_start = 4.71238898f; angle_end = 6.28318530f; }
                else if (dx > 0 && dy < 0) { angle_start = 1.57079632f; angle_end = 3.14159265f; }
                else { angle_start = 0.f; angle_end = 1.57079632f; }

                dl->PathArcTo(ImVec2(arc_cx + 2.f * (dx > 0 ? 1 : -1), arc_cy + 2.f * (dy > 0 ? 1 : -1)), cr, angle_start, angle_end, 8);
                dl->PathStroke(s1, 0, 2.f);
                dl->AddLine(ImVec2(cx + dx * cr, cy + 2.f * (dy > 0 ? 1 : -1)), ImVec2(cx + dx * sz, cy + 2.f * (dy > 0 ? 1 : -1)), s1, 2.f);
                dl->AddLine(ImVec2(cx + 2.f * (dx > 0 ? 1 : -1), cy + dy * cr), ImVec2(cx + 2.f * (dx > 0 ? 1 : -1), cy + dy * sz), s1, 2.f);

                dl->PathArcTo(ImVec2(arc_cx, arc_cy), cr, angle_start, angle_end, 8);
                dl->PathStroke(s2, 0, 1.f);
                dl->AddLine(ImVec2(cx + dx * cr, cy), ImVec2(cx + dx * sz, cy), s2, 1.f);
                dl->AddLine(ImVec2(cx, cy + dy * cr), ImVec2(cx, cy + dy * sz), s2, 1.f);

                dl->PathArcTo(ImVec2(arc_cx, arc_cy), cr, angle_start, angle_end, 8);
                dl->PathStroke(col, 0, 1.f);
                dl->AddLine(ImVec2(cx + dx * cr, cy), ImVec2(cx + dx * sz, cy), col, 1.f);
                dl->AddLine(ImVec2(cx, cy + dy * cr), ImVec2(cx, cy + dy * sz), col, 1.f);
            } else {
                dl->AddLine(ImVec2(cx + 2.f * (dx > 0 ? 1 : -1), cy + 2.f * (dy > 0 ? 1 : -1)), ImVec2(cx + dx * sz + 2.f * (dx > 0 ? 1 : -1), cy + 2.f * (dy > 0 ? 1 : -1)), s1, 2.f);
                dl->AddLine(ImVec2(cx + 2.f * (dx > 0 ? 1 : -1), cy + 2.f * (dy > 0 ? 1 : -1)), ImVec2(cx + 2.f * (dx > 0 ? 1 : -1), cy + dy * sz + 2.f * (dy > 0 ? 1 : -1)), s1, 2.f);

                dl->AddLine(ImVec2(cx, cy), ImVec2(cx + dx * sz, cy), s2, 1.f);
                dl->AddLine(ImVec2(cx, cy), ImVec2(cx, cy + dy * sz), s2, 1.f);

                dl->AddLine(ImVec2(cx, cy), ImVec2(cx + dx * sz, cy), col, 1.f);
                dl->AddLine(ImVec2(cx, cy), ImVec2(cx, cy + dy * sz), col, 1.f);
            }
        };

        corner(x1, y1, 1, 1);
        corner(x2, y1, -1, 1);
        corner(x1, y2, 1, -1);
        corner(x2, y2, -1, -1);
    }
}

void visuals::dhp(int hp, const ImVec2& t, const ImVec2& b, float box_h, float a) {
    if (a < 0.01f) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();

    hp = std::clamp(hp, 0, 100);
    float pct = hp / 100.f;

    float bx = roundf(t.x - 6.f);
    float bw = 3.f;
    float bh = roundf(b.y - t.y);
    float fh = bh * pct;

    float top_y = t.y;
    float bot_y = b.y;
    float fill_top = roundf(bot_y - fh);

    dl->AddRectFilled(ImVec2(bx - 2.f, top_y - 2.f), ImVec2(bx + bw + 2.f, bot_y + 2.f), IM_COL32(0, 0, 0, (int)(120 * a)), 1.f);
    dl->AddRectFilled(ImVec2(bx - 1.f, top_y - 1.f), ImVec2(bx + bw + 1.f, bot_y + 1.f), IM_COL32(0, 0, 0, (int)(200 * a)), 0.f);
    dl->AddRect(ImVec2(bx - 1.f, top_y - 1.f), ImVec2(bx + bw + 1.f, bot_y + 1.f), IM_COL32(30, 30, 30, (int)(255 * a)), 0, 0, 1.f);

    ImU32 col_top = IM_COL32(
        static_cast<int>(cfg::esp::health_col.x * 255),
        static_cast<int>(cfg::esp::health_col.y * 255),
        static_cast<int>(cfg::esp::health_col.z * 255),
        static_cast<int>(cfg::esp::health_col.w * 255 * a)
    );
    ImU32 col_bot = IM_COL32(
        static_cast<int>(cfg::esp::health_col.x * 180),
        static_cast<int>(cfg::esp::health_col.y * 180),
        static_cast<int>(cfg::esp::health_col.z * 180),
        static_cast<int>(cfg::esp::health_col.w * 255 * a)
    );

    if (fh > 1.f) {
        dl->AddRectFilledMultiColor(ImVec2(bx, fill_top), ImVec2(bx + bw, bot_y), col_top, col_top, col_bot, col_bot);
    }

    if (hp < 100 && espFont && bh > 20.f) {
        char txt[8];
        snprintf(txt, sizeof(txt), "%d", hp);
        float fs = 10.f;
        ImVec2 ts = espFont->CalcTextSizeA(fs, FLT_MAX, 0.f, txt);
        float tx = roundf(bx + (bw - ts.x) * 0.5f);
        float ty = roundf(fill_top - ts.y * 0.5f);
        if (ty < top_y) ty = top_y;
        if (ty + ts.y > bot_y) ty = bot_y - ts.y;
        draw_text_outlined(dl, espFont, fs, ImVec2(tx, ty), IM_COL32(255, 255, 255, (int)(255 * a)), txt);
    }
}

void visuals::dnick(const char* name, const ImVec2& box_min, float cx, float sz, float a) {
    if (!espFont || a < 0.01f || !name) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();

    ImVec2 ts = espFont->CalcTextSizeA(sz, FLT_MAX, 0.f, name);
    ImVec2 tp(roundf(cx - ts.x * 0.5f), roundf(box_min.y - ts.y - 4.f));

    ImU32 col = IM_COL32(
        static_cast<int>(cfg::esp::name_col.x * 255),
        static_cast<int>(cfg::esp::name_col.y * 255),
        static_cast<int>(cfg::esp::name_col.z * 255),
        static_cast<int>(cfg::esp::name_col.w * 255 * a)
    );
    draw_text_outlined(dl, espFont, sz, tp, col, name);
}

void visuals::ddist(float dist, float x, float y, float sz, float a) {
    if (!espFont || a < 0.01f) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();

    char txt[16];
    snprintf(txt, sizeof(txt), "%dm", static_cast<int>(dist));

    ImVec2 tp(roundf(x + 5.f), roundf(y));

    ImU32 col = IM_COL32(
        static_cast<int>(cfg::esp::distance_col.x * 255),
        static_cast<int>(cfg::esp::distance_col.y * 255),
        static_cast<int>(cfg::esp::distance_col.z * 255),
        static_cast<int>(cfg::esp::distance_col.w * 255 * a)
    );
    draw_text_outlined(dl, espFont, sz, tp, col, txt);
}

void visuals::dline(const ImVec2& from, const ImVec2& to, float a) {
    if (a < 0.01f) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();

    ImU32 col = IM_COL32(
        static_cast<int>(cfg::esp::box_col.x * 255),
        static_cast<int>(cfg::esp::box_col.y * 255),
        static_cast<int>(cfg::esp::box_col.z * 255),
        static_cast<int>(cfg::esp::box_col.w * 255 * a)
    );

    dl->AddLine(from, to, IM_COL32(0, 0, 0, (int)(180 * a)), 2.f);
    dl->AddLine(from, to, col, 1.f);
}

void visuals::dweapon(const char* weapon, const ImVec2& box_max, float cx, float sz, float a) {
    if (!espFont || a < 0.01f || !weapon || !weapon[0]) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();
    ImVec2 ts = espFont->CalcTextSizeA(sz, FLT_MAX, 0.f, weapon);
    ImVec2 tp(roundf(cx - ts.x * 0.5f), roundf(box_max.y + 4.f));

    ImU32 col = IM_COL32(
        static_cast<int>(cfg::esp::distance_col.x * 255),
        static_cast<int>(cfg::esp::distance_col.y * 255),
        static_cast<int>(cfg::esp::distance_col.z * 255),
        static_cast<int>(cfg::esp::distance_col.w * 255 * a)
    );
    draw_text_outlined(dl, espFont, sz, tp, col, weapon);
}

void visuals::dflags(uint64_t player_ptr, float dist, const ImVec2& box_min, const ImVec2& box_max, float sz, float a) {
    if (!espFont || a < 0.01f) return;

    std::vector<std::string> flags;

    std::string os = os_flag(player_ptr);
    if (!os.empty()) flags.push_back(os);

    if (is_host_player(player_ptr)) flags.emplace_back("HOST");

    uint64_t weapon = 0;
    int weapon_id = -1;
    get_weapon_chain(player_ptr, weapon, weapon_id);

    if (is_bomber_player(player_ptr, weapon_id)) flags.emplace_back("BOMB");

    int money = 0;
    if (read_property_int(player_ptr, "money", money) && money >= 0 && money <= 1000000) {
        char buf[24];
        std::snprintf(buf, sizeof(buf), "$%d", money);
        flags.emplace_back(buf);
    }

    {
        char buf[24];
        std::snprintf(buf, sizeof(buf), "%dm", static_cast<int>(dist));
        flags.emplace_back(buf);
    }

    if (is_firing_player(player_ptr, weapon)) flags.emplace_back("FIRE");
    if (is_aiming_player(player_ptr, weapon)) flags.emplace_back("AIM");
    if (is_reloading_player(player_ptr, weapon)) flags.emplace_back("RELOAD");

    int ping = 0;
    if (read_property_int(player_ptr, "ping", ping) && ping >= 0 && ping <= 1000) {
        char buf[24];
        std::snprintf(buf, sizeof(buf), "%dms", ping);
        flags.emplace_back(buf);
    }

    if (flags.empty()) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();
    if (!dl) return;

    ImU32 col = col_from_vec4(cfg::esp::flags_col, a);
    float x = roundf(box_max.x + 5.f);
    float y = roundf(box_min.y);
    float step = std::max(10.f, sz + 1.f);

    for (const std::string& flag : flags) {
        draw_text_outlined(dl, espFont, sz, ImVec2(x, y), col, flag.c_str());
        y += step;
    }
}

void visuals::draw_text_outlined(ImDrawList* dl, ImFont* font, float size, const ImVec2& pos, ImU32 color, const char* text) {
    if (!font || !dl) return;

    int a = (color >> IM_COL32_A_SHIFT) & 0xFF;
    int s1 = static_cast<int>(a * 0.4f);
    int s2 = static_cast<int>(a * 0.7f);

    dl->AddText(font, size, ImVec2(pos.x + 2.f, pos.y + 2.f), IM_COL32(0, 0, 0, s1), text);
    dl->AddText(font, size, ImVec2(pos.x + 1.f, pos.y + 1.f), IM_COL32(0, 0, 0, s2), text);
    dl->AddText(font, size, pos, color, text);
}
