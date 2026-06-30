#pragma once

#include "game.hpp"
#include "offsets.hpp"
#include "../other/vector3.h"
#include "../other/string.h"
#include "../protect/oxorany.hpp"
#include <cmath>
#include <cstring>
#include <string>

namespace player {
    struct TransformEntry {
        Vector4 position;
        Vector4 rotation;
        Vector4 scale;
    };

    inline bool likely_ptr(uint64_t p) noexcept {
        return p > 0x10000ull && p < 0x0000FFFFFFFFFFFFull;
    }

    inline bool sane_world_pos(const Vector3& v) noexcept {
        return std::isfinite(v.x) && std::isfinite(v.y) && std::isfinite(v.z) &&
               std::fabs(v.x) < 100000.f && std::fabs(v.y) < 100000.f && std::fabs(v.z) < 100000.f &&
               !(v.x == 0.f && v.y == 0.f && v.z == 0.f);
    }

    inline bool sane_bone_pos(const Vector3& v, const Vector3& base) noexcept {
        if (!sane_world_pos(v)) return false;
        if (!sane_world_pos(base)) return true;

        float dx = v.x - base.x;
        float dy = v.y - base.y;
        float dz = v.z - base.z;
        return (dx * dx + dy * dy + dz * dz) <= 100.f;
    }

    inline Vector3 rotate_by_quat(const Vector3& v, const Vector4& q) noexcept {
        float x2 = q.x + q.x;
        float y2 = q.y + q.y;
        float z2 = q.z + q.z;

        float xx = q.x * x2;
        float yy = q.y * y2;
        float zz = q.z * z2;
        float xy = q.x * y2;
        float xz = q.x * z2;
        float yz = q.y * z2;
        float wx = q.w * x2;
        float wy = q.w * y2;
        float wz = q.w * z2;

        return Vector3(
            (1.f - (yy + zz)) * v.x + (xy - wz) * v.y + (xz + wy) * v.z,
            (xy + wz) * v.x + (1.f - (xx + zz)) * v.y + (yz - wx) * v.z,
            (xz - wy) * v.x + (yz + wx) * v.y + (1.f - (xx + yy)) * v.z
        );
    }

    inline bool transform_position_from_data(uint64_t transform_data, int index, Vector3& out) noexcept {
        if (!likely_ptr(transform_data) || index < 0 || index > 100000) return false;

        uint64_t transform_array = rpm<uint64_t>(transform_data + oxorany(OFF_TRANSFORM_DATA_ARRAY));
        uint64_t transform_indices = rpm<uint64_t>(transform_data + oxorany(OFF_TRANSFORM_DATA_INDICES));
        if (!likely_ptr(transform_array) || !likely_ptr(transform_indices)) return false;

        TransformEntry entry = rpm<TransformEntry>(transform_array + (sizeof(TransformEntry) * static_cast<uint64_t>(index)));
        Vector3 result(entry.position.x, entry.position.y, entry.position.z);

        int parent = rpm<int>(transform_indices + (sizeof(int) * static_cast<uint64_t>(index)));
        int depth = 0;

        while (parent >= 0 && parent <= 100000 && depth++ < 64) {
            TransformEntry parent_entry = rpm<TransformEntry>(transform_array + (sizeof(TransformEntry) * static_cast<uint64_t>(parent)));
            Vector3 scaled(result.x * parent_entry.scale.x, result.y * parent_entry.scale.y, result.z * parent_entry.scale.z);
            Vector3 rotated = rotate_by_quat(scaled, parent_entry.rotation);

            result = Vector3(parent_entry.position.x, parent_entry.position.y, parent_entry.position.z) + rotated;
            parent = rpm<int>(transform_indices + (sizeof(int) * static_cast<uint64_t>(parent)));
        }

        if (!sane_world_pos(result)) return false;

        out = result;
        return true;
    }

    inline bool transform_position(uint64_t transform, Vector3& out) noexcept {
        if (!likely_ptr(transform)) return false;

        uint64_t native_transform = rpm<uint64_t>(transform + oxorany(OFF_TRANSFORM_NATIVE));
        if (!likely_ptr(native_transform)) return false;

        uint64_t transform_data = rpm<uint64_t>(native_transform + oxorany(OFF_NATIVE_TRANSFORM_DATA));
        int index = rpm<int>(native_transform + oxorany(OFF_NATIVE_TRANSFORM_INDEX));

        if (transform_position_from_data(transform_data, index, out)) return true;

        uint64_t nested_data = likely_ptr(transform_data) ? rpm<uint64_t>(transform_data + oxorany(OFF_TRANSFORM_DATA_ARRAY)) : 0;
        if (transform_position_from_data(nested_data, index, out)) return true;

        Vector3 direct = rpm<Vector3>(native_transform + oxorany(OFF_NATIVE_TRANSFORM_DIRECT));
        if (sane_world_pos(direct)) {
            out = direct;
            return true;
        }

        return false;
    }

    inline Vector3 position(uint64_t p) noexcept {
        uint64_t MovementController = rpm<uint64_t>(p + oxorany(OFF_PLAYER_MOVEMENT_CTRL));
        if (!MovementController) return Vector3(0, 0, 0);

        uint64_t TransformData = rpm<uint64_t>(MovementController + oxorany(OFF_MC_TRANSFORM_DATA));
        if (!TransformData) return Vector3(0, 0, 0);

        return rpm<Vector3>(TransformData + oxorany(OFF_TD_POSITION));
    }

