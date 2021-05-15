package com.deyvsonaguiar.telabank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuItemAdapter: RecyclerView.Adapter<MenuItemAdapter.MenuItemAdapterViewHolder>() {

    //criando uma lista de itens - variável privada do tipo MutableListOf que recebe os
    //dados de uma Model
    private val list = mutableListOf<MenuItemModel>()

    //método que inicializa novo ViewHolder e a Vieew, sem preencher o conteúdo, pois n tem dados ainda
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuItemAdapterViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_menu, parent, false)
        return MenuItemAdapterViewHolder(view)
    }

    //método interno que associa uma viewHolder aos dados, preenchendo o layout do fixador de visualizações
    override fun onBindViewHolder(holder: MenuItemAdapterViewHolder, position: Int) {
        holder.iniciaViews(list[position])
    }

    //método interno do Adapter para saber a quantidade de itens - tratamento e reciclagem
    override fun getItemCount(): Int {
        return list.size
    }

    //método para ao chamar a lista de forma dinâmica, limpá-la e atualizar as novidades e não duplique ou adicione itens a mais
    fun setItensList(list: List<MenuItemModel>) {
        this.list.clear()
        this.list.addAll(list)
    }

    class MenuItemAdapterViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        fun iniciaViews(item: MenuItemModel) {

        }
    }
}