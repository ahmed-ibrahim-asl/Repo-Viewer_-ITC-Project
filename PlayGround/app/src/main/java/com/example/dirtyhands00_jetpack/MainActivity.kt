package com.example.dirtyhands00_jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dirtyhands00_jetpack.ui.theme.DirtyHands00_jetpackTheme
import com.example.dirtyhands00_jetpack.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DirtyHands00_jetpackTheme {

                Greeting(name = "Ahmed")
                
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",

        /*
        * We can have predefined style and apply it using
        * style = '' instead of predefine it each time
        * */
        style = Typography.bodyLarge
    )


}



// you can have multiple of previews at once
@Preview(
    showBackground = true,

    // bar that has wifi and all of these stuff
    showSystemUi = true,

    // Specify title for preview
    name = "This is Name",

    device = Devices.PHONE
)

//@Preview(
//    showBackground = true,
//
//    // bar that has wifi and all of these stuff
//    showSystemUi = true,
//
//    name = "This is Name",
//    device = Devices.NEXUS_10
//)


@Composable
fun GreetingPreview() {
    DirtyHands00_jetpackTheme {
        Greeting("Android")
    }
}
