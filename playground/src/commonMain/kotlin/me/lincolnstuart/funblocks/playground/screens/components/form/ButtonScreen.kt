package me.lincolnstuart.funblocks.playground.screens.components.form

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import me.lincolnstuart.funblocks.essentials.core.list.SimpleListItem
import me.lincolnstuart.funblocks.essentials.core.surface.Surface
import me.lincolnstuart.funblocks.foundation.ui.theme.FunBlocksTheme
import me.lincolnstuart.funblocks.playground.screens.components.form.button.SimpleButtonScreen
import me.lincolnstuart.funblocks.playground.screens.components.form.button.TimerButtonScreen

class ButtonScreen : Screen {

    @Composable
    override fun Content() {
        FunBlocksTheme {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                val navigator = LocalNavigator.currentOrThrow
                val scrollState = rememberScrollState()
                Column(Modifier.verticalScroll(scrollState)) {
                    SimpleListItem(title = "Button") {
                        navigator.push(SimpleButtonScreen())
                    }
                    SimpleListItem(title = "TimerButton") {
                        navigator.push(TimerButtonScreen())
                    }
                }
            }
        }
    }
}