package lesson_4

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME_MAX = 100
fun main() {
    var weight = 20
    var volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" +
                "${weight in AVERAGE_WEIGHT_MIN..AVERAGE_WEIGHT_MAX && volume < AVERAGE_VOLUME_MAX}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume соответствует категории 'Average':" +
                "${weight in AVERAGE_WEIGHT_MIN..AVERAGE_WEIGHT_MAX && volume < AVERAGE_VOLUME_MAX}"
    )
}