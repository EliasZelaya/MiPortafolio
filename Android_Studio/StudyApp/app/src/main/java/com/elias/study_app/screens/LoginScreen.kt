package com.elias.study_app.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.study_app.R
import com.elias.study_app.components.logincomponents.ButtonLogin
import com.elias.study_app.components.logincomponents.PasswordField
import com.elias.study_app.components.logincomponents.UsernameField
import com.elias.study_app.ui.theme.StudyAppTheme
import com.elias.study_app.viewmodel.LoginScreenViewModel


class LoginScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudyAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewmodel: LoginScreenViewModel = viewModel()

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
                            viewmodel
                        )
                    }
                }
            }
        }
    }
}

/*
@Preview
@Composable
private fun ScreenPreview() {
    LoginScreen(NavHostController)
}*/
