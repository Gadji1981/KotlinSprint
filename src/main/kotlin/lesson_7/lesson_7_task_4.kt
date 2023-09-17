package lesson_7

fun main() {
    println("Введите колличество секунд для отсчета:")
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло!")
}