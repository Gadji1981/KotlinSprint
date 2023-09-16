package lesson_7

fun main() {
    println("Введите длину генерируемого пароля:")
    val stringLength = readln().toInt()
    val numRange = 0..9
    val lowerCharRange = 'a'..'z'
    val upperCharRange = 'A'..'Z'
    var pass = ""

    for (i in 1..stringLength) {
        val randomSymbol = (numRange + lowerCharRange + upperCharRange).random()
        print(randomSymbol)
        pass += randomSymbol
    }
}