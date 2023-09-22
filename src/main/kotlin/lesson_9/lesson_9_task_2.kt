package lesson_9

fun main() {
    val ingredients = mutableListOf("Мясо", "Мука", "Молоко")
    println("В рецепте есть базовые ингредиенты:")
    for (ingredient in ingredients) {
        println(ingredient)
    }

    while (true) {
        println("Желаете добавить еще? да/нет")
        val answerInput = readln()

        if (answerInput.equals("да", ignoreCase = true)) {
            println("Какой ингредиент вы хотите добавить?")
            val newIngredient = readln()
            ingredients.add(newIngredient)

            println("Теперь в рецепте есть следующие ингредиенты:")
            for (ingredient in ingredients) {
                println(ingredient)
            }
            return
        } else {
            break
        }
    }
}