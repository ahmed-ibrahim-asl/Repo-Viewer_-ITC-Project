package com.example.task2.CommonUi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun Circle(color: Color, size: Dp) {
    Box(
        modifier = Modifier
            .size(size) // Set the size of the circle
            .background(color = color, shape = CircleShape) // Set the color and shape to circle
    )
}
