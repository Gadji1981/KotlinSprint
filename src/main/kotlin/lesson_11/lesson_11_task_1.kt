package lesson_11

fun main() {
    val userOne = User(1, "Vasya", "qwerty", "vasya@mail.ru")
    val userTwo = User(2, "Bob", "12345", "bob@gmail.com")

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