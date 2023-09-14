package lesson_1

fun main(){
    val seconds = 6480
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secondsRemain = seconds % 60

    println(String.format("%02d:%02d:%02d", hours, minutes, secondsRemain))
}