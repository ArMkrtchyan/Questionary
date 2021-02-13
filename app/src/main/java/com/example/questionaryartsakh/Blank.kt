package com.example.questionaryartsakh

import com.example.questionaryartsakh.utils.toJson

data class Blank(var id: Int = 0, var status: Int = 1, var createdAt: Long? = null, var sentAt: Long? = null, var telephone: String = "", var dateOfBirthDay: String = "",
    var fullName: String = "", var date: String = "", var birthPlace: String = "", var livingPlaceBeforeWar: String = "", var addressInArcakh: String = "",
    var livingTime: String = "", var familyCount: String = "", var familyMaleCount: String = "", var familyUnder18Count: String = "", var familyGenCount: String = "",
    var familyMembers: SubFields = SubFields(),

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

    fun toJson(): String {
        return "{\"id\":$id, \"status\":$status, \"createdAt\":$createdAt, \"sentAt\":$sentAt, \"telephone\":\"$telephone\", \"dateOfBirthDay\":\"$dateOfBirthDay\", \"fullName\":\"$fullName\",\"date\":\"$date\", \"birthPlace\":\"$birthPlace\", \"livingPlaceBeforeWar\":\"$livingPlaceBeforeWar\", \"addressInArcakh\":\"$addressInArcakh\", \"livingTime\":\"$livingTime\", \"familyCount\":\"$familyCount\", \"familyMaleCount\":\"$familyMaleCount\", \"familyUnder18Count\":\"$familyUnder18Count\", \"familyGenCount\":\"$familyGenCount\", \"familyMembers\":${
            familyMembers.toJson()
        }, \"education\":${education.toJson()}, \"languages\":${languages.toJson()}, \"langOther1\":\"$langOther1\", \"langOther2\":\"$langOther2\", \"spacialization\":\"$spacialization\", \"computerSkill\":$computerSkill, \"driveCar\":$driveCar, \"work\":${work.toJson()}, \"workPlace\":${workPlace.toJson()}, \"self_employment\":\"$self_employment\", \"otherWorkPlace\":\"$otherWorkPlace\", \"workField\":${workField.toJson()}, \"workFieldOther\":\"$workFieldOther\", \"workStatus\":${workStatus.toJson()}, \"workStatusOther\":\"$workStatusOther\", \"workDurationInField\":\"$workDurationInField\", \"workDurationInOrganization\":\"$workDurationInOrganization\", \"workDurationInPosition\":\"$workDurationInPosition\", \"workProgress\":${workProgress.toJson()}, \"familyMonthlyIncome\":\"$familyMonthlyIncome\", \"monthlyIncome\":\"$monthlyIncome\", \"familyIncomeSource\":${familyIncomeSource.toJson()}, \"familyIncomeOther\":\"$familyIncomeOther\", \"familyMaterialInsurance\":${familyMaterialInsurance.toJson()}, \"liveBeforeWar\":${liveBeforeWar.toJson()}, \"liveBeforeWarOther\":\"$liveBeforeWarOther\", \"currentOwner\":${currentOwner.toJson()}, \"hasBeforeWar\":${hasBeforeWar.toJson()}, \"hasBeforeWarPlace\":\"$hasBeforeWarPlace\", \"livingPlaceLeaveTime\":\"$livingPlaceLeaveTime\", \"countOfFamilyMembersInArmenia\":\"$countOfFamilyMembersInArmenia\", \"countOfFamilyMembersInArcakh\":\"$countOfFamilyMembersInArcakh\", \"countOfDeathFamilyMembers\":\"$countOfDeathFamilyMembers\", \"leaveReason\":${leaveReason.toJson()}, \"leaveReasonOther\":\"$leaveReasonOther\", \"leavePath\":${leavePath.toJson()}, \"leavePathOther\":\"$leavePathOther\", \"currentLivingPlace\":\"$currentLivingPlace\", \"livingPlaceAfterWar\":${livingPlaceAfterWar.toJson()}, \"temporaryLivingPlaceAfterWar\":\"$temporaryLivingPlaceAfterWar\", \"livingPlaceAfterWarOther\":\"$livingPlaceAfterWarOther\", \"currentThings\":${currentThings.toJson()}, \"currentThingsOther\":\"$currentThingsOther\", \"currentThingsInNow\":${currentThingsInNow.toJson()}, \"currentThingsInNowOther\":\"$currentThingsInNowOther\", \"materialHelp\":${materialHelp.toJson()}, \"materialHelpOther\":\"$materialHelpOther\", \"home\":${home.toJson()}, \"homeOther\":\"$homeOther\", \"owning\":${owning.toJson()}, \"owningNowOther\":\"$owningNowOther\", \"willLivePlace\":${willLivePlace.toJson()}, \"willLivePlaceArcakhOther\":\"$willLivePlaceArcakhOther\", \"willLivePlaceTemporaryArmenia\":\"$willLivePlaceTemporaryArmenia\", \"willLivePlaceArmenia\":\"$willLivePlaceArmenia\", \"willLivePlaceAPH\":\"$willLivePlaceAPH\", \"willLivePlaceEurope\":\"$willLivePlaceEurope\", \"willLivePlaceOther\":\"$willLivePlaceOther\", \"futurePlans\":${futurePlans.toJson()}, \"alreadyWork\":\"$alreadyWork\", \"futurePlansOther\":\"$futurePlansOther\", \"passport\":${passport.toJson()}, \"passportOther\":\"$passportOther\", \"maried\":${maried.toJson()}, \"mariedOther\":\"$mariedOther\", \"years\":\"$years\", \"gender\":${gender.toJson()}, \"other\":\"$other\"}"
    }

}
