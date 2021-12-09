package com.galih.myrecipes.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.galih.myrecipes.Adapter
import com.galih.myrecipes.databinding.ActivityMainBinding
import com.galih.myrecipes.model.Recipe
import com.galih.myrecipes.viewModel.RecipeViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    private val list : ArrayList<Recipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        adapter = Adapter(list)
        adapter.setOnItemClickCallBack(object : Adapter.OnItemClickCallBack {
            override fun onItemClicked(data: Recipe) {
                moveIntent(data)
            }
        })
        list.addAll(RecipeViewModel.listData)
        showRecyclerView()

        binding.ibAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

    }

    private fun showRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = Adapter(list)
        binding.recyclerView.setHasFixedSize(true)

    }

    private fun moveIntent(recipe: Recipe){
        val moveDataToDetail = Intent(this@MainActivity, DetailActivity::class.java)/*.apply {
            putExtra(DetailActivity.EXTRA_RECIPE, recipe)
        }*/
        startActivity(moveDataToDetail)
    }

}