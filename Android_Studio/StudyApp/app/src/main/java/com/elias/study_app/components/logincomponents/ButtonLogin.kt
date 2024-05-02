package com.elias.study_app.components.logincomponents

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun ButtonLogin(
    modifier: Modifier,
    viewModel: LoginScreenViewModel
) {
    val enable by viewModel.enable.observeAsState(false)

    Button(
        onClick = { },
        enabled = enable,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text("Login")
    }
}