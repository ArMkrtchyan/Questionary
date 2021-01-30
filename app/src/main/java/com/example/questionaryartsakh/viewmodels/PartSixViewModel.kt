package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.BlankApp

class PartSixViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var telLiveData = blank.telephoneLiveData
    var dateOfBirthDayLiveData = blank.dateOfBirthDayLiveData
    var fullNameLiveData = blank.fullNameLiveData
    var dateLiveData = blank.dateLiveData
    var birthPlaceLiveData = blank.birthPlaceLiveData
    var livingPlaceBeforeWarLiveData = blank.livingPlaceBeforeWarLiveData
    var addressInArcakhLiveData = blank.addressInArcakhLiveData
    var livingTimeLiveData = blank.livingTimeLiveData
    var familyCountLiveData = blank.familyCountLiveData
    var familyMaleCountLiveData = blank.familyMaleCountLiveData
    var familyUnder18CountLiveData = blank.familyUnder18CountLiveData
    var familyGenCountLiveData = blank.familyGenCountLiveData
    var toshakaruLiveData = blank.exhibitionerLiveData
    var invalidLiveData = blank.invalidLiveData

}