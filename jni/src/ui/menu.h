#pragma once

//==============================================================================
//  New cheat menu (replaces the old "Zenin demo" UI).
//  Self-contained ImGui overlay wired straight to vars (common.h).
//==============================================================================

namespace Menu
{
    // Draw the menu + the bottom toggle bar. Call once per frame.
    void Render();

    // Programmatic open/close (e.g. from a hotkey).
    void Toggle();
    bool IsOpen();
}
