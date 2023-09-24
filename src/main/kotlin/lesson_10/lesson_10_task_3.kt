package lesson_10

import kotlin.random.Random
fun main() {
    println("Enter length of generating pass")
    val passLengthInput = readln().toInt()

    val generatedPass = passGenerator(passLengthInput)

    println(generatedPass)
}

fun passGenerator(passLengthInput: Int): String {

    val digits = "0123456789"
    val chars = "!\"#\$%&'()*+,-./"

    val pass = StringBuilder()

    for (i in 0 until passLengthInput) {
        if (i % 2 == 0) {
            val randomDigits = digits[Random.nextInt(digits.length)]
            pass.append(randomDigits)
        } else {
            val randomChars = chars[Random.nextInt(chars.length)]
            pass.append(randomChars)
        }
    }
    return pass.toString()
}