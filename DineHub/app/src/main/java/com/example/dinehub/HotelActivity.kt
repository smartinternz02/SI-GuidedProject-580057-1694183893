package com.example.dinehub

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dinehub.ui.theme.DineHubTheme

class HotelActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HotelsScreen(context = this@HotelActivity)
                }
            }
        }
    }
}

@Composable
fun HotelCard(
    title: String,
    description: String,
    imageResource: Int,
    hotelIdentifier: String,
    onClick: () -> Unit
) {
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier
            .padding(vertical = 10.dp, horizontal = 10.dp)
            .background(Color.White)
            .clickable {
                onClick()
            }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFF6B3E)),
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "Hotel Image",
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
fun HotelsScreen(context : Context) {
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
                        "DineHub",
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

        HotelCard(
            title = "Rustic Hearth Restaurant",
            description = "A rustic-themed eatery that focuses on hearty, home style dishes. Expect classics like roast chicken, pot pies, and grilled steaks, all served with a side of warm, freshly baked bread.",
            imageResource = R.drawable.hotel1,
            hotelIdentifier = "Hotel1"
        )
        {
            val hotelIdentifier = "Hotel1"
            when(hotelIdentifier) {
                "Hotel1" -> {
                    val intent = Intent(context, Menu1::class.java)
                    context.startActivity(intent)
                }
            }
        }


        HotelCard(
            title = "Riverside Tavern",
            description = "A cozy, riverside establishment offering a mix of classic comfort foods such as burgers, sandwiches, and a variety of beers on tap. It's a perfect spot for casual dining with a scenic view.",
            imageResource = R.drawable.hotel2,
            hotelIdentifier = "Hotel2"
        )
        {
            val hotelIdentifier = "Hotel2"
            when(hotelIdentifier) {
                "Hotel2" -> {
                    val intent = Intent(context, Menu2::class.java)
                    context.startActivity(intent)
                }
            }
        }

        HotelCard(
            title = "Greenleaf Bistro",
            description = "A vegetarian-friendly bistro known for its fresh, locally sourced salads, hearty soups, and creative plant-based dishes. They also have a selection of vegan desserts and organic juices.",
            imageResource = R.drawable.hotel3,
            hotelIdentifier = "Hotel3"
        )
        {
            val hotelIdentifier = "Hotel3"
            when(hotelIdentifier) {
                "Hotel3" -> {
                    val intent = Intent(context, Menu3::class.java)
                    context.startActivity(intent)
                }
            }
        }

        HotelCard(
            title = "Harmony Grill",
            description = "A fusion restaurant that specializes in blending flavors from different cuisines, offering a menu that includes everything from sushi to pasta to savory stir-fries. It's a place where culinary traditions harmoniously coexist.",
            imageResource = R.drawable.hotel4,
            hotelIdentifier = "Hotel4"
        )
        {
            val hotelIdentifier = "Hotel4"
            when(hotelIdentifier) {
                "Hotel4" -> {
                    val intent = Intent(context, Menu4::class.java)
                    context.startActivity(intent)
                }
            }
        }

        HotelCard(
            title = "Sunflower Cafe",
            description = "A bright and cheerful cafe known for its breakfast and brunch offerings. You'll find a variety of omelets, fluffy pancakes, and freshly brewed coffee. Healthy smoothies and pastries are also on the menu.",
            imageResource = R.drawable.hotel5,
            hotelIdentifier = "Hotel5"
        )
        {
            val hotelIdentifier = "Hotel5"
            when(hotelIdentifier) {
                "Hotel5" -> {
                    val intent = Intent(context, Menu5::class.java)
                    context.startActivity(intent)
                }
            }
        }

        HotelCard(
            title = "Ocean View Diner",
            description = "A seaside diner that specializes in seafood dishes such as shrimp scampi, clam chowder, and grilled fish. They also offer a range of traditional diner fare like burgers, fries, and milkshakes, perfect for a beachside experience.",
            imageResource = R.drawable.hotel6,
            hotelIdentifier = "Hotel6"
        )
        {
            val hotelIdentifier = "Hotel6"
            when(hotelIdentifier) {
                "Hotel6" -> {
                    val intent = Intent(context, Menu6::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HotelsScreenPreview() {
    HotelsScreen(context = LocalContext.current)
}
