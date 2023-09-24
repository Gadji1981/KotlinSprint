package lesson_10

fun main() {
    var humanWins = 0
    var computerWins = 0

    do {
        val humanScore = rollDice()
        val computerScore = rollDice()

        println("Выпавшие значения человека: $humanScore")
        println("Выпавшие значения компьютера: $computerScore")

        if (humanScore > computerScore) {
            println("Победило человечество")
            humanWins++
        } else if (humanScore < computerScore) {
            println("Победила машина")
            computerWins++
        } else {
            println("Ничья")
        }
    } while (playAgainChoise())

    println("Человек выиграл партий = $humanWins")
    println("Компьютер выиграл партий = $computerWins")
}

fun rollDice(): Int {
    val dice1 = (1..6).random()
    val dice2 = (1..6).random()
    return dice1 + dice2
}

fun playAgainChoise(): Boolean {
    while (true) {
        println("Желаете продолжить игру? да/нет")
        val playAgain = readln()

        when (playAgain.lowercase()) {
            "да" -> return true
            "нет" -> return false
        }
    }
}