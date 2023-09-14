package lesson_2

import kotlin.math.pow

fun main() {
    val deposit: Double = 70000.0
    val percentPerYear: Double = 16.7
    val years: Int = 20
    val balance = deposit * (1 + percentPerYear / 100).pow(years)
    val formatedBalance = String.format("%.3f",balance)
    println("Размер вклада через 20 лет: $formatedBalance")
}