#include "SkinChanger.h"
#include "../memory/memory.h"
#include "../utils/offsets/offsets.h"
#include "../ui/imgui/imgui.h"
#include "../ui/imgui/imgui_internal.h"
#include "../ui/gui/headers/includes.h"
#include <algorithm>
#include <cctype>
#include <fstream>
#include <cstring>
#include <map>
#include <string>
#include <sys/stat.h>
#include <dirent.h>
#include "../utils/debug/debug_state.h"

static const char* SKIN_CONFIG_DIR = "/sdcard/flhook/skins/";

SkinChanger* g_skinchanger_instance = nullptr;

bool g_skin_popup_open = false;
static int selected_inv_skin = -1;
static std::vector<std::pair<int, std::pair<std::string, int>>> sorted_all_skins;
static int selected_weapon_tab = 0;
static int selected_new_skin_id = -1;
enum class SkinUiPage {
    Inventory = 0,
    WeaponSelect = 1,
    SkinSelect = 2,
};
static SkinUiPage g_skin_ui_page = SkinUiPage::Inventory;
static std::vector<std::string> weapon_tabs;
static std::vector<std::vector<int>> weapon_tab_indices;
static void rebuild_weapon_tabs();

template <typename TKey, typename TValue>
class unity_dictionary {
public:
    static int count(uint64_t dict_ptr) {
        auto ret = memory_utils::read<int>(dict_ptr + 0x20);
        return ret >= 1 ? ret : 0;
    }
    static TValue get_value(uint64_t dict_ptr, size_t idx) {
        uint64_t entries = memory_utils::read<uint64_t>(dict_ptr + 0x18);
        return memory_utils::read<TValue>(entries + 0x20 + 0x10 + 0x18 * idx);
    }
    static TKey get_key(uint64_t dict_ptr, size_t idx) {
        uint64_t entries = memory_utils::read<uint64_t>(dict_ptr + 0x18);
        return memory_utils::read<TKey>(entries + 0x20 + 0x18 * idx);
    }
};

static std::string read_unity_string(uint64_t str_ptr) {
    if (!str_ptr) return "";
    int length = memory_utils::read<int>(str_ptr + 0x10);
    if (length <= 0 || length > 256) return "";
    std::u16string u16str;
    u16str.resize(static_cast<size_t>(length));
    for (int i = 0; i < length; i++) {
        u16str[static_cast<size_t>(i)] = memory_utils::read<char16_t>(str_ptr + 0x14 + i * 2);
    }
    std::string result;
    for (auto c : u16str) {
        if (c < 128) result += static_cast<char>(c);
        else result += '?';
    }
    return result;
}

SkinChanger::SkinChanger(uint64_t libunity_base) : libunity_base_(libunity_base) {
    g_skinchanger_instance = this;
}

ImU32 SkinChanger::get_rarity_color(int rarity) {
    switch (rarity) {
        case 1: return IM_COL32(230, 230, 230, 255);
        case 2: return IM_COL32(45, 100, 130, 255);
        case 3: return IM_COL32(0, 70, 180, 255);
        case 4: return IM_COL32(102, 83, 154, 255);
        case 5: return IM_COL32(105, 16, 82, 255);
        case 6: return IM_COL32(255, 0, 0, 255);
        case 7: return IM_COL32(255, 255, 0, 255);
        default: return IM_COL32(230, 230, 230, 255);
    }
}

bool SkinChanger::draw_skin_button(const char* label, int rarity, const ImVec2& size) {
    return ImGui::Button(label, size);
}

static std::string trim_copy(std::string s) {
    auto notSpace = [](unsigned char c) { return !std::isspace(c); };
    s.erase(s.begin(), std::find_if(s.begin(), s.end(), notSpace));
    s.erase(std::find_if(s.rbegin(), s.rend(), notSpace).base(), s.end());
    return s;
}

