package com.patikadev.mvvmsample.network.response

import com.google.gson.annotations.SerializedName
import com.patikadev.mvvmsample.ui.model.Movie

data class MovieListResponse(
    val page: Int,
    @SerializedName("total_pages") val totalPage: Int,
    @SerializedName("total_results") val totalResults: Int,
    @SerializedName("results") val movies : List<Movie>

)