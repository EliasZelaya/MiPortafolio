package com.elias.study_app.util

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable

fun showMessage(context: Context, code: Int) {
    Toast.makeText(context, errorList(code), Toast.LENGTH_SHORT).show()
}