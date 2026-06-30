#include "aim.hpp"
#include "../game/game.hpp"
#include "../game/math.hpp"
#include "../game/player.hpp"
#include "../ui/cfg.hpp"
#include "../protect/oxorany.hpp"
#include "imgui.h"
#include <cmath>
#include <algorithm>
#include <cstring>
#include <string>

namespace {
    static constexpr float kPi = AIMBOT_PI;
    static constexpr float kVerticalFovDeg = AIMBOT_VERTICAL_FOV_DEG;
    static constexpr uint64_t kOffPlayerManagerLocalPlayer = OFF_PM_LOCAL_PLAYER;
    static constexpr uint64_t kOffPlayerAimController = OFF_PLAYER_AIM_CONTROLLER;
    static constexpr uint64_t kOffAimControllerAimingData = OFF_AIM_CONTROLLER_DATA;
    // v0.39.1: AimingData fields — Vector3 @ 0x18 and Vector3 @ 0x24
    static constexpr uint64_t kOffAimingDataPitch = OFF_AIMDATA_PITCH;
    static constexpr uint64_t kOffAimingDataYaw = OFF_AIMDATA_YAW;
    static constexpr uint64_t kOffAimingDataPitchYawVec3 = OFF_AIMDATA_PITCH_YAW_VEC3;
    static constexpr uint64_t kOffAimingDataSecondVec3 = OFF_AIMDATA_SECOND_VEC3;

    static constexpr uint64_t kOffLocalPlayerMainCamera = OFF_PLAYER_MAIN_CAMERA;
    static constexpr uint64_t kOffPlayerMainCameraCamera = OFF_CAM_TRANSFORM;
    static constexpr uint64_t kOffPlayerMainCameraMainCamera = OFF_PLAYER_MAIN_CAM_DATA;
    static constexpr uint64_t kOffCameraMovementControllerCamera = OFF_CAM_MOVEMENT_CTRL;
    static constexpr uint64_t kOffCameraNativeCamera = OFF_CAM_NATIVE;
    static constexpr uint64_t kOffNativeCameraAspectRatio = OFF_NATIVE_CAM_ASPECT;
    static constexpr uint64_t kOffNativeCameraFov = OFF_NATIVE_CAM_FOV_FIELD;

    static bool likely_ptr(uint64_t p) {
        return p > 0x10000ull && p < 0x0000FFFFFFFFFFFFull;
    }

    static float fov_radius_px(float fov_deg, float screen_h) {
        if (screen_h <= 0.f) return 0.f;

        float clamped_fov = std::clamp(fov_deg, 1.f, 179.f);
        float half_vertical = (kVerticalFovDeg * 0.5f) * (kPi / 180.f);
        float half_oim = (clamped_fov * 0.5f) * (kPi / 180.f);

        float tan_vertical = std::tan(half_vertical);
        if (std::fabs(tan_vertical) < 0.00001f) return 0.f;

        return ((screen_h * 0.5f) / tan_vertical) * std::tan(half_oim);
    }

    static Vector3 target_fallback(const Vector3& p, int bone_mode) {
        if (bone_mode == 2) {
            return Vector3(p.x, p.y + 1.05f, p.z);
        }
        return Vector3(p.x, p.y + 1.67f, p.z);
    }

    static Vector3 target_point(uint64_t player_ptr, const Vector3& p) {
        int bone_mode = (cfg::aim::target == 1) ? 2 : 0;
        Vector3 bone{};

        if (player::bone_position(player_ptr, bone_mode, p, bone)) {
            return bone;
        }

        return target_fallback(p, bone_mode);
    }

    static float normalize_yaw(float yaw) {
        while (yaw > 180.f) yaw -= 360.f;
        while (yaw < -180.f) yaw += 360.f;
        return yaw;
    }

    static float angle_delta(float target, float current) {
        return normalize_yaw(target - current);
    }

    static float smooth_angle(float current, float target, float smooth) {
        return normalize_yaw(current + angle_delta(target, current) * smooth);
    }

    static bool find_int_property(uint64_t player_ptr, const char* tag, int& out_value) {
        uint64_t photon_player = player::photon_ptr(player_ptr);
        if (!photon_player) return false;

        uint64_t properties_registry = rpm<uint64_t>(photon_player + oxorany(0x38));
        if (!properties_registry) return false;

        int count = rpm<int>(properties_registry + oxorany(0x20));
        if (count <= 0 || count > 128) return false;

        uint64_t properties_list = rpm<uint64_t>(properties_registry + oxorany(0x18));
        if (!properties_list) return false;

        for (int i = 0; i < count; i++) {
            uint64_t key = rpm<uint64_t>(properties_list + oxorany(0x28) + oxorany(0x18) * i);
            uint64_t value = rpm<uint64_t>(properties_list + oxorany(0x30) + oxorany(0x18) * i);
            if (!key || !value) continue;

            std::string key_string = rpm<read_string>(key).as_utf8();
            if (key_string.empty()) continue;

            if (std::strstr(key_string.c_str(), tag)) {
                out_value = rpm<int>(value + oxorany(0x10));
                return true;
            }
        }

        return false;
    }

