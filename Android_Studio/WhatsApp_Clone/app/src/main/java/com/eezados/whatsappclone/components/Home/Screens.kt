package com.eezados.whatsappclone.components.Home

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.eezados.whatsappclone.components.Header.Header
import com.eezados.whatsappclone.components.Navigations.NavBarGraph
import com.eezados.whatsappclone.components.Navigations.NavItemsList
import com.eezados.whatsappclone.components.Navigations.NavigationMenu

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screens() {
    val navController =
        rememberNavController() //Esto lo que hace es que le recuerda donde es en que pantalla esta el usuario
    val navBackStackEntry by navController.currentBackStackEntryAsState()//Servira para que cuando se le de al boton de atras, regrese a una pantalla de las que a navegado el usuario
    val currentRoute: String? =
        navBackStackEntry?.destination?.route //Esto lo que hace es que almacena el historial de donde es que ha estado navegando el usuario
    val items =
        NavItemsList()//Esta es una lista de items que almacena la informacion para general los iconos de los botones de navegacion
    val visibility = currentRoute != ScreenRoute.Contacts.route
    val visibilityIcon = currentRoute != ScreenRoute.Community.route
    val visibilityButton = currentRoute != ScreenRoute.Status.route

    fun titleRoute(currentRout: String?): String {
        return when (currentRout) {
            ScreenRoute.Chats.route -> "WhatsApp"
            ScreenRoute.Status.route -> "News"
            ScreenRoute.Community.route -> "Community"
            ScreenRoute.Calls.route -> "Calls"
            else -> ""
        }
    }

    Scaffold(
        topBar = {
            TopAppBarContent(visibility, titleRoute(currentRoute), visibilityIcon)
        },//Es la barra de navegacion de arriba
        bottomBar = {// Es la barra de navegacion de la parte de abajo
            AnimatedVisibility(visibility) {
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
            }
        },
        floatingActionButton = {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                if (!visibilityButton) {
                    SmallFloatingActionButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Edit, contentDescription = "Write Status")
                    }
                }
                Spacer(modifier = Modifier.padding(top = 12.dp))
                AnimatedVisibility(visibility) {
                    //Cuando se presiona aca el floatingactyiobutton instancia la pantalla del NavBarGraph que es la que tiene el otro scaffold
                    FloatingActionButton(
                        onClick = {
                            navController.navigate(ScreenRoute.Contacts.route) {
                                navController.graph.startDestinationRoute?.let { startDestinationRoute ->
                                    popUpTo(startDestinationRoute) {
                                        saveState = true
                                    }
                                }
                                launchSingleTop = true
                                restoreState = true

                            }
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.AddComment,
                            contentDescription = "a",
                        )
                    }

                }
            }
        }
    ) { innerPadding ->
        NavBarGraph(
            navController = navController,
            innerPadding = innerPadding,
        )
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TopAppBarContent(visibility: Boolean, title: String?, visibilityIcon: Boolean) {
    AnimatedVisibility(visibility) {
        Header({}, {}, {}, title, visibilityIcon)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ScreensPreview() {
    Screens()
}