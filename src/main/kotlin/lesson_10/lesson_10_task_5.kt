package lesson_10

fun main() {
    var newUserInput = " "
    var loginInput = " "
    var generatedPassword = " "
    var passwordInput = " "
    var generatedSms = " "
    var smsInput = " "

    do {
        println("Введите имя пользователя (не менее четырех символов):")
        newUserInput = readln()

        if (!checkLoginLength(newUserInput)) println("Имя пользователя менее четырех символов.")
    } while (!checkLoginLength(newUserInput))

    do {
        generatedPassword = generatePassword()
        println("Ваш пароль: $generatedPassword")
        println("Введите имя пользователя:")
        loginInput = readLine() ?: ""

        println("Введите пароль:")
        passwordInput = readLine() ?: ""

        if (loginInput != newUserInput || passwordInput != generatedPassword) {
            println("Неверное имя пользователя или пароль!")
        } else {
            break
        }
    } while (true)

    do {
        generatedSms = generateSms()
        println("Введите код из СМС \"$generatedSms\"")
        smsInput = readln()

        if (smsInput == generatedSms) {
            println("Добро пожаловать $loginInput")
            break
        } else {
            println("Код не подтвержден!")
        }
    } while (true)
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