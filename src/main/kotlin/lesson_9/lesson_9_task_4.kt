package lesson_9

fun main() {
    val emptyList = mutableListOf<String>()

    println("Введите значения разделенные запятыми:")
    val userInput = readln()

    val values = userInput.split(",")

    if (values.size == 5) {
        emptyList.addAll(values)
        val sortedList = emptyList.sorted()
        println(sortedList)
    } else {
        println("Вы ввели неверное количество значений.")
    }

}