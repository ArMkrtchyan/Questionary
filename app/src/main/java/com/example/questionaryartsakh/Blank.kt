package com.example.questionaryartsakh

data class Blank(var id: Int, var status: Int, var telephone: String = "", var dateOfBirthDay: String = "", var fullName: String = "", var date: String = "",
    var birthPlace: String = "", var livingPlaceBeforeWar: String = "", var addressInArcakh: String = "", var livingTime: String = "", var familyCount: String = "",
    var familyMaleCount: String = "", var familyUnder18Count: String = "", var familyGenCount: String = "", var familyMembers: FamilyMembers = FamilyMembers()) {

    data class FamilyMembers(var invalid: Boolean = false, var toshakaru: Boolean = false)

}
