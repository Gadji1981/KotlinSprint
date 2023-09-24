package lesson_10

fun main() {
    println("Введите логин:")
    val login = readLine() ?: ""

    println("Введите пароль:")
    val password = readLine() ?: ""

    if (isInputDataLengthValid(login, password)) {
        println("Приветствуем вас, $login!")
    }
}

fun isInputDataLengthValid(login: String, password: String): Boolean {
    if (login.length < 4 || password.length < 4) {
        println("Логин или пароль недостаточно длинные")
        return false
    }
    return true
}