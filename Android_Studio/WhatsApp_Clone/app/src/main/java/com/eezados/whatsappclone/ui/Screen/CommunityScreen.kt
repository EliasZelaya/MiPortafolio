package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.size.Size
import com.eezados.whatsappclone.R
import com.eezados.whatsappclone.components.ChatsComponents.CreateChat
import com.eezados.whatsappclone.components.CommunityComponents.CreateCommunity

@Composable
fun CommunityScreen(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        item {

            CreateCommunity()

            Spacer(modifier = Modifier.padding(bottom = 10.dp))

            for (n in 1..3) {
                CreateChat(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, top = 14.dp, end = 16.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ComScreenPreview() {
    CommunityScreen(PaddingValues())
}