package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartFiveViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var livingPlaceLeaveTimeLiveData = blank.livingPlaceLeaveTimeLiveData
    var countOfFamilyMembersInArmeniaLiveData = blank.countOfFamilyMembersInArmeniaLiveData
    var countOfFamilyMembersInArcakhLiveData = blank.countOfFamilyMembersInArcakhLiveData
    var countOfDeathFamilyMembersLiveData = blank.countOfDeathFamilyMembersLiveData
    var leaveReason1LiveData = blank.leaveReason1LiveData
    var leaveReason2LiveData = blank.leaveReason2LiveData
    var leaveReason3LiveData = blank.leaveReason3LiveData
    var leaveReason4LiveData = blank.leaveReason4LiveData
    var leaveReason5LiveData = blank.leaveReason5LiveData
    var leaveReasonOtherFieldLiveData = blank.leaveReasonOtherFieldLiveData
    var leaveReasonOtherLiveData = blank.leaveReasonOtherLiveData
    var leavePath1LiveData = blank.leavePath1LiveData
    var leavePath2LiveData = blank.leavePath2LiveData
    var leavePath3LiveData = blank.leavePath3LiveData
    var leavePath4LiveData = blank.leavePath4LiveData
    var leavePath5LiveData = blank.leavePath5LiveData
    var leavePathOtherFieldLiveData = blank.leavePathOtherFieldLiveData
    var leavePathOtherLiveData = blank.leavePathOtherLiveData
    var currentLivingPlaceLiveData = blank.currentLivingPlaceLiveData
    var livingPlaceAfterWar1LiveData = blank.livingPlaceAfterWar1LiveData
    var livingPlaceAfterWar2LiveData = blank.livingPlaceAfterWar2LiveData
    var livingPlaceAfterWar3LiveData = blank.livingPlaceAfterWar3LiveData
    var livingPlaceAfterWar4LiveData = blank.livingPlaceAfterWar4LiveData
    var livingPlaceAfterWar5LiveData = blank.livingPlaceAfterWar5LiveData
    var livingPlaceAfterWar6LiveData = blank.livingPlaceAfterWar6LiveData
    var temporaryLivingPlaceAfterWarLiveData = blank.temporaryLivingPlaceAfterWarLiveData
    var livingPlaceAfterWarOtherFieldLiveData = blank.livingPlaceAfterWarOtherFieldLiveData
    var livingPlaceAfterWarOtherLiveData = blank.livingPlaceAfterWarOtherLiveData
    var currentThings1LiveData = blank.currentThings1LiveData
    var currentThings2LiveData = blank.currentThings2LiveData
    var currentThings3LiveData = blank.currentThings3LiveData
    var currentThings4LiveData = blank.currentThings4LiveData
    var currentThings5LiveData = blank.currentThings5LiveData
    var currentThings6LiveData = blank.currentThings6LiveData
    var currentThings7LiveData = blank.currentThings7LiveData
    var currentThings8LiveData = blank.currentThings8LiveData
    var currentThings9LiveData = blank.currentThings9LiveData
    var currentThings10LiveData = blank.currentThings10LiveData
    var currentThings11LiveData = blank.currentThings11LiveData
    var currentThings12LiveData = blank.currentThings12LiveData
    var currentThings13LiveData = blank.currentThings13LiveData
    var currentThingsOtherLiveData = blank.currentThingsOtherLiveData

    var currentThingsInNow1YesNewLiveData = MutableLiveData(blank.currentThingsInNow1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow1YesOldLiveData = MutableLiveData(blank.currentThingsInNow1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow1NoLiveData = MutableLiveData(blank.currentThingsInNow1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow2YesNewLiveData = MutableLiveData(blank.currentThingsInNow2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow2YesOldLiveData = MutableLiveData(blank.currentThingsInNow2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow2NoLiveData = MutableLiveData(blank.currentThingsInNow2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow3YesNewLiveData = MutableLiveData(blank.currentThingsInNow3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow3YesOldLiveData = MutableLiveData(blank.currentThingsInNow3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow3NoLiveData = MutableLiveData(blank.currentThingsInNow3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow4YesNewLiveData = MutableLiveData(blank.currentThingsInNow4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow4YesOldLiveData = MutableLiveData(blank.currentThingsInNow4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow4NoLiveData = MutableLiveData(blank.currentThingsInNow4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow5YesNewLiveData = MutableLiveData(blank.currentThingsInNow5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow5YesOldLiveData = MutableLiveData(blank.currentThingsInNow5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow5NoLiveData = MutableLiveData(blank.currentThingsInNow5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow6YesNewLiveData = MutableLiveData(blank.currentThingsInNow6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow6YesOldLiveData = MutableLiveData(blank.currentThingsInNow6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow6NoLiveData = MutableLiveData(blank.currentThingsInNow6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow7YesNewLiveData = MutableLiveData(blank.currentThingsInNow7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow7YesOldLiveData = MutableLiveData(blank.currentThingsInNow7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow7NoLiveData = MutableLiveData(blank.currentThingsInNow7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow8YesNewLiveData = MutableLiveData(blank.currentThingsInNow8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow8YesOldLiveData = MutableLiveData(blank.currentThingsInNow8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow8NoLiveData = MutableLiveData(blank.currentThingsInNow8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow9YesNewLiveData = MutableLiveData(blank.currentThingsInNow9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow9YesOldLiveData = MutableLiveData(blank.currentThingsInNow9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow9NoLiveData = MutableLiveData(blank.currentThingsInNow9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow10YesNewLiveData = MutableLiveData(blank.currentThingsInNow10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow10YesOldLiveData = MutableLiveData(blank.currentThingsInNow10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow10NoLiveData = MutableLiveData(blank.currentThingsInNow10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow11YesNewLiveData = MutableLiveData(blank.currentThingsInNow11LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow11LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow11YesOldLiveData = MutableLiveData(blank.currentThingsInNow11LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow11LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow11NoLiveData = MutableLiveData(blank.currentThingsInNow11LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow11LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow12YesNewLiveData = MutableLiveData(blank.currentThingsInNow12LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow12LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow12YesOldLiveData = MutableLiveData(blank.currentThingsInNow12LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow12LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow12NoLiveData = MutableLiveData(blank.currentThingsInNow12LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow12LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow13YesNewLiveData = MutableLiveData(blank.currentThingsInNow13LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow13LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow13YesOldLiveData = MutableLiveData(blank.currentThingsInNow13LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow13LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow13NoLiveData = MutableLiveData(blank.currentThingsInNow13LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow13LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow14YesNewLiveData = MutableLiveData(blank.currentThingsInNow14LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow14LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow14YesOldLiveData = MutableLiveData(blank.currentThingsInNow14LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow14LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow14NoLiveData = MutableLiveData(blank.currentThingsInNow14LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow14LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow15YesNewLiveData = MutableLiveData(blank.currentThingsInNow15LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow15LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow15YesOldLiveData = MutableLiveData(blank.currentThingsInNow15LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow15LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow15NoLiveData = MutableLiveData(blank.currentThingsInNow15LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow15LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow16YesNewLiveData = MutableLiveData(blank.currentThingsInNow16LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow16LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow16YesOldLiveData = MutableLiveData(blank.currentThingsInNow16LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow16LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var currentThingsInNow16NoLiveData = MutableLiveData(blank.currentThingsInNow16LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow16LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }

    var materialHelp1LiveData = blank.materialHelp1LiveData
    var materialHelp2LiveData = blank.materialHelp2LiveData
    var materialHelp3LiveData = blank.materialHelp3LiveData
    var materialHelp4LiveData = blank.materialHelp4LiveData
    var materialHelp5LiveData = blank.materialHelp5LiveData
    var materialHelp6LiveData = blank.materialHelp6LiveData
    var materialHelp7LiveData = blank.materialHelp7LiveData
    var materialHelpOtherFieldLiveData = blank.materialHelpOtherFieldLiveData
    var materialHelpOtherLiveData = blank.materialHelpOtherLiveData

}