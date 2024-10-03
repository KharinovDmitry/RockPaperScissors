package com.example.rockpaperscissors

const val Rock: Int = 1
const val Scissors: Int = 2
const val Paper: Int = 3

const val ChoiceKey: String = "Choice"

fun getTextByChoice(choice: Int): String{
    if (choice == Rock) {
        return "Камень"
    }
    if (choice == Scissors) {
        return "Ножницы"
    }
    if (choice == Paper) {
        return "Бумага"
    }
    return "Ящерица, Спок"
}