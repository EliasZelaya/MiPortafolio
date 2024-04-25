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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ControlPoint
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eezados.whatsappclone.components.ChatsComponents.CreateChat
import com.eezados.whatsappclone.components.StatusComponents.Recommendations
import com.eezados.whatsappclone.components.StatusComponents.UserStatus

@Composable
fun StatusScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .padding(top = 20.dp, end = 4.dp, bottom = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(start = 12.dp)
            )

            Icon(imageVector = Icons.Default.MoreVert, contentDescription = "More Options")
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
//            for (n in 1..5) {
            item {
                UserStatus(1)
            }
//            }
        }

        HorizontalDivider(
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
                Text(
                    "Channels",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(start = 12.dp)
                )

                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "More Channels"
                )
            }
        }
        Spacer(modifier = Modifier.padding(6.dp))

        Column {
//            for (n in 1..5) {
            CreateChat(
                Modifier
                    .fillMaxSize()
                    .padding(start = 12.dp, end = 8.dp)
            )
//            }
        }


        Spacer(modifier = Modifier.padding(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Search Channels", modifier = Modifier.padding(start = 12.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("See all", modifier = Modifier.padding(end = 4.dp))
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = "See all",
                    modifier = Modifier.padding(end = 12.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyRow(modifier = Modifier.padding(start = 4.dp)) {
            item {
                for (n in 1..2)
                    Recommendations()
            }
        }
        Box(modifier = Modifier.padding(100.dp))
        Text("")
    }
}

@Preview(showSystemUi = true)
@Composable
fun StatusPreview() {
    StatusScreen(innerPadding = PaddingValues())
}