package lesson_4

const val IS_SHIP_DAMAGED = true
val CREW_NUMBER = 55..70
const val PROVISION_BOXES = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {
    println("Корабль имеет повреждения? (да/нет)")
    val isShipDamage = readln() == "да"
    println("Число экипажа:")
    val crewNum = readln().toInt()
    println("Число ящиков с провизией:")
    val provisionBoxes = readln().toInt()
    println("Погода благоприятна? (да/нет)")
    val isWeatherFavorable = readln() == "да"

    val sailingCondition = (isShipDamage == IS_SHIP_DAMAGED && crewNum in CREW_NUMBER
            && provisionBoxes > PROVISION_BOXES && isWeatherFavorable == IS_WEATHER_FAVORABLE)
            || (crewNum == 70 && provisionBoxes > PROVISION_BOXES && isWeatherFavorable == IS_WEATHER_FAVORABLE)

    println("Может ли корабль отправиться в плавание? $sailingCondition")
}