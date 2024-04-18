package com.eezados.whatsappclone.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.People
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NavigationMenu(
    modifier: Modifier
) {
    NavigationBar {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            SetIcons(Icons.Default.Message, "Chats", "Messages")
            SetIcons(Icons.Default.HistoryToggleOff, "Status", "Status")
            SetIcons(Icons.Default.People, "Community", "Community")
            SetIcons(Icons.Default.Call, "Calls", "Calls")
        }
    }
}

@Composable
private fun SetIcons(
    icon: ImageVector,
    description: String,
    text: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            icon,
            contentDescription = description,
            modifier = Modifier.size(25.dp)
        )
        Text(text)
    }
}

@Preview(showSystemUi = true)
@Composable
fun NavigationMenuPreview() {
    NavigationMenu(
        Modifier
            .fillMaxWidth()
            .padding(16.dp)
    )
}