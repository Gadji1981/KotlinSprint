package lesson_14

abstract class Figure(color: String) {
    abstract fun countArea(): Double
    abstract fun countPerimeter(): Double
}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun countArea(): Double {
        return Math.PI * radius * radius
    }

    override fun countPerimeter(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(color: String, val weight: Double, val height: Double) : Figure(color) {
    override fun countArea(): Double {
        return weight * height
    }

    override fun countPerimeter(): Double {
        return 2 * (weight + height)
    }
}

fun main() {
    val circleBlack = Circle("Черный", 6.0)
    val circleWhite = Circle("Белый", 3.5)

    val rectangleBlack = Rectangle("Черный", 3.0, 5.7)
    val rectangleWhite = Rectangle("Белый", 8.2, 4.6)

    val blackFigures = circleBlack.countPerimeter() + rectangleBlack.countPerimeter()
    val whiteFigures = circleWhite.countArea() + rectangleWhite.countArea()

    println("Сумма периметров всех черных фигур $blackFigures")
    println("Сумма площадей всех белых фигур $whiteFigures")

}