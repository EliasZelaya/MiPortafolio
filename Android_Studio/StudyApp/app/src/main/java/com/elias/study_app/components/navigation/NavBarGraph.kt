package com.elias.study_app.components.navigation

import android.annotation.SuppressLint
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.screens.LogScreen
import com.elias.study_app.screens.NewActivityScreen
import com.elias.study_app.ui.theme.StudyAppTheme
import com.elias.study_app.viewmodel.NewActivityViewModel

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun NavBarGraph(
    viewModel: NewActivityViewModel
) {
    val navController = rememberNavController()
    StudyAppTheme {
        NavHost(
            navController = navController,
            route = Graph.LOGIN.graph,
            startDestination = LoginScreens.Login.route
        ) {
            composable(LoginScreens.Login.route) {
                LogScreen {
                    navController.navigate(MainScreen.Main.route)
                }
            }

            composable(MainScreen.Main.route) {
                HomeScreen(viewModel) {
                    navController.navigate(MainScreen.CreateTask.route)
                }
            }

            composable(MainScreen.CreateTask.route) {
                NewActivityScreen(viewModel) {
                    navController.navigate(MainScreen.Main.route)
                }
            }
        }
    }
}