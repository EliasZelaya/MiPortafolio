package com.elias.study_app.components.logincomponents

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import com.elias.study_app.MainActivity
import com.elias.study_app.viewmodel.LoginScreenViewModel
import kotlin.coroutines.coroutineContext

@Composable
fun ButtonLogin(
    modifier: Modifier,
    viewModel: LoginScreenViewModel
) {
    val context = LocalContext.current
    val enable by viewModel.enable.observeAsState(false)

    Button(
        onClick = {
            changeActivity(viewModel, context, MainActivity::class.java)
        },
        enabled = enable,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text("Login")
    }
}

fun changeActivity(loginState: LoginScreenViewModel, context: Context, activity: Class<*>) {
    if (loginState.loginState()) {
        context.startActivities(arrayOf(Intent(context, activity)))
        (context as Activity).finish()
    } else {
        Toast.makeText(
            context,
            "Las credenciales no son validas, vuelve a intentarlo",
            Toast.LENGTH_SHORT
        ).show()
    }
}