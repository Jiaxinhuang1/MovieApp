package com.example.movieapp.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movieapp.R
import com.example.movieapp.model.MovieItem

class DashboardViewModel : ViewModel() {
    val WatchlistItem: MutableList<MovieItem> = mutableListOf(
        MovieItem(
            R.drawable.king_richard,
            "King Richard",
            "November 19, 2021"
        )
    )
    }
    //val text: LiveData<String> = _text
