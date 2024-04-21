package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.Arrangement
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

@Composable
fun CommunityScreen(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        item {


            CreateCommunity()


            Spacer(modifier = Modifier.padding(bottom = 10.dp))

            for (n in 1..3) {
                Community(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, top = 14.dp, end = 16.dp)
                )
            }
        }
    }
}

@Composable
fun CreateCommunity() {
    ElevatedCard(modifier = Modifier
        .fillMaxSize()
        .height(75.dp),
        onClick = { /*TODO*/ }
    ) {
        Row(
            modifier = Modifier.fillMaxSize().padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            AsyncImage(
                model = "https://via.placeholder.com/160",
                contentDescription = "Channel Image",
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
            )

            Text("New Community")
        }
    }
}

@Composable
private fun Community(
    modifier: Modifier
) {
    Row(
        modifier = modifier
    ) {
        Row {
            AsyncImage(
                model = "https://via.placeholder.com/160",
                contentDescription = "User Image",
                modifier = Modifier.clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 12.dp, top = 4.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 6.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Useless Text", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                    Text("16:40", fontSize = 12.sp)
                }
                Row(
                    modifier = Modifier.padding(start = 2.dp, top = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "View",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 6.dp))
                    Text(
                        "More useless useless useless  useless and useless text",
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ComScreenPreview() {
    CommunityScreen(PaddingValues())
}