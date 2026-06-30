#pragma once

#include <cstdint>
#include <map>
#include <string>
#include <vector>
#include "../ui/imgui/imgui.h"

// Forward declaration for globals
class SkinChanger;

// Global flag to block main menu when skin popup is open
extern bool g_skin_popup_open;
extern SkinChanger* g_skinchanger_instance;

struct skin_item {
    int id;
    std::string name;
    int rarity;
    uint64_t ptr;
};

class SkinChanger {
public:
    explicit SkinChanger(uint64_t libunity_base);

    void update_all_skins();
    void update_inventory_skins();
    void replace_skin(skin_item to_swap, int new_id);
    void render_skinchanger_ui();
    void render_skin_selection_popup();

    // Config helpers
    bool save_skin_config(const std::string& name);
    bool load_skin_config(const std::string& name);
    bool delete_skin_config(const std::string& name);
    std::vector<std::string> get_skin_config_list();
    void apply_saved_skins();

    // Getters
    const std::vector<skin_item>& get_inventory_skins() const { return inventory_skins; }
    const std::map<int, std::pair<std::string, int>>& get_all_skins() const { return all_skins; }

private:
    ImU32 get_rarity_color(int rarity);
    bool draw_skin_button(const char* label, int rarity, const ImVec2& size);

    uint64_t libunity_base_;
    std::map<int, std::pair<std::string, int>> all_skins; // id -> {name, rarity}
    std::vector<skin_item> inventory_skins;
    std::map<int, int> saved_skin_replacements; // original_id -> new_id
};
