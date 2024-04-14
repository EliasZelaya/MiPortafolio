package com.EEZADOS.laboratorio2.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyScreen() {
    Column(modifier = Modifier.background(Color(0xFF031926))) {
        PressButton()
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyScreenPreview() {
    MyScreen()
}