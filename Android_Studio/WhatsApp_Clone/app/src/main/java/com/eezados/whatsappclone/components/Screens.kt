@file:Suppress("NAME_SHADOWING")

package com.eezados.whatsappclone.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddComment
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screens() {
    val navController = rememberNavController()

    Scaffold (
        topBar = {
            Header({}, {}) {

            }
        },
        bottomBar = {
            NavigationMenu(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
            ) {
                Icon(
                    imageVector = Icons.Filled.AddComment,
                    contentDescription = "a",
                )
            }
        }
    ) { innerPadding ->
        Chats(
            modifier = Modifier,
            navController = navController,
            innerPadding = innerPadding
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ScreensPreview() {
    Screens()
}