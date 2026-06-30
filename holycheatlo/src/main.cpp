#include "Android_draw/draw.h"
#include "Android_touch/Touch.hpp"
#include "func/aim.hpp"
#include "func/inf_ammo.hpp"
#include "func/norecoil.hpp"
#include "func/test_loader.hpp"
#include "func/visuals.hpp"
#include "func/wallshot.hpp"
#include "game/game.hpp"
#include "ui/menu.hpp"
#include "ui/theme/theme.hpp"
#include "protect/oxorany.hpp"

#include <chrono>
#include <cstdio>
#include <thread>
#include <unistd.h>

static void launch_standoff() {
    system(oxorany("monkey -p com.axlebolt.standoff2 -c android.intent.category.LAUNCHER 1 >/dev/null 2>&1"));
}

int main() {
    screen_config();

    int max_size = displayInfo.height > displayInfo.width ? displayInfo.height : displayInfo.width;
    int min_size = displayInfo.height < displayInfo.width ? displayInfo.height : displayInfo.width;

    g_sw = static_cast<float>(max_size);
    g_sh = static_cast<float>(min_size);

    native_window_screen_x = max_size;
    native_window_screen_y = max_size;

    if (!initGUI_draw(native_window_screen_x, native_window_screen_y, true)) return -1;
    touch::init(max_size, min_size, static_cast<uint8_t>(displayInfo.orientation));

    std::printf("%s\n", oxorany("t.me/holycheatlo"));
    launch_standoff();
    game::init();

    while (true) {
        drawBegin();

        bool run = game::valid();

#if defined(__x86_64__)
        bool is_landscape = (displayInfo.orientation == 0 || displayInfo.orientation == 2);
#else
        bool is_landscape = (displayInfo.orientation == 1 || displayInfo.orientation == 3);
#endif

        if (is_landscape) {
            ui::menu::render(run);

            if (run && proc::lib != 0) {
                game::check_lib(get_player_manager());
                visuals::draw();
                aim::run();
                aim::draw_fov(ImGui::GetBackgroundDrawList(), g_sw, g_sh);
                wallshot::run();
                inf_ammo::run();
                norecoil::run();
                test_loader::run();
            }
        }

        drawEnd();
        usleep(2500);
    }

    shutdown();
    return 0;
}
