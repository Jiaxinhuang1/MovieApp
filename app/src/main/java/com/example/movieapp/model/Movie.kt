package com.example.movieapp.model

import androidx.annotation.DrawableRes

class Movie (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val synopsis: String,
    val actors: List<String> //can change to List<Actor> later
)