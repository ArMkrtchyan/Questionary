package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
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
    var languageArmenianGoodLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languageArmenianLiveData.postValue(Blank.Languages.LevelEnum.GOOD.type)
        }
    }
    var languageArmenianMiddleLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languageArmenianLiveData.postValue(Blank.Languages.LevelEnum.MIDDLE.type)
        }
    }
    var languageArmenianBadLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languageArmenianLiveData.postValue(Blank.Languages.LevelEnum.BAD.type)
        }
    }
    var languageArmenianNonLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languageArmenianLiveData.postValue(Blank.Languages.LevelEnum.NONE.type)
        }
    }
    var languageRussianLiveDataGoodLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languageRussianLiveData.postValue(Blank.Languages.LevelEnum.GOOD.type)
        }
    }
    var languageRussianLiveDataMiddleLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languageRussianLiveData.postValue(Blank.Languages.LevelEnum.MIDDLE.type)
        }
    }
    var languageRussianLiveDataBadLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languageRussianLiveData.postValue(Blank.Languages.LevelEnum.BAD.type)
        }
    }
    var languageRussianLiveDataNonLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languageRussianLiveData.postValue(Blank.Languages.LevelEnum.NONE.type)
        }
    }
    var languageEnglishGoodLiveData = MutableLiveData(blank.languageEnglishLiveData.value == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languageEnglishLiveData.postValue(Blank.Languages.LevelEnum.GOOD.type)
        }
    }
    var languageEnglishMiddleLiveData = MutableLiveData(blank.languageEnglishLiveData.value == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languageEnglishLiveData.postValue(Blank.Languages.LevelEnum.MIDDLE.type)
        }
    }
    var languageEnglishBadLiveData = MutableLiveData(blank.languageEnglishLiveData.value == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languageEnglishLiveData.postValue(Blank.Languages.LevelEnum.BAD.type)
        }
    }
    var languageEnglishNonLiveData = MutableLiveData(blank.languageEnglishLiveData.value == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languageEnglishLiveData.postValue(Blank.Languages.LevelEnum.NONE.type)
        }
    }
    var languageOther1GoodLiveData = MutableLiveData(blank.languageOther1LiveData.value == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languageOther1LiveData.postValue(Blank.Languages.LevelEnum.GOOD.type)
        }
    }
    var languageOther1MiddleLiveData = MutableLiveData(blank.languageOther1LiveData.value == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languageOther1LiveData.postValue(Blank.Languages.LevelEnum.MIDDLE.type)
        }
    }
    var languageOther1BadLiveData = MutableLiveData(blank.languageOther1LiveData.value == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languageOther1LiveData.postValue(Blank.Languages.LevelEnum.BAD.type)
        }
    }

    var languageOther2GoodLiveData = MutableLiveData(blank.languageOther2LiveData.value == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languageOther2LiveData.postValue(Blank.Languages.LevelEnum.GOOD.type)
        }
    }
    var languageOther2MiddleLiveData = MutableLiveData(blank.languageOther2LiveData.value == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languageOther2LiveData.postValue(Blank.Languages.LevelEnum.MIDDLE.type)
        }
    }
    var languageOther2BadLiveData = MutableLiveData(blank.languageOther2LiveData.value == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languageOther2LiveData.postValue(Blank.Languages.LevelEnum.BAD.type)
        }
    }

    var langOther1LiveData = blank.langOther1LiveData
    var langOther2LiveData = blank.langOther2LiveData

    var workField1LiveData = blank.workField1LiveData
    var workField2LiveData = blank.workField2LiveData
    var workField3LiveData = blank.workField3LiveData
    var workField4LiveData = blank.workField4LiveData
    var workField5LiveData = blank.workField5LiveData
    var workPlaceField1LiveData = blank.workPlaceField1LiveData
    var workPlaceField2LiveData = blank.workPlaceField2LiveData
    var workPlaceField3LiveData = blank.workPlaceField3LiveData
    var workPlaceField4LiveData = blank.workPlaceField4LiveData
    var workPlaceField5LiveData = blank.workPlaceField5LiveData
    var selfEmploymentLiveData = blank.selfEmploymentLiveData
    var workPlaceField6LiveData = blank.workPlaceField6LiveData
    var otherWorkPlaceLiveData = blank.otherWorkPlaceLiveData
    var computerSkillLiveData = blank.computerSkillLiveData
    var driveCarLiveData = blank.driveCarLiveData

}