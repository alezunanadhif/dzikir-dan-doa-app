package com.nadhif.doadzikirapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadhif.doadzikirapp.databinding.FragmentArtikelBinding
import com.nadhif.doadzikirapp.model.ArtikelModel
import com.nadhif.doadzikirapp.ui.detail.DetailArtikelActivity

class ArtikelAdapter(private val listArtikel: ArrayList<ArtikelModel>) :
	RecyclerView.Adapter<ArtikelAdapter.MyViewHolder>() {
	class MyViewHolder(val binding: FragmentArtikelBinding) :
		RecyclerView.ViewHolder(binding.root) {

	}

	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
		val binding = FragmentArtikelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
		return MyViewHolder(binding)
	}

	override fun getItemCount(): Int = listArtikel.size

	override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
		val data = listArtikel[position]

		Glide.with(holder.itemView.context)
			.load(data.imageArtikel)
			.into(holder.binding.imgFragment)

		holder.binding.imgFragment.setOnClickListener {
			val intentDetail = Intent(holder.itemView.context, DetailArtikelActivity::class.java)
			holder.itemView.context.startActivity(intentDetail)
		}
	}

}