package com.example.questionaryartsakh

import android.app.Application
import com.example.questionaryartsakh.database.BlankDB

class BlankApp : Application() {

    companion object {

        private lateinit var instance: BlankApp
        fun getInstance() = instance
    }

    private var chatDb: BlankDB? = null
    private var blank: Blank = Blank(0, 1)

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

    fun getBlank(): Blank {
        return blank
    }
}