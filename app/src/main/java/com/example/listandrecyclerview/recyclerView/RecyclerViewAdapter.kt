package com.example.listandrecyclerview.recyclerView

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.listandrecyclerview.Contact
import com.example.listandrecyclerview.R

class RecyclerViewAdapter(var mData: MutableList<Contact>) : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.row_list,parent,false)
      //  Log.d("afewfawef","the view is null \nWe will inflate the view\nThe view reference is: ${view}")
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        Log.d("afewfawef","onBindViewHolder: ${holder}")
        holder.textView.text = mData[position].contactName
        holder.myImage.setImageResource(R.mipmap.my_image)
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {

        var textView: TextView = view.findViewById(R.id.textViewItem)
        var myImage: ImageView = view.findViewById(R.id.myImage)



    }

    }
