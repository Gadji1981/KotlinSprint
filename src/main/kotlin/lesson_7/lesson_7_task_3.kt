package lesson_7

fun main() {
    println("Введите любое положительно число:")
    val inputNum = readln().toInt()
    val lastNum = inputNum

    val evenNumber = (0..lastNum step 2).joinToString(", ")

    println("Все четные числа от 0 до $lastNum \n$evenNumber")
}
