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

class Menu5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu5Screen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu5Card(
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
fun Menu5Screen() {


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
                        "DineHub => Sunflower Cafe",
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
        Menu5Card(
            title = "Blueberry Pancakes",
            description = "Fluffy pancakes filled with juicy blueberries and drizzled with maple syrup.",
            imageResource = R.drawable.m5item1,
            price = "120"
        )

        Menu5Card(
            title = "Veggie Omelet",
            description = "Three-egg omelet filled with sautéed mushrooms, bell peppers, onions, and cheese.",
            imageResource = R.drawable.m5item2,
            price = "100"
        )

        Menu5Card(
            title = "Fruit Parfait",
            description = "Layers of Greek yogurt, granola, and fresh seasonal fruits like strawberries, blueberries, and bananas.",
            imageResource = R.drawable.m5item3,
            price = "70"
        )

        Menu5Card(
            title = "Spinach and Feta Quiche",
            description = "A savory pastry filled with a rich mixture of eggs, spinach, and feta cheese.",
            imageResource = R.drawable.m5item4,
            price = "110"
        )

        Menu5Card(
            title = "Cappuccinos",
            description = "Espresso topped with steamed milk and a generous dollop of frothy milk foam.",
            imageResource = R.drawable.m5item5,
            price = "120"
        )

        Menu5Card(
            title = "Banana Walnut Muffins (4Pcs.)",
            description = "Moist muffins loaded with ripe bananas and crunchy walnuts, perfect for breakfast or a snack.",
            imageResource = R.drawable.m5item6,
            price = "80"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Menu5ScreenPreview() {
    Menu5Screen()
}
