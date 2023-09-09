package lesson_4

fun main() {
    println("Корабль имеет повреждения? (да/нет)")
    val shipDamage = readln() == "да"
    println("Число экипажа:")
    val crewNum = readln().toInt()
    println("Число ящиков с провизией:")
    val provisionBoxes = readln().toInt()
    println("Погода благоприятна? (да/нет)")
    val weather = readln() == "да"

    val sailingCondition = (shipDamage == false && crewNum in 55..70 && provisionBoxes > 50 && weather == true)
            || (crewNum == 70 && provisionBoxes > 50 && weather == true)

    val isShipDamaged = shipDamage == true
    val weatherConditions = weather == true


    println("Может ли корабль отправиться в плавание? $sailingCondition")
}