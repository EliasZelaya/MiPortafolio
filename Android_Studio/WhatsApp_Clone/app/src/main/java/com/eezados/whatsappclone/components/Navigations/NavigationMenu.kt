package com.eezados.whatsappclone.components.Navigations

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun NavigationMenu(
    modifier: Modifier,
    items: List<NavItems>,
    currentRoute: String?,
    onClick: (NavItems) -> Unit
) {
    NavigationBar() {
        items.forEachIndexed { index, navItems ->
            NavigationBarItem(
                selected = currentRoute == navItems.route,
                onClick = { onClick(navItems) },
                icon = {
                    Icon(
                        imageVector =
                        if (currentRoute == navItems.route)
                            navItems.selectedIcon
                        else
                            navItems.unselectedIcon,
                        contentDescription = navItems.title
                    )
                },
                label = {
                    Text(text = navItems.title)
                }
            )
        }
    }
    /*NavigationBar {
        item.forEachIndexed { _, navBottomMenuItem ->
            NavigationBarItem(
                selected = currentRoute == navBottomMenuItem.text,
                onClick = { onClick(navBottomMenuItem) },
                icon = {
                    Row(horizontalArrangement = Arrangement.Center) {
                        Row(modifier = modifier,
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            SetIcons(Icons.Default.Message, "Chats", "Messages")
                            SetIcons(Icons.Default.HistoryToggleOff, "Status", "Status")
                            SetIcons(Icons.Default.People, "Community", "Community")
                            SetIcons(Icons.Default.Call, "Calls", "Calls")
                        }
                    }
                },
                label ={
                    Text("")
                }
            )
        }*/

//    Row(
//        modifier = modifier,
//        horizontalArrangement = Arrangement.SpaceBetween,
//    ) {
//        SetIcons(Icons.Default.Message, "Chats", "Messages")
//        SetIcons(Icons.Default.HistoryToggleOff, "Status", "Status")
//        SetIcons(Icons.Default.People, "Community", "Community")
//        SetIcons(Icons.Default.Call, "Calls", "Calls")
//    }

}

@Composable
private fun SetIcons(
    icon: ImageVector,
    description: String,
    text: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            icon,
            contentDescription = description,
            modifier = Modifier.size(25.dp)
        )
        Text(text)
    }
}

/*
@Preview(showSystemUi = true)
@Composable
fun NavigationMenuPreview() {
    NavigationMenu(
        Modifier
            .fillMaxWidth()
            .padding(16.dp),
        emptyList()
    )
}*/
