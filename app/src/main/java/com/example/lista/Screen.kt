package com.example.lista

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")
    object Second : Screen("second_screen")
    object Third : Screen("third_screen")
    object Four : Screen("four_screen")
}