package com.patikadev.mvvmsample.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.patikadev.deneme1.service.ServiceConnector
import com.patikadev.mvvmsample.network.BaseCallBack
import com.patikadev.mvvmsample.network.response.MoviDetailsResponse
import com.patikadev.mvvmsample.network.response.MovieListResponse
import com.patikadev.mvvmsample.util.Page
import retrofit2.Call

class FilmRepository {

    val onMoviesFetched = MutableLiveData<MovieListResponse>()
    val onMoviesDetailsFetched = MutableLiveData<MoviDetailsResponse>()

    fun getAllMovies(apiKey : String, page : Int){

        ServiceConnector.restInterface.getTopRatedMovies(apiKey, page).enqueue(object  : BaseCallBack<MovieListResponse>(){
            override fun onSuccess(data: MovieListResponse) {
               onMoviesFetched.postValue(data)
            }
        })
    }

    fun getMovieDetails(apiKey: String, ID: String){
        ServiceConnector.restInterface.getMovieDetails(ID, apiKey).enqueue(object : BaseCallBack<MoviDetailsResponse>(){
            override fun onSuccess(data: MoviDetailsResponse) {
                onMoviesDetailsFetched.postValue(data)
            }
        })
    }
}
