package com.elias.study_app.components.logincomponents

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun UsernameField() {
    TextField(
        value = "",
        onValueChange = {}
    )
}