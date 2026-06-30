#pragma once
#include <cstdint>
#include "../utils/math/math.h"
#include "../utils/entity/player.h"
#include "../dependencies/draw/draw.h"

class aimbot
{
public:
    aimbot(uint64_t libunity_base);
    void aim_start();

private:
    uint64_t libunity_base_;
    player_manager get_player_manager() const;
};