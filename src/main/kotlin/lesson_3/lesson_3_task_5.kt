package lesson_3

fun main() {
    val playerMove = "D2-D4:0"

    val stringSplitOne = playerMove.split(":")

    val moveData = stringSplitOne[0]
    val moveNum = stringSplitOne[1]

    val stringSplitTwo = moveData.split("-")

    val moveFrom = stringSplitTwo[0]
    val moveTo = stringSplitTwo[1]

    println(moveFrom)
    println(moveTo)
    println(moveNum)
}