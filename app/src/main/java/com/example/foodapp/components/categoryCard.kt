package com.example.foodapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.foodapp.R
import com.example.foodapp.models.Category
import com.example.foodapp.utils.categoryData

@Composable
fun CategoryCard(cat: Category) {
    Column {
        Box (
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .background(Color.Red)
        ){
            AsyncImage(
                model = cat.img,
                contentDescription = cat.nombre,
                modifier = Modifier
                    .fillMaxSize()
            )
        }
        Text(cat.nombre)
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)

@Composable
fun CategoryCardPreview() {
    CategoryCard(cat = categoryData.categories.first())
}