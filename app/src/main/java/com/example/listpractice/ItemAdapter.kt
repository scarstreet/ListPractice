package com.example.listpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listpractice.databinding.ItemLayoutBinding

class ItemAdapter(val itemList: List<Item>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(val binding: ItemLayoutBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) {
            binding.itemImage.setImageResource(item.image)
            binding.itemText.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        // To bind it per item
        val item = itemList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}