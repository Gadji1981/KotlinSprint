package lesson_9

fun main() {
    val ingredients = mutableListOf("Мясо", "Мука", "Молоко")
    println("В рецепте есть базовые ингредиенты: $ingredients")

    while (true) {
        println("Желаете добавить еще? да/нет")
        val answerInput = readln()

        if (answerInput.lowercase() == "да") {
            println("Какой ингредиент вы хотите добавить?")
            val newIngredient = readln()
            ingredients.add(newIngredient)
            println("Теперь в рецепте есть следующие ингредиенты: $ingredients")
        }else{
            break
        }
    }
}