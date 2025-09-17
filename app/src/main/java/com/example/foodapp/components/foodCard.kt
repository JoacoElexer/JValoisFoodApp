package com.example.foodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.R
import com.example.foodapp.models.Food
import com.example.foodapp.utils.foodData

@Composable
fun FoodCard(food: Food) {
    Column {
        Box (
            modifier = Modifier
                .size(170.dp)
        ){
            AsyncImage(
                model = food.img,
                contentDescription = food.nombre,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
            )
            Box (
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .width(70.dp)
                    .height(30.dp)
                    .background(Color.Red)
            ){
                Text(
                    "$${food.precio.toString()}",
                    color = Color.White
                )
            }
        }
        Row (
            horizontalArrangement = Arrangement.Center
        ){
            Image(
                painter = painterResource(R.drawable.star),
                contentDescription = null,
                modifier = Modifier
                    .padding(end = 3.dp)
                    .size(20.dp)
            )
            Text(
                food.calificacion.toString(),
                modifier = Modifier
                    .padding(end = 5.dp)
            )
            Text(
                food.nombre
            )
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