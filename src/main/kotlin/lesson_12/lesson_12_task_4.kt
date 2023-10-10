package lesson_12

class WeatherFrcst(dayTempriture: Double, nightTempriture: Double, hasRain: Boolean, atmosPreasure: Double) {
    var dayTempriture = dayTempriture

    init {
        println("Погода днем: $dayTempriture")
    }

    var nightTempriture = nightTempriture

    init {
        println("Погода ночью: $nightTempriture")
    }

    var hasRain = hasRain

    init {
        println("Дождь: ${if (hasRain) "Да" else "Нет"}")
    }

    var atmosPreasure = atmosPreasure

    init {
        println("Атмосферное давление: $atmosPreasure")
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