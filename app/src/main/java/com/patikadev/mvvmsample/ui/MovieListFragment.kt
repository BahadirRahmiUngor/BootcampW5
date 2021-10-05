package com.patikadev.mvvmsample.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.patikadev.mvvmsample.R
import com.patikadev.mvvmsample.adapters.MovieListListener
import com.patikadev.mvvmsample.base.BaseFragment
import com.patikadev.mvvmsample.databinding.FragmentMovieListBinding
import com.patikadev.mvvmsample.ui.adapter.MovieListAdapter
import com.patikadev.mvvmsample.ui.model.Movie


class MovieListFragment : BaseFragment<MovieListViewModel, FragmentMovieListBinding> (), MovieListListener {
    override var viewModel: MovieListViewModel?= null


    override fun getLayoutID() = R.layout.fragment_movie_list
    private var MovieList = ArrayList<Movie>()

    override fun prepareView() {
//layoutmanager
        //orientation
    }

    override fun prepareViewModel() {
        viewModel = ViewModelProvider(this).get(MovieListViewModel::class.java)

    }

    override fun observeLiveData() {
      viewModel?.moviesResponse?.observe(this, {

       //   dataBinding.movieListResponse = it
       //   dataBinding.executePendingBindings()

          dataBinding.recyclerView.adapter = MovieListAdapter(it.getList())


      })
    }

    override fun onClick(position: Int) {
        val clickedItem = MovieList[position]

        val bundle = Bundle()
        bundle.putString("movieId", clickedItem.id.toString())
        val movieDetailsFragment = MovieDetailsFragment()
        movieDetailsFragment.arguments = bundle

        findNavController().navigate(R.id.action_filmListFragment_to_movieDetailsFragment, bundle)
    }
}
