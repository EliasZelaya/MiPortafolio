package com.elias.uca_life_v2.Components.LoginComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elias.uca_life_v2.mvvm.LoginViewModel

@Composable
fun CheckDevice(
    checked: Boolean,
    viewmodel: LoginViewModel,
    modifier: Modifier
) {
    val check by viewmodel.checked.observeAsState(false)
    Column(modifier = modifier) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            Checkbox(
                checked = check,
                onCheckedChange = null,
                modifier = Modifier.clickable(onClick = { viewmodel.checkDevice(check) })
            )
            Text("Recuerdame en este dispositivo")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Crear cuenta", fontSize = 8.sp)
            Text("Olvide mi contraseña", fontSize = 8.sp)

        }

    }
}

@Preview
@Composable
private fun My() {
    CheckDevice(checked = true, viewmodel = LoginViewModel(), Modifier)
}