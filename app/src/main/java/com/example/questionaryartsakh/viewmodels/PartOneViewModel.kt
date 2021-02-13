package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.BlankApp

class PartOneViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var telLiveData = MutableLiveData(blank.telephone).apply {
        observeForever {
            blank.telephone = it
        }
    }
    var dateOfBirthDayLiveData = MutableLiveData(blank.dateOfBirthDay).apply {
        observeForever {
            blank.dateOfBirthDay = it
        }
    }
    var fullNameLiveData = MutableLiveData(blank.fullName).apply {
        observeForever {
            blank.fullName = it
        }
    }
    var dateLiveData = MutableLiveData(blank.date).apply {
        observeForever {
            blank.date = it
        }
    }
    var birthPlaceLiveData = MutableLiveData(blank.birthPlace).apply {
        observeForever {
            blank.birthPlace = it
        }
    }
    var livingPlaceBeforeWarLiveData = MutableLiveData(blank.livingPlaceBeforeWar).apply {
        observeForever {
            blank.livingPlaceBeforeWar = it
        }
    }
    var addressInArcakhLiveData = MutableLiveData(blank.addressInArcakh).apply {
        observeForever {
            blank.addressInArcakh = it
        }
    }
    var livingTimeLiveData = MutableLiveData(blank.livingTime).apply {
        observeForever {
            blank.livingTime = it
        }
    }
    var familyCountLiveData = MutableLiveData(blank.familyCount).apply {
        observeForever {
            blank.familyCount = it
        }
    }
    var familyMaleCountLiveData = MutableLiveData(blank.familyMaleCount).apply {
        observeForever {
            blank.familyMaleCount = it
        }
    }
    var familyUnder18CountLiveData = MutableLiveData(blank.familyUnder18Count).apply {
        observeForever {
            blank.familyUnder18Count = it
        }
    }
    var familyGenCountLiveData = MutableLiveData(blank.familyGenCount).apply {
        observeForever {
            blank.familyGenCount = it
        }
    }
    var toshakaruLiveData = MutableLiveData(blank.familyMembers.field1).apply {
        observeForever {
            blank.familyMembers.field1 = it
        }
    }
    var invalidLiveData = MutableLiveData(blank.familyMembers.field2).apply {
        observeForever {
            blank.familyMembers.field2 = it
        }
    }

}