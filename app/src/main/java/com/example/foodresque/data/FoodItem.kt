
package com.example.foodresque.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_items")
data class FoodItem(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    val name: String,

    val quantity: Int = 1,

    val expiryDate: String,

    val category: String,

    val isDonatable: Boolean = false,

    val latitude: Double? = null,

    val longitude: Double? = null
)
