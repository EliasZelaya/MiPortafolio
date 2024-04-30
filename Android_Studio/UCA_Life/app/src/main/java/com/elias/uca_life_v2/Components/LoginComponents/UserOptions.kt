package com.elias.uca_life_v2.Components.LoginComponents

import android.util.Size
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun UserOptions(
    text: String,
    fontSize: TextUnit
) {
    Text(text, fontSize = fontSize, modifier = Modifier
        .clickable { })
}