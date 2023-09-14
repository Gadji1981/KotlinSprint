package lesson_5

const val FIRST_WIN_NUM = 42
const val SECOND_WIN_NUM = 77
fun main() {
    println("Введите первое число от 1 до 100:")
    val firstNum = readLine()?.toIntOrNull()
    println("Введите второе число от 1 до 100:")
    val secondNum = readLine()?.toIntOrNull()

    if ((firstNum == FIRST_WIN_NUM && secondNum == SECOND_WIN_NUM) || (secondNum == FIRST_WIN_NUM
                && firstNum == SECOND_WIN_NUM)
    ) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (firstNum == FIRST_WIN_NUM || secondNum == SECOND_WIN_NUM || secondNum == FIRST_WIN_NUM
        || firstNum == SECOND_WIN_NUM
    ) {
        println("Вы выиграли утешительный приз!")
        if (firstNum == FIRST_WIN_NUM || secondNum == FIRST_WIN_NUM) {
            println("Второе выигрышное число: $SECOND_WIN_NUM")
        } else if (firstNum == SECOND_WIN_NUM || secondNum == SECOND_WIN_NUM) {
            println("Второе выигрышное число: $FIRST_WIN_NUM")
        }
    } else {
        println(
            """
            |Неудача! Крутите барабан!
            |Выигрышные числа:
            |$FIRST_WIN_NUM и $SECOND_WIN_NUM
            """.trimMargin()
        )
    }
}