package com.eezados.whatsappclone.components.ContacsComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.People
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CreateOptions(
    option: String
) {
    ElevatedCard(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp),
        shape = RectangleShape
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Image(
                imageVector = Icons.Default.People,
                contentDescription = "Icon Create Group",
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.DarkGray)
                    .size(42.dp)
                    .padding(8.dp)
            )

            Text("Create $option")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    CreateOptions("Option")
}