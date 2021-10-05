package com.patikadev.mvvmsample.ui

import com.patikadev.mvvmsample.network.response.MoviDetailsResponse
import com.patikadev.mvvmsample.ui.model.Genre

class MovieDetailsViewStateModel(val movieDetailResponse: MoviDetailsResponse) {
    fun getMovieID(): String = movieDetailResponse.ID
    fun getMovieTitle(): String = movieDetailResponse.title
    fun getMovieOverview(): String = movieDetailResponse.overview
    fun getMoviePosterPath(): String = movieDetailResponse.poster_path
    fun getMovieRuntime(): Int = movieDetailResponse.runtime
    fun getMovieReleaseDate(): String = movieDetailResponse.release_date
    fun getMovieVoteAverage(): Int = movieDetailResponse.vote_average
    fun getMovieVoteCount(): Int = movieDetailResponse.vote_count
    fun getMovieGenreIDs(): List<Genre> = movieDetailResponse.genre_ids
}

