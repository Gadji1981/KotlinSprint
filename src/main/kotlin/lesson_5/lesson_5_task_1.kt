package lesson_5

fun main() {
    print("Введите ответ для подтверждения что Вы не бот: 2+2=")
    val botCheck = readln().toInt()

    val botCheckAnswer = 4

    if (botCheck == botCheckAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}