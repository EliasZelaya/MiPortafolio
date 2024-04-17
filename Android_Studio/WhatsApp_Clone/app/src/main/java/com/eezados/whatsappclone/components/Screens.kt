package com.eezados.whatsappclone.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.AlertDialogDefaults.titleContentColor
import androidx.compose.material3.BottomAppBarDefaults.containerColor
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eezados.whatsappclone.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Screens() {
    Scaffold (
        topBar = {
            Header({}, {}) {
            }
        },
        content = {
                  Chats(Modifier
                      .verticalScroll(rememberScrollState())
                      .padding(bottom = 8.dp)
                  )
        },
        bottomBar = {
            NavigationMenu(
                Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
        }
    )
    /*Column(
        modifier = Modifier.fillMaxSize()

    ) {
        Header({}, {}, {})
        Chats(Modifier
            .verticalScroll(rememberScrollState())
            .padding(bottom = 8.dp)
            .weight(1f))
        NavigationMenu(Modifier.fillMaxWidth().padding(16.dp))
    }*/
}

@Preview(showSystemUi = true)
@Composable
private fun ScreensPreview() {
    Screens()
}