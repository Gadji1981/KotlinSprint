package lesson_11

class User (val id: Int, val userName: String, var password: String, val userEmail: String, var bio: String? = null){
    //var bio = ""

    fun displayUserInfo(){
        println("""
            | Информация о пользователе
            | Id: $id
            | Имя: $userName
            | Пароль: $password
            | Почта: $userEmail
            | О себе: $bio
        """.trimMargin())
    }

    fun fillBioData() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changeUserPassword() {
        println("Введите существующий пароль:")
        val userPasswordInput = readln()

        if (userPasswordInput == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен.")
        } else {
            println("Пароль введен не верно.")
        }
    }

    fun sendEmail(message: String) {
        println("Почта получателя: $userEmail: \n$message")
    }


}