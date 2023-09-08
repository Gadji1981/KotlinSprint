package lesson_4
const val TABLES_TOTAL = 13
fun main(){
    val tablesReservedToday =13
    val tablesReservedTomorrow = 4

    println("Доступность столиков на сегодня: ${tablesReservedToday < TABLES_TOTAL}")
    println("Доступность столиков на завтра: ${tablesReservedTomorrow < TABLES_TOTAL}")
}