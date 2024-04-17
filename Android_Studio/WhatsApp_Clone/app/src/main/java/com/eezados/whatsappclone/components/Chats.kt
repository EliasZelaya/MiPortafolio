package com.eezados.whatsappclone.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Chats() {
    UserChats()
}

@Composable
private fun UserChats() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 12.dp, top = 14.dp)) {
        Row {
            AsyncImage(
                model = "https://via.placeholder.com/160",
                contentDescription = "User Image",
                modifier = Modifier.clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 10.dp, end = 16.dp)) {
                Text("Useless Text", fontSize = 16.sp, fontWeight = FontWeight.SemiBold )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChats() {
    Chats()
}