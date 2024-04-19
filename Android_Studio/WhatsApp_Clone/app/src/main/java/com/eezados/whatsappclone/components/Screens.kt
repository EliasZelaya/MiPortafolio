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
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute: String? = navBackStackEntry?.destination?.route
    val items = NavItemsList()

    Scaffold(
        topBar = { TopAppBarContent() },
        bottomBar = {
            NavigationMenu(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                items = items,
                currentRoute = currentRoute
            ) { navItems ->
                navController.navigate(navItems.route) {
                    navController.graph.startDestinationRoute?.let { startDestinationRoute ->
                        popUpTo(startDestinationRoute) {
                            saveState = true
                        }
                    }
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
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