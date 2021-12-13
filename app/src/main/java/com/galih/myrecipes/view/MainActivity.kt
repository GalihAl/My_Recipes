package com.galih.myrecipes.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.galih.myrecipes.Adapter
import com.galih.myrecipes.databinding.ActivityMainBinding
import com.galih.myrecipes.model.Recipe
import com.galih.myrecipes.data.RecipeData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    private val list : ArrayList<Recipe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        list.addAll(RecipeData.listData)
        showRecyclerView()

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

}