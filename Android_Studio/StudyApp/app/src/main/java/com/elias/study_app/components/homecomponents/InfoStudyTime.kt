package com.elias.study_app.components.homecomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InfoStudyTime(
    text: String
) {
    OutlinedCard(
        modifier = Modifier
            .height(75.dp)
            .width(110.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
//                .background(Color.Gray)
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text, modifier = Modifier.padding(6.dp))
            Text("10")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InfoStudyPreview() {
    InfoStudyTime("Subject")
}