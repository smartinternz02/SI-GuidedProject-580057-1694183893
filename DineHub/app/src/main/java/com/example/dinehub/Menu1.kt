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

class Menu1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DineHubTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu1Screen()
                }
            }
        }
    }
}

@Composable
fun Menu1Card(
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
fun Menu1Screen() {


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
                        "DineHub => Rustic Hearth Restaurant",
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
        Menu1Card(
            title = "Roast Chicken with Mashed Potatoes",
            description = "Herb-roasted chicken served with creamy mashed potatoes and seasonal vegetables.",
            imageResource = R.drawable.m1item1,
            price = "350"
        )

        Menu1Card(
            title = "Vegetable Pot Pie",
            description = "A savory pie filled with a medley of seasonal vegetables in a rich, creamy sauce, topped with a flaky crust.",
            imageResource = R.drawable.m1item2,
            price = "280"
        )

        Menu1Card(
            title = "Grilled Salmon",
            description = "Fresh salmon fillet grilled to perfection, served with lemon-dill sauce and a side of quinoa salad.",
            imageResource = R.drawable.m1item3,
            price = "380"
        )

        Menu1Card(
            title = "Veggie Shepherd's Pie",
            description = "A hearty vegetarian shepherd's pie made with a savory filling of mixed vegetables, lentils, and mushrooms in a flavorful gravy, topped with creamy mashed potatoes and baked until golden brown.",
            imageResource = R.drawable.m1item4,
            price = "300"
        )

        Menu1Card(
            title = "Cornbread",
            description = "Warm, homemade cornbread served with honey butter.",
            imageResource = R.drawable.m1item5,
            price = "80"
        )

        Menu1Card(
            title = "Baked Macaroni and Cheese",
            description = "Creamy macaroni and cheese baked with a golden breadcrumb topping.",
            imageResource = R.drawable.m1item6,
            price = "220"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Menu1ScreenPreview() {
    Menu1Screen()
}
