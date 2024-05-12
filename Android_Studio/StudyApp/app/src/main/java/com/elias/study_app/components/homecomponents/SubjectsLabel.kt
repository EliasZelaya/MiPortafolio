package com.elias.study_app.components.homecomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.elias.study_app.R
import com.elias.study_app.components.activitycomponents.CardItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SubjectsLabel(
    item: CardItem
) {
    val dateState = rememberDatePickerState()

    Card(
        modifier = Modifier
            .padding(2.dp)
            .height(100.dp)
            .width(100.dp),
        onClick = {
//            navController.navigate()
        },
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = item.color)
        )
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
            Text(item.name, textAlign = TextAlign.Center, fontSize = 12.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun SubjectLabelPreview() {
//    SubjectsLabel(NewActivityViewModel(), LocalContext.current)
}
