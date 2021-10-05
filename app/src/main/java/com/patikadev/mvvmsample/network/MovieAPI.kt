package com.patikadev.mvvmsample.network

import com.patikadev.mvvmsample.network.response.MoviDetailsResponse
import com.patikadev.mvvmsample.network.response.MovieListResponse
import com.patikadev.mvvmsample.util.Page
import retrofit2.Call
import retrofit2.http.*

interface MovieAPI {

    @GET("popular")
    fun getTopRatedMovies(@Query("api_key") apikey : String, @Query("page") page: Int = Page) : Call<MovieListResponse>

    @GET("movie_id")
    fun getMovieDetails(@Query("movie_id") movieID: String, @Query("api_key") apikey : String) : Call<MoviDetailsResponse>


}