package com.patikadev.mvvmsample.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MediatorLiveData
import com.patikadev.mvvmsample.repository.FilmRepository
import com.patikadev.mvvmsample.util.API_KEY

class MovieDetailsViewModel(movieID : String, myApplication : Application) : AndroidViewModel(myApplication) {

    val detailsResponse = MediatorLiveData<MovieDetailsViewStateModel>()
    val filmRepository = FilmRepository()

    init {
        filmRepository.getMovieDetails(API_KEY, movieID)

        detailsResponse.addSource(filmRepository.onMoviesDetailsFetched) {
            detailsResponse.value = MovieDetailsViewStateModel(it)
        }
    }
}