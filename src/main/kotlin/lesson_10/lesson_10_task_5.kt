package lesson_10

fun main() {
    println("Введите имя пользователя (не менее четырех символов):")
    val userLoginInput = readln()

    while (true) {
        val generatedPassword = generatePassword()
        val generatedSms = generateSms()

        if (checkLoginLength(userLoginInput)) {
            println("Ваш пароль: $generatedPassword")
        } else {
            println("Имя пользователя менее четырех символов.")
        }

        println("Введите имя пользователя:")
        val loginInput = readln()

        println("Введите пароль:")
        val passwordInput = readln()

        if (loginInput == userLoginInput && passwordInput == generatedPassword) {
            println("Введите код из СМС \"$generatedSms\"")
            val smsInput = readln()

            if (smsInput == generatedSms) {
                println("Добро пожаловать $loginInput")
                break
            } else {
                println("Код не подтвержден!")
            }
        } else {
            println("Не верный имя пользователя или пароль!")
        }
    }
}

fun checkLoginLength(userLogin: String): Boolean = userLogin.length >= 4

fun generateSms(): String = (1000..9999).random().toString()

fun generatePassword(): String {
    val numbers = 0..9
    val lettersSmall = 'a'..'z'
    val lettersCaps = 'A'..'Z'
    val allChars = numbers + lettersSmall + lettersCaps

    val pass = StringBuilder()
    for (i in 0 until 6) {
        val randomChar = allChars.random()
        pass.append(randomChar)
    }
    return pass.toString()
}