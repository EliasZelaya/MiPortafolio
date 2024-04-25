@file:Suppress("UNUSED_EXPRESSION")

package com.eezados.whatsappclone.components

import android.service.autofill.OnClickAction
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ColorScheme
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eezados.whatsappclone.R


@Composable
fun Header(
    statusClick: () -> Unit,
    searchClick: () -> Unit,
    moreOptionsClick: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF03bb85))
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.padding(start = 8.dp)) {
            Text(
                stringResource(R.string.top_bar_text),
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp
            )
        }

        Box() {
            Row(horizontalArrangement = Arrangement.SpaceAround) {
                UserOptions(
                    statusClick,
                    Icons.Default.CameraAlt,
                    description = stringResource(R.string.camera),
                    12.dp
                )
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
fun UserOptions(
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

@Preview(showSystemUi = true)
@Composable
private fun HeaderPreview() {
    Header({}, {}, {})
}