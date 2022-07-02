package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalAdapter(
    var context: Context,
    var animalNames: ArrayList<String>,
    var imageList: ArrayList<Int>
) : BaseAdapter() {


    override fun getCount(): Int {
       return animalNames.size
    }

    override fun getItem(position: Int): Any?{
      return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent!!.context).inflate(R.layout.custon_layout, parent, false)

        var animalName : TextView = view.findViewById(R.id.textView)
        var animalImage : ImageView = view.findViewById(R.id.imageView)

        animalName.text = animalNames[position]
        animalImage.setImageResource(imageList.get(position))

        return view

    }
}