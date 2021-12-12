package com.galih.myrecipes.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
        list.addAll(RecipeViewModel.listData)
        showRecyclerView()


       /* adapter.setOnItemClickCallback(object : Adapter.OnItemClickCallback {
            override fun onItemClicked(data: Recipe) {
                moveIntent(data)
                Toast.makeText(this@MainActivity, "anda memilih ${data.name}", Toast.LENGTH_SHORT).show()
            }
        })*/
        binding.ibAbout.setOnClickListener {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
        }

    }

    private fun showRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val recyclerViewAdapter = Adapter(list, object : Adapter.OnItemClickCallback{
            override fun onItemClicked(data: Recipe) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_RECIPE, data)
                startActivity(intent)
            }
        })
        binding.recyclerView.adapter = recyclerViewAdapter
        binding.recyclerView.setHasFixedSize(true)

    }

/*
    private fun moveIntent(recipe: Recipe){
        val moveDataToDetail = Intent(this@MainActivity, DetailActivity::class.java).apply {
            putExtra(DetailActivity.EXTRA_RECIPE, recipe)
        }
        startActivity(moveDataToDetail)
    }
*/

}