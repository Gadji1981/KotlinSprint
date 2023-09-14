package lesson_6

fun main() {
    println("Введите количество секунд:")
    val seconds = readln().toInt()
    var secCounter = 0

    while ((seconds + 1) > secCounter) {
        println("Прошло ${secCounter++} секунд")
        Thread.sleep(1000)


    }
}