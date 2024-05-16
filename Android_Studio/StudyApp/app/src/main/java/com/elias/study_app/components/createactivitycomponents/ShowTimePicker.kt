package com.elias.study_app.components.createactivitycomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TimePicker
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ShowTimePicker(
    viewModel: NewActivityViewModel
) {
    val timeState = rememberTimePickerState()
    val checkTime by viewModel.checkTime.collectAsState()
    Dialog(onDismissRequest = {
        if (checkTime) {
            viewModel.changeTimeState()
        } else {
            viewModel.changeTimeStateLimit()
        }
    }) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                TimePicker(state = timeState)
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                contentAlignment = Alignment.CenterEnd
            ) {
                Button(onClick = {
                    if (checkTime) {
                        viewModel.changeTimeState()
                    } else {
                        viewModel.changeTimeStateLimit()
                    }
                }) {
                    Text("Ok")
                }
            }
            val set = "${timeState.hour}:${timeState.minute}"
            viewModel.setTime(set)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    ShowTimePicker(NewActivityViewModel())
}