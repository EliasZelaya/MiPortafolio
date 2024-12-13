package com.elias.study_app.components.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.screens.LogScreen
import com.elias.study_app.screens.NewActivityScreen
import com.elias.study_app.ui.theme.StudyAppTheme
import com.elias.study_app.viewmodel.LoginScreenViewModel
import com.elias.study_app.viewmodel.NewActivityViewModel

@SuppressLint("ComposableDestinationInComposeScope")
@Composable
fun NavBarGraph(
) {
    val navController = rememberNavController()
    StudyAppTheme {
        NavHost(
            navController = navController,
            route = Graph.LOGIN.graph,
            startDestination = LoginScreens.Login.route
        ) {
            composable(LoginScreens.Login.route) {
                val viewmodel = it.sharedViewModel<LoginScreenViewModel>(navController = navController)
                LogScreen(viewmodel) {
                    navController.navigate(Graph.MAIN.graph) {
                        popUpTo(Graph.LOGIN.graph) {
                            inclusive = true
                        }
                    }
                }
            }

            navigation(
                startDestination = MainScreen.Main.route,
                route = Graph.MAIN.graph
            ) {
                composable(MainScreen.Main.route) {
                    val viewmodel = it.sharedViewModel<NewActivityViewModel>(navController = navController)
                    HomeScreen(viewmodel = viewmodel) {
                        navController.navigate(MainScreen.CreateTask.route)
                    }
                }

                composable(MainScreen.CreateTask.route) {
                    val viewmodel = it.sharedViewModel<NewActivityViewModel>(navController = navController)
                    NewActivityScreen(viewModel = viewmodel) {
                        navController.popBackStack()
                    }
                }
            }
        }
    }
}

//Esta funcion es para poder utilizar el mismo viewmodel en los componentes que los
//necesitan
@Composable
inline fun <reified T: ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
    val navGraphRoute = destination.parent?.route ?: return viewModel()
    val parentEntry = remember(this) {
        navController.getBackStackEntry(navGraphRoute)
    }
    return viewModel(parentEntry)
}