    inline uint64_t biped_map(uint64_t p) noexcept {
        uint64_t view = rpm<uint64_t>(p + oxorany(OFF_PLAYER_VIEW_1));
        if (likely_ptr(view)) {
            uint64_t map = rpm<uint64_t>(view + oxorany(OFF_VIEW_BIPED_MAP));
            if (likely_ptr(map)) return map;
        }

        view = rpm<uint64_t>(p + oxorany(OFF_PLAYER_VIEW_2));
        if (likely_ptr(view)) {
            uint64_t map = rpm<uint64_t>(view + oxorany(OFF_VIEW_BIPED_MAP));
            if (likely_ptr(map)) return map;
        }

        return 0;
    }

    inline bool read_biped_bone(uint64_t map, uint64_t offset, const Vector3& base, Vector3& out) noexcept {
        if (!likely_ptr(map)) return false;

        uint64_t transform = rpm<uint64_t>(map + offset);
        if (!likely_ptr(transform)) return false;

        Vector3 pos{};
        if (!transform_position(transform, pos)) return false;
        if (!sane_bone_pos(pos, base)) return false;

        out = pos;
        return true;
    }

    inline bool bone_position(uint64_t p, int bone_mode, const Vector3& base, Vector3& out) noexcept {
        uint64_t map = biped_map(p);
        if (!likely_ptr(map)) return false;

        if (bone_mode == 1) {
            return read_biped_bone(map, oxorany(OFF_BONE_HEAD_1), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_HEAD_2), base, out);
        }

        if (bone_mode == 2) {
            return read_biped_bone(map, oxorany(OFF_BONE_CHEST_1), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_CHEST_2), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_CHEST_3), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_CHEST_4), base, out);
        }

        if (bone_mode == 3) {
            Vector3 left{}, right{};
            bool has_left = read_biped_bone(map, oxorany(OFF_BONE_FOOT_LEFT), base, left);
            bool has_right = read_biped_bone(map, oxorany(OFF_BONE_FOOT_RIGHT), base, right);

            if (has_left && has_right) {
                out = (left + right) * 0.5f;
                return true;
            }

            if (has_left) {
                out = left;
                return true;
            }

            if (has_right) {
                out = right;
                return true;
            }

            return read_biped_bone(map, oxorany(OFF_BONE_SPINE_1), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_SPINE_2), base, out) ||
                   read_biped_bone(map, oxorany(OFF_BONE_SPINE_3), base, out);
        }

        return read_biped_bone(map, oxorany(OFF_BONE_HEAD_2), base, out) ||
               read_biped_bone(map, oxorany(OFF_BONE_HEAD_1), base, out);
    }

    inline bool bone_position(uint64_t p, int bone_mode, Vector3& out) noexcept {
        return bone_position(p, bone_mode, position(p), out);
    }

    inline uint64_t photon_ptr(uint64_t p) noexcept {
        return rpm<uint64_t>(p + oxorany(OFF_PLAYER_PHOTON_PTR));
    }

    inline int visibility_state(uint64_t p) noexcept {
        uint64_t occlusion = rpm<uint64_t>(p + oxorany(OFF_PLAYER_OCCLUSION));
        if (!occlusion) return 0;

        int current = rpm<int>(occlusion + oxorany(OFF_OCCLUSION_CURRENT));
        int next = rpm<int>(occlusion + oxorany(OFF_OCCLUSION_NEXT));

        if (current == 2 || next == 2) return 2;
        if (current == 1 || next == 1) return 1;
        return 0;
    }

    template<typename T>
    inline T property(uint64_t p, const char* tag) noexcept {
        T result{};
        uint64_t PhotonPlayer = photon_ptr(p);
        if (!PhotonPlayer) return result;

        uint64_t PropertiesRegistry = rpm<uint64_t>(PhotonPlayer + oxorany(OFF_PHOTON_PROPS_REG));
        if (!PropertiesRegistry) return result;

        int Count = rpm<int>(PropertiesRegistry + oxorany(OFF_PROPS_COUNT));
        uint64_t PropertiesList = rpm<uint64_t>(PropertiesRegistry + oxorany(OFF_PROPS_LIST));

        for (int i = 0; i < Count; i++) {
            uint64_t Key = rpm<uint64_t>(PropertiesList + oxorany(OFF_PROPS_KEY_BASE) + oxorany(OFF_LIST_ENTRY_STRIDE) * i);
            uint64_t Value = rpm<uint64_t>(PropertiesList + oxorany(OFF_PROPS_VAL_BASE) + oxorany(OFF_LIST_ENTRY_STRIDE) * i);

            if (!Key) continue;

            std::string KeyString = rpm<read_string>(Key).as_utf8();
            if (strstr(KeyString.c_str(), tag)) {
                result = rpm<T>(Value + oxorany(OFF_PROPS_VALUE_DATA));
                break;
            }
        }

        return result;
    }

    inline int health(uint64_t p) noexcept {
        return property<int>(p, oxorany("health"));
    }

    inline read_string name(uint64_t p) noexcept {
        uint64_t PhotonPlayer = photon_ptr(p);
        if (!PhotonPlayer) return {};
        return rpm<read_string>(rpm<uint64_t>(PhotonPlayer + oxorany(OFF_PHOTON_NAME)));
    }

    inline matrix view_matrix(uint64_t p) noexcept {
        uint64_t PlayerMainCamera = rpm<uint64_t>(p + oxorany(OFF_PLAYER_MAIN_CAMERA));
        if (!PlayerMainCamera) return {};

        uint64_t CameraTransform = rpm<uint64_t>(PlayerMainCamera + oxorany(OFF_CAM_TRANSFORM));
        if (!CameraTransform) return {};

        uint64_t CameraMatrix = rpm<uint64_t>(CameraTransform + oxorany(OFF_CAM_TRANSFORM_MATRIX));
        if (!CameraMatrix) return {};

        return rpm<matrix>(CameraMatrix + oxorany(OFF_CAM_MATRIX_DATA));
    }
}
