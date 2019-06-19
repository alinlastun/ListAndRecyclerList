package com.example.listandrecyclerview.listView

import android.content.Context
import android.database.DataSetObserver
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.listandrecyclerview.R


class ListViewAdapter(var myData: Array<ObjectItem?>,var context: Context) : ListAdapter {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var view = convertView
        var textViewItem: TextView? = null
        var image: ImageView? = null

        val objectItem = myData[position]
        if (view == null) {
            Log.d("listviewholder","the view is null")

            val inflater = LayoutInflater.from(parent?.context)
            view = inflater.inflate(R.layout.row_list, parent, false)
            Log.d("listviewholder","inflate view")
            textViewItem = view?.findViewById(R.id.textViewItem) as TextView
             image = view.findViewById(R.id.myImage) as ImageView
            Log.d("listviewholder","initialize textViewItem with ${textViewItem}")
            Toast.makeText(parent?.context,"The view is null\nInflate my view\n Call findViewById()",Toast.LENGTH_LONG).show()
            textViewItem.text = objectItem?.itemName
            image.setImageResource(R.mipmap.my_image)

        }else{
            Toast.makeText(parent?.context,"Reuse my view from position: ${position} \n Call findViewById()",Toast.LENGTH_LONG).show()
            Log.d("listviewholder","the view is Not null")
            Log.d("listviewholder","textViewItem referice: ${textViewItem}")
        }
       // val textViewItem = view?.findViewById(R.id.textViewItem) as TextView
       // val image = view.findViewById(R.id.myImage) as ImageView



        return view
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