package lesson_4

const val IS_SUNNY = true
const val IS_AWNINIG_OPEN = true
const val AIR_HUMID = 20
const val CURENT_SEASON = "не зима"
fun main() {
    val isSunny = true
    val isAwningOpen = true
    val airHumid = 20
    val curentSeason = "зима"

    val favConditions = isSunny == IS_SUNNY && isAwningOpen == IS_AWNINIG_OPEN && airHumid == AIR_HUMID
            && curentSeason == CURENT_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favConditions")
}