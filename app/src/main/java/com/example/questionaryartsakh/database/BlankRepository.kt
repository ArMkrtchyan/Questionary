package com.example.questionaryartsakh.database

import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp
import com.example.questionaryartsakh.database.entity.BlankEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onStart

@ExperimentalCoroutinesApi
class BlankRepository {

    private val blankDao = BlankApp.getInstance().getBlankDb().blankDao()

    suspend fun insertBlank(Blank: BlankEntity, mFlow: suspend (Flow<ArrayList<Blank>>) -> Unit) {
        mFlow(flow {
            //  emit(BlanksMapper.BlankEntitiesToBlanks(BlankDao.getAllBlanks()))
            emit(arrayListOf<Blank>())
        }.onStart {
            blankDao.insert(Blank)
        }.flowOn(Dispatchers.IO))
    }


    suspend fun findAllBlanks(mFlow: suspend (Flow<ArrayList<Blank>>) -> Unit) {
        mFlow(flow {
            //   emit(BlanksMapper.BlankEntitiesToBlanks(BlankDao.getAllBlanks()))
            emit(arrayListOf<Blank>())
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
            //  emit(BlanksMapper.BlankEntitiesToBlanks(BlankDao.getAllBlanks()))
            emit(arrayListOf<Blank>())
        }.onStart {
            blankDao.deleteBlank(Blank)
        }.flowOn(Dispatchers.IO))

    }

}