static std::string weapon_tag_from_skin_name(const std::string& skinName) {
    std::string s = trim_copy(skinName);
    if (s.empty()) return "OTHER";

    auto skipSpaces = [&](size_t& i) {
        while (i < s.size() && std::isspace(static_cast<unsigned char>(s[i]))) i++;
    };
    auto skipQuoted = [&](size_t& i) {
        if (i >= s.size() || s[i] != '"') return false;
        i++;
        while (i < s.size() && s[i] != '"') i++;
        if (i < s.size() && s[i] == '"') i++;
        return true;
    };
    auto readToken = [&](size_t& i) -> std::string {
        skipSpaces(i);
        size_t start = i;
        while (i < s.size()) {
            char c = s[i];
            if (std::isspace(static_cast<unsigned char>(c)) || c == '|' || c == ':' || c == '-') break;
            i++;
        }
        return trim_copy(s.substr(start, i - start));
    };

    // Some names start with a quoted "collection"/tag, e.g. "\"ALPHA7\" AKR \"Tiger\""
    // In that case, we treat the next token as the weapon tag.
    size_t i = 0;
    skipSpaces(i);
    if (skipQuoted(i)) {
        skipSpaces(i);
        std::string token = readToken(i);
        if (!token.empty()) {
            if (token.size() > 16) token.resize(16);
            return token;
        }
    }

    // Fallback: first token before a common separator
    i = 0;
    std::string token = readToken(i);
    if (token.empty()) return "OTHER";
    if (token.size() > 16) token.resize(16);
    return token;
}

static void split_skin_label(const std::string& fullName, std::string& weaponOut, std::string& skinOut) {
    std::string s = trim_copy(fullName);
    weaponOut = "OTHER";
    skinOut.clear();
    if (s.empty()) return;

    auto skipSpaces = [&](size_t& i) {
        while (i < s.size() && std::isspace(static_cast<unsigned char>(s[i]))) i++;
    };
    auto skipQuoted = [&](size_t& i) {
        if (i >= s.size() || s[i] != '"') return false;
        i++;
        while (i < s.size() && s[i] != '"') i++;
        if (i < s.size() && s[i] == '"') i++;
        return true;
    };
    auto readToken = [&](size_t& i) -> std::string {
        skipSpaces(i);
        size_t start = i;
        while (i < s.size()) {
            char c = s[i];
            if (std::isspace(static_cast<unsigned char>(c)) || c == '|' || c == ':' || c == '-') break;
            i++;
        }
        return trim_copy(s.substr(start, i - start));
    };

    size_t i = 0;
    skipSpaces(i);
    if (skipQuoted(i)) {
        skipSpaces(i);
    }

    std::string weaponToken = readToken(i);
    if (weaponToken.empty()) {
        weaponOut = weapon_tag_from_skin_name(fullName);
        return;
    }
    if (weaponToken.size() > 16) weaponToken.resize(16);
    weaponOut = weaponToken;

    size_t start = i;
    while (start < s.size()) {
        char c = s[start];
        if (!(std::isspace(static_cast<unsigned char>(c)) || c == '|' || c == ':' || c == '-')) break;
        start++;
    }
    skinOut = trim_copy(s.substr(start));
    if (skinOut.size() >= 2 && skinOut.front() == '"' && skinOut.back() == '"') {
        skinOut = skinOut.substr(1, skinOut.size() - 2);
        skinOut = trim_copy(skinOut);
    }
}

void SkinChanger::update_all_skins() {
    uint64_t inventory_manager_class = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::boltinventoryservice);
    if (!inventory_manager_class) return;
    debug_state::set_sline("inventory_manager_class", "inventory_manager_class = %p", inventory_manager_class);

    uint64_t singleton_class = memory_utils::read<uint64_t>(inventory_manager_class + 0x58);
    if (!singleton_class) return;
    debug_state::set_sline("singleton_class", "singleton_class = %p", singleton_class);

    uint64_t static_fields_ptr = memory_utils::read<uint64_t>(singleton_class + 0xB8);
    if (!static_fields_ptr) return;
    debug_state::set_sline("static_fields_ptr", "static_fields_ptr = %p", static_fields_ptr);

    uint64_t inventory_manager_instance = memory_utils::read<uint64_t>(static_fields_ptr + 0x0);
    if (!inventory_manager_instance) return;
    debug_state::set_sline("inventory_manager_instance", "inventory_manager_instance = %p", inventory_manager_instance);

    all_skins.clear();

    uint64_t dropped_weapons_list = memory_utils::read<uint64_t>(inventory_manager_instance + 0xE8);

    if (dropped_weapons_list) {
        int count = unity_dictionary<int, uint64_t>::count(dropped_weapons_list);
        for (int i = 0; i < count; i++) {
            uint64_t skin = unity_dictionary<int, uint64_t>::get_value(dropped_weapons_list, static_cast<size_t>(i));
            if (!skin) continue;

            int id = memory_utils::read<int>(skin + 0x10);
            uint64_t name_ptr = memory_utils::read<uint64_t>(skin + 0x18);
            std::string name = read_unity_string(name_ptr);

            int rarity = memory_utils::read<int>(skin + 0x20);
            if (rarity < 1 || rarity > 7) rarity = 1;

            if (!name.empty()) {
                all_skins[id] = {name, rarity};
            }
        }
    }
}

