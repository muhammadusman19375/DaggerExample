package com.example.daggermvvmcoroutineretrofit.ViewModel

import android.view.View
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel2 @Inject constructor(private val randomize: Randomize): ViewModel(){

    init {
        randomize.doAction()
    }

}