package lesson_5

fun main() {
    val botCheckNumOne = 2
    val botCheckNumTwo = 2

    print("Введите ответ для подтверждения что Вы не бот: $botCheckNumOne+$botCheckNumTwo=")
    val botCheck = readln().toInt()

    val botCheckAnswer = botCheckNumOne + botCheckNumTwo

    if (botCheck == botCheckAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}