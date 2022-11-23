package com.example.daggermvvmcoroutineretrofit

import android.app.Application
import com.example.daggermvvmcoroutineretrofit.Di.ApplicationComponent
import com.example.daggermvvmcoroutineretrofit.Di.DaggerApplicationComponent
import dagger.Component

class FakerApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.factory().create(this)

    }

}