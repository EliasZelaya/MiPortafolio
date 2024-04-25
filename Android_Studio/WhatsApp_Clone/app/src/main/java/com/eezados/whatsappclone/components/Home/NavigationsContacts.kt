package com.eezados.whatsappclone.components.Home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.eezados.whatsappclone.components.Header.HeaderContacts
import com.eezados.whatsappclone.components.Navigations.NavBarContact
import com.eezados.whatsappclone.components.Navigations.NavBarGraph
import com.eezados.whatsappclone.ui.Screen.ContactsScreen

@Composable
fun NavigationContact(
    innerPadding: PaddingValues
) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()//Servira para que cuando se le de al boton de atras, regrese a una pantalla de las que a navegado el usuario
    val currentRoute: String? =
        navBackStackEntry?.destination?.route

    //Cuando ya esta en esta pantalla llama a la funcion que tiene la instancia de la otra ventana que la que
    //contendra la lista de contactos
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        Scaffold(
            topBar = {
                HeaderContacts(searchClick = { /*TODO*/ }, {})
            }
        ) { innerPadding ->
            NavBarContact(
                navController = navController,
                innerPadding = innerPadding
            )
        }
    }
}