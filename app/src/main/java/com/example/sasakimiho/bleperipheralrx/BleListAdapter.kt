package com.example.sasakimiho.bleperipheralrx

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class BleListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val item = mutableListOf<BleItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            BleListItemViewHolder.create(LayoutInflater.from(parent.context), parent)

    override fun getItemCount(): Int =
            item.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder is BleListItemViewHolder) {
            holder.bind(item[position])
        }
    }
}

