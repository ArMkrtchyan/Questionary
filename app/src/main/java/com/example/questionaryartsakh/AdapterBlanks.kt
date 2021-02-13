package com.example.questionaryartsakh

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.questionaryartsakh.databinding.AdapterBlankItemBinding

class AdapterBlanks(val fEdit: (Blank) -> Unit, val fSend: (Blank) -> Unit, val fDelete: (Blank) -> Unit, val fShow: (Blank) -> Unit) :
    RecyclerView.Adapter<AdapterBlanks.BlankViewHolder>() {

    val data = arrayListOf<Blank>()

    class BlankViewHolder(val mBinding: AdapterBlankItemBinding) : RecyclerView.ViewHolder(mBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlankViewHolder {
        return BlankViewHolder(AdapterBlankItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: BlankViewHolder, position: Int) {
        holder.setIsRecyclable(false)
        holder.mBinding.apply {
            blank = data[position]
            root.setOnClickListener { fShow.invoke(data[position]) }
            send.setOnClickListener { fSend.invoke(data[position]) }
            edit.setOnClickListener { fEdit.invoke(data[position]) }
            delete.setOnClickListener { fDelete.invoke(data[position]) }
        }

    }

    override fun getItemCount(): Int = data.size

    fun submitList(list: List<Blank>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
}