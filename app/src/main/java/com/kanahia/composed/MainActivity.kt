package com.kanahia.composed

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kanahia.composed.ui.theme.ComposedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposedTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {}
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EditTextPreview() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(value = state.value, onValueChange = { state.value = it })
}

fun print(p : String){
    Log.e("PRINT", p)
}