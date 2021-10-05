package com.patikadev.mvvmsample.network.response

import com.google.gson.annotations.SerializedName
import com.patikadev.mvvmsample.ui.model.Genre

data class MoviDetailsResponse(
    @SerializedName("id") val ID: String,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview : String,
    @SerializedName("poster_path") val poster_path : String,
    @SerializedName("runtime") val runtime : Int,
    @SerializedName("release_date") val release_date : String,
    @SerializedName("vote_average") val vote_average : Int,
    @SerializedName("vote_count") val vote_count : Int,
    @SerializedName("genre_ids") val genre_ids : List<Genre>
)
