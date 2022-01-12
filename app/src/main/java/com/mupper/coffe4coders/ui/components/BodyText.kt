package com.mupper.coffe4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.mupper.coffe4coders.ui.theme.Coffe4CodersTheme

@Composable
fun BodyText(body: String) {
    Text(body, style = MaterialTheme.typography.body2, textAlign = TextAlign.Justify)
}

@Preview
@Composable
fun BodyTextPreview() {
    Coffe4CodersTheme {
        BodyText("Lorem ipsum dolor sit amet")
    }
}