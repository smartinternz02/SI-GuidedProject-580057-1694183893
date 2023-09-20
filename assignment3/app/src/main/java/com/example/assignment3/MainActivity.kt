package com.example.assignment3

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginScreen()
        }
    }
}

@SuppressLint("QueryPermissionsNeeded", "SuspiciousIndentation")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(){
    var username by remember { mutableStateOf("") }
    var paswrd by remember { mutableStateOf("") }
    val context = LocalContext.current
    Column (
        modifier = Modifier
            .fillMaxSize().
            background(color = Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.login),
            contentDescription = "Login Image",
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
        )

        Text(
            text = "Login Page",
        )

        OutlinedTextField(
            value = username,
            onValueChange = {username = it},
            label = { Text(text = "Username")},
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp)
            )

        OutlinedTextField(
            value = paswrd,
            onValueChange = {paswrd=it},
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth().padding(horizontal = 30.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            keyboardActions = KeyboardActions(
                onDone = {
                    //Handle Login Here
                }
            )
        )

        Spacer(modifier = Modifier.height(16.dp))
        
        Button(
            onClick = {
            val url = "https://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
        },
        modifier = Modifier.width(300.dp).requiredHeight(50.dp).padding(top = 10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google image",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 16.dp))
            Text(text = "Go To Google")
        }

        Button(
            onClick = {
                val url = "https://www.amazon.in/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            },
            modifier = Modifier.width(300.dp).requiredHeight(50.dp).padding(top = 10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.amazon),
                contentDescription = "Amazon Image",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 16.dp))
            Text(text = "Go To Amazon")
        }

        Button(
            onClick = {
                val url = "https://www.youtube.com/"
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            },
            modifier = Modifier.width(300.dp).requiredHeight(50.dp).padding(top = 10.dp)
        ){
            Image(
                painter = painterResource(id = R.drawable.youtube),
                contentDescription = "Youtube Image",
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 16.dp))
            Text(text = "Go To Youtube")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen(){
    LoginScreen()
}