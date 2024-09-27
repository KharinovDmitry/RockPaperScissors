package com.example.rockpaperscissors

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var user = intent.getIntExtra(ChoiceKey, -1)
        var computer = (1..3).random()

        var resultTextView =  findViewById<TextView>(R.id.result_textview)

        if (user == computer)  {
            resultTextView.text = "Ничья!"
        } else if (user == Rock && computer == Scissors ||
                   user == Paper && computer == Rock ||
                   user == Scissors && computer == Paper) {
            resultTextView.text = "Вы победили!"
        } else {
            resultTextView.text = "Вы проиграли! С вас 10 рублей"
        }
    }
}