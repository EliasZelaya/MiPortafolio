package com.elias.study_app.components.createactivitycomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
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
import androidx.compose.ui.unit.dp
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabelDatePicker(viewModel: NewActivityViewModel) {
    Card(
        onClick = { viewModel.changeDateState() },
        modifier = Modifier.height(60.dp),
        shape = RectangleShape
    ) {
        ShowDatePicker(viewmodel = viewModel)
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            val selectDate by viewModel.selectDate.collectAsState()

            Icon(
                imageVector = Icons.Default.CalendarMonth,
                contentDescription = "Set Date",
            )

            Text(selectDate)
        }
    }
}