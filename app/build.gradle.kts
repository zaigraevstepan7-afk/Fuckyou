plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.zaigraev.wearbrowser"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.zaigraev.wearbrowser"
        // Wear OS 4 = API 33; minSdk 30 покрывает Wear OS 3+
        minSdk = 30
        targetSdk = 33
        versionCode = 8
        versionName = "2.2-gecko152"

        // OnePlus Watch (OPWWE261) — 32-битные часы (armeabi-v7a);
        // без фильтра APK вырос бы в разы из-за нативных библиотек
        // GeckoView под все архитектуры
        ndk {
            abiFilters.add("armeabi-v7a")
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildFeatures {
        compose = true
    }

    packaging {
        jniLibs {
            // Сжимаем нативные библиотеки движка: APK ~65 МБ вместо ~180.
            // Распаковка выполняется один раз при установке и на
            // скорость работы браузера не влияет.
            useLegacyPackaging = true
        }
    }
}

kotlin {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.activity:activity-compose:1.8.2")

    implementation(platform("androidx.compose:compose-bom:2024.02.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material:material-icons-extended")

    // Compose для Wear OS
    implementation("androidx.wear.compose:compose-material:1.3.0")
    implementation("androidx.wear.compose:compose-foundation:1.3.0")

    // Встроенный браузерный движок (Firefox/Gecko) — работает на часах
    // без системного WebView
    implementation("org.mozilla.geckoview:geckoview:152.0.20260629141727")
}
