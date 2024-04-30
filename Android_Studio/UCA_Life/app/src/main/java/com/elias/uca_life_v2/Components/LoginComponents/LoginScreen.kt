package com.elias.uca_life_v2.Components.LoginComponents

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.uca_life_v2.R
import com.elias.uca_life_v2.mvvm.LoginViewModel

@Composable
fun LoginScreen() {
    val vm: LoginViewModel = viewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(modifier = Modifier.padding(40.dp)) {
            Image(
                painter = painterResource(R.drawable.login_logo),
                contentDescription = "Logo de la uca",
                modifier = Modifier.size(120.dp)
            )
        }

        LoginField(Modifier.width(280.dp) ,vm)
        Spacer(modifier = Modifier.padding(4.dp))
        PasswordField(Modifier.width(280.dp) ,vm)

        CheckDevice(Modifier.padding(14.dp) ,vm)

        Button(modifier = Modifier.width(275.dp) ,onClick = { }, shape = RectangleShape) {
            Text("Inicar sesion")
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(6.dp),
            contentAlignment = Alignment.Center
            ) {
            Row(horizontalArrangement = Arrangement.spacedBy(64.dp)) {
                UserOptions("Crear cuenta", 12.sp)
                UserOptions("Olvide mi contraseña", 12.sp)
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun MyPreview() {
    LoginScreen()
}