package com.meghamlabs.jetpackcompose

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorApplier
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meghamlabs.jetpackcompose.ui.theme.JetpackComposeTheme
import java.util.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,

                modifier = Modifier.fillMaxSize()

            ) {
                LazyRowItemsDemo()
            }

        }
    }
}

@Composable
fun ButtonDemo() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context, "Clicked on Button", Toast.LENGTH_LONG).show()
    }) {
        Text(text = "add to cart")
    }

    Button(
        onClick = {
            Toast.makeText(context, "Clicked in Button", Toast.LENGTH_LONG).show()
        }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    TextButton(
        onClick = {
            Toast.makeText(context, "Clicked on text Button", Toast.LENGTH_LONG).show()
        }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    OutlinedButton(
        onClick = {
            Toast.makeText(context, "Clicked on outlined Button", Toast.LENGTH_LONG).show()
        }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    IconButton(onClick = {
        Toast.makeText(context, "Clicked on outlined Button", Toast.LENGTH_LONG).show()
    }) {

        Icon(
            Icons.Filled.Refresh,
            contentDescription = "RefreshButton",
            tint = Color.Red,
            modifier = Modifier.size(80.dp)
        )
    }


    Button(
        onClick = {
            Toast.makeText(context, "Clicked in Button", Toast.LENGTH_LONG).show()
        },

        shape= CircleShape,
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White

        )
    ) {
        Text(
            text = "add to cart",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(5.dp)
        )
    }


    Button(
        onClick = {
            Toast.makeText(context, "Clicked in Button", Toast.LENGTH_LONG).show()
        },

        shape= CutCornerShape(10.dp),
        contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = Color.DarkGray,
            contentColor = Color.White

        )
    ) {
        Text(
            text = "add to cart",
            style = MaterialTheme.typography.h3,
            modifier = Modifier.padding(5.dp)
        )
    }



}

@Composable
fun LazyRowItemsDemo() {
    LazyRow {
        items((1..100).toList()) {
            Text(text = "Item $it")
        }
    }
}

