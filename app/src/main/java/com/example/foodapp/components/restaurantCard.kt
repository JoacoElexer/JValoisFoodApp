package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.models.Restaurant
import com.example.foodapp.utils.restaurantData

@Composable
fun RestaurantCard(res: Restaurant) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Box (
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .padding(bottom = 3.dp)
                .size(100.dp)
        ){
            AsyncImage(
                model = res.img,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
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