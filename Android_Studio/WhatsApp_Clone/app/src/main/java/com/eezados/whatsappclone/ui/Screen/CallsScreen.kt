package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eezados.whatsappclone.components.CallsComponents.CreateCalls
import com.eezados.whatsappclone.components.CallsComponents.FavoriteCalls

@Composable
fun CallsScreen(
    innerPadding: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text("Favorites")
            Text("Edite")
        }
        //for (n in 1..3) {
            FavoriteCalls()
        //}

        Row(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth()
        ) {
            Text("Resents")
        }

        for (n in 1 .. 2) {
            CreateCalls()
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CallsPreview() {
    CallsScreen(PaddingValues())
}