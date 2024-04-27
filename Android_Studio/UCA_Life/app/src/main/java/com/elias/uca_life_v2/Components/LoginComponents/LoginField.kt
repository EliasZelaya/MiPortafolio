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
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun LoginField() {
    val user: MutableState<String> = remember {
        mutableStateOf("")
    }
    val focusManager = LocalFocusManager.current

    TextField(
        value = user.value,
        onValueChange = {
            user.value = it
        },
        maxLines = 1,
        singleLine = true,
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icon person")
        },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus((FocusDirection.Down)) }
        ),
        visualTransformation = VisualTransformation.None,
        placeholder = { Text("Ingrese su nombre") },
        label = { Text("Nombre") },
    )
}