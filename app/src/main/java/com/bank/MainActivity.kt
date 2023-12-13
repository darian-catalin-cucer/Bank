package com.bank

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bank.ui.theme.BankTheme

/**
 * MainActivity is the entry point of the banking application, representing the main activity of the Android app.
 */
class MainActivity : ComponentActivity() {
    /**
     * Called when the activity is first created. This function sets up the Compose content for the main screen.
     *
     * @param savedInstanceState A Bundle containing the data most recently supplied in onSaveInstanceState.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the content of the activity using the BankTheme Composable
        setContent {
            BankTheme {
                // A Surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Display the greeting text with the name "Android"
                    Greeting("Android")
                }
            }
        }
    }
}

/**
 * Greeting is a Composable function that displays a simple greeting text.
 *
 * @param name The name to include in the greeting.
 * @param modifier A Modifier to apply to the Composable.
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Use the Text Composable to display a greeting message with the provided name
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/**
 * GreetingPreview is a Composable function used for previewing the Greeting Composable in Android Studio.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // Display the Greeting Composable within the BankTheme for preview purposes
    BankTheme {
        Greeting("Android")
    }
}