package lesson_12

class WeatherTracker {
    var dayTempriture = 0.0
    var nightTempriture = 0.0
    var hasRain = false
    var atmosPreasure = 0.0

    fun printWeatherInfo() {
        println("""
            |Погода днем: $dayTempriture C.
            |Погода ночью: $nightTempriture C.
            |Дождь: $hasRain
            |Атмосферное давление: $atmosPreasure мм рт. ст.
        """.trimMargin())
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

    println("Погода сегодня:")
    println(weatherInfo1.printWeatherInfo())

    println("\nПогода завтра:")
    println(weatherInfo2.printWeatherInfo())
}