#include "esp.h"
#include "../memory/memory.h"
#include "../dependencies/ANativeWindowCreator.h"
#include <cmath>
#include <cstdio>
#include <iostream>
#include "../dependencies/draw/draw.h"
#include <array>
#include <algorithm>
#include "../utils/entity/game_utils.h"
#include <map>
#include "../ui/common.h"
#include "../ui/icons.h"
#include "../ui/gui/settings/colors.h"
#include "../utils/offsets/offsets.h"
#include "../../dependencies/resources/fonts.h"
#include <vector>

esp_renderer::esp_renderer(uint64_t libunity_base) : libunity_base_(libunity_base) {}

void esp_renderer::render_esp()
{
    if (!vars::esp::enabled)
        return;

    player_manager manager = get_player_manager();
    if (!manager.is_valid())
    {
        return;
    }

    local_player local = manager.get_local_player();
    if (!local.is_valid())
    {
        return;
    }

    matrix view_matrix = local.get_view_matrix();

    int player_count = manager.get_players_count();
    auto displayInfo = draw::getDisplayInfo();
    const float screen_w = static_cast<float>(displayInfo.width);
    const float screen_h = static_cast<float>(displayInfo.height);
    const float max_box_height = screen_h * 3.0f; // sanity to avoid runaway boxes
    const ImU32 theme_accent = ImGui::ColorConvertFloat4ToU32(clr->accent.Value);

    for (int i = 0; i < player_count; ++i)
    {
        player current_player = manager.get_player(i);
        if (!current_player.is_valid())
            continue;

        auto sanitize_world = [](const vector3& vec) {
            constexpr float kMaxCoord = 100000.0f;
            if (!std::isfinite(vec.x) || !std::isfinite(vec.y) || !std::isfinite(vec.z))
                return vector3::zero();
            if (std::abs(vec.x) > kMaxCoord || std::abs(vec.y) > kMaxCoord || std::abs(vec.z) > kMaxCoord)
                return vector3::zero();
            return vec;
        };

        vector3 position = sanitize_world(current_player.get_position());

        // Use fixed world offsets for box sizing to avoid dynamic bone-based scaling.
        vector3 head_position = sanitize_world(position + vector3(0.0f, 1.67f, 0.0f));
        vector3 foot_position = position;
        if (position == vector3::zero())
            continue;

        if (current_player.get_team() == local.get_team())
            continue;

        if (current_player.get_health() <= 0)
            continue;

        vector2 screen_top;
        vector2 screen_bottom;

        auto sanitize_screen = [](const vector2& vec) {
            constexpr float kMaxScreenCoord = 200000.0f;
            return std::isfinite(vec.x) && std::isfinite(vec.y) &&
                   std::abs(vec.x) < kMaxScreenCoord && std::abs(vec.y) < kMaxScreenCoord;
        };

        bool has_screen = foot_position.world_to_screen(view_matrix, screen_bottom) && head_position.world_to_screen(view_matrix, screen_top);
        if (!has_screen) {
            vector3 fallback_head = position + vector3(0.0f, 1.67f, 0.0f);
            vector3 fallback_foot = position;
            if (!fallback_foot.world_to_screen(view_matrix, screen_bottom) || !fallback_head.world_to_screen(view_matrix, screen_top))
                continue;
        }

        if (!sanitize_screen(screen_top) || !sanitize_screen(screen_bottom))
            continue;

        // Reject invalid projections that would create absurd boxes
        if (!std::isfinite(screen_top.x) || !std::isfinite(screen_top.y) || !std::isfinite(screen_bottom.x) || !std::isfinite(screen_bottom.y))
            continue;

        screen_top.x = std::floor(screen_top.x);
        screen_top.y = std::floor(screen_top.y);
        screen_bottom.x = std::floor(screen_bottom.x);
        screen_bottom.y = std::floor(screen_bottom.y);

        float screen_width = 0.0f;
        float screen_height = 0.0f;
        math_utils::get_screen_size(screen_width, screen_height);

        float min_x = std::min(screen_top.x, screen_bottom.x);
        float max_x = std::max(screen_top.x, screen_bottom.x);
        float height = std::abs(screen_top.y - screen_bottom.y);
        if (height < 2.0f || height > screen_height * 2.0f)
            continue;
        // Slightly wider box for better readability.
        float width = height / 2.8f;
        if (width <= 0.0f || width > screen_width * 2.0f)
            continue;

        if (height < 2.0f || height > max_box_height)
            continue;

        ImVec2 box_min(min_x - width, std::min(screen_top.y, screen_bottom.y));
        ImVec2 box_max(max_x + width, std::max(screen_top.y, screen_bottom.y));

        box_min.x = std::floor(box_min.x);
        box_min.y = std::floor(box_min.y);
        box_max.x = std::floor(box_max.x);
        box_max.y = std::floor(box_max.y);

        // Box uses theme accent for consistent styling.
        ImU32 rect_color = theme_accent;
        ImU32 health_bar_color = ImGui::ColorConvertFloat4ToU32(clr->accent.Value);
        ImU32 name_color = ImGui::ColorConvertFloat4ToU32(clr->accent.Value);
        ImU32 weapon_color = ImGui::ColorConvertFloat4ToU32(clr->accent.Value);
        ImColor skeleton_color = clr->accent;

        if (vars::esp::rect)
            draw_box(box_min, box_max, rect_color);

        if (vars::esp::health_bar)
            draw_health_bar(box_min, box_max, health_bar_color, current_player.get_health());

        const std::string player_name = current_player.get_name().get_string();
        const std::string weapon_name = current_player.get_weapon_name().get_string();

        ImU32 line_color = theme_accent;
        if (vars::esp::line)
            draw_line_to_box(box_min, box_max, line_color);

        float boxHeight = box_max.y - box_min.y;
        if (vars::esp::skeleton)
            draw_skeleton(current_player, view_matrix, skeleton_color, boxHeight);

        float distance = (local.get_position() - position).length();
        const int money = current_player.get_money();
        const int ping = current_player.get_ping();

        // Consolidated info panel above ESP box.
        draw_info_panel(box_min, box_max,
                        vars::esp::name ? player_name : std::string{},
                        vars::esp::weapon ? weapon_name : std::string{},
                        vars::esp::flag_ping ? ping : -1,
                        vars::esp::flag_money ? money : -1,
                        vars::esp::flag_distance ? distance : -1.0f,
                        current_player.get_health());
    }

    if (vars::esp::bomb) {
        draw_bomb(view_matrix, local);
    }
}

