package com.elias.study_app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
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
        UsernameField(viewmodel)
    }
}