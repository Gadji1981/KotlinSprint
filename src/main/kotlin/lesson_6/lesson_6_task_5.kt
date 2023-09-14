package lesson_6

fun main() {
    var attempts = 3

    while (attempts > 0){
        val firstRandomNum = (1..9).random()
        val secondRandomNum = (1..9).random()
        print("Решите пример: $firstRandomNum+$secondRandomNum=")
        val answer = readln().toInt()

        if ((firstRandomNum + secondRandomNum) == answer) {
            println("Добро пожаловать!")
            return
        } else {
            attempts--
            println("Ответ неверный! Осталось $attempts попыток")
        }
    }
    println("Доступ запрещен!")
}