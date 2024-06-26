package com.elias.uca_life_v2.Components.LoginComponents

import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.VisualTransformation
import com.elias.uca_life_v2.mvvm.LoginViewModel

@Composable
fun LoginField(
    modifier: Modifier,
    viewModel: LoginViewModel
) {
    val userName by viewModel.username.observeAsState("")
    val password by viewModel.password.observeAsState("")
    val focusManager = LocalFocusManager.current

    TextField(
        value = userName,
        onValueChange = {
            viewModel.onLoginField(it, password)
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
        modifier = modifier
    )
}