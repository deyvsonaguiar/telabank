package com.deyvsonaguiar.telabank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter: RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>() {

    //criando uma lista de itens - variável privada do tipo MutableListOf que recebe os
    //dados de uma Model
    private val list = mutableListOf<MenuItemModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_main, parent, false)
        return MenuItemAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])
    }

    //método interno do Adapter para saber a quantidade de itens - tratamento e reciclagem
    override fun getItemCount(): Int {
        return list.size
    }

    class MenuItemAdapterViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        fun iniciaViews(item: MenuItemModel) {

        }
    }
}