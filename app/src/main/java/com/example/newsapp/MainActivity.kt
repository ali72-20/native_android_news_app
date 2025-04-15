package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.ui.theme.NewsAppTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NewsAppTheme {
                SplashContent()
            }
        }
    }
}


@Composable
fun SplashContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(R.drawable.pattern), contentScale = ContentScale.FillBounds)
    ) {
        Image(painterResource(id = R.drawable.logo), contentDescription = "Logo")

    }
}


@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewSplashScreen() {
    NewsAppTheme {
        SplashContent()
    }
}