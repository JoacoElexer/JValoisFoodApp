package com.example.foodapp.utils

import com.example.foodapp.models.Food

object foodData {
    val foods = listOf(
        Food("https://picsum.photos/300/200", "Pizza", 4.8, 120.0),
        Food("https://picsum.photos/300/201", "Hamburguesa", 4.5, 100.0),
        Food("https://picsum.photos/300/202", "Sushi", 4.7, 150.0),
        Food("https://picsum.photos/300/203", "Tacos", 4.9, 80.0),
        Food("https://picsum.photos/300/204", "Pasta", 4.6, 130.0)
    )
}
