package lesson_8

fun main() {
    val ingredients = arrayOf("Яйца", "Молоко", "Перец", "Масло", "Помидор", "Зелень")

    println("Введите ингредиент, который вы хотите найти:")
    val userInput = readln()

    if (userInput in ingredients) {
        println("Ингредиент \"$userInput\" в рецепте есть.")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}