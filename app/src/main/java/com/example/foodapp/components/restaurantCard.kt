package com.example.foodapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.foodapp.models.Restaurant
import com.example.foodapp.utils.restaurantData

@Composable
fun RestaurantCard(res: Restaurant) {
    Column {
        AsyncImage(
            model = res.img,
            contentDescription = null
        )
        Text(
            res.nombre
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun RestaurantCardPreview() {
    RestaurantCard(res = restaurantData.restaurants.first())
}