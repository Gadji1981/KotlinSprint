package lesson_4

fun main() {
    val averageWeightRange = 35..100
    val averageVolumeRange = 100

    println("Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': ${42 in averageWeightRange && 120 < averageVolumeRange}")
    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${20 in averageWeightRange && 80 < averageVolumeRange}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${50 in averageWeightRange && 100 < averageVolumeRange}")


    //Вариант, если нужно с присвоением переменным:
    /*    val cargoFirstWeight = 42
        val cargoFirstVolume = 120

        val cargoSecondWeight = 20
        val cargoSecondVolume = 80

        val cargoThirdWeight = 50
        val cargoThirdVolume = 100

        println("Груз с весом $cargoFirstWeight кг и объемом $cargoFirstVolume л соответствует категории 'Average': ${cargoFirstWeight in averageWeightRange && cargoFirstVolume < averageVolumeRange}")
        println("Груз с весом $cargoSecondWeight кг и объемом $cargoSecondVolume л соответствует категории 'Average': ${cargoSecondWeight in averageWeightRange && cargoSecondVolume < averageVolumeRange}")
        println("Груз с весом $cargoThirdWeight кг и объемом $cargoThirdVolume л соответствует категории 'Average': ${cargoThirdWeight in averageWeightRange && cargoThirdVolume < averageVolumeRange}")*/
}