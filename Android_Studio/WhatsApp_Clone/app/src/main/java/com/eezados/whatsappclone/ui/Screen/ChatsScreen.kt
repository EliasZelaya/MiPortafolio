package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.eezados.whatsappclone.components.Chats

@Composable
fun ChatsScreen(innerPadding: PaddingValues) {
    Chats(modifier = Modifier, innerPadding = innerPadding)
}