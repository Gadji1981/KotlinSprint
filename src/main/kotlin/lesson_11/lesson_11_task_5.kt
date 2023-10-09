package lesson_11


class User(val id: Int, val userName: String)

class Message(val id: Int, val user: String, val message: String)

class Forum {
    val users = mutableListOf<User>()
    val messages = mutableListOf<Message>()
    var userId = 1
    var messageId = 1

    fun createNewUser(name: String): User {
        val newUser = User(userId++, name)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(userId: Int, message: String): Message {
        val user = users.find { it.id == userId }
        val newMessage = Message(messageId++, user?.userName ?: "", message)
        messages.add(newMessage)
        return newMessage
    }

    fun printThread() {
        for (message in messages) {
            println("${message.user}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Vasya")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.id, "Hi everyone!")
    forum.createNewMessage(user2.id, "Hi, ${user1.userName}")
    forum.createNewMessage(user1.id, "How are you doing, ${user2.userName}?")
    forum.createNewMessage(user2.id, "Well... can't complain...:)")

    forum.printThread()
}