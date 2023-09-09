package lesson_4

fun main() {
    val day = 5
    val armsTraining = day in 0..10 step 2
    val legsTraining = day in 0..10 step 2
    val backTraining = day in 1..10 step 2
    val absTraining = day in 1..10 step 2

    println("""
        |Упражнение для рук: $armsTraining
        |Упражнение для ног: $legsTraining
        |Упражнение для спины: $backTraining
        |Упражнение для пресса: $absTraining
        
    """.trimMargin())
}