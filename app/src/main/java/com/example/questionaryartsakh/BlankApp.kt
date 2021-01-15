package com.example.questionaryartsakh

import android.app.Application
import com.example.questionaryartsakh.database.BlankDB

class BlankApp : Application() {
    companion object {
        private lateinit var instance: BlankApp
        fun getInstance() = instance
    }

    private var chatDb: BlankDB? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        chatDb = BlankDB.getDatabase(applicationContext)
    }

    fun getBlankDb(): BlankDB {
        return if (chatDb == null) {
            chatDb = BlankDB.getDatabase(applicationContext)
            chatDb!!
        } else {
            chatDb!!
        }
    }
}