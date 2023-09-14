package lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var moveCount = 1
    val playerOne = "$moveFrom-$moveTo;$moveCount"
    println(playerOne)

    moveFrom = "D2"
    moveTo = "D3"
    moveCount = 2
    val playerTwo = "$moveFrom-$moveTo;$moveCount"
    println(playerTwo)

}