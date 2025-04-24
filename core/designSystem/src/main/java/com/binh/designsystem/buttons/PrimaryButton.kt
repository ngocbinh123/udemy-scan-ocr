package com.binh.designsystem.buttons

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.binh.designsystem.buttons.states.ButtonState
import com.binh.designsystem.callbacks.OnClickListener

@Composable
fun PrimaryButton(
    text: String,
    state: ButtonState = ButtonState.Enabled,
    modifier: Modifier = Modifier,
    onClick: OnClickListener,
) {
    Button(
        onClick = onClick,
        enabled = state == ButtonState.Enabled,
        modifier = modifier,
    ) {
        Text(text = text)
    }
}