player_manager esp_renderer::get_player_manager() const
{
    uint64_t root = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::player_manager);
    uint64_t level1 = memory_utils::read<uint64_t>(root + offsets::fields::PlayerManager_ptr1);
    uint64_t level2 = memory_utils::read<uint64_t>(level1 + offsets::fields::PlayerManager_ptr2);
    uint64_t manager_base = memory_utils::read<uint64_t>(level2 + offsets::fields::PlayerManager_ptr3);
    return player_manager(manager_base);
}

void esp_renderer::draw_box(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color) const
{
    auto draw_list = ImGui::GetBackgroundDrawList();

    const bool fill = vars::esp::box_fill;
    const int type = vars::esp::box_type;
    const ImColor fill_color = ImColor(color.Value.x, color.Value.y, color.Value.z, color.Value.w * 0.3f); // subtle fill

    if (type == 1) { // Corner only
        const float len = 8.0f;
        const float thickness = 2.0f;
        if (fill)
            draw_list->AddRectFilled(box_min, box_max, fill_color, 0.0f);
        // Top left
        draw_list->AddLine(ImVec2(box_min.x, box_min.y), ImVec2(box_min.x + len, box_min.y), color, thickness);
        draw_list->AddLine(ImVec2(box_min.x, box_min.y), ImVec2(box_min.x, box_min.y + len), color, thickness);
        // Top right
        draw_list->AddLine(ImVec2(box_max.x, box_min.y), ImVec2(box_max.x - len, box_min.y), color, thickness);
        draw_list->AddLine(ImVec2(box_max.x, box_min.y), ImVec2(box_max.x, box_min.y + len), color, thickness);
        // Bottom left
        draw_list->AddLine(ImVec2(box_min.x, box_max.y), ImVec2(box_min.x + len, box_max.y), color, thickness);
        draw_list->AddLine(ImVec2(box_min.x, box_max.y), ImVec2(box_min.x, box_max.y - len), color, thickness);
        // Bottom right
        draw_list->AddLine(ImVec2(box_max.x, box_max.y), ImVec2(box_max.x - len, box_max.y), color, thickness);
        draw_list->AddLine(ImVec2(box_max.x, box_max.y), ImVec2(box_max.x, box_max.y - len), color, thickness);
    } else if (type == 2) { // Round
        const float rounding = 4.0f;
        if (fill)
            draw_list->AddRectFilled(box_min, box_max, fill_color, rounding);
        draw_list->AddRect(box_min, box_max, color, rounding, 0, 1.5f);
    } else { // Default
        if (fill)
            draw_list->AddRectFilled(box_min, box_max, fill_color, 0.0f);
        draw_list->AddRect(box_min, box_max, ImColor(0, 0, 0), 0.0f, 0, 2.f);
        draw_list->AddRect(box_min, box_max, color, 0.0f, 0, 1.f);
    }

}

