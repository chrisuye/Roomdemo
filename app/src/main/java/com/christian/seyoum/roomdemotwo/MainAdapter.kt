package com.christian.seyoum.roomdemotwo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.names.view.*

class MainAdapter (val control:IControl): RecyclerView.Adapter<CustomViewHolder>(){
    override fun getItemCount(): Int {
        return control.getCount()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context).inflate(R.layout.names, parent, false)
        val viewHolder = CustomViewHolder(layoutInflater)

        return viewHolder
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val user = control.getUsers()[position]

        holder.BindUser(user)
    }

}

class CustomViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun BindUser(user: User?){

        itemView.first_view.text = user?.firstName
        itemView.last_view.text = user?.lastName

    }

}