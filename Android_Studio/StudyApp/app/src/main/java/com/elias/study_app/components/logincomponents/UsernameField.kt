package com.elias.study_app.components.logincomponents

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
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun UsernameField(
    modifier: Modifier,
    viewmodel: LoginScreenViewModel
) {
    val username by viewmodel.username.observeAsState("")
    val password by viewmodel.password.observeAsState("")
    val focusManager = LocalFocusManager.current

    TextField(
        value = username,
        onValueChange = {
            viewmodel.onLoginField(it, password)
        },
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = {
                focusManager.moveFocus(FocusDirection.Down)
            }
        ),
        label = { Text(text = "Name")},
        placeholder = { Text(text = "Write your name")},
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "User icon") },
        modifier = modifier
    )
}