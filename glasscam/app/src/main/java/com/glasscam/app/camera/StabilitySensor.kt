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

/**
 * Live device yaw/pitch (radians) from the rotation-vector sensor. Used to move the AI aim ring
 * in real time between AI updates, so the user sees how much further to pan/tilt onto the target.
 */
@Composable
fun rememberYawPitch(): State<FloatArray> {
    val context = LocalContext.current
    val state = remember { mutableStateOf(floatArrayOf(0f, 0f)) }
    DisposableEffect(Unit) {
        val sm = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
        val sensor = sm?.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR)
            ?: sm?.getDefaultSensor(Sensor.TYPE_GAME_ROTATION_VECTOR)
        val rot = FloatArray(9)
        val orient = FloatArray(3)
        val listener = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                SensorManager.getRotationMatrixFromVector(rot, e.values)
                SensorManager.getOrientation(rot, orient) // [0]=yaw(azimuth), [1]=pitch, [2]=roll
                state.value = floatArrayOf(orient[0], orient[1])
            }
            override fun onAccuracyChanged(s: Sensor?, a: Int) {}
        }
        if (sensor != null) sm?.registerListener(listener, sensor, SensorManager.SENSOR_DELAY_GAME)
        onDispose { sm?.unregisterListener(listener) }
    }
    return state
}

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
