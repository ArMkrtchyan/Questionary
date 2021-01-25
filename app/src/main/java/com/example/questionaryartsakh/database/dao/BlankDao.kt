package com.example.questionaryartsakh.database.dao

import androidx.room.*
import com.example.questionaryartsakh.database.entity.BlankEntity

@Dao
interface BlankDao {

    @Query("SELECT * from blanks ORDER BY last_message_date DESC")
    suspend fun getAllBlanks(): List<BlankEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(blank: BlankEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertChats(blanks: List<BlankEntity>)

    @Query("DELETE FROM blanks")
    suspend fun deleteAll()

    @Update
    suspend fun updateBlank(blank: BlankEntity)

    @Delete
    suspend fun deleteBlank(blank: BlankEntity)
}