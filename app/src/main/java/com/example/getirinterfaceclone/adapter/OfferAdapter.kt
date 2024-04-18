package com.example.getirinterfaceclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirinterfaceclone.data.entity.Offer
import com.example.getirinterfaceclone.databinding.OfferItemBinding

class OfferAdapter(var context: Context, var campaigns : List<Offer>)
    : RecyclerView.Adapter<OfferAdapter.ItemViewHolder>(){

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var binding: OfferItemBinding = OfferItemBinding.bind(itemView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = OfferItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding.root)
    }
    override fun onBindViewHolder(holder: OfferAdapter.ItemViewHolder, position: Int) {
        val offer = campaigns[position]
        holder.binding.imageViewOffer.setImageResource(context.resources.getIdentifier(offer.offer_image, "drawable", context.packageName))
    }

    override fun getItemCount(): Int {
        return campaigns.size
    }
}