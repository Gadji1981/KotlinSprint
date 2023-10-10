package lesson_11

class User1(
    val id: Int,
    val userName: String,
    val password: String,
    val userEmail: String
)

fun main() {
    val userOne = User1(1, "Vasya", "qwerty", "vasya@mail.ru")
    val userTwo = User1(2, "Bob", "12345", "bob@gmail.com")

    println(
        """
        | Пользователь №1
        | Id ${userOne.id}
        | Имя ${userOne.userName}
        | Пароль ${userOne.password}
        | Почта ${userOne.userEmail}
    """.trimMargin()
    )

    println(
        """
        | Пользователь №2
        | Id ${userTwo.id}
        | Имя ${userTwo.userName}
        | Пароль ${userTwo.password}
        | Почта ${userTwo.userEmail}
    """.trimMargin()
    )
}