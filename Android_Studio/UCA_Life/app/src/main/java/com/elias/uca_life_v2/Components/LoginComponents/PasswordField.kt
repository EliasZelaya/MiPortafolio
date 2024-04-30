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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.lifecycle.createSavedStateHandle
import com.elias.uca_life_v2.mvvm.LoginViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope

@Composable
fun PasswordField(viewModel: LoginViewModel) {
    val password: String by viewModel.password.observeAsState("")
    val username: String by viewModel.username.observeAsState("")

    TextField(
        value =
            password,
        onValueChange = {
            viewModel.onLoginField(username, it)
        },
        maxLines = 1,
        singleLine = true,
        leadingIcon = {
            Icon(imageVector = Icons.Default.Person, contentDescription = "Icono de persona")
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = PasswordVisualTransformation(),
        keyboardActions = KeyboardActions(
            onDone = {}
        ),
        placeholder = { Text("Ingrese su contraseña") },
        label = { Text("Contraseña") },
    )
}