package com.eezados.whatsappclone.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Screens () {
    Column {
        Header({}, {}, {})
        Chats()
    }
}

@Preview
@Composable
private fun ScreensPreview() {
    Screens()
}