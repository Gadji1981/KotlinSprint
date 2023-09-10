package lesson_4

const val IS_SHIP_DAMAGED = true
const val CREW_NUMBER_MIN = 55
const val CREW_NUMBER_MAX = 70
const val PROVISION_BOXES = 50
const val IS_WEATHER_FAVORABLE = true

fun main() {
    println("Корабль имеет повреждения? (true/false)")
    val isShipDamage = readln().toBoolean() == true
    println("Число экипажа:")
    val crewNum = readln().toInt()
    println("Число ящиков с провизией:")
    val provisionBoxes = readln().toInt()
    println("Погода благоприятна? (true/false)")
    val isWeatherFavorable = readln().toBoolean() == true

    val sailCondition = (isShipDamage == IS_SHIP_DAMAGED && crewNum in CREW_NUMBER_MIN..CREW_NUMBER_MAX
            && provisionBoxes > PROVISION_BOXES && isWeatherFavorable == IS_WEATHER_FAVORABLE)
            || (crewNum == CREW_NUMBER_MAX && provisionBoxes > PROVISION_BOXES &&
            isWeatherFavorable == IS_WEATHER_FAVORABLE)

    println("Может ли корабль отправиться в плавание? $sailCondition")
}