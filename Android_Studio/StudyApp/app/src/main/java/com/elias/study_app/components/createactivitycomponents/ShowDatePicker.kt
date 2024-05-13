package com.elias.study_app.components.activitycomponents

import android.annotation.SuppressLint
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import com.elias.study_app.viewmodel.NewActivityViewModel

@SuppressLint("StateFlowValueCalledInComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowDatePicker(
    viewmodel: NewActivityViewModel
) {
    val dateState = rememberDatePickerState()

    if (viewmodel.checkDate.value) {
        DatePickerDialog(
            onDismissRequest = {
                viewmodel.changeDateState()
            },
            confirmButton = {
                Button(onClick = { viewmodel.changeDateState() }) {
                    Text(text = "Ok")
                }
            }
        ) {
            DatePicker(state = dateState)
        }
    }
}