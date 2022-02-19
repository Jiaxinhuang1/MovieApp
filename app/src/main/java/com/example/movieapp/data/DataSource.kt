package com.example.movieapp.data

import com.example.movieapp.R
import com.example.movieapp.model.Genre
import com.example.movieapp.model.Movie
import com.example.movieapp.model.MovieDetails
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
            R.drawable.shang_chi,
            "Shang-Chi and the Legend of the Ten Rings",
            "September 3, 2021"
        ),
        MovieItem(
            R.drawable.free_guy,
            "Free Guy",
            "August 13, 2021"
        ),
        MovieItem(
            R.drawable.no_time_to_die,
            "No Time to Die",
            "October 6 2021"
        ) ,
        MovieItem(
            R.drawable.suicide_squad,
            "Suicide Squad",
            "August 5, 2016"
        )

    )
val ComedyMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.dead_poets_society,
            "Dead Poets Society",
            "June 2, 1989"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            "Grand Budapest Hotel",
            "March, 28, 2014"
        ),
        MovieItem(
            R.drawable.suicide_squad,
            name =  "Suicide Squad",
            "August 5, 2016"
        ),
        MovieItem(
            R.drawable.lalaland,
            name = "La La Land",
            date = "December 9, 2016"
        ),
        MovieItem(
            R.drawable.free_guy,
            name = "Free Guy",
            date = "August 13, 2021"
        )

    )
    val DramaMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        ),
        MovieItem(
            R.drawable.grand_budapest_hotel,
            name = "Grand Budapest Hotel",
            date = "March 28, 2014"
        ),
        MovieItem(
            R.drawable.lalaland,
            name= "La La Land",
            date = "December 9, 2016"
        ),
        MovieItem(
            R.drawable.dune,
            name = "Dune",
            date = "October 22, 2021"
        ),
        MovieItem(
            R.drawable.spencer,
            name = "Spencer",
            date = "November 5, 2021"
        ),
        MovieItem(
            R.drawable.shape_of_water,
            name = "The Shape of Water",
            date = "December 1, 2017"
        ),
        MovieItem(
            R.drawable.dead_poets_society,
            name = "Dead Poets Society",
            date = "June 2, 1989"
        )
    )
    val HorrorMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.it,
            "It",
            "September 5, 2017"
        ),
        MovieItem(
            R.drawable.the_shining,
            "The Shining",
            "May 23, 1980"
        ),
        MovieItem(
            R.drawable.the_conjuring,
            "The Conjuring",
            "July 15, 2013"
        ),
        MovieItem(
            R.drawable.us,
            "Us",
            "March 22, 2019"
        )
    )
    val ThrillerMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.no_time_to_die,
            "No Time to Die",
            "October 8, 2021"
        ),
        MovieItem(
            R.drawable.blade_runner_2049,
            "Blade Runner 2049",
            "October 6, 2017"
        ),
        MovieItem(
            R.drawable.shape_of_water,
            "The Shape of Water",
            "December 1, 2017"
        ),
        MovieItem(
            R.drawable.us,
            name = "Us",
            date = "March 22, 2019"
        )
    )
    val MysteryMovieItems: List<MovieItem> = listOf(
        MovieItem(
            R.drawable.knives_out,
            "Knives Out",
            "September 7, 2019"
        ),
        MovieItem(
            R.drawable.murder_on_the_orient_express,
            "Murder on the Orient Express",
            "November 2, 2017"
        )
    )
}