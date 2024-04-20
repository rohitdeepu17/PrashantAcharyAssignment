package com.example.advaitassignment.data.remote

import androidx.room.Query
import com.example.advaitassignment.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface UnsplashApi {
    @Headers("Authorization: Client-ID Nkp4p1gd4gS6cv1b0OkrY-5S6fDTW73oRAidXfbiCBY")
    @GET("/photos")
    suspend fun getAllImages(
        page: Int,
        perPage: Int
    ): List<UnsplashImage>
}