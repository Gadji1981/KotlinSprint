package lesson_7

fun main() {
    println("Ведите любое положительно число число:")
    val inputNum = readln().toInt()
    val lastNum = inputNum

    println("Все четные числа от 0 до $lastNum")

    for (i in 0..lastNum step 2) {
        print("$i, ")
    }
}
