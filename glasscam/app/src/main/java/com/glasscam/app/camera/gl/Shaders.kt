package com.glasscam.app.camera.gl

import android.opengl.GLES20
import android.opengl.GLES30

/** GLSL sources + tiny GL helpers for the live-camera + Liquid Glass pipeline. */
object Shaders {

    // Fullscreen triangle/quad vertex shader (positions in clip space, uv 0..1).
    const val QUAD_VERT = """#version 300 es
        precision highp float;
        layout(location = 0) in vec2 aPos;
        out vec2 vUv;
        uniform mat4 uTexMatrix; // for OES orientation; identity for FBO passes
        uniform int uUseTexMatrix;
        void main() {
            vec2 uv = aPos * 0.5 + 0.5;
            if (uUseTexMatrix == 1) {
                uv = (uTexMatrix * vec4(uv, 0.0, 1.0)).xy;
            }
            vUv = uv;
            gl_Position = vec4(aPos, 0.0, 1.0);
        }
    """

    // Camera pass: sample external OES, apply AI grade + unsharp sharpen, output graded scene.
    const val CAMERA_FRAG = """#version 300 es
        #extension GL_OES_EGL_image_external_essl3 : require
        precision highp float;
        in vec2 vUv;
        out vec4 fragColor;
        uniform samplerExternalOES uCam;
        uniform vec2 uTexel;      // 1/resolution
        uniform float uExposure;  // -1..1
        uniform float uContrast;  // ~0.7..1.4
        uniform float uSaturation;// ~0.6..1.6
        uniform float uWarmth;    // -1..1
        uniform float uShadows;   // -1..1
        uniform float uSharpen;   // 0..1
        uniform float uGrain;     // 0..1
        uniform float uTime;

        float rand(vec2 c){ return fract(sin(dot(c, vec2(12.9898,78.233))) * 43758.5453); }

        void main() {
            vec3 col = texture(uCam, vUv).rgb;
            // unsharp mask
            if (uSharpen > 0.001) {
                vec3 blur = (
                    texture(uCam, vUv + vec2(uTexel.x, 0.0)).rgb +
                    texture(uCam, vUv - vec2(uTexel.x, 0.0)).rgb +
                    texture(uCam, vUv + vec2(0.0, uTexel.y)).rgb +
                    texture(uCam, vUv - vec2(0.0, uTexel.y)).rgb) * 0.25;
                col += (col - blur) * (uSharpen * 1.4);
            }
            // exposure + shadow lift
            col += uExposure * 0.18 + uShadows * 0.08 * (1.0 - col);
            // contrast around 0.5
            col = (col - 0.5) * uContrast + 0.5;
            // saturation
            float l = dot(col, vec3(0.299, 0.587, 0.114));
            col = mix(vec3(l), col, uSaturation);
            // warmth
            col.r += uWarmth * 0.06;
            col.b -= uWarmth * 0.06;
            // grain
            if (uGrain > 0.001) {
                float n = rand(vUv + fract(uTime)) - 0.5;
                col += n * uGrain * 0.10;
            }
            fragColor = vec4(clamp(col, 0.0, 1.0), 1.0);
        }
    """

    // Downsample + box blur for the refraction backdrop.
    const val BLUR_FRAG = """#version 300 es
        precision highp float;
        in vec2 vUv;
        out vec4 fragColor;
        uniform sampler2D uTex;
        uniform vec2 uTexel;
        void main() {
            vec3 s = vec3(0.0);
            for (int x = -2; x <= 2; x++) {
                for (int y = -2; y <= 2; y++) {
                    s += texture(uTex, vUv + vec2(float(x), float(y)) * uTexel * 1.5).rgb;
                }
            }
            fragColor = vec4(s / 25.0, 1.0);
        }
    """

