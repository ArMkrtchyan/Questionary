package com.example.questionaryartsakh.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.questionaryartsakh.database.dao.BlankDao
import com.example.questionaryartsakh.database.entity.BlankEntity

@Database(entities = [BlankEntity::class], version = 1, exportSchema = true)
abstract class BlankDB : RoomDatabase() {
    abstract fun blankDao(): BlankDao

    companion object {
        @Volatile
        private var INSTANCE: BlankDB? = null

        fun getDatabase(context: Context): BlankDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(context.applicationContext, BlankDB::class.java, "database_v1").build()
                INSTANCE = instance
                return instance
            }
        }

    }

}