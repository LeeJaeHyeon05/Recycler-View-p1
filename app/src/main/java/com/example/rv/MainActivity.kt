package com.example.rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.NonNull
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Context
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        //간격 늘리기 주기
        val spaceDecoration = CustomAdapter.HorizontalSpaceItemDecoration(2)
        recyclerView.addItemDecoration(spaceDecoration)

        //그리드 레이아웃
        val myLayoutManager = GridLayoutManager(this, 5)
        recyclerView.layoutManager = myLayoutManager


        val data = ArrayList<ItemsViewModel>()

        //여기서 아이템 추가
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "반갑습니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))




        val adapter = CustomAdapter(data)

        recyclerView.adapter = adapter

    }

}

//{
//    override fun canScrollHorizontally(): Boolean {
//        return false
//    }
//}


