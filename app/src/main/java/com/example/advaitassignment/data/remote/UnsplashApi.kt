package com.example.advaitassignment.data.remote

import com.example.advaitassignment.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface UnsplashApi {
    @Headers("Authorization: Client-ID Nkp4p1gd4gS6cv1b0OkrY-5S6fDTW73oRAidXfbiCBY")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>
}