void esp_renderer::draw_name(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color, std::string name) const
{
    ImDrawList *draw_list = ImGui::GetBackgroundDrawList();
    
    ImFont* activeFont = ImGui::GetFont();
    float textScale = 0.65f;
    float fontSize = ImGui::GetFontSize() * textScale;

    ImVec2 textSize = ImGui::CalcTextSize(name.c_str());
    textSize.y *= textScale;
    textSize.x *= textScale;

    ImVec2 textPos = ImVec2((box_min.x + box_max.x) * 0.5f, box_min.y - textSize.y - 5.f);

    textPos.x -= textSize.x * 0.5f;

    for (int i = -1; i <= 1; ++i)
    {
        for (int j = -1; j <= 1; ++j)
        {
            if (i != 0 || j != 0)
            {
                draw_list->AddText(activeFont, fontSize, ImVec2(textPos.x + i, textPos.y + j), ImGui::ColorConvertFloat4ToU32(ImColor(0, 0, 0)), name.c_str());
            }
        }
    }

    draw_list->AddText(activeFont, fontSize, textPos, color, name.c_str());
    
}

void esp_renderer::draw_bomb(const matrix& view_matrix, const local_player& local) const
{
    uint64_t bomb_manager = get_bomb_manager();
    if (!bomb_manager)
        return;

    // PlantedBombController* at +0xA8, Transform at +0x38.
    uint64_t planted_bomb = memory_utils::read<uint64_t>(bomb_manager + offsets::fields::plantedBombController);
    if (!planted_bomb)
        return;

    uint64_t bomb_transform = memory_utils::read<uint64_t>(planted_bomb + offsets::fields::plantedBombTransform);
    if (!bomb_transform)
        return;

    vector3 bomb_pos = game_utils::get_position(bomb_transform);
    if (bomb_pos == vector3::zero())
        return;

    vector3 local_pos = local.get_position();
    float distance = (local_pos - bomb_pos).length();

    // Estimate time to explosion: use bomb parameters detonation duration minus elapsed field at +0x48.
    float time_left = 0.0f;
    uint64_t bomb_params = memory_utils::read<uint64_t>(planted_bomb + offsets::fields::bombParameters);
    if (bomb_params) {
        float detonation_duration = memory_utils::read<float>(bomb_params + offsets::fields::bombDetonationDuration); // BombParameters._detonationDuration
        float elapsed = memory_utils::read<float>(planted_bomb + offsets::fields::bombElapsedTime);
        if (std::isfinite(detonation_duration) && detonation_duration > 0.0f && std::isfinite(elapsed)) {
            time_left = std::clamp(detonation_duration - elapsed, 0.0f, detonation_duration);
        }
    }

    vector2 screen;
    if (!bomb_pos.world_to_screen(view_matrix, screen))
        return;

    float screen_w = 0.0f, screen_h = 0.0f;
    math_utils::get_screen_size(screen_w, screen_h);
    if (screen.x < 0.0f || screen.y < 0.0f || screen.x > screen_w || screen.y > screen_h)
        return;

    const auto draw_list = ImGui::GetBackgroundDrawList();
    const ImU32 color = IM_COL32(255, 80, 80, 255);
    ImVec2 bomb_screen(screen.x, screen.y);
    draw_list->AddCircleFilled(bomb_screen, 6.0f, color);

    // Timer box above the label
    char timer_text[32];
    snprintf(timer_text, sizeof(timer_text), "%.1fs", time_left > 0.0f ? time_left : 0.0f);
    const ImVec2 timer_text_size = ImGui::CalcTextSize(timer_text);
    const float timer_padding = 4.0f;
    ImVec2 timer_box_min(bomb_screen.x - timer_text_size.x * 0.5f - timer_padding, bomb_screen.y - 28.0f - timer_text_size.y - timer_padding);
    ImVec2 timer_box_max(bomb_screen.x + timer_text_size.x * 0.5f + timer_padding, bomb_screen.y - 28.0f + timer_padding);
    draw_list->AddRectFilled(timer_box_min, timer_box_max, IM_COL32(20, 20, 20, 220), 6.0f);
    draw_list->AddRect(timer_box_min, timer_box_max, color, 6.0f, 0, 1.5f);
    ImVec2 timer_text_pos(timer_box_min.x + timer_padding, timer_box_min.y + timer_padding);
    draw_list->AddText(timer_text_pos, IM_COL32(255, 255, 255, 255), timer_text);

    char label[32];
    snprintf(label, sizeof(label), "Bomb %.1fm", distance);
    draw_list->AddText(ImVec2(bomb_screen.x + 8.0f, bomb_screen.y - 10.0f), color, label);
}

