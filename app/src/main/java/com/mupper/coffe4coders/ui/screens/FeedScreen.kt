package com.mupper.coffe4coders.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mupper.coffe4coders.ui.components.BodyText
import com.mupper.coffe4coders.ui.components.CountyISO
import com.mupper.coffe4coders.ui.components.ProductCard
import com.mupper.coffe4coders.ui.components.TitleText
import com.mupper.coffe4coders.ui.theme.Coffe4CodersTheme

@Composable
fun FeedScreen() {
    val countries = listOf(
        CountyISO.COL,
        CountyISO.BRA,
        CountyISO.CRI,
        CountyISO.NIC,
    )

    Coffe4CodersTheme {
        Surface(color = MaterialTheme.colors.background) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                item {
                    Column(
                        modifier = Modifier.padding(8.dp)
                    ) {
                        TitleText("Bienvenido")
                        BodyText("Lorem ipsum dolor sit amet")
                    }
                }
                items(countries) { country ->
                    ProductCard(
                        name = "Café de Colombia",
                        summary = "Café de las montañas",
                        price = "35",
                        currency = "USD",
                        countyISO = country
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun FeedScreenPreview() {
    Coffe4CodersTheme {
        FeedScreen()
    }
}