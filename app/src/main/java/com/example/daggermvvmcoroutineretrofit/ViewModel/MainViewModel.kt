package com.example.daggermvvmcoroutineretrofit.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggermvvmcoroutineretrofit.Model.Products
import com.example.daggermvvmcoroutineretrofit.Repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: ProductRepository, private val randomize: Randomize): ViewModel() {

    val productsLiveData: LiveData<List<Products>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}

class Randomize @Inject constructor(){
    fun doAction(){
        Log.d("TAG", "Random Action")
    }
}