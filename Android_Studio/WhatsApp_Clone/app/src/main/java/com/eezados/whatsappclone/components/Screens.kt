package com.eezados.whatsappclone.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.eezados.whatsappclone.components.Navigations.NavBarGraph
import com.eezados.whatsappclone.components.Navigations.NavItemsList
import com.eezados.whatsappclone.components.Navigations.NavigationMenu

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screens() {
    /*val scaffoldState: ScaffoldState =
        rememberScaffoldState(rememberDrawerState(initialValue = DrawerValue.Closed))*/
    val navController =
        rememberNavController() //Esto lo que hace es que le recuerda donde es en que pantalla esta el usuario
    val navBackStackEntry by navController.currentBackStackEntryAsState()//Servira para que cuando se le de al boton de atras, regrese a una pantalla de las que a navegado el usuario
    val currentRoute: String? =
        navBackStackEntry?.destination?.route //Esto lo que hace es que almacena el historial de donde es que ha estado navegando el usuario
    val items =
        NavItemsList()//Esta es una lista de items que almacena la informacion para general los iconos de los botones de navegacion

    Scaffold(
        topBar = { TopAppBarContent() },//Es la barra de navegacion de arriba
        bottomBar = {// Es la barra de navegacion de la parte de abajo
            NavigationMenu(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                items = items,//Se le envia una variable de tipo NavItemList que contiene lo componentes para generar los botones
                currentRoute = currentRoute//Es el que almacena el historial para la navegacion del usuario
            ) { navItems ->//Esto es lo que le da la funcionalidad al boton de navegacion para cada
                // vez que se le precione a un boton distino navegue por las demas pantallas
                navController.navigate(navItems.route) {//Permite la navegacion
                    navController.graph.startDestinationRoute?.let { startDestinationRoute ->
                        popUpTo(startDestinationRoute) {
                            saveState = true
                        }
                    }
                    launchSingleTop = true
                    restoreState = true
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(ScreenRoute.Contacts.route) {
                    navController.graph.startDestinationRoute?.let {
                        startDestinationRoute ->
                        popUpTo(startDestinationRoute) {
                            saveState = true
                        }
                    }
                }
                },
            ) {
                Icon(
                    imageVector = Icons.Filled.AddComment,
                    contentDescription = "a",
                )
            }
        }
    ) { innerPadding ->
        NavBarGraph(
            navController = navController,
            innerPadding = innerPadding
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopAppBarContent() {
    Header({}, {}, {})
}

@Preview(showSystemUi = true)
@Composable
private fun ScreensPreview() {
    Screens()
}