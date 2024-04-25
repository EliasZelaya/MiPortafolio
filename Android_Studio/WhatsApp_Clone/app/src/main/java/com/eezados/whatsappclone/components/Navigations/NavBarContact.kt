package com.eezados.whatsappclone.components.Navigations

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eezados.whatsappclone.components.Home.ScreenRoute
import com.eezados.whatsappclone.ui.Screen.CallsScreen
import com.eezados.whatsappclone.ui.Screen.ChatsScreen
import com.eezados.whatsappclone.ui.Screen.CommunityScreen
import com.eezados.whatsappclone.ui.Screen.ContactsScreen
import com.eezados.whatsappclone.ui.Screen.StatusScreen

//Preguntar si esta bien esto o si hay alguna forma de simplificarlo o mas optima de hacerlo
@Composable
fun NavBarContact(
    navController: NavHostController,
    innerPadding: PaddingValues
) {
    NavHost(navController = navController, startDestination = ScreenRoute.Contacts.route) {
        composable(ScreenRoute.Contacts.route) {
            ContactsScreen(innerPadding)
        }
    }
}