package com.christian.seyoum.roomdemotwo

import android.content.Context
import androidx.room.Room

class Repo(context: Context):IRepo{

    private var temp: MutableList<User> = mutableListOf()
    val db = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).allowMainThreadQueries()
        .build()

    init {
        temp = db.userDao().getAll()
    }

    override fun add(user: User) {
        db.userDao().insertAll(user)
    }

    override fun size(): Int {
        return temp.size
    }

    override fun users(): MutableList<User> {
        return temp
    }
}