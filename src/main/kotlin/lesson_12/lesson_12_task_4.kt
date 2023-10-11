package lesson_12

class WeatherFrcst(dayTempriture: Double, nightTempriture: Double, hasRain: Boolean, atmosPreasure: Double) {

    init {
        println("""
            |Погода днем: $dayTempriture
            |Погода ночью: $nightTempriture
            |Дождь: ${if (hasRain) "Да" else "Нет"}
            |Атмосферное давление: $atmosPreasure
        """.trimMargin())
    }
}

fun main() {
    val weatherInfo1 = WeatherFrcst(
        dayTempriture = 25.2,
        nightTempriture = 17.4,
        hasRain = false,
        atmosPreasure = 745.0,
    )

    val weatherInfo2 = WeatherFrcst(
        dayTempriture = 22.6,
        nightTempriture = 13.1,
        hasRain = true,
        atmosPreasure = 760.7,
    )
}