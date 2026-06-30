#pragma once
#include <cstdint>
#include "../utils/math/math.h"
#include "../utils/entity/player.h"
#include "../dependencies/draw/draw.h"

class Function
{
public:
    Function(uint64_t libunity_base);
    void DamageHack();
    void Wallshot();
    void Invisible();
    void RCS();

private:
    uint64_t libunity_base_;
    player_manager get_player_manager() const;
    bool is_knife(uint64_t localPlayer) const;
};
