package com.example.networklib

class PhotoRemoteDataSource(private val apiService: ApiService) {
    suspend fun fetchPhotos(): Result<List<Photo>> {
        return try {
            val photos = apiService.getPhotos()
            Result.Success(photos)
        } catch (e: Exception) {
            Result.Error(e)
        }
    }
}

