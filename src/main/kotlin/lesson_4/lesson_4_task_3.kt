package lesson_4

fun main() {
    val weatherToday = true
    val tentOpen = true
    val airHumid = 20
    val curentSeason = "зима"

    val favorableConditions = weatherToday == true && tentOpen == true && airHumid == 20 && curentSeason == "не зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}