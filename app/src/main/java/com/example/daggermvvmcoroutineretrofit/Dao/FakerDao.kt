package com.example.daggermvvmcoroutineretrofit.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.daggermvvmcoroutineretrofit.Model.Products

@Dao
interface FakerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addProducts(products: List<Products>)

    @Query("SELECT * FROM ProductsTable")
    suspend fun getProducts(): List<Products>

}