package com.esosaphilip.hulaba2.componentsforUi

import androidx.compose.foundation.layout.Box
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HulabaTopAppBar(){
    Box {
        CenterAlignedTopAppBar(
            title = {
                CenterTopAppBarText()
            },
            navigationIcon = {
                TopAppBArMenuIcon()
            },
           actions = {
                TopAppBArNotiIcon()
            }
        )
    }

}
@Composable
fun TopAppBArNotiIcon(){
    IconButton(onClick = { /* doSomething() */ }) {
        Icon(
            imageVector = Icons.Filled.Notifications,
            contentDescription = "Localized description"
        )
    }
}
@Composable
fun TopAppBArMenuIcon(){
    IconButton(
        onClick = { /* doSomething() */ }
        ) {
        Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Localized description"
        )
    }
}
@Composable
fun CenterTopAppBarText(){
    Text(
        "Homepage",
        maxLines = 1,
        overflow = TextOverflow.Ellipsis
    )
}