package com.example.movieapp.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.data.DataSource

class GenreAdapter :

    RecyclerView.Adapter<GenreAdapter.GenreViewHolder>() {

    // Generates a [CharRange] from 'A' to 'Z' and converts it to a list
    private val list = DataSource.genres

    /**
     * Provides a reference for the views needed to display items in your list.
     */
    class GenreViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}