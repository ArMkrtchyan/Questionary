package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.BlankApp

class PartTwoViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var educationField1LiveData = blank.educationField1LiveData
    var educationField2LiveData = blank.educationField2LiveData
    var educationField3LiveData = blank.educationField3LiveData
    var educationField4LiveData = blank.educationField4LiveData
    var educationField5LiveData = blank.educationField5LiveData
    var educationField6LiveData = blank.educationField6LiveData
    var spacializationLiveData = blank.spacializationLiveData
    var computerSkillLiveData = blank.computerSkillLiveData
    var driveCarLiveData = blank.driveCarLiveData

}