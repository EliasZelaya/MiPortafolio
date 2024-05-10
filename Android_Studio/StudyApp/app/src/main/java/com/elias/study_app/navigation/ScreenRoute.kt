package com.elias.study_app.navigation

sealed class ScreenRoute(var route: String) {
    object Home: ScreenRoute("HomeScreen")
    object Activity: ScreenRoute("activity")
}