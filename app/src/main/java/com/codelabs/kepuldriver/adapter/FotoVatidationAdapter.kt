package com.codelabs.kepuldriver.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codelabs.kepuldriver.databinding.ItemFotoOrderBinding
import com.codelabs.kepuldriver.databinding.ItemTypeValidationBinding

class FotoVatidationAdapter (val data : List<String>) : RecyclerView.Adapter<FotoVatidationAdapter.ViewHolder>() {
    var onClick : ((String) -> Unit?)? = null
    inner class ViewHolder(val binding: ItemFotoOrderBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onClick?.invoke(data[adapterPosition])
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFotoOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.binding = data[position]

    }

    override fun getItemCount(): Int {
        return data.size
    }
}