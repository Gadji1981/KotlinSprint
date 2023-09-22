package lesson_9

fun main() {
    val ingredients = listOf("Яйца", "Молоко", "Перец", "Масло", "Помидор", "Зелень")
    println("В рецепте есть следующие ингредиенты:")
    ingredients.forEach { println(it) }
}