package com.eezados.whatsappclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
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
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.eezados.whatsappclone.components.ChatsComponents.CreateChat

@Composable
fun Chats(
    modifier: Modifier,
    innerPadding: PaddingValues,
) {
    LazyColumn(
        modifier = modifier
            .padding(innerPadding)
            .padding(top = 8.dp)
    ) {
        for (n in 1..10) {
            item {
                CreateChat(
                    Modifier
                        .fillMaxSize()
                        .padding(start = 12.dp, end = 8.dp)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewChats() {
    Chats(
        Modifier, PaddingValues())
}