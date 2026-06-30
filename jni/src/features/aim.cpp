#include "aim.h"
#include "aimbot.hpp"
#include "../memory/memory.h"
#include <cmath>
#include <algorithm>
#include "../dependencies/draw/draw.h"
#include "../ui/common.h"
#include "../utils/entity/game_utils.h"
#include "../utils/entity/player.h"
#include "../utils/offsets/offsets.h"

#define _(x) x

void aimbot::aim_start()
{
    if (!vars::aimbot::enabled)
        return;

    player_manager manager = get_player_manager();
    if (!manager.is_valid())
        return;

    local_player local = manager.get_local_player();
    if (!local.is_valid())
        return;

    static int lastWeapon = 0;
    static float lastPitch = 0.0f;
    static float lastYaw = 0.0f;
    
    int currentWeaponID = 0;
    auto weaponryController = memory_utils::read<uint64_t>(local.base_ + offsets::fields::weaponry_controller);
    if (weaponryController) {
        auto weaponController = memory_utils::read<uint64_t>(weaponryController + offsets::fields::weapon_controller);
        if (weaponController) {
            auto weaponParameters = memory_utils::read<uint64_t>(weaponController + offsets::fields::weapon_parameters);
            if (weaponParameters) {
                currentWeaponID = memory_utils::read<int>(weaponParameters + offsets::fields::weapon_id);
            }
        }
    }

    if (vars::aimbot::draw_fov) {
        const auto displayInfo = draw::getDisplayInfo();
        ImVec2 screenCenter(displayInfo.width / 2.0f, displayInfo.height / 2.0f);

        ImU32 base_color = IM_COL32(
            (int)(vars::aimbot::fov_color[0] * 255.0f),
            (int)(vars::aimbot::fov_color[1] * 255.0f),
            (int)(vars::aimbot::fov_color[2] * 255.0f),
            (int)(vars::aimbot::fov_color[3] * 255.0f)
        );

        ImGui::GetBackgroundDrawList()->AddCircle(
            screenCenter,
            vars::aimbot::Fov::radius,
            base_color,
            100,
            1.0f
        );
    }

    uint64_t pAimController = memory_utils::read<uint64_t>(local.base_ + offsets::fields::aim_controller);
    if (!pAimController)
        return;

    uint64_t pAimingData = memory_utils::read<uint64_t>(pAimController + offsets::fields::aiming_data);
    if (!pAimingData)
        return;

    // Angles: view at 0x18/0x1C, shot at 0x24/0x28.
    constexpr uint32_t kViewPitch = 0x18;
    constexpr uint32_t kViewYaw = 0x1C;
    constexpr uint32_t kShotPitch = 0x24;
    constexpr uint32_t kShotYaw = 0x28;

    float currentPitch = memory_utils::read<float>(pAimingData + kViewPitch);
    float currentYaw = memory_utils::read<float>(pAimingData + kViewYaw);
    float smoothPitch = vars::aimbot::Smooth::pitch;

    bool weaponChanged = (currentWeaponID != lastWeapon);
    
    float pitchDelta = std::abs(currentPitch - lastPitch);
    float yawDelta = std::abs(currentYaw - lastYaw);
    if (yawDelta > 180.0f)
        yawDelta = 360.0f - yawDelta;
    
    bool angleJump = (pitchDelta > 45.0f || yawDelta > 45.0f);
    
    if (weaponChanged || angleJump) {
        lastWeapon = currentWeaponID;
        lastPitch = currentPitch;
        lastYaw = currentYaw;
        return;
    }

    uint64_t pMainCameraHolder = memory_utils::read<uint64_t>(local.base_ + offsets::fields::player_main_camera_holder);
    if (!pMainCameraHolder)
        return;

    uint64_t pPlayerList = manager.get_players_list();
    if (!pPlayerList)
        return;

    vector3 vMainCameraHolder = game_utils::get_position(pMainCameraHolder);

    int nLocalTeam = local.get_team();
    int nPlayerListSize = manager.get_players_count();

    vector3 vecBestTarget{};
    float fBestDistance = 99999.0f;
    bool bFoundTarget = false;

    matrix viewMatrix = local.get_view_matrix();

    for (int i{}; i < nPlayerListSize; ++i) {
        player currentPlayer = manager.get_player(i);
        if (!currentPlayer.is_valid())
            continue;

        if (currentPlayer.get_team() == nLocalTeam)
            continue;

        int nPlayerHealth = currentPlayer.get_health();
        if (nPlayerHealth <= 0)
            continue;

        if (vars::aimbot::visible_check) {
            uint64_t pObjectOccludee = memory_utils::read<uint64_t>(currentPlayer.base_ + offsets::fields::player_occlusion_controller);
            if (!pObjectOccludee)
                continue;

            int visibilityState = memory_utils::read<int>(pObjectOccludee + _(0x34));
            int occlusionState = memory_utils::read<int>(pObjectOccludee + _(0x38));

            bool bIsVisible = (visibilityState == 2 && occlusionState != 1);
            if (!bIsVisible)
                continue;
        }

        uint64_t pPlayerCharacterView = memory_utils::read<uint64_t>(currentPlayer.base_ + offsets::fields::player_character_view);
        if (!pPlayerCharacterView)
            continue;

        uint64_t pBipedMap = memory_utils::read<uint64_t>(pPlayerCharacterView + offsets::fields::pbipedmap);
        if (!pBipedMap)
            continue;

        uintptr_t hitboxOffset = 0;
        switch (vars::aimbot::Hitbox::type) {
            case 0: hitboxOffset = _(0x20); break;
            case 1: hitboxOffset = _(0x28); break;
            case 2: hitboxOffset = _(0x30); break;
            case 3: hitboxOffset = _(0x88); break;
            default: hitboxOffset = _(0x20); break;
        }

        uint64_t pHitbox = memory_utils::read<uint64_t>(pBipedMap + hitboxOffset);
        if (!pHitbox)
            continue;

        vector3 vHitPos = game_utils::get_position(pHitbox);

        float screenDistance = 99999.0f;
        if (vars::aimbot::Fov::check) {
            vector3 screenPos = Aimbot::worldToScreen3(viewMatrix, vHitPos);
            if (screenPos.z > 0.0f) {
                const auto displayInfo = draw::getDisplayInfo();
                float screenCenterX = displayInfo.width / 2.0f;
                float screenCenterY = displayInfo.height / 2.0f;
                float dx = screenPos.x - screenCenterX;
                float dy = screenPos.y - screenCenterY;
                screenDistance = std::sqrt(dx * dx + dy * dy);
            }
        }

        if (!vars::aimbot::Fov::check || screenDistance <= vars::aimbot::Fov::radius) {
            if (screenDistance < fBestDistance) {
                fBestDistance = screenDistance;
                vecBestTarget = vHitPos;
                bFoundTarget = true;
            }
        }
    }

    if (bFoundTarget && vecBestTarget != vector3(0.f, 0.f, 0.f)) {
        vector3 direction = vecBestTarget - vMainCameraHolder;
        float distance = direction.length();
        
        if (distance > 0.0001f) {
            float pitch = -asin(direction.y / distance) * (180.0f / M_PI);
            float yaw = atan2(direction.x, direction.z) * (180.0f / M_PI);
            
            while (yaw > 180.0f) yaw -= 360.0f;
            while (yaw < -180.0f) yaw += 360.0f;

            float smoothFactor;
            
            if (smoothPitch <= 0.1f) {
                smoothFactor = 1.0f;
            } else if (smoothPitch <= 1.0f) {
                smoothFactor = 0.7f + (0.3f * smoothPitch);
            } else if (smoothPitch <= 5.0f) {
                smoothFactor = 0.2f + (0.5f * (5.0f - smoothPitch)) / 4.0f;
            } else {
                float normalizedSmooth = (smoothPitch - 5.0f) / 15.0f;
                smoothFactor = 0.2f * (1.0f - normalizedSmooth) + 0.01f * normalizedSmooth;
            }

            float pitchDelta = pitch - currentPitch;
            float yawDelta = yaw - currentYaw;
            if (yawDelta > 180.0f) yawDelta -= 360.0f;
            if (yawDelta < -180.0f) yawDelta += 360.0f;

            float deltaLength = std::sqrt(pitchDelta * pitchDelta + yawDelta * yawDelta);
            if (deltaLength > 10.0f && smoothPitch > 0.1f) {
                smoothFactor *= 0.7f;
            } else if (deltaLength < 2.0f && smoothPitch > 0.1f) {
                smoothFactor *= 0.9f;
            }
            
            float smoothedPitch = currentPitch + pitchDelta * smoothFactor;
            float smoothedYaw = currentYaw + yawDelta * smoothFactor;
            
            smoothedPitch = std::clamp(smoothedPitch, -89.0f, 89.0f);

            memory_utils::write<float>(pAimingData + kViewPitch, smoothedPitch);
            memory_utils::write<float>(pAimingData + kViewYaw, smoothedYaw);
            memory_utils::write<float>(pAimingData + kShotPitch, smoothedPitch);
            memory_utils::write<float>(pAimingData + kShotYaw, smoothedYaw);
            lastPitch = smoothedPitch;
            lastYaw = smoothedYaw;
        }
    }

    lastWeapon = currentWeaponID;
}

aimbot::aimbot(uint64_t libunity_base) : libunity_base_(libunity_base) {}

player_manager aimbot::get_player_manager() const
{
    uint64_t root = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    uint64_t level1 = memory_utils::read<uint64_t>(root + offsets::fields::PlayerManager_ptr1);
    uint64_t level2 = memory_utils::read<uint64_t>(level1 + offsets::fields::PlayerManager_ptr2);
    uint64_t manager_base = memory_utils::read<uint64_t>(level2 + offsets::fields::PlayerManager_ptr3);
    return player_manager(manager_base);
}
