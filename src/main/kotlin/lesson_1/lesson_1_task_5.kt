package lesson_1

fun main(){
    val seconds = 6480
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    val secondsRemain = seconds % 60

    val hoursNew = String.format("%02d", hours)
    val minutesNew = String.format("%02d",minutes)
    val secondsRemainNew = String.format("%02d",secondsRemain)

    print(hoursNew)
    print(':')
    print(minutesNew)
    print(':')
    print(secondsRemainNew)
}