#pragma once

#include "game.hpp"
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

        uint64_t transform_array = rpm<uint64_t>(transform_data + oxorany(0x18));
        uint64_t transform_indices = rpm<uint64_t>(transform_data + oxorany(0x20));
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

        uint64_t native_transform = rpm<uint64_t>(transform + oxorany(0x10));
        if (!likely_ptr(native_transform)) return false;

        uint64_t transform_data = rpm<uint64_t>(native_transform + oxorany(0x38));
        int index = rpm<int>(native_transform + oxorany(0x40));

        if (transform_position_from_data(transform_data, index, out)) return true;

        uint64_t nested_data = likely_ptr(transform_data) ? rpm<uint64_t>(transform_data + oxorany(0x18)) : 0;
        if (transform_position_from_data(nested_data, index, out)) return true;

        Vector3 direct = rpm<Vector3>(native_transform + oxorany(0x90));
        if (sane_world_pos(direct)) {
            out = direct;
            return true;
        }

        return false;
    }

    inline Vector3 position(uint64_t p) noexcept {
        uint64_t MovementController = rpm<uint64_t>(p + oxorany(0x98));
        if (!MovementController) return Vector3(0, 0, 0);

        uint64_t TransformData = rpm<uint64_t>(MovementController + oxorany(0xB0));
        if (!TransformData) return Vector3(0, 0, 0);

        return rpm<Vector3>(TransformData + oxorany(0x44));
    }

    inline uint64_t biped_map(uint64_t p) noexcept {
        uint64_t view = rpm<uint64_t>(p + oxorany(0x48));
        if (likely_ptr(view)) {
            uint64_t map = rpm<uint64_t>(view + oxorany(0x48));
            if (likely_ptr(map)) return map;
        }

        view = rpm<uint64_t>(p + oxorany(0x50));
        if (likely_ptr(view)) {
            uint64_t map = rpm<uint64_t>(view + oxorany(0x48));
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
            return read_biped_bone(map, oxorany(0x28), base, out) ||
                   read_biped_bone(map, oxorany(0x20), base, out);
        }

        if (bone_mode == 2) {
            return read_biped_bone(map, oxorany(0x40), base, out) ||
                   read_biped_bone(map, oxorany(0x38), base, out) ||
                   read_biped_bone(map, oxorany(0x30), base, out) ||
                   read_biped_bone(map, oxorany(0x88), base, out);
        }

        if (bone_mode == 3) {
            Vector3 left{}, right{};
            bool has_left = read_biped_bone(map, oxorany(0x98), base, left);
            bool has_right = read_biped_bone(map, oxorany(0xB8), base, right);

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

            return read_biped_bone(map, oxorany(0x88), base, out) ||
                   read_biped_bone(map, oxorany(0x90), base, out) ||
                   read_biped_bone(map, oxorany(0xB0), base, out);
        }

        return read_biped_bone(map, oxorany(0x20), base, out) ||
               read_biped_bone(map, oxorany(0x28), base, out);
    }

    inline bool bone_position(uint64_t p, int bone_mode, Vector3& out) noexcept {
        return bone_position(p, bone_mode, position(p), out);
    }

    inline uint64_t photon_ptr(uint64_t p) noexcept {
        return rpm<uint64_t>(p + oxorany(0x160));
    }

    inline int visibility_state(uint64_t p) noexcept {
        uint64_t occlusion = rpm<uint64_t>(p + oxorany(0xB8));
        if (!occlusion) return 0;

        int current = rpm<int>(occlusion + oxorany(0x34));
        int next = rpm<int>(occlusion + oxorany(0x38));

        if (current == 2 || next == 2) return 2;
        if (current == 1 || next == 1) return 1;
        return 0;
    }

    template<typename T>
    inline T property(uint64_t p, const char* tag) noexcept {
        T result{};
        uint64_t PhotonPlayer = photon_ptr(p);
        if (!PhotonPlayer) return result;

        uint64_t PropertiesRegistry = rpm<uint64_t>(PhotonPlayer + oxorany(0x38));
        if (!PropertiesRegistry) return result;

        int Count = rpm<int>(PropertiesRegistry + oxorany(0x20));
        uint64_t PropertiesList = rpm<uint64_t>(PropertiesRegistry + oxorany(0x18));

        for (int i = 0; i < Count; i++) {
            uint64_t Key = rpm<uint64_t>(PropertiesList + oxorany(0x28) + oxorany(0x18) * i);
            uint64_t Value = rpm<uint64_t>(PropertiesList + oxorany(0x30) + oxorany(0x18) * i);

            if (!Key) continue;

            std::string KeyString = rpm<read_string>(Key).as_utf8();
            if (strstr(KeyString.c_str(), tag)) {
                result = rpm<T>(Value + oxorany(0x10));
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
        return rpm<read_string>(rpm<uint64_t>(PhotonPlayer + oxorany(0x20)));
    }

    inline matrix view_matrix(uint64_t p) noexcept {
        uint64_t PlayerMainCamera = rpm<uint64_t>(p + oxorany(0xE8));
        if (!PlayerMainCamera) return {};

        uint64_t CameraTransform = rpm<uint64_t>(PlayerMainCamera + oxorany(0x20));
        if (!CameraTransform) return {};

        uint64_t CameraMatrix = rpm<uint64_t>(CameraTransform + oxorany(0x10));
        if (!CameraMatrix) return {};

        return rpm<matrix>(CameraMatrix + oxorany(0x100));
    }
}
