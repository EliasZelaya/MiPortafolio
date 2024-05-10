package com.elias.study_app.navigation

import androidx.compose.material3.DatePickerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.screens.NewActivityScreen

@Composable
fun NavBarGraph(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = ScreenRoute.Home.route) {
        composable(ScreenRoute.Home.route) {
            HomeScreen()
        }
        /*composable(ScreenRoute.Activity.route) {
            NewActivityScreen(dateState = , viewmodel = )
        }*/
    }
}