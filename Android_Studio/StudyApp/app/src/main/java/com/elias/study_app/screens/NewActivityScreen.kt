package com.elias.study_app.screens

import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.DatePickerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import com.elias.study_app.viewmodel.NewActivityViewModel


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun NewActivityScreen(
    dateState: DatePickerState,
    viewmodel: NewActivityViewModel
) {
    DatePickerDialog(onDismissRequest = {  }, confirmButton = { /*TODO*/ }) {
        DatePicker(state = dateState)
    }
}

@Preview
@Composable
private fun NewActScreen() {
}