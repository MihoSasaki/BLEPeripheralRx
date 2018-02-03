package com.example.sasakimiho.bleperipheralrx

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.ble_list_item.view.*

class BleListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    companion object {
        private val LAYOUT_ID = R.layout.ble_list_item
        fun create(inflater: LayoutInflater, parent: ViewGroup): BleListItemViewHolder =
                BleListItemViewHolder(inflater.inflate(LAYOUT_ID, parent, false))
    }

    val titleText: TextView by lazy {
        itemView.ble_item_title
    }

    fun bind(item: BleItem) {

    }
}

