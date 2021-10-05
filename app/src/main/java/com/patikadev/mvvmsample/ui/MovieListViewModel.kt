package com.patikadev.mvvmsample.ui

import androidx.lifecycle.*
import com.patikadev.mvvmsample.repository.FilmRepository
import com.patikadev.mvvmsample.util.API_KEY
import com.patikadev.mvvmsample.util.Page

class MovieListViewModel : ViewModel() {


    val moviesResponse = MediatorLiveData<MovieListViewStateModel>()
    val filmRepository = FilmRepository()

    init {
        filmRepository.getAllMovies(API_KEY, Page)

        moviesResponse.addSource(filmRepository.onMoviesFetched) {
            moviesResponse.value = MovieListViewStateModel(it)
        }
    }

    fun getMoreMovies() {
        filmRepository.getAllMovies(API_KEY, ++Page)
    }


}