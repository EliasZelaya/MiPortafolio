package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.eezados.whatsappclone.components.ChatsComponents.Chats

@Composable
fun ChatsScreen(innerPadding: PaddingValues) {
    Chats(modifier = Modifier, innerPadding = innerPadding)
}