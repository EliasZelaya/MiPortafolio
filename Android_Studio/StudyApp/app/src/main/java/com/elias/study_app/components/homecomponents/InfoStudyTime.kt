package com.elias.study_app.components.homecomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InfoStudyTime() {
    OutlinedCard(modifier = Modifier
        .height(100.dp)
        .width(100.dp),
    ) {
        Column {
            Text("Subjects")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun InfoStudyPreview() {
    InfoStudyTime()
}