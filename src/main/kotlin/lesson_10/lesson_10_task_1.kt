fun main() {

    val humanScore = rollDice()
    println("Человек выбросил кости в сумме $humanScore")

    val compScore = rollDice()
    println("Компьютер выбросил кости в сумме $compScore")

    if (humanScore > compScore) {
        println("Победило человечество")
    } else if (humanScore < compScore) {
        println("Победила машина")
    } else {
        println("Ничья!")
    }
}

fun rollDice(): Int {
    val dice1 = (1 until 7).random()
    val dice2 = (1 until 7).random()
    return dice1 + dice2
}