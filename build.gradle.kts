// Root build.gradle.kts for MediaFlow 2026
// Production-ready Android Media Player with AI-powered Playlists

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.ksp) apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
