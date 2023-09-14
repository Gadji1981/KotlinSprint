package lesson_4

fun main() {
    val day = 5
    val isDayEven = day % 2 == 0
    val armsTraining = !isDayEven
    val legsTraining = isDayEven
    val backTraining = isDayEven
    val absTraining = !isDayEven

    println(
        """
        |Упражнение для рук: $armsTraining
        |Упражнение для ног: $legsTraining
        |Упражнение для спины: $backTraining
        |Упражнение для пресса: $absTraining
        
    """.trimMargin()
    )
}