package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()

    println("Введите пароль:")
    val password = readln()

    if (isInputDataLengthValid(login, password) != true) {
        println("Приветствуем вас, $login!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun isInputDataLengthValid(login: String, password: String) = login.length < 4 || password.length < 4