package com.joao01sb.omdbinfo.ui.navigation.key

import androidx.navigation3.runtime.NavKey

sealed interface Screen : NavKey {

    object Home : Screen
    object Search : Screen
    object Details : Screen

}