void SkinChanger::update_inventory_skins() {
    uint64_t inventory_manager_c = memory_utils::read<uint64_t>(libunity_base_ + offsets::adresses::boltinventoryservice);
    if (!inventory_manager_c) return;
    uint64_t inventory_manager_o = memory_utils::read<uint64_t>(inventory_manager_c + offsets::fields::InventoryManager);
    if (!inventory_manager_o) return;
    uint64_t inventory_manager_static_fields = memory_utils::read<uint64_t>(inventory_manager_o + offsets::fields::InventoryManager_static_fields);
    if (!inventory_manager_static_fields) return;
    uint64_t inventory_manager = memory_utils::read<uint64_t>(inventory_manager_static_fields);
    if (!inventory_manager) return;

    update_all_skins();
    inventory_skins.clear();

    uint64_t skins_dict = memory_utils::read<uint64_t>(inventory_manager + 0xF8);
    if (skins_dict) {
        int count = unity_dictionary<int, uint64_t>::count(skins_dict);
        for (int i = 0; i < count; i++) {
            uint64_t skin = unity_dictionary<int, uint64_t>::get_value(skins_dict, static_cast<size_t>(i));
            int id = memory_utils::read<int>(skin + 0x10);

            std::string name = "Skin #" + std::to_string(id);
            int rarity = 1;

            if (all_skins.count(id)) {
                name = all_skins[id].first;
                rarity = all_skins[id].second;
            }

            inventory_skins.push_back({id, name, rarity, skin});
        }
    }

    std::sort(inventory_skins.begin(), inventory_skins.end(), [](const skin_item& a, const skin_item& b) {
        return a.rarity > b.rarity;
    });

    sorted_all_skins.clear();
    for (auto& p : all_skins) {
        sorted_all_skins.push_back({p.first, p.second});
    }
    std::sort(sorted_all_skins.begin(), sorted_all_skins.end(),
        [](const auto& a, const auto& b) { return a.second.second > b.second.second; });

    rebuild_weapon_tabs();
}

void SkinChanger::replace_skin(skin_item to_swap, int new_id) {
    memory_utils::write<int>(to_swap.ptr + 0x10, new_id);
    this->update_inventory_skins();
}

static void rebuild_weapon_tabs() {
    weapon_tabs.clear();
    weapon_tab_indices.clear();

    std::map<std::string, std::vector<int>> tmp;
    tmp["ALL"] = {};
    for (int i = 0; i < static_cast<int>(sorted_all_skins.size()); i++) {
        const std::string& name = sorted_all_skins[i].second.first;
        std::string tag = weapon_tag_from_skin_name(name);
        tmp[tag].push_back(i);
        tmp["ALL"].push_back(i);
    }

    weapon_tabs.reserve(tmp.size());
    weapon_tab_indices.reserve(tmp.size());

    auto addTab = [&](const std::string& label) {
        weapon_tabs.push_back(label);
        weapon_tab_indices.push_back(tmp[label]);
    };

    addTab("ALL");
    for (auto& kv : tmp) {
        if (kv.first == "ALL") continue;
        addTab(kv.first);
    }

    if (selected_weapon_tab >= static_cast<int>(weapon_tabs.size())) {
        selected_weapon_tab = weapon_tabs.empty() ? 0 : static_cast<int>(weapon_tabs.size()) - 1;
    }
}

