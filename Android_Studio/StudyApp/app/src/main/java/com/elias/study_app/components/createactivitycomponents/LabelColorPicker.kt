package com.elias.study_app.components.createactivitycomponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elias.study_app.R
import com.elias.study_app.viewmodel.NewActivityViewModel

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LabelColorPicker(
    viewmodel: NewActivityViewModel
) {
    Row(
        modifier = Modifier.height(60.dp),
    ) {
        val select by viewmodel.colorName.collectAsState()
        val expand by viewmodel.expandDropMenu.collectAsState()

        ExposedDropdownMenuBox(
            expanded = expand,
            onExpandedChange = { viewmodel.changeExpand() },
            modifier = Modifier.fillMaxSize()
        ) {
            OutlinedTextField(
                readOnly = true,
                value = select,
                onValueChange = {},
                label = {
                    Text(text = "Color")
                },
                trailingIcon = {
                    ExposedDropdownMenuDefaults.TrailingIcon(expanded = expand)
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedTextColor = Color.White,
                    focusedTextColor = Color.White
                ),
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth()
            )

            ExposedDropdownMenu(
                expanded = expand,
                onDismissRequest = { viewmodel.changeExpand() }) {
                colorList().forEach { option ->
                    DropdownMenuItem(
                        text = { Text(text = option.colorName) },
                        onClick = {
                            viewmodel.changeExpand()
                            viewmodel.setColor(option.color, option.colorName)
                        }
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.coloricon),
                contentDescription = "Set Color"
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    LabelColorPicker(NewActivityViewModel())
}