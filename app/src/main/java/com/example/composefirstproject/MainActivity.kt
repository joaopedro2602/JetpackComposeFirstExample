package com.example.composefirstproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composefirstproject.ui.theme.ComposeFirstProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MessageCard()
        }
    }
}

@Composable
fun MessageCard() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.width(20000.dp)){
        Text("Hello World!")
        Text("Hello World!2")

        Button(onClick = {
            //função do botão aqui
        }) {
            Text(text = "Simple Button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeFirstProjectTheme {
        MessageCard()
    }
}