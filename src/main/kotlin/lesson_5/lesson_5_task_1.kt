package lesson_5

const val BOT_CHECK_ANSWER = 4
fun main() {
    print("Введите ответ для подтверждения что Вы не бот: 2+2=")
    val botCheck = readln().toInt()

    if (botCheck == BOT_CHECK_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}