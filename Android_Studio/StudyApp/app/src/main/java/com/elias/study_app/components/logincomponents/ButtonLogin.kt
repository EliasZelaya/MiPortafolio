package com.elias.study_app.components.logincomponents

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.elias.study_app.MainActivity
import com.elias.study_app.screens.HomeScreen
import com.elias.study_app.viewmodel.LoginScreenViewModel
import kotlinx.coroutines.launch

@Composable
fun ButtonLogin(
    modifier: Modifier,
    viewModel: LoginScreenViewModel
) {
    val context = LocalContext.current
    val enable by viewModel.enable.observeAsState(false)

    Button(
        onClick = {
            ChangeActivity(viewModel, context)
        },
        enabled = enable,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text("Login")
    }
}

fun ChangeActivity(loginState: LoginScreenViewModel, context: Context) {
    if (loginState.)
}