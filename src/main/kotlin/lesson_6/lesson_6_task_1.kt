package lesson_6

fun main() {
    println("Регистрация нового пользователя")
    println("Введите имя пользователя: ")
    val name = readln()
    println("Введите пароль: ")
    val pass = readln()

    while (true) {
        println()
        println("Ввох в приложение")
        println("Введите имя пользователя: ")
        val userName = readln()
        println("Введите пароль: ")
        val userPass = readln()

        if (name == userName && pass == userPass) {
            println("Авторизация прошла успешно!")
            break
        } else {
            println("Неверный логин и пароль! Попробуйте снова.")
        }

    }
}