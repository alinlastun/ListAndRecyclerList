package com.example.listandrecyclerview

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import com.example.listandrecyclerview.listView.ListViewActivity
import com.example.listandrecyclerview.listView.ListViewHolderActivity
import com.example.listandrecyclerview.recyclerView.RecyclerViewActivity

import kotlinx.android.synthetic.main.activity_my_main_activiy.*

class MyMainActiviy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_main_activiy)

        nBtnListView.setOnClickListener {
            startActivity(Intent(this,ListViewActivity::class.java))
        }

        nBtnListViewHolder.setOnClickListener {
            startActivity(Intent(this, ListViewHolderActivity::class.java))
        }

        nBtnRecycleView.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }

    }

}
