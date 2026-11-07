package com.example.foodresque.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_items")
data class FoodItem(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val category: String,
    val expiryDate: String,
    val isDonatable: Boolean,
    val latitude: Double? = null,
    val longitude: Double? = null
)