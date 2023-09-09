package lesson_4

fun main() {
    val day = 5
    val isDayEven = day % 2 == 0
    val armsTraining = isDayEven == true
    val legsTraining = isDayEven == true
    val backTraining = isDayEven == false
    val absTraining = isDayEven == false

    println(
        """
        |Упражнение для рук: $armsTraining
        |Упражнение для ног: $legsTraining
        |Упражнение для спины: $backTraining
        |Упражнение для пресса: $absTraining
        
    """.trimMargin()
    )
}