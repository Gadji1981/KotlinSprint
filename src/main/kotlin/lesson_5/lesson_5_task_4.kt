package lesson_5

fun main() {
    println("Введите имя пользователя:")
    val userName = readln()
    val userNameRegd = "Zaphod"
    val userPassRegd = "PanGalactic"

    when (userName) {
        userNameRegd -> {
            println("Здравствуйте $userName! Введите пароль:")
            val userPassword = readln()
            when (userPassword) {
                userPassRegd -> println("Добро пожаловать!")
                else -> println("Неверный пароль")
            }
        }

        else -> {
            println("Имя пользователя $userName не существует. Вам необходимо зарегистрироваться!")
            println("Введите имя пользователя:")
            val userNameNew = readln()
            println("Введите пароль:")
            val userPassNew = readln()
            println("Вы зарегистрировались как: $userNameNew \nЗапомните Ваш пароль: $userPassNew")
        }
    }
}