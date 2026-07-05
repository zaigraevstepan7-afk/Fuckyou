plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.zaigraev.wearbrowser"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zaigraev.wearbrowser"
        // Wear OS 4 = API 33; minSdk 30 покрывает Wear OS 3+
        minSdk = 30
        targetSdk = 33
        versionCode = 3
        versionName = "1.3"
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

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
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

    // Голосовой/клавиатурный ввод на часах (RemoteInput)
    implementation("androidx.wear:wear-input:1.1.0")

    // Современные возможности WebView (тёмная тема и т.п.)
    implementation("androidx.webkit:webkit:1.10.0")
}
