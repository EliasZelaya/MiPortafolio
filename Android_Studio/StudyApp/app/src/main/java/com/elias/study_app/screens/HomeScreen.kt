package com.elias.study_app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elias.study_app.components.homecomponents.InfoStudyTime

@Composable
fun HomeScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Box( modifier = Modifier.fillMaxWidth().padding(12.dp),
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
                InfoStudyTime()
                InfoStudyTime()
                InfoStudyTime()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}