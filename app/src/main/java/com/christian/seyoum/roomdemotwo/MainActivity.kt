package com.christian.seyoum.roomdemotwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), IControl {

    override fun add(user: User) {
        userTemp.add(user)
    }

    override fun getCount(): Int {
        return userTemp.size()
    }



    override fun getUsers(): MutableList<User> {
        return userTemp.users()
    }

    override lateinit var userTemp:IRepo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle_fram.layoutManager = LinearLayoutManager(this)
        recycle_fram.adapter = MainAdapter(this)

        userTemp = Repo(this)

    }
}
