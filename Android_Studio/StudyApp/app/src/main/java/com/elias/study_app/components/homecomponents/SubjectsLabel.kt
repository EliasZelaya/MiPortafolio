package com.elias.study_app.components.homecomponents

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.elias.study_app.MainActivity
import com.elias.study_app.R
import com.elias.study_app.screens.LoginScreen
import com.elias.study_app.viewmodel.NewActivityViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectsLabel(
    viewmodel: NewActivityViewModel,
//    navController: NavHostController
) {
    val dateState = rememberDatePickerState()
    val check by viewmodel.showDialog.observeAsState(false)

    Card(
        modifier = Modifier
            .padding(2.dp)
            .height(100.dp)
            .width(100.dp),
        onClick = {
//            navController.navigate()
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.subject_icon),
                contentDescription = "Subject Icon",
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Text("Calculo 3", textAlign = TextAlign.Center, fontSize = 12.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SubjectLabelPreview() {
//    SubjectsLabel(NewActivityViewModel(), LocalContext.current)
}
