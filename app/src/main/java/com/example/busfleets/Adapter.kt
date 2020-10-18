package com.example.busfleets

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(val mCtx: Context, val resources: Int, val items: ArrayList<Model>):ArrayAdapter<Model>(mCtx, resources, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater = LayoutInflater.from(mCtx)
        val view: View = layoutInflater.inflate(resources, null)

        val day: TextView = view.findViewById(R.id.today)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        val name: TextView = view.findViewById(R.id.textViewName)
        val data: TextView = view.findViewById(R.id.data)
        val clock: TextView = view.findViewById(R.id.clock)
        val data1: TextView = view.findViewById(R.id.data1)
        val clock1: TextView = view.findViewById(R.id.clock1)
        val marka: TextView = view.findViewById(R.id.marka)
        val nomer: TextView = view.findViewById(R.id.nomer)
        val count: TextView = view.findViewById(R.id.count)


        var mItem: Model = items[position]
        day.text = mItem.day
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem?.img!!))
        name.text = mItem.name
        data.text = mItem.data
        clock.text = mItem.clock
        data1.text = mItem.data1
        clock1.text = mItem.clock1
        marka.text = mItem.marka
        nomer.text = mItem.nomer
        count.text = mItem.count.toString()


        return view
    }
//    override fun getItem(position: Int): Model? {
//        return items?.get(position)
//    }
//    override fun notifyDataSetChanged() {
//        super.notifyDataSetChanged()
//    }
}