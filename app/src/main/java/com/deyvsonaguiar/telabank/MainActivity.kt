package com.deyvsonaguiar.telabank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
    }

    private fun iniciaViews() {
        //atribuindo valor ao rvList
        rvList = findViewById(R.id.rv_list)
    }
}