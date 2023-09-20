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

class Menu2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu2Screen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu2Card(
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
fun Menu2Screen() {


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
                        "DineHub => Riverside Tavern",
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
        Menu2Card(
            title = "Classic Chicken Burger",
            description = "A juicy chicken patty topped with melted cheddar cheese, lettuce, tomato, pickles, and served on a toasted sesame seed bun.",
            imageResource = R.drawable.m2item1,
            price = "250"
        )

        Menu2Card(
            title = "BBQ Pulled Jackfruit Sandwich",
            description = "Tender jackfruit slow-cooked in smoky barbecue sauce, served on a fresh bun with coleslaw.",
            imageResource = R.drawable.m2item2,
            price = "220"
        )

        Menu2Card(
            title = "Fish and Chips",
            description = "Crispy beer-battered fish fillets served with golden, seasoned sweet potato fries and tartar sauce.",
            imageResource = R.drawable.m2item3,
            price = "300"
        )

        Menu2Card(
            title = "Caesar Salad",
            description = "Fresh romaine lettuce, Parmesan cheese, croutons, and Caesar dressing.",
            imageResource = R.drawable.m2item4,
            price = "180"
        )

        Menu2Card(
            title = "Buffalo Cauliflower Bites",
            description = "Crispy cauliflower florets tossed in spicy buffalo sauce, served with celery sticks and blue cheese dressing.",
            imageResource = R.drawable.m2item5,
            price = "220"
        )

        Menu2Card(
            title = "Crafty Non-Alcoholic Beverages",
            description = "A selection of non-alcoholic craft beverages, including artisanal sodas, sparkling water, and iced tea.",
            imageResource = R.drawable.m2item6,
            price = "120 - ₹150"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Menu2ScreenPreview() {
    Menu2Screen()
}
