package com.example.daggermvvmcoroutineretrofit.Di

import androidx.lifecycle.ViewModel
import com.example.daggermvvmcoroutineretrofit.ViewModel.MainViewModel
import com.example.daggermvvmcoroutineretrofit.ViewModel.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
abstract class ViewModelModule {

    @Binds
    @ClassKey(MainViewModel::class)
    @IntoMap
    abstract fun mainViewModel(mainViewModel: MainViewModel): ViewModel


    @Binds
    @ClassKey(MainViewModel2::class)
    @IntoMap
    abstract fun mainViewModel2(mainViewModel2: MainViewModel2): ViewModel
}