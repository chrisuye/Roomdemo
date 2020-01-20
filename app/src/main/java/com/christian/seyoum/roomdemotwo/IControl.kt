package com.christian.seyoum.roomdemotwo

interface IControl {

    fun add(user: User)
    fun getUsers():MutableList<User>
    fun getCount():Int

    val userTemp:IRepo

}