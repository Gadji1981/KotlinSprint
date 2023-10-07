package lesson_11

class User(val id: Int, val userName: String)

class Message(val id: Int, val user: User, val message: String)

class Forum{
    val users = mutableListOf<User>()
    val message = mutableListOf<Message>()
    var userId = 1
    var messageId = 1

    fun createNewUser(userName: String): User {
        val newUser = User(userId++, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage() { // Stuck on this function, have no idea how to write code for the message function

    }

    fun printThread() { //temp fun... I will rewright it as soon as solve the previous problem
        for (user in users)
        println("User ${user.id}: Username: ${user.userName}")
    }

}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Vasya")
    val user2 = forum.createNewUser("Bob")

    forum.printThread()
}