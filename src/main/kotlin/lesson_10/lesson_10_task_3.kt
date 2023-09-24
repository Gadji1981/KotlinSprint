package lesson_10

fun main() {
    println("Укажите количество символов для генерации пароля:")
    val passLengthInput = readln().toInt()

    val generatedPass = generatePassword(passLengthInput)

    println(generatedPass)
}

fun generatePassword(passLengthInput: Int): String {

    val digits = 0..9
//    val chars = "!\"#\$%&'()*+,-./"
    val asciiChars = 32..47
    val chars = asciiChars.map { it.toChar() }

    val pass = StringBuilder()

    for (i in 0 until passLengthInput) {
        if (i % 2 == 0) {
            val randomDigits = digits.random()
            pass.append(randomDigits)
        } else {
            val randomChars = chars.random()
            pass.append(randomChars)
        }
    }
    return pass.toString()
}