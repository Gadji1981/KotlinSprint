package lesson_13

class PhoneBook4(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    try {
        println("Введите номер телефона:")
        val phoneNumber = readln().toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка ввода номера телефона")
    }
}