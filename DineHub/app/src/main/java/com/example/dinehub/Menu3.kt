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

class Menu3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu3Screen()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu3Card(
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
fun Menu3Screen() {


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
                        "DineHub => Greenleaf Bistro",
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
        Menu3Card(
            title = "Caprese Salad",
            description = "Slices of ripe tomatoes, fresh mozzarella, basil leaves, drizzled with extra-virgin olive oil and balsamic glaze.",
            imageResource = R.drawable.m3item1,
            price = "220"
        )

        Menu3Card(
            title = "Portobello Mushroom Burger",
            description = "Grilled portobello mushroom cap served on a whole wheat bun with roasted red peppers and herbed mayo.",
            imageResource = R.drawable.m3item2,
            price = "280"
        )

        Menu3Card(
            title = "Lentil Soup",
            description = "Hearty lentil soup with vegetables and aromatic spices, served with crusty whole grain bread.",
            imageResource = R.drawable.m3item3,
            price = "150"
        )

        Menu3Card(
            title = "Vegan Thai Curry",
            description = "A fragrant blend of tofu, coconut milk, and Thai spices, served with jasmine rice.",
            imageResource = R.drawable.m3item4,
            price = "290"
        )

        Menu3Card(
            title = "Avocado Toast with Poached Egg",
            description = "Toasted artisan bread topped with mashed avocado, a perfectly poached egg, and a sprinkle of chili flakes.",
            imageResource = R.drawable.m3item5,
            price = "200"
        )

        Menu3Card(
            title = "Chocolate Cake",
            description = "A decadent chocolate cake made without dairy or eggs, served with a dairy-free chocolate ganache.",
            imageResource = R.drawable.m3item6,
            price = "180"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Menu3ScreenPreview() {
    Menu3Screen()
}
