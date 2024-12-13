package com.elias.study_app.components.createactivitycomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.elias.study_app.viewmodel.NewActivityViewModel

@Composable
fun TextFieldDescription(
    viewmodel: NewActivityViewModel
) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        val description by viewmodel.description.collectAsState()

        TextField(
            value = description,
            onValueChange = { viewmodel.setDescription(it) },
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Description") }
        )
    }
}