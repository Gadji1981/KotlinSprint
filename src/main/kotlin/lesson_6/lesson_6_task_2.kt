package lesson_6

fun main() {
    println("Введите количество секунд:")
    val seconds = readln().toInt()
    val secCounter = seconds * 1000

    Thread.sleep(secCounter.toLong())
    println("Прошло $seconds секунд")
}