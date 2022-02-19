package com.example.movieapp.data

import com.example.movieapp.R
import com.example.movieapp.model.Genre
import com.example.movieapp.model.Movie
import com.example.movieapp.model.MovieItem

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
            listOf(Genre(R.drawable.drama,"Drama")),
            listOf("Timothée Chalamet. Rebecca Ferguson, Oscar Isaac")
        ),
    )

    val ActionMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.dune,
            "Dune",
            "October 22, 2021"
        ),
        MovieItem(
            R.drawable.lalaland,
            "La la land",
            "December 9, 2016"
        ),
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        ) ,
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        )
    )
    val ComedyMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        )
    )
    val DramaMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        )
    )
    val HorrorMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        ),
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        )
    )
    val MysteryMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        )
    )
    val ThrillerMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        )
    )
}