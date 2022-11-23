package com.example.daggermvvmcoroutineretrofit.Model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ProductsTable")
data class Products(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val category: String,
    val description: String,
    val image: String,
    val price: Double,
    val title: String
)