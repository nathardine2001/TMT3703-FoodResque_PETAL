package com.example.foodresque.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFood(foodItem: FoodItem)

    @Delete
    suspend fun deleteFood(foodItem: FoodItem)

    @Query("SELECT * FROM food_items ORDER BY id DESC")
    fun getAllFoodItems(): Flow<List<FoodItem>>
}