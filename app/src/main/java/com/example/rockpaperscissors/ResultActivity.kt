package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val player = intent.getIntExtra(ChoiceKey, -1)
        val computer = (1..3).random()

        val playerChoiceTextView = findViewById<TextView>(R.id.player_choice)
        val computerChoiceTextView = findViewById<TextView>(R.id.computer_choice)

        playerChoiceTextView.text = getTextByChoice(player)
        computerChoiceTextView.text = getTextByChoice(computer)

        val resultTextView =  findViewById<TextView>(R.id.result_textview)

        if (player == computer)  {
            resultTextView.text = "Ничья!"
        } else if (player == Rock && computer == Scissors ||
            player == Paper && computer == Rock ||
            player == Scissors && computer == Paper) {
            resultTextView.text = "Вы победили!"
        } else {
            resultTextView.text = "Вы проиграли! С вас 10 рублей"
        }
    }
}