package com.elias.study_app.components.createactivitycomponents

import android.annotation.SuppressLint
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.elias.study_app.viewmodel.NewActivityViewModel
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

@SuppressLint("StateFlowValueCalledInComposition")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowDatePicker(
    viewmodel: NewActivityViewModel
) {
    val check by viewmodel.checkDate.collectAsState()
    val dateState = rememberDatePickerState()

    if (check) {
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
        val date = dateState.selectedDateMillis
        date?.let {
            val localeDate = Instant.ofEpochMilli(it).atZone(ZoneId.of("UTC")).toLocalDate()

            viewmodel.setDate("${localeDate.dayOfMonth} / ${localeDate.monthValue} / ${localeDate.year}")
        }
    }
}