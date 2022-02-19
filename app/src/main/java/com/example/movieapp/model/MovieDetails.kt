package com.example.movieapp.model

import android.widget.Button
import androidx.annotation.DrawableRes

data class MovieDetails (
    @DrawableRes val imageResourceId: Int,
    val name: String,
    val date: String,
    val genre: String,
    val cast: String,
    val synopsis: String
    //val button: Button
)