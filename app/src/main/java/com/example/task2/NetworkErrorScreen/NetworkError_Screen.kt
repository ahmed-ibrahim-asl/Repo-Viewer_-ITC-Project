package com.example.task2.NetworkErrorScreen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task2.CommonUi.CustomTopAppBar
import com.example.task2.Issues_Screen.IssuesScreen
import com.example.task2.R


@Composable
fun NetworkErrorScreen(modifier: Modifier = Modifier) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {

        Spacer(modifier = Modifier.height(30.dp))

        CustomTopAppBar(
            titleRes = R.string.Network_Error_Screen,
            modifier = Modifier.fillMaxWidth(),
            showBackButton = false ,
            onBackButtonClicked = {},
            color = Color.White
        )
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 1.dp,
            color = Color.LightGray
        )


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(1.dp)
        ) {


            Spacer(modifier = Modifier.height(60.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                Image(
                    painter = painterResource(id = R.drawable.network_error) ,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                )

            }

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                Text(
                    text = stringResource(id = R.string.NetworkErrorMessage),
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )

            }


            Spacer(modifier = Modifier.height(15.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                Text(
                    text = "Network Error",
                    fontSize = 20.sp,
                    color = Color.Gray
                )


            }

            Spacer(modifier = Modifier.height(80.dp))


            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()

            ) {

                OutlinedButton(
                    onClick = {  },
                    border = BorderStroke(2.dp, Color(0xFF4CAF50)),
                    shape = RoundedCornerShape(6.dp),

                    modifier = Modifier
                        .width(310.dp),

                    contentPadding = PaddingValues(vertical = 15.dp) // Add padding inside the button
                ) {

                    Text(
                        text = "RETRY",
                        color = Color(0xFF4CAF50), // Green color for the text
                        fontSize = 20.sp,
                    )
                }


            }
        }











    }

}








@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
private fun NetworkErrorScreenPrev() {
    NetworkErrorScreen()
}
