package com.patikadev.mvvmsample.ui

import com.patikadev.mvvmsample.network.response.MovieListResponse
import com.patikadev.mvvmsample.ui.model.Movie

data class MovieListViewStateModel(val moviesResponse: MovieListResponse){

    fun getResults() : String = "total count ${moviesResponse.totalResults}"
    fun getTotalPage() : String = "total page ${moviesResponse.totalPage}"
    fun getList() : List<Movie> = moviesResponse.movies
}
