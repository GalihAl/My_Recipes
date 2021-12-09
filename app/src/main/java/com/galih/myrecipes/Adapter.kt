package com.galih.myrecipes

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.galih.myrecipes.databinding.ItemRowRecipeBinding
import com.galih.myrecipes.model.Recipe

class Adapter(private val listRecipe: ArrayList<Recipe>): RecyclerView.Adapter<Adapter.ListViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack){
        this.onItemClickCallBack = onItemClickCallBack
    }

    inner class ListViewHolder(val binding: ItemRowRecipeBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(ItemRowRecipeBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val recipe = listRecipe[position]
        Glide.with(holder.itemView.context)
            .load(recipe.photo)
            .apply(RequestOptions().override(150, 150))
            .into(holder.binding.ivAvatar)
        holder.binding.apply {
            tvName.text = recipe.name
            tvDescription.text = recipe.detail
            tvTime.text = "${recipe.time} Min"
            tvIngredient.text = "${recipe.ingredientSum} Ingred"
            tvRating.text = "${recipe.rating}.0"
            btnSeeRecipe.setOnClickListener { onItemClickCallBack.onItemClicked(listRecipe[holder.adapterPosition]) }
        }
    }

    override fun getItemCount(): Int = listRecipe.size

    interface OnItemClickCallBack{
        fun onItemClicked(data: Recipe)
    }
}