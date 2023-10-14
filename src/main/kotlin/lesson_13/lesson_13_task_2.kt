package lesson_13

class PhoneBook(
    val name: String,
    val phoneNum: Long,
    val company: String? = null ?: "<не указано>",
)

fun main() {
    val phoneBook = PhoneBook("Ростислав", 89123456789)

    println("-Имя: ${phoneBook.name} \n-Номер: ${phoneBook.phoneNum} \n-Компания: ${phoneBook.company}")
}