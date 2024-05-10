package com.elias.study_app.screens

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.elias.study_app.components.homecomponents.InfoStudyTime
import com.elias.study_app.components.homecomponents.StudyToday
import com.elias.study_app.components.homecomponents.SubjectsLabel
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    val dateState = rememberDatePickerState()
    val viewmodel: NewActivityViewModel = viewModel()
    val showDialog by viewmodel.showDialog.observeAsState(false)

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("Study Time", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            }

            Divider(modifier = Modifier.padding(bottom = 16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                InfoStudyTime("Subjects")
                InfoStudyTime("Hours")
                InfoStudyTime("Goal")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text("Subject")
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(2.dp)
                    .horizontalScroll(
                        rememberScrollState()
                    )
            ) {
                SubjectsLabel(viewmodel, /*LocalContext.current*/)
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Text("Today")
            }

            Column {
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
                StudyToday()
            }
        }
    }
    if (showDialog) {
        NewActivityScreen(dateState = dateState, viewmodel = viewmodel)
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}