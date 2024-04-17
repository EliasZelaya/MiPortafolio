package com.eezados.whatsappclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.People
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NavigationMenu() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.Top) {
        Icon(Icons.Default.Message, contentDescription = "See chats")
        Icon(Icons.Default.HistoryToggleOff, contentDescription = "See chats")
        Icon(Icons.Default.People, contentDescription = "See chats")
        Icon(Icons.Default.Call, contentDescription = "See chats")
    }
}

@Preview(showSystemUi = true)
@Composable
fun NavigationMenuPreview() {
    NavigationMenu()
}