uint64_t esp_renderer::get_bomb_manager() const
{
    // BombManager TypeInfo pointer is stored at RVA bomb_manager.
    uint64_t type_info = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::bomb_manager);
    if (!type_info)
        return 0;

    uint64_t static_fields = memory_utils::read<uint64_t>(type_info + 0xB8);
    if (!static_fields)
        return 0;

    // ScenePhotonBehavior singletons are usually at static_fields + 0x8 (and sometimes +0x0).
    uint64_t instance = memory_utils::read<uint64_t>(static_fields + 0x8);
    if (!instance)
        instance = memory_utils::read<uint64_t>(static_fields);

    // Fallback: some builds keep the singleton directly in the RVA slot.
    if (!instance && memory_utils::is_address_valid(type_info))
        instance = type_info;

    return memory_utils::is_address_valid(instance) ? instance : 0;
}

void esp_renderer::draw_weapon(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color, std::string weapon) const
{
    ImDrawList *draw_list = ImGui::GetBackgroundDrawList();
    
    ImFont* activeFont = ImGui::GetFont();
    float textScale = 0.65f;
    float fontSize = ImGui::GetFontSize() * textScale;

    ImVec2 textSize = ImGui::CalcTextSize(weapon.c_str());
    textSize.y *= textScale;
    textSize.x *= textScale;

    ImVec2 textPos = ImVec2((box_min.x + box_max.x) * 0.5f, box_max.y + 2.f);

    textPos.x -= textSize.x * 0.5f;

    for (int i = -1; i <= 1; ++i)
    {
        for (int j = -1; j <= 1; ++j)
        {
            if (i != 0 || j != 0)
            {
                draw_list->AddText(activeFont, fontSize, ImVec2(textPos.x + i, textPos.y + j), ImGui::ColorConvertFloat4ToU32(ImColor(0, 0, 0)), weapon.c_str());
            }
        }
    }

    draw_list->AddText(activeFont, fontSize, textPos, color, weapon.c_str());
    
}

void esp_renderer::draw_health_bar(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color, int health) const
{
    auto draw_list = ImGui::GetBackgroundDrawList();

    health = std::clamp(health, 0, 100);
    float HealthPercentage = health / 100.0f;
    HealthPercentage = std::clamp(HealthPercentage, 0.0f, 1.0f);

    float healthBarX = box_min.x - 3.0f;
    float healthBarWidth = 2.0f;
    float healthBarHeight = box_max.y - box_min.y;
    float filledHeight = healthBarHeight * HealthPercentage;

    ImGui::GetBackgroundDrawList()->AddRectFilled(ImVec2(healthBarX - 0.5f, box_min.y - 0.5f), ImVec2(healthBarX + healthBarWidth + 0.5f, box_min.y + healthBarHeight + 0.5f), ImColor(0, 0, 0, 130));
    const float hb_rounding = 6.0f; // more rounding for a softer look
    ImGui::GetBackgroundDrawList()->AddRect(ImVec2(healthBarX - 0.5f, box_min.y - 0.5f), ImVec2(healthBarX + healthBarWidth + 0.5f, box_min.y + healthBarHeight + 0.5f), ImColor(0, 0, 0, 255), hb_rounding, 0, 1.0f);

    // Solid health color (no gradient)
    const ImU32 healthColor = IM_COL32(0x34, 0xA6, 0x2E, 255);

    ImVec2 barTopLeft = ImVec2(healthBarX, box_min.y + (healthBarHeight - filledHeight));
    ImVec2 barBottomRight = ImVec2(healthBarX + healthBarWidth, box_min.y + healthBarHeight);
    
    ImGui::GetBackgroundDrawList()->AddRectFilled(barTopLeft, barBottomRight, healthColor, hb_rounding);

    // Health text handled in info panel, so no text here.
}

