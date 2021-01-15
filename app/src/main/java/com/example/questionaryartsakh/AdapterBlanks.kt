package com.example.questionaryartsakh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.questionaryartsakh.databinding.AdapterBlankItemBinding

class AdapterBlanks(val function: (Blank) -> Unit) :
    ListAdapter<Blank, AdapterBlanks.BlankViewHolder>(object : DiffUtil.ItemCallback<Blank>() {
        override fun areItemsTheSame(oldItem: Blank, newItem: Blank): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Blank, newItem: Blank): Boolean {
            return oldItem.id == newItem.id
        }

    }) {
    class BlankViewHolder(private val mBinding: AdapterBlankItemBinding) :
        RecyclerView.ViewHolder(mBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlankViewHolder {
        return BlankViewHolder(
            AdapterBlankItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BlankViewHolder, position: Int) {
        holder.itemView.setOnClickListener { function.invoke(getItem(position)) }
    }
}