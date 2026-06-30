#pragma once
#include "aim.h"

class esp_renderer {
public:
    esp_renderer(uint64_t libunity_base);
    void render_esp();
    player_manager get_player_manager() const;

private:
    uint64_t libunity_base_;

    void draw_sting(const vector2 &vecPosition, const char *szText, const ImColor &colText, const ImColor &outlineColor, bool centered) const;
    void draw_box(const ImVec2& box_min, const ImVec2& box_max, const ImColor& color) const;
    void draw_health_bar(const ImVec2& box_min, const ImVec2& box_max, const ImColor& color, int health) const;
    void draw_name(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color, std::string name) const;
    void draw_weapon(const ImVec2 &box_min, const ImVec2 &box_max, const ImColor &color, std::string weapon) const;
    void draw_line_to_box(const ImVec2& box_min, const ImVec2& box_max, const ImColor& color) const;
    void draw_skeleton(const player& current_player, const matrix& view_matrix, const ImColor& color, float box_height) const;
    void draw_flags(const ImVec2& box_min, const ImVec2& box_max, int ping, int money, float distance, float box_height) const;
    void draw_info_panel(const ImVec2& box_min, const ImVec2& box_max, const std::string& name, const std::string& weapon, int ping, int money, float distance, int health) const;
    void draw_bomb(const matrix& view_matrix, const local_player& local) const;
    uint64_t get_bomb_manager() const;
};
