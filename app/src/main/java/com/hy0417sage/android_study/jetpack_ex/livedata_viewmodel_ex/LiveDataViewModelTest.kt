package com.hy0417sage.android_study.jetpack_ex.livedata_viewmodel_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModelTest : ViewModel() {

    var testMutableLiveData = MutableLiveData(0)

    fun plusLiveDataValue(){
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }
}