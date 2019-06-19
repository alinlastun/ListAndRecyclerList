package com.example.listandrecyclerview.listView

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_view.*


class ListViewHolderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.listandrecyclerview.R.layout.activity_list_view)

        val numberOfItems = 1000
        val ObjectItemData = arrayOfNulls<ObjectItem>(numberOfItems)
        for (x in 0 until numberOfItems) {

            val sampleId = 90 + x
            ObjectItemData[x] = ObjectItem(sampleId, "Store # " + (x + 1))

        }

        nListView.adapter = ListViewHolderAdapter(ObjectItemData)
    }

}
