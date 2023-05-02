package com.example.todo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapter(private val context: Context) : RecyclerView.Adapter<adapter.ViewHolder>() {

    var datas = mutableListOf<ToDoListData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtTodolist: TextView = itemView.findViewById(R.id.toDoList)
        private val txtDate: TextView = itemView.findViewById(R.id.date)

        fun bind(item: ToDoListData) {
            txtTodolist.text = item.todolist
            txtDate.text = item.date
        }
    }
}