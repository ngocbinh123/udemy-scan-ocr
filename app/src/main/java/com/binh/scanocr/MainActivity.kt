package com.binh.scanocr

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.binh.designsystem.buttons.PrimaryButton
import com.binh.designsystem.callbacks.OnClickListener
import com.binh.scanocr.ui.theme.ScanOCRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScanOCRTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var count by remember { mutableIntStateOf(value = 0) }
                    LazyColumn {

                        item {
                            Greeting(
                                name = "Android",
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                        item {
                            PrimaryButton(
                                text = "Detect Fruit" + if (count > 0) " $count" else "",
                                onClick = {
                                    Log.d("MainActivity", "onCreate: Clicked at ${++count}")
                                },
                                modifier = Modifier.padding(innerPadding)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview(
    onClickDetectFruit: OnClickListener,
) {
    ScanOCRTheme {
        Greeting("Android")
    }
}