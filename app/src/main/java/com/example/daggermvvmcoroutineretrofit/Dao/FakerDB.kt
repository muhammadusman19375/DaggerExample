package com.example.daggermvvmcoroutineretrofit.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggermvvmcoroutineretrofit.Model.Products
import com.example.daggermvvmcoroutineretrofit.Repository.ProductRepository

@Database(entities = [Products::class], version = 1)
abstract class FakerDB: RoomDatabase() {

    abstract fun getFakerDao(): FakerDao

}