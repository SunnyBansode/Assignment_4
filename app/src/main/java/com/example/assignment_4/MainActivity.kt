package com.example.assignment_4

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment_4.ui.theme.Assignment_4Theme

class MainActivity : ComponentActivity() {
    private var counter = 0 // Counter for Button 1 clicks
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.myTextView)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        // Button 1: Increment a counter and update the TextView
        button1.setOnClickListener {
            counter++
            textView.text = "Button clicked $counter times"
        }
        // Button 2: Change the height of the TextView
        button2.setOnClickListener {
            textView.layoutParams.height = 200
            textView.requestLayout()
        }
        // Button 3: Center the text on the screen
        button3.setOnClickListener {
            val layoutParams = textView.layoutParams as
                    RelativeLayout.LayoutParams
            layoutParams.addRule(
                RelativeLayout.CENTER_IN_PARENT,
                RelativeLayout.TRUE
            )
            textView.layoutParams = layoutParams
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
fun GreetingPreview() {
    Assignment_4Theme {
        Greeting("Android")
    }
}