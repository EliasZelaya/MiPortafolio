package com.elias.pokedex.components.header

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchField(modifier: Modifier) {
    TextField(
        value = "",
        onValueChange = {},
        maxLines = 1,
        singleLine = true,
        label = { Text("Search") },
        modifier = modifier,
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    SearchField(Modifier)
}