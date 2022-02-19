package com.example.movieapp.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R
import com.example.movieapp.data.DataSource
import com.example.movieapp.model.Movie
import com.example.movieapp.ui.movie.MovieListFragment

class MovieAdapter(private val genreID: String, context: Context) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private val filteredMovies: List<Movie>

    init {
        // Retrieve the list of words from res/values/arrays.xml
        val movies = DataSource.movies

        filteredMovies = movies.filter { it.genres.contains(genreID) }
    }

    class MovieViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int = filteredMovies.size

    //Creates new views with R.layout.item_view as its template
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return MovieViewHolder(layout)
    }

    //Replaces the content of an existing view with new data
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {

        val item = filteredMovies[position]
        // Needed to call startActivity
        val context = holder.view.context

        // Set the text of the MovieViewHolder
        holder.button.text = item.toString()


        // Assigns a [OnClickListener] to the button contained in the [ViewHolder]
        //TODO: work on intent
        holder.button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            context.startActivity(intent)
        }
    }
}