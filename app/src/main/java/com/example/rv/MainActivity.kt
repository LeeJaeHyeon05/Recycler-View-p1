package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()

        data.apply {
            add(ItemsViewModel(image = R.drawable.ic_launcher_background, text = "안녕"))
            add(ItemsViewModel(image = R.drawable.blue, text = "ㄴ"))
        }

        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter
    }
}