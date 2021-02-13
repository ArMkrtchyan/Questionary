package com.example.questionaryartsakh.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.questionaryartsakh.BlankApp

class PartTreeViewModel : ViewModel() {

    private val blank = BlankApp.getInstance().getBlank()

    var workSpecialization1LiveData = MutableLiveData(blank.workField.field1).apply {
        observeForever {
            blank.workField.field1 = it
        }
    }
    var workSpecialization2LiveData = MutableLiveData(blank.workField.field2).apply {
        observeForever {
            blank.workField.field2 = it
        }
    }
    var workSpecialization3LiveData = MutableLiveData(blank.workField.field3).apply {
        observeForever {
            blank.workField.field3 = it
        }
    }
    var workSpecialization4LiveData = MutableLiveData(blank.workField.field4).apply {
        observeForever {
            blank.workField.field4 = it
        }
    }
    var workSpecialization5LiveData = MutableLiveData(blank.workField.field5).apply {
        observeForever {
            blank.workField.field5 = it
        }
    }
    var workSpecialization6LiveData = MutableLiveData(blank.workField.field6).apply {
        observeForever {
            blank.workField.field6 = it
        }
    }
    var workSpecialization7LiveData = MutableLiveData(blank.workField.field7).apply {
        observeForever {
            blank.workField.field7 = it
        }
    }
    var workSpecialization8LiveData = MutableLiveData(blank.workField.field8).apply {
        observeForever {
            blank.workField.field8 = it
        }
    }
    var workSpecialization9LiveData = MutableLiveData(blank.workField.field9).apply {
        observeForever {
            blank.workField.field9 = it
        }
    }
    var workSpecialization10LiveData = MutableLiveData(blank.workField.field10).apply {
        observeForever {
            blank.workField.field10 = it
        }
    }
    var workSpecialization11LiveData = MutableLiveData(blank.workField.field11).apply {
        observeForever {
            blank.workField.field11 = it
        }
    }
    var workSpecialization12LiveData = MutableLiveData(blank.workField.field12).apply {
        observeForever {
            blank.workField.field12 = it
        }
    }
    var workSpecialization13LiveData = MutableLiveData(blank.workField.field13).apply {
        observeForever {
            blank.workField.field13 = it
        }
    }
    var workSpecialization14LiveData = MutableLiveData(blank.workField.field14).apply {
        observeForever {
            blank.workField.field14 = it
        }
    }
    var workSpecialization15LiveData = MutableLiveData(blank.workField.field15).apply {
        observeForever {
            blank.workField.field15 = it
        }
    }
    var workSpecialization16LiveData = MutableLiveData(blank.workField.field16).apply {
        observeForever {
            blank.workField.field16 = it
        }
    }
    var workSpecialization17LiveData = MutableLiveData(blank.workField.field17).apply {
        observeForever {
            blank.workField.field17 = it
        }
    }
    var workSpecializationOtherFieldLiveData = MutableLiveData(blank.workField.other).apply {
        observeForever {
            blank.workField.other = it
        }
    }
    var workSpecializationOtherLiveData = MutableLiveData(blank.workFieldOther).apply {
        observeForever {
            blank.workFieldOther = it
        }
    }
    var workStatusField1LiveData = MutableLiveData(blank.workStatus.field1).apply {
        observeForever {
            blank.workStatus.field1 = it
        }
    }
    var workStatusField2LiveData = MutableLiveData(blank.workStatus.field2).apply {
        observeForever {
            blank.workStatus.field2 = it
        }
    }
    var workStatusField3LiveData = MutableLiveData(blank.workStatus.field3).apply {
        observeForever {
            blank.workStatus.field3 = it
        }
    }
    var workStatusField4LiveData = MutableLiveData(blank.workStatus.field4).apply {
        observeForever {
            blank.workStatus.field4 = it
        }
    }
    var workStatusField5LiveData = MutableLiveData(blank.workStatus.field5).apply {
        observeForever {
            blank.workStatus.field5 = it
        }
    }
    var workStatusField6LiveData = MutableLiveData(blank.workStatus.field6).apply {
        observeForever {
            blank.workStatus.field6 = it
        }
    }
    var workStatusOtherFieldLiveData = MutableLiveData(blank.workStatus.other).apply {
        observeForever {
            blank.workStatus.other = it
        }
    }
    var workStatusOtherLiveData = MutableLiveData(blank.workStatusOther).apply {
        observeForever {
            blank.workStatusOther = it
        }
    }
    var workDurationInFieldLiveData = MutableLiveData(blank.workDurationInField).apply {
        observeForever {
            blank.workDurationInField = it
        }
    }
    var workDurationInOrganizationLiveData = MutableLiveData(blank.workDurationInOrganization).apply {
        observeForever {
            blank.workDurationInOrganization = it
        }
    }
    var workDurationInPositionLiveData = MutableLiveData(blank.workDurationInPosition).apply {
        observeForever {
            blank.workDurationInPosition = it
        }
    }
    var workProgressField1LiveData = MutableLiveData(blank.workProgress.field1).apply {
        observeForever {
            blank.workProgress.field1 = it
        }
    }
    var workProgressField2LiveData = MutableLiveData(blank.workProgress.field2).apply {
        observeForever {
            blank.workProgress.field2 = it
        }
    }
    var workProgressField3LiveData = MutableLiveData(blank.workProgress.field3).apply {
        observeForever {
            blank.workProgress.field3 = it
        }
    }
    var workProgressField4LiveData = MutableLiveData(blank.workProgress.field4).apply {
        observeForever {
            blank.workProgress.field4 = it
        }
    }
    var workProgressField5LiveData = MutableLiveData(blank.workProgress.field5).apply {
        observeForever {
            blank.workProgress.field5 = it
        }
    }
    var familyMonthlyIncomeLiveData = MutableLiveData(blank.familyMonthlyIncome).apply {
        observeForever {
            blank.familyMonthlyIncome = it
        }
    }
    var monthlyIncomeLiveData = MutableLiveData(blank.monthlyIncome).apply {
        observeForever {
            blank.monthlyIncome = it
        }
    }
    var familyIncomeSource1LiveData = MutableLiveData(blank.familyIncomeSource.field1).apply {
        observeForever {
            blank.familyIncomeSource.field1 = it
        }
    }
    var familyIncomeSource2LiveData = MutableLiveData(blank.familyIncomeSource.field2).apply {
        observeForever {
            blank.familyIncomeSource.field2 = it
        }
    }
    var familyIncomeSource3LiveData = MutableLiveData(blank.familyIncomeSource.field3).apply {
        observeForever {
            blank.familyIncomeSource.field3 = it
        }
    }
    var familyIncomeSource4LiveData = MutableLiveData(blank.familyIncomeSource.field4).apply {
        observeForever {
            blank.familyIncomeSource.field4 = it
        }
    }
    var familyIncomeSource5LiveData = MutableLiveData(blank.familyIncomeSource.field5).apply {
        observeForever {
            blank.familyIncomeSource.field5 = it
        }
    }
    var familyIncomeSource6LiveData = MutableLiveData(blank.familyIncomeSource.field6).apply {
        observeForever {
            blank.familyIncomeSource.field6 = it
        }
    }
    var familyIncomeSource7LiveData = MutableLiveData(blank.familyIncomeSource.field7).apply {
        observeForever {
            blank.familyIncomeSource.field7 = it
        }
    }
    var familyIncomeSource8LiveData = MutableLiveData(blank.familyIncomeSource.field8).apply {
        observeForever {
            blank.familyIncomeSource.field8 = it
        }
    }
    var familyIncomeSource9LiveData = MutableLiveData(blank.familyIncomeSource.field9).apply {
        observeForever {
            blank.familyIncomeSource.field9 = it
        }
    }
    var familyIncomeSource10LiveData = MutableLiveData(blank.familyIncomeSource.field10).apply {
        observeForever {
            blank.familyIncomeSource.field10 = it
        }
    }
    var familyIncomeSource11LiveData = MutableLiveData(blank.familyIncomeSource.field11).apply {
        observeForever {
            blank.familyIncomeSource.field11 = it
        }
    }
    var familyIncomeSource12LiveData = MutableLiveData(blank.familyIncomeSource.field12).apply {
        observeForever {
            blank.familyIncomeSource.field12 = it
        }
    }
    var familyIncomeSource13LiveData = MutableLiveData(blank.familyIncomeSource.field13).apply {
        observeForever {
            blank.familyIncomeSource.field13 = it
        }
    }
    var familyIncomeOtherLiveData = MutableLiveData(blank.familyIncomeOther).apply {
        observeForever {
            blank.familyIncomeOther = it
        }
    }

}