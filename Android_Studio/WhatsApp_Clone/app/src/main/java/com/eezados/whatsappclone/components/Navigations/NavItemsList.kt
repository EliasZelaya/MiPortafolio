package com.eezados.whatsappclone.components.Navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.automirrored.outlined.Message
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.HistoryToggleOff
import androidx.compose.material.icons.outlined.People
import androidx.compose.runtime.Composable
import com.eezados.whatsappclone.components.Home.ScreenRoute

@Composable
fun NavItemsList(): List<NavItems> {
    return listOf(
        NavItems(
            "Chats",
                ScreenRoute.Chats.route,
            Icons.AutoMirrored.Filled.Message,
            Icons.AutoMirrored.Outlined.Message
        ),
        NavItems(
            "Status",
            ScreenRoute.Status.route,
            Icons.Filled.HistoryToggleOff,
            Icons.Outlined.HistoryToggleOff
        ),
        NavItems(
            "Community",
            ScreenRoute.Community.route,
            Icons.Filled.People,
            Icons.Outlined.People
        ),
        NavItems(
            "Calls",
            ScreenRoute.Calls.route,
            Icons.Filled.Call,
            Icons.Outlined.Call
        )
    )
}
