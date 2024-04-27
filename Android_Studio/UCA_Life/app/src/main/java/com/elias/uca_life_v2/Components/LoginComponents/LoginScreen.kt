package com.elias.uca_life_v2.Components.LoginComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elias.uca_life_v2.R

@Composable
fun LoginScreen() {
    val checked by remember { mutableStateOf(true) }
    Column(
        modifier = Modifier.fillMaxSize(),
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

        LoginField()
        PasswordField()

        Spacer(modifier = Modifier.padding(6.dp))
        CheckDevice(checked = checked)

        Button(onClick = { /*TODO*/ }) {
            Text("Inicar sesion")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    LoginScreen()
}