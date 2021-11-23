package com.example.lista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White),

    )
    {
        Text(text = "Pollo con Patatas",
            color = Color.Red,
            fontSize = 50.sp,
        )
        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Me encanta esta receta de pollo al horno con patatas y cebolla.",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.padding(100.dp)
        )
        Spacer(modifier = Modifier.height(12.dp))


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSecond() {
    SecondScreen()
}