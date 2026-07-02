package com.glasscam.app.camera

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import kotlin.math.abs
import kotlin.math.sqrt

/** True when the phone is being held reasonably still — used to time auto-capture. */
@Composable
fun rememberIsSteady(): State<Boolean> {
    val context = LocalContext.current
    val steady = remember { mutableStateOf(false) }
    DisposableEffect(Unit) {
        val sm = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
        val accel = sm?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        var last = SensorManager.GRAVITY_EARTH
        var calm = 0
        val listener = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                val m = sqrt(e.values[0] * e.values[0] + e.values[1] * e.values[1] + e.values[2] * e.values[2])
                val delta = abs(m - last)
                last = m
                if (delta < 0.35f) calm++ else calm = 0
                steady.value = calm > 8 // ~8 stable samples in a row
            }

            override fun onAccuracyChanged(s: Sensor?, a: Int) {}
        }
        if (accel != null) sm.registerListener(listener, accel, SensorManager.SENSOR_DELAY_GAME)
        onDispose { sm?.unregisterListener(listener) }
    }
    return steady
}
