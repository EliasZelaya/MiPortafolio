package com.eezados.whatsappclone.components.CommunityComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.eezados.whatsappclone.R

@Composable
fun UserCommunity() {
    ElevatedCard(modifier = Modifier
        .fillMaxSize()
        .height(75.dp),
        shape = RectangleShape,
        onClick = { /*TODO*/ }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(contentAlignment = Alignment.BottomEnd) {
                Box(modifier = Modifier.padding(2.dp)) {
                    Image(
                        painter = painterResource(R.drawable.newcommunity),
                        contentDescription = "Channel Image",
                        modifier = Modifier.clip(RoundedCornerShape(16.dp))
                    )
                }
            }
            Text("New Community")
        }
    }
}