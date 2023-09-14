package lesson_5

fun main () {
    println("Введите первое число от 1 до 100:")
    val firstNum = readLine()?.toIntOrNull()
    println("Введите второе число от 1 до 100:")
    val secondNum = readLine()?.toIntOrNull()
    val firstRandomNum = (1..100).random()
    val secondRandomNum = (1..100).random()

    if ((firstNum == firstRandomNum && secondNum == secondRandomNum) || (secondNum == firstRandomNum
                && firstNum == secondRandomNum)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNum == firstRandomNum || secondNum == secondRandomNum || secondNum == firstRandomNum
        || firstNum == secondRandomNum
    ) {
        println("Вы выиграли утешительный приз!")
        if (firstNum == firstRandomNum || secondNum == firstRandomNum) {
            println("Второе выигрышное число: $secondRandomNum")
        } else if (firstNum == secondRandomNum || secondNum == secondRandomNum) {
            println("Второе выигрышное число: $firstRandomNum")
        }
    } else {
        println(
            """
            |Неудача! Крутите барабан!
            |Выигрышные числа:
            |$firstRandomNum и $secondRandomNum
            """.trimMargin()
        )
    }
}