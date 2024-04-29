package com.elias.pokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.elias.pokedex.Screens.PokemonListScreen
import com.elias.pokedex.components.header.Header
import com.elias.pokedex.navigation.NavBarGraph
import com.elias.pokedex.ui.theme.LightBlue
import com.elias.pokedex.ui.theme.PokedexTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokedexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val correntRoute: String? = navBackStackEntry?.destination?.route

                    Column {
                        Header(
                            modifier = Modifier
                                .background(color = LightBlue)
                                .fillMaxWidth()
                                .padding(18.dp)
                        )

                        PokemonListScreen()
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun MyPreview() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val correntRoute: String? = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = {
            Header(
                modifier = Modifier
                    .background(color = LightBlue)
                    .fillMaxWidth()
                    .padding(18.dp)
            )
        }
    ) { innerPadding ->
        NavBarGraph(
            navController = navController,
            innerPadding = innerPadding
        )
    }
}