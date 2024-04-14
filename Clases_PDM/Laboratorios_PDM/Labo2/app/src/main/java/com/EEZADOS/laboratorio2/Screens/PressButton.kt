package com.EEZADOS.laboratorio2.Screens

import android.app.AlertDialog
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import com.EEZADOS.laboratorio2.R


@Composable
fun PressButton() {
    val pressed: MutableState<Int> = remember {
        mutableIntStateOf(0)
    }

    val pressedList: MutableList<String> = remember {
        mutableListOf<String>()
    }
    //Boton de pulsaciones y contador
    Spacer(modifier = Modifier.height(20.dp))
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Se ha pulsado el boton ${pressed.value} veces",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )

        Button(
            onClick = {
                pressed.value++
                pressedList.add("Se ha pulsado ${pressed.value} veces")
            },
        ) {
            Text("Aumentar Contador")
        }
        Spacer(modifier = Modifier.height(40.dp))
        //Texro de pulsaciones
        Text(
            text = "Pulsaciones",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
        Column(
            modifier = Modifier
                .border(
                    BorderStroke(2.dp, Color.White),
                    shape = RectangleShape
                )
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Lista de conteo de pulsaciones
            LazyColumn(
                modifier = Modifier
                    .height(140.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                itemsIndexed(pressedList) { index, item ->
                    Text(item)
                }
            }
        }

        //Agregar nombre
        Spacer(modifier = Modifier.height(30.dp))
        Text("Añadir nombres",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold)

        val user: MutableState<String> = remember {
            mutableStateOf("")
        }

        val userList: MutableList<String> = remember {
            mutableListOf()
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            OutlinedTextField(
                user.value,
                { user.value = it },
                shape = RoundedCornerShape(16.dp),
                maxLines = 1,
                minLines = 1,
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent
                ),
                placeholder = { Text("Nombre") },
                isError = false,
                keyboardActions = KeyboardActions(
                    onNext = {},
                    onDone = {},
                    onGo = {},
                    onPrevious = {},
                    onSearch = {},
                    onSend = {}
                ),
                readOnly = false,
                /*supportingText = { Text("Por favor, ingrese su nombre completo.") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Icono de persona"
                    )
                }*/
            )

            val usersList: MutableList<String> = remember {
                mutableListOf()
            }
            //Boton para agregar el nombre
            Button(
                onClick = {
                    usersList.add("Posicion ${usersList.size+1}: ${user.value} - ")
                    user.value = ""
                }) {
                Text("Añadir nombre")
            }

            Spacer(modifier = Modifier.height(20.dp))

            //Texto y lista de nombres horizontal

            Text("Nombres",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold)

            LazyRow(
                modifier = Modifier
                    .height(120.dp)
                    .fillMaxWidth()
                    .border(BorderStroke(2.dp, Color.White), shape = RectangleShape)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                itemsIndexed(usersList) {index, item ->
                    Text(item)
                }
            }

            Spacer(modifier = Modifier.height(26.dp))

            //Boton para inhabilitar los demas botones
            val showAlert = remember {
                mutableStateOf(false)
            }

            Button(onClick = { showAlert.value = true }) {
                Text("Inhabilitar botones")
            }

            if (showAlert.value) {
                AlertDialog(
                    onDismissRequest = {showAlert.value = false},
                    properties = DialogProperties(
                        dismissOnBackPress = true,
                        dismissOnClickOutside = false
                    ),
                    confirmButton = {
                        Button(
                            onClick = { showAlert.value = false }
                        ) {
                            Text("Ok")
                        }
                    },
                    title = {
                        Text("Confirmacion")
                    },
                    text = {
                         Text("¿Desea inhabilitar los botones?")
                    } ,
                    dismissButton = {
                         Button(
                             onClick = { showAlert.value = false}
                         ) {
                             Text("Cancelar")
                         }
                    },
                    icon = {
                        Icon(imageVector = Icons.Default.Warning, contentDescription = "Alerta")
                    }
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PressButtonView() {
    PressButton()
}