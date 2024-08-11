package com.example.task2.CommonUi

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun IssueLogo(
    outerColor: Color,
    innerColor: Color,
    ringColor: Color,
    Shapesize: Dp,
    modifier: Modifier
) {

    Box(
        modifier = Modifier
            .size(Shapesize) // Set the size of the circle
            .background(color = outerColor, shape = CircleShape) // Set the color and shape to circle
            .padding(Shapesize * 0.15f)
            .background(color = ringColor, shape = CircleShape) // Set the color and shape to circle
            .padding(Shapesize * 0.16f)
            .background(color = innerColor, shape = CircleShape) // Set the color and shape to circle
    )
}


@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
private fun IconPreview() {
    IssueLogo(
        outerColor = Color.Black,
        innerColor = Color.Black,
        ringColor = Color.White,
        Shapesize = 15.dp,
        modifier = Modifier.padding(8.dp) // Example of using the modifier for additional padding

    )
}
