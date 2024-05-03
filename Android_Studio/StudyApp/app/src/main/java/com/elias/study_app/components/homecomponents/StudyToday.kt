package com.elias.study_app.components.homecomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StudyToday() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(2.dp),
        shape = RectangleShape
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text("Calculo 3: ", fontWeight = FontWeight.Bold)
            Text("1:30 - 3:30 ", fontWeight = FontWeight.Bold)
            Text("Make the guides", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun StudyTodayPrebview() {
    StudyToday()
}