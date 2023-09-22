package lesson_9

fun main() {
    val ingredientsPerPerson = listOf(2, 50,15)

    print("Введите количество порций омлета: ")
    val numOfServings = readln().toInt()

    val ingredinetsTotal = ingredientsPerPerson.map{it * numOfServings}

    println("На $numOfServings порций омлета вам понадобится: ")
    println("Яиц - ${ingredinetsTotal[0]} шт.")
    println("Молока - ${ingredinetsTotal[1]} мл.")
    println("Сливочного масла - ${ingredinetsTotal[2]} гр.")
}