    // Liquid Glass pass: composite refractive glass panels over the graded scene.
    // Up to 6 rounded-rect panels; per-fragment refraction + chromatic edges + glare.
    const val GLASS_FRAG = """#version 300 es
        precision highp float;
        in vec2 vUv;                 // 0..1, origin bottom-left
        out vec4 fragColor;
        uniform sampler2D uScene;    // graded, full-res
        uniform sampler2D uBlur;     // blurred backdrop
        uniform vec2 uRes;
        uniform int uCount;
        uniform vec4 uPanels[6];     // x,y,w,h in 0..1 (origin bottom-left)
        uniform float uRadius[6];    // corner radius in 0..1 of width

        // signed distance to rounded box centered at c with half-size b, radius r
        float sdRoundBox(vec2 p, vec2 b, float r) {
            vec2 q = abs(p) - b + r;
            return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r;
        }

        void main() {
            vec2 uv = vUv;
            vec3 base = texture(uScene, uv).rgb;
            vec3 outc = base;
            float aspect = uRes.x / uRes.y;

            for (int i = 0; i < 6; i++) {
                if (i >= uCount) break;
                vec4 pr = uPanels[i];
                vec2 center = pr.xy + pr.zw * 0.5;
                vec2 half = pr.zw * 0.5;
                float r = uRadius[i] * pr.z;
                // work in aspect-corrected space so corners are round
                vec2 p = (uv - center);
                vec2 pa = vec2(p.x * aspect, p.y);
                vec2 ba = vec2(half.x * aspect, half.y);
                float d = sdRoundBox(pa, ba, r * aspect);

                if (d < 0.0) {
                    float edge = smoothstep(0.0, -0.06, d); // 0 at rim -> 1 inside... invert below
                    // normal of the SDF (points outward) via gradient
                    float e = 0.002;
                    vec2 n = normalize(vec2(
                        sdRoundBox(pa + vec2(e,0.0), ba, r*aspect) - sdRoundBox(pa - vec2(e,0.0), ba, r*aspect),
                        sdRoundBox(pa + vec2(0.0,e), ba, r*aspect) - sdRoundBox(pa - vec2(0.0,e), ba, r*aspect)
                    ) + 1e-5);
                    // stronger refraction near the rim
                    float rim = clamp(1.0 - (-d) / 0.10, 0.0, 1.0); // 1 at rim, 0 deep inside
                    float strength = rim * rim * 0.035;
                    vec2 refr = n * strength;
                    // chromatic aberration: sample blurred backdrop with per-channel offset
                    vec3 g;
                    g.r = texture(uBlur, uv + refr * 1.06).r;
                    g.g = texture(uBlur, uv + refr * 1.00).g;
                    g.b = texture(uBlur, uv + refr * 0.94).b;
                    // glass tint + slight brightening
                    vec3 glass = mix(g, g + 0.06, 0.5) + vec3(0.02, 0.03, 0.05) * 0.6;
                    // specular glare along top-left rim
                    float glare = pow(clamp(dot(n, normalize(vec2(-0.6, 0.8))), 0.0, 1.0), 6.0) * rim;
                    glass += glare * 0.5;
                    float inside = clamp(-d / 0.02, 0.0, 1.0); // soft edge
                    outc = mix(outc, glass, inside);
                }
            }
            fragColor = vec4(outc, 1.0);
        }
    """

    fun compile(type: Int, src: String): Int {
        val s = GLES20.glCreateShader(type)
        GLES20.glShaderSource(s, src.trimIndent())
        GLES20.glCompileShader(s)
        val ok = IntArray(1)
        GLES20.glGetShaderiv(s, GLES20.GL_COMPILE_STATUS, ok, 0)
        if (ok[0] == 0) {
            val log = GLES20.glGetShaderInfoLog(s)
            GLES20.glDeleteShader(s)
            throw RuntimeException("Shader compile failed: $log")
        }
        return s
    }

    fun program(vertSrc: String, fragSrc: String): Int {
        val v = compile(GLES20.GL_VERTEX_SHADER, vertSrc)
        val f = compile(GLES20.GL_FRAGMENT_SHADER, fragSrc)
        val p = GLES20.glCreateProgram()
        GLES20.glAttachShader(p, v)
        GLES20.glAttachShader(p, f)
        GLES20.glLinkProgram(p)
        val ok = IntArray(1)
        GLES20.glGetProgramiv(p, GLES20.GL_LINK_STATUS, ok, 0)
        GLES20.glDeleteShader(v); GLES20.glDeleteShader(f)
        if (ok[0] == 0) {
            val log = GLES20.glGetProgramInfoLog(p)
            GLES20.glDeleteProgram(p)
            throw RuntimeException("Program link failed: $log")
        }
        return p
    }

    // helper to keep GLES30 referenced (essl3 external requires a GLES3 context)
    fun ensureGl3() { GLES30.glGetError() }
}
