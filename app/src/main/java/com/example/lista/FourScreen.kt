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
fun FourScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White),
    )
    {
        Text(text = "Macarrones Con Tomate y Atun",
            color = Color.Red,
            fontSize = 50.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text = "Una receta muy recurrente y fácil de hacer",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.padding(120.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFour() {
    FourScreen()
}