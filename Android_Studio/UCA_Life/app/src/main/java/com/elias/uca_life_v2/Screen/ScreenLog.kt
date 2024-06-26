package com.elias.uca_life_v2.Screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.elias.uca_life_v2.Components.LoginComponents.LoginScreen
import com.elias.uca_life_v2.Navigation.NavBarGraph
import com.elias.uca_life_v2.SplashScreen
import com.elias.uca_life_v2.mvvm.LoginViewModel
import com.elias.uca_life_v2.ui.theme.UCA_Life_V2Theme

class ScreenLog : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UCA_Life_V2Theme {
//                Hay que instanciar el viewmodel y pasarlo como parametro
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}