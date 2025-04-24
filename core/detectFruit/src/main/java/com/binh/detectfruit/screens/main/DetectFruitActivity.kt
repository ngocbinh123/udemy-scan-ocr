package com.binh.detectfruit.screens.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.binh.detectfruit.screens.main.compose.DetectFruitScreen
import com.binh.detectfruit.theme.FruitTheme

class DetectFruitActivity : AppCompatActivity() {
    companion object {
        const val TAG = "DetectFruitActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContent {
//            FruitTheme {
//                DetectFruitScreen()
//            }
//        }
    }
}

