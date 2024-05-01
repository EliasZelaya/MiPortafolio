package com.elias.uca_life_v2.Navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elias.uca_life_v2.Components.LoginComponents.LoginScreen
import com.elias.uca_life_v2.Screen.HomeScreen
import com.elias.uca_life_v2.Screen.ScreenLog
import com.elias.uca_life_v2.SplashScreen

@Composable
fun NavBarGraph(
    navController : NavHostController
) {
    NavHost(navController = navController , startDestination = ScreenRoute.Login.route) {
        composable(ScreenRoute.Login.route) {
            LoginScreen()
        }

        composable(ScreenRoute.Home.route) {
            HomeScreen()
        }
    }
}