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

        val spaceDecoration = CustomAdapter.HorizontalSpaceItemDecoration(1)
        recyclerView.addItemDecoration(spaceDecoration)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "반갑습니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))



        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

    }

}

//{
//    override fun canScrollHorizontally(): Boolean {
//        return false
//    }
//}
