package com.binh.detectfruit.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun FruitTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (useDarkTheme) {
        darkColorScheme(
            primary = colorPrimaryDark,
            secondary = colorSecondaryDark
        )
    } else {
        lightColorScheme(
            primary = colorPrimaryLight,
            secondary = colorSecondaryLight
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = Shapes(),
        content = content
    )
}