package com.example.genshincharacterusingcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.genshincharacterusingcompose.ui.theme.GenshinCharacterUsingComposeTheme

class DetailActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GenshinCharacterUsingComposeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GenshinCharacterDetail()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    GenshinCharacterUsingComposeTheme {
        GenshinCharacterApp()
    }
}