package com.example.questionaryartsakh

import android.util.Log
import androidx.lifecycle.MutableLiveData

data class Blank(var id: Int, var status: Int, var telephone: String = "", var dateOfBirthDay: String = "", var fullName: String = "", var date: String = "",
    var birthPlace: String = "", var livingPlaceBeforeWar: String = "", var addressInArcakh: String = "", var livingTime: String = "", var familyCount: String = "",
    var familyMaleCount: String = "", var familyUnder18Count: String = "", var familyGenCount: String = "", var familyMembers: SubFields = SubFields(),

    var education: SubFields = SubFields(), var languages: Languages = Languages(), var spacialization: String = "", var computerSkill: Boolean = false,
    var driveCar: Boolean = false, var work: SubFields = SubFields(), var workPlace: SubFields = SubFields(), var self_employment: String = "", var otherWorkPlace: String = "",

    var workField: SubFields = SubFields(), var workFieldOther: String = "", var workStatus: SubFields = SubFields(), var workStatusOther: String = "",
    var workDurationInField: String = "", var workDurationInOrganization: String = "", var workDurationInPosition: String = "", var workProgress: SubFields = SubFields(),
    var familyMonthlyIncome: String = "", var monthlyIncome: String = "", var familyIncomeSource: SubFields = SubFields(), var familyIncomeOther: String = "",

    var familyMaterialInsurance: SubFields = SubFields(), var liveBeforeWar: SubFields = SubFields(), var liveBeforeWarOther: String = "", var currentOwner: Owner = Owner(),
    var hasBeforeWar: SubFieldsMultiple = SubFieldsMultiple(), var hasBeforeWarPlace: String = "", var livingPlaceLeaveTime: String = "",
    var countOfFamilyMembersInArmenia: String = "", var countOfFamilyMembersInArcakh: String = "", var countOfDeathFamilyMembers: String = "",
    var leaveReason: SubFields = SubFields(), var leaveReasonOther: String = "", var leavePath: SubFields = SubFields(), var leavePathOther: String = "",
    var currentLivingPlace: String = "", var livingPlaceAfterWar: SubFields = SubFields(), var temporaryLivingPlaceAfterWar: String = "", var livingPlaceAfterWarOther: String = "",
    var currentThings: SubFields = SubFields(), var currentThingsOther: String = "", var currentThingsInNow: SubFieldsMultiple = SubFieldsMultiple(),
    var currentThingsInNowOther: String = "", var materialHelp: SubFields = SubFields(), var materialHelpOther: String = "",

    var home: SubFields = SubFields(), var homeOther: String = "", var owning: SubFieldsMultiple = SubFieldsMultiple(), var owningNowOther: String = "",
    var willLivePlace: SubFields = SubFields(), var willLivePlaceArcakhOther: String = "", var willLivePlaceTemporaryArmenia: String = "", var willLivePlaceArmenia: String = "",
    var willLivePlaceAPH: String = "", var willLivePlaceEurope: String = "", var willLivePlaceOther: String = "", var futurePlans: SubFields = SubFields(),
    var alreadyWork: String = "", var futurePlansOther: String = "", var passport: SubFields = SubFields(), var passportOther: String = "", var maried: SubFields = SubFields(),
    var mariedOther: String = "", var years: String = "", var gender: SubFields = SubFields(), var other: String = "") {

    data class Languages(var armenian: Int = LevelEnum.GOOD.type, var russian: Int = LevelEnum.MIDDLE.type, var english: Int = LevelEnum.BAD.type,
        var other1: Int = LevelEnum.BAD.type, var other2: Int = LevelEnum.BAD.type) {

        enum class LevelEnum(val type: Int) { GOOD(1),
            MIDDLE(2),
            BAD(3),
            NONE(4)
        }
    }

    data class Owner(var car: Int = OwnerEnum.NONE.type, var carCoast: String = "", var carCount: String = "", var garage: Int = OwnerEnum.NONE.type, var garageCoast: String = "",
        var garageSquare: String = "", var garageCount: String = "", var home: Int = OwnerEnum.NONE.type, var homeCoast: String = "", var homeSquare: String = "",
        var homeCount: String = "", var dacha: Int = OwnerEnum.NONE.type, var dachaCoast: String = "", var dachaSquare: String = "", var dachaCount: String = "",
        var organization: Int = OwnerEnum.NONE.type, var organizationCoast: String = "", var organizationSquare: String = "", var organizationCount: String = "",
        var place: Int = OwnerEnum.NONE.type, var placeCoast: String = "", var oplaceSquare: String = "", var placeCount: String = "", var money: Int = OwnerEnum.NONE.type,
        var moneyCoast: String = "", var moneyCount: String = "", var avand: Int = OwnerEnum.NONE.type, var avandCoast: String = "", var avandCount: String = "",
        var hipotek: Int = OwnerEnum.NONE.type, var hipotekCoast: String = "", var hipotekCount: String = "", var golds: Int = OwnerEnum.NONE.type, var goldsCoast: String = "",
        var goldsCount: String = "", var arjetuxt: Int = OwnerEnum.NONE.type, var arjetuxtCoast: String = "", var arjetuxtCount: String = "", var other: Int = OwnerEnum.NONE.type,
        var otherCoast: String = "", var otherSquare: String = "", var otherCount: String = "") {

        enum class OwnerEnum(val type: Int) { MINE(1),
            NOT_ONLY_MINE(2),
            NONE(3)
        }
    }

    data class SubFieldsMultiple(var field1: Int = SubFieldsMultipleEnum.NO.type, var field2: Int = SubFieldsMultipleEnum.NO.type, var field3: Int = SubFieldsMultipleEnum.NO.type,
        var field4: Int = SubFieldsMultipleEnum.NO.type, var field5: Int = SubFieldsMultipleEnum.NO.type, var field6: Int = SubFieldsMultipleEnum.NO.type,
        var field7: Int = SubFieldsMultipleEnum.NO.type, var field8: Int = SubFieldsMultipleEnum.NO.type, var field9: Int = SubFieldsMultipleEnum.NO.type,
        var field10: Int = SubFieldsMultipleEnum.NO.type, var field11: Int = SubFieldsMultipleEnum.NO.type, var field12: Int = SubFieldsMultipleEnum.NO.type,
        var field13: Int = SubFieldsMultipleEnum.NO.type, var field14: Int = SubFieldsMultipleEnum.NO.type, var field15: Int = SubFieldsMultipleEnum.NO.type,
        var field16: Int = SubFieldsMultipleEnum.NO.type, var field17: Int = SubFieldsMultipleEnum.NO.type, var other: Int = SubFieldsMultipleEnum.NO.type) {

        enum class SubFieldsMultipleEnum(val type: Int) { YES_NEW(1),
            YES_OLD(2),
            NO(3)
        }
    }

    data class SubFields(var field1: Boolean = false, var field2: Boolean = false, var field3: Boolean = false, var field4: Boolean = false, var field5: Boolean = false,
        var field6: Boolean = false, var field7: Boolean = false, var field8: Boolean = false, var field9: Boolean = false, var field10: Boolean = false,
        var field11: Boolean = false, var field12: Boolean = false, var field13: Boolean = false, var field14: Boolean = false, var field15: Boolean = false,
        var field16: Boolean = false, var field17: Boolean = false, var field18: Boolean = false, var field19: Boolean = false, var field20: Boolean = false,
        var other: Boolean = false)

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
    var exhibitionerLiveData = MutableLiveData(familyMembers.field1).apply {
        observeForever {
            familyMembers.field1 = it
        }
    }
    var invalidLiveData = MutableLiveData(familyMembers.field2).apply {
        observeForever {
            familyMembers.field2 = it
        }
    }





}
