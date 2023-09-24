package lesson_10

import kotlin.random.Random

fun main() {
    val humanScore = rollDice("Игрок")
    val compScore = rollDice("Компьютер")

    if (humanScore > compScore) {
        println("Победило человечество")
    } else if (humanScore < compScore) {
        println("Победила машина")
    } else {
        println("Ничья!")
    }
}

fun rollDice(player: String): Int {
    println("$player бросает кости...")
    val dice1 = Random.nextInt(1, 7)
    val dice2 = Random.nextInt(1, 7)
    val totalScore = dice1 + dice2
    println("$player выбросил $dice1 и $dice2, общий счет = $totalScore")
    return (totalScore)
}