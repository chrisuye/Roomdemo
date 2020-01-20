package com.christian.seyoum.roomdemotwo

interface IRepo {

    fun size():Int
    fun users():MutableList<User>
    fun add(user: User)
}