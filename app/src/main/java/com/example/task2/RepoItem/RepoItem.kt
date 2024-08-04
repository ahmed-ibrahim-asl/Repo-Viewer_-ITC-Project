package com.example.task2.RepoItem

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.task2.R

@Composable
fun RepoItem(modifier: Modifier = Modifier) {

    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment =     Alignment.Top,

        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(3.dp),
            )

    ){

    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = null,

        modifier = Modifier
            .size(50.dp)
            .padding(8.dp)
            .clip(CircleShape)
            .background(Color.Black)
    )

    Column(
        Modifier.padding(10.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,

            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(text = "Repo Name", modifier = Modifier.weight(1f) )
            Text(text = "2090")
            Image(
                painter = painterResource(id = R.drawable.star_icon) ,
                contentDescription = null,
                modifier = Modifier
                    .padding(horizontal = 6.dp)
                    .size(13.dp)

//                colorFilter = ColorFilter.tint(Color.Red)

                )
        }

        Text(text = "Repo Owner" )
        Text(
            text = "Rep Description Rep Descriptionscriptionscription Rep Description Rep Description Rep Description Rep Description",
            maxLines = 2,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(top = 6.dp)

        )
    }

    }




}


@Preview
@Composable
private fun PreviewRepoItem() {
    RepoItem()
}