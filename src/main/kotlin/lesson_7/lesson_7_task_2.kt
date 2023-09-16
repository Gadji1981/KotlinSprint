package lesson_7

fun main() {

    while (true) {
        val smsRandom = (1000..9999).random()
        println("Введите Ваш код авторизации: $smsRandom")
        val smsAuth = readln().toIntOrNull()
        if (smsAuth == smsRandom) {
            println("Код подтвержден.")
            break
        } else {
            println("Код введён неверно!")
        }
    }
}