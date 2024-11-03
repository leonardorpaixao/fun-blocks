package me.lincolnstuart.funblocks.playground.screens.components.misc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import compose.icons.TablerIcons
import compose.icons.tablericons.ArrowLeft
import me.lincolnstuart.funblocks.components.core.appbar.utils.AppBarAction
import me.lincolnstuart.funblocks.components.core.appbar.utils.AppBarOptions
import me.lincolnstuart.funblocks.components.core.screenplan.ScreenPlan
import me.lincolnstuart.funblocks.components.core.text.Text
import me.lincolnstuart.funblocks.components.core.text.utils.TextMode
import me.lincolnstuart.funblocks.playground.components.ComponentCentralizer


class ListItemScreen : Screen {

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow

        ScreenPlan(appBarOptions = AppBarOptions(mainContent = {
            Text(
                text = "ListItem",
                mode = TextMode.Subtitle()
            )
        },
            mainAction = AppBarAction(icon = TablerIcons.ArrowLeft, description = null) {
                navigator.pop()
            }), content = {
            ComponentCentralizer {
                ListItem(content = { Text("Teste") })
            }
        })
    }
}

@Composable
fun ListItem(
    heading: @Composable () -> Unit = {},
    content: @Composable () -> Unit,
    trailing: @Composable () -> Unit = {}
) {
    Row {
        Column(modifier = Modifier.weight(1f).background(Color.Red)) { heading() }
        Column(modifier = Modifier.weight(8f).background(Color.Yellow)) { content() }
        Column(modifier = Modifier.weight(1f).background(Color.Green)) { trailing() }
    }
}