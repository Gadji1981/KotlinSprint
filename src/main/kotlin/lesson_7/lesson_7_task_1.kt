package lesson_7

fun main() {
    val passLength = 6
    val alphaRange = 'a'..'z'
    val numRange = 0..9

    val password = buildString {
        for (i in 0 until passLength) {
            val randomIndex = if (i % 2 == 0) alphaRange.random() else numRange.random()
            append(randomIndex)
        }
    }
    println(password)
}