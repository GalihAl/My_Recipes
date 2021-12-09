package com.galih.myrecipes.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.myrecipes.R
import com.galih.myrecipes.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}