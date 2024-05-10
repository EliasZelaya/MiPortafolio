package com.elias.study_app.navigation

import androidx.compose.material3.DatePickerState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.screens.LogScreen
import com.elias.study_app.screens.LoginScreen
import com.elias.study_app.ui.theme.StudyAppTheme

@Composable
fun NavBarGraph() {
    val navController = rememberNavController()
    StudyAppTheme {
        NavHost(
            navController = navController,
            route = Graph.LOGIN.graph,
            startDestination = LoginScreens.Login.route
        ) {
            composable(LoginScreens.Login.route) {
                LogScreen {
                    { navController.navigate(MainScreen.Main.route) }
                }
            }
        }

        NavHost(
            navController = navController,
            route = Graph.MAIN.graph,
            startDestination = MainScreen.Main.route
        ) {
            composable(MainScreen.Main.route) {
                HomeScreen()
            }

            composable(MainScreen.CreateTask.route) {
                //TODO
            }
        }
        /*composable(ScreenRoute.Activity.route) {
            NewActivityScreen(dateState = , viewmodel = )
        }*/
    }
}