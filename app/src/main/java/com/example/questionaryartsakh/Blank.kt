package com.example.questionaryartsakh

import android.util.Log
import androidx.lifecycle.MutableLiveData

data class Blank(var id: Int, var status: Int, var telephone: String = "", var dateOfBirthDay: String = "", var fullName: String = "", var date: String = "",
    var birthPlace: String = "", var livingPlaceBeforeWar: String = "", var addressInArcakh: String = "", var livingTime: String = "", var familyCount: String = "",
    var familyMaleCount: String = "", var familyUnder18Count: String = "", var familyGenCount: String = "", var familyMembers: SubFields = SubFields(),

    var education: SubFields = SubFields(), var languages: Languages = Languages(), var langOther1: String = "", var langOther2: String = "", var spacialization: String = "",
    var computerSkill: Boolean = false, var driveCar: Boolean = false, var work: SubFields = SubFields(), var workPlace: SubFields = SubFields(), var self_employment: String = "",
    var otherWorkPlace: String = "",

    var workField: SubFields = SubFields(), var workFieldOther: String = "", var workStatus: SubFields = SubFields(), var workStatusOther: String = "",
    var workDurationInField: String = "", var workDurationInOrganization: String = "", var workDurationInPosition: String = "", var workProgress: SubFields = SubFields(),
    var familyMonthlyIncome: String = "", var monthlyIncome: String = "", var familyIncomeSource: SubFields = SubFields(), var familyIncomeOther: String = "",

    var familyMaterialInsurance: SubFields = SubFields(), var liveBeforeWar: SubFields = SubFields(), var liveBeforeWarOther: String = "", var currentOwner: Owner = Owner(),
    var hasBeforeWar: SubFieldsMultiple = SubFieldsMultiple(), var hasBeforeWarPlace: String = "",

    var livingPlaceLeaveTime: String = "", var countOfFamilyMembersInArmenia: String = "", var countOfFamilyMembersInArcakh: String = "",
    var countOfDeathFamilyMembers: String = "", var leaveReason: SubFields = SubFields(), var leaveReasonOther: String = "", var leavePath: SubFields = SubFields(),
    var leavePathOther: String = "", var currentLivingPlace: String = "", var livingPlaceAfterWar: SubFields = SubFields(), var temporaryLivingPlaceAfterWar: String = "",
    var livingPlaceAfterWarOther: String = "", var currentThings: SubFields = SubFields(), var currentThingsOther: String = "",
    var currentThingsInNow: SubFieldsMultiple = SubFieldsMultiple(), var currentThingsInNowOther: String = "", var materialHelp: SubFields = SubFields(),
    var materialHelpOther: String = "",

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
        var place: Int = OwnerEnum.NONE.type, var placeCoast: String = "", var placeSquare: String = "", var placeCount: String = "", var money: Int = OwnerEnum.NONE.type,
        var moneyCoast: String = "", var moneyCount: String = "", var avand: Int = OwnerEnum.NONE.type, var avandCoast: String = "", var avandCount: String = "",
        var hipotek: Int = OwnerEnum.NONE.type, var hipotekCoast: String = "", var hipotekCount: String = "", var golds: Int = OwnerEnum.NONE.type, var goldsCoast: String = "",
        var goldsCount: String = "", var arjetuxt: Int = OwnerEnum.NONE.type, var arjetuxtCoast: String = "", var arjetuxtCount: String = "", var other: Int = OwnerEnum.NONE.type,
        var otherName: String = "", var otherCoast: String = "", var otherSquare: String = "", var otherCount: String = "") {

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
        var field16: Int = SubFieldsMultipleEnum.NO.type, var field17: Int = SubFieldsMultipleEnum.NO.type, var other: String = "") {

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

    //Page 1

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

    //Page 2

    var educationField1LiveData = MutableLiveData(education.field1).apply {
        observeForever {
            education.field1 = it
        }
    }
    var educationField2LiveData = MutableLiveData(education.field2).apply {
        observeForever {
            education.field2 = it
        }
    }
    var educationField3LiveData = MutableLiveData(education.field3).apply {
        observeForever {
            education.field3 = it
        }
    }
    var educationField4LiveData = MutableLiveData(education.field4).apply {
        observeForever {
            education.field4 = it
        }
    }
    var educationField5LiveData = MutableLiveData(education.field5).apply {
        observeForever {
            education.field5 = it
        }
    }
    var educationField6LiveData = MutableLiveData(education.field6).apply {
        observeForever {
            education.field6 = it
        }
    }
    var spacializationLiveData = MutableLiveData(spacialization).apply {
        observeForever {
            spacialization = it
        }
    }

    var languageArmenianLiveData = MutableLiveData(languages.armenian).apply {
        observeForever {
            languages.armenian = it
        }
    }
    var languageRussianLiveData = MutableLiveData(languages.russian).apply {
        observeForever {
            languages.armenian = it
        }
    }
    var languageEnglishLiveData = MutableLiveData(languages.english).apply {
        observeForever {
            languages.armenian = it
        }
    }
    var languageOther1LiveData = MutableLiveData(languages.other1).apply {
        observeForever {
            languages.armenian = it
        }
    }
    var langOther1LiveData = MutableLiveData(langOther1).apply {
        observeForever {
            langOther1 = it
        }
    }
    var languageOther2LiveData = MutableLiveData(languages.other2).apply {
        observeForever {
            languages.armenian = it
        }
    }
    var langOther2LiveData = MutableLiveData(langOther1).apply {
        observeForever {
            langOther1 = it
        }
    }

    var computerSkillLiveData = MutableLiveData(computerSkill).apply {
        observeForever {
            computerSkill = it
        }
    }
    var driveCarLiveData = MutableLiveData(driveCar).apply {
        observeForever {
            driveCar = it
        }
    }

    var workField1LiveData = MutableLiveData(work.field1).apply {
        observeForever {
            work.field1 = it
        }
    }
    var workField2LiveData = MutableLiveData(work.field2).apply {
        observeForever {
            work.field2 = it
        }
    }
    var workField3LiveData = MutableLiveData(work.field3).apply {
        observeForever {
            work.field3 = it
        }
    }
    var workField4LiveData = MutableLiveData(work.field4).apply {
        observeForever {
            work.field4 = it
        }
    }
    var workField5LiveData = MutableLiveData(work.field5).apply {
        observeForever {
            work.field5 = it
        }
    }
    var workPlaceField1LiveData = MutableLiveData(workPlace.field1).apply {
        observeForever {
            workPlace.field1 = it
        }
    }
    var workPlaceField2LiveData = MutableLiveData(workPlace.field2).apply {
        observeForever {
            workPlace.field2 = it
        }
    }
    var workPlaceField3LiveData = MutableLiveData(workPlace.field3).apply {
        observeForever {
            workPlace.field3 = it
        }
    }
    var workPlaceField4LiveData = MutableLiveData(workPlace.field4).apply {
        observeForever {
            workPlace.field4 = it
        }
    }
    var workPlaceField5LiveData = MutableLiveData(workPlace.field5).apply {
        observeForever {
            workPlace.field5 = it
        }
    }
    var selfEmploymentLiveData = MutableLiveData(self_employment).apply {
        observeForever {
            self_employment = it
        }
    }
    var workPlaceField6LiveData = MutableLiveData(workPlace.field6).apply {
        observeForever {
            workPlace.field6 = it
        }
    }
    var otherWorkPlaceLiveData = MutableLiveData(otherWorkPlace).apply {
        observeForever {
            otherWorkPlace = it
        }
    }

    //Page 3

    var workSpecialization1LiveData = MutableLiveData(workField.field1).apply {
        observeForever {
            workField.field1 = it
        }
    }
    var workSpecialization2LiveData = MutableLiveData(workField.field2).apply {
        observeForever {
            workField.field2 = it
        }
    }
    var workSpecialization3LiveData = MutableLiveData(workField.field3).apply {
        observeForever {
            workField.field3 = it
        }
    }
    var workSpecialization4LiveData = MutableLiveData(workField.field4).apply {
        observeForever {
            workField.field4 = it
        }
    }
    var workSpecialization5LiveData = MutableLiveData(workField.field5).apply {
        observeForever {
            workField.field5 = it
        }
    }
    var workSpecialization6LiveData = MutableLiveData(workField.field6).apply {
        observeForever {
            workField.field6 = it
        }
    }
    var workSpecialization7LiveData = MutableLiveData(workField.field7).apply {
        observeForever {
            workField.field7 = it
        }
    }
    var workSpecialization8LiveData = MutableLiveData(workField.field8).apply {
        observeForever {
            workField.field8 = it
        }
    }
    var workSpecialization9LiveData = MutableLiveData(workField.field9).apply {
        observeForever {
            workField.field9 = it
        }
    }
    var workSpecialization10LiveData = MutableLiveData(workField.field10).apply {
        observeForever {
            workField.field10 = it
        }
    }
    var workSpecialization11LiveData = MutableLiveData(workField.field11).apply {
        observeForever {
            workField.field11 = it
        }
    }
    var workSpecialization12LiveData = MutableLiveData(workField.field12).apply {
        observeForever {
            workField.field12 = it
        }
    }
    var workSpecialization13LiveData = MutableLiveData(workField.field13).apply {
        observeForever {
            workField.field13 = it
        }
    }
    var workSpecialization14LiveData = MutableLiveData(workField.field14).apply {
        observeForever {
            workField.field14 = it
        }
    }
    var workSpecialization15LiveData = MutableLiveData(workField.field15).apply {
        observeForever {
            workField.field15 = it
        }
    }
    var workSpecialization16LiveData = MutableLiveData(workField.field16).apply {
        observeForever {
            workField.field16 = it
        }
    }
    var workSpecialization17LiveData = MutableLiveData(workField.field17).apply {
        observeForever {
            workField.field17 = it
        }
    }
    var workSpecializationOtherFieldLiveData = MutableLiveData(workField.other).apply {
        observeForever {
            workField.other = it
        }
    }
    var workSpecializationOtherLiveData = MutableLiveData(workFieldOther).apply {
        observeForever {
            workFieldOther = it
        }
    }
    var workStatusField1LiveData = MutableLiveData(workStatus.field1).apply {
        observeForever {
            workStatus.field1 = it
        }
    }
    var workStatusField2LiveData = MutableLiveData(workStatus.field2).apply {
        observeForever {
            workStatus.field2 = it
        }
    }
    var workStatusField3LiveData = MutableLiveData(workStatus.field3).apply {
        observeForever {
            workStatus.field3 = it
        }
    }
    var workStatusField4LiveData = MutableLiveData(workStatus.field4).apply {
        observeForever {
            workStatus.field4 = it
        }
    }
    var workStatusField5LiveData = MutableLiveData(workStatus.field5).apply {
        observeForever {
            workStatus.field5 = it
        }
    }
    var workStatusField6LiveData = MutableLiveData(workStatus.field6).apply {
        observeForever {
            workStatus.field6 = it
        }
    }
    var workStatusOtherFieldLiveData = MutableLiveData(workStatus.other).apply {
        observeForever {
            workStatus.other = it
        }
    }
    var workStatusOtherLiveData = MutableLiveData(workStatusOther).apply {
        observeForever {
            workStatusOther = it
        }
    }
    var workDurationInFieldLiveData = MutableLiveData(workDurationInField).apply {
        observeForever {
            workDurationInField = it
        }
    }
    var workDurationInOrganizationLiveData = MutableLiveData(workDurationInOrganization).apply {
        observeForever {
            workDurationInOrganization = it
        }
    }
    var workDurationInPositionLiveData = MutableLiveData(workDurationInPosition).apply {
        observeForever {
            workDurationInPosition = it
        }
    }
    var workProgressField1LiveData = MutableLiveData(workProgress.field1).apply {
        observeForever {
            workProgress.field1 = it
        }
    }
    var workProgressField2LiveData = MutableLiveData(workProgress.field2).apply {
        observeForever {
            workProgress.field2 = it
        }
    }
    var workProgressField3LiveData = MutableLiveData(workProgress.field3).apply {
        observeForever {
            workProgress.field3 = it
        }
    }
    var workProgressField4LiveData = MutableLiveData(workProgress.field4).apply {
        observeForever {
            workProgress.field4 = it
        }
    }
    var workProgressField5LiveData = MutableLiveData(workProgress.field5).apply {
        observeForever {
            workProgress.field5 = it
        }
    }
    var familyMonthlyIncomeLiveData = MutableLiveData(familyMonthlyIncome).apply {
        observeForever {
            familyMonthlyIncome = it
        }
    }
    var monthlyIncomeLiveData = MutableLiveData(monthlyIncome).apply {
        observeForever {
            monthlyIncome = it
        }
    }
    var familyIncomeSource1LiveData = MutableLiveData(familyIncomeSource.field1).apply {
        observeForever {
            familyIncomeSource.field1 = it
        }
    }
    var familyIncomeSource2LiveData = MutableLiveData(familyIncomeSource.field2).apply {
        observeForever {
            familyIncomeSource.field2 = it
        }
    }
    var familyIncomeSource3LiveData = MutableLiveData(familyIncomeSource.field3).apply {
        observeForever {
            familyIncomeSource.field3 = it
        }
    }
    var familyIncomeSource4LiveData = MutableLiveData(familyIncomeSource.field4).apply {
        observeForever {
            familyIncomeSource.field4 = it
        }
    }
    var familyIncomeSource5LiveData = MutableLiveData(familyIncomeSource.field5).apply {
        observeForever {
            familyIncomeSource.field5 = it
        }
    }
    var familyIncomeSource6LiveData = MutableLiveData(familyIncomeSource.field6).apply {
        observeForever {
            familyIncomeSource.field6 = it
        }
    }
    var familyIncomeSource7LiveData = MutableLiveData(familyIncomeSource.field7).apply {
        observeForever {
            familyIncomeSource.field7 = it
        }
    }
    var familyIncomeSource8LiveData = MutableLiveData(familyIncomeSource.field8).apply {
        observeForever {
            familyIncomeSource.field8 = it
        }
    }
    var familyIncomeSource9LiveData = MutableLiveData(familyIncomeSource.field9).apply {
        observeForever {
            familyIncomeSource.field9 = it
        }
    }
    var familyIncomeSource10LiveData = MutableLiveData(familyIncomeSource.field10).apply {
        observeForever {
            familyIncomeSource.field10 = it
        }
    }
    var familyIncomeSource11LiveData = MutableLiveData(familyIncomeSource.field11).apply {
        observeForever {
            familyIncomeSource.field11 = it
        }
    }
    var familyIncomeSource12LiveData = MutableLiveData(familyIncomeSource.field12).apply {
        observeForever {
            familyIncomeSource.field12 = it
        }
    }
    var familyIncomeSource13LiveData = MutableLiveData(familyIncomeSource.field13).apply {
        observeForever {
            familyIncomeSource.field13 = it
        }
    }
    var familyIncomeOtherLiveData = MutableLiveData(familyIncomeOther).apply {
        observeForever {
            familyIncomeOther = it
        }
    }

    //Page 4

    var familyMaterialInsurance1LiveData = MutableLiveData(familyMaterialInsurance.field1).apply {
        observeForever {
            familyMaterialInsurance.field1 = it
        }
    }
    var familyMaterialInsurance2LiveData = MutableLiveData(familyMaterialInsurance.field2).apply {
        observeForever {
            familyMaterialInsurance.field2 = it
        }
    }
    var familyMaterialInsurance3LiveData = MutableLiveData(familyMaterialInsurance.field3).apply {
        observeForever {
            familyMaterialInsurance.field3 = it
        }
    }
    var familyMaterialInsurance4LiveData = MutableLiveData(familyMaterialInsurance.field4).apply {
        observeForever {
            familyMaterialInsurance.field4 = it
        }
    }
    var familyMaterialInsurance5LiveData = MutableLiveData(familyMaterialInsurance.field5).apply {
        observeForever {
            familyMaterialInsurance.field5 = it
        }
    }
    var familyMaterialInsurance6LiveData = MutableLiveData(familyMaterialInsurance.field6).apply {
        observeForever {
            familyMaterialInsurance.field6 = it
        }
    }

    var liveBeforeWar1LiveData = MutableLiveData(liveBeforeWar.field1).apply {
        observeForever {
            liveBeforeWar.field1 = it
        }
    }
    var liveBeforeWar2LiveData = MutableLiveData(liveBeforeWar.field2).apply {
        observeForever {
            liveBeforeWar.field2 = it
        }
    }
    var liveBeforeWar3LiveData = MutableLiveData(liveBeforeWar.field3).apply {
        observeForever {
            liveBeforeWar.field3 = it
        }
    }
    var liveBeforeWar4LiveData = MutableLiveData(liveBeforeWar.field4).apply {
        observeForever {
            liveBeforeWar.field4 = it
        }
    }
    var liveBeforeWar5LiveData = MutableLiveData(liveBeforeWar.field5).apply {
        observeForever {
            liveBeforeWar.field5 = it
        }
    }
    var liveBeforeWarOtherLiveData = MutableLiveData(liveBeforeWarOther).apply {
        observeForever {
            liveBeforeWarOther = it
        }
    }

    var currentOwnerCarLiveData = MutableLiveData(currentOwner.car).apply {
        observeForever {
            currentOwner.car = it
        }
    }
    var currentOwnerCarPriceLiveData = MutableLiveData(currentOwner.carCoast).apply {
        observeForever {
            currentOwner.carCoast = it
        }
    }
    var currentOwnerCarCountLiveData = MutableLiveData(currentOwner.carCount).apply {
        observeForever {
            currentOwner.carCount = it
        }
    }

    var currentOwnerGarageLiveData = MutableLiveData(currentOwner.garage).apply {
        observeForever {
            currentOwner.garage = it
        }
    }
    var currentOwnerGaragePriceLiveData = MutableLiveData(currentOwner.garageCoast).apply {
        observeForever {
            currentOwner.garageCoast = it
        }
    }
    var currentOwnerGarageSquareLiveData = MutableLiveData(currentOwner.garageSquare).apply {
        observeForever {
            currentOwner.garageSquare = it
        }
    }
    var currentOwnerGarageCountLiveData = MutableLiveData(currentOwner.garageCount).apply {
        observeForever {
            currentOwner.garageCount = it
        }
    }

    var currentOwnerHomeLiveData = MutableLiveData(currentOwner.home).apply {
        observeForever {
            currentOwner.home = it
        }
    }
    var currentOwnerHomePriceLiveData = MutableLiveData(currentOwner.homeCoast).apply {
        observeForever {
            currentOwner.homeCoast = it
        }
    }
    var currentOwnerHomeSquareLiveData = MutableLiveData(currentOwner.homeSquare).apply {
        observeForever {
            currentOwner.homeSquare = it
        }
    }
    var currentOwnerHomeCountLiveData = MutableLiveData(currentOwner.homeCount).apply {
        observeForever {
            currentOwner.homeCount = it
        }
    }

    var currentOwnerDachaLiveData = MutableLiveData(currentOwner.dacha).apply {
        observeForever {
            currentOwner.dacha = it
        }
    }
    var currentOwnerDachaPriceLiveData = MutableLiveData(currentOwner.dachaCoast).apply {
        observeForever {
            currentOwner.dachaCoast = it
        }
    }
    var currentOwnerDachaSquareLiveData = MutableLiveData(currentOwner.dachaSquare).apply {
        observeForever {
            currentOwner.dachaSquare = it
        }
    }
    var currentOwnerDachaCountLiveData = MutableLiveData(currentOwner.dachaCount).apply {
        observeForever {
            currentOwner.dachaCount = it
        }
    }

    var currentOwnerOrganizationLiveData = MutableLiveData(currentOwner.organization).apply {
        observeForever {
            currentOwner.organization = it
        }
    }
    var currentOwnerOrganizationPriceLiveData = MutableLiveData(currentOwner.organizationCoast).apply {
        observeForever {
            currentOwner.organizationCoast = it
        }
    }
    var currentOwnerOrganizationSquareLiveData = MutableLiveData(currentOwner.organizationSquare).apply {
        observeForever {
            currentOwner.organizationSquare = it
        }
    }
    var currentOwnerOrganizationCountLiveData = MutableLiveData(currentOwner.organizationCount).apply {
        observeForever {
            currentOwner.organizationCount = it
        }
    }

    var currentOwnerPlaceLiveData = MutableLiveData(currentOwner.place).apply {
        observeForever {
            currentOwner.place = it
        }
    }
    var currentOwnerPlacePriceLiveData = MutableLiveData(currentOwner.placeCoast).apply {
        observeForever {
            currentOwner.placeCoast = it
        }
    }
    var currentOwnerPlaceSquareLiveData = MutableLiveData(currentOwner.placeSquare).apply {
        observeForever {
            currentOwner.placeSquare = it
        }
    }
    var currentOwnerPlaceCountLiveData = MutableLiveData(currentOwner.placeCount).apply {
        observeForever {
            currentOwner.placeCount = it
        }
    }

    var currentOwnerMoneyLiveData = MutableLiveData(currentOwner.money).apply {
        observeForever {
            currentOwner.money = it
        }
    }
    var currentOwnerMoneyPriceLiveData = MutableLiveData(currentOwner.moneyCoast).apply {
        observeForever {
            currentOwner.moneyCoast = it
        }
    }
    var currentOwnerMoneyCountLiveData = MutableLiveData(currentOwner.moneyCount).apply {
        observeForever {
            currentOwner.moneyCount = it
        }
    }

    var currentOwnerAvandLiveData = MutableLiveData(currentOwner.avand).apply {
        observeForever {
            currentOwner.avand = it
        }
    }
    var currentOwnerAvandPriceLiveData = MutableLiveData(currentOwner.avandCoast).apply {
        observeForever {
            currentOwner.avandCoast = it
        }
    }
    var currentOwnerAvandCountLiveData = MutableLiveData(currentOwner.avandCount).apply {
        observeForever {
            currentOwner.avandCount = it
        }
    }

    var currentOwnerHipotekLiveData = MutableLiveData(currentOwner.hipotek).apply {
        observeForever {
            currentOwner.hipotek = it
        }
    }
    var currentOwnerHipotekPriceLiveData = MutableLiveData(currentOwner.hipotekCoast).apply {
        observeForever {
            currentOwner.hipotekCoast = it
        }
    }
    var currentOwnerHipotekCountLiveData = MutableLiveData(currentOwner.hipotekCount).apply {
        observeForever {
            currentOwner.hipotekCount = it
        }
    }

    var currentOwnerGoldsLiveData = MutableLiveData(currentOwner.golds).apply {
        observeForever {
            currentOwner.golds = it
        }
    }
    var currentOwnerGoldsPriceLiveData = MutableLiveData(currentOwner.goldsCoast).apply {
        observeForever {
            currentOwner.goldsCoast = it
        }
    }
    var currentOwnerGoldsCountLiveData = MutableLiveData(currentOwner.goldsCount).apply {
        observeForever {
            currentOwner.goldsCount = it
        }
    }

    var currentOwnerArjetuxtLiveData = MutableLiveData(currentOwner.arjetuxt).apply {
        observeForever {
            currentOwner.arjetuxt = it
        }
    }
    var currentOwnerArjetuxtPriceLiveData = MutableLiveData(currentOwner.arjetuxtCoast).apply {
        observeForever {
            currentOwner.arjetuxtCoast = it
        }
    }
    var currentOwnerArjetuxtCountLiveData = MutableLiveData(currentOwner.arjetuxtCount).apply {
        observeForever {
            currentOwner.arjetuxtCount = it
        }
    }

    var currentOwnerOtherLiveData = MutableLiveData(currentOwner.other).apply {
        observeForever {
            currentOwner.other = it
        }
    }
    var currentOwnerOtherNameLiveData = MutableLiveData(currentOwner.otherName).apply {
        observeForever {
            currentOwner.otherName = it
        }
    }
    var currentOwnerOtherPriceLiveData = MutableLiveData(currentOwner.otherCoast).apply {
        observeForever {
            currentOwner.otherCoast = it
        }
    }
    var currentOwnerOtherSquareLiveData = MutableLiveData(currentOwner.otherSquare).apply {
        observeForever {
            currentOwner.otherSquare = it
        }
    }
    var currentOwnerOtherCountLiveData = MutableLiveData(currentOwner.otherCount).apply {
        observeForever {
            currentOwner.otherCount = it
        }
    }

    var hasBeforeWar1LiveData = MutableLiveData(hasBeforeWar.field1).apply {
        observeForever {
            hasBeforeWar.field1 = it
        }
    }

    var hasBeforeWar2LiveData = MutableLiveData(hasBeforeWar.field2).apply {
        observeForever {
            hasBeforeWar.field2 = it
        }
    }
    var hasBeforeWar3LiveData = MutableLiveData(hasBeforeWar.field3).apply {
        observeForever {
            hasBeforeWar.field3 = it
        }
    }
    var hasBeforeWar4LiveData = MutableLiveData(hasBeforeWar.field4).apply {
        observeForever {
            hasBeforeWar.field4 = it
        }
    }
    var hasBeforeWar5LiveData = MutableLiveData(hasBeforeWar.field5).apply {
        observeForever {
            hasBeforeWar.field5 = it
        }
    }
    var hasBeforeWar6LiveData = MutableLiveData(hasBeforeWar.field6).apply {
        observeForever {
            hasBeforeWar.field6 = it
        }
    }
    var hasBeforeWar7LiveData = MutableLiveData(hasBeforeWar.field7).apply {
        observeForever {
            hasBeforeWar.field7 = it
        }
    }
    var hasBeforeWar8LiveData = MutableLiveData(hasBeforeWar.field8).apply {
        observeForever {
            hasBeforeWar.field8 = it
        }
    }
    var hasBeforeWar9LiveData = MutableLiveData(hasBeforeWar.field9).apply {
        observeForever {
            hasBeforeWar.field9 = it
        }
    }
    var hasBeforeWar10LiveData = MutableLiveData(hasBeforeWar.field10).apply {
        observeForever {
            hasBeforeWar.field10 = it
        }
    }
    var hasBeforeWarOtherLiveData = MutableLiveData(hasBeforeWar.other).apply {
        observeForever {
            hasBeforeWar.other = it
        }
    }

    //Page 5

    var livingPlaceLeaveTimeLiveData = MutableLiveData(livingPlaceLeaveTime).apply {
        observeForever {
            livingPlaceLeaveTime = it
        }
    }
    var countOfFamilyMembersInArmeniaLiveData = MutableLiveData(countOfFamilyMembersInArmenia).apply {
        observeForever {
            countOfFamilyMembersInArmenia = it
        }
    }
    var countOfFamilyMembersInArcakhLiveData = MutableLiveData(countOfFamilyMembersInArcakh).apply {
        observeForever {
            countOfFamilyMembersInArcakh = it
        }
    }
    var countOfDeathFamilyMembersLiveData = MutableLiveData(countOfDeathFamilyMembers).apply {
        observeForever {
            countOfDeathFamilyMembers = it
        }
    }
    var leaveReason1LiveData = MutableLiveData(leaveReason.field1).apply {
        observeForever {
            leaveReason.field1 = it
        }
    }

    var leaveReason2LiveData = MutableLiveData(leaveReason.field2).apply {
        observeForever {
            leaveReason.field2 = it
        }
    }

    var leaveReason3LiveData = MutableLiveData(leaveReason.field3).apply {
        observeForever {
            leaveReason.field3 = it
        }
    }

    var leaveReason4LiveData = MutableLiveData(leaveReason.field4).apply {
        observeForever {
            leaveReason.field4 = it
        }
    }

    var leaveReason5LiveData = MutableLiveData(leaveReason.field5).apply {
        observeForever {
            leaveReason.field5 = it
        }
    }

    var leaveReasonOtherFieldLiveData = MutableLiveData(leaveReason.other).apply {
        observeForever {
            leaveReason.other = it
        }
    }

    var leaveReasonOtherLiveData = MutableLiveData(leaveReasonOther).apply {
        observeForever {
            leaveReasonOther = it
        }
    }

    var leavePath1LiveData = MutableLiveData(leavePath.field1).apply {
        observeForever {
            leavePath.field1 = it
        }
    }

    var leavePath2LiveData = MutableLiveData(leavePath.field2).apply {
        observeForever {
            leavePath.field2 = it
        }
    }

    var leavePath3LiveData = MutableLiveData(leavePath.field3).apply {
        observeForever {
            leavePath.field3 = it
        }
    }

    var leavePath4LiveData = MutableLiveData(leavePath.field4).apply {
        observeForever {
            leavePath.field4 = it
        }
    }

    var leavePath5LiveData = MutableLiveData(leavePath.field5).apply {
        observeForever {
            leavePath.field5 = it
        }
    }

    var leavePathOtherFieldLiveData = MutableLiveData(leavePath.other).apply {
        observeForever {
            leavePath.other = it
        }
    }

    var leavePathOtherLiveData = MutableLiveData(leavePathOther).apply {
        observeForever {
            leavePathOther = it
        }
    }
    var currentLivingPlaceLiveData = MutableLiveData(currentLivingPlace).apply {
        observeForever {
            currentLivingPlace = it
        }
    }

    //////
    var livingPlaceAfterWar1LiveData = MutableLiveData(livingPlaceAfterWar.field1).apply {
        observeForever {
            livingPlaceAfterWar.field1 = it
        }
    }

    var livingPlaceAfterWar2LiveData = MutableLiveData(livingPlaceAfterWar.field2).apply {
        observeForever {
            livingPlaceAfterWar.field2 = it
        }
    }

    var livingPlaceAfterWar3LiveData = MutableLiveData(livingPlaceAfterWar.field3).apply {
        observeForever {
            livingPlaceAfterWar.field3 = it
        }
    }

    var livingPlaceAfterWar4LiveData = MutableLiveData(livingPlaceAfterWar.field4).apply {
        observeForever {
            livingPlaceAfterWar.field4 = it
        }
    }

    var livingPlaceAfterWar5LiveData = MutableLiveData(livingPlaceAfterWar.field5).apply {
        observeForever {
            livingPlaceAfterWar.field5 = it
        }
    }
    var livingPlaceAfterWar6LiveData = MutableLiveData(livingPlaceAfterWar.field6).apply {
        observeForever {
            livingPlaceAfterWar.field6 = it
        }
    }
    var temporaryLivingPlaceAfterWarLiveData = MutableLiveData(temporaryLivingPlaceAfterWar).apply {
        observeForever {
            temporaryLivingPlaceAfterWar = it
        }
    }
    var livingPlaceAfterWarOtherFieldLiveData = MutableLiveData(livingPlaceAfterWar.other).apply {
        observeForever {
            livingPlaceAfterWar.other = it
        }
    }

    var livingPlaceAfterWarOtherLiveData = MutableLiveData(livingPlaceAfterWarOther).apply {
        observeForever {
            livingPlaceAfterWarOther = it
        }
    }

    ///

    var currentThings1LiveData = MutableLiveData(currentThings.field1).apply {
        observeForever {
            currentThings.field1 = it
        }
    }

    var currentThings2LiveData = MutableLiveData(currentThings.field2).apply {
        observeForever {
            currentThings.field2 = it
        }
    }

    var currentThings3LiveData = MutableLiveData(currentThings.field3).apply {
        observeForever {
            currentThings.field3 = it
        }
    }

    var currentThings4LiveData = MutableLiveData(currentThings.field4).apply {
        observeForever {
            currentThings.field4 = it
        }
    }

    var currentThings5LiveData = MutableLiveData(currentThings.field5).apply {
        observeForever {
            currentThings.field5 = it
        }
    }
    var currentThings6LiveData = MutableLiveData(currentThings.field6).apply {
        observeForever {
            currentThings.field6 = it
        }
    }
    var currentThings7LiveData = MutableLiveData(currentThings.field7).apply {
        observeForever {
            currentThings.field7 = it
        }
    }
    var currentThings8LiveData = MutableLiveData(currentThings.field8).apply {
        observeForever {
            currentThings.field8 = it
        }
    }
    var currentThings9LiveData = MutableLiveData(currentThings.field9).apply {
        observeForever {
            currentThings.field9 = it
        }
    }
    var currentThings10LiveData = MutableLiveData(currentThings.field10).apply {
        observeForever {
            currentThings.field6 = it
        }
    }
    var currentThings11LiveData = MutableLiveData(currentThings.field11).apply {
        observeForever {
            currentThings.field11 = it
        }
    }
    var currentThings12LiveData = MutableLiveData(currentThings.field12).apply {
        observeForever {
            currentThings.field12 = it
        }
    }
    var currentThings13LiveData = MutableLiveData(currentThings.field13).apply {
        observeForever {
            currentThings.field13 = it
        }
    }

    var currentThingsOtherLiveData = MutableLiveData(currentThingsOther).apply {
        observeForever {
            livingPlaceAfterWarOther = it
        }
    }

    var currentThingsInNow1LiveData = MutableLiveData(currentThingsInNow.field1).apply {
        observeForever {
            currentThingsInNow.field1 = it
        }
    }
    var currentThingsInNow2LiveData = MutableLiveData(currentThingsInNow.field2).apply {
        observeForever {
            currentThingsInNow.field2 = it
        }
    }
    var currentThingsInNow3LiveData = MutableLiveData(currentThingsInNow.field3).apply {
        observeForever {
            currentThingsInNow.field3 = it
        }
    }
    var currentThingsInNow4LiveData = MutableLiveData(currentThingsInNow.field4).apply {
        observeForever {
            currentThingsInNow.field4 = it
        }
    }
    var currentThingsInNow5LiveData = MutableLiveData(currentThingsInNow.field5).apply {
        observeForever {
            currentThingsInNow.field5 = it
        }
    }
    var currentThingsInNow6LiveData = MutableLiveData(currentThingsInNow.field6).apply {
        observeForever {
            currentThingsInNow.field6 = it
        }
    }
    var currentThingsInNow7LiveData = MutableLiveData(currentThingsInNow.field7).apply {
        observeForever {
            currentThingsInNow.field7 = it
        }
    }
    var currentThingsInNow8LiveData = MutableLiveData(currentThingsInNow.field8).apply {
        observeForever {
            currentThingsInNow.field8 = it
        }
    }
    var currentThingsInNow9LiveData = MutableLiveData(currentThingsInNow.field9).apply {
        observeForever {
            currentThingsInNow.field9 = it
        }
    }
    var currentThingsInNow10LiveData = MutableLiveData(currentThingsInNow.field10).apply {
        observeForever {
            currentThingsInNow.field10 = it
        }
    }
    var currentThingsInNow11LiveData = MutableLiveData(currentThingsInNow.field11).apply {
        observeForever {
            currentThingsInNow.field11 = it
        }
    }
    var currentThingsInNow12LiveData = MutableLiveData(currentThingsInNow.field12).apply {
        observeForever {
            currentThingsInNow.field12 = it
        }
    }
    var currentThingsInNow13LiveData = MutableLiveData(currentThingsInNow.field13).apply {
        observeForever {
            currentThingsInNow.field13 = it
        }
    }
    var currentThingsInNow14LiveData = MutableLiveData(currentThingsInNow.field14).apply {
        observeForever {
            currentThingsInNow.field14 = it
        }
    }
    var currentThingsInNow15LiveData = MutableLiveData(currentThingsInNow.field15).apply {
        observeForever {
            currentThingsInNow.field15 = it
        }
    }
    var currentThingsInNow16LiveData = MutableLiveData(currentThingsInNow.field16).apply {
        observeForever {
            currentThingsInNow.field16 = it
        }
    }

    var materialHelp1LiveData = MutableLiveData(materialHelp.field1).apply {
        observeForever {
            materialHelp.field1 = it
        }
    }

    var materialHelp2LiveData = MutableLiveData(materialHelp.field2).apply {
        observeForever {
            materialHelp.field2 = it
        }
    }

    var materialHelp3LiveData = MutableLiveData(materialHelp.field3).apply {
        observeForever {
            materialHelp.field3 = it
        }
    }

    var materialHelp4LiveData = MutableLiveData(materialHelp.field4).apply {
        observeForever {
            materialHelp.field4 = it
        }
    }

    var materialHelp5LiveData = MutableLiveData(materialHelp.field5).apply {
        observeForever {
            materialHelp.field5 = it
        }
    }
    var materialHelp6LiveData = MutableLiveData(materialHelp.field6).apply {
        observeForever {
            materialHelp.field6 = it
        }
    }
    var materialHelp7LiveData = MutableLiveData(materialHelp.field7).apply {
        observeForever {
            materialHelp.field7 = it
        }
    }

    var materialHelpOtherFieldLiveData = MutableLiveData(materialHelp.other).apply {
        observeForever {
            materialHelp.other = it
        }
    }

    var materialHelpOtherLiveData = MutableLiveData(materialHelpOther).apply {
        observeForever {
            materialHelpOther = it
        }
    }

    //Page 6

    var home1LiveData = MutableLiveData(home.field1).apply {
        observeForever {
            home.field1 = it
        }
    }
    var home2LiveData = MutableLiveData(home.field2).apply {
        observeForever {
            home.field2 = it
        }
    }
    var home3LiveData = MutableLiveData(home.field3).apply {
        observeForever {
            home.field3 = it
        }
    }

    var homeOtherFieldLiveData = MutableLiveData(home.other).apply {
        observeForever {
            home.other = it
        }
    }

    var homeOtherLiveData = MutableLiveData(homeOther).apply {
        observeForever {
            homeOther = it
        }
    }

    var owning1LiveData = MutableLiveData(owning.field1).apply {
        observeForever {
            owning.field1 = it
        }
    }
    var owning2LiveData = MutableLiveData(owning.field2).apply {
        observeForever {
            owning.field2 = it
        }
    }
    var owning3LiveData = MutableLiveData(owning.field3).apply {
        observeForever {
            owning.field3 = it
        }
    }
    var owning4LiveData = MutableLiveData(owning.field4).apply {
        observeForever {
            owning.field4 = it
        }
    }
    var owning5LiveData = MutableLiveData(owning.field5).apply {
        observeForever {
            owning.field5 = it
        }
    }
    var owning6LiveData = MutableLiveData(owning.field6).apply {
        observeForever {
            owning.field6 = it
        }
    }

    var owningOtherFieldLiveData = MutableLiveData(owning.other).apply {
        observeForever {
            owning.other = it
        }
    }

    var owningOtherLiveData = MutableLiveData(owningNowOther).apply {
        observeForever {
            owningNowOther = it
        }
    }

    var willLivePlace1LiveData = MutableLiveData(willLivePlace.field1).apply {
        observeForever {
            willLivePlace.field1 = it
        }
    }
    var willLivePlace2LiveData = MutableLiveData(willLivePlace.field2).apply {
        observeForever {
            willLivePlace.field2 = it
        }
    }
    var willLivePlaceArcakhOtherLiveData = MutableLiveData(willLivePlaceArcakhOther).apply {
        observeForever {
            willLivePlaceArcakhOther = it
        }
    }
    var willLivePlace3LiveData = MutableLiveData(willLivePlace.field3).apply {
        observeForever {
            willLivePlace.field3 = it
        }
    }
    var willLivePlaceTemporaryArmeniaLiveData = MutableLiveData(willLivePlaceTemporaryArmenia).apply {
        observeForever {
            willLivePlaceTemporaryArmenia = it
        }
    }
    var willLivePlace4LiveData = MutableLiveData(willLivePlace.field4).apply {
        observeForever {
            willLivePlace.field4 = it
        }
    }
    var willLivePlaceArmeniaLiveData = MutableLiveData(willLivePlaceArmenia).apply {
        observeForever {
            willLivePlaceArmenia = it
        }
    }
    var willLivePlace5LiveData = MutableLiveData(willLivePlace.field5).apply {
        observeForever {
            willLivePlace.field5 = it
        }
    }
    var willLivePlace6LiveData = MutableLiveData(willLivePlace.field6).apply {
        observeForever {
            willLivePlace.field6 = it
        }
    }
    var willLivePlace7LiveData = MutableLiveData(willLivePlace.field7).apply {
        observeForever {
            willLivePlace.field7 = it
        }
    }
    var willLivePlaceAPHLiveData = MutableLiveData(willLivePlaceAPH).apply {
        observeForever {
            willLivePlaceAPH = it
        }
    }
    var willLivePlace8LiveData = MutableLiveData(willLivePlace.field8).apply {
        observeForever {
            willLivePlace.field8 = it
        }
    }
    var willLivePlaceEuropeLiveData = MutableLiveData(willLivePlaceEurope).apply {
        observeForever {
            willLivePlaceEurope = it
        }
    }
    var willLivePlace9LiveData = MutableLiveData(willLivePlace.field9).apply {
        observeForever {
            willLivePlace.field9 = it
        }
    }

    var willLivePlaceOtherFieldLiveData = MutableLiveData(willLivePlace.other).apply {
        observeForever {
            willLivePlace.other = it
        }
    }
    var willLivePlaceOtherLiveData = MutableLiveData(owning.field6).apply {
        observeForever {
            owning.field6 = it
        }
    }
    var futurePlans1LiveData = MutableLiveData(futurePlans.field1).apply {
        observeForever {
            futurePlans.field1 = it
        }
    }
    var futurePlans2LiveData = MutableLiveData(futurePlans.field2).apply {
        observeForever {
            futurePlans.field2 = it
        }
    }
    var futurePlans3LiveData = MutableLiveData(futurePlans.field3).apply {
        observeForever {
            futurePlans.field3 = it
        }
    }
    var alreadyWorkLiveData = MutableLiveData(alreadyWork).apply {
        observeForever {
            alreadyWork = it
        }
    }
    var futurePlans4LiveData = MutableLiveData(futurePlans.field4).apply {
        observeForever {
            futurePlans.field4 = it
        }
    }
    var futurePlans5LiveData = MutableLiveData(futurePlans.field5).apply {
        observeForever {
            futurePlans.field5 = it
        }
    }
    var futurePlansOtherFieldLiveData = MutableLiveData(futurePlans.other).apply {
        observeForever {
            futurePlans.other = it
        }
    }
    var futurePlansOtherLiveData = MutableLiveData(futurePlansOther).apply {
        observeForever {
            futurePlansOther = it
        }
    }

    var passport1LiveData = MutableLiveData(passport.field1).apply {
        observeForever {
            passport.field1 = it
        }
    }
    var passport2LiveData = MutableLiveData(passport.field2).apply {
        observeForever {
            passport.field2 = it
        }
    }
    var passport3LiveData = MutableLiveData(passport.field3).apply {
        observeForever {
            passport.field3 = it
        }
    }
    var passportOtherFieldLiveData = MutableLiveData(passport.other).apply {
        observeForever {
            passport.other = it
        }
    }
    var passportOtherLiveData = MutableLiveData(passportOther).apply {
        observeForever {
            passportOther = it
        }
    }

    var maried1LiveData = MutableLiveData(maried.field1).apply {
        observeForever {
            maried.field1 = it
        }
    }
    var maried2LiveData = MutableLiveData(maried.field2).apply {
        observeForever {
            maried.field2 = it
        }
    }
    var maried3LiveData = MutableLiveData(maried.field3).apply {
        observeForever {
            maried.field3 = it
        }
    }
    var maried4LiveData = MutableLiveData(maried.field4).apply {
        observeForever {
            maried.field4 = it
        }
    }
    var maried5LiveData = MutableLiveData(maried.field5).apply {
        observeForever {
            maried.field5 = it
        }
    }
    var mariedOtherFieldLiveData = MutableLiveData(maried.other).apply {
        observeForever {
            maried.other = it
        }
    }
    var mariedOtherLiveData = MutableLiveData(mariedOther).apply {
        observeForever {
            mariedOther = it
        }
    }
    var yearsLiveData = MutableLiveData(years).apply {
        observeForever {
            years = it
        }
    }

    var gender1LiveData = MutableLiveData(gender.field1).apply {
        observeForever {
            gender.field1 = it
        }
    }
    var gender2LiveData = MutableLiveData(gender.field2).apply {
        observeForever {
            gender.field2 = it
        }
    }

    var otherLiveData = MutableLiveData(other).apply {
        observeForever {
            other = it
        }
    }

}
