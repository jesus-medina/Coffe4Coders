package com.mupper.coffe4coders.ui.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mupper.coffe4coders.ui.theme.Coffe4CodersTheme

@Composable
fun TitleText(title: String) {
    Text(title, style = MaterialTheme.typography.h3)
}

@Preview
@Composable
fun TitleTextPreview() {
    Coffe4CodersTheme {
        TitleText("Title")
    }
}