package com.example.movieapp.model

import androidx.annotation.DrawableRes

class Movie (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val genre: List<Genre>,
    //val synopsis: String,
    val actors: List<String>, //can change to List<Actor> later
    val inWatchlist: Boolean = false //default false
)