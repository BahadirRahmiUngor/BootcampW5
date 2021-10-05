package com.patikadev.mvvmsample.ui

import com.patikadev.mvvmsample.R
import com.patikadev.mvvmsample.base.BaseFragment
import com.patikadev.mvvmsample.databinding.FragmentMovieDetailBinding

class MovieDetailsFragment : BaseFragment<MovieDetailsViewModel, FragmentMovieDetailBinding>() {

    override var viewModel: MovieDetailsViewModel? = null
    override fun getLayoutID(): Int = R.layout.fragment_movie_detail

    override fun observeLiveData() {
        TODO("Not yet implemented")
    }

    override fun prepareView() {
        TODO("Not yet implemented")
    }

    override fun prepareViewModel() {
        TODO("Not yet implemented")
    }

}