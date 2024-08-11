package com.example.task2.Issues_Screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task2.CommonUi.IssueLogo

@Composable
fun IssueCard(
    modifier: Modifier = Modifier,
    IssueTitle: String,  // Raw text
    IssueStatus: String, // Raw text
    ActionText: String,  // Raw text
    CreationDate: String,  // Raw text
    CreationTime: String  // Raw text
) {

    Row (
        horizontalArrangement = Arrangement.Start,
        verticalAlignment =     Alignment.Top,

        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(13.dp),
            )
            .padding(8.dp)
    ){

        IssueLogo(
            outerColor = Color.Black,
            innerColor = Color.Black,
            ringColor = Color.White,
            Shapesize = 50.dp,
            modifier = Modifier
                .padding(8.dp)
                .clip(CircleShape)

        )

        Column (
            modifier = Modifier
                .padding(horizontal = 10.dp, vertical = 0.dp)
                .weight(1f)
        ){
            Text(
                text = IssueTitle,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                maxLines = 1,

                overflow = TextOverflow.Ellipsis

            )


            Text(text = IssueStatus)

            Spacer(modifier = Modifier.height(8.dp)) // Space between texts

            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically,

                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
            ){
                Text(
                    text = "Created At: ",
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    modifier = Modifier.alignByBaseline()

                )

                Text(
                    text = "$CreationDate, ",
                    fontSize = 12.sp,
                    modifier = Modifier.alignByBaseline()
                    )

                Text(
                    text = CreationTime,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .wrapContentWidth(Alignment.Start)

                )
            }


        }

        Text(
            text = ActionText,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)
        )

    }
}




@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
private fun TopAppBarPreview() {
    IssueCard(
        IssueTitle = "Bump Pyarrow from 7",
        IssueStatus = "NONE",
        CreationDate = "2023-11-9",
        CreationTime = "23:0 PM",
        ActionText = "Open"
        )
}