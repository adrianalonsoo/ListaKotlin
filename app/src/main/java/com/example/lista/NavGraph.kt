package com.example.lista

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route

    ) {
        composable(
            Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }
        composable(
            Screen.Second.route
        ) {
            SecondScreen()
        }
        composable(
            Screen.Third.route
        ) {
            ThirdScreen()
        }
        composable(
            Screen.Four.route
        ) {
            FourScreen()
        }
    }
}