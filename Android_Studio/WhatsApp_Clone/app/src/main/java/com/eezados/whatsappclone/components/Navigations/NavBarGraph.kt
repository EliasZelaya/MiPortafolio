package com.eezados.whatsappclone.components.Navigations

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eezados.whatsappclone.components.ScreenRoute
import com.eezados.whatsappclone.ui.Screen.CallsScreen
import com.eezados.whatsappclone.ui.Screen.ChatsScreen
import com.eezados.whatsappclone.ui.Screen.CommunityScreen
import com.eezados.whatsappclone.ui.Screen.StatusScreen

@Composable
fun NavBarGraph(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController, startDestination = ScreenRoute.Chats.route) {
        composable(ScreenRoute.Chats.route) {
            ChatsScreen(innerPadding)
        }
        composable(ScreenRoute.Status.route) {
            StatusScreen(innerPadding)
        }
        composable(ScreenRoute.Community.route) {
            CommunityScreen()
        }
        composable(ScreenRoute.Calls.route) {
            CallsScreen()
        }
    }
}