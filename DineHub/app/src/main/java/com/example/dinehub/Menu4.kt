package com.example.dinehub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dinehub.ui.theme.DineHubTheme

class Menu4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu4Screen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu4Card(
    title: String,
    description: String,
    imageResource: Int,
    price: String
) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .padding(vertical = 10.dp, horizontal = 10.dp)
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFC800)),
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "Item Image",
                modifier = Modifier
                    .size(100.dp)
                    .padding(10.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = title,
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "₹ $price",
                    style = TextStyle(fontSize = 13.sp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = description,
                    style = TextStyle(fontSize = 13.sp)
                )
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu4Screen() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFFF))
            .verticalScroll(state = rememberScrollState())
    ) {
        TopAppBar(
            colors = TopAppBarDefaults.mediumTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.onSecondaryContainer,
                titleContentColor = MaterialTheme.colorScheme.secondary,
            ),
            title = {
                Column {
                    Text(
                        "DineHub => Harmony Grill",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.Red
                    )
                    Text(
                        text = "Discover, Dine, and Delight: Your Culinary Companion",
                        style = TextStyle(fontSize = 14.sp),
                        color = Color(0xFFFFFFFF)
                    )
                }
            }
        )
        Menu4Card(
            title = "Sushi Rolls",
            description = "Fresh sushi rolls filled with ingredients like tofu, avocado, cucumber, and rice, served with soy sauce and pickled ginger.",
            imageResource = R.drawable.m4item1,
            price = "300 - ₹400"
        )

        Menu4Card(
            title = "Spaghetti Aglio e Olio",
            description = "Spaghetti pasta tossed with garlic-infused olive oil, red pepper flakes, and sautéed vegetables.",
            imageResource = R.drawable.m4item2,
            price = "220"
        )

        Menu4Card(
            title = "Teriyaki Tofu",
            description = "Grilled tofu glazed with sweet teriyaki sauce, served with steamed rice and stir-fried vegetables.",
            imageResource = R.drawable.m4item3,
            price = "280"
        )

        Menu4Card(
            title = "Falafel Wrap",
            description = "Warm pita bread filled with crispy falafel, tahini sauce, lettuce, and tomatoes.",
            imageResource = R.drawable.m4item4,
            price = "200"
        )

        Menu4Card(
            title = "Greek Salad",
            description = "Crisp lettuce, Kalamata olives, feta cheese, red onions, cucumbers, and tomatoes, drizzled with Greek dressing.",
            imageResource = R.drawable.m4item5,
            price = "230"
        )

        Menu4Card(
            title = "Mango Sticky Rice",
            description = "Sweet glutinous rice topped with ripe mango slices and a drizzle of coconut cream.",
            imageResource = R.drawable.m4item6,
            price = "150"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Menu4ScreenPreview() {
    Menu4Screen()
}
