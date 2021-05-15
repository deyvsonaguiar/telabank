package com.deyvsonaguiar.telabank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItemsLista()
    }

    private fun iniciaViews() {
        //atribuindo valor ao rvList
        rvList = findViewById(R.id.rv_list)
        //inicialização do adapter
        rvList.adapter = adapter
    }

    //criando lista mock de dados para o RecyclerView
    private fun setItemsLista() {
        adapter.setItensList(
                arrayListOf(
                        MenuItemModel("cartões"),
                        MenuItemModel("meus comprovantes"),
                        MenuItemModel("investimentos"),
                        MenuItemModel("portabilidade de salário"),
                        MenuItemModel("cartões"),
                        MenuItemModel("meus comprovantes"),
                        MenuItemModel("investimentos"),
                        MenuItemModel("portabilidade de salário")
                        )
                )
    }
}