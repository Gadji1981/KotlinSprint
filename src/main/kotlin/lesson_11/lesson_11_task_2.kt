package lesson_11

fun main() {
    val userOne = User(1, "Vasya", "qwerty", "vasya@mail.ru")
    //val userTwo = User(2, "Bob", "12345", "bob@gmail.com")

    userOne.displayUserInfo()

    userOne.fillBioData()

    userOne.changeUserPassword()

    userOne.displayUserInfo()

    userOne.sendEmail("Доброго времени суток, ${userOne.userName}!")
}