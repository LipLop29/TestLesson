package com.example.testlesson.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testlesson.databinding.ItemFilmsBinding
import com.example.testlesson.presentation.models.ResponseFilmsUI

class FilmsAdapter(
    val onItemClick: (id: String) -> Unit
) : ListAdapter<ResponseFilmsUI, FilmsAdapter.FilmsViewHolder>(
    diffUtil
) {

    inner class FilmsViewHolder(private val binding: ItemFilmsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                getItem(absoluteAdapterPosition)?.let { it1 -> onItemClick(it1.id) }
            }
        }

        fun onBind(response: ResponseFilmsUI) {
            binding.tvName.text = response.title
            binding.tvNameOrig.text = response.originalTitle
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmsViewHolder {
        return FilmsViewHolder(
            ItemFilmsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FilmsViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ResponseFilmsUI>() {
            override fun areItemsTheSame(oldItem: ResponseFilmsUI, newItem: ResponseFilmsUI): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: ResponseFilmsUI, newItem: ResponseFilmsUI): Boolean {
                return oldItem == newItem
            }
        }
    }
}