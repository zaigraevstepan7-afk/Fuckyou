package com.fuckyou.app.data

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/** Snapshot of all mod toggles, read by the UI. */
data class ModConfig(
    val antiDelete: Boolean = true,
    val antiEdit: Boolean = true,
    val ghostMode: Boolean = false,
    val fakeOnline: Boolean = false,
    val accent: Int = 0,
)

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "fuckyou_mod")

/**
 * Persistent store for the "Mod settings" screen. Every toggle the AUEgram-style
 * mods expose lives here; the rest of the app reacts to [config].
 */
class ModSettings(private val context: Context) {

    private object Keys {
        val ANTI_DELETE = booleanPreferencesKey("anti_delete")
        val ANTI_EDIT = booleanPreferencesKey("anti_edit")
        val GHOST = booleanPreferencesKey("ghost_mode")
        val FAKE_ONLINE = booleanPreferencesKey("fake_online")
        val ACCENT = intPreferencesKey("accent")
    }

    val config: Flow<ModConfig> = context.dataStore.data.map { p ->
        ModConfig(
            antiDelete = p[Keys.ANTI_DELETE] ?: true,
            antiEdit = p[Keys.ANTI_EDIT] ?: true,
            ghostMode = p[Keys.GHOST] ?: false,
            fakeOnline = p[Keys.FAKE_ONLINE] ?: false,
            accent = p[Keys.ACCENT] ?: 0,
        )
    }

    suspend fun setAntiDelete(v: Boolean) = context.dataStore.edit { it[Keys.ANTI_DELETE] = v }
    suspend fun setAntiEdit(v: Boolean) = context.dataStore.edit { it[Keys.ANTI_EDIT] = v }
    suspend fun setGhostMode(v: Boolean) = context.dataStore.edit { it[Keys.GHOST] = v }
    suspend fun setFakeOnline(v: Boolean) = context.dataStore.edit { it[Keys.FAKE_ONLINE] = v }
    suspend fun setAccent(v: Int) = context.dataStore.edit { it[Keys.ACCENT] = v }
}
