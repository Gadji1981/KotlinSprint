package lesson_8

fun main() {
    val ingredients = arrayOf("Яйца", "Молоко", "Перец", "Масло", "Помидор", "Зелень")

    println("Введите ингредиент, который вы хотите найти:")
    val userInput = readln()

    if (ingredients.any { it.contains(userInput, ignoreCase = true) }) {
        println("Ингредиент \"$userInput\" в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}