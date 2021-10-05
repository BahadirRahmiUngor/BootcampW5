package com.patikadev.mvvmsample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.patikadev.mvvmsample.R
import com.patikadev.mvvmsample.databinding.RowFilmBinding
import com.patikadev.mvvmsample.ui.model.Movie

class MovieListAdapter(private val movieList: List<Movie>) : RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.row_film,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = this.movieList[position]
       holder.populate(movie)
    }

    override fun getItemCount() = this.movieList.size
}


class MovieViewHolder(private val binding: RowFilmBinding) : RecyclerView.ViewHolder(binding.root) {

    fun populate(movie: Movie) {
        binding.movie = movie
        binding.executePendingBindings()
    }

}