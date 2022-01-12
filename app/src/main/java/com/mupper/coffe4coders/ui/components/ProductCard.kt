package com.mupper.coffe4coders.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mupper.coffe4coders.R
import com.mupper.coffe4coders.ui.theme.Coffe4CodersTheme
import com.mupper.coffe4coders.ui.theme.PlatziBlue
import com.mupper.coffe4coders.ui.theme.PlatziGreen

enum class CountyISO(val iso: String) {
    COL("COL"),
    BRA("BRA"),
    CRI("CRI"),
    NIC("NIC");

    fun getBackgroundImage(): Int = when (this) {
        COL -> R.drawable.co
        BRA -> R.drawable.br
        CRI -> R.drawable.ri
        NIC -> R.drawable.ni
    }

    fun getCounryFlag(): Int = when (this) {
        COL -> R.drawable.flagco
        BRA -> R.drawable.flagbr
        CRI -> R.drawable.flagri
        NIC -> R.drawable.flagni
    }

    fun getSurfaceColor(): Color = when (this) {
        COL, NIC -> PlatziBlue
        BRA, CRI -> PlatziGreen
    }
}

@Composable
fun ProductCard(
    name: String,
    summary: String,
    price: String,
    currency: String,
    countyISO: CountyISO
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { }
            .size(480.dp),
        elevation = 10.dp,
        shape = MaterialTheme.shapes.small
    ) {
        Image(painterResource(countyISO.getBackgroundImage()), contentDescription = null)
        Surface(
            modifier = Modifier.fillMaxWidth(),
            color = countyISO.getSurfaceColor().copy(alpha = 0.2f)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    name,
                    style = MaterialTheme.typography.h4,
                    color = MaterialTheme.colors.background
                )
                Text(
                    summary, style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.background
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row() {
                        Image(
                            painterResource(countyISO.getCounryFlag()), contentDescription = null,
                            modifier = Modifier.size(32.dp)
                        )
                        Text(
                            "$ $price $currency",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End,
                            style = MaterialTheme.typography.h4,
                            color = MaterialTheme.colors.background
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun ProductCardPreview() {
    Coffe4CodersTheme {
        ProductCard(
            "Café de Colombia",
            "Café de las montañas",
            "35",
            "USD",
            CountyISO.COL
        )
    }
}