    static bool pass_visible_check(uint64_t player_ptr) {
        if (!cfg::aim::visible_check) return true;

        int state = player::visibility_state(player_ptr);
        if (state == 2) return true;
        if (state == 1) return false;

        int value = 0;

        if (find_int_property(player_ptr, "visible", value) ||
            find_int_property(player_ptr, "Visible", value) ||
            find_int_property(player_ptr, "isVisible", value) ||
            find_int_property(player_ptr, "is_visible", value)) {
            return value != 0;
        }

        if (find_int_property(player_ptr, "occluded", value) ||
            find_int_property(player_ptr, "Occluded", value) ||
            find_int_property(player_ptr, "isOccluded", value)) {
            return value == 0;
        }

        // If the property is not found in this build, don't block targeting.
        return true;
    }
}

void aim::run() {
    if (!cfg::aim::enabled) return;
    float smooth_setting = std::clamp(cfg::aim::smooth, 0.f, 1.f);
    bool hard_lock_mode = smooth_setting <= 0.0001f;

    uint64_t PlayerManager = get_player_manager();
    if (!PlayerManager) return;

    uint64_t LocalPlayer = rpm<uint64_t>(PlayerManager + oxorany(kOffPlayerManagerLocalPlayer));
    if (!LocalPlayer) return;

    matrix ViewMatrix = player::view_matrix(LocalPlayer);
    Vector3 LocalPosition = player::position(LocalPlayer);
    int LocalTeam = rpm<uint8_t>(LocalPlayer + oxorany(OFF_PLAYER_TEAM));

    uint64_t PlayerList = rpm<uint64_t>(PlayerManager + oxorany(OFF_PM_PLAYER_LIST));
    if (!PlayerList) return;

    int PlayerCount = rpm<int>(PlayerList + oxorany(OFF_LIST_COUNT));
    if (PlayerCount <= 0 || PlayerCount > 64) return;

    uint64_t ListBuffer = rpm<uint64_t>(PlayerList + oxorany(OFF_LIST_BUFFER));
    if (!ListBuffer) return;

    const ImVec2 center(g_sw * 0.5f, g_sh * 0.5f);
    const float radius = fov_radius_px(cfg::aim::fov, g_sh);
    float best_dist = radius + 1.f;
    ImVec2 best_screen(0.f, 0.f);
    Vector3 best_target_world(0.f, 0.f, 0.f);
    bool found = false;

    for (int i = 0; i < PlayerCount; i++) {
        uint64_t Player = rpm<uint64_t>(ListBuffer + oxorany(OFF_LIST_ENTRY_BASE) + oxorany(OFF_LIST_ENTRY_STRIDE) * i);
        if (!Player || Player == LocalPlayer) continue;

        uint8_t PlayerTeam = rpm<uint8_t>(Player + oxorany(OFF_PLAYER_TEAM));
        if (PlayerTeam == static_cast<uint8_t>(LocalTeam)) continue;

        int Health = player::health(Player);
        if (Health <= 0) continue;

        Vector3 Position = player::position(Player);
        if (Position.x == 0.f && Position.y == 0.f && Position.z == 0.f) continue;

        float Distance = calculate_distance(Position, LocalPosition);
        if (Distance > cfg::aim::max_distance) continue;
        if (!pass_visible_check(Player)) continue;

        Vector3 TargetPoint = target_point(Player, Position);
        ImVec2 ScreenPos;
        if (!world_to_screen(TargetPoint, ViewMatrix, ScreenPos)) continue;

        float dx = ScreenPos.x - center.x;
        float dy = ScreenPos.y - center.y;
        float dist_to_center = std::sqrt(dx * dx + dy * dy);

        if (dist_to_center <= radius && dist_to_center < best_dist) {
            best_dist = dist_to_center;
            best_screen = ScreenPos;
            best_target_world = TargetPoint;
            found = true;
        }
    }

    if (!found) return;

    ImDrawList* dl = ImGui::GetBackgroundDrawList();
    if (!dl) return;

    if (cfg::aim::lock_line) {
        dl->AddLine(center, best_screen, IM_COL32(0, 0, 0, 180), 2.f);
        dl->AddLine(center, best_screen, IM_COL32(255, 255, 255, 220), 1.f);
    }

    if (cfg::aim::lock_dot) {
        dl->AddCircleFilled(best_screen, 3.5f, IM_COL32(255, 255, 255, 230), 12);
        dl->AddCircle(best_screen, 5.5f, IM_COL32(0, 0, 0, 170), 14, 1.f);
    }

    if (kOffAimingDataPitch == 0 || kOffAimingDataYaw == 0 || kOffAimingDataPitchYawVec3 == 0 || kOffAimingDataSecondVec3 == 0) return;

    uint64_t aim_controller = rpm<uint64_t>(LocalPlayer + oxorany(kOffPlayerAimController));
    if (!aim_controller) return;

    uint64_t aiming_data = rpm<uint64_t>(aim_controller + oxorany(kOffAimControllerAimingData));
    if (!aiming_data) return;

    Vector3 cam_pos = Vector3(LocalPosition.x, LocalPosition.y + 1.67f, LocalPosition.z);
    float dx = best_target_world.x - cam_pos.x;
    float dy = best_target_world.y - cam_pos.y;
    float dz = best_target_world.z - cam_pos.z;
    float dist = std::sqrt(dx * dx + dy * dy + dz * dz);
    if (dist < 0.001f) return;

    const float rad2deg = 57.2957795f;
    float s = std::clamp(dy / dist, -1.f, 1.f);
    float pitch = -std::asin(s) * rad2deg;
    float yaw = std::atan2(dx, dz) * rad2deg;
    yaw = normalize_yaw(yaw);

    float out_pitch = pitch;
    float out_yaw = yaw;

    if (!hard_lock_mode) {
        float cur_pitch = rpm<float>(aiming_data + oxorany(kOffAimingDataPitch));
        float cur_yaw = normalize_yaw(rpm<float>(aiming_data + oxorany(kOffAimingDataYaw)));

        float smooth = std::clamp(smooth_setting, 0.0001f, 1.f);
        out_pitch = cur_pitch + (pitch - cur_pitch) * smooth;
        out_yaw = smooth_angle(cur_yaw, yaw, smooth);
    }

    float vec[3] = { out_pitch, out_yaw, 0.f };

    wpm<float>(aiming_data + oxorany(kOffAimingDataPitch), out_pitch);
    wpm<float>(aiming_data + oxorany(kOffAimingDataYaw), out_yaw);
    mem_write(aiming_data + oxorany(kOffAimingDataPitchYawVec3), vec, sizeof(vec));
    mem_write(aiming_data + oxorany(kOffAimingDataSecondVec3), vec, sizeof(vec));
}