void esp_renderer::draw_sting(const vector2 &vecPosition, const char *szText, const ImColor &colText, const ImColor &outlineColor, bool centered) const
{
    ImDrawList* draw_list = ImGui::GetBackgroundDrawList();
    ImFont* activeFont = ImGui::GetFont();
    float fontSize = ImGui::GetFontSize();
    
    ImVec2 pos = ImVec2(vecPosition.x, vecPosition.y);

    if (centered)
    {
        ImVec2 size = ImGui::CalcTextSize(szText);
        pos.x -= size.x * 0.5f;
        pos.y -= size.y * 0.5f;
    }
    for (int i = -1; i <= 1; ++i)
    {
        for (int j = -1; j <= 1; ++j)
        {
            if (i != 0 || j != 0)
            {
                draw_list->AddText(activeFont, fontSize, ImVec2(pos.x + i, pos.y + j), ImGui::ColorConvertFloat4ToU32(outlineColor), szText);
            }
        }
    }

    draw_list->AddText(activeFont, fontSize, ImVec2(pos.x, pos.y), ImGui::ColorConvertFloat4ToU32(colText), szText);
}

void esp_renderer::draw_line_to_box(const ImVec2& box_min, const ImVec2& box_max, const ImColor& color) const
{
    auto draw_list = ImGui::GetBackgroundDrawList();
    auto displayInfo = draw::getDisplayInfo();
    float screenWidth = displayInfo.width;
    
    ImVec2 screenTop = ImVec2(screenWidth / 2.0f, 0.0f);
    ImVec2 boxTop = ImVec2((box_min.x + box_max.x) / 2.0f, box_min.y);
    
    draw_list->AddLine(screenTop, boxTop, ImColor(0, 0, 0), 3.0f);
    draw_list->AddLine(screenTop, boxTop, color, 1.5f);
}

