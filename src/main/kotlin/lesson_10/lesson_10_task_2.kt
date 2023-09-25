package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (checkLoginAndPass(login, password)) {
        println("Приветствуем вас, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkLoginAndPass(login: String, password: String) = login.length > 4 || password.length > 4