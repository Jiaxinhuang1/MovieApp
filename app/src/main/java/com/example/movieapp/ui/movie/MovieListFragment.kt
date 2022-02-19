package com.example.movieapp.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieapp.adapter.MovieAdapter
import com.example.movieapp.databinding.FragmentMovieListBinding

class MovieListFragment : Fragment() {

    companion object {
        val GENRE = "genre"
    }

    private var _binding: FragmentMovieListBinding? = null
    private val binding get() = _binding!!
    private lateinit var genreID: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Retrieve the GENRE from the Fragment arguments
        arguments?.let {
            genreID = it.getString(GENRE).toString()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                                container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {
        // Retrieve and inflate the layout for this fragment
        _binding = FragmentMovieListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MovieAdapter(genreID, requireContext())

        // Adds a [DividerItemDecoration] between items
        recyclerView.addItemDecoration(
            DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
        )
    }

    //Frees the binding object when the Fragment is destroyed.
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}