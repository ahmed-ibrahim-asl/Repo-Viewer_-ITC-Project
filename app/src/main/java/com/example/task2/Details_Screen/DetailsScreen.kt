package com.example.task2.Details_Screen

import android.media.tv.TvContract.Channels.Logo
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task2.R
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.res.stringResource
import com.example.task2.CommonUi.Circle
import com.example.task2.CommonUi.CustomTopAppBar





@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun MainScreenView(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {


        CustomTopAppBar(
            titleRes = R.string.detailsTitle,
            modifier = Modifier.fillMaxWidth(),
            showBackButton = true ,
            onBackButtonClicked = {},
            color = Color.White
        )



        HorizontalDivider(thickness = 1.dp, color = Color.Gray)

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.google_logo),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Language",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){


                Text(
                    text = "1525",
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.width(1.dp)) // Space between texts

                Image(
                    painter = painterResource(id = R.drawable.star_icon) ,
                    contentDescription = null,
                    modifier = Modifier
                        .padding(horizontal = 6.dp)
                        .size(20.dp)
                )

                Spacer(modifier = Modifier.width(8.dp)) // Space between texts

                Text(
                    text = "Python",
                    fontSize = 20.sp
                )


                Spacer(modifier = Modifier.width(1.dp)) // Space between texts

                Circle(Color.Blue, size = 20.dp)

                Spacer(modifier = Modifier.width(8.dp)) // Space between texts

                Text(
                    text = "347",
                    fontSize = 20.sp
                )

                Image(
                    painter = painterResource(id = R.drawable.forking_icon) ,
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                )



            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                
                Text(
                    text = "Shared repository for open-sourced projects from the Google AI Language team.",
                    fontSize = 20.sp
                )

                Box(
                    Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center

                ){


                    Button(
                        onClick = { /*TODO*/ },

                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF1A2D87)),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .size(250.dp, 50.dp)
                    ) { Text(
                        text = "Show Issues",
                        fontSize = 30.sp
                    )}
                }
            }



        }

    }

}






@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
private fun TopAppBarPreview() {
    MainScreenView()

}