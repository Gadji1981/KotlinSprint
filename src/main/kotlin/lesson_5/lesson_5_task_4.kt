package lesson_5

fun main() {
    println("Введите имя пользователя:")
    val userName = readln()

    when (userName) {
        "Zaphod" -> {
            println("Здравствуйте $userName! Введите пароль:")
            val password = readln()
            when (password) {
                "PanGalactic" -> println("Добро пожаловать!")
                else -> println("Неверный пароль")
            }
        }

        else -> println("Имя пользователя $userName не существует. Вам необходимо зарегистрироваться!")
    }
}