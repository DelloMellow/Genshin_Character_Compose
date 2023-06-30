package com.example.genshincharacterusingcompose.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Credit : Screen("credit")
}
