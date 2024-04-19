package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ControlPoint
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.ControlPoint
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun StatusScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .padding(top = 20.dp, end = 18.dp, bottom = 16.dp, start = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Status", fontSize = 20.sp, fontWeight = FontWeight.Medium)

            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More Options")
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            for (n in 1..3) {
                item {
                    UserStatus(n)
                }
            }
        }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp), thickness = 1.dp
        )

        Column(modifier = Modifier.fillMaxWidth().padding(top = 24.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Channels", fontSize = 18.sp, fontWeight = FontWeight.Medium)

                Icon(
                    imageVector = Icons.Outlined.ControlPoint,
                    contentDescription = "More Channels"
                )
            }
        }
    }
}

@Composable
private fun UserStatus(i: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = "https://via.placeholder.com/210",
            contentDescription = "Status",
            modifier = Modifier
                .padding(8.dp)
                .clip(
                    CircleShape
                )
        )

        Text("User $i", fontSize = 12.sp)
    }
}

@Preview(showSystemUi = true)
@Composable
fun StatusPreview() {
    StatusScreen(innerPadding = PaddingValues())
}