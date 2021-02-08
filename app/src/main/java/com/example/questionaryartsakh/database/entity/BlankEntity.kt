package com.example.questionaryartsakh.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "blanks")
data class BlankEntity(@PrimaryKey(autoGenerate = true) var id: Int = 0, @ColumnInfo(name = "json") var blankJson: String = "")