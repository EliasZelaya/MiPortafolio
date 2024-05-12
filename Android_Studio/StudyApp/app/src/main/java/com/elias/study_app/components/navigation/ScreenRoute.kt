package com.elias.study_app.components.navigation

/*sealed class ScreenRoute(var route: String) {
    object Home : ScreenRoute("HomeScreen")
    object Activity : ScreenRoute("activity")
}*/

sealed class LoginScreens(val route: String) {
    data object Login: LoginScreens("HomeScreen")
}

sealed class MainScreen(val route: String) {
    data object Main: MainScreen("MainScreen")
    data object CreateTask: MainScreen("CreateTaskScreen")
}

sealed class Graph(val graph: String) {
    data object LOGIN: Graph("LOGIN")
    data object MAIN: Graph("MAIN")
}