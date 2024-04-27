package com.elias.uca_life_v2.Components.LoginComponents

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction

@Composable
fun PasswordField() {
    val user: MutableState<String> = remember {
        mutableStateOf("")
    }

    TextField(
        value = user.value,
        onValueChange = {
            user.value = it
        },
        maxLines = 1,
        singleLine = true,
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icono de persona")
        },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions(
            onDone = {}
        ),
        placeholder = { Text("Ingrese su contraseña") },
        label = { Text("Contraseña") },
    )
}