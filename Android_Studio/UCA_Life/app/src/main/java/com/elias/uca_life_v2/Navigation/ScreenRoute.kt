package com.elias.uca_life_v2.Navigation

sealed class ScreenRoute(route: String) {
    object Splashscreen: ScreenRoute("Splashscreen")
    object Login: ScreenRoute("LoginScreen")
    object Home: ScreenRoute("HomeScreen")
}