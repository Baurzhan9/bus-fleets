package com.example.busfleets.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.busfleets.R
import com.example.busfleets.model.PassModel

class PassengerAdapter(val mCtx: Context, val resources: Int, val items: ArrayList<PassModel>):
    ArrayAdapter<PassModel>(mCtx, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)

        val name: TextView = view.findViewById(R.id.name)
        val place: TextView = view.findViewById(R.id.place)
        val type: TextView = view.findViewById(R.id.type)

        var mItem: PassModel = items[position]

        name.text = mItem.name
        place.text = mItem.place
        type.text = mItem.type

        return view
    }
}