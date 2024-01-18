package com.example.lab1test

import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab1test.ui.theme.Lab1TestTheme
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Formatter

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab1TestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background) {
                    Column {
                        Greeting("INF2007?")
                        From("Michael")
                        //get computer's time
                        val currentDateTime = LocalDateTime.now()

                        //Define custom date and time format
                        val formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

                        //Format the date and time according to formatter
                        val formattedDateTime = currentDateTime.format(formatter)

                        Log.d("MainActivity", "on created at $formattedDateTime")
                    }//column
                }//materialtheme
                }//labtest1theme
            }//setcontent
        }//oncreate
    }//Mainactivity

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )//for Text
}// for greeting function


@Composable
fun From(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//Test function, not called when the app is running
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab1TestTheme {
        Greeting("INF2007?")
    }
}