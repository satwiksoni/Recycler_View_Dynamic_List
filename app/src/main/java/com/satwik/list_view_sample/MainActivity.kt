package com.satwik.list_view_sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_item.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val games=Games.gen_games(100)
        val gameAdaptor=GameAdaptor(games)
        rv1.layoutManager=LinearLayoutManager(this)
        rv1.adapter=gameAdaptor

    }
}