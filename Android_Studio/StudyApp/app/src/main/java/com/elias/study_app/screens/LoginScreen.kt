package com.elias.study_app.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.study_app.components.navigation.NavBarGraph
import com.elias.study_app.ui.theme.StudyAppTheme
import com.elias.study_app.viewmodel.NewActivityViewModel


class LoginScreen() : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            StudyAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavBarGraph()
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