void SkinChanger::render_skinchanger_ui() {
    static bool first_load = true;
    if (first_load) {
        first_load = false;
        this->update_inventory_skins();
        update_all_skins();
        rebuild_weapon_tabs();
    }

    if (weapon_tabs.empty() || weapon_tab_indices.empty()) {
        rebuild_weapon_tabs();
    }

    ImGui::PushStyleVar(ImGuiStyleVar_Alpha, 1.0f);

    if (inventory_skins.empty()) {
        this->update_inventory_skins();
        ImGui::TextDisabled("Loading skins...");
        ImGui::PopStyleVar();
        return;
    }

    if (selected_inv_skin >= static_cast<int>(inventory_skins.size()))
        selected_inv_skin = -1;
    if (selected_weapon_tab >= static_cast<int>(weapon_tabs.size()))
        selected_weapon_tab = weapon_tabs.empty() ? 0 : static_cast<int>(weapon_tabs.size()) - 1;

    const float avail = ImGui::GetContentRegionAvail().x;
    const float gap_x = s_(6);
    const float gap_y = s_(8);

    auto ribbon = [&](const std::string& label, ImU32 color, bool active, float width, float height, const char* id_suffix = nullptr) {
        return widgets->ribbon_button(label, ImColor(color), active, c_vec2(width, height), 4.0f, id_suffix);
        };

    auto heading = [&](const char* title, const char* subtitle) {
        ImGui::TextColored(ImGui::ColorConvertU32ToFloat4(ui_draw->get_clr(clr->white)), "%s", title);
        ImGui::TextDisabled("%s", subtitle);
        ImGui::Spacing();
        };

    auto to_skin_title = [](const std::string& fullName) {
        std::string w, s;
        split_skin_label(fullName, w, s);
        if (!s.empty()) return s;
        return fullName;
        };

    if (g_skin_ui_page == SkinUiPage::Inventory) {
        ImGui::SetCursorPosY(ImGui::GetCursorPosY() + s_(10));

        heading("Skins in inventory", "Select skin in inventory to change it to other skin");

        const float height = s_(44);
        const int cols = 3;
        const float width = (avail - gap_x * (cols - 1)) / cols;
        int col = 0;
        for (int i = 0; i < static_cast<int>(inventory_skins.size()); ++i) {
            const auto& skin = inventory_skins[i];
            char id_buf[32];
            snprintf(id_buf, sizeof(id_buf), "inv%d", i);
            if (ribbon(skin.name, get_rarity_color(skin.rarity), selected_inv_skin == i, width, height, id_buf)) {
                selected_inv_skin = i;
                selected_new_skin_id = -1;
                g_skin_ui_page = SkinUiPage::WeaponSelect;
            }
            col++;
            if (col < cols) {
                ImGui::SameLine(0.0f, gap_x);
            }
            else {
                col = 0;
                ImGui::Dummy(ImVec2(0, gap_y));
            }
        }

        if (col != 0) ImGui::NewLine();
        ImGui::Dummy(ImVec2(0, s_(10)));

        ImGui::PopStyleVar();
        return;
    }

    const bool canApply = (g_skin_ui_page == SkinUiPage::SkinSelect) &&
        (selected_new_skin_id > 0) &&
        (selected_inv_skin >= 0 && selected_inv_skin < static_cast<int>(inventory_skins.size()));

    bool backPressed = false;
    bool applyPressed = false;

    if (canApply) {
        ImGui::Columns(2, "nav_columns", false);

        if (widgets->button("Back", "Return to previous step", clr->widget)) {
            backPressed = true;
        }

        ImGui::NextColumn();
        if (widgets->button("Replace skin", "Apply selected skin", clr->widget)) {
            applyPressed = true;
        }

        ImGui::Columns(1);
    }
    else {
        if (widgets->button("Back", "Return to previous step", clr->widget)) {
            backPressed = true;
        }
    }

    if (backPressed) {
        if (g_skin_ui_page == SkinUiPage::SkinSelect) {
            g_skin_ui_page = SkinUiPage::WeaponSelect;
            selected_new_skin_id = -1;
        }
        else {
            g_skin_ui_page = SkinUiPage::Inventory;
            selected_new_skin_id = -1;
            selected_inv_skin = -1;
        }
        ImGui::PopStyleVar();
        return;
    }

    if (applyPressed && canApply) {
        this->replace_skin(inventory_skins[selected_inv_skin], selected_new_skin_id);
        selected_inv_skin = -1;
        selected_new_skin_id = -1;
        g_skin_ui_page = SkinUiPage::Inventory;
        this->update_inventory_skins();
        ImGui::PopStyleVar();
        return;
    }

    if (selected_inv_skin < 0 || selected_inv_skin >= static_cast<int>(inventory_skins.size())) {
        ImGui::TextDisabled("No skin selected. Go back to inventory.");
        ImGui::PopStyleVar();
        return;
    }

    if (g_skin_ui_page == SkinUiPage::WeaponSelect) {
        ImGui::SetCursorPosY(ImGui::GetCursorPosY() + s_(10));

        heading("Select weapon", "Select the weapon you want to get a skin for");

        const float height = s_(42);
        const int cols = 5;
        const float width = (avail - gap_x * (cols - 1)) / cols;
        int col = 0;
        for (int i = 0; i < static_cast<int>(weapon_tabs.size()); ++i) {
            char id_buf[32];
            snprintf(id_buf, sizeof(id_buf), "weap%d", i);
            if (ribbon(weapon_tabs[i], ui_draw->get_clr(clr->accent), selected_weapon_tab == i, width, height, id_buf)) {
                selected_weapon_tab = i;
                g_skin_ui_page = SkinUiPage::SkinSelect;
                selected_new_skin_id = -1;
            }
            col++;
            if (col < cols) {
                ImGui::SameLine(0.0f, gap_x);
            }
            else {
                col = 0;
                ImGui::Dummy(ImVec2(0, gap_y));
            }
        }

        if (col != 0) ImGui::NewLine();
        ImGui::Dummy(ImVec2(0, s_(10)));

        ImGui::PopStyleVar();
        return;
    }

    ImGui::SetCursorPosY(ImGui::GetCursorPosY() + s_(10));

    heading("Select skin", "Choose skin replacement for selected inventory item");

    const float height = s_(54);
    const int cols = 3;
    const float width = (avail - gap_x * (cols - 1)) / cols;

    int tab = ImClamp(selected_weapon_tab, 0, (int)weapon_tab_indices.size() - 1);
    int col = 0;
    if (!weapon_tab_indices.empty() && tab >= 0) {
        for (int idx : weapon_tab_indices[tab]) {
            const auto& skin = sorted_all_skins[idx];
            const int id = skin.first;
            const std::string title = to_skin_title(skin.second.first);
            const int rarity = skin.second.second;
            char id_buf[32];
            snprintf(id_buf, sizeof(id_buf), "skin%d", id);
            if (ribbon(title, get_rarity_color(rarity), selected_new_skin_id == id, width, height, id_buf)) {
                selected_new_skin_id = id;
            }
            col++;
            if (col < cols) {
                ImGui::SameLine(0.0f, gap_x);
            }
            else {
                col = 0;
                ImGui::Dummy(ImVec2(0, gap_y));
            }
        }
    }

    if (col != 0) ImGui::NewLine();

    ImGui::PopStyleVar();
}

