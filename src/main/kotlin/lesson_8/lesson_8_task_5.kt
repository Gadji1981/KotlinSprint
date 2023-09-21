package lesson_8

fun main() {
    print("Введите количество ингредиентов: ")
    val numOfIngredients = readln().toInt()

    val ingredientsArray = arrayOfNulls<String>(numOfIngredients)

    for (i in 0 until numOfIngredients) {
        print("Введите ингредиент номер ${i + 1}: ")
        ingredientsArray[i] = readln()
    }

    for (i in 0 until numOfIngredients)
        println("${i + 1} - ${ingredientsArray[i]}")
}