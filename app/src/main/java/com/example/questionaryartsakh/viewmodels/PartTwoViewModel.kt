package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartTwoViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var educationField1LiveData = MutableLiveData(blank.education.field1).apply {
        observeForever {
            blank.education.field1 = it
        }
    }
    var educationField2LiveData = MutableLiveData(blank.education.field2).apply {
        observeForever {
            blank.education.field2 = it
        }
    }
    var educationField3LiveData = MutableLiveData(blank.education.field3).apply {
        observeForever {
            blank.education.field3 = it
        }
    }
    var educationField4LiveData = MutableLiveData(blank.education.field4).apply {
        observeForever {
            blank.education.field4 = it
        }
    }
    var educationField5LiveData = MutableLiveData(blank.education.field5).apply {
        observeForever {
            blank.education.field5 = it
        }
    }
    var educationField6LiveData = MutableLiveData(blank.education.field6).apply {
        observeForever {
            blank.education.field6 = it
        }
    }
    var spacializationLiveData = MutableLiveData(blank.spacialization).apply {
        observeForever {
            blank.spacialization = it
        }
    }
    var languageArmenianGoodLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languages.armenian = Blank.Languages.LevelEnum.GOOD.type
        }
    }
    var languageArmenianMiddleLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languages.armenian = Blank.Languages.LevelEnum.MIDDLE.type
        }
    }
    var languageArmenianBadLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languages.armenian = Blank.Languages.LevelEnum.BAD.type
        }
    }
    var languageArmenianNonLiveData = MutableLiveData(blank.languages.armenian == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languages.armenian = Blank.Languages.LevelEnum.NONE.type
        }
    }
    var languageRussianLiveDataGoodLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languages.russian = Blank.Languages.LevelEnum.GOOD.type
        }
    }
    var languageRussianLiveDataMiddleLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languages.russian = Blank.Languages.LevelEnum.MIDDLE.type
        }
    }
    var languageRussianLiveDataBadLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languages.russian = Blank.Languages.LevelEnum.BAD.type
        }
    }
    var languageRussianLiveDataNonLiveData = MutableLiveData(blank.languages.russian == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languages.russian = Blank.Languages.LevelEnum.NONE.type
        }
    }
    var languageEnglishGoodLiveData = MutableLiveData(blank.languages.english == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languages.english = Blank.Languages.LevelEnum.GOOD.type
        }
    }
    var languageEnglishMiddleLiveData = MutableLiveData(blank.languages.english == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languages.english = Blank.Languages.LevelEnum.MIDDLE.type
        }
    }
    var languageEnglishBadLiveData = MutableLiveData(blank.languages.english == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languages.english = Blank.Languages.LevelEnum.BAD.type
        }
    }
    var languageEnglishNonLiveData = MutableLiveData(blank.languages.english == Blank.Languages.LevelEnum.NONE.type).apply {
        observeForever {
            if (it) blank.languages.english = Blank.Languages.LevelEnum.NONE.type
        }
    }
    var languageOther1GoodLiveData = MutableLiveData(blank.languages.other1 == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languages.other1 = Blank.Languages.LevelEnum.GOOD.type
        }
    }
    var languageOther1MiddleLiveData = MutableLiveData(blank.languages.other1 == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languages.other1 = Blank.Languages.LevelEnum.MIDDLE.type
        }
    }
    var languageOther1BadLiveData = MutableLiveData(blank.languages.other1 == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languages.other1 = Blank.Languages.LevelEnum.BAD.type
        }
    }

    var languageOther2GoodLiveData = MutableLiveData(blank.languages.other2 == Blank.Languages.LevelEnum.GOOD.type).apply {
        observeForever {
            if (it) blank.languages.other2 = Blank.Languages.LevelEnum.GOOD.type
        }
    }
    var languageOther2MiddleLiveData = MutableLiveData(blank.languages.other2 == Blank.Languages.LevelEnum.MIDDLE.type).apply {
        observeForever {
            if (it) blank.languages.other2 = Blank.Languages.LevelEnum.MIDDLE.type
        }
    }
    var languageOther2BadLiveData = MutableLiveData(blank.languages.other2 == Blank.Languages.LevelEnum.BAD.type).apply {
        observeForever {
            if (it) blank.languages.other2 = Blank.Languages.LevelEnum.BAD.type
        }
    }

    var langOther1LiveData = MutableLiveData(blank.langOther1).apply {
        observeForever {
            blank.langOther1 = it
        }
    }
    var langOther2LiveData = MutableLiveData(blank.langOther2).apply {
        observeForever {
            blank.langOther2 = it
        }
    }

    var workField1LiveData = MutableLiveData(blank.work.field1).apply {
        observeForever {
            blank.work.field1 = it
        }
    }
    var workField2LiveData = MutableLiveData(blank.work.field2).apply {
        observeForever {
            blank.work.field2 = it
        }
    }
    var workField3LiveData = MutableLiveData(blank.work.field3).apply {
        observeForever {
            blank.work.field3 = it
        }
    }
    var workField4LiveData = MutableLiveData(blank.work.field4).apply {
        observeForever {
            blank.work.field4 = it
        }
    }
    var workField5LiveData = MutableLiveData(blank.work.field5).apply {
        observeForever {
            blank.work.field5 = it
        }
    }
    var workPlaceField1LiveData = MutableLiveData(blank.workPlace.field1).apply {
        observeForever {
            blank.workPlace.field1 = it
        }
    }
    var workPlaceField2LiveData = MutableLiveData(blank.workPlace.field2).apply {
        observeForever {
            blank.workPlace.field2 = it
        }
    }
    var workPlaceField3LiveData = MutableLiveData(blank.workPlace.field3).apply {
        observeForever {
            blank.workPlace.field3 = it
        }
    }
    var workPlaceField4LiveData = MutableLiveData(blank.workPlace.field4).apply {
        observeForever {
            blank.workPlace.field4 = it
        }
    }
    var workPlaceField5LiveData = MutableLiveData(blank.workPlace.field5).apply {
        observeForever {
            blank.workPlace.field5 = it
        }
    }
    var selfEmploymentLiveData = MutableLiveData(blank.self_employment).apply {
        observeForever {
            blank.self_employment = it
        }
    }
    var workPlaceField6LiveData = MutableLiveData(blank.workPlace.field6).apply {
        observeForever {
            blank.workPlace.field6 = it
        }
    }
    var otherWorkPlaceLiveData = MutableLiveData(blank.otherWorkPlace).apply {
        observeForever {
            blank.otherWorkPlace = it
        }
    }
    var computerSkillLiveData = MutableLiveData(blank.computerSkill).apply {
        observeForever {
            blank.computerSkill = it
        }
    }
    var driveCarLiveData = MutableLiveData(blank.driveCar).apply {
        observeForever {
            blank.driveCar = it
        }
    }

}