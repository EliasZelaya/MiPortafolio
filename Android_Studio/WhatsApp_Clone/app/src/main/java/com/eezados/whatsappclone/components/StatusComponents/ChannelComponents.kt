package com.eezados.whatsappclone.components.StatusComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.eezados.whatsappclone.R

@Composable
fun CreateChannels(
    modifier: Modifier
) {
    Row(
        modifier = modifier
    ) {
        Row {
            Image(
                painter = painterResource(R.drawable.hola),
                contentDescription = "Channel Image",
                modifier = Modifier.clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 12.dp, top = 4.dp)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 6.dp),
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Useless Channel", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)
                    Text("16:40", fontSize = 12.sp)
                }
                Row(
                    modifier = Modifier.padding(start = 2.dp, top = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "View",
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.padding(start = 6.dp))
                    Text(
                        "More useless useless useless  useless and useless text",
                        fontSize = 16.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
fun Recommendations() {
    ElevatedCard(
        modifier = Modifier
            .width(175.dp)
            .height(200.dp)
            .padding(8.dp),
        onClick = {}
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box {
                Image(
                    painter = painterResource(R.drawable.recommendations),
                    contentDescription = "Channel Icon",
                    modifier = Modifier.clip(CircleShape)
                )
            }

            Box(modifier = Modifier.padding(6.dp)){
                Text("Useless Channel", fontSize = 14.sp, fontWeight = FontWeight.W900)
            }

            Button(onClick = { /*TODO*/ }) {
                Text("Follow")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun View() {
    Recommendations()
}
