package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = object : LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false) {
            override fun canScrollHorizontally(): Boolean {
                return false
            }
        }

        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.blue, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.blue, "반갑습니다"))
        data.add(ItemsViewModel(R.drawable.blue, "환영합니다"))



        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

    }

}