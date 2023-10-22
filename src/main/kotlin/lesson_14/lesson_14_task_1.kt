package lesson_14

open class Ship(
    val name: String = "Лайнер",
    val speed: Double = 28.5,
    val passangerCapacity: Int = 3140,
    val cargoCapacity: Double = 92.2,
    val iceBreakAbbility: Boolean = false
) {
    fun getInfo() = println("""
        |Корабль: $name.
        |Скорость: $speed узлов.
        |Вместимость: $passangerCapacity пассажиров.
        |Грузоподъемность: $cargoCapacity тонн.
        |Функция ледокола: ${if (iceBreakAbbility) "Да" else "Нет"}.
        |
        """.trimMargin())
}

class Cargo(
    name: String = "Грузовой",
    speed: Double = 22.3,
    passangerCapacity:Int = 289,
    cargoCapacity: Double = 750.4,
    iceBreakAbbility: Boolean = false
) : Ship(
    name,
    speed,
    passangerCapacity,
    cargoCapacity,
    iceBreakAbbility,
) {

}

class IceBreaker(
    name: String = "Ледокол",
    speed: Double = 16.8,
    passangerCapacity:Int = 115,
    cargoCapacity: Double = 150.4,
    iceBreakAbbility: Boolean = true
) : Ship(
    name,
    speed,
    passangerCapacity,
    cargoCapacity,
    iceBreakAbbility,
) {

}

fun main() {
    val ship = Ship()
    val cargo = Cargo()
    val iceBreaker = IceBreaker()

    ship.getInfo()
    cargo.getInfo()
    iceBreaker.getInfo()

}