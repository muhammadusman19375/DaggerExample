package com.example.daggermvvmcoroutineretrofit.Repository

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.daggermvvmcoroutineretrofit.Dao.FakerDB
import com.example.daggermvvmcoroutineretrofit.Model.Products
import com.example.daggermvvmcoroutineretrofit.Retrofit.FakerAPI
import com.example.daggermvvmcoroutineretrofit.ViewModel.MainViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB) {

    private val _product = MutableLiveData<List<Products>>()

    val products: LiveData<List<Products>>
    get() = _product

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if(result.isSuccessful && result.body() != null){
            fakerDB.getFakerDao().addProducts(result.body()!!)
            _product.postValue(result.body())
        }
    }



}