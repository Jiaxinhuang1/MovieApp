package com.example.movieapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.data.DataSource
import com.example.movieapp.ui.genre.GenreListFragment
import android.os.Build
import android.view.accessibility.AccessibilityNodeInfo
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController


class GenreAdapter : RecyclerView.Adapter<GenreAdapter.GenreViewHolder>() {

    // Generates a [CharRange] from 'A' to 'Z' and converts it to a list
    private val list = DataSource.genres

    /**
     * Provides a reference for the views needed to display items in your list.
     */
    class GenreViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenreViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

//        // Setup custom accessibility delegate to set the text read
//        layout.accessibilityDelegate = Accessibility

        return GenreViewHolder(layout)
    }

    override fun onBindViewHolder(holder: GenreViewHolder, position: Int) {
        val item = list.get(position)
        holder.button.text = item.toString()

        // Assigns a [OnClickListener] to the button contained in the [ViewHolder]
        holder.button.setOnClickListener {
            // Create an action from WordList to DetailList
            // using the required argument
            val action = GenreListFragmentDirections.actionGenreListFragmentToMovieListFragment(genreID = holder.button.text.toString())
            // Navigate using that action
            holder.view.findNavController().navigate(action)
        }
    }
}