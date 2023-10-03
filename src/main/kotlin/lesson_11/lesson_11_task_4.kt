package lesson_11

class Contact(
    val contactIcon: String,
    val contactFirstName: String,
    val contactSecondName: String,
    val contactEmail: String,
    val phoneNumbers: List<PhoneNumbers>,
    val relatedPeople: List<RelatedPeople>,
)

class CommunicationServices(
    val smsButtonIcon: String,
    val smsButtonTitle: String,
    val callButtonIcon: String,
    val callButtonTitle: String,
    val videoCallButtonIcon: String,
    val videoCallButtonTitle: String,
    val emailButtonIcon: String,
    val emailButtonTitle: String,
)

class PhoneNumbers(
    val phoneType: String,
    val phoneNuber: String,
)

class RelatedPeople(
    val relatedPeoplesContacts: String,
)

fun main() {
    val contactData = Contact(
        "Фото.jpg",
        "Василий",
        "Пупкин",
        "example@example.com",
        listOf(PhoneNumbers("Мобильный", "+1234567890"),
            PhoneNumbers("Домашний", "+749912345678")
        ),
        listOf(RelatedPeople("Жена"),
            RelatedPeople("Подруга"),
            RelatedPeople("Друг")),
    )

    val communication = CommunicationServices(
        "ИКОНКА_СМС.jpg", "Написать",
        "ИКОНКА_ТЕЛЕФОН.jpg", "Вызов",
        "ИКОНКА_ВИДЕО.jpg", "Видео",
        "ИКОНКА_КОНВЕРТ.jpg", "Почта"
    )


    println(
        """
        |Фото контакта: ${contactData.contactIcon}
        |Имя: ${contactData.contactFirstName}
        |Фамилия: ${contactData.contactSecondName}
        |
        |${communication.smsButtonIcon}, ${communication.smsButtonTitle}
        |${communication.callButtonIcon}, ${communication.callButtonTitle}
        |${communication.videoCallButtonIcon}, ${communication.videoCallButtonTitle}
        |${communication.emailButtonIcon}, ${communication.emailButtonTitle}
        |
        |${contactData.contactEmail}
    """.trimMargin()
    )

    for (phoneNumber in contactData.phoneNumbers)
        println("${phoneNumber.phoneType},${phoneNumber.phoneNuber}")

    for (people in contactData.relatedPeople)
        println("Связанный контакт: ${people.relatedPeoplesContacts}")
}