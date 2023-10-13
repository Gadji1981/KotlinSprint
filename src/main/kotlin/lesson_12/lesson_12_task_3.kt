package lesson_12

class WeatherForecastMod(
    val dayTempriture: Double,
    val nightTempriture: Double,
    val hasRain: Boolean = false,
    val atmosPreasure: Double,
) {
    init {
        println(
            """
            |Погода днем: $dayTempriture C.
            |Погода ночью: $nightTempriture C.
            |Дождь: ${if (hasRain) "Да" else "Нет"}
            |Атмосферное давление: $atmosPreasure мм рт. ст.
            |
        """.trimMargin()
        )
    }
}

fun main() {
    val weatherInfo1 = WeatherForecastMod(
        dayTempriture = 25.2,
        nightTempriture = 17.4,
        hasRain = false,
        atmosPreasure = 745.0,
    )


    val weatherInfo2 = WeatherForecastMod(
        dayTempriture = 22.6,
        nightTempriture = 13.1,
        hasRain = true,
        atmosPreasure = 760.7,
    )

    val weatherInfo3 = WeatherForecastMod(
        dayTempriture = 28.3,
        nightTempriture = 21.6,
        atmosPreasure = 775.2,
    )
}