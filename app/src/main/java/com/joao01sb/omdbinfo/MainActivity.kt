package com.joao01sb.omdbinfo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.joao01sb.omdbinfo.ui.navigation.AppNav
import com.joao01sb.omdbinfo.ui.theme.OMDbInfoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OMDbInfoTheme {
                AppNav()
            }
        }
    }
}