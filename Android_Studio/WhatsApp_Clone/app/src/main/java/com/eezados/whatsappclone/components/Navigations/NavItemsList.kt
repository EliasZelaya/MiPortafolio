package com.eezados.whatsappclone.components.Navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.HistoryToggleOff
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.HistoryToggleOff
import androidx.compose.material.icons.outlined.Message
import androidx.compose.material.icons.outlined.People
import androidx.compose.runtime.Composable
import com.eezados.whatsappclone.components.ScreenRoute

@Composable
fun NavItemsList(): List<NavItems> {
    return listOf(
        NavItems(
            "Chats",
                ScreenRoute.Chats.route,
            Icons.Outlined.Message,
            Icons.Filled.Message
        ),
        NavItems(
            "Status",
            ScreenRoute.Status.route,
            Icons.Outlined.HistoryToggleOff,
            Icons.Filled.HistoryToggleOff
        ),
        NavItems(
            "Community",
            ScreenRoute.Community.route,
            Icons.Outlined.People,
            Icons.Filled.People
        ),
        NavItems(
            "Calls",
            ScreenRoute.Calls.route,
            Icons.Outlined.Call,
            Icons.Filled.Call
        )
    )
}
