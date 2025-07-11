package com.example.networklib

import retrofit2.http.GET

// Data class for Photo
data class Photo(
    val id: Int,
    val title: String,
    val thumbnailUrl: String
)

interface ApiService {
    @GET("photos")
    suspend fun getPhotos(): List<Photo>
}

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error(val exception: Throwable) : Result<Nothing>()
}
