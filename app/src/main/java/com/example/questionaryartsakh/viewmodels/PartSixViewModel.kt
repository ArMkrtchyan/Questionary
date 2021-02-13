package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartSixViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var home1LiveData = MutableLiveData(blank.home.field1).apply {
        observeForever {
            blank.home.field1 = it
        }
    }
    var home2LiveData = MutableLiveData(blank.home.field2).apply {
        observeForever {
            blank.home.field2 = it
        }
    }
    var homeOtherFieldLiveData = MutableLiveData(blank.home.other).apply {
        observeForever {
            blank.home.other = it
        }
    }

    var homeOtherLiveData = MutableLiveData(blank.homeOther).apply {
        observeForever {
            blank.homeOther = it
        }
    }

    var owning1YesNewLiveData = MutableLiveData(blank.owning.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning1YesOldLiveData = MutableLiveData(blank.owning.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning1NoLiveData = MutableLiveData(blank.owning.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owning2YesNewLiveData = MutableLiveData(blank.owning.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning2YesOldLiveData = MutableLiveData(blank.owning.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning2NoLiveData = MutableLiveData(blank.owning.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owning3YesNewLiveData = MutableLiveData(blank.owning.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning3YesOldLiveData = MutableLiveData(blank.owning.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning3NoLiveData = MutableLiveData(blank.owning.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owning4YesNewLiveData = MutableLiveData(blank.owning.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning4YesOldLiveData = MutableLiveData(blank.owning.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning4NoLiveData = MutableLiveData(blank.owning.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owning5YesNewLiveData = MutableLiveData(blank.owning.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning5YesOldLiveData = MutableLiveData(blank.owning.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning5NoLiveData = MutableLiveData(blank.owning.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owning6YesNewLiveData = MutableLiveData(blank.owning.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning6YesOldLiveData = MutableLiveData(blank.owning.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owning6NoLiveData = MutableLiveData(blank.owning.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owningOtherYesNewLiveData = MutableLiveData(blank.owning.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owningOtherYesOldLiveData = MutableLiveData(blank.owning.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var owningOtherNoLiveData = MutableLiveData(blank.owning.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.owning.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var owningOtherLiveData = MutableLiveData(blank.owningNowOther).apply {
        observeForever {
            blank.owningNowOther = it
        }
    }

    var willLivePlace1LiveData = MutableLiveData(blank.willLivePlace.field1).apply {
        observeForever {
            blank.willLivePlace.field1 = it
        }
    }
    var willLivePlace2LiveData = MutableLiveData(blank.willLivePlace.field2).apply {
        observeForever {
            blank.willLivePlace.field2 = it
        }
    }
    var willLivePlaceArcakhOtherLiveData = MutableLiveData(blank.willLivePlaceArcakhOther).apply {
        observeForever {
            blank.willLivePlaceArcakhOther = it
        }
    }
    var willLivePlace3LiveData = MutableLiveData(blank.willLivePlace.field3).apply {
        observeForever {
            blank.willLivePlace.field3 = it
        }
    }
    var willLivePlaceTemporaryArmeniaLiveData = MutableLiveData(blank.willLivePlaceTemporaryArmenia).apply {
        observeForever {
            blank.willLivePlaceTemporaryArmenia = it
        }
    }
    var willLivePlace4LiveData = MutableLiveData(blank.willLivePlace.field4).apply {
        observeForever {
            blank.willLivePlace.field4 = it
        }
    }
    var willLivePlaceArmeniaLiveData = MutableLiveData(blank.willLivePlaceArmenia).apply {
        observeForever {
            blank.willLivePlaceArmenia = it
        }
    }
    var willLivePlace5LiveData = MutableLiveData(blank.willLivePlace.field5).apply {
        observeForever {
            blank.willLivePlace.field5 = it
        }
    }
    var willLivePlace6LiveData = MutableLiveData(blank.willLivePlace.field6).apply {
        observeForever {
            blank.willLivePlace.field6 = it
        }
    }
    var willLivePlace7LiveData = MutableLiveData(blank.willLivePlace.field7).apply {
        observeForever {
            blank.willLivePlace.field7 = it
        }
    }
    var willLivePlaceAPHLiveData = MutableLiveData(blank.willLivePlaceAPH).apply {
        observeForever {
            blank.willLivePlaceAPH = it
        }
    }
    var willLivePlace8LiveData = MutableLiveData(blank.willLivePlace.field8).apply {
        observeForever {
            blank.willLivePlace.field8 = it
        }
    }
    var willLivePlaceEuropeLiveData = MutableLiveData(blank.willLivePlaceEurope).apply {
        observeForever {
            blank.willLivePlaceEurope = it
        }
    }
    var willLivePlace9LiveData = MutableLiveData(blank.willLivePlace.field9).apply {
        observeForever {
            blank.willLivePlace.field9 = it
        }
    }

    var willLivePlaceOtherFieldLiveData = MutableLiveData(blank.willLivePlace.other).apply {
        observeForever {
            blank.willLivePlace.other = it
        }
    }
    var willLivePlaceOtherLiveData = MutableLiveData(blank.owning.other).apply {
        observeForever {
            blank.owning.other = it
        }
    }
    var futurePlans1LiveData = MutableLiveData(blank.futurePlans.field1).apply {
        observeForever {
            blank.futurePlans.field1 = it
        }
    }
    var futurePlans2LiveData = MutableLiveData(blank.futurePlans.field2).apply {
        observeForever {
            blank.futurePlans.field2 = it
        }
    }
    var futurePlans3LiveData = MutableLiveData(blank.futurePlans.field3).apply {
        observeForever {
            blank.futurePlans.field3 = it
        }
    }
    var alreadyWorkLiveData = MutableLiveData(blank.alreadyWork).apply {
        observeForever {
            blank.alreadyWork = it
        }
    }
    var futurePlans4LiveData = MutableLiveData(blank.futurePlans.field4).apply {
        observeForever {
            blank.futurePlans.field4 = it
        }
    }
    var futurePlans5LiveData = MutableLiveData(blank.futurePlans.field5).apply {
        observeForever {
            blank.futurePlans.field5 = it
        }
    }
    var futurePlansOtherFieldLiveData = MutableLiveData(blank.futurePlans.other).apply {
        observeForever {
            blank.futurePlans.other = it
        }
    }
    var futurePlansOtherLiveData = MutableLiveData(blank.futurePlansOther).apply {
        observeForever {
            blank.futurePlansOther = it
        }
    }

    var passport1LiveData = MutableLiveData(blank.passport.field1).apply {
        observeForever {
            blank.passport.field1 = it
        }
    }
    var passport2LiveData = MutableLiveData(blank.passport.field2).apply {
        observeForever {
            blank.passport.field2 = it
        }
    }
    var passport3LiveData = MutableLiveData(blank.passport.field3).apply {
        observeForever {
            blank.passport.field3 = it
        }
    }
    var passportOtherFieldLiveData = MutableLiveData(blank.passport.other).apply {
        observeForever {
            blank.passport.other = it
        }
    }
    var passportOtherLiveData = MutableLiveData(blank.passportOther).apply {
        observeForever {
            blank.passportOther = it
        }
    }

    var maried1LiveData = MutableLiveData(blank.maried.field1).apply {
        observeForever {
            blank.maried.field1 = it
        }
    }
    var maried2LiveData = MutableLiveData(blank.maried.field2).apply {
        observeForever {
            blank.maried.field2 = it
        }
    }
    var maried3LiveData = MutableLiveData(blank.maried.field3).apply {
        observeForever {
            blank.maried.field3 = it
        }
    }
    var maried4LiveData = MutableLiveData(blank.maried.field4).apply {
        observeForever {
            blank.maried.field4 = it
        }
    }
    var maried5LiveData = MutableLiveData(blank.maried.field5).apply {
        observeForever {
            blank.maried.field5 = it
        }
    }
    var mariedOtherFieldLiveData = MutableLiveData(blank.maried.other).apply {
        observeForever {
            blank.maried.other = it
        }
    }
    var mariedOtherLiveData = MutableLiveData(blank.mariedOther).apply {
        observeForever {
            blank.mariedOther = it
        }
    }
    var yearsLiveData = MutableLiveData(blank.years).apply {
        observeForever {
            blank.years = it
        }
    }

    var gender1LiveData = MutableLiveData(blank.gender.field1).apply {
        observeForever {
            blank.gender.field1 = it
        }
    }
    var gender2LiveData = MutableLiveData(blank.gender.field2).apply {
        observeForever {
            blank.gender.field2 = it
        }
    }

    var otherLiveData = MutableLiveData(blank.other).apply {
        observeForever {
            blank.other = it
        }
    }

}