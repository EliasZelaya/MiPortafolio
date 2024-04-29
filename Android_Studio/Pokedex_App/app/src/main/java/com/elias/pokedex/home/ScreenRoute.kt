package com.elias.pokedex.home

import java.util.Objects

sealed class ScreenRoute(val route: String) {
    object Pokemon_List_Screen: ScreenRoute("Pokemon_List_Screen")
    object Pokemon_Stats_Screen: ScreenRoute("Pokemon_Stats_Screen")
}
