package lesson_6

fun main() {
    val randomNum = (1..9).random()
    var attempts = 5

    while (attempts > 0) {
        println("Игра \"УГАДАЙ ЧИСЛО\"")
        println("Введите число от 1 до 9")
        val guess = readln().toInt()
        if (guess == randomNum) {
            println("Это была великолепная игра!")
            return
        } else {
            attempts--
            println("\nНеверно! Попробуйте снова. Осталось $attempts попыток.")
        }
    }
    println("Было загадано число $randomNum")
}