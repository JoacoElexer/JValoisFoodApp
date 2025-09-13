package com.example.foodapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.foodapp.R
import com.example.foodapp.components.CategoryCard
import com.example.foodapp.components.RestaurantCard
import com.example.foodapp.components.FoodCard
import com.example.foodapp.models.Food
import com.example.foodapp.utils.categoryData
import com.example.foodapp.utils.foodData
import com.example.foodapp.utils.restaurantData

@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    val user = "Joaco"
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        // Header !! Saludo con nombre + Boton de logout
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.usercircle),
                contentDescription = "Profile picture"
            )
            Text(text="Hola, $user")
            IconButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(R.drawable.signout),
                    contentDescription = "Logout"
                )
            }
        }
        Text(
            "Nuestras categorias"
        )
        // Lista de categorias !! Min = 5
        LazyRow {
            items(categoryData.categories){ cat ->
                CategoryCard(cat = cat)
            }
        }
        Text(
            "Busca los mejores restaurantes"
        )
        LazyRow {
            items(restaurantData.restaurants){ res ->
                RestaurantCard(res = res)
            }
        }
        Text(
            "Nuestras mejores comidas"
        )
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
            items(foodData.foods){ food ->
                FoodCard(food = food)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun preview() {
    HomeScreen(paddingValues = PaddingValues(25.dp))
}