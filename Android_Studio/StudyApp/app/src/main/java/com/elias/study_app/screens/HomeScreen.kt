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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elias.study_app.components.homecomponents.InfoStudyTime
import com.elias.study_app.components.homecomponents.StudyToday
import com.elias.study_app.components.homecomponents.SubjectsLabel
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewmodel: NewActivityViewModel,
    onCardClick: () -> Unit
) {
    val listCard = viewmodel.itemList.collectAsState()

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

            LazyRow(
                modifier = Modifier.fillMaxWidth()
            ) {
                item { 
                    if(listCard.value.isEmpty()) {
                        AddActivity(onCardClick)
                    }
                    else {
                        listCard.value.forEach {
                            SubjectsLabel(item = it)
                        }
                        AddActivity(onCardClick)
                    }
                }
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
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(NewActivityViewModel(), {})
}