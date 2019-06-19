package com.example.listandrecyclerview.recyclerView

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import com.example.listandrecyclerview.Contact
import com.example.listandrecyclerview.R
import kotlinx.android.synthetic.main.activity_main.*


class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberOfItems = 1000
        val myData:MutableList<Contact> = arrayListOf()

        for (x in 0 until numberOfItems) {

            val contact = Contact( "Name " + (x + 1),x + 1)
             myData.add(contact)
        }

        val mLayoutManager = LinearLayoutManager(applicationContext)
        nRecyclerView.layoutManager = mLayoutManager
        nRecyclerView.itemAnimator = DefaultItemAnimator()
        nRecyclerView.adapter = RecyclerViewAdapter(myData)
    }
}
