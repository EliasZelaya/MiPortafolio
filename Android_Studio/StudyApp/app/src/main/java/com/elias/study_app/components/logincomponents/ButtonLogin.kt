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
    viewModel: LoginScreenViewModel,
    onButton: () -> Unit
) {
    /*val context = LocalContext.current
    val enable by viewModel.enable.observeAsState(false)
    val finished by viewModel.changeActivity.observeAsState(null)*/
//    var enable by viewModel.enable.collectAsState(false)
    val check by viewModel.checkVisibility.observeAsState(false)
    Button(
        onClick = {

        },
        enabled = true,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text("Login")
    }
    /*if (finished == true) {
        context.startActivities(arrayOf(Intent(context, MainActivity::class.java)))
        (context as Activity).finish()
    } else if(finished == false) {
        Toast.makeText(
            context,
            "Las credenciales no son validas, vuelve a intentarlo",
            Toast.LENGTH_SHORT
        ).show()
    }*/
}