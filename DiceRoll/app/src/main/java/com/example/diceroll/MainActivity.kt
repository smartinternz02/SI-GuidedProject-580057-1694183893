package com.example.diceroll

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroll.ui.theme.DiceRollTheme
import java.util.Random
import java.util.*

class MainActivity : ComponentActivity() {
    private lateinit var resultTextView: TextView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        rollButton = findViewById(R.id.rollButton)

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val random = Random()
        val randomNumber = random.nextInt(6) + 1
        val resultText = "You Have Rolled: $randomNumber"
        resultTextView.text = resultText
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableResource = when(randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }

        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = randomNumber.toString()
    }
}

