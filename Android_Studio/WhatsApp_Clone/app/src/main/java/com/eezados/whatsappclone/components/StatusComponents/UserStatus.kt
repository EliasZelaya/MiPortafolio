package com.eezados.whatsappclone.components.StatusComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun UserStatus(i: Int) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(start = 12.dp)
    ) {
            AsyncImage(
                model = "https://via.placeholder.com/210",
                contentDescription = "Status",
                modifier = Modifier
                    .padding(6.dp)
                    .clip(
                        CircleShape
                    )
            )
        Text("User $i", fontSize = 12.sp)
    }
}