package lesson_11

class User3(
    val avatar: String,
    val userName: String,
    val status: String,
) {
    fun printStatus() {
        println(status)
    }
}

class Room(
    val coverImage: String,
    val roomTitle: String,
    val participants: List<User3>
)

fun main() {
    val roomOne = Room(
        "Обложка 1.jpg", "Название комнаты 1", listOf(
            User3("Аватарка 1.jpg", "Пользователь 1", "Разговаривает"),
            User3("Аватарка 2.jpg", "Пользователь 2", "Микрофон выключен"),
            User3("Аватарка 3.jpg", "Пользователь 3", "Пользователь заглушен")
        )
    )

    val roomTwo = Room(
        "Обложка 2.jpg", "Название комнаты 2", listOf(
            User3("Аватарка А.jpg", "Пользователь А", "Микрофон выключен"),
            User3("Аватарка Б.jpg", "Пользователь Б", "Пользователь заглушен"),
            User3("Аватарка В.jpg", "Пользователь В", "Разговаривает")
        )
    )

    val chatRooms = listOf(roomOne, roomTwo)
    for (room in chatRooms) {
        println(
            """
            |Название комнаты: ${room.roomTitle}
            |Обложка: ${room.coverImage}
            |""".trimMargin()
        )
        for (participant in room.participants) {
            println("${participant.avatar}, ${participant.userName}")
            participant.printStatus()
        }
    }
}