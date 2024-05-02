package com.elias.study_app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.study_app.components.logincomponents.PasswordField
import com.elias.study_app.components.logincomponents.UsernameField
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun LoginScreen() {
    val viewmodel: LoginScreenViewModel = viewModel()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        UsernameField(Modifier.width(300.dp).padding(8.dp) ,viewmodel)
        PasswordField(Modifier.width(300.dp).padding(8.dp) ,viewmodel)
    }
}

@Preview
@Composable
private fun ScreenPreview() {
    LoginScreen()
}