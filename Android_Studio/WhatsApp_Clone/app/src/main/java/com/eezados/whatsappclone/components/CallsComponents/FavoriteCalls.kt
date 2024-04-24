package com.eezados.whatsappclone.components.CallsComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.eezados.whatsappclone.R

@Composable
fun FavoriteCalls() {
    ElevatedCard(modifier = Modifier
        .fillMaxWidth()
        .height(75.dp),
        shape = RectangleShape,
        onClick = {}
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            AsyncImage(
                model = R.drawable.hola,
                contentDescription = "Image call",
                modifier = Modifier.clip(CircleShape)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(start = 12.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text("Useless Text", fontSize = 16.sp)
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = "Call Icon"
                )

                Icon(
                    imageVector = Icons.Outlined.Videocam,
                    contentDescription = "VideoCall Icon"
                )
            }
        }
    }
}