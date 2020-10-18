package com.example.busfleets

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.AdapterView.OnItemClickListener
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<Model>()

        items.add(Model("Сегодня", R.drawable.q,"АсыкАта-Алматы",  "Дата - 06.02.2020 Thu", "Время - 18:39", "Дата - 07.02.2020 Fri",
            "Время - 06:10", "YUTONG", "KZ 888 KN 02", 32))
        items.add(Model("Завтра", R.drawable.w,"Шымкент-Сарыагаш",  "Дата - 07.02.2020 Thu", "Время - 19:00", "Дата - 08.02.2020 Fri",
            "Время - 24:00", "YUTONG", "KZ 156 QW 05", 34))
        items.add(Model("После завтра", R.drawable.e,"Сарыагаш-Караганда",  "Дата - 08.02.2020 Thu", "Время - 20:50", "Дата - 09.02.2020 Fri",
            "Время - 10:55", "YUTONG", "KZ 498 EW 06", 30))

        val adapter = Adapter(this, R.layout.record, items)
        listView.adapter = adapter


        listView.setOnItemClickListener { adapter, view, i, l ->
            Toast.makeText(this,"clicked ${items[i]}",Toast.LENGTH_SHORT).show()
            items.removeAt(i);
            val adapter = Adapter(this, R.layout.record, items)
            listView.adapter = adapter
//            val intent = Intent(this, MainActivity::class.java)
//        // To pass any data to next activity
////            intent.putExtra("keyIdentifier", value)
//        // start your next activity
//            startActivity(intent)
        }
    }






}