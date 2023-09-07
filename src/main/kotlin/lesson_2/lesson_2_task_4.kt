package lesson_2

fun main() {
    val crystalItem = 7
    val ironItem = 11
    val buffAddOn = 0.2
    val crystalBuffs = (crystalItem * buffAddOn).toInt()
    val ironBuffs = (ironItem * buffAddOn).toInt()

    println("Баффы за кристаллы: $crystalBuffs")
    println("Баффы за железную руду: $ironBuffs")
}