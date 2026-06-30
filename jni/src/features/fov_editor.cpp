#include "fov_editor.h"
#include "../memory/memory.h"
#include "../ui/common.h"
#include "../utils/math/math.h"
#include "../utils/offsets/offsets.h"

void fov_editor::update(uint64_t localPlayer) {
    const auto PlayerMainCamera = memory_utils::read<uint64_t>(localPlayer + offsets::fields::player_main_camera);
    if (!PlayerMainCamera) return;
    
    const auto Camera = memory_utils::read<uint64_t>(PlayerMainCamera + 0x20);
    const auto CameraScopeZoomer = memory_utils::read<uint64_t>(PlayerMainCamera + 0x28);
    
    if (!CameraScopeZoomer) return;
    
    float fov_value = vars::visual::fov ? vars::visual::fov_value : 60.0f;
    memory_utils::write<float>(CameraScopeZoomer + 0x38, fov_value);
}
