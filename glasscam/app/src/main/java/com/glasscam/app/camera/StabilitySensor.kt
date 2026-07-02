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
 * Cumulative device rotation from the GYROSCOPE, integrated over time: [tilt, pan] in radians,
 * about the device's own X (tilt up/down) and Y (pan left/right) axes. Gyro is used instead of
 * the rotation-vector/azimuth because azimuth is magnetometer-noisy and degenerate (gimbal lock)
 * when the phone is held vertical to shoot — which made the aim jump around on its own. Gyro is
 * smooth, needs no compass, and reads ~0 when the phone is still (a deadzone removes tiny drift).
 */
@Composable
fun rememberAimRotation(): State<FloatArray> {
    val context = LocalContext.current
    val state = remember { mutableStateOf(floatArrayOf(0f, 0f)) }
    DisposableEffect(Unit) {
        val sm = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
        val gyro = sm?.getDefaultSensor(Sensor.TYPE_GYROSCOPE)
        var lastT = 0L
        var accTilt = 0f
        var accPan = 0f
        val listener = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                if (lastT != 0L) {
                    val dt = (e.timestamp - lastT) / 1_000_000_000f
                    if (dt > 0f && dt < 0.1f) {
                        val wx = e.values[0] // about device X → tilt up/down
                        val wy = e.values[1] // about device Y → pan left/right
                        if (kotlin.math.abs(wx) > 0.012f) accTilt += wx * dt
                        if (kotlin.math.abs(wy) > 0.012f) accPan += wy * dt
                        state.value = floatArrayOf(accTilt, accPan)
                    }
                }
                lastT = e.timestamp
            }
            override fun onAccuracyChanged(s: Sensor?, a: Int) {}
        }
        if (gyro != null) sm?.registerListener(listener, gyro, SensorManager.SENSOR_DELAY_GAME)
        onDispose { sm?.unregisterListener(listener) }
    }
    return state
}

/**
 * Device roll in degrees from the accelerometer (0 = level in portrait, negative = tilted left).
 * Drives the on-screen horizon level and the auto-straighten of the saved photo. Lightly smoothed.
 */
@Composable
fun rememberRollDegrees(): State<Float> {
    val context = LocalContext.current
    val roll = remember { mutableStateOf(0f) }
    DisposableEffect(Unit) {
        val sm = context.getSystemService(Context.SENSOR_SERVICE) as? SensorManager
        val accel = sm?.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
        var smoothed = 0f
        var has = false
        val listener = object : SensorEventListener {
            override fun onSensorChanged(e: SensorEvent) {
                val x = e.values[0]; val y = e.values[1]
                val deg = Math.toDegrees(kotlin.math.atan2(x.toDouble(), y.toDouble())).toFloat()
                smoothed = if (!has) { has = true; deg } else smoothed + (deg - smoothed) * 0.2f
                roll.value = smoothed
            }
            override fun onAccuracyChanged(s: Sensor?, a: Int) {}
        }
        if (accel != null) sm.registerListener(listener, accel, SensorManager.SENSOR_DELAY_UI)
        onDispose { sm?.unregisterListener(listener) }
    }
    return roll
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
