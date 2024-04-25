package com.eezados.whatsappclone.components.Header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eezados.whatsappclone.R

@Composable
fun HeaderContacts(
    searchClick: () -> Unit,
    moreOptionsClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF03bb85))
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            UserOptions(
                click = { /*TODO*/ },
                icon = Icons.AutoMirrored.Filled.ArrowBack,
                description = "Back",
                pad = 0.dp
            )
            Column(modifier = Modifier.padding(start = 8.dp)) {
                Text(
                    stringResource(R.string.header_contacts),
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
                Box(modifier = Modifier.padding(start = 2.dp)) {
                    Text("n contacts")
                }


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
            }
            Row(horizontalArrangement = Arrangement.SpaceAround) {
                UserOptions(
                    searchClick,
                    Icons.Default.Search,
                    description = "Search contacts",
                    10.dp
                )
                UserOptions(
                    moreOptionsClick,
                    Icons.Default.MoreVert,
                    description = "More options",
                    0.dp
                )
            }
        }
    }
}

@Composable
private fun UserOptions(
    click: () -> Unit,
    icon: ImageVector,
    description: String,
    pad: Dp
) {
    Row {
        IconButton(onClick = { click }) {
            Icon(imageVector = icon, contentDescription = description)
            Spacer(modifier = Modifier.padding(pad))
        }
    }
}