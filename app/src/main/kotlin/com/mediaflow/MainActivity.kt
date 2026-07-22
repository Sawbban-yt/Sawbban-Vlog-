package com.mediaflow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.mediaflow.presentation.ui.theme.MediaFlow2026Theme
import com.mediaflow.presentation.ui.MainScreen
import dagger.hilt.android.AndroidEntryPoint

/**
 * MainActivity - Application का main entry point
 * 
 * यहाँ Jetpack Compose UI render होता है।
 * 
 * Responsibilities:
 * - Compose content को set करना
 * - Theme apply करना
 * - Runtime permissions handle करना
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MediaFlow2026Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}