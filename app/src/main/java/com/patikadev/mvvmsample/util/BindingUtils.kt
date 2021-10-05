package com.patikadev.mvvmsample.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

@BindingAdapter("image")
fun setImageUrl(imageView: ImageView, url: String?) {
    Glide.with(imageView.context)
        .load("https://image.tmdb.org/t/p/w500$url")
        .into(imageView)
}
