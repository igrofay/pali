package ru.ser.pali8282pali

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import ru.ser.pali8282pali.common.view.theme.PaliTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaliTheme{
                Surface(
                    Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){

                }
            }
        }
    }
}