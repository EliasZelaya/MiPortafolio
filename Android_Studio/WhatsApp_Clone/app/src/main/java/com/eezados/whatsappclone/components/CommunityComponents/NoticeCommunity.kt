package com.eezados.whatsappclone.components.CommunityComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AllInbox
import androidx.compose.material.icons.filled.BluetoothAudio
import androidx.compose.material.icons.filled.Coronavirus
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Speaker
import androidx.compose.material.icons.filled.SpeakerNotesOff
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NoticeCommunity() {
    Row {
        ElevatedCard {
            Row {
                Icon(
                    imageVector = Icons.Default.SpeakerNotesOff,
                    contentDescription = "Icon Notice",
                    modifier = Modifier
                        .size(60.dp)
                        .background(
                            Color.DarkGray
                        )
                )
            }
        }

        Column {
            Text("Notice")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun Preview() {
    NoticeCommunity()
}