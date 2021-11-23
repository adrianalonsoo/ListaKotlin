package com.example.lista

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen(navController: NavController) {
        LazyColumn{
            item{

                Text(
                    text = "Receta 1",
                    fontSize = 36.sp,
                    modifier = Modifier
                        .padding(6.dp)
                        .clickable {
                            navController.navigate(Screen.Second.route)
                        }
                )

                Image(painter = painterResource(id = R.drawable.plato), contentDescription = "recetas",
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                )
            }

            item{

                Text(
                    text = "Receta 2",
                    fontSize = 36.sp,
                    modifier = Modifier
                        .padding(6.dp)
                        .clickable {
                            navController.navigate(Screen.Third.route)
                        }
                )

                Image(painter = painterResource(id = R.drawable.plato), contentDescription = "recetas",
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                )
            }

            item{

                Text(
                    text = "Receta 3",
                    fontSize = 36.sp,
                    modifier = Modifier
                        .padding(6.dp)
                        .clickable {
                            navController.navigate(Screen.Four.route)
                        }
                )

                Image(painter = painterResource(id = R.drawable.plato), contentDescription = "recetas",
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                )
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun PreviewGreeting() {
    HomeScreen(
        navController = rememberNavController()
    )
}