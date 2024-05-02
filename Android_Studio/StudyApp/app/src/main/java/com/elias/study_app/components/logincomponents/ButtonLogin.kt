package com.elias.study_app.components.logincomponents

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.elias.study_app.MainActivity
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun ButtonLogin(
    modifier: Modifier,
    viewModel: LoginScreenViewModel
) {
    val context = LocalContext.current
    val enable by viewModel.enable.observeAsState(false)

    Button(
        onClick = { viewModel.checkLogin(context, MainActivity::class.java) },
        enabled = enable,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text("Login")
    }
}