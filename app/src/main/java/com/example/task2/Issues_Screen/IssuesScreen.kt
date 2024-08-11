package com.example.task2.Issues_Screen

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task2.CommonUi.CustomTopAppBar
import com.example.task2.R


data class Issue(
    val title: String,
    val status: String,
    val date: String,
    val time: String,
    val action: String
)



@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun IssuesScreen(modifier: Modifier = Modifier) {

    // Example list of issues

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {

        CustomTopAppBar(
            titleRes = R.string.IssuesScreenTitle,
            modifier = Modifier.fillMaxWidth(),
            showBackButton = true,
            onBackButtonClicked = {},
            color = Color.White
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            items(IssuesDatabase.issues) { issue ->
                IssueCard(
                    IssueTitle = issue.title,
                    IssueStatus = issue.status,
                    CreationDate = issue.date,
                    CreationTime = issue.time,
                    ActionText = issue.action
                )
                Spacer(modifier = Modifier.height(8.dp)) // Space between cards
            }
        }
    }
}


@RequiresApi(Build.VERSION_CODES.Q)
@Preview
@Composable
private fun IssuesScreenPrev() {
    IssuesScreen()
}
