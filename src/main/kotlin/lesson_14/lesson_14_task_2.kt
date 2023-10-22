package lesson_14

open class Ship1(
    val name: String = "Лайнер",
    val speed: Double = 28.5,
    val passangerCapacity: Int = 3140,
    val cargoCapacity: Double = 92.2,
    val iceBreakAbbility: Boolean = false
) {
    open fun getInfo() = println(
        """
        |Корабль: $name.
        |Скорость: $speed узлов.
        |Вместимость: $passangerCapacity пассажиров.
        |Грузоподъемность: $cargoCapacity тонн.
        |Функция ледокола: ${if (iceBreakAbbility) "Да" else "Нет"}.
        |Тип погрузки: Горизонтальный трап со шкафута.
        |
        """.trimMargin()
    )
}

class Cargo1(
    name: String = "Грузовой",
    speed: Double = 22.3,
    passangerCapacity: Int = 289,
    cargoCapacity: Double = 750.4,
    iceBreakAbbility: Boolean = false
) : Ship1(
    name,
    speed,
    passangerCapacity,
    cargoCapacity,
    iceBreakAbbility,
) {
    override fun getInfo() = println(
        """
        |Корабль: $name.
        |Скорость: $speed узлов.
        |Вместимость: $passangerCapacity пассажиров.
        |Грузоподъемность: $cargoCapacity тонн.
        |Функция ледокола: ${if (iceBreakAbbility) "Да" else "Нет"}.
        |Тип погрузки: Погрузочный кран.
        |
        """.trimMargin()
    )
}

class IceBreaker1(
    name: String = "Ледокол",
    speed: Double = 16.8,
    passangerCapacity: Int = 115,
    cargoCapacity: Double = 150.4,
    iceBreakAbbility: Boolean = true
) : Ship1(
    name,
    speed,
    passangerCapacity,
    cargoCapacity,
    iceBreakAbbility,
) {
    override fun getInfo() = println(
        """
        |Корабль: $name.
        |Скорость: $speed узлов.
        |Вместимость: $passangerCapacity пассажиров.
        |Грузоподъемность: $cargoCapacity тонн.
        |Функция ледокола: ${if (iceBreakAbbility) "Да" else "Нет"}.
        |Тип погрузки: Ворота со стороны кормы.
        |
        """.trimMargin()
    )
}

fun main() {
    val ship = Ship1()
    val cargo = Cargo1()
    val iceBreaker = IceBreaker1()

    ship.getInfo()
    cargo.getInfo()
    iceBreaker.getInfo()

}