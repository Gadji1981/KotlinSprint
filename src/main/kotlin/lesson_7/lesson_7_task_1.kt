package lesson_7

fun main() {
    val passLength = 6
    val alphaRange = 'a'..'z'
    val numRange = 0..9

    var password = ""

    for (i in 0 until passLength)
        if (i % 2 == 0) {
            val randomIndex = alphaRange.random()
            password += randomIndex
        } else {
            val randomIndex = numRange.random()
            password += randomIndex
        }

    println(password)
}