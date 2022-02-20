package com.example.movieapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.movieapp.adapter.WatchlistAdapter
import com.example.movieapp.const.Layout
import com.example.movieapp.databinding.ActivityVerticalListBinding

class WatchlistVerticalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = WatchlistAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}