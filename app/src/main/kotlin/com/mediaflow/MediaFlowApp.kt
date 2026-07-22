package com.mediaflow

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * MediaFlow 2026 - Production-ready Android Media Player
 * 
 * Application class जो Hilt Dependency Injection को initialize करता है।
 * यह हर बार ऐप launch होता है तो create होता है।
 * 
 * Features:
 * - AI-powered Smart Playlists
 * - Complete Media Playback (Video + Audio)
 * - Background Playback with Notifications
 * - Picture-in-Picture Support
 * - Playlist Management
 * - Material 3 Design
 */
@HiltAndroidApp
class MediaFlowApp : Application() {

    override fun onCreate() {
        super.onCreate()
        // Hilt automatically initializes here
    }
}