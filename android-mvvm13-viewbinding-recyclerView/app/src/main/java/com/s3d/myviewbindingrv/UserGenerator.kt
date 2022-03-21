package com.s3d.myviewbindingrv

object UserGenerator {
    fun getUsers():List<User> {
        val user1 = User("John1" , "john1@gmail.com")
        val user2 = User("John2" , "john2@gmail.com")
        val user3 = User("John3" , "john3@gmail.com")
        val user4 = User("John4" , "john4@gmail.com")

        return arrayListOf(user1,user2,user3,user4)
    }
}