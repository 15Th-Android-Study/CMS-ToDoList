package com.example.todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.todo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var adapter: adapter
    private lateinit var binding : ActivityMainBinding

    val datas = mutableListOf<ToDoListData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecycler()
        binding.addbutton.setOnClickListener(){
            startActivity(Intent(this,AddActivity::class.java))
        }
    }
    private fun initRecycler() {
        adapter = adapter(this)
        binding.recyclerView.adapter = adapter

            adapter.datas = datas.apply {
                add(ToDoListData(todolist = "스터디 준비 하기", date = "2023-05-02"))
                add(ToDoListData(todolist = "과제 살려줘..", date = "2023-05-02"))
                add(ToDoListData(todolist = "이제만들어보자", date = "2023-05-02"))
            adapter.notifyDataSetChanged()

        }
    }
}