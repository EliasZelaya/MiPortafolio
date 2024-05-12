package com.elias.study_app.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.study_app.R
import com.elias.study_app.components.logincomponents.ButtonLogin
import com.elias.study_app.components.logincomponents.PasswordField
import com.elias.study_app.components.logincomponents.UsernameField
import com.elias.study_app.viewmodel.LoginScreenViewModel

@Composable
fun LogScreen(
    onButtonLogin: () -> Unit
) {
    val viewmodel: LoginScreenViewModel = viewModel()
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logogod),
            contentDescription = "Logo of calendar",
            modifier = Modifier.size(200.dp)
        )

        UsernameField(
            Modifier
                .width(300.dp)
                .padding(8.dp), viewmodel
        )
        PasswordField(
            Modifier
                .width(300.dp)
                .padding(8.dp), viewmodel
        )

        ButtonLogin(
            Modifier
                .width(300.dp)
                .padding(8.dp),
            viewmodel,
            context,
            onButtonLogin,
        )
    }
}