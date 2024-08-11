package com.example.task2.CommonUi

import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopAppBar(
    modifier: Modifier,
    @StringRes titleRes: Int,
    showBackButton: Boolean = true,
    onBackButtonClicked: () -> Unit = {},
    color: Color = MaterialTheme.colorScheme.primary,
){
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = titleRes),
                fontSize = 25.sp,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        },

        modifier = modifier.background(color),
        navigationIcon = {

            if(showBackButton){
                IconButton(onClick = onBackButtonClicked) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = null
                    )
                }
            }
        }

    )


}
