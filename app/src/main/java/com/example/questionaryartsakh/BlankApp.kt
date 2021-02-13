package com.example.questionaryartsakh

import android.app.Application
import com.example.questionaryartsakh.database.BlankDB

class BlankApp : Application() {

    companion object {

        private lateinit var instance: BlankApp
        fun getInstance() = instance
    }

    private var chatDb: BlankDB? = null
    private var blank: Blank? = Blank()

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
        return blank!!
    }

    fun setBlank(blank: Blank): Blank {
        this.blank = blank
        return this.blank!!
    }

    fun releaseBlank(): Blank {
        blank = null
        blank = Blank(0, 1)
        return blank!!
    }
}