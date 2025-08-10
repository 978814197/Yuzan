package cloud.ynyg.yuzan

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import cloud.ynyg.yuzan.app.App
import cloud.ynyg.yuzan.core.di.appModule
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.koin.core.context.startKoin
import yuzan.composeapp.generated.resources.Res
import yuzan.composeapp.generated.resources.app_icon
import yuzan.composeapp.generated.resources.app_name

fun main() = application {
    startKoin {
        modules(
            appModule
        )
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = stringResource(Res.string.app_name),
        icon = painterResource(Res.drawable.app_icon)
    ) {
        App()
    }
}