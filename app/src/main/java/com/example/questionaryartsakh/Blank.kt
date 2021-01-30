package com.example.questionaryartsakh

import android.util.Log
import androidx.lifecycle.MutableLiveData

data class Blank(var id: Int, var status: Int, var telephone: String = "", var dateOfBirthDay: String = "", var fullName: String = "", var date: String = "",
    var birthPlace: String = "", var livingPlaceBeforeWar: String = "", var addressInArcakh: String = "", var livingTime: String = "", var familyCount: String = "",
    var familyMaleCount: String = "", var familyUnder18Count: String = "", var familyGenCount: String = "", var familyMembers: FamilyMembers = FamilyMembers()) {

    data class FamilyMembers(var invalid: Boolean = false, var toshakaru: Boolean = false)

    var telephoneLiveData = MutableLiveData(telephone).apply {
        observeForever {
            Log.i("tag", it)
            telephone = it
        }
    }
    var dateOfBirthDayLiveData = MutableLiveData(dateOfBirthDay).apply {
        observeForever {
            Log.i("tag", it)
            dateOfBirthDay = it
        }
    }
    var fullNameLiveData = MutableLiveData(fullName).apply {
        observeForever {
            Log.i("tag", it)
            fullName = it
        }
    }
    var dateLiveData = MutableLiveData(date).apply {
        observeForever {
            Log.i("tag", it)
            date = it
        }
    }
    var birthPlaceLiveData = MutableLiveData(birthPlace).apply {
        observeForever {
            Log.i("tag", it)
            birthPlace = it
        }
    }
    var livingPlaceBeforeWarLiveData = MutableLiveData(livingPlaceBeforeWar).apply {
        observeForever {
            Log.i("tag", it)
            livingPlaceBeforeWar = it
        }
    }
    var addressInArcakhLiveData = MutableLiveData(addressInArcakh).apply {
        observeForever {
            Log.i("tag", it)
            addressInArcakh = it
        }
    }
    var livingTimeLiveData = MutableLiveData(livingTime).apply {
        observeForever {
            Log.i("tag", it)
            livingTime = it
        }
    }
    var familyCountLiveData = MutableLiveData(familyCount).apply {
        observeForever {
            Log.i("tag", it)
            familyCount = it
        }
    }
    var familyMaleCountLiveData = MutableLiveData(familyMaleCount).apply {
        observeForever {
            Log.i("tag", it)
            familyMaleCount = it
        }
    }
    var familyUnder18CountLiveData = MutableLiveData(familyUnder18Count).apply {
        observeForever {
            Log.i("tag", it)
            familyUnder18Count = it
        }
    }
    var familyGenCountLiveData = MutableLiveData(familyGenCount).apply {
        observeForever {
            Log.i("tag", it)
            familyGenCount = it
        }
    }
    var toshakaruLiveData = MutableLiveData(familyMembers.toshakaru).apply {
        observeForever {
            familyMembers.toshakaru = it
        }
    }
    var invalidLiveData = MutableLiveData(familyMembers.invalid).apply {
        observeForever {
            familyMembers.invalid = it
        }
    }

}
