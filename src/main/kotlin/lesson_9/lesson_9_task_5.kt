package lesson_9

fun main() {
    val ingredientsList = mutableSetOf<String>()
    println("Введите пять названий ингредиентов:")

    for (i in 0 until 5) {
        print("Ингредиент номер ${i + 1}: ")
        val userInput = readln()
        ingredientsList.add(userInput)
    }

    val sortedList = ingredientsList.sorted()

    val formatedList = sortedList.joinToString(separator = ", ", postfix = ".").lowercase().capitalize()

    print(formatedList)
}