package com.example.busfleets.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.busfleets.R
import com.example.busfleets.adapter.Adapter
import com.example.busfleets.adapter.PassengerAdapter
import com.example.busfleets.model.Model
import com.example.busfleets.model.PassModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.place.*

class Passengers: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place)
        val back = findViewById<TextView>(R.id.back)
        val items = ArrayList<PassModel>()
        val reserved = ArrayList<PassModel>()
        val free = ArrayList<PassModel>()
        items.add(PassModel("Arailym", "0A верхний", "Offline"))
        items.add(PassModel("Aigerym", "0B верхний", "Offline"))
        items.add(PassModel("Temirlan", "1 нижний", "Online"))
        items.add(PassModel("Arlan", "1 нижний", "Online"))
        items.add(PassModel("","0A нижний",""))
        items.add(PassModel("","0B нижний",""))
        items.add(PassModel("","2 нижний",""))
        items.add(PassModel("","2 нижний",""))


        var i = 0
        for (item in items){
            if(items[i].type != ""){
                reserved.add(PassModel(items[i].name, items[i].place, items[i].type))
                val adapter = PassengerAdapter(this, R.layout.npt, reserved)
                reserve.adapter = adapter
            }
            else{
                free.add(PassModel("НЕТ ИМЕНИ", items[i].place, "NO TYPE"))
                val adapter = PassengerAdapter(this, R.layout.npt, free)
                freePlaces.adapter = adapter
            }
            i++
        }


        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
//            intent.putExtra("keyIdentifier", value)
            startActivity(intent)
        }

    }
}


