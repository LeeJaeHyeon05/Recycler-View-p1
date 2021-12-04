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

        //아이템 간 간격 늘려주기
        val spaceDecoration = CustomAdapter.HorizontalSpaceItemDecoration(2)
        recyclerView.addItemDecoration(spaceDecoration)


        //위 아래 간격 늘리기
        val spaceDecoration2 = CustomAdapter.TopSpaceItemDecoration(-190)
        recyclerView.addItemDecoration(spaceDecoration2)


        //그리드 레이아웃, 갯수 설정
        val myLayoutManager = object : GridLayoutManager(this, 5) {override fun canScrollHorizontally(): Boolean {
            return false
            }
        }
        recyclerView.layoutManager = myLayoutManager

        val data = ArrayList<ItemsViewModel>()

        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "반갑습니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "안녕하세요"))
        data.add(ItemsViewModel(R.drawable.ic_launcher_background, "환영합니다"))


        val adapter = CustomAdapter(data)
        recyclerView.adapter = adapter

    }
}

//{

//}


