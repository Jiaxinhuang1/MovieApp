package com.example.movieapp.model

import androidx.annotation.DrawableRes

class User (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val watchlist: List<Movie>
)
