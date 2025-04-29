package com.example.composablequadrant

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composablequadrant.ui.theme.ComposableQuadrantTheme
import androidx.core.graphics.toColorInt
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposableQuadrantTheme {

                Surface(modifier = Modifier.fillMaxSize()) {
                    MainLayout()
                }
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                heading = "Text composable",
                body = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFEADDFF)
            )
            Quadrant(
                heading = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFD0BCFF),

            )
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant(
                heading = "Row composable",
                body = "Places its children in a horizontal sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFB69DF8)
            )
            Quadrant(
                heading = "Column composable",
                body = "Places its children in a vertical sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                color = Color(0xFFF6EDFF)
            )
        }
    }
}
@Composable
fun Quadrant(
    modifier: Modifier = Modifier,
    heading: String,
    body: String,
    color:Color
) {
    Column(
        modifier = modifier
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = heading,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify,
        )
    }
}




//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposableQuadrantTheme {
        MainLayout()

    }
}