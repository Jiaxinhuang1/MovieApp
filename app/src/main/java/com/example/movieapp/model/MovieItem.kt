package com.example.movieapp.model

import androidx.annotation.DrawableRes

data class MovieItem (
        @DrawableRes val imageResourceId: Int,
        val name: String,
        val date: String,
)
