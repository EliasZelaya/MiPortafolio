package com.elias.pokedex.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elias.pokedex.Screens.PokemonListScreen
import com.elias.pokedex.Screens.PokemonStatsScreen
import com.elias.pokedex.home.ScreenRoute

@Composable
fun NavBarGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController, startDestination = ScreenRoute.Pokemon_List_Screen.route){
        composable(ScreenRoute.Pokemon_List_Screen.route) {
            PokemonListScreen()
        }
        composable(ScreenRoute.Pokemon_Stats_Screen.route) {
            PokemonStatsScreen(innerPadding)
        }
    }
}