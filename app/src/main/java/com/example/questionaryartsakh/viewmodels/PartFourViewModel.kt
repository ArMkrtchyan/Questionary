package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartFourViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var familyMaterialInsurance1LiveData = MutableLiveData(blank.familyMaterialInsurance.field1).apply {
        observeForever {
            blank.familyMaterialInsurance.field1 = it
        }
    }
    var familyMaterialInsurance2LiveData = MutableLiveData(blank.familyMaterialInsurance.field2).apply {
        observeForever {
            blank.familyMaterialInsurance.field2 = it
        }
    }
    var familyMaterialInsurance3LiveData = MutableLiveData(blank.familyMaterialInsurance.field3).apply {
        observeForever {
            blank.familyMaterialInsurance.field3 = it
        }
    }
    var familyMaterialInsurance4LiveData = MutableLiveData(blank.familyMaterialInsurance.field4).apply {
        observeForever {
            blank.familyMaterialInsurance.field4 = it
        }
    }
    var familyMaterialInsurance5LiveData = MutableLiveData(blank.familyMaterialInsurance.field5).apply {
        observeForever {
            blank.familyMaterialInsurance.field5 = it
        }
    }
    var familyMaterialInsurance6LiveData = MutableLiveData(blank.familyMaterialInsurance.field6).apply {
        observeForever {
            blank.familyMaterialInsurance.field6 = it
        }
    }
    var liveBeforeWar1LiveData = MutableLiveData(blank.liveBeforeWar.field1).apply {
        observeForever {
            blank.liveBeforeWar.field1 = it
        }
    }
    var liveBeforeWar2LiveData = MutableLiveData(blank.liveBeforeWar.field2).apply {
        observeForever {
            blank.liveBeforeWar.field2 = it
        }
    }
    var liveBeforeWar3LiveData = MutableLiveData(blank.liveBeforeWar.field3).apply {
        observeForever {
            blank.liveBeforeWar.field3 = it
        }
    }
    var liveBeforeWar4LiveData = MutableLiveData(blank.liveBeforeWar.field4).apply {
        observeForever {
            blank.liveBeforeWar.field4 = it
        }
    }
    var liveBeforeWar5LiveData = MutableLiveData(blank.liveBeforeWar.field5).apply {
        observeForever {
            blank.liveBeforeWar.field5 = it
        }
    }
    var liveBeforeWarOtherLiveData = MutableLiveData(blank.liveBeforeWarOther).apply {
        observeForever {
            blank.liveBeforeWarOther = it
        }
    }
    var currentOwnerCarMineLiveData = MutableLiveData(blank.currentOwner.car == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.car = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerCarNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.car == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.car = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerCarNonLiveData = MutableLiveData(blank.currentOwner.car == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.car = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerCarPriceLiveData = MutableLiveData(blank.currentOwner.carCoast).apply {
        observeForever {
            blank.currentOwner.carCoast = it
        }
    }
    var currentOwnerCarCountLiveData = MutableLiveData(blank.currentOwner.carCount).apply {
        observeForever {
            blank.currentOwner.carCount = it
        }
    }

    var currentOwnerGarageMineLiveData = MutableLiveData(blank.currentOwner.garage == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.garage = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerGarageNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.garage == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.garage = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerGarageNonLiveData = MutableLiveData(blank.currentOwner.garage == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.garage = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerGaragePriceLiveData = MutableLiveData(blank.currentOwner.garageCoast).apply {
        observeForever {
            blank.currentOwner.garageCoast = it
        }
    }
    var currentOwnerGarageSquareLiveData = MutableLiveData(blank.currentOwner.garageSquare).apply {
        observeForever {
            blank.currentOwner.garageSquare = it
        }
    }
    var currentOwnerGarageCountLiveData = MutableLiveData(blank.currentOwner.garageCount).apply {
        observeForever {
            blank.currentOwner.garageCount = it
        }
    }

    var currentOwnerHomeMineLiveData = MutableLiveData(blank.currentOwner.home == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.home = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerHomeNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.home == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.home = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerHomeNonLiveData = MutableLiveData(blank.currentOwner.home == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.home = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerHomePriceLiveData = MutableLiveData(blank.currentOwner.homeCoast).apply {
        observeForever {
            blank.currentOwner.homeCoast = it
        }
    }
    var currentOwnerHomeSquareLiveData = MutableLiveData(blank.currentOwner.homeSquare).apply {
        observeForever {
            blank.currentOwner.homeSquare = it
        }
    }
    var currentOwnerHomeCountLiveData = MutableLiveData(blank.currentOwner.homeCount).apply {
        observeForever {
            blank.currentOwner.homeCount = it
        }
    }

    var currentOwnerDachaMineLiveData = MutableLiveData(blank.currentOwner.dacha == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.dacha = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerDachaNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.dacha == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.dacha = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerDachaNonLiveData = MutableLiveData(blank.currentOwner.dacha == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.dacha = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerDachaPriceLiveData = MutableLiveData(blank.currentOwner.dachaCoast).apply {
        observeForever {
            blank.currentOwner.dachaCoast = it
        }
    }
    var currentOwnerDachaSquareLiveData = MutableLiveData(blank.currentOwner.dachaSquare).apply {
        observeForever {
            blank.currentOwner.dachaSquare = it
        }
    }
    var currentOwnerDachaCountLiveData = MutableLiveData(blank.currentOwner.dachaCount).apply {
        observeForever {
            blank.currentOwner.dachaCount = it
        }
    }

    var currentOwnerOrganizationMineLiveData = MutableLiveData(blank.currentOwner.organization == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.organization = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerOrganizationNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.organization == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.organization = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerOrganizationNonLiveData = MutableLiveData(blank.currentOwner.organization == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.organization = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerOrganizationPriceLiveData = MutableLiveData(blank.currentOwner.organizationCoast).apply {
        observeForever {
            blank.currentOwner.organizationCoast = it
        }
    }
    var currentOwnerOrganizationSquareLiveData = MutableLiveData(blank.currentOwner.organizationSquare).apply {
        observeForever {
            blank.currentOwner.organizationSquare = it
        }
    }
    var currentOwnerOrganizationCountLiveData = MutableLiveData(blank.currentOwner.organizationCount).apply {
        observeForever {
            blank.currentOwner.organizationCount = it
        }
    }

    var currentOwnerPlaceMineLiveData = MutableLiveData(blank.currentOwner.place == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.place = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerPlaceNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.place == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.place = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerPlaceNonLiveData = MutableLiveData(blank.currentOwner.place == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.place = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerPlacePriceLiveData = MutableLiveData(blank.currentOwner.placeCoast).apply {
        observeForever {
            blank.currentOwner.placeCoast = it
        }
    }
    var currentOwnerPlaceSquareLiveData = MutableLiveData(blank.currentOwner.placeSquare).apply {
        observeForever {
            blank.currentOwner.placeSquare = it
        }
    }
    var currentOwnerPlaceCountLiveData = MutableLiveData(blank.currentOwner.placeCount).apply {
        observeForever {
            blank.currentOwner.placeCount = it
        }
    }

    var currentOwnerMoneyMineLiveData = MutableLiveData(blank.currentOwner.money == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.money = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerMoneyNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.money == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.money = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerMoneyNonLiveData = MutableLiveData(blank.currentOwner.money == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.money = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerMoneyPriceLiveData = MutableLiveData(blank.currentOwner.moneyCoast).apply {
        observeForever {
            blank.currentOwner.moneyCoast = it
        }
    }
    var currentOwnerMoneyCountLiveData = MutableLiveData(blank.currentOwner.moneyCount).apply {
        observeForever {
            blank.currentOwner.moneyCount = it
        }
    }

    var currentOwnerAvandMineLiveData = MutableLiveData(blank.currentOwner.avand == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.avand = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerAvandNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.avand == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.avand = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerAvandNonLiveData = MutableLiveData(blank.currentOwner.avand == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.avand = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerAvandPriceLiveData = MutableLiveData(blank.currentOwner.avandCoast).apply {
        observeForever {
            blank.currentOwner.avandCoast = it
        }
    }
    var currentOwnerAvandCountLiveData = MutableLiveData(blank.currentOwner.avandCount).apply {
        observeForever {
            blank.currentOwner.avandCount = it
        }
    }

    var currentOwnerHipotekMineLiveData = MutableLiveData(blank.currentOwner.hipotek == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.hipotek = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerHipotekNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.hipotek == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.hipotek = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerHipotekNonLiveData = MutableLiveData(blank.currentOwner.hipotek == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.hipotek = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerHipotekPriceLiveData = MutableLiveData(blank.currentOwner.hipotekCoast).apply {
        observeForever {
            blank.currentOwner.hipotekCoast = it
        }
    }
    var currentOwnerHipotekCountLiveData = MutableLiveData(blank.currentOwner.hipotekCount).apply {
        observeForever {
            blank.currentOwner.hipotekCount = it
        }
    }

    var currentOwnerGoldsMineLiveData = MutableLiveData(blank.currentOwner.golds == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.golds = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerGoldsNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.golds == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.golds = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerGoldsNonLiveData = MutableLiveData(blank.currentOwner.golds == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.golds = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerGoldsPriceLiveData = MutableLiveData(blank.currentOwner.goldsCoast).apply {
        observeForever {
            blank.currentOwner.goldsCoast = it
        }
    }
    var currentOwnerGoldsCountLiveData = MutableLiveData(blank.currentOwner.goldsCount).apply {
        observeForever {
            blank.currentOwner.goldsCount = it
        }
    }

    var currentOwnerArjetuxtMineLiveData = MutableLiveData(blank.currentOwner.arjetuxt == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.arjetuxt = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerArjetuxtNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.arjetuxt == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.arjetuxt = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerArjetuxtNonLiveData = MutableLiveData(blank.currentOwner.arjetuxt == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.arjetuxt = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerArjetuxtPriceLiveData = MutableLiveData(blank.currentOwner.arjetuxtCoast).apply {
        observeForever {
            blank.currentOwner.arjetuxtCoast = it
        }
    }
    var currentOwnerArjetuxtCountLiveData = MutableLiveData(blank.currentOwner.arjetuxtCount).apply {
        observeForever {
            blank.currentOwner.arjetuxtCount = it
        }
    }

    var currentOwnerOtherMineLiveData = MutableLiveData(blank.currentOwner.other == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.other = Blank.Owner.OwnerEnum.MINE.type
        }
    }
    var currentOwnerOtherNotOnlyMineLiveData = MutableLiveData(blank.currentOwner.other == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwner.other = Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type
        }
    }
    var currentOwnerOtherNonLiveData = MutableLiveData(blank.currentOwner.other == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwner.other = Blank.Owner.OwnerEnum.NONE.type
        }
    }
    var currentOwnerOtherNameLiveData = MutableLiveData(blank.currentOwner.otherName).apply {
        observeForever {
            blank.currentOwner.otherName = it
        }
    }
    var currentOwnerOtherPriceLiveData = MutableLiveData(blank.currentOwner.otherCoast).apply {
        observeForever {
            blank.currentOwner.otherCoast = it
        }
    }
    var currentOwnerOtherSquareLiveData = MutableLiveData(blank.currentOwner.otherSquare).apply {
        observeForever {
            blank.currentOwner.otherSquare = it
        }
    }
    var currentOwnerOtherCountLiveData = MutableLiveData(blank.currentOwner.otherCount).apply {
        observeForever {
            blank.currentOwner.otherCount = it
        }
    }

    var hasBeforeWar1YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar1YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar1NoLiveData = MutableLiveData(blank.hasBeforeWar.field1 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field1 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar2YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar2YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar2NoLiveData = MutableLiveData(blank.hasBeforeWar.field2 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field2 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar3YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar3YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar3NoLiveData = MutableLiveData(blank.hasBeforeWar.field3 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field3 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar4YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar4YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar4NoLiveData = MutableLiveData(blank.hasBeforeWar.field4 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field4 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar5YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar5YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar5NoLiveData = MutableLiveData(blank.hasBeforeWar.field5 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field5 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar6YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar6YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar6NoLiveData = MutableLiveData(blank.hasBeforeWar.field6 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field6 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar7YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar7YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar7NoLiveData = MutableLiveData(blank.hasBeforeWar.field7 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field7 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar8YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar8YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar8NoLiveData = MutableLiveData(blank.hasBeforeWar.field8 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field8 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar9YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar9YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar9NoLiveData = MutableLiveData(blank.hasBeforeWar.field9 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field9 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }

    var hasBeforeWar10YesNewLiveData = MutableLiveData(blank.hasBeforeWar.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type
        }
    }
    var hasBeforeWar10YesOldLiveData = MutableLiveData(blank.hasBeforeWar.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type
        }
    }
    var hasBeforeWar10NoLiveData = MutableLiveData(blank.hasBeforeWar.field10 == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar.field10 = Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type
        }
    }
    var hasBeforeWarOtherLiveData = MutableLiveData(blank.hasBeforeWar.other).apply {
        observeForever {
            blank.hasBeforeWar.other = it
        }
    }

}