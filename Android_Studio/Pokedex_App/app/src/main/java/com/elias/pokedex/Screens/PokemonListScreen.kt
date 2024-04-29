package com.elias.pokedex.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elias.pokedex.components.pokemon_list_component.PokemonLabel
import com.elias.pokedex.ui.theme.LightBlue

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PokemonListScreen(
) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(color = LightBlue), columns = GridCells.Fixed(2)
    ) {
        item(10) {
            for (n in 1..12) {
                PokemonLabel(Modifier.padding(18.dp))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    PokemonListScreen()
}