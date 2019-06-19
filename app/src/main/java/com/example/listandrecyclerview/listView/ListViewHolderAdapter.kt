package com.example.listandrecyclerview.listView

import android.database.DataSetObserver
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.listandrecyclerview.R


class ListViewHolderAdapter(var myData: Array<ObjectItem?>) : Adapter, ListAdapter {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        Log.d("afewfawef","getView")
        var view = convertView
        var myViewHolder = MyViewHolderItem()
        val objectItem = myData[position]

        if (view == null) {

            val inflater = LayoutInflater.from(parent?.context)
            view = inflater.inflate(R.layout.row_list, parent, false)

            myViewHolder.textView= view?.findViewById(R.id.textViewItem)!!
            myViewHolder.myImage = view.findViewById(R.id.myImage)
            Log.d("afewfawef","the view is null \nWe will inflate the view\nThe holder reference is: ${myViewHolder}")
            view.tag = myViewHolder
        } else {
            myViewHolder = view.tag as MyViewHolderItem
            Log.d("afewfawef","the view is NOT null \nThe holder reference is: ${myViewHolder}")
        }

        if(objectItem != null) {
            myViewHolder.textView.text = objectItem.itemName
            myViewHolder.myImage.setImageResource(R.mipmap.my_image)
        }

        return view
    }


    class MyViewHolderItem  {
        lateinit var textView: TextView
        lateinit var myImage: ImageView
    }





































    override fun isEmpty(): Boolean {
        return true
    }

    override fun registerDataSetObserver(observer: DataSetObserver?) {
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getViewTypeCount(): Int {
        return myData.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun unregisterDataSetObserver(observer: DataSetObserver?) {
    }

    override fun getCount(): Int {
        return myData.size
    }

    override fun isEnabled(position: Int): Boolean {
        return true
    }

    override fun areAllItemsEnabled(): Boolean {
        return true
    }




}