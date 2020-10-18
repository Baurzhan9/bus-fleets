package com.example.busfleets.activity


import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.busfleets.R
import com.example.busfleets.adapter.PassengerAdapter
import com.example.busfleets.model.PassModel
import kotlinx.android.synthetic.main.place.*
import kotlinx.android.synthetic.main.popup.*

class Passengers: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.place)

        //init
        val back = findViewById<TextView>(R.id.back)
        val items = ArrayList<PassModel>()
        val reserved = ArrayList<PassModel>()
        val free = ArrayList<PassModel>()

        //set data
        items.add(PassModel("Arailym", "0A верхний", "Offline", "87770001122", "3000"))
        items.add(PassModel("Aigerym", "0B верхний", "Offline", "87025006050", "2500"))
        items.add(PassModel("Temirlan", "1 нижний", "Online", "87756541232", "2500"))
        items.add(PassModel("Arlan", "1 нижний", "Online", "87002365478", "3000"))
        items.add(PassModel("","0A нижний","", "", ""))
        items.add(PassModel("","0B нижний","","", ""))
        items.add(PassModel("","2 нижний","", "", ""))
        items.add(PassModel("","2 нижний","", "", ""))

        //Filtered blank place and show in listview dividing
        var i = 0
        for (item in items){
            if(items[i].type != ""){
                reserved.add(PassModel(items[i].name, items[i].place, items[i].type, items[i].number, items[i].price))
                val adapter = PassengerAdapter(this, R.layout.npt, reserved)
                reserve.adapter = adapter
            }
            else{
                free.add(PassModel("НЕТ ИМЕНИ", items[i].place, "NO TYPE", "", "3000"))
                val adapter = PassengerAdapter(this, R.layout.npt, free)
                freePlaces.adapter = adapter
            }
            i++
        }

        //back to Main
        back.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //popup window
        reserve.setOnItemClickListener { adapter, view, i, l ->
            val intent = Intent(this, PopUpWindow::class.java)
            intent.putExtra("id", i)
            intent.putExtra("popupname", reserved[i].name.toString())
            intent.putExtra("popupnumber", reserved[i].number.toString())
            intent.putExtra("popupplace", reserved[i].place.toString())
            intent.putExtra("popupprice", reserved[i].price.toString())
            intent.putExtra("popupbtnchng", "Change")
            intent.putExtra("popupbtnsend", "Send")
            intent.putExtra("popupbtn", "Cancel")
            intent.putExtra("darkstatusbar", false)
            startActivity(intent)
        }

    }
}


