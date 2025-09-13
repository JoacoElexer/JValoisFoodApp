package com.example.foodapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.foodapp.models.Food
import com.example.foodapp.utils.foodData

@Composable
fun FoodCard(food: Food) {
    Column {
        Box {
            AsyncImage(
                model = food.img,
                contentDescription = food.nombre
            )
            Box {
                Text("'$'${food.precio.toString()}")
            }
        }
        Row {
            AsyncImage(
                model = "", //Insertar estrella
                contentDescription = null
            )
            Text(food.calificacion.toString())
            Text(food.nombre)
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun FoodCardPreview() {
    FoodCard(food = foodData.foods.first())
}