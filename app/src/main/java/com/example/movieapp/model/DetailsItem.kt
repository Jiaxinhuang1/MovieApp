package com.example.movieapp.model

import androidx.annotation.DrawableRes

data class DetailsItem (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val date: String,
    val genre: String,
    val cast: String,
    val synopsis: String
)