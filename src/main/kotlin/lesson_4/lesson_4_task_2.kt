package lesson_4

fun main() {
    val averageWeightRange = 35..100
    val averageVolumeRange = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average':" +
            "${20 in averageWeightRange && 80 < averageVolumeRange}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average':" +
            "${50 in averageWeightRange && 100 < averageVolumeRange}")
}