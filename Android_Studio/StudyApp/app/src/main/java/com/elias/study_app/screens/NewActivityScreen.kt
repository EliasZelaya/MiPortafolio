@file:Suppress("UNUSED_EXPRESSION")

package com.elias.study_app.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elias.study_app.components.createactivitycomponents.LabelColorPicker
import com.elias.study_app.components.createactivitycomponents.LabelDatePicker
import com.elias.study_app.components.createactivitycomponents.LabelTimePicker
import com.elias.study_app.components.createactivitycomponents.LabelTimePickerLimit
import com.elias.study_app.components.createactivitycomponents.TextFieldDescription
import com.elias.study_app.ui.theme.StudyAppTheme
import com.elias.study_app.util.showMessage
import com.elias.study_app.viewmodel.NewActivityViewModel


@Composable
fun NewActivityScreen(
    viewModel: NewActivityViewModel,
    onClickBack: () -> Unit
) {
    StudyAppTheme {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Scaffold(
                topBar = {
                    TopBar(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(75.dp),
                        viewModel,
                        onClickBack
                    )
                }
            )
            { it ->
                Content(innerpadding = it, viewModel, onClickBack)
            }
        }
    }
}

@SuppressLint("StateFlowValueCalledInComposition")
@Composable
fun TopBar(
    modifier: Modifier,
    viewmodel: NewActivityViewModel,
    onClick: () -> Unit
) {
    val title by viewmodel.title.collectAsState()
    Row(
        modifier = modifier,
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd) {
                TextField(
                    value = title,
                    onValueChange = { viewmodel.setTitle(it) },
                    modifier = Modifier.width(325.dp),
                    maxLines = 1,
                    singleLine = true
                )
            }

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopStart) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "",
                    modifier = Modifier.clickable { onClick() }
                )
            }
        }
    }
}

@Composable
fun Content(
    innerpadding: PaddingValues,
    viewmodel: NewActivityViewModel,
    onClick: () -> Unit
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(innerpadding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        TextFieldDescription(viewmodel)
        LabelColorPicker(viewmodel)
        LabelDatePicker(viewmodel)
        LabelTimePicker(viewmodel)
        LabelTimePickerLimit(viewmodel)

        Button(
            onClick = {
                when {
                    viewmodel.title.value.isEmpty() -> {
                        showMessage(context, 2)
                    }

                    viewmodel.selectColor.value == 0 -> {
                        showMessage(context, 3)
                    }

                    else -> {
                        viewmodel.createCard()
                        onClick()
                    }
                }
            },
            modifier = Modifier
                .padding(12.dp)
                .width(200.dp)
        ) {
            Text("Save")
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun MyPreview() {
    NewActivityScreen(NewActivityViewModel(), {})
}