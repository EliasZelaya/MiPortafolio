package com.eezados.whatsappclone.components.ChatsComponents

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
        for (n in 1..2) {
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