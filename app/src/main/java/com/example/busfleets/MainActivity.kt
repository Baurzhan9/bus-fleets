package com.example.busfleets

import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var delete = findViewById<Button>(R.id.Delete)
        var listview = findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()
        list.add(Model("Сегодня", R.drawable.q,"АсыкАта-Алматы",  "Дата - 06.02.2020 Thu", "Время - 18:39", "Дата - 07.02.2020 Fri",
            "Время - 06:10", "YUTONG", "KZ 888 KN 02", 32))
        list.add(Model("Завтра", R.drawable.w,"Шымкент-Сарыагаш",  "Дата - 07.02.2020 Thu", "Время - 19:00", "Дата - 08.02.2020 Fri",
            "Время - 24:00", "YUTONG", "KZ 156 QW 05", 34))
        list.add(Model("После завтра", R.drawable.e,"Сарыагаш-Караганда",  "Дата - 08.02.2020 Thu", "Время - 20:50", "Дата - 09.02.2020 Fri",
            "Время - 10:55", "YUTONG", "KZ 498 EW 06", 30))

        listview.adapter = Adapter(this, R.layout.record, list)





    }




}