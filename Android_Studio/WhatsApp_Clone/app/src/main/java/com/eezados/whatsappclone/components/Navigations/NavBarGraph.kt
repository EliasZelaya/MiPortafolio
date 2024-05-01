package com.eezados.whatsappclone.components.Navigations

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eezados.whatsappclone.components.Home.NavigationContact
import com.eezados.whatsappclone.components.Home.ScreenRoute
import com.eezados.whatsappclone.ui.Screen.CallsScreen
import com.eezados.whatsappclone.ui.Screen.CommunityScreen
import com.eezados.whatsappclone.ui.Screen.HomeScreen
import com.eezados.whatsappclone.ui.Screen.StatusScreen

@Composable
fun NavBarGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController, startDestination = ScreenRoute.Home.route) {
        composable(ScreenRoute.Home.route) {
            HomeScreen(innerPadding)
        }
        composable(ScreenRoute.Status.route) {
            StatusScreen(innerPadding)
        }
        composable(ScreenRoute.Community.route) {
            CommunityScreen(innerPadding)
        }
        composable(ScreenRoute.Calls.route) {
            CallsScreen(innerPadding)
        }
        composable(ScreenRoute.Contacts.route) {
            NavigationContact(innerPadding)
        }
    }
}