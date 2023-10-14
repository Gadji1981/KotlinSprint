package lesson_13

class PhoneBook2(
    val name: String,
    val phoneNum: Long,
    val company: String? = null,
)

fun main() {
    val phoneBook = listOf(
        PhoneBook2("Vasya", 1234567),
        PhoneBook2("Fedya", 7654321),
        PhoneBook2("Bob", 11223344, "null"),
        PhoneBook2("Kuzya", 44332211, "MMM"),
        PhoneBook2("John", 9876123, "Google")
    )

    val uniqueCompanies = phoneBook
        .filter { it.company != null }
        .mapNotNull { it.company }

    for (companies in uniqueCompanies) println(companies)
}