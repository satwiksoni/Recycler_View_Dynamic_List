package com.satwik.list_view_sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*
import java.util.ArrayList

class GameAdaptor( var list:ArrayList<Games>): RecyclerView.Adapter<GameAdaptor.GameViewholder>() {
    class GameViewholder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewholder {
        val itemView=LayoutInflater.from(parent.context).inflate(
            R.layout.list_item,parent,false
        )
        return  GameViewholder(itemView)
    }

    override fun onBindViewHolder(holder: GameViewholder, position: Int) {
        holder.itemView.tv1.text=list[position].game
        holder.itemView.tv2.text=list[position].origine
        holder.itemView.tv3.text= list[position].price.toString()
    }

    override fun getItemCount(): Int = list.size

}