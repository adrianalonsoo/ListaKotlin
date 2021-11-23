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
fun ThirdScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .background(color = Color.White),
    )
    {
        Text(text = "Alubias Blancas",
            color = Color.Red,
            fontSize = 50.sp
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Las judias o alubias blancas con verduras es una de esas comidas saludables, ricas, fáciles y económicas de preparar",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.padding(100.dp)

        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewThird() {
    ThirdScreen()
}