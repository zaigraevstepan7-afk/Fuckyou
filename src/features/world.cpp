#include "world.h"

void world::change_world(c_player_controller *local)
{
   if (!(g.b_solid || g.b_world))
        return;
    if (local)
    {
        c_type type{};
        c_shader shader_{};

        c_type *mesh_type = type.get_type(c_methods->new_str(oxorany("UnityEngine.MeshRenderer, UnityEngine.CoreModule")));
        if (!mesh_type)
            return;

        c_shader *shader = shader_.find(c_methods->new_str(oxorany("Legacy Shaders/Diffuse")));
        if (!shader)
            return;

        auto *worldRender = mesh_type->find_objects_of_type();
        if (!worldRender)
            return;

        for (int i = 0; i < worldRender->capacity; i++)
        {
            c_renderer *renderer = worldRender->m_Items[i];
            if (!renderer)
                continue;

            auto *materials = renderer->get_materials();
            if (!materials)
                continue;

            for (int j = 0; j < materials->capacity; j++)
            {
                c_material *material = materials->m_Items[j];
                if (!material)
                    continue;

                material->set_shader(shader);

                if (g.b_solid)
                    material->set_texture(NULL);

                material->set_color(float4tocolor(g.m_world));
            }

            renderer->set_materials(materials);
        }

        g.b_solid = false;
        g.b_world = false;
    }
}

void world::fog()
{
    if (g.b_fog)
    {

        auto rendersettings_manager = ((void *(*)())(base + c_offsets->rendersettings_manager));
        auto call_rendersettings_update = (void (*)(void *))(base + c_offsets->call_rendersettings_update);
        auto fog_m = rendersettings_manager();
        if (fog_m)
        {
            *reinterpret_cast<int *>(reinterpret_cast<uintptr_t>(fog_m) + oxorany(0x164)) = 1;
            *reinterpret_cast<color_t *>(reinterpret_cast<uintptr_t>(fog_m) + oxorany(0x168)) = float4tocolor(g.m_fog);
            *reinterpret_cast<float *>(reinterpret_cast<uintptr_t>(fog_m) + oxorany(0x178)) = g.f_start;
            *reinterpret_cast<float *>(reinterpret_cast<uintptr_t>(fog_m) + oxorany(0x17C)) = g.f_end;
            *reinterpret_cast<bool *>(reinterpret_cast<uintptr_t>(fog_m) + oxorany(0x160)) = g.b_fog;
            call_rendersettings_update(fog_m);
        }
    }
}

void world::init(c_player_controller *local)
{
    if (!local)
        return;

    this->change_world(local);
    this->fog();
}