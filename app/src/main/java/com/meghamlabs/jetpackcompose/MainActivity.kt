package com.meghamlabs.jetpackcompose

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.VectorApplier
import androidx.compose.ui.graphics.vector.VectorPainter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
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

                )
            {
                ButtonDemo()
            }

        }
    }
}

@Composable
fun ButtonDemo() {
    val context = LocalContext.current
    Button(onClick = {
        Toast.makeText(context,"Clicked on Button",Toast.LENGTH_LONG).show()
    }) {
        Text(text = "add to cart")
    }

    Button(onClick = {
        Toast.makeText(context,"Clicked in Button",Toast.LENGTH_LONG).show()
    }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    TextButton(onClick = {
        Toast.makeText(context,"Clicked on text Button",Toast.LENGTH_LONG).show()
    }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    OutlinedButton(onClick = {
        Toast.makeText(context,"Clicked on outlined Button",Toast.LENGTH_LONG).show()
    }, enabled = false
    ) {
        Text(text = "add to cart")
    }

    IconButton(onClick = {Toast.makeText(context,"Clicked on outlined Button",Toast.LENGTH_LONG).show()
    }) {

            Icon(Icons.Filled.Refresh , contentDescription = "RefreshButton")
    }




    }



