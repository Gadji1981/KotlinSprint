package lesson_13

class PhoneBook4(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val phoneBook = mutableListOf<PhoneBook4>()

    while (true) {
        println("Введите имя (или 'стоп' для завершения):")
        val name = readln()

        if (name.equals("стоп", ignoreCase = true)) break

        println("Введите номер телефона:")
        val phoneNumber = readln().toLong()

        if (phoneNumber == null) {
            println("Неверный формат номера. Запись не будет добавлена.")
            continue
        }

        println("Введите компанию (или нажмите Enter для пропуска):")
        val company = readLine()

        if (company == "") phoneBook.add(PhoneBook4(name = name, phoneNumber = phoneNumber, company = null))
        else phoneBook.add(PhoneBook4(name = name, phoneNumber = phoneNumber, company = company))


    }

    for (contacts in phoneBook) {
        println("""
            |Имя: ${contacts.name}
            |Номер: ${contacts.phoneNumber}
            |Компания: ${contacts.company ?: "<не указано>"}
            |
        """.trimMargin())
    }
}