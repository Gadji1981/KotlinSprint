package lesson_6

fun main() {
    println("Введите количество секунд:")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось ${seconds--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}