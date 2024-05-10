package com.elias.study_app.components.logincomponents

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.elias.study_app.MainActivity
import com.elias.study_app.R
import com.elias.study_app.viewmodel.LoginScreenViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.coroutineContext

@Composable
fun ButtonLogin(
    modifier: Modifier,
    viewModel: LoginScreenViewModel
) {
    val context = LocalContext.current
    val enable by viewModel.enable.observeAsState(false)
    val finished by viewModel.changeActivity.observeAsState(null)
    Button(
        onClick = {
            viewModel.loginState()
        },
        enabled = enable,
        modifier = modifier,
        shape = RectangleShape
    ) {
        Text(stringResource(R.string.login))
    }
    if (finished == true) {
        context.startActivities(arrayOf(Intent(context, MainActivity::class.java)))
        (context as Activity).finish()
    } else if(finished == false) {
        Toast.makeText(
            context,
            "Las credenciales no son validas, vuelve a intentarlo",
            Toast.LENGTH_SHORT
        ).show()
    }
}