void esp_renderer::draw_skeleton(const player& current_player, const matrix& view_matrix, const ImColor& color, float box_height) const
{
    auto draw_list = ImGui::GetBackgroundDrawList();
    
    uint64_t view = current_player.get_view();
    if (!view) return;
    
    memory_utils::write<bool>(view + 0x30, true);
    
    uint64_t bipedmap = current_player.get_bipedmap();
    if (!bipedmap) return;
    
    auto w2s = [&](vector3 pos, bool& visible) -> ImVec2 {
        vector2 screen;
        visible = pos.world_to_screen(view_matrix, screen);
        return ImVec2(std::floor(screen.x), std::floor(screen.y));
    };
    
    auto drawLine = [&](ImVec2 a, ImVec2 b) {
        draw_list->AddLine(a, b, color, 1.0f);
    };
    
    bool headc, neckc, spinec, spine1c, spine2c, hipc;
    ImVec2 head = w2s(game_utils::get_bone_position(current_player.base_, 0x20), headc);
    ImVec2 neck = w2s(game_utils::get_bone_position(current_player.base_, 0x28), neckc);
    ImVec2 spine = w2s(game_utils::get_bone_position(current_player.base_, 0x30), spinec);
    ImVec2 spine1 = w2s(game_utils::get_bone_position(current_player.base_, 0x38), spine1c);
    ImVec2 spine2 = w2s(game_utils::get_bone_position(current_player.base_, 0x40), spine2c);
    ImVec2 hip = w2s(game_utils::get_bone_position(current_player.base_, 0x88), hipc);
    
    bool lsc, luac, lfoc, lhac;
    ImVec2 lshould = w2s(game_utils::get_bone_position(current_player.base_, 0x48), lsc);
    ImVec2 luarm = w2s(game_utils::get_bone_position(current_player.base_, 0x50), luac);
    ImVec2 lfore = w2s(game_utils::get_bone_position(current_player.base_, 0x58), lfoc);
    ImVec2 lhand = w2s(game_utils::get_bone_position(current_player.base_, 0x60), lhac);
    
    bool rsc, ruac, rfoc, rhac;
    ImVec2 rshould = w2s(game_utils::get_bone_position(current_player.base_, 0x68), rsc);
    ImVec2 ruarm = w2s(game_utils::get_bone_position(current_player.base_, 0x70), ruac);
    ImVec2 rfore = w2s(game_utils::get_bone_position(current_player.base_, 0x78), rfoc);
    ImVec2 rhand = w2s(game_utils::get_bone_position(current_player.base_, 0x80), rhac);
    
    bool ll1c, ll2c, ll3c;
    ImVec2 lup = w2s(game_utils::get_bone_position(current_player.base_, 0x90), ll1c);
    ImVec2 lleg = w2s(game_utils::get_bone_position(current_player.base_, 0x98), ll2c);
    ImVec2 lfoot = w2s(game_utils::get_bone_position(current_player.base_, 0xA0), ll3c);
    
    bool rl1c, rl2c, rl3c;
    ImVec2 rup = w2s(game_utils::get_bone_position(current_player.base_, 0xB0), rl1c);
    ImVec2 rleg = w2s(game_utils::get_bone_position(current_player.base_, 0xB8), rl2c);
    ImVec2 rfoot = w2s(game_utils::get_bone_position(current_player.base_, 0xC0), rl3c);
    
    if (headc) {
        draw_list->AddCircle(head, 2.0f / box_height, color, 12);
    }
    
    if (headc && neckc) drawLine(head, neck);
    if (neckc && spinec) drawLine(neck, spine);
    if (spinec && spine1c) drawLine(spine, spine1);
    if (spine1c && spine2c) drawLine(spine1, spine2);
    if (spine2c && hipc) drawLine(spine2, hip);
    
    if (spine2c && lsc) drawLine(spine2, lshould);
    if (lsc && luac) drawLine(lshould, luarm);
    if (luac && lfoc) drawLine(luarm, lfore);
    if (lfoc && lhac) drawLine(lfore, lhand);
    
    if (spine2c && rsc) drawLine(spine2, rshould);
    if (rsc && ruac) drawLine(rshould, ruarm);
    if (ruac && rfoc) drawLine(ruarm, rfore);
    if (rfoc && rhac) drawLine(rfore, rhand);
    
    if (hipc && ll1c) drawLine(hip, lup);
    if (ll1c && ll2c) drawLine(lup, lleg);
    if (ll2c && ll3c) drawLine(lleg, lfoot);
    
    if (hipc && rl1c) drawLine(hip, rup);
    if (rl1c && rl2c) drawLine(rup, rleg);
    if (rl2c && rl3c) drawLine(rleg, rfoot);
}

void esp_renderer::draw_flags(const ImVec2& box_min, const ImVec2& box_max, int ping, int money, float distance, float box_height) const
{
    auto draw_list = ImGui::GetBackgroundDrawList();
    
    float current_y = box_min.y;
    float current_x = box_max.x + 5.0f;
    const float fixed_spacing = 0.5f;
    
    float flag_text_scale = box_height / 250.0f;
    flag_text_scale = std::clamp(flag_text_scale, 0.4f, 0.8f);
    
    ImFont* activeFont = ImGui::GetFont();
    ImGui::PushFont(activeFont);
    const float base_text_height = ImGui::GetFontSize() * flag_text_scale;
    
    if (vars::esp::flag_money) {
        char moneyText[32];
        snprintf(moneyText, sizeof(moneyText), "$%d", money);
        ImVec2 text_pos = { current_x, current_y };
        
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i != 0 || j != 0) {
                    draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, 
                        ImVec2(text_pos.x + i, text_pos.y + j), IM_COL32(0, 0, 0, 255), moneyText);
                }
            }
        }
        draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, text_pos, IM_COL32(0, 255, 0, 255), moneyText);
        current_y += base_text_height + fixed_spacing;
    }
    
    if (vars::esp::flag_distance) {
        char distanceText[32];
        snprintf(distanceText, sizeof(distanceText), "%.1fm", distance);
        ImVec2 text_pos = { current_x, current_y };
        
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i != 0 || j != 0) {
                    draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, 
                        ImVec2(text_pos.x + i, text_pos.y + j), IM_COL32(0, 0, 0, 255), distanceText);
                }
            }
        }
        draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, text_pos, IM_COL32(255, 255, 255, 255), distanceText);
        current_y += base_text_height + fixed_spacing;
    }
    
    if (vars::esp::flag_ping) {
        char pingText[32];
        snprintf(pingText, sizeof(pingText), "%dms", ping);
        ImVec2 text_pos = { current_x, current_y };
        
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i != 0 || j != 0) {
                    draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, 
                        ImVec2(text_pos.x + i, text_pos.y + j), IM_COL32(0, 0, 0, 255), pingText);
                }
            }
        }
        draw_list->AddText(activeFont, ImGui::GetFontSize() * flag_text_scale, text_pos, IM_COL32(255, 255, 255, 255), pingText);
        current_y += base_text_height + fixed_spacing;
    }
    
    ImGui::PopFont();
}

