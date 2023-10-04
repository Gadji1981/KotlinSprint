package lesson_11

class User(
    val avatar: String,
    val userName: String,
    val status: String,
)

class Rooms(
    val coverImage: String,
    val roomTitle: String,
    val participants: List<User>,
)

fun main() {
    val roomOne = Rooms(
        "Обложка 1.jpg", "Название комнаты 1", listOf(
            User("Аваторка 1.jpg", "Пользователь 1", "Разговаривает"),
            User("Аваторка 2.jpg", "Пользователь 2", "Микрофон выключен"),
            User("Аваторка 3.jpg", "Пользователь 3", "Пользователь заглушен")
        )
    )

    val roomTwo = Rooms(
        "Обложка 2.jpg", "Название комнаты 2", listOf(
            User("Аваторка А.jpg", "Пользователь А", "Микрофон выключен"),
            User("Аваторка Б.jpg", "Пользователь Б", "Пользователь заглушен"),
            User("Аваторка В.jpg", "Пользователь В", "Разговаривает")
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
            println("${participant.avatar}, ${participant.userName}, ${participant.status}")
        }
    }
}