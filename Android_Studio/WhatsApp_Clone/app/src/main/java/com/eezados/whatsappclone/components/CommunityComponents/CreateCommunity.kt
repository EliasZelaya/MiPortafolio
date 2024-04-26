package com.eezados.whatsappclone.components.CommunityComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eezados.whatsappclone.components.ChatsComponents.CreateChat

@Composable
fun MakeCommunity() {
    Column {
        UserCommunity()
        NoticeCommunity()

        for (n in 1..2) {
            CreateChat(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, top = 14.dp, end = 16.dp)
            )
        }
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            shape = RectangleShape,
            onClick = {}
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 24.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "See all")
                Text("See all")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MyPreview() {
    MakeCommunity()
}