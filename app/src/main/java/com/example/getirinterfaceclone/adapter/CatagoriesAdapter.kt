package com.example.getirinterfaceclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirinterfaceclone.data.entity.Catagories
import com.example.getirinterfaceclone.databinding.CatagoriesItemBinding

class CatagoriesAdapter(var context: Context, var catagories: List<Catagories>)
    : RecyclerView.Adapter<CatagoriesAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: CatagoriesItemBinding = CatagoriesItemBinding.bind(itemView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CatagoriesItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val catagories = catagories[position]
        holder.binding.imageView.setImageResource(context.resources.getIdentifier(catagories.catagory_image, "drawable", context.packageName))
        holder.binding.textViewFiyat.text = catagories.catagory_name
    }


    override fun getItemCount(): Int {
        return catagories.size
    }
}