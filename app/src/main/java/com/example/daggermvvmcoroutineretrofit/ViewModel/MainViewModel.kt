package com.example.daggermvvmcoroutineretrofit.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.daggermvvmcoroutineretrofit.Activity.MainActivity
import com.example.daggermvvmcoroutineretrofit.Model.Products
import com.example.daggermvvmcoroutineretrofit.Repository.ProductRepository
import dagger.hilt.android.internal.Contexts
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: ProductRepository): ViewModel() {

    val productsLiveData: LiveData<List<Products>>
    get() = repository.products

    init {
        viewModelScope.launch {
            repository.getProducts()
        }
    }

}