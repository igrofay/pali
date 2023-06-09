package ru.ser.pali8282pali.common.view.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColors(
    background = Color(0xFF090606),
    onBackground = Color.White,
    primary = Color(0xFFD02424),
    surface = Color(0xFFF7F7F7)
)

@Composable
fun PaliTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = DarkColorScheme,
        shapes = Shapes,
        content = content,
    )
}