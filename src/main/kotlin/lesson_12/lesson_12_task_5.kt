package lesson_12

import kotlin.random.Random

class WeatherData {
    var dayTemperature: Double = 0.0
    var nightTemperature: Double = 0.0
    var hasRain: Boolean = false
    var atmosPressure: Double = 0.0

    init {
        dayTemperature = Random.nextDouble(-10.0, 35.0)
        nightTemperature = Random.nextDouble(-10.0, 20.0)
        hasRain = Random.nextBoolean()
        atmosPressure = Random.nextDouble(850.0, 1050.0)
    }
}

fun main() {
    val weatherDataList = mutableListOf<WeatherData>()

    for (i in 1..10) {
        weatherDataList.add(WeatherData())
    }

    var totalDayTemp = 0.0
    var totalNightTemp = 0.0
    var rainyDays = 0
    var totalAtmosPressure = 0.0

    for (weather in weatherDataList) {
        totalDayTemp += weather.dayTemperature
        totalNightTemp += weather.nightTemperature
        if (weather.hasRain) rainyDays++
        totalAtmosPressure += weather.atmosPressure
    }

    val averageDayTemp = totalDayTemp / weatherDataList.size
    val averageNightTemp = totalNightTemp / weatherDataList.size
    val averageAtmosPressure = totalAtmosPressure / weatherDataList.size

    val formatedAverageDayTemp = String.format("%.2f", averageDayTemp)
    val formatedAverageNightTemp = String.format("%.2f", averageNightTemp)
    val fromatedAverageAtmosPressure = String.format("%.2f", averageAtmosPressure)

    println(
        """
        |Средняя температура днем: $formatedAverageDayTemp
        |Средняя температура ночью: $formatedAverageNightTemp
        |Количество дождливых дней: $rainyDays
        |Среднее атмосферное давление: $fromatedAverageAtmosPressure
    """.trimMargin()
    )
}