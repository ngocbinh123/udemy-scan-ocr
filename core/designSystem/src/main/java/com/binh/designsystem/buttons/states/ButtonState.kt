package com.binh.designsystem.buttons.states

sealed class ButtonState {
    object Enabled : ButtonState()
    object Disabled : ButtonState()
    object Loading : ButtonState()
}