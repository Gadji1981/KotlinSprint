package lesson_13

class PhoneBook3(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val phoneBook = mutableListOf<PhoneBook3>()

    while (true) {
        println("Введите имя (или 'стоп' для завершения):")
        val name = readln()

        if (name.equals("стоп", ignoreCase = true)) break

        println("Введите номер телефона:")
        val phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("Неверный формат номера. Запись не будет добавлена.")
            continue
        }

        println("Введите компанию (или нажмите Enter для пропуска):")
        val company = readLine()

        phoneBook.add(PhoneBook3(name = name, phoneNumber = phoneNumber, company = company))
    }

    for (contacts in phoneBook) {
        println("""
            |Имя: ${contacts.name}
            |Номер: ${contacts.phoneNumber}
            |Компания: ${contacts.company}
            |
        """.trimMargin())
    }
}