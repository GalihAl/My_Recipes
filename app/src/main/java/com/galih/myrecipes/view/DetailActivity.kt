
package com.galih.myrecipes.view

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.galih.myrecipes.databinding.ActivityDetailBinding
import com.galih.myrecipes.model.Recipe

class DetailActivity : AppCompatActivity() {


    companion object{
        const val EXTRA_RECIPE = "extra_recipe"
    }

    private lateinit var binding: ActivityDetailBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recipe = intent.getParcelableExtra<Recipe>(EXTRA_RECIPE) as Recipe

        binding.apply {
            foodName.text = recipe.name
            ratingNumb.text = recipe.rating.toString()
            aboutRecipeDescription.text = recipe.detail
            sumIngredient.text = "${recipe.ingredientSum.toString()} Bahan"
            sumTime.text = "${recipe.time.toString()} Min"
            sumCalory.text = "${recipe.calorie.toString()} Kalori"
        }
        Glide.with(this@DetailActivity).load(recipe.photo).into(binding.ivPhoto)
    }

}