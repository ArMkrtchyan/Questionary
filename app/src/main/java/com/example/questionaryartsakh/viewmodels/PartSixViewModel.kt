package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartSixViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var home1LiveData = blank.home1LiveData
    var home2LiveData = blank.home2LiveData
    var homeOtherFieldLiveData = blank.homeOtherFieldLiveData
    var homeOtherLiveData = blank.homeOtherLiveData

    var owning1YesNewLiveData = MutableLiveData(blank.owning1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning1YesOldLiveData = MutableLiveData(blank.owning1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning1NoLiveData = MutableLiveData(blank.owning1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owning2YesNewLiveData = MutableLiveData(blank.owning2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning2YesOldLiveData = MutableLiveData(blank.owning2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning2NoLiveData = MutableLiveData(blank.owning2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owning3YesNewLiveData = MutableLiveData(blank.owning3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning3YesOldLiveData = MutableLiveData(blank.owning3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning3NoLiveData = MutableLiveData(blank.owning3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owning4YesNewLiveData = MutableLiveData(blank.owning4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning4YesOldLiveData = MutableLiveData(blank.owning4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning4NoLiveData = MutableLiveData(blank.owning4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owning5YesNewLiveData = MutableLiveData(blank.owning5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning5YesOldLiveData = MutableLiveData(blank.owning5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning5NoLiveData = MutableLiveData(blank.owning5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owning6YesNewLiveData = MutableLiveData(blank.owning6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning6YesOldLiveData = MutableLiveData(blank.owning6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owning6NoLiveData = MutableLiveData(blank.owning6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var owningOtherYesNewLiveData = MutableLiveData(blank.owningOtherFieldLiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owningOtherFieldLiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owningOtherYesOldLiveData = MutableLiveData(blank.owningOtherFieldLiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owningOtherFieldLiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owningOtherNoLiveData = MutableLiveData(blank.owningOtherFieldLiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owningOtherFieldLiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var owningOtherLiveData = blank.owningOtherLiveData

    var willLivePlace1LiveData = blank.willLivePlace1LiveData
    var willLivePlace2LiveData = blank.willLivePlace2LiveData
    var willLivePlaceArcakhOtherLiveData = blank.willLivePlaceArcakhOtherLiveData
    var willLivePlace3LiveData = blank.willLivePlace3LiveData
    var willLivePlaceTemporaryArmeniaLiveData = blank.willLivePlaceTemporaryArmeniaLiveData
    var willLivePlace4LiveData = blank.willLivePlace4LiveData
    var willLivePlaceArmeniaLiveData = blank.willLivePlaceArmeniaLiveData
    var willLivePlace5LiveData = blank.willLivePlace5LiveData
    var willLivePlace6LiveData = blank.willLivePlace6LiveData
    var willLivePlace7LiveData = blank.willLivePlace7LiveData
    var willLivePlaceAPHLiveData = blank.willLivePlaceAPHLiveData
    var willLivePlace8LiveData = blank.willLivePlace8LiveData
    var willLivePlaceEuropeLiveData = blank.willLivePlaceEuropeLiveData
    var willLivePlace9LiveData = blank.willLivePlace9LiveData
    var willLivePlaceOtherFieldLiveData = blank.willLivePlaceOtherFieldLiveData
    var willLivePlaceOtherLiveData = blank.willLivePlaceOtherLiveData
    var futurePlans1LiveData = blank.futurePlans1LiveData
    var futurePlans2LiveData = blank.futurePlans2LiveData
    var futurePlans3LiveData = blank.futurePlans3LiveData
    var alreadyWorkLiveData = blank.alreadyWorkLiveData
    var futurePlans4LiveData = blank.futurePlans4LiveData
    var futurePlans5LiveData = blank.futurePlans5LiveData
    var futurePlansOtherFieldLiveData = blank.futurePlansOtherFieldLiveData
    var futurePlansOtherLiveData = blank.futurePlansOtherLiveData
    var passport1LiveData = blank.passport1LiveData
    var passport2LiveData = blank.passport2LiveData
    var passport3LiveData = blank.passport3LiveData
    var passportOtherFieldLiveData = blank.passportOtherFieldLiveData
    var passportOtherLiveData = blank.passportOtherLiveData
    var maried1LiveData = blank.maried1LiveData
    var maried2LiveData = blank.maried2LiveData
    var maried3LiveData = blank.maried3LiveData
    var maried4LiveData = blank.maried4LiveData
    var maried5LiveData = blank.maried5LiveData
    var mariedOtherFieldLiveData = blank.mariedOtherFieldLiveData
    var mariedOtherLiveData = blank.mariedOtherLiveData
    var yearsLiveData = blank.yearsLiveData
    var gender1LiveData = blank.gender1LiveData
    var gender2LiveData = blank.gender2LiveData
    var otherLiveData = blank.otherLiveData
}