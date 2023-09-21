package lesson_8

fun main() {
    val viewsPerDay = arrayOf(113, 170, 90, 65, 121, 210, 137)
    var totalViews = 0

    for (views in viewsPerDay) {
        totalViews += views
    }
    println(totalViews)
}