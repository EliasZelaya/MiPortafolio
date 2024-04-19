package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.ControlPoint
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.ControlPoint
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
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
            .verticalScroll(rememberScrollState())
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
            for (n in 1..5) {
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

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 24.dp)
        ) {
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

        Column {
            for (n in 1..5) {
                Spacer(modifier = Modifier.padding(4.dp))
                CreateChannel(
                    Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, top = 14.dp, end = 16.dp)
                )
            }
        }

        Spacer(modifier = Modifier.padding(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Search Channels")

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("See all")
                Icon(imageVector = Icons.Default.ChevronRight, contentDescription = "See all")
            }
        }

        Column(modifier = Modifier.padding(top = 6.dp)) {
            Row(modifier = Modifier.fillMaxWidth()) {
                Recommendations()
            }

        }
    }
}

@Composable
private fun CreateChannel(
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
                    Text("Useless Channel", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
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

@Composable
private fun Recommendations() {
    ElevatedCard(
        modifier = Modifier
            .width(200.dp)
            .height(200.dp)
    ) {
        Column {
            AsyncImage(
                model = "https://via.placeholder.com/150",
                contentDescription = "Channel Icon",
            )

            Text(
                "Useless Channel",
                style = TextStyle(
                    textAlign = TextAlign.Center
                )
            )
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