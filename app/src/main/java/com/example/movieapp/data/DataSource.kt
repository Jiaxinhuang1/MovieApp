package com.example.movieapp.data

import com.example.movieapp.R
import com.example.movieapp.model.Genre
import com.example.movieapp.model.Movie

object DataSource {
    val genres: List<Genre> = listOf(
        Genre(
            R.drawable.action,
            "Action"
        ),
        Genre(
            R.drawable.comedy,
            "Comedy"
        ),
        Genre(
            R.drawable.drama,
            "Drama"
        ),
        Genre(
            R.drawable.horror,
            "Horror"
        ),
        Genre(
            R.drawable.mystery,
            "Mystery"
        ),
        Genre(
            R.drawable.thriller,
            "Thriller"
        )
    )

    val movies: List<Movie> = listOf(
        Movie(
            R.drawable.dune,
            "Dune",
            listOf("Drama", "Action"),  //listOf(Genre(R.drawable.drama,"Drama")),
            listOf("Timothée Chalamet", "Rebecca Ferguson", "Oscar Isaac")
        )
    )
}