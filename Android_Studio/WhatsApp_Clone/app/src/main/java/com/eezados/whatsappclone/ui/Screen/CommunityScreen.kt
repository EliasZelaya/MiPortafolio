package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eezados.whatsappclone.components.CommunityComponents.CreateCommunity
import com.eezados.whatsappclone.components.CommunityComponents.MakeCommunity

@Composable
fun CommunityScreen(innerPadding: PaddingValues) {
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        item {

            CreateCommunity()

//            for (n in 1 .. 5) {
            Spacer(modifier = Modifier.padding(bottom = 10.dp))
            MakeCommunity()
//            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ComScreenPreview() {
    CommunityScreen(PaddingValues())
}