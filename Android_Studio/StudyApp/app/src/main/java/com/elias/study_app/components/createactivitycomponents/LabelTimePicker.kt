package com.elias.study_app.components.createactivitycomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabelTimePicker(
    viewModel: NewActivityViewModel
) {
    Card(
        onClick = { viewModel.changeTimeState() },
        modifier = Modifier.height(60.dp),
        shape = RectangleShape
    ) {
        val selectTime by viewModel.selectTime.collectAsState()
        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable { viewModel.changeTimeState() },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Spacer(modifier = Modifier.padding(start = 2.dp))
            Icon(
                imageVector = Icons.Default.AccessTime,
                contentDescription = "Set Time",
            )
            /*OutlinedTextField(
                readOnly = true,
                value = selectTime,
                onValueChange = {},
                label = {
                    Text("Time start")
                },
                modifier = Modifier
                    .fillMaxSize()
                    .padding(2.dp)
                    .clickable { viewModel.changeTimeState() }
            )*/
            Text(selectTime)
        }


        val check by viewModel.checkTime.collectAsState()
        if(check) {
            ShowTimePicker(viewModel)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    LabelTimePicker(NewActivityViewModel())
}