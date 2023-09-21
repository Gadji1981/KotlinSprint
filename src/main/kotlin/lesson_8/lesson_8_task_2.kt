package lesson_8

fun main() {
    val ingredients = arrayOf("Яйцо", "Молоко", "Перец", "Масло", "Помидор", "Зелень")

    println("Введите ингредиент, который вы хотите найти:")
    val userInput = readln()

    var isFound = false

    for (ingredient in ingredients) {
        if (ingredient.equals(userInput, ignoreCase = true) == true) {
            isFound = true
        }
    }
    if (isFound) {
        println("Ингредиент \"$userInput\" в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет!")
    }
}