package lesson_5

const val USER_AGE = 18
fun main() {
    println("Введите год своего рождения:")
    val userYearOfBirth = readln().toInt()
    val currentYear = 2023
    val ageCalc = currentYear - userYearOfBirth

    if (ageCalc > USER_AGE) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}