package com.eezados.whatsappclone.ui.Screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eezados.whatsappclone.components.ContacsComponents.CreateOptions

@Composable
fun ContactsScreen(
    innerPadding: PaddingValues
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {

        CreateOptions("Group")
        CreateOptions("Contact")
        CreateOptions("Community")

        Box(modifier = Modifier.padding(start = 12.dp, top = 6.dp)) {
            Text("Contacts on WhatsApp", fontSize = 13.sp)
        }


    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPrebview() {
    ContactsScreen(innerPadding = PaddingValues())
}