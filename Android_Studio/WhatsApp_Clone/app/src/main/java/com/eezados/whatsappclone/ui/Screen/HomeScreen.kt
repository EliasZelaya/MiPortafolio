package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.eezados.whatsappclone.components.HomeComponents.Chats

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Chats(modifier = Modifier, innerPadding = innerPadding)
}