void aim::aspect_ratio() {
    if (!cfg::aim::aspect_ratio) return;

    uint64_t player_manager = get_player_manager();
    if (!likely_ptr(player_manager)) return;

    uint64_t local_player = rpm<uint64_t>(player_manager + oxorany(kOffPlayerManagerLocalPlayer));
    if (!likely_ptr(local_player)) return;

    uint64_t player_main_camera = rpm<uint64_t>(local_player + oxorany(kOffLocalPlayerMainCamera));
    if (!likely_ptr(player_main_camera)) return;

    uint64_t camera = rpm<uint64_t>(player_main_camera + oxorany(kOffPlayerMainCameraCamera));
    if (!likely_ptr(camera)) {
        uint64_t main_camera = rpm<uint64_t>(player_main_camera + oxorany(kOffPlayerMainCameraMainCamera));
        if (likely_ptr(main_camera)) {
            camera = rpm<uint64_t>(main_camera + oxorany(kOffCameraMovementControllerCamera));
        }
    }
    if (!likely_ptr(camera)) return;

    uint64_t native_camera = rpm<uint64_t>(camera + oxorany(kOffCameraNativeCamera));
    if (!likely_ptr(native_camera)) return;

    float aspect = cfg::aim::aspect_stretch
        ? std::clamp(cfg::aim::aspect_stretch_value, 0.50f, 2.00f)
        : std::clamp(cfg::aim::aspect_value, 0.50f, 3.00f);
    wpm<float>(native_camera + oxorany(kOffNativeCameraAspectRatio), aspect);
    wpm<float>(native_camera + oxorany(kOffNativeCameraFov), 59.9f);
}

void aim::draw_fov(ImDrawList* draw, float screen_w, float screen_h) {
    if (!draw || !cfg::aim::enabled || !cfg::aim::fov_display || screen_w <= 0.f || screen_h <= 0.f) return;

    float cx = screen_w * 0.5f;
    float cy = screen_h * 0.5f;
    float radius = fov_radius_px(cfg::aim::fov, screen_h);

    draw->AddCircle(ImVec2(cx, cy), radius, IM_COL32(0, 0, 0, 130), 64, 2.f);
    draw->AddCircle(ImVec2(cx, cy), radius, IM_COL32(255, 255, 255, 180), 64, 1.f);
}
