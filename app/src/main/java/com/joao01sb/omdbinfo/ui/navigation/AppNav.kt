package com.joao01sb.omdbinfo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.ui.NavDisplay
import com.joao01sb.omdbinfo.ui.navigation.key.Screen
import com.joao01sb.omdbinfo.ui.screen.HomeScreen

@Composable
fun AppNav() {

    val backStack = remember {
        mutableStateListOf<Screen>(Screen.Home)
    }

    NavDisplay(
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = { key ->
            when (key) {
                is Screen.Home -> NavEntry(key) {
                    HomeScreen(onMovieClick = {
                        backStack.add(Screen.Search)
                    })
                }

                is Screen.Search -> NavEntry(key) {

                }

                is Screen.Details -> NavEntry(key) {

                }
            }
        }
    )

}