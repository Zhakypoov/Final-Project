package com.example.final_project.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomBarScreen(
        route = "Home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object AddOsek: BottomBarScreen(
        route = "Add",
        title = "Add",
        icon = Icons.Default.Add
    )

    object Profile: BottomBarScreen(
        route = "Profile",
        title = "Profile",
        icon = Icons.Default.Person
    )
    object Settings: BottomBarScreen(
        route = "Settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}
