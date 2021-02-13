package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartFiveViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var livingPlaceLeaveTimeLiveData = MutableLiveData(blank.livingPlaceLeaveTime).apply {
        observeForever {
            blank.livingPlaceLeaveTime = it
        }
    }
    var countOfFamilyMembersInArmeniaLiveData = MutableLiveData(blank.countOfFamilyMembersInArmenia).apply {
        observeForever {
            blank.countOfFamilyMembersInArmenia = it
        }
    }
    var countOfFamilyMembersInArcakhLiveData = MutableLiveData(blank.countOfFamilyMembersInArcakh).apply {
        observeForever {
            blank.countOfFamilyMembersInArcakh = it
        }
    }
    var countOfDeathFamilyMembersLiveData = MutableLiveData(blank.countOfDeathFamilyMembers).apply {
        observeForever {
            blank.countOfDeathFamilyMembers = it
        }
    }
    var leaveReason1LiveData = MutableLiveData(blank.leaveReason.field1).apply {
        observeForever {
            blank.leaveReason.field1 = it
        }
    }

    var leaveReason2LiveData = MutableLiveData(blank.leaveReason.field2).apply {
        observeForever {
            blank.leaveReason.field2 = it
        }
    }

    var leaveReason3LiveData = MutableLiveData(blank.leaveReason.field3).apply {
        observeForever {
            blank.leaveReason.field3 = it
        }
    }

    var leaveReason4LiveData = MutableLiveData(blank.leaveReason.field4).apply {
        observeForever {
            blank.leaveReason.field4 = it
        }
    }

    var leaveReason5LiveData = MutableLiveData(blank.leaveReason.field5).apply {
        observeForever {
            blank.leaveReason.field5 = it
        }
    }

    var leaveReasonOtherFieldLiveData = MutableLiveData(blank.leaveReason.other).apply {
        observeForever {
            blank.leaveReason.other = it
        }
    }

    var leaveReasonOtherLiveData = MutableLiveData(blank.leaveReasonOther).apply {
        observeForever {
            blank.leaveReasonOther = it
        }
    }

    var leavePath1LiveData = MutableLiveData(blank.leavePath.field1).apply {
        observeForever {
            blank.leavePath.field1 = it
        }
    }

    var leavePath2LiveData = MutableLiveData(blank.leavePath.field2).apply {
        observeForever {
            blank.leavePath.field2 = it
        }
    }

    var leavePath3LiveData = MutableLiveData(blank.leavePath.field3).apply {
        observeForever {
            blank.leavePath.field3 = it
        }
    }

    var leavePath4LiveData = MutableLiveData(blank.leavePath.field4).apply {
        observeForever {
            blank.leavePath.field4 = it
        }
    }

    var leavePath5LiveData = MutableLiveData(blank.leavePath.field5).apply {
        observeForever {
            blank.leavePath.field5 = it
        }
    }

    var leavePathOtherFieldLiveData = MutableLiveData(blank.leavePath.other).apply {
        observeForever {
            blank.leavePath.other = it
        }
    }

    var leavePathOtherLiveData = MutableLiveData(blank.leavePathOther).apply {
        observeForever {
            blank.leavePathOther = it
        }
    }
    var currentLivingPlaceLiveData = MutableLiveData(blank.currentLivingPlace).apply {
        observeForever {
            blank.currentLivingPlace = it
        }
    }

    var livingPlaceAfterWar1LiveData = MutableLiveData(blank.livingPlaceAfterWar.field1).apply {
        observeForever {
            blank.livingPlaceAfterWar.field1 = it
        }
    }

    var livingPlaceAfterWar2LiveData = MutableLiveData(blank.livingPlaceAfterWar.field2).apply {
        observeForever {
            blank.livingPlaceAfterWar.field2 = it
        }
    }

    var livingPlaceAfterWar3LiveData = MutableLiveData(blank.livingPlaceAfterWar.field3).apply {
        observeForever {
            blank.livingPlaceAfterWar.field3 = it
        }
    }

    var livingPlaceAfterWar4LiveData = MutableLiveData(blank.livingPlaceAfterWar.field4).apply {
        observeForever {
            blank.livingPlaceAfterWar.field4 = it
        }
    }

    var livingPlaceAfterWar5LiveData = MutableLiveData(blank.livingPlaceAfterWar.field5).apply {
        observeForever {
            blank.livingPlaceAfterWar.field5 = it
        }
    }
    var livingPlaceAfterWar6LiveData = MutableLiveData(blank.livingPlaceAfterWar.field6).apply {
        observeForever {
            blank.livingPlaceAfterWar.field6 = it
        }
    }
    var temporaryLivingPlaceAfterWarLiveData = MutableLiveData(blank.temporaryLivingPlaceAfterWar).apply {
        observeForever {
            blank.temporaryLivingPlaceAfterWar = it
        }
    }
    var livingPlaceAfterWarOtherFieldLiveData = MutableLiveData(blank.livingPlaceAfterWar.other).apply {
        observeForever {
            blank.livingPlaceAfterWar.other = it
        }
    }

    var livingPlaceAfterWarOtherLiveData = MutableLiveData(blank.livingPlaceAfterWarOther).apply {
        observeForever {
            blank.livingPlaceAfterWarOther = it
        }
    }

    var currentThings1LiveData = MutableLiveData(blank.currentThings.field1).apply {
        observeForever {
            blank.currentThings.field1 = it
        }
    }

    var currentThings2LiveData = MutableLiveData(blank.currentThings.field2).apply {
        observeForever {
            blank.currentThings.field2 = it
        }
    }

    var currentThings3LiveData = MutableLiveData(blank.currentThings.field3).apply {
        observeForever {
            blank.currentThings.field3 = it
        }
    }

    var currentThings4LiveData = MutableLiveData(blank.currentThings.field4).apply {
        observeForever {
            blank.currentThings.field4 = it
        }
    }

    var currentThings5LiveData = MutableLiveData(blank.currentThings.field5).apply {
        observeForever {
            blank.currentThings.field5 = it
        }
    }
    var currentThings6LiveData = MutableLiveData(blank.currentThings.field6).apply {
        observeForever {
            blank.currentThings.field6 = it
        }
    }
    var currentThings7LiveData = MutableLiveData(blank.currentThings.field7).apply {
        observeForever {
            blank.currentThings.field7 = it
        }
    }
    var currentThings8LiveData = MutableLiveData(blank.currentThings.field8).apply {
        observeForever {
            blank.currentThings.field8 = it
        }
    }
    var currentThings9LiveData = MutableLiveData(blank.currentThings.field9).apply {
        observeForever {
            blank.currentThings.field9 = it
        }
    }
    var currentThings10LiveData = MutableLiveData(blank.currentThings.field10).apply {
        observeForever {
            blank.currentThings.field6 = it
        }
    }
    var currentThings11LiveData = MutableLiveData(blank.currentThings.field11).apply {
        observeForever {
            blank.currentThings.field11 = it
        }
    }
    var currentThings12LiveData = MutableLiveData(blank.currentThings.field12).apply {
        observeForever {
            blank.currentThings.field12 = it
        }
    }
    var currentThings13LiveData = MutableLiveData(blank.currentThings.field13).apply {
        observeForever {
            blank.currentThings.field13 = it
        }
    }

    var currentThingsOtherLiveData = MutableLiveData(blank.currentThingsOther).apply {
        observeForever {
            blank.livingPlaceAfterWarOther = it
        }
    }

    var currentThingsInNow1YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow1YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow1NoLiveData = MutableLiveData(blank.currentThingsInNow.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow2YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow2YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow2NoLiveData = MutableLiveData(blank.currentThingsInNow.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow3YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow3YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow3NoLiveData = MutableLiveData(blank.currentThingsInNow.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow4YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow4YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow4NoLiveData = MutableLiveData(blank.currentThingsInNow.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow5YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow5YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow5NoLiveData = MutableLiveData(blank.currentThingsInNow.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow6YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow6YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow6NoLiveData = MutableLiveData(blank.currentThingsInNow.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow7YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow7YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow7NoLiveData = MutableLiveData(blank.currentThingsInNow.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow8YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow8YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow8NoLiveData = MutableLiveData(blank.currentThingsInNow.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow9YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow9YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow9NoLiveData = MutableLiveData(blank.currentThingsInNow.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow10YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow10YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow10NoLiveData = MutableLiveData(blank.currentThingsInNow.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow11YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field11 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field11 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow11YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field11 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field11 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow11NoLiveData = MutableLiveData(blank.currentThingsInNow.field11 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field11 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow12YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field12 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field12 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow12YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field12 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field12 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow12NoLiveData = MutableLiveData(blank.currentThingsInNow.field12 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field12 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow13YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field13 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field13 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow13YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field13 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field13 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow13NoLiveData = MutableLiveData(blank.currentThingsInNow.field13 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field13 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow14YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field14 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field14 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow14YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field14 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field14 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow14NoLiveData = MutableLiveData(blank.currentThingsInNow.field14 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field14 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow15YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field15 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field15 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow15YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field15 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field15 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow15NoLiveData = MutableLiveData(blank.currentThingsInNow.field15 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field15 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow16YesNewLiveData = MutableLiveData(blank.currentThingsInNow.field16 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field16 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow16YesOldLiveData = MutableLiveData(blank.currentThingsInNow.field16 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field16 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var currentThingsInNow16NoLiveData = MutableLiveData(blank.currentThingsInNow.field16 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.currentThingsInNow.field16 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }

    var materialHelp1LiveData = MutableLiveData(blank.materialHelp.field1).apply {
        observeForever {
            blank.materialHelp.field1 = it
        }
    }

    var materialHelp2LiveData = MutableLiveData(blank.materialHelp.field2).apply {
        observeForever {
            blank.materialHelp.field2 = it
        }
    }

    var materialHelp3LiveData = MutableLiveData(blank.materialHelp.field3).apply {
        observeForever {
            blank.materialHelp.field3 = it
        }
    }

    var materialHelp4LiveData = MutableLiveData(blank.materialHelp.field4).apply {
        observeForever {
            blank.materialHelp.field4 = it
        }
    }

    var materialHelp5LiveData = MutableLiveData(blank.materialHelp.field5).apply {
        observeForever {
            blank.materialHelp.field5 = it
        }
    }
    var materialHelp6LiveData = MutableLiveData(blank.materialHelp.field6).apply {
        observeForever {
            blank.materialHelp.field6 = it
        }
    }
    var materialHelp7LiveData = MutableLiveData(blank.materialHelp.field7).apply {
        observeForever {
            blank.materialHelp.field7 = it
        }
    }

    var materialHelpOtherFieldLiveData = MutableLiveData(blank.materialHelp.other).apply {
        observeForever {
            blank.materialHelp.other = it
        }
    }

    var materialHelpOtherLiveData = MutableLiveData(blank.materialHelpOther).apply {
        observeForever {
            blank.materialHelpOther = it
        }
    }

}