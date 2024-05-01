package com.elias.uca_life_v2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.navArgument
import com.elias.uca_life_v2.Navigation.ScreenRoute
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController
) {
    LaunchedEffect(key1 = true) {
        delay(2000)//Simula una operacion
        navController.popBackStack()//Para que cuando se de la flecha hacia atras no regrese a la splashscreen
        navController.navigate(ScreenRoute.Login.route)//Manda a la pantalla de login
    }
    Splash()
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.klipartz_com),
            contentDescription = "Logo buho",
            modifier = Modifier.size(150.dp)
        )
        Text(text = "UCA Life", fontSize = 30.sp, fontWeight = FontWeight.Bold)
    }
}
