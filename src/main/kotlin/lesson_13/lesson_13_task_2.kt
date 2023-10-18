package lesson_13

class PhoneBook1(
    val name: String,
    val phoneNum: Long,
    val company: String? = null,
)

fun main() {
    val phoneBook = PhoneBook1("Ростислав", 89123456789, )

    println("-Имя: ${phoneBook.name} \n-Номер: ${phoneBook.phoneNum} \n-Компания: ${phoneBook.company ?: "<не указано>"}")
}