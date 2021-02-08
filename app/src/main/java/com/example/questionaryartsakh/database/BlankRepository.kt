package com.example.questionaryartsakh.database

import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp
import com.example.questionaryartsakh.database.entity.BlankEntity
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart

@ExperimentalCoroutinesApi
class BlankRepository {

    private val blankDao = BlankApp.getInstance().getBlankDb().blankDao()

    suspend fun insertBlank(blank: BlankEntity, mFlow: suspend (Flow<ArrayList<Blank>>) -> Unit) {
        mFlow(flow {
            val blanks = arrayListOf<Blank>()
            blankDao.getAllBlanks().map {
                blanks.add(Gson().fromJson(it.blankJson, Blank::class.java))
            }
            emit(blanks)
        }.onStart {
            blankDao.insert(blank)
        }.flowOn(Dispatchers.IO))
    }

    suspend fun findAllBlanks(mFlow: suspend (Flow<ArrayList<Blank>>) -> Unit) {
        mFlow(flow {
            val blanks = arrayListOf<Blank>()
            blankDao.getAllBlanks().map {
                blanks.add(Gson().fromJson(it.blankJson, Blank::class.java))
            }
            emit(blanks)
        }.flowOn(Dispatchers.IO))
    }

    suspend fun updateBlank(Blank: BlankEntity, mFlow: suspend (Flow<Boolean>) -> Unit) {
        mFlow(flow {
            emit(true)
        }.onStart {
            blankDao.updateBlank(Blank)
        }.flowOn(Dispatchers.IO))
    }

    suspend fun deleteBlank(Blank: BlankEntity, mFlow: suspend (Flow<ArrayList<Blank>>) -> Unit) {
        mFlow(flow {
            val blanks = arrayListOf<Blank>()
            blankDao.getAllBlanks().map {
                blanks.add(Gson().fromJson(it.blankJson, com.example.questionaryartsakh.Blank::class.java))
            }
            emit(blanks)
        }.onStart {
            blankDao.deleteBlank(Blank)
        }.flowOn(Dispatchers.IO))

    }

}