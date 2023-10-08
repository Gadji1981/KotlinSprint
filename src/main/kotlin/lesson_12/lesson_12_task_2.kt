package lesson_12

class WeatherTracker {
    var dayTempriture = 29.7
    var nightTempriture = 23.3
    var hasRain = false
    var atmosPreasure = 756.8

    fun printWeatherInfo() {
        println(
            """
            |Погода днем: $dayTempriture C.
            |Погода ночью: $nightTempriture C.
            |Дождь: ${if (hasRain) "Да" else "Нет"}
            |Атмосферное давление: $atmosPreasure мм рт. ст.
        """.trimMargin()
        )
    }
}

fun main() {
    val weatherInfo1 = WeatherTracker()
    weatherInfo1.dayTempriture = 25.2
    weatherInfo1.nightTempriture = 17.4
    weatherInfo1.hasRain = false
    weatherInfo1.atmosPreasure = 745.0

    val weatherInfo2 = WeatherTracker()
    weatherInfo2.dayTempriture = 22.6
    weatherInfo2.nightTempriture = 13.1
    weatherInfo2.hasRain = true
    weatherInfo2.atmosPreasure = 760.7

    val weatherInfo3 = WeatherTracker()

    println("Погода на сегодня:")
    println(weatherInfo1.printWeatherInfo())

    println("\nПогода на завтра:")
    println(weatherInfo2.printWeatherInfo())

    println("\nПогода на субботу:")
    println(weatherInfo3.printWeatherInfo())
}