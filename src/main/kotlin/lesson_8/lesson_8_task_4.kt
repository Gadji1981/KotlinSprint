package lesson_8

fun main() {
    val ingredients = arrayOf("Яйца", "Молоко", "Перец", "Масло", "Помидор", "Зелень")
    println("Список ингредиентов: ${ingredients.joinToString(", ")}")
    println("Введите ингредиент для замены:")
    val oldIngredient = readln()

    if (ingredients.contains(oldIngredient)) {
        println("Введите новое значение для ингредиента \"$oldIngredient\":")
        val newIngredient = readln()

        val index = ingredients.indexOf(oldIngredient)
        ingredients[index] = newIngredient

        println("Ингредиент $oldIngredient заменен на $newIngredient")
        println("Новый список ингредиентов: ${ingredients.joinToString(", ")}")
    } else {
        println("Такого ингредиента в списке нет!")
    }

}
