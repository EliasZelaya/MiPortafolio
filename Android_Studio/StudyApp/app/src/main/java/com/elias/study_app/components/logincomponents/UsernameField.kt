package com.elias.study_app.components.logincomponents

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun UsernameField(
    modifier: Modifier,
    viewmodel: LoginScreenViewModel
) {
    val username by viewmodel.username.observeAsState("")
    val password by viewmodel.password.observeAsState("")

    TextField(
        value = username,
        onValueChange = {
            viewmodel.onLoginField(it, password)
        },
        label = { Text(text = "Name")},
        placeholder = { Text(text = "Write your name")},
        leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "User icon") },
        modifier = modifier
    )
}