package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.Blank
import com.example.questionaryartsakh.BlankApp

class PartFourViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var familyMaterialInsurance1LiveData = blank.familyMaterialInsurance1LiveData
    var familyMaterialInsurance2LiveData = blank.familyMaterialInsurance2LiveData
    var familyMaterialInsurance3LiveData = blank.familyMaterialInsurance3LiveData
    var familyMaterialInsurance4LiveData = blank.familyMaterialInsurance4LiveData
    var familyMaterialInsurance5LiveData = blank.familyMaterialInsurance5LiveData
    var familyMaterialInsurance6LiveData = blank.familyMaterialInsurance6LiveData
    var liveBeforeWar1LiveData = blank.liveBeforeWar1LiveData
    var liveBeforeWar2LiveData = blank.liveBeforeWar2LiveData
    var liveBeforeWar3LiveData = blank.liveBeforeWar3LiveData
    var liveBeforeWar4LiveData = blank.liveBeforeWar4LiveData
    var liveBeforeWar5LiveData = blank.liveBeforeWar5LiveData
    var liveBeforeWarOtherLiveData = blank.liveBeforeWarOtherLiveData
    var currentOwnerCarMineLiveData = MutableLiveData(blank.currentOwnerCarLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerCarLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerCarNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerCarLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerCarLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerCarNonLiveData = MutableLiveData(blank.currentOwnerCarLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerCarLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerCarPriceLiveData = blank.currentOwnerCarPriceLiveData
    var currentOwnerCarCountLiveData = blank.currentOwnerCarCountLiveData

    var currentOwnerGarageMineLiveData = MutableLiveData(blank.currentOwnerGarageLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGarageLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerGarageNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerGarageLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGarageLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerGarageNonLiveData = MutableLiveData(blank.currentOwnerGarageLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGarageLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerGaragePriceLiveData = blank.currentOwnerGaragePriceLiveData
    var currentOwnerGarageSquareLiveData = blank.currentOwnerGarageSquareLiveData
    var currentOwnerGarageCountLiveData = blank.currentOwnerGarageCountLiveData

    var currentOwnerHomeMineLiveData = MutableLiveData(blank.currentOwnerHomeLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHomeLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerHomeNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerHomeLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHomeLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerHomeNonLiveData = MutableLiveData(blank.currentOwnerHomeLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHomeLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerHomePriceLiveData = blank.currentOwnerHomePriceLiveData
    var currentOwnerHomeSquareLiveData = blank.currentOwnerHomeSquareLiveData
    var currentOwnerHomeCountLiveData = blank.currentOwnerHomeCountLiveData

    var currentOwnerDachaMineLiveData = MutableLiveData(blank.currentOwnerDachaLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerDachaLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerDachaNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerDachaLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerDachaLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerDachaNonLiveData = MutableLiveData(blank.currentOwnerDachaLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerDachaLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerDachaPriceLiveData = blank.currentOwnerDachaPriceLiveData
    var currentOwnerDachaSquareLiveData = blank.currentOwnerDachaSquareLiveData
    var currentOwnerDachaCountLiveData = blank.currentOwnerDachaCountLiveData

    var currentOwnerOrganizationMineLiveData = MutableLiveData(blank.currentOwnerOrganizationLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOrganizationLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerOrganizationNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerOrganizationLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOrganizationLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerOrganizationNonLiveData = MutableLiveData(blank.currentOwnerOrganizationLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOrganizationLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerOrganizationPriceLiveData = blank.currentOwnerOrganizationPriceLiveData
    var currentOwnerOrganizationSquareLiveData = blank.currentOwnerOrganizationSquareLiveData
    var currentOwnerOrganizationCountLiveData = blank.currentOwnerOrganizationCountLiveData

    var currentOwnerPlaceMineLiveData = MutableLiveData(blank.currentOwnerPlaceLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerPlaceLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerPlaceNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerPlaceLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerPlaceLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerPlaceNonLiveData = MutableLiveData(blank.currentOwnerPlaceLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerPlaceLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerPlacePriceLiveData = blank.currentOwnerPlacePriceLiveData
    var currentOwnerPlaceSquareLiveData = blank.currentOwnerPlaceSquareLiveData
    var currentOwnerPlaceCountLiveData = blank.currentOwnerPlaceCountLiveData

    var currentOwnerMoneyMineLiveData = MutableLiveData(blank.currentOwnerMoneyLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerMoneyLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerMoneyNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerMoneyLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerMoneyLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerMoneyNonLiveData = MutableLiveData(blank.currentOwnerMoneyLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerMoneyLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerMoneyPriceLiveData = blank.currentOwnerMoneyPriceLiveData
    var currentOwnerMoneyCountLiveData = blank.currentOwnerMoneyCountLiveData

    var currentOwnerAvandMineLiveData = MutableLiveData(blank.currentOwnerAvandLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerAvandLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerAvandNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerAvandLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerAvandLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerAvandNonLiveData = MutableLiveData(blank.currentOwnerAvandLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerAvandLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerAvandPriceLiveData = blank.currentOwnerAvandPriceLiveData
    var currentOwnerAvandCountLiveData = blank.currentOwnerAvandCountLiveData

    var currentOwnerHipotekMineLiveData = MutableLiveData(blank.currentOwnerHipotekLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHipotekLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerHipotekNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerHipotekLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHipotekLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerHipotekNonLiveData = MutableLiveData(blank.currentOwnerHipotekLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerHipotekLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerHipotekPriceLiveData = blank.currentOwnerHipotekPriceLiveData
    var currentOwnerHipotekCountLiveData = blank.currentOwnerHipotekCountLiveData

    var currentOwnerGoldsMineLiveData = MutableLiveData(blank.currentOwnerGoldsLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGoldsLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerGoldsNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerGoldsLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGoldsLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerGoldsNonLiveData = MutableLiveData(blank.currentOwnerGoldsLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerGoldsLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerGoldsPriceLiveData = blank.currentOwnerGoldsPriceLiveData
    var currentOwnerGoldsCountLiveData = blank.currentOwnerGoldsCountLiveData

    var currentOwnerArjetuxtMineLiveData = MutableLiveData(blank.currentOwnerArjetuxtLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerArjetuxtLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerArjetuxtNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerArjetuxtLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerArjetuxtLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerArjetuxtNonLiveData = MutableLiveData(blank.currentOwnerArjetuxtLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerArjetuxtLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerArjetuxtPriceLiveData = blank.currentOwnerArjetuxtPriceLiveData
    var currentOwnerArjetuxtCountLiveData = blank.currentOwnerArjetuxtCountLiveData

    var currentOwnerOtherMineLiveData = MutableLiveData(blank.currentOwnerOtherLiveData.value == Blank.Owner.OwnerEnum.MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOtherLiveData.postValue(Blank.Owner.OwnerEnum.MINE.type)
        }
    }
    var currentOwnerOtherNotOnlyMineLiveData = MutableLiveData(blank.currentOwnerOtherLiveData.value == Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOtherLiveData.postValue(Blank.Owner.OwnerEnum.NOT_ONLY_MINE.type)
        }
    }
    var currentOwnerOtherNonLiveData = MutableLiveData(blank.currentOwnerOtherLiveData.value == Blank.Owner.OwnerEnum.NONE.type).apply {
        observeForever {
            if (it) blank.currentOwnerOtherLiveData.postValue(Blank.Owner.OwnerEnum.NONE.type)
        }
    }
    var currentOwnerOtherNameLiveData = blank.currentOwnerOtherNameLiveData
    var currentOwnerOtherPriceLiveData = blank.currentOwnerOtherPriceLiveData
    var currentOwnerOtherSquareLiveData = blank.currentOwnerOtherSquareLiveData
    var currentOwnerOtherCountLiveData = blank.currentOwnerOtherCountLiveData

    var hasBeforeWar1YesNewLiveData = MutableLiveData(blank.hasBeforeWar1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar1YesOldLiveData = MutableLiveData(blank.hasBeforeWar1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar1NoLiveData = MutableLiveData(blank.hasBeforeWar1LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar1LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar2YesNewLiveData = MutableLiveData(blank.hasBeforeWar2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar2YesOldLiveData = MutableLiveData(blank.hasBeforeWar2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar2NoLiveData = MutableLiveData(blank.hasBeforeWar2LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar2LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar3YesNewLiveData = MutableLiveData(blank.hasBeforeWar3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar3YesOldLiveData = MutableLiveData(blank.hasBeforeWar3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar3NoLiveData = MutableLiveData(blank.hasBeforeWar3LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar3LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar4YesNewLiveData = MutableLiveData(blank.hasBeforeWar4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar4YesOldLiveData = MutableLiveData(blank.hasBeforeWar4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar4NoLiveData = MutableLiveData(blank.hasBeforeWar4LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar4LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar5YesNewLiveData = MutableLiveData(blank.hasBeforeWar5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar5YesOldLiveData = MutableLiveData(blank.hasBeforeWar5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar5NoLiveData = MutableLiveData(blank.hasBeforeWar5LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar5LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar6YesNewLiveData = MutableLiveData(blank.hasBeforeWar6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar6YesOldLiveData = MutableLiveData(blank.hasBeforeWar6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar6NoLiveData = MutableLiveData(blank.hasBeforeWar6LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar6LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar7YesNewLiveData = MutableLiveData(blank.hasBeforeWar7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar7YesOldLiveData = MutableLiveData(blank.hasBeforeWar7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar7NoLiveData = MutableLiveData(blank.hasBeforeWar7LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar7LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar8YesNewLiveData = MutableLiveData(blank.hasBeforeWar8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar8YesOldLiveData = MutableLiveData(blank.hasBeforeWar8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar8NoLiveData = MutableLiveData(blank.hasBeforeWar8LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar8LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar9YesNewLiveData = MutableLiveData(blank.hasBeforeWar9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar9YesOldLiveData = MutableLiveData(blank.hasBeforeWar9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar9NoLiveData = MutableLiveData(blank.hasBeforeWar9LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar9LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }

    var hasBeforeWar10YesNewLiveData = MutableLiveData(blank.hasBeforeWar10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_NEW.type)
        }
    }
    var hasBeforeWar10YesOldLiveData = MutableLiveData(blank.hasBeforeWar10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.YES_OLD.type)
        }
    }
    var hasBeforeWar10NoLiveData = MutableLiveData(blank.hasBeforeWar10LiveData.value == Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type).apply {
        observeForever {
            if (it) blank.hasBeforeWar10LiveData.postValue(Blank.SubFieldsMultiple.SubFieldsMultipleEnum.NO.type)
        }
    }
    var hasBeforeWarOtherLiveData = blank.hasBeforeWarOtherLiveData

}