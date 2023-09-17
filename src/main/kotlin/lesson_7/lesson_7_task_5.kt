package lesson_7

fun main() {
    println("Введите длину генерируемого пароля:")
    val stringLength = readln().toInt()
    val numRange = 0..9
    val lowerCharRange = 'a'..'z'
    val upperCharRange = 'A'..'Z'

    val pass = buildString {
        for (i in 1..stringLength) {
            val randomSymbol = (numRange + lowerCharRange + upperCharRange).random()
            append(randomSymbol)
        }
    }
    //println(pass)
}