void esp_renderer::draw_info_panel(const ImVec2& box_min, const ImVec2& box_max, const std::string& name, const std::string& weapon, int ping, int money, float distance, int health) const
{
    const bool show_name = !name.empty();
    const bool show_weapon = !weapon.empty();
    const bool show_ping = ping >= 0;
    const bool show_money = money >= 0;
    const bool show_distance = distance >= 0.0f;
    const bool show_health = health >= 0;
    if (!(show_name || show_weapon || show_ping || show_money || show_distance || show_health))
        return;

    ImDrawList* draw_list = ImGui::GetBackgroundDrawList();
    ImFont* activeFont = ImGui::GetFont();
    const ImU32 accent = ImGui::ColorConvertFloat4ToU32(clr->accent.Value);

    struct Item { std::string text; const char* icon; };
    std::vector<Item> items;
    if (show_name) items.push_back({name, "esp-name"});
    if (show_weapon) items.push_back({weapon, "esp-weapon"});
    if (show_health && vars::esp::health_bar) {
        char buf[32];
        snprintf(buf, sizeof(buf), "%dHP", std::clamp(health, 0, 100));
        items.push_back({buf, "esp-health"});
    }
    if (show_ping) {
        char buf[32];
        snprintf(buf, sizeof(buf), "%dms", ping);
        items.push_back({buf, "esp-ping"});
    }
    if (show_money) {
        char buf[32];
        snprintf(buf, sizeof(buf), "$%d", money);
        items.push_back({buf, "esp-money"});
    }

    // Slightly larger footprint for panel elements.
    const float text_scale = 0.58f; // keep text size
    const float base_font = ImGui::GetFontSize() * text_scale;
    const float icon_box = base_font * 1.1f; // slightly larger icons/panel height
    const float padding = 2.5f;              // slightly larger rect
    const float item_spacing = 2.5f;

    float box_width = padding * 2.0f;
    for (const auto& it : items) {
        ImVec2 sz = ImGui::CalcTextSize(it.text.c_str());
        box_width += icon_box + 4.0f + sz.x * text_scale + item_spacing;
    }
    if (!items.empty())
        box_width -= item_spacing;
    const float box_height = icon_box + padding * 2.0f;

    const float center_x = (box_min.x + box_max.x) * 0.5f;
    ImVec2 panel_min(center_x - box_width * 0.5f, box_min.y - box_height - 4.0f);
    ImVec2 panel_max(panel_min.x + box_width, panel_min.y + box_height);

    const ImU32 bg_col = IM_COL32(10, 10, 14, 180);
    const ImU32 outline_col = IM_COL32(255, 255, 255, 30);
    // Soft, low-alpha glow around info panel.
    for (int i = 0; i < 2; ++i) {
        float expand = 1.5f + i;
        float alpha = 50.0f / (i + 2);
        ImU32 blur_col = IM_COL32((int)((accent >> IM_COL32_R_SHIFT) & 0xFF),
                                  (int)((accent >> IM_COL32_G_SHIFT) & 0xFF),
                                  (int)((accent >> IM_COL32_B_SHIFT) & 0xFF),
                                  static_cast<int>(alpha));
        ImVec2 blur_min(panel_min.x - expand, panel_min.y - expand);
        ImVec2 blur_max(panel_max.x + expand, panel_max.y + expand);
        draw_list->AddRectFilled(blur_min, blur_max, blur_col, 10.0f);
    }
    draw_list->AddRectFilled(panel_min, panel_max, bg_col, 10.0f);
    draw_list->AddRect(panel_min, panel_max, outline_col, 10.0f, 0, 1.0f);

    float cursor_x = panel_min.x + padding;
    const float center_y = panel_min.y + padding + icon_box * 0.5f;
    for (const auto& it : items) {
        const UiIcon& icon = ui_icons::get(it.icon);
        float draw_w = icon_box;
        float draw_h = icon_box;
        if (icon.texture && icon.width > 0 && icon.height > 0) {
            const float scale = icon_box / std::max(static_cast<float>(icon.width), static_cast<float>(icon.height));
            draw_w = icon.width * scale;
            draw_h = icon.height * scale;
            float icon_y = center_y - draw_h * 0.5f;
            draw_list->AddImage(icon.texture,
                                ImVec2(cursor_x, icon_y),
                                ImVec2(cursor_x + draw_w, icon_y + draw_h),
                                ImVec2(1,1), ImVec2(0,0), // 180° flip for ESP icons
                                accent);
        } else {
            float icon_y = center_y - draw_h * 0.5f;
            draw_list->AddRectFilled(ImVec2(cursor_x, icon_y), ImVec2(cursor_x + draw_w, icon_y + draw_h), accent, 4.0f);
        }
        cursor_x += draw_w + 4.0f;

        ImVec2 text_pos(cursor_x, center_y - base_font * 0.5f);
        draw_list->AddText(ImGui::GetFont(), base_font, text_pos, IM_COL32(255, 255, 255, 230), it.text.c_str());
        ImVec2 text_sz = ImGui::CalcTextSize(it.text.c_str());
        cursor_x += text_sz.x * text_scale + item_spacing;
    }

    if (show_distance) {
        char distBuf[32];
        snprintf(distBuf, sizeof(distBuf), "%.1fm", distance);
        const ImVec2 dist_size = ImGui::CalcTextSize(distBuf);
        const float dist_pad = 2.5f;
        const float dist_w = dist_size.x * text_scale + dist_pad * 2.0f + icon_box + 4.0f;
        const float dist_h = base_font + dist_pad * 2.0f;
        ImVec2 dist_max(panel_min.x + (box_width - dist_w) * 0.5f + dist_w, panel_min.y - 4.0f);
        ImVec2 dist_min(dist_max.x - dist_w, dist_max.y - dist_h);

        for (int i = 0; i < 2; ++i) {
            float expand = 1.5f + i;
            float alpha = 50.0f / (i + 2);
            ImU32 blur_col = IM_COL32((int)((accent >> IM_COL32_R_SHIFT) & 0xFF),
                                      (int)((accent >> IM_COL32_G_SHIFT) & 0xFF),
                                      (int)((accent >> IM_COL32_B_SHIFT) & 0xFF),
                                      static_cast<int>(alpha));
            ImVec2 blur_min(dist_min.x - expand, dist_min.y - expand);
            ImVec2 blur_max(dist_max.x + expand, dist_max.y + expand);
            draw_list->AddRectFilled(blur_min, blur_max, blur_col, 10.0f);
        }
        draw_list->AddRectFilled(dist_min, dist_max, bg_col, 10.0f);
        draw_list->AddRect(dist_min, dist_max, outline_col, 10.0f, 0, 1.0f);

        float icon_y = dist_min.y + dist_pad;
        const UiIcon& dist_icon = ui_icons::get("esp-distance");
        float draw_w = icon_box;
        float draw_h = icon_box;
        if (dist_icon.texture && dist_icon.width > 0 && dist_icon.height > 0) {
            const float scale = icon_box / std::max(static_cast<float>(dist_icon.width), static_cast<float>(dist_icon.height));
            draw_w = dist_icon.width * scale;
            draw_h = dist_icon.height * scale;
        }
        ImVec2 icon_min(dist_min.x + dist_pad, icon_y);
        ImVec2 icon_max(icon_min.x + draw_w, icon_min.y + draw_h);
        if (dist_icon.texture) {
            draw_list->AddImage(dist_icon.texture,
                                icon_min, icon_max,
                                ImVec2(1,1), ImVec2(0,0), // 180° flip for ESP distance icon
                                accent);
        } else {
            draw_list->AddRectFilled(icon_min, icon_max, accent, 4.0f);
        }
        draw_list->AddText(ImGui::GetFont(), base_font, ImVec2(dist_min.x + dist_pad + draw_w + 4.0f, dist_min.y + dist_pad), IM_COL32(255, 255, 255, 230), distBuf);
    }

    // use current font (no pop needed)
}
