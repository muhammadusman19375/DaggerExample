package com.example.daggermvvmcoroutineretrofit.Retrofit

import com.example.daggermvvmcoroutineretrofit.Model.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("products")
    suspend fun getProducts(): Response<List<Products>>

}