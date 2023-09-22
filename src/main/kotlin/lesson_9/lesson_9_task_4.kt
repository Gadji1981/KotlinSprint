package lesson_9

const val TOTAL_INPUTS = 5
fun main() {
    val emptyList = mutableListOf<String>()

    println("Введите значения разделенные запятыми:")
    val userInput = readln()

    val values = userInput.split(",")

    if (values.size == TOTAL_INPUTS) {
        emptyList.addAll(values)
        val sortedList = emptyList.sorted()
        println(sortedList.joinToString(",").trim())
    } else {
        println("Вы ввели неверное количество значений.")
    }

}