package com.example.foodapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen(paddingValues: PaddingValues) {
    Column (
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Header !! Saludo con nombre + Boton de logout
        Row(

        ) {

        }
        Text(
            "Nuestras categorias"
        )
        // Lista de categorias !! Min = 5
        LazyRow {

        }
        Text(
            "Busca los mejores restaurantes"
        )
        // Lista de restaurantes !! Min = 5
        LazyRow {

        }
        Text(
            "Nuestras mejores comidas"
        )
        // Lista de comida !! Min = 5
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {

        }
    }
}