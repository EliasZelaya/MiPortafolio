package com.eezados.whatsappclone.components.Navigations

import androidx.compose.material.icons.Icons
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItems(
    //Lista que almacena los datos que va a contener los botones de navegacion
    val title: String,
    val route: String,
    val textBar: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector
)