void SkinChanger::render_skin_selection_popup() {}

bool SkinChanger::save_skin_config(const std::string& name) {
    struct stat st = {0};
    if (stat(SKIN_CONFIG_DIR, &st) == -1) {
        mkdir("/sdcard/flhook/", 0777);
        mkdir(SKIN_CONFIG_DIR, 0777);
    }

    std::string filepath = std::string(SKIN_CONFIG_DIR) + name + ".skincfg";
    std::ofstream file(filepath, std::ios::binary);

    if (!file.is_open()) return false;

    int count = static_cast<int>(inventory_skins.size());
    file.write(reinterpret_cast<const char*>(&count), sizeof(int));

    for (auto& skin : inventory_skins) {
        int original_id = skin.id;
        file.write(reinterpret_cast<const char*>(&original_id), sizeof(int));
    }

    file.close();

    saved_skin_replacements.clear();
    for (auto& skin : inventory_skins) {
        saved_skin_replacements[skin.id] = skin.id;
    }

    return true;
}

bool SkinChanger::load_skin_config(const std::string& name) {
    std::string filepath = std::string(SKIN_CONFIG_DIR) + name + ".skincfg";
    std::ifstream file(filepath, std::ios::binary);

    if (!file.is_open()) return false;

    saved_skin_replacements.clear();

    int count = 0;
    file.read(reinterpret_cast<char*>(&count), sizeof(int));

    for (int i = 0; i < count; i++) {
        int skin_id = 0;
        file.read(reinterpret_cast<char*>(&skin_id), sizeof(int));
        saved_skin_replacements[i] = skin_id;
    }

    file.close();
    return true;
}

bool SkinChanger::delete_skin_config(const std::string& name) {
    std::string filepath = std::string(SKIN_CONFIG_DIR) + name + ".skincfg";
    return remove(filepath.c_str()) == 0;
}

std::vector<std::string> SkinChanger::get_skin_config_list() {
    std::vector<std::string> configs;
    DIR* dir = opendir(SKIN_CONFIG_DIR);

    if (dir == nullptr) return configs;

    struct dirent* entry;
    while ((entry = readdir(dir)) != nullptr) {
        std::string filename = entry->d_name;
        if (filename.length() > 8 && filename.substr(filename.length() - 8) == ".skincfg") {
            configs.push_back(filename.substr(0, filename.length() - 8));
        }
    }

    closedir(dir);
    return configs;
}

void SkinChanger::apply_saved_skins() {
    if (saved_skin_replacements.empty() || inventory_skins.empty()) return;

    int idx = 0;
    for (auto& skin : inventory_skins) {
        if (saved_skin_replacements.count(idx)) {
            int new_id = saved_skin_replacements[idx];
            if (new_id != skin.id) {
                memory_utils::write<int>(skin.ptr + 0x10, new_id);
            }
        }
        idx++;
    }

    update_inventory_skins();
}
