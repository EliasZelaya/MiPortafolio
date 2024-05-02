package com.elias.study_app.components.logincomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Key
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun PasswordField(
    modifier: Modifier,
    viewmodel: LoginScreenViewModel
) {
    val username by viewmodel.username.observeAsState("")
    val password by viewmodel.password.observeAsState("")
    val checkVisibility by viewmodel.checkVisibility.observeAsState(false)
    val Icon by viewmodel.visibility.observeAsState(Icons.Default.VisibilityOff)
    val visualTransformation by viewmodel.passwordKey.observeAsState(PasswordVisualTransformation())

    TextField(
        value = password,
        onValueChange = {
            viewmodel.onLoginField(username, it)
        },
        label = { Text(text = "Password") },
        placeholder = { Text(text = "Write your password") },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = visualTransformation,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Key,
                contentDescription = "User password icon"
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icon,
                contentDescription = "Visibility password",
                modifier = Modifier.clickable { viewmodel.passVisibility(checkVisibility) }
            )
        },
        modifier = modifier
    )
}