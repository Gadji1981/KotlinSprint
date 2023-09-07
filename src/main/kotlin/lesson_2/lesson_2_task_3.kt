package lesson_2
/*Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути,
а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

– Создай целочисленные переменные и проинициализируй их этими данными;
– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
– Выведи результат в консоль.*/
fun main() {
    val depHour = 9
    val depMinute = 39
    val tripTime = 457
    val depInMinutes = depHour * 60 + depMinute
    val arrivTimeInMin = depInMinutes + tripTime
    val arrivHour = arrivTimeInMin / 60
    val arrivMinute = arrivTimeInMin % 60
    val arrivHourFormated = String.format("%02d",arrivHour)
    val arrivMinuteFormated = String.format("%02d", arrivMinute)

    print("Поезд прибудет в: $arrivHourFormated:$arrivMinuteFormated")


}