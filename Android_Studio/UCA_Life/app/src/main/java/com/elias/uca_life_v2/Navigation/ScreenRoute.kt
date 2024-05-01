package com.elias.uca_life_v2.Navigation

sealed class ScreenRoute(var route: String) {
    object Login: ScreenRoute("LoginScreen")
    object Home: ScreenRoute("HomeScreen")
}