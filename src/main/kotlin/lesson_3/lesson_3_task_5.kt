package lesson_3

fun main() {
    val playerMove = "D2-D4:0"

    val stringSplit = playerMove.split(":","-")

    val moveFrom = stringSplit[0]
    val moveTo = stringSplit[1]
    val moveNum = stringSplit[2]

    println(moveFrom)
    println(moveTo